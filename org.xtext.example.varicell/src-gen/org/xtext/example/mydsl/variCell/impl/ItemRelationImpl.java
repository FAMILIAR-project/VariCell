/**
 */
package org.xtext.example.mydsl.variCell.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.variCell.ItemRelation;
import org.xtext.example.mydsl.variCell.KindRelation;
import org.xtext.example.mydsl.variCell.VariCellPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.variCell.impl.ItemRelationImpl#getView1 <em>View1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.impl.ItemRelationImpl#getRel <em>Rel</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.impl.ItemRelationImpl#getView2 <em>View2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemRelationImpl extends MinimalEObjectImpl.Container implements ItemRelation
{
  /**
   * The default value of the '{@link #getView1() <em>View1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getView1()
   * @generated
   * @ordered
   */
  protected static final String VIEW1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getView1() <em>View1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getView1()
   * @generated
   * @ordered
   */
  protected String view1 = VIEW1_EDEFAULT;

  /**
   * The default value of the '{@link #getRel() <em>Rel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRel()
   * @generated
   * @ordered
   */
  protected static final KindRelation REL_EDEFAULT = KindRelation.BELOW;

  /**
   * The cached value of the '{@link #getRel() <em>Rel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRel()
   * @generated
   * @ordered
   */
  protected KindRelation rel = REL_EDEFAULT;

  /**
   * The default value of the '{@link #getView2() <em>View2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getView2()
   * @generated
   * @ordered
   */
  protected static final String VIEW2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getView2() <em>View2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getView2()
   * @generated
   * @ordered
   */
  protected String view2 = VIEW2_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ItemRelationImpl()
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
    return VariCellPackage.Literals.ITEM_RELATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getView1()
  {
    return view1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setView1(String newView1)
  {
    String oldView1 = view1;
    view1 = newView1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VariCellPackage.ITEM_RELATION__VIEW1, oldView1, view1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KindRelation getRel()
  {
    return rel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRel(KindRelation newRel)
  {
    KindRelation oldRel = rel;
    rel = newRel == null ? REL_EDEFAULT : newRel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VariCellPackage.ITEM_RELATION__REL, oldRel, rel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getView2()
  {
    return view2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setView2(String newView2)
  {
    String oldView2 = view2;
    view2 = newView2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VariCellPackage.ITEM_RELATION__VIEW2, oldView2, view2));
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
      case VariCellPackage.ITEM_RELATION__VIEW1:
        return getView1();
      case VariCellPackage.ITEM_RELATION__REL:
        return getRel();
      case VariCellPackage.ITEM_RELATION__VIEW2:
        return getView2();
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
      case VariCellPackage.ITEM_RELATION__VIEW1:
        setView1((String)newValue);
        return;
      case VariCellPackage.ITEM_RELATION__REL:
        setRel((KindRelation)newValue);
        return;
      case VariCellPackage.ITEM_RELATION__VIEW2:
        setView2((String)newValue);
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
      case VariCellPackage.ITEM_RELATION__VIEW1:
        setView1(VIEW1_EDEFAULT);
        return;
      case VariCellPackage.ITEM_RELATION__REL:
        setRel(REL_EDEFAULT);
        return;
      case VariCellPackage.ITEM_RELATION__VIEW2:
        setView2(VIEW2_EDEFAULT);
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
      case VariCellPackage.ITEM_RELATION__VIEW1:
        return VIEW1_EDEFAULT == null ? view1 != null : !VIEW1_EDEFAULT.equals(view1);
      case VariCellPackage.ITEM_RELATION__REL:
        return rel != REL_EDEFAULT;
      case VariCellPackage.ITEM_RELATION__VIEW2:
        return VIEW2_EDEFAULT == null ? view2 != null : !VIEW2_EDEFAULT.equals(view2);
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
    result.append(" (view1: ");
    result.append(view1);
    result.append(", rel: ");
    result.append(rel);
    result.append(", view2: ");
    result.append(view2);
    result.append(')');
    return result.toString();
  }

} //ItemRelationImpl
