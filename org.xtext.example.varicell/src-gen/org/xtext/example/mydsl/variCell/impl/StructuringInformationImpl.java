/**
 */
package org.xtext.example.mydsl.variCell.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.variCell.ItemGeneralization;
import org.xtext.example.mydsl.variCell.ItemMapping;
import org.xtext.example.mydsl.variCell.ItemRelation;
import org.xtext.example.mydsl.variCell.StructuringInformation;
import org.xtext.example.mydsl.variCell.VariCellPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structuring Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.variCell.impl.StructuringInformationImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.impl.StructuringInformationImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.impl.StructuringInformationImpl#getMp <em>Mp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructuringInformationImpl extends MinimalEObjectImpl.Container implements StructuringInformation
{
  /**
   * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelations()
   * @generated
   * @ordered
   */
  protected EList<ItemRelation> relations;

  /**
   * The cached value of the '{@link #getAbstract() <em>Abstract</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbstract()
   * @generated
   * @ordered
   */
  protected EList<ItemGeneralization> abstract_;

  /**
   * The cached value of the '{@link #getMp() <em>Mp</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMp()
   * @generated
   * @ordered
   */
  protected EList<ItemMapping> mp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StructuringInformationImpl()
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
    return VariCellPackage.Literals.STRUCTURING_INFORMATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ItemRelation> getRelations()
  {
    if (relations == null)
    {
      relations = new EObjectContainmentEList<ItemRelation>(ItemRelation.class, this, VariCellPackage.STRUCTURING_INFORMATION__RELATIONS);
    }
    return relations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ItemGeneralization> getAbstract()
  {
    if (abstract_ == null)
    {
      abstract_ = new EObjectContainmentEList<ItemGeneralization>(ItemGeneralization.class, this, VariCellPackage.STRUCTURING_INFORMATION__ABSTRACT);
    }
    return abstract_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ItemMapping> getMp()
  {
    if (mp == null)
    {
      mp = new EObjectContainmentEList<ItemMapping>(ItemMapping.class, this, VariCellPackage.STRUCTURING_INFORMATION__MP);
    }
    return mp;
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
      case VariCellPackage.STRUCTURING_INFORMATION__RELATIONS:
        return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
      case VariCellPackage.STRUCTURING_INFORMATION__ABSTRACT:
        return ((InternalEList<?>)getAbstract()).basicRemove(otherEnd, msgs);
      case VariCellPackage.STRUCTURING_INFORMATION__MP:
        return ((InternalEList<?>)getMp()).basicRemove(otherEnd, msgs);
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
      case VariCellPackage.STRUCTURING_INFORMATION__RELATIONS:
        return getRelations();
      case VariCellPackage.STRUCTURING_INFORMATION__ABSTRACT:
        return getAbstract();
      case VariCellPackage.STRUCTURING_INFORMATION__MP:
        return getMp();
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
      case VariCellPackage.STRUCTURING_INFORMATION__RELATIONS:
        getRelations().clear();
        getRelations().addAll((Collection<? extends ItemRelation>)newValue);
        return;
      case VariCellPackage.STRUCTURING_INFORMATION__ABSTRACT:
        getAbstract().clear();
        getAbstract().addAll((Collection<? extends ItemGeneralization>)newValue);
        return;
      case VariCellPackage.STRUCTURING_INFORMATION__MP:
        getMp().clear();
        getMp().addAll((Collection<? extends ItemMapping>)newValue);
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
      case VariCellPackage.STRUCTURING_INFORMATION__RELATIONS:
        getRelations().clear();
        return;
      case VariCellPackage.STRUCTURING_INFORMATION__ABSTRACT:
        getAbstract().clear();
        return;
      case VariCellPackage.STRUCTURING_INFORMATION__MP:
        getMp().clear();
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
      case VariCellPackage.STRUCTURING_INFORMATION__RELATIONS:
        return relations != null && !relations.isEmpty();
      case VariCellPackage.STRUCTURING_INFORMATION__ABSTRACT:
        return abstract_ != null && !abstract_.isEmpty();
      case VariCellPackage.STRUCTURING_INFORMATION__MP:
        return mp != null && !mp.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StructuringInformationImpl
