/**
 * generated by Xtext 2.17.0
 */
package dk.sdu.mdsd.arduinoDSL.impl;

import dk.sdu.mdsd.arduinoDSL.ArduinoDSLPackage;
import dk.sdu.mdsd.arduinoDSL.Assignment;
import dk.sdu.mdsd.arduinoDSL.RuleBody;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mdsd.arduinoDSL.impl.RuleBodyImpl#getAssignment <em>Assignment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleBodyImpl extends MinimalEObjectImpl.Container implements RuleBody
{
  /**
   * The cached value of the '{@link #getAssignment() <em>Assignment</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssignment()
   * @generated
   * @ordered
   */
  protected EList<Assignment> assignment;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RuleBodyImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ArduinoDSLPackage.Literals.RULE_BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Assignment> getAssignment()
  {
    if (assignment == null)
    {
      assignment = new EObjectContainmentEList<Assignment>(Assignment.class, this, ArduinoDSLPackage.RULE_BODY__ASSIGNMENT);
    }
    return assignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ArduinoDSLPackage.RULE_BODY__ASSIGNMENT:
        return ((InternalEList<?>)getAssignment()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ArduinoDSLPackage.RULE_BODY__ASSIGNMENT:
        return getAssignment();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ArduinoDSLPackage.RULE_BODY__ASSIGNMENT:
        getAssignment().clear();
        getAssignment().addAll((Collection<? extends Assignment>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ArduinoDSLPackage.RULE_BODY__ASSIGNMENT:
        getAssignment().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ArduinoDSLPackage.RULE_BODY__ASSIGNMENT:
        return assignment != null && !assignment.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RuleBodyImpl
