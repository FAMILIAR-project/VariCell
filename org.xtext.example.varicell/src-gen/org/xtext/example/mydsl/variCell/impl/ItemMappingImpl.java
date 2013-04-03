/**
 */
package org.xtext.example.mydsl.variCell.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.variCell.ItemMapping;
import org.xtext.example.mydsl.variCell.PredicateItem;
import org.xtext.example.mydsl.variCell.VariCellPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.variCell.impl.ItemMappingImpl#getItem <em>Item</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.impl.ItemMappingImpl#getAct <em>Act</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.impl.ItemMappingImpl#getPfts <em>Pfts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemMappingImpl extends MinimalEObjectImpl.Container implements ItemMapping
{
  /**
   * The default value of the '{@link #getItem() <em>Item</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItem()
   * @generated
   * @ordered
   */
  protected static final String ITEM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getItem() <em>Item</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItem()
   * @generated
   * @ordered
   */
  protected String item = ITEM_EDEFAULT;

  /**
   * The default value of the '{@link #getAct() <em>Act</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAct()
   * @generated
   * @ordered
   */
  protected static final String ACT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAct() <em>Act</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAct()
   * @generated
   * @ordered
   */
  protected String act = ACT_EDEFAULT;

  /**
   * The cached value of the '{@link #getPfts() <em>Pfts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPfts()
   * @generated
   * @ordered
   */
  protected PredicateItem pfts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ItemMappingImpl()
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
    return VariCellPackage.Literals.ITEM_MAPPING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getItem()
  {
    return item;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setItem(String newItem)
  {
    String oldItem = item;
    item = newItem;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VariCellPackage.ITEM_MAPPING__ITEM, oldItem, item));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAct()
  {
    return act;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAct(String newAct)
  {
    String oldAct = act;
    act = newAct;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VariCellPackage.ITEM_MAPPING__ACT, oldAct, act));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PredicateItem getPfts()
  {
    return pfts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPfts(PredicateItem newPfts, NotificationChain msgs)
  {
    PredicateItem oldPfts = pfts;
    pfts = newPfts;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariCellPackage.ITEM_MAPPING__PFTS, oldPfts, newPfts);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPfts(PredicateItem newPfts)
  {
    if (newPfts != pfts)
    {
      NotificationChain msgs = null;
      if (pfts != null)
        msgs = ((InternalEObject)pfts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.ITEM_MAPPING__PFTS, null, msgs);
      if (newPfts != null)
        msgs = ((InternalEObject)newPfts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.ITEM_MAPPING__PFTS, null, msgs);
      msgs = basicSetPfts(newPfts, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VariCellPackage.ITEM_MAPPING__PFTS, newPfts, newPfts));
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
      case VariCellPackage.ITEM_MAPPING__PFTS:
        return basicSetPfts(null, msgs);
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
      case VariCellPackage.ITEM_MAPPING__ITEM:
        return getItem();
      case VariCellPackage.ITEM_MAPPING__ACT:
        return getAct();
      case VariCellPackage.ITEM_MAPPING__PFTS:
        return getPfts();
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
      case VariCellPackage.ITEM_MAPPING__ITEM:
        setItem((String)newValue);
        return;
      case VariCellPackage.ITEM_MAPPING__ACT:
        setAct((String)newValue);
        return;
      case VariCellPackage.ITEM_MAPPING__PFTS:
        setPfts((PredicateItem)newValue);
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
      case VariCellPackage.ITEM_MAPPING__ITEM:
        setItem(ITEM_EDEFAULT);
        return;
      case VariCellPackage.ITEM_MAPPING__ACT:
        setAct(ACT_EDEFAULT);
        return;
      case VariCellPackage.ITEM_MAPPING__PFTS:
        setPfts((PredicateItem)null);
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
      case VariCellPackage.ITEM_MAPPING__ITEM:
        return ITEM_EDEFAULT == null ? item != null : !ITEM_EDEFAULT.equals(item);
      case VariCellPackage.ITEM_MAPPING__ACT:
        return ACT_EDEFAULT == null ? act != null : !ACT_EDEFAULT.equals(act);
      case VariCellPackage.ITEM_MAPPING__PFTS:
        return pfts != null;
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
    result.append(" (item: ");
    result.append(item);
    result.append(", act: ");
    result.append(act);
    result.append(')');
    return result.toString();
  }

} //ItemMappingImpl
