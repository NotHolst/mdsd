/**
 * generated by Xtext 2.17.0
 */
package dk.sdu.mdsd.arduinoDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mdsd.arduinoDSL.Exp#getLeft <em>Left</em>}</li>
 *   <li>{@link dk.sdu.mdsd.arduinoDSL.Exp#getOperator <em>Operator</em>}</li>
 *   <li>{@link dk.sdu.mdsd.arduinoDSL.Exp#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mdsd.arduinoDSL.ArduinoDSLPackage#getExp()
 * @model
 * @generated
 */
public interface Exp extends Expression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Expression)
   * @see dk.sdu.mdsd.arduinoDSL.ArduinoDSLPackage#getExp_Left()
   * @model containment="true"
   * @generated
   */
  Expression getLeft();

  /**
   * Sets the value of the '{@link dk.sdu.mdsd.arduinoDSL.Exp#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Expression value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' containment reference.
   * @see #setOperator(ExpWeakOp)
   * @see dk.sdu.mdsd.arduinoDSL.ArduinoDSLPackage#getExp_Operator()
   * @model containment="true"
   * @generated
   */
  ExpWeakOp getOperator();

  /**
   * Sets the value of the '{@link dk.sdu.mdsd.arduinoDSL.Exp#getOperator <em>Operator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' containment reference.
   * @see #getOperator()
   * @generated
   */
  void setOperator(ExpWeakOp value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Expression)
   * @see dk.sdu.mdsd.arduinoDSL.ArduinoDSLPackage#getExp_Right()
   * @model containment="true"
   * @generated
   */
  Expression getRight();

  /**
   * Sets the value of the '{@link dk.sdu.mdsd.arduinoDSL.Exp#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Expression value);

} // Exp
