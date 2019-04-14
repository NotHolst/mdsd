package dk.sdu.mdsd.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import dk.sdu.mdsd.arduinoDSL.Node
import dk.sdu.mdsd.arduinoDSL.Component
import dk.sdu.mdsd.arduinoDSL.ComponentBody
import java.util.HashMap
import java.util.concurrent.atomic.AtomicInteger
import java.util.Iterator
import java.util.List
import java.util.ArrayList
import dk.sdu.mdsd.arduinoDSL.Rule
import dk.sdu.mdsd.arduinoDSL.Attribute
import dk.sdu.mdsd.arduinoDSL.Value
import dk.sdu.mdsd.arduinoDSL.NumberLiteral
import dk.sdu.mdsd.arduinoDSL.State
import dk.sdu.mdsd.arduinoDSL.Delta
import java.util.Set
import java.util.HashSet

class ArduinoDSLGenerator extends AbstractGenerator  {
	
	val nodeIDs = new HashMap<String, String>();
	val componentIDs = new HashMap<String, Integer>();
	
	val componentValueNameSet = new HashSet<String>();
	val componentValueNameUpdateSet = new HashMap<String, Integer>();
	
	
	
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val nodes = input.allContents.filter(Node).toList();
		for(var i = 0; i < nodes.size(); i++) {
			nodeIDs.put(nodes.get(i).name,  createID(i));
		}
		
		input.allContents.filter(Node).forEach[components.addAll(it.components)]
		var id = 0;
		for(node : input.allContents.filter(Node).toIterable) {
			for(var i = 0; i < node.components.size; i++) {
				componentIDs.put(node.name + node.components.get(i).name, id++);
			}
		}
		fsa.generateFile("ids.ino", nodeIDs.toString + "\n" + componentIDs.toString());
		input.allContents.filter(Node).forEach[createFileAndClean(it, input, fsa)];
	}
	
	def createID(int i) {
		if(i == 0){
			return "00";
		} else if(i < 6) {
			var first = i % 6;
			return "0" + first;
		} else if(i < 156){
			var id = "0" + ((((i - 6)/25)<<0) ) + (((i-1)%5) +1) + (((((i-1)/5 << 0)-1)%5) +1)
			if(id.charAt(1) == '0'.charAt(0)){
				return id.substring(1);
			}
			return id
		} else {
			throw new Exception("Input out of range, more than 156 nodes are not supported");
		}
	}
	
	def createFileAndClean(Node node, Resource input, IFileSystemAccess2 fsa) {
		fsa.generateFile(node.name + ".ino", generateNodeFile(node, input, fsa))
		this.componentValueNameSet.clear
		this.componentValueNameUpdateSet.clear
		
	}
	
	def CharSequence generateNodeFile(Node node, Resource input, IFileSystemAccess2 fsa) '''
	// Generated file, do not edit
	// «node.name»
	#include <SPI.h>
	#include <RF24Network.h>
	#include <RF24.h>
	
	typedef union {
	    unsigned char byteval[4];
	    float floatval;
	} FloatByte;
			
	typedef union {
	    unsigned char byteval[2];
	    int intval;
	} IntByte;
	
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
	
	//Radio variables
	RF24 radio(7,8);
	RF24Network network(radio);
	const uint16_t this_node = «nodeIDs.get(node.name)»;
	
	//local outputComponents
	«FOR component : node.components»
	int «component.name»Pin = «IF component.properties.type.equals('analog')»A«ENDIF»«component.properties.pin»;
	«IF component.properties.io == "input"»
		const long «component.name»Rate = «component.properties.rate?.value»;
		long «component.name»LastTransfer = 0;
	«ENDIF»
	
	«ENDFOR»
	
	//Incoming components
	«FOR rule : input.allContents.filter(Rule).toIterable»
		«IF rule.body.assignment.findFirst[it.attribute.name.name == node.name] !== null»
			«IF rule.condition.left instanceof Attribute»
				««« The IF statement below is because we don't want to write anything. Otherwise it would write true/false in the file
				«IF componentValueNameSet.add(valueOf(rule.condition.left).toString() + componentIDs.get((rule.condition.left as Attribute).name.name + valueOf(rule.condition.left)) + 'Value')»«ENDIF»
			«ENDIF»
		«ENDIF»
	«ENDFOR»
	«FOR variable : componentValueNameSet»
		float «variable»;
	«ENDFOR»
	
	void setup() {
		//Radio
		radio.begin();
		network.begin(90, this_node);
	}
	
	void loop() {
		network.update();
		«IF input.allContents.filter(Rule).toIterable.exists[it.body.assignment.findFirst[it.attribute.name.name == node.name] !== null]»
		
		««« READ INCOMING RADIO
while (network.available()) {
			RF24NetworkHeader header;
			char buff[6];
			network.read(header, &buff, sizeof(buff));
			
			IntByte id;
			id.byteval[0] = buff[0];
		    id.byteval[1] = buff[1];
		    
		    FloatByte value;
		    value.byteval[0] = buff[2];
		    value.byteval[1] = buff[3];
		    value.byteval[2] = buff[4];
		    value.byteval[3] = buff[5];
		    
		««« Determine which incoming component and set its value
			«FOR rule : input.allContents.filter(Rule).toIterable»
				«IF rule.body.assignment.findFirst[it.attribute.name.name == node.name] !== null»
				«IF rule.condition.left instanceof Attribute»
					«IF componentValueNameUpdateSet.put(valueOf(rule.condition.left).toString() + componentIDs.get((rule.condition.left as Attribute).name.name + valueOf(rule.condition.left)) + 'Value',componentIDs.get((rule.condition.left as Attribute).name.name + valueOf(rule.condition.left))) === null»«ENDIF»
				«ENDIF»
				«ENDIF»
			«ENDFOR»
			«FOR variable : componentValueNameUpdateSet.entrySet»
				if(id.intval == «variable.value») {
					«variable.key» = value.floatval;
				}
			«ENDFOR»
			
			
		««« RULES
		«FOR rule : input.allContents.filter(Rule).toIterable»
		«IF rule.body.assignment.findFirst[it.attribute.name.name == node.name] !== null»
				«IF (rule.condition.left instanceof Attribute)»if (id.intval == «componentIDs.get((rule.condition.left as Attribute).name.name + (rule.condition.left as Attribute).component.name)») {«ENDIF»
					if («valueOf(rule.condition.left)»«IF(rule.condition.left instanceof Attribute)»«componentIDs.get((rule.condition.left as Attribute).name.name + valueOf(rule.condition.left))»«ENDIF»«IF(rule.condition.left instanceof Attribute)»Value «ENDIF» «rule.condition.operator» «valueOf(rule.condition.right)») {
						«FOR myAssignment : rule.body.assignment.filter[it.attribute.name.name == node.name]»
							digitalWrite(«myAssignment.attribute.component.name»Pin, «valueOf(myAssignment.value)»);
						«ENDFOR»
					}
				«IF (rule.condition.left instanceof Attribute)»}«ENDIF»
			«ENDIF»
		«ENDFOR»
		
		}
		«ENDIF»
		//Sample and Transmit sensor data
		«FOR component : node.components.filter[it.properties.io == "input"]»
			if(millis() > «component.name»LastTransfer + «component.name»Rate){
				char buff[6];
				IntByte id;
				id.intval = «componentIDs.get(node.name + component.name)»;
				writeBuffer(id, buff);
				
				FloatByte value;
				«IF component.properties.map !== null»
					«IF component.properties.type == "analog"»
						value.floatval = mapfloat(analogRead(«component.name»Pin), «component.properties.map.in.low», «component.properties.map.in.high», «component.properties.map.out.low», «component.properties.map.out.high»);
					«ELSE»
						value.floatval = mapfloat(digitalRead(«component.name»Pin), «component.properties.map.in.low», «component.properties.map.in.high», «component.properties.map.out.low», «component.properties.map.out.high»);
					«ENDIF»
				«ELSE»
					«IF component.properties.type == "analog"»
						value.floatval = analogRead(«component.name»Pin);
					«ELSE»
						value.floatval = digitalRead(«component.name»Pin);
					«ENDIF»
				«ENDIF»
				writeBuffer(value, buff);
				
				«FOR rule : input.allContents.filter(Rule).filter[(it.condition.left as Attribute)?.component == component].toIterable»
					«val exist = new HashSet<Node>»
					«FOR attribute : rule.body.assignment.map[it.attribute].filter[exist.add(it.name)]»
						forceSend(«nodeIDs.get(attribute.name.name)», buff, sizeof(buff));
					«ENDFOR»
				«ENDFOR»
				
				«component.name»LastTransfer = millis();	
			}
		«ENDFOR»
	}
	
	void forceSend(uint16_t addressOfReceiver, char buff[], int bufferLength){
		RF24NetworkHeader header(addressOfReceiver);
		bool ok = false;
		while(!ok){
			ok = network.write(header, buff, sizeof(buff));
		}
	}
	'''
	
	def valueOf(Object x) {
		System.out.println(x)
		switch x {
			Attribute: x.component.name
			NumberLiteral: if (x.float !== null) {
				x.float
			} else {
				x.int
			}
			State: if(x.value == 'on') {
				1
			} else {
				0
			}
			//Delta: TO be determined
		}
	}
	
	
}