/**
 */
package org.xtext.example.mydsl.variCell.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.variCell.ExceptFeature;
import org.xtext.example.mydsl.variCell.FeatureInclusionExclusion;
import org.xtext.example.mydsl.variCell.OnlyFeature;
import org.xtext.example.mydsl.variCell.VariCellPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Inclusion Exclusion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.variCell.impl.FeatureInclusionExclusionImpl#getExcept <em>Except</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.impl.FeatureInclusionExclusionImpl#getOnly <em>Only</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeatureInclusionExclusionImpl extends ScopingFeaturesImpl implements FeatureInclusionExclusion
{
  /**
   * The cached value of the '{@link #getExcept() <em>Except</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExcept()
   * @generated
   * @ordered
   */
  protected ExceptFeature except;

  /**
   * The cached value of the '{@link #getOnly() <em>Only</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOnly()
   * @generated
   * @ordered
   */
  protected OnlyFeature only;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FeatureInclusionExclusionImpl()
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
    return VariCellPackage.Literals.FEATURE_INCLUSION_EXCLUSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExceptFeature getExcept()
  {
    return except;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExcept(ExceptFeature newExcept, NotificationChain msgs)
  {
    ExceptFeature oldExcept = except;
    except = newExcept;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariCellPackage.FEATURE_INCLUSION_EXCLUSION__EXCEPT, oldExcept, newExcept);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExcept(ExceptFeature newExcept)
  {
    if (newExcept != except)
    {
      NotificationChain msgs = null;
      if (except != null)
        msgs = ((InternalEObject)except).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.FEATURE_INCLUSION_EXCLUSION__EXCEPT, null, msgs);
      if (newExcept != null)
        msgs = ((InternalEObject)newExcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.FEATURE_INCLUSION_EXCLUSION__EXCEPT, null, msgs);
      msgs = basicSetExcept(newExcept, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VariCellPackage.FEATURE_INCLUSION_EXCLUSION__EXCEPT, newExcept, newExcept));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OnlyFeature getOnly()
  {
    return only;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOnly(OnlyFeature newOnly, NotificationChain msgs)
  {
    OnlyFeature oldOnly = only;
    only = newOnly;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariCellPackage.FEATURE_INCLUSION_EXCLUSION__ONLY, oldOnly, newOnly);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOnly(OnlyFeature newOnly)
  {
    if (newOnly != only)
    {
      NotificationChain msgs = null;
      if (only != null)
        msgs = ((InternalEObject)only).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.FEATURE_INCLUSION_EXCLUSION__ONLY, null, msgs);
      if (newOnly != null)
        msgs = ((InternalEObject)newOnly).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.FEATURE_INCLUSION_EXCLUSION__ONLY, null, msgs);
      msgs = basicSetOnly(newOnly, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VariCellPackage.FEATURE_INCLUSION_EXCLUSION__ONLY, newOnly, newOnly));
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
      case VariCellPackage.FEATURE_INCLUSION_EXCLUSION__EXCEPT:
        return basicSetExcept(null, msgs);
      case VariCellPackage.FEATURE_INCLUSION_EXCLUSION__ONLY:
        return basicSetOnly(null, msgs);
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
      case VariCellPackage.FEATURE_INCLUSION_EXCLUSION__EXCEPT:
        return getExcept();
      case VariCellPackage.FEATURE_INCLUSION_EXCLUSION__ONLY:
        return getOnly();
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
      case VariCellPackage.FEATURE_INCLUSION_EXCLUSION__EXCEPT:
        setExcept((ExceptFeature)newValue);
        return;
      case VariCellPackage.FEATURE_INCLUSION_EXCLUSION__ONLY:
        setOnly((OnlyFeature)newValue);
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
      case VariCellPackage.FEATURE_INCLUSION_EXCLUSION__EXCEPT:
        setExcept((ExceptFeature)null);
        return;
      case VariCellPackage.FEATURE_INCLUSION_EXCLUSION__ONLY:
        setOnly((OnlyFeature)null);
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
      case VariCellPackage.FEATURE_INCLUSION_EXCLUSION__EXCEPT:
        return except != null;
      case VariCellPackage.FEATURE_INCLUSION_EXCLUSION__ONLY:
        return only != null;
    }
    return super.eIsSet(featureID);
  }

} //FeatureInclusionExclusionImpl
