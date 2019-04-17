/*
 * generated by Xtext 2.17.0
 */
package dk.sdu.mdsd.validation

import org.eclipse.xtext.validation.Check
import dk.sdu.mdsd.arduinoDSL.Node
import java.util.HashSet
import dk.sdu.mdsd.arduinoDSL.ArduinoDSLPackage

import static extension java.lang.Character.*
import dk.sdu.mdsd.arduinoDSL.ComponentBody
import org.eclipse.xtext.EcoreUtil2
import dk.sdu.mdsd.arduinoDSL.Component

/**
 * This class contains custom validation rules. 
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class ArduinoDSLValidator extends AbstractArduinoDSLValidator {

	@Check
	def void checkPinIsNotUsed(ComponentBody body) {

		val nodeComponents = body.eContainer.eContainer.eContents.toList;

		var analogPins = new HashSet<String>();
		var digitalPins = new HashSet<String>();

		for (component : nodeComponents) {
			val type = (component as Component).properties.type;
			val pin = (component as Component).properties.pin;

			if (type.equals('analog')) {
				if (analogPins.contains(type + pin)) {
					error("Pin is already in use", ArduinoDSLPackage.eINSTANCE.componentBody_Pin)
				} else {
					analogPins.add(type + pin)
				}
			}
			if (type.equals('digital')) {
				if (digitalPins.contains(type + pin)) {
					error("Pin is already in use", ArduinoDSLPackage.eINSTANCE.componentBody_Pin)
				} else {
					digitalPins.add(type + pin)
				}
			}
		}
	}

	@Check
	def void checkDuplicateComponentNames(Node node) {
		
		var componentNames = new HashSet<String>();

		for (component : node.components) {
			val name = component.name;
			if (componentNames.contains(name)) {
				error("Duplicate component names", ArduinoDSLPackage.eINSTANCE.component_Name)
			} else
				componentNames.add(name)
		}
	}
	
	@Check
	def void checkRateOnInputComponents(ComponentBody body) {
		if(body.io == "input" && body.rate === null) {
			error("Rate is required on input components", ArduinoDSLPackage.eINSTANCE.componentBody_Rate)
		}
	}

}
