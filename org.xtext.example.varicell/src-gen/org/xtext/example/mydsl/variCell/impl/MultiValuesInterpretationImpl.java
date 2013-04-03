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

import org.xtext.example.mydsl.variCell.MultiValueInterpretation;
import org.xtext.example.mydsl.variCell.MultiValuesInterpretation;
import org.xtext.example.mydsl.variCell.VariCellPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Values Interpretation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.variCell.impl.MultiValuesInterpretationImpl#getMulti <em>Multi</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiValuesInterpretationImpl extends MinimalEObjectImpl.Container implements MultiValuesInterpretation
{
  /**
   * The cached value of the '{@link #getMulti() <em>Multi</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMulti()
   * @generated
   * @ordered
   */
  protected EList<MultiValueInterpretation> multi;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MultiValuesInterpretationImpl()
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
    return VariCellPackage.Literals.MULTI_VALUES_INTERPRETATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MultiValueInterpretation> getMulti()
  {
    if (multi == null)
    {
      multi = new EObjectContainmentEList<MultiValueInterpretation>(MultiValueInterpretation.class, this, VariCellPackage.MULTI_VALUES_INTERPRETATION__MULTI);
    }
    return multi;
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
      case VariCellPackage.MULTI_VALUES_INTERPRETATION__MULTI:
        return ((InternalEList<?>)getMulti()).basicRemove(otherEnd, msgs);
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
      case VariCellPackage.MULTI_VALUES_INTERPRETATION__MULTI:
        return getMulti();
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
      case VariCellPackage.MULTI_VALUES_INTERPRETATION__MULTI:
        getMulti().clear();
        getMulti().addAll((Collection<? extends MultiValueInterpretation>)newValue);
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
      case VariCellPackage.MULTI_VALUES_INTERPRETATION__MULTI:
        getMulti().clear();
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
      case VariCellPackage.MULTI_VALUES_INTERPRETATION__MULTI:
        return multi != null && !multi.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MultiValuesInterpretationImpl
