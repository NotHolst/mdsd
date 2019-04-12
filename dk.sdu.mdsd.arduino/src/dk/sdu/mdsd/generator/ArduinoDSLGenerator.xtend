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
	
	val nodeIDs = new HashMap<String, Integer>();
	val componentIDs = new HashMap<String, Integer>();
	
	val componentValueNameSet = new HashSet<String>();
	val componentValueNameUpdateSet = new HashMap<String, Integer>();
	
	
	
	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val nodes = input.allContents.filter(Node).toList();
		for(var i = 0; i < nodes.size(); i++) {
			nodeIDs.put(nodes.get(i).name, i+1);
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
	
	def createFileAndClean(Node node, Resource input, IFileSystemAccess2 fsa) {
		fsa.generateFile(node.name + ".ino", generateNodeFile(node, input, fsa))
		this.componentValueNameSet.clear
		this.componentValueNameUpdateSet.clear
		
	}
	
	def CharSequence generateNodeFile(Node node, Resource input, IFileSystemAccess2 fsa) '''
	// Generated file, do not edit
	// «node.name»
	#include <SPI.h>
	#include <nRF24L01.h>
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
	
	//local outputComponents
	«FOR component : node.components»
	int «component.name»Pin = A«component.properties.pin»
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
		Float «variable»
	«ENDFOR»
	
	void setup() {
	}
	
	void loop() {
		«IF input.allContents.filter(Rule).toIterable.exists[it.body.assignment.findFirst[it.attribute.name.name == node.name] !== null]»
		
		««« READ INCOMING RADIO
		if (radio.available()) {
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
					«variable.key» = value.floatval
				}
			«ENDFOR»
			
			
		««« RULES
		«FOR rule : input.allContents.filter(Rule).toIterable»
		«IF rule.body.assignment.findFirst[it.attribute.name.name == node.name] !== null»
				«IF (rule.condition.left instanceof Attribute)»if (id.intval == «componentIDs.get((rule.condition.left as Attribute).name.name + (rule.condition.left as Attribute).component.name)») {«ENDIF»
					if («valueOf(rule.condition.left)»«IF(rule.condition.left instanceof Attribute)»«componentIDs.get((rule.condition.left as Attribute).name.name + valueOf(rule.condition.left))»«ENDIF»«IF(rule.condition.left instanceof Attribute)»Value «ENDIF» «rule.condition.operator» «valueOf(rule.condition.right)») {
						«FOR myAssignment : rule.body.assignment.filter[it.attribute.name.name == node.name]»
							digitalWrite(«myAssignment.attribute.component.name»Pin, «valueOf(myAssignment.value)»)
						«ENDFOR»
					}
				«IF (rule.condition.left instanceof Attribute)»}«ENDIF»
			«ENDIF»
		«ENDFOR»
		
		}
		«ENDIF»
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