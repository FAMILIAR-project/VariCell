/**
 */
package org.xtext.example.mydsl.variCell.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.variCell.Default;
import org.xtext.example.mydsl.variCell.ImportViews;
import org.xtext.example.mydsl.variCell.SPLName;
import org.xtext.example.mydsl.variCell.SToFMModel;
import org.xtext.example.mydsl.variCell.ScopingView;
import org.xtext.example.mydsl.variCell.StructuringInformation;
import org.xtext.example.mydsl.variCell.VariCellPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>STo FM Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.variCell.impl.SToFMModelImpl#getImportViews <em>Import Views</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.impl.SToFMModelImpl#getSplName <em>Spl Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.impl.SToFMModelImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.impl.SToFMModelImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.impl.SToFMModelImpl#getScoping <em>Scoping</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SToFMModelImpl extends MinimalEObjectImpl.Container implements SToFMModel
{
  /**
   * The cached value of the '{@link #getImportViews() <em>Import Views</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportViews()
   * @generated
   * @ordered
   */
  protected ImportViews importViews;

  /**
   * The cached value of the '{@link #getSplName() <em>Spl Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSplName()
   * @generated
   * @ordered
   */
  protected SPLName splName;

  /**
   * The cached value of the '{@link #getSchema() <em>Schema</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSchema()
   * @generated
   * @ordered
   */
  protected StructuringInformation schema;

  /**
   * The cached value of the '{@link #getDefault() <em>Default</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefault()
   * @generated
   * @ordered
   */
  protected Default default_;

  /**
   * The cached value of the '{@link #getScoping() <em>Scoping</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScoping()
   * @generated
   * @ordered
   */
  protected EList<ScopingView> scoping;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SToFMModelImpl()
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
    return VariCellPackage.Literals.STO_FM_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportViews getImportViews()
  {
    return importViews;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetImportViews(ImportViews newImportViews, NotificationChain msgs)
  {
    ImportViews oldImportViews = importViews;
    importViews = newImportViews;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariCellPackage.STO_FM_MODEL__IMPORT_VIEWS, oldImportViews, newImportViews);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImportViews(ImportViews newImportViews)
  {
    if (newImportViews != importViews)
    {
      NotificationChain msgs = null;
      if (importViews != null)
        msgs = ((InternalEObject)importViews).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.STO_FM_MODEL__IMPORT_VIEWS, null, msgs);
      if (newImportViews != null)
        msgs = ((InternalEObject)newImportViews).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.STO_FM_MODEL__IMPORT_VIEWS, null, msgs);
      msgs = basicSetImportViews(newImportViews, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VariCellPackage.STO_FM_MODEL__IMPORT_VIEWS, newImportViews, newImportViews));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SPLName getSplName()
  {
    return splName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSplName(SPLName newSplName, NotificationChain msgs)
  {
    SPLName oldSplName = splName;
    splName = newSplName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariCellPackage.STO_FM_MODEL__SPL_NAME, oldSplName, newSplName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSplName(SPLName newSplName)
  {
    if (newSplName != splName)
    {
      NotificationChain msgs = null;
      if (splName != null)
        msgs = ((InternalEObject)splName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.STO_FM_MODEL__SPL_NAME, null, msgs);
      if (newSplName != null)
        msgs = ((InternalEObject)newSplName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.STO_FM_MODEL__SPL_NAME, null, msgs);
      msgs = basicSetSplName(newSplName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VariCellPackage.STO_FM_MODEL__SPL_NAME, newSplName, newSplName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructuringInformation getSchema()
  {
    return schema;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSchema(StructuringInformation newSchema, NotificationChain msgs)
  {
    StructuringInformation oldSchema = schema;
    schema = newSchema;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariCellPackage.STO_FM_MODEL__SCHEMA, oldSchema, newSchema);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSchema(StructuringInformation newSchema)
  {
    if (newSchema != schema)
    {
      NotificationChain msgs = null;
      if (schema != null)
        msgs = ((InternalEObject)schema).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.STO_FM_MODEL__SCHEMA, null, msgs);
      if (newSchema != null)
        msgs = ((InternalEObject)newSchema).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.STO_FM_MODEL__SCHEMA, null, msgs);
      msgs = basicSetSchema(newSchema, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VariCellPackage.STO_FM_MODEL__SCHEMA, newSchema, newSchema));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Default getDefault()
  {
    return default_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefault(Default newDefault, NotificationChain msgs)
  {
    Default oldDefault = default_;
    default_ = newDefault;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariCellPackage.STO_FM_MODEL__DEFAULT, oldDefault, newDefault);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefault(Default newDefault)
  {
    if (newDefault != default_)
    {
      NotificationChain msgs = null;
      if (default_ != null)
        msgs = ((InternalEObject)default_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.STO_FM_MODEL__DEFAULT, null, msgs);
      if (newDefault != null)
        msgs = ((InternalEObject)newDefault).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.STO_FM_MODEL__DEFAULT, null, msgs);
      msgs = basicSetDefault(newDefault, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VariCellPackage.STO_FM_MODEL__DEFAULT, newDefault, newDefault));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ScopingView> getScoping()
  {
    if (scoping == null)
    {
      scoping = new EObjectContainmentEList<ScopingView>(ScopingView.class, this, VariCellPackage.STO_FM_MODEL__SCOPING);
    }
    return scoping;
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
      case VariCellPackage.STO_FM_MODEL__IMPORT_VIEWS:
        return basicSetImportViews(null, msgs);
      case VariCellPackage.STO_FM_MODEL__SPL_NAME:
        return basicSetSplName(null, msgs);
      case VariCellPackage.STO_FM_MODEL__SCHEMA:
        return basicSetSchema(null, msgs);
      case VariCellPackage.STO_FM_MODEL__DEFAULT:
        return basicSetDefault(null, msgs);
      case VariCellPackage.STO_FM_MODEL__SCOPING:
        return ((InternalEList<?>)getScoping()).basicRemove(otherEnd, msgs);
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
      case VariCellPackage.STO_FM_MODEL__IMPORT_VIEWS:
        return getImportViews();
      case VariCellPackage.STO_FM_MODEL__SPL_NAME:
        return getSplName();
      case VariCellPackage.STO_FM_MODEL__SCHEMA:
        return getSchema();
      case VariCellPackage.STO_FM_MODEL__DEFAULT:
        return getDefault();
      case VariCellPackage.STO_FM_MODEL__SCOPING:
        return getScoping();
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
      case VariCellPackage.STO_FM_MODEL__IMPORT_VIEWS:
        setImportViews((ImportViews)newValue);
        return;
      case VariCellPackage.STO_FM_MODEL__SPL_NAME:
        setSplName((SPLName)newValue);
        return;
      case VariCellPackage.STO_FM_MODEL__SCHEMA:
        setSchema((StructuringInformation)newValue);
        return;
      case VariCellPackage.STO_FM_MODEL__DEFAULT:
        setDefault((Default)newValue);
        return;
      case VariCellPackage.STO_FM_MODEL__SCOPING:
        getScoping().clear();
        getScoping().addAll((Collection<? extends ScopingView>)newValue);
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
      case VariCellPackage.STO_FM_MODEL__IMPORT_VIEWS:
        setImportViews((ImportViews)null);
        return;
      case VariCellPackage.STO_FM_MODEL__SPL_NAME:
        setSplName((SPLName)null);
        return;
      case VariCellPackage.STO_FM_MODEL__SCHEMA:
        setSchema((StructuringInformation)null);
        return;
      case VariCellPackage.STO_FM_MODEL__DEFAULT:
        setDefault((Default)null);
        return;
      case VariCellPackage.STO_FM_MODEL__SCOPING:
        getScoping().clear();
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
      case VariCellPackage.STO_FM_MODEL__IMPORT_VIEWS:
        return importViews != null;
      case VariCellPackage.STO_FM_MODEL__SPL_NAME:
        return splName != null;
      case VariCellPackage.STO_FM_MODEL__SCHEMA:
        return schema != null;
      case VariCellPackage.STO_FM_MODEL__DEFAULT:
        return default_ != null;
      case VariCellPackage.STO_FM_MODEL__SCOPING:
        return scoping != null && !scoping.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SToFMModelImpl
