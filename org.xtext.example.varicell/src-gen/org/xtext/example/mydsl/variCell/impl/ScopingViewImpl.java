/**
 */
package org.xtext.example.mydsl.variCell.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.variCell.MultiValuesInterpretation;
import org.xtext.example.mydsl.variCell.ParsingConfiguration;
import org.xtext.example.mydsl.variCell.Rewriting;
import org.xtext.example.mydsl.variCell.ScopingFeatures;
import org.xtext.example.mydsl.variCell.ScopingProducts;
import org.xtext.example.mydsl.variCell.ScopingView;
import org.xtext.example.mydsl.variCell.StructuringInformation;
import org.xtext.example.mydsl.variCell.VariCellPackage;
import org.xtext.example.mydsl.variCell.ViewName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scoping View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.variCell.impl.ScopingViewImpl#getView <em>View</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.impl.ScopingViewImpl#getViewname <em>Viewname</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.impl.ScopingViewImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.impl.ScopingViewImpl#getConfig <em>Config</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.impl.ScopingViewImpl#getProducts <em>Products</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.impl.ScopingViewImpl#getFts <em>Fts</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.impl.ScopingViewImpl#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.impl.ScopingViewImpl#getInterpretation <em>Interpretation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScopingViewImpl extends MinimalEObjectImpl.Container implements ScopingView
{
  /**
   * The default value of the '{@link #getView() <em>View</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getView()
   * @generated
   * @ordered
   */
  protected static final String VIEW_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getView() <em>View</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getView()
   * @generated
   * @ordered
   */
  protected String view = VIEW_EDEFAULT;

  /**
   * The cached value of the '{@link #getViewname() <em>Viewname</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getViewname()
   * @generated
   * @ordered
   */
  protected ViewName viewname;

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
   * The cached value of the '{@link #getConfig() <em>Config</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConfig()
   * @generated
   * @ordered
   */
  protected ParsingConfiguration config;

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
   * The cached value of the '{@link #getFts() <em>Fts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFts()
   * @generated
   * @ordered
   */
  protected ScopingFeatures fts;

  /**
   * The cached value of the '{@link #getAlignment() <em>Alignment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlignment()
   * @generated
   * @ordered
   */
  protected Rewriting alignment;

  /**
   * The cached value of the '{@link #getInterpretation() <em>Interpretation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterpretation()
   * @generated
   * @ordered
   */
  protected MultiValuesInterpretation interpretation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScopingViewImpl()
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
    return VariCellPackage.Literals.SCOPING_VIEW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getView()
  {
    return view;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setView(String newView)
  {
    String oldView = view;
    view = newView;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VariCellPackage.SCOPING_VIEW__VIEW, oldView, view));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewName getViewname()
  {
    return viewname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetViewname(ViewName newViewname, NotificationChain msgs)
  {
    ViewName oldViewname = viewname;
    viewname = newViewname;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariCellPackage.SCOPING_VIEW__VIEWNAME, oldViewname, newViewname);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setViewname(ViewName newViewname)
  {
    if (newViewname != viewname)
    {
      NotificationChain msgs = null;
      if (viewname != null)
        msgs = ((InternalEObject)viewname).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.SCOPING_VIEW__VIEWNAME, null, msgs);
      if (newViewname != null)
        msgs = ((InternalEObject)newViewname).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.SCOPING_VIEW__VIEWNAME, null, msgs);
      msgs = basicSetViewname(newViewname, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VariCellPackage.SCOPING_VIEW__VIEWNAME, newViewname, newViewname));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariCellPackage.SCOPING_VIEW__SCHEMA, oldSchema, newSchema);
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
        msgs = ((InternalEObject)schema).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.SCOPING_VIEW__SCHEMA, null, msgs);
      if (newSchema != null)
        msgs = ((InternalEObject)newSchema).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.SCOPING_VIEW__SCHEMA, null, msgs);
      msgs = basicSetSchema(newSchema, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VariCellPackage.SCOPING_VIEW__SCHEMA, newSchema, newSchema));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParsingConfiguration getConfig()
  {
    return config;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConfig(ParsingConfiguration newConfig, NotificationChain msgs)
  {
    ParsingConfiguration oldConfig = config;
    config = newConfig;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariCellPackage.SCOPING_VIEW__CONFIG, oldConfig, newConfig);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConfig(ParsingConfiguration newConfig)
  {
    if (newConfig != config)
    {
      NotificationChain msgs = null;
      if (config != null)
        msgs = ((InternalEObject)config).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.SCOPING_VIEW__CONFIG, null, msgs);
      if (newConfig != null)
        msgs = ((InternalEObject)newConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.SCOPING_VIEW__CONFIG, null, msgs);
      msgs = basicSetConfig(newConfig, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VariCellPackage.SCOPING_VIEW__CONFIG, newConfig, newConfig));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariCellPackage.SCOPING_VIEW__PRODUCTS, oldProducts, newProducts);
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
        msgs = ((InternalEObject)products).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.SCOPING_VIEW__PRODUCTS, null, msgs);
      if (newProducts != null)
        msgs = ((InternalEObject)newProducts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.SCOPING_VIEW__PRODUCTS, null, msgs);
      msgs = basicSetProducts(newProducts, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VariCellPackage.SCOPING_VIEW__PRODUCTS, newProducts, newProducts));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScopingFeatures getFts()
  {
    return fts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFts(ScopingFeatures newFts, NotificationChain msgs)
  {
    ScopingFeatures oldFts = fts;
    fts = newFts;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariCellPackage.SCOPING_VIEW__FTS, oldFts, newFts);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFts(ScopingFeatures newFts)
  {
    if (newFts != fts)
    {
      NotificationChain msgs = null;
      if (fts != null)
        msgs = ((InternalEObject)fts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.SCOPING_VIEW__FTS, null, msgs);
      if (newFts != null)
        msgs = ((InternalEObject)newFts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.SCOPING_VIEW__FTS, null, msgs);
      msgs = basicSetFts(newFts, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VariCellPackage.SCOPING_VIEW__FTS, newFts, newFts));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rewriting getAlignment()
  {
    return alignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAlignment(Rewriting newAlignment, NotificationChain msgs)
  {
    Rewriting oldAlignment = alignment;
    alignment = newAlignment;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariCellPackage.SCOPING_VIEW__ALIGNMENT, oldAlignment, newAlignment);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlignment(Rewriting newAlignment)
  {
    if (newAlignment != alignment)
    {
      NotificationChain msgs = null;
      if (alignment != null)
        msgs = ((InternalEObject)alignment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.SCOPING_VIEW__ALIGNMENT, null, msgs);
      if (newAlignment != null)
        msgs = ((InternalEObject)newAlignment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.SCOPING_VIEW__ALIGNMENT, null, msgs);
      msgs = basicSetAlignment(newAlignment, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VariCellPackage.SCOPING_VIEW__ALIGNMENT, newAlignment, newAlignment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiValuesInterpretation getInterpretation()
  {
    return interpretation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInterpretation(MultiValuesInterpretation newInterpretation, NotificationChain msgs)
  {
    MultiValuesInterpretation oldInterpretation = interpretation;
    interpretation = newInterpretation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariCellPackage.SCOPING_VIEW__INTERPRETATION, oldInterpretation, newInterpretation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterpretation(MultiValuesInterpretation newInterpretation)
  {
    if (newInterpretation != interpretation)
    {
      NotificationChain msgs = null;
      if (interpretation != null)
        msgs = ((InternalEObject)interpretation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.SCOPING_VIEW__INTERPRETATION, null, msgs);
      if (newInterpretation != null)
        msgs = ((InternalEObject)newInterpretation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.SCOPING_VIEW__INTERPRETATION, null, msgs);
      msgs = basicSetInterpretation(newInterpretation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VariCellPackage.SCOPING_VIEW__INTERPRETATION, newInterpretation, newInterpretation));
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
      case VariCellPackage.SCOPING_VIEW__VIEWNAME:
        return basicSetViewname(null, msgs);
      case VariCellPackage.SCOPING_VIEW__SCHEMA:
        return basicSetSchema(null, msgs);
      case VariCellPackage.SCOPING_VIEW__CONFIG:
        return basicSetConfig(null, msgs);
      case VariCellPackage.SCOPING_VIEW__PRODUCTS:
        return basicSetProducts(null, msgs);
      case VariCellPackage.SCOPING_VIEW__FTS:
        return basicSetFts(null, msgs);
      case VariCellPackage.SCOPING_VIEW__ALIGNMENT:
        return basicSetAlignment(null, msgs);
      case VariCellPackage.SCOPING_VIEW__INTERPRETATION:
        return basicSetInterpretation(null, msgs);
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
      case VariCellPackage.SCOPING_VIEW__VIEW:
        return getView();
      case VariCellPackage.SCOPING_VIEW__VIEWNAME:
        return getViewname();
      case VariCellPackage.SCOPING_VIEW__SCHEMA:
        return getSchema();
      case VariCellPackage.SCOPING_VIEW__CONFIG:
        return getConfig();
      case VariCellPackage.SCOPING_VIEW__PRODUCTS:
        return getProducts();
      case VariCellPackage.SCOPING_VIEW__FTS:
        return getFts();
      case VariCellPackage.SCOPING_VIEW__ALIGNMENT:
        return getAlignment();
      case VariCellPackage.SCOPING_VIEW__INTERPRETATION:
        return getInterpretation();
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
      case VariCellPackage.SCOPING_VIEW__VIEW:
        setView((String)newValue);
        return;
      case VariCellPackage.SCOPING_VIEW__VIEWNAME:
        setViewname((ViewName)newValue);
        return;
      case VariCellPackage.SCOPING_VIEW__SCHEMA:
        setSchema((StructuringInformation)newValue);
        return;
      case VariCellPackage.SCOPING_VIEW__CONFIG:
        setConfig((ParsingConfiguration)newValue);
        return;
      case VariCellPackage.SCOPING_VIEW__PRODUCTS:
        setProducts((ScopingProducts)newValue);
        return;
      case VariCellPackage.SCOPING_VIEW__FTS:
        setFts((ScopingFeatures)newValue);
        return;
      case VariCellPackage.SCOPING_VIEW__ALIGNMENT:
        setAlignment((Rewriting)newValue);
        return;
      case VariCellPackage.SCOPING_VIEW__INTERPRETATION:
        setInterpretation((MultiValuesInterpretation)newValue);
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
      case VariCellPackage.SCOPING_VIEW__VIEW:
        setView(VIEW_EDEFAULT);
        return;
      case VariCellPackage.SCOPING_VIEW__VIEWNAME:
        setViewname((ViewName)null);
        return;
      case VariCellPackage.SCOPING_VIEW__SCHEMA:
        setSchema((StructuringInformation)null);
        return;
      case VariCellPackage.SCOPING_VIEW__CONFIG:
        setConfig((ParsingConfiguration)null);
        return;
      case VariCellPackage.SCOPING_VIEW__PRODUCTS:
        setProducts((ScopingProducts)null);
        return;
      case VariCellPackage.SCOPING_VIEW__FTS:
        setFts((ScopingFeatures)null);
        return;
      case VariCellPackage.SCOPING_VIEW__ALIGNMENT:
        setAlignment((Rewriting)null);
        return;
      case VariCellPackage.SCOPING_VIEW__INTERPRETATION:
        setInterpretation((MultiValuesInterpretation)null);
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
      case VariCellPackage.SCOPING_VIEW__VIEW:
        return VIEW_EDEFAULT == null ? view != null : !VIEW_EDEFAULT.equals(view);
      case VariCellPackage.SCOPING_VIEW__VIEWNAME:
        return viewname != null;
      case VariCellPackage.SCOPING_VIEW__SCHEMA:
        return schema != null;
      case VariCellPackage.SCOPING_VIEW__CONFIG:
        return config != null;
      case VariCellPackage.SCOPING_VIEW__PRODUCTS:
        return products != null;
      case VariCellPackage.SCOPING_VIEW__FTS:
        return fts != null;
      case VariCellPackage.SCOPING_VIEW__ALIGNMENT:
        return alignment != null;
      case VariCellPackage.SCOPING_VIEW__INTERPRETATION:
        return interpretation != null;
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
    result.append(" (view: ");
    result.append(view);
    result.append(')');
    return result.toString();
  }

} //ScopingViewImpl
