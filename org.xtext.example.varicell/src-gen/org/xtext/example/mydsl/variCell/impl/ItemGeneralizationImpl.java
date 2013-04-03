/**
 */
package org.xtext.example.mydsl.variCell.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.xtext.example.mydsl.variCell.ItemGeneralization;
import org.xtext.example.mydsl.variCell.VariCellPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Generalization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.variCell.impl.ItemGeneralizationImpl#getGeneralize <em>Generalize</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.impl.ItemGeneralizationImpl#getViews <em>Views</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemGeneralizationImpl extends MinimalEObjectImpl.Container implements ItemGeneralization
{
  /**
   * The default value of the '{@link #getGeneralize() <em>Generalize</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGeneralize()
   * @generated
   * @ordered
   */
  protected static final String GENERALIZE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGeneralize() <em>Generalize</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGeneralize()
   * @generated
   * @ordered
   */
  protected String generalize = GENERALIZE_EDEFAULT;

  /**
   * The cached value of the '{@link #getViews() <em>Views</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViews()
   * @generated
   * @ordered
   */
  protected EList<String> views;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ItemGeneralizationImpl()
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
    return VariCellPackage.Literals.ITEM_GENERALIZATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGeneralize()
  {
    return generalize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGeneralize(String newGeneralize)
  {
    String oldGeneralize = generalize;
    generalize = newGeneralize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VariCellPackage.ITEM_GENERALIZATION__GENERALIZE, oldGeneralize, generalize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getViews()
  {
    if (views == null)
    {
      views = new EDataTypeEList<String>(String.class, this, VariCellPackage.ITEM_GENERALIZATION__VIEWS);
    }
    return views;
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
      case VariCellPackage.ITEM_GENERALIZATION__GENERALIZE:
        return getGeneralize();
      case VariCellPackage.ITEM_GENERALIZATION__VIEWS:
        return getViews();
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
      case VariCellPackage.ITEM_GENERALIZATION__GENERALIZE:
        setGeneralize((String)newValue);
        return;
      case VariCellPackage.ITEM_GENERALIZATION__VIEWS:
        getViews().clear();
        getViews().addAll((Collection<? extends String>)newValue);
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
      case VariCellPackage.ITEM_GENERALIZATION__GENERALIZE:
        setGeneralize(GENERALIZE_EDEFAULT);
        return;
      case VariCellPackage.ITEM_GENERALIZATION__VIEWS:
        getViews().clear();
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
      case VariCellPackage.ITEM_GENERALIZATION__GENERALIZE:
        return GENERALIZE_EDEFAULT == null ? generalize != null : !GENERALIZE_EDEFAULT.equals(generalize);
      case VariCellPackage.ITEM_GENERALIZATION__VIEWS:
        return views != null && !views.isEmpty();
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
    result.append(" (generalize: ");
    result.append(generalize);
    result.append(", views: ");
    result.append(views);
    result.append(')');
    return result.toString();
  }

} //ItemGeneralizationImpl
