/**
 */
package org.xtext.example.mydsl.variCell.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.variCell.ExceptProduct;
import org.xtext.example.mydsl.variCell.OnlyProduct;
import org.xtext.example.mydsl.variCell.ProductInclusionExclusion;
import org.xtext.example.mydsl.variCell.VariCellPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Product Inclusion Exclusion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.variCell.impl.ProductInclusionExclusionImpl#getExcept <em>Except</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.impl.ProductInclusionExclusionImpl#getOnly <em>Only</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProductInclusionExclusionImpl extends ScopingProductsImpl implements ProductInclusionExclusion
{
  /**
   * The cached value of the '{@link #getExcept() <em>Except</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExcept()
   * @generated
   * @ordered
   */
  protected ExceptProduct except;

  /**
   * The cached value of the '{@link #getOnly() <em>Only</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOnly()
   * @generated
   * @ordered
   */
  protected OnlyProduct only;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProductInclusionExclusionImpl()
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
    return VariCellPackage.Literals.PRODUCT_INCLUSION_EXCLUSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExceptProduct getExcept()
  {
    return except;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExcept(ExceptProduct newExcept, NotificationChain msgs)
  {
    ExceptProduct oldExcept = except;
    except = newExcept;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariCellPackage.PRODUCT_INCLUSION_EXCLUSION__EXCEPT, oldExcept, newExcept);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExcept(ExceptProduct newExcept)
  {
    if (newExcept != except)
    {
      NotificationChain msgs = null;
      if (except != null)
        msgs = ((InternalEObject)except).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.PRODUCT_INCLUSION_EXCLUSION__EXCEPT, null, msgs);
      if (newExcept != null)
        msgs = ((InternalEObject)newExcept).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.PRODUCT_INCLUSION_EXCLUSION__EXCEPT, null, msgs);
      msgs = basicSetExcept(newExcept, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VariCellPackage.PRODUCT_INCLUSION_EXCLUSION__EXCEPT, newExcept, newExcept));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OnlyProduct getOnly()
  {
    return only;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOnly(OnlyProduct newOnly, NotificationChain msgs)
  {
    OnlyProduct oldOnly = only;
    only = newOnly;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariCellPackage.PRODUCT_INCLUSION_EXCLUSION__ONLY, oldOnly, newOnly);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOnly(OnlyProduct newOnly)
  {
    if (newOnly != only)
    {
      NotificationChain msgs = null;
      if (only != null)
        msgs = ((InternalEObject)only).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.PRODUCT_INCLUSION_EXCLUSION__ONLY, null, msgs);
      if (newOnly != null)
        msgs = ((InternalEObject)newOnly).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.PRODUCT_INCLUSION_EXCLUSION__ONLY, null, msgs);
      msgs = basicSetOnly(newOnly, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VariCellPackage.PRODUCT_INCLUSION_EXCLUSION__ONLY, newOnly, newOnly));
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
      case VariCellPackage.PRODUCT_INCLUSION_EXCLUSION__EXCEPT:
        return basicSetExcept(null, msgs);
      case VariCellPackage.PRODUCT_INCLUSION_EXCLUSION__ONLY:
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
      case VariCellPackage.PRODUCT_INCLUSION_EXCLUSION__EXCEPT:
        return getExcept();
      case VariCellPackage.PRODUCT_INCLUSION_EXCLUSION__ONLY:
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
      case VariCellPackage.PRODUCT_INCLUSION_EXCLUSION__EXCEPT:
        setExcept((ExceptProduct)newValue);
        return;
      case VariCellPackage.PRODUCT_INCLUSION_EXCLUSION__ONLY:
        setOnly((OnlyProduct)newValue);
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
      case VariCellPackage.PRODUCT_INCLUSION_EXCLUSION__EXCEPT:
        setExcept((ExceptProduct)null);
        return;
      case VariCellPackage.PRODUCT_INCLUSION_EXCLUSION__ONLY:
        setOnly((OnlyProduct)null);
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
      case VariCellPackage.PRODUCT_INCLUSION_EXCLUSION__EXCEPT:
        return except != null;
      case VariCellPackage.PRODUCT_INCLUSION_EXCLUSION__ONLY:
        return only != null;
    }
    return super.eIsSet(featureID);
  }

} //ProductInclusionExclusionImpl
