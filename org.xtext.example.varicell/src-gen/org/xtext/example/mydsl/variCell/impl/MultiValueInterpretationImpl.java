/**
 */
package org.xtext.example.mydsl.variCell.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.variCell.MultiValueInterpretation;
import org.xtext.example.mydsl.variCell.VariCellPackage;
import org.xtext.example.mydsl.variCell.VariabilityInterpretation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Value Interpretation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.variCell.impl.MultiValueInterpretationImpl#getVal <em>Val</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.impl.MultiValueInterpretationImpl#getVariability <em>Variability</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiValueInterpretationImpl extends MinimalEObjectImpl.Container implements MultiValueInterpretation
{
  /**
   * The default value of the '{@link #getVal() <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal()
   * @generated
   * @ordered
   */
  protected static final String VAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVal() <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal()
   * @generated
   * @ordered
   */
  protected String val = VAL_EDEFAULT;

  /**
   * The default value of the '{@link #getVariability() <em>Variability</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariability()
   * @generated
   * @ordered
   */
  protected static final VariabilityInterpretation VARIABILITY_EDEFAULT = VariabilityInterpretation.XOR;

  /**
   * The cached value of the '{@link #getVariability() <em>Variability</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariability()
   * @generated
   * @ordered
   */
  protected VariabilityInterpretation variability = VARIABILITY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MultiValueInterpretationImpl()
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
    return VariCellPackage.Literals.MULTI_VALUE_INTERPRETATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVal()
  {
    return val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVal(String newVal)
  {
    String oldVal = val;
    val = newVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VariCellPackage.MULTI_VALUE_INTERPRETATION__VAL, oldVal, val));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariabilityInterpretation getVariability()
  {
    return variability;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariability(VariabilityInterpretation newVariability)
  {
    VariabilityInterpretation oldVariability = variability;
    variability = newVariability == null ? VARIABILITY_EDEFAULT : newVariability;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VariCellPackage.MULTI_VALUE_INTERPRETATION__VARIABILITY, oldVariability, variability));
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
      case VariCellPackage.MULTI_VALUE_INTERPRETATION__VAL:
        return getVal();
      case VariCellPackage.MULTI_VALUE_INTERPRETATION__VARIABILITY:
        return getVariability();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case VariCellPackage.MULTI_VALUE_INTERPRETATION__VAL:
        setVal((String)newValue);
        return;
      case VariCellPackage.MULTI_VALUE_INTERPRETATION__VARIABILITY:
        setVariability((VariabilityInterpretation)newValue);
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
      case VariCellPackage.MULTI_VALUE_INTERPRETATION__VAL:
        setVal(VAL_EDEFAULT);
        return;
      case VariCellPackage.MULTI_VALUE_INTERPRETATION__VARIABILITY:
        setVariability(VARIABILITY_EDEFAULT);
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
      case VariCellPackage.MULTI_VALUE_INTERPRETATION__VAL:
        return VAL_EDEFAULT == null ? val != null : !VAL_EDEFAULT.equals(val);
      case VariCellPackage.MULTI_VALUE_INTERPRETATION__VARIABILITY:
        return variability != VARIABILITY_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (val: ");
    result.append(val);
    result.append(", variability: ");
    result.append(variability);
    result.append(')');
    return result.toString();
  }

} //MultiValueInterpretationImpl
