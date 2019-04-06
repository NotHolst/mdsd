/*
 * generated by Xtext 2.17.0
 */
package dk.sdu.mdsd.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import dk.sdu.mdsd.arduinoDSL.Node
import dk.sdu.mdsd.arduinoDSL.Component
import dk.sdu.mdsd.arduinoDSL.ComponentBody
import dk.sdu.mdsd.arduinoDSL.Rule
import java.util.HashMap
import java.util.concurrent.atomic.AtomicInteger

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class ArduinoDSLGenerator extends AbstractGenerator {

	long defaultRate = 0;

	String include = '''
		#include <SPI.h>
		#include <nRF24L01.h>
		#include <RF24.h>
		
	'''

	String common = '''
		typedef union {
		    unsigned char byteval[4];
		    float floatval;
		} FloatByte;
		
		typedef union {
		    unsigned char byteval[2];
		    int intval;
		} IntByte;
		
	'''

	String utilitySensor = '''
		void writeBuffer(FloatByte value, char buf[6]){
		  buf[2] = value.byteval[0];
		  buf[3] = value.byteval[1];
		  buf[4] = value.byteval[2];
		  buf[5] = value.byteval[3];
		}
		
		void writeBuffer(IntByte value, char buf[6]){
		  buf[0] = value.byteval[0];
		  buf[1] = value.byteval[1];
		}
		
		float mapfloat(float x, float in_min, float in_max, float out_min, float out_max)
		{
		 return (x - in_min) * (out_max - out_min) / (in_max - in_min) + out_min;
		}
		
	'''

	String radio = '''
		RF24 radio(7, 8); // CE, CSN
		const byte address[6] = "00001";
		
	'''

	String setupTransmitter = '''
		radio.begin();
		radio.openWritingPipe(address);
		radio.setPALevel(RF24_PA_MIN);
		radio.stopListening();
		
	'''

	String setupReceiver = '''
		radio.begin();
		radio.openReadingPipe(0, address);
		radio.setPALevel(RF24_PA_MIN);
		radio.startListening();
		
	'''

	String commonOutputLoop = '''
		char text[32] = "";
		radio.read(&text, sizeof(text));
		IntByte id;
		id.byteval[0] = text[0];
		id.byteval[1] = text[1];
		
		FloatByte value;
		value.byteval[0] = text[2];
		value.byteval[1] = text[3];
		value.byteval[2] = text[4];
		value.byteval[3] = text[5];
	'''

	val id = new HashMap<Component, Integer>

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val index = new AtomicInteger(0);
		resource.allContents.filter(Node).forEach[it.components.forEach[id.put(it, index.getAndIncrement())]]
		resource.allContents.filter(Node).forEach[generateNode(it, resource, fsa)]

	}

	def generateNode(Node node, Resource resource, IFileSystemAccess2 fsa) {
		var fileContent = new StringBuilder();
		var variables = new StringBuilder();
		var loopBody = new StringBuilder();
		var setupBody = new StringBuilder();
		var methods = new StringBuilder();
		var rules = new StringBuilder();

		fileContent.append(include);
		fileContent.append(common);
		variables.append(radio);

		var hasInput = node.components.exists[it.properties.io == 'input']
		var hasOutput = node.components.exists[it.properties.io == 'output']

		if (hasInput) {
			fileContent.append(utilitySensor);
			setupBody.append(setupTransmitter);
		}
		if (hasOutput) {
			fileContent.append(setupReceiver)
			loopBody.append(commonOutputLoop);
		}

		for (component : node.components) {
			createComponent(component, methods, loopBody, variables, setupBody, resource)
		}

		fileContent.append(variables);
		fileContent.append('''void setup() {
		''')
		fileContent.append(setupBody);
		fileContent.append('''}
		
		''')
		fileContent.append('''void loop() {
		''')
		fileContent.append(loopBody);
		fileContent.append('''}
		
		''')
		fileContent.append(methods);

		fsa.generateFile(node.name + ".ino", fileContent.toString())
		//System.out.println(fileContent.toString());
	}

	def createComponent(Component component, StringBuilder methods, StringBuilder loopBody, StringBuilder variables,
		StringBuilder setupBody, Resource resource) {
		if (component.properties.io == 'input') {
			createInputComponent(component, methods, loopBody, variables, setupBody);
		} else {
			createOutputComponent(component, methods, loopBody, variables, setupBody, resource);
		}
	}

	def createInputComponent(Component component, StringBuilder methods, StringBuilder loopBody,
		StringBuilder variables, StringBuilder setupBody) {
		var body = component.properties;
		var pin = body.pin;
		var type = body.type;

		var vars = '''
			int �component.name�Pin = �IF type.equals('analog')�A�ENDIF��pin�;
			FloatByte �component.name�Value;
			unsigned long �component.name�Rate = �if (body.rate !== null) body.rate.value else defaultRate�;
			unsigned long �component.name�LastUpdate = 0;
			
		'''
		variables.append(vars);

		loopBody.append('''	read�component.name�();
		''')

		var function = '''
			void read�component.name�(){
			  if(millis() > �component.name�LastUpdate + �component.name�Rate){
			    �component.name�LastUpdate = millis();
			    
			    char buf[6];
			    IntByte  �component.name�ID;
			    �component.name�ID.intval = �id.get(component)�; //Inserted ID
			    writeBuffer(PotentiometerID,  buf);
			    
			    �component.name�Value.floatval = mapfloat(analogRead(�component.name�Pin), �body.map.in.low�, �body.map.in.high�, �body.map.out.low�, �body.map.out.high�);
			    writeBuffer(�component.name�Value, buf);
			    radio.write(&buf, sizeof(buf));
			  }
			}
			
		'''
		methods.append(function);

	}

	def createOutputComponent(Component component, StringBuilder fileContent, StringBuilder loopBody,
		StringBuilder variables, StringBuilder setupBody, Resource resource) {
		var body = component.properties;
		if (body.type == 'digital') {
			variables.append('''int �component.name�Pin = �component.properties.pin�;
			''')
			setupBody.append('''pinMode(�component.name�Pin,OUTPUT);
			''')
		}

		resource.allContents.filter(Rule).forEach [
			if (it.body.assignment.exists[component == it.attribute.component]) {

				loopBody.append('''
					if(id.intval == Component�id.get(it.condition.left)�){
						if(�it.condition.left� �it.condition.operator� �it.condition�
					}
				''')
			}
		]

	}

}
