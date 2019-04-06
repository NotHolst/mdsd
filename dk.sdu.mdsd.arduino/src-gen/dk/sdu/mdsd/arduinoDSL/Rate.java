/**
 * generated by Xtext 2.17.0
 */
package dk.sdu.mdsd.arduinoDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mdsd.arduinoDSL.Rate#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mdsd.arduinoDSL.ArduinoDSLPackage#getRate()
 * @model
 * @generated
 */
public interface Rate extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see dk.sdu.mdsd.arduinoDSL.ArduinoDSLPackage#getRate_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link dk.sdu.mdsd.arduinoDSL.Rate#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

} // Rate
