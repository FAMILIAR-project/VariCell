/**
 */
package org.xtext.example.mydsl.variCell.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.variCell.DataView;
import org.xtext.example.mydsl.variCell.VariCellPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.variCell.impl.DataViewImpl#getFile <em>File</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.impl.DataViewImpl#getViewname <em>Viewname</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataViewImpl extends MinimalEObjectImpl.Container implements DataView
{
  /**
   * The default value of the '{@link #getFile() <em>File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFile()
   * @generated
   * @ordered
   */
  protected static final String FILE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFile() <em>File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFile()
   * @generated
   * @ordered
   */
  protected String file = FILE_EDEFAULT;

  /**
   * The default value of the '{@link #getViewname() <em>Viewname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViewname()
   * @generated
   * @ordered
   */
  protected static final String VIEWNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getViewname() <em>Viewname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViewname()
   * @generated
   * @ordered
   */
  protected String viewname = VIEWNAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataViewImpl()
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
    return VariCellPackage.Literals.DATA_VIEW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFile()
  {
    return file;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFile(String newFile)
  {
    String oldFile = file;
    file = newFile;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VariCellPackage.DATA_VIEW__FILE, oldFile, file));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getViewname()
  {
    return viewname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setViewname(String newViewname)
  {
    String oldViewname = viewname;
    viewname = newViewname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VariCellPackage.DATA_VIEW__VIEWNAME, oldViewname, viewname));
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
      case VariCellPackage.DATA_VIEW__FILE:
        return getFile();
      case VariCellPackage.DATA_VIEW__VIEWNAME:
        return getViewname();
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
      case VariCellPackage.DATA_VIEW__FILE:
        setFile((String)newValue);
        return;
      case VariCellPackage.DATA_VIEW__VIEWNAME:
        setViewname((String)newValue);
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
      case VariCellPackage.DATA_VIEW__FILE:
        setFile(FILE_EDEFAULT);
        return;
      case VariCellPackage.DATA_VIEW__VIEWNAME:
        setViewname(VIEWNAME_EDEFAULT);
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
      case VariCellPackage.DATA_VIEW__FILE:
        return FILE_EDEFAULT == null ? file != null : !FILE_EDEFAULT.equals(file);
      case VariCellPackage.DATA_VIEW__VIEWNAME:
        return VIEWNAME_EDEFAULT == null ? viewname != null : !VIEWNAME_EDEFAULT.equals(viewname);
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
    result.append(" (file: ");
    result.append(file);
    result.append(", viewname: ");
    result.append(viewname);
    result.append(')');
    return result.toString();
  }

} //DataViewImpl
