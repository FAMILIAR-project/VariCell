/**
 */
package org.xtext.example.mydsl.variCell.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.variCell.CSVSeparator;
import org.xtext.example.mydsl.variCell.VariCellPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CSV Separator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.variCell.impl.CSVSeparatorImpl#getSep <em>Sep</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CSVSeparatorImpl extends MinimalEObjectImpl.Container implements CSVSeparator
{
  /**
   * The default value of the '{@link #getSep() <em>Sep</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSep()
   * @generated
   * @ordered
   */
  protected static final String SEP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSep() <em>Sep</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSep()
   * @generated
   * @ordered
   */
  protected String sep = SEP_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CSVSeparatorImpl()
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
    return VariCellPackage.Literals.CSV_SEPARATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSep()
  {
    return sep;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSep(String newSep)
  {
    String oldSep = sep;
    sep = newSep;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VariCellPackage.CSV_SEPARATOR__SEP, oldSep, sep));
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
      case VariCellPackage.CSV_SEPARATOR__SEP:
        return getSep();
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
      case VariCellPackage.CSV_SEPARATOR__SEP:
        setSep((String)newValue);
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
      case VariCellPackage.CSV_SEPARATOR__SEP:
        setSep(SEP_EDEFAULT);
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
      case VariCellPackage.CSV_SEPARATOR__SEP:
        return SEP_EDEFAULT == null ? sep != null : !SEP_EDEFAULT.equals(sep);
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
    result.append(" (sep: ");
    result.append(sep);
    result.append(')');
    return result.toString();
  }

} //CSVSeparatorImpl
