/**
 */
package org.xtext.example.mydsl.variCell.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.variCell.FileFormat;
import org.xtext.example.mydsl.variCell.FormatSpecification;
import org.xtext.example.mydsl.variCell.VariCellPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Format Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.variCell.impl.FormatSpecificationImpl#getFileformat <em>Fileformat</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormatSpecificationImpl extends MinimalEObjectImpl.Container implements FormatSpecification
{
  /**
   * The default value of the '{@link #getFileformat() <em>Fileformat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFileformat()
   * @generated
   * @ordered
   */
  protected static final FileFormat FILEFORMAT_EDEFAULT = FileFormat.CSV;

  /**
   * The cached value of the '{@link #getFileformat() <em>Fileformat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFileformat()
   * @generated
   * @ordered
   */
  protected FileFormat fileformat = FILEFORMAT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FormatSpecificationImpl()
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
    return VariCellPackage.Literals.FORMAT_SPECIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FileFormat getFileformat()
  {
    return fileformat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFileformat(FileFormat newFileformat)
  {
    FileFormat oldFileformat = fileformat;
    fileformat = newFileformat == null ? FILEFORMAT_EDEFAULT : newFileformat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VariCellPackage.FORMAT_SPECIFICATION__FILEFORMAT, oldFileformat, fileformat));
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
      case VariCellPackage.FORMAT_SPECIFICATION__FILEFORMAT:
        return getFileformat();
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
      case VariCellPackage.FORMAT_SPECIFICATION__FILEFORMAT:
        setFileformat((FileFormat)newValue);
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
      case VariCellPackage.FORMAT_SPECIFICATION__FILEFORMAT:
        setFileformat(FILEFORMAT_EDEFAULT);
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
      case VariCellPackage.FORMAT_SPECIFICATION__FILEFORMAT:
        return fileformat != FILEFORMAT_EDEFAULT;
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
    result.append(" (fileformat: ");
    result.append(fileformat);
    result.append(')');
    return result.toString();
  }

} //FormatSpecificationImpl
