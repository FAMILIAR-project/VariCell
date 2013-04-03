/**
 */
package org.xtext.example.mydsl.variCell.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.variCell.Default;
import org.xtext.example.mydsl.variCell.ParsingConfiguration;
import org.xtext.example.mydsl.variCell.ScopingProducts;
import org.xtext.example.mydsl.variCell.VariCellPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.variCell.impl.DefaultImpl#getConfigs <em>Configs</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.impl.DefaultImpl#getProducts <em>Products</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefaultImpl extends MinimalEObjectImpl.Container implements Default
{
  /**
   * The cached value of the '{@link #getConfigs() <em>Configs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConfigs()
   * @generated
   * @ordered
   */
  protected ParsingConfiguration configs;

  /**
   * The cached value of the '{@link #getProducts() <em>Products</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProducts()
   * @generated
   * @ordered
   */
  protected ScopingProducts products;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefaultImpl()
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
    return VariCellPackage.Literals.DEFAULT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParsingConfiguration getConfigs()
  {
    return configs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConfigs(ParsingConfiguration newConfigs, NotificationChain msgs)
  {
    ParsingConfiguration oldConfigs = configs;
    configs = newConfigs;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariCellPackage.DEFAULT__CONFIGS, oldConfigs, newConfigs);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConfigs(ParsingConfiguration newConfigs)
  {
    if (newConfigs != configs)
    {
      NotificationChain msgs = null;
      if (configs != null)
        msgs = ((InternalEObject)configs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.DEFAULT__CONFIGS, null, msgs);
      if (newConfigs != null)
        msgs = ((InternalEObject)newConfigs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.DEFAULT__CONFIGS, null, msgs);
      msgs = basicSetConfigs(newConfigs, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VariCellPackage.DEFAULT__CONFIGS, newConfigs, newConfigs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScopingProducts getProducts()
  {
    return products;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProducts(ScopingProducts newProducts, NotificationChain msgs)
  {
    ScopingProducts oldProducts = products;
    products = newProducts;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariCellPackage.DEFAULT__PRODUCTS, oldProducts, newProducts);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProducts(ScopingProducts newProducts)
  {
    if (newProducts != products)
    {
      NotificationChain msgs = null;
      if (products != null)
        msgs = ((InternalEObject)products).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.DEFAULT__PRODUCTS, null, msgs);
      if (newProducts != null)
        msgs = ((InternalEObject)newProducts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.DEFAULT__PRODUCTS, null, msgs);
      msgs = basicSetProducts(newProducts, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VariCellPackage.DEFAULT__PRODUCTS, newProducts, newProducts));
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
      case VariCellPackage.DEFAULT__CONFIGS:
        return basicSetConfigs(null, msgs);
      case VariCellPackage.DEFAULT__PRODUCTS:
        return basicSetProducts(null, msgs);
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
      case VariCellPackage.DEFAULT__CONFIGS:
        return getConfigs();
      case VariCellPackage.DEFAULT__PRODUCTS:
        return getProducts();
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
      case VariCellPackage.DEFAULT__CONFIGS:
        setConfigs((ParsingConfiguration)newValue);
        return;
      case VariCellPackage.DEFAULT__PRODUCTS:
        setProducts((ScopingProducts)newValue);
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
      case VariCellPackage.DEFAULT__CONFIGS:
        setConfigs((ParsingConfiguration)null);
        return;
      case VariCellPackage.DEFAULT__PRODUCTS:
        setProducts((ScopingProducts)null);
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
      case VariCellPackage.DEFAULT__CONFIGS:
        return configs != null;
      case VariCellPackage.DEFAULT__PRODUCTS:
        return products != null;
    }
    return super.eIsSet(featureID);
  }

} //DefaultImpl
