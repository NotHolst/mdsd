/**
 * generated by Xtext 2.17.0
 */
package dk.sdu.mdsd.arduinoDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mdsd.arduinoDSL.State#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mdsd.arduinoDSL.ArduinoDSLPackage#getState()
 * @model
 * @generated
 */
public interface State extends Value
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see dk.sdu.mdsd.arduinoDSL.ArduinoDSLPackage#getState_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link dk.sdu.mdsd.arduinoDSL.State#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // State