/**
 */
package org.xtext.example.mydsl.variCell.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.variCell.CSVMultiSeparator;
import org.xtext.example.mydsl.variCell.CSVSeparator;
import org.xtext.example.mydsl.variCell.FormatSpecification;
import org.xtext.example.mydsl.variCell.Key;
import org.xtext.example.mydsl.variCell.ParsingConfiguration;
import org.xtext.example.mydsl.variCell.SyntacticalInterpretation;
import org.xtext.example.mydsl.variCell.VariCellPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parsing Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.variCell.impl.ParsingConfigurationImpl#getProductID <em>Product ID</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.impl.ParsingConfigurationImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.impl.ParsingConfigurationImpl#getSinterpret <em>Sinterpret</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.impl.ParsingConfigurationImpl#getSeparator <em>Separator</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.impl.ParsingConfigurationImpl#getMseparator <em>Mseparator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParsingConfigurationImpl extends MinimalEObjectImpl.Container implements ParsingConfiguration
{
  /**
   * The cached value of the '{@link #getProductID() <em>Product ID</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProductID()
   * @generated
   * @ordered
   */
  protected Key productID;

  /**
   * The cached value of the '{@link #getFormat() <em>Format</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormat()
   * @generated
   * @ordered
   */
  protected FormatSpecification format;

  /**
   * The cached value of the '{@link #getSinterpret() <em>Sinterpret</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSinterpret()
   * @generated
   * @ordered
   */
  protected SyntacticalInterpretation sinterpret;

  /**
   * The cached value of the '{@link #getSeparator() <em>Separator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeparator()
   * @generated
   * @ordered
   */
  protected CSVSeparator separator;

  /**
   * The cached value of the '{@link #getMseparator() <em>Mseparator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMseparator()
   * @generated
   * @ordered
   */
  protected CSVMultiSeparator mseparator;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParsingConfigurationImpl()
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
    return VariCellPackage.Literals.PARSING_CONFIGURATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Key getProductID()
  {
    return productID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProductID(Key newProductID, NotificationChain msgs)
  {
    Key oldProductID = productID;
    productID = newProductID;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariCellPackage.PARSING_CONFIGURATION__PRODUCT_ID, oldProductID, newProductID);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProductID(Key newProductID)
  {
    if (newProductID != productID)
    {
      NotificationChain msgs = null;
      if (productID != null)
        msgs = ((InternalEObject)productID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.PARSING_CONFIGURATION__PRODUCT_ID, null, msgs);
      if (newProductID != null)
        msgs = ((InternalEObject)newProductID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.PARSING_CONFIGURATION__PRODUCT_ID, null, msgs);
      msgs = basicSetProductID(newProductID, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VariCellPackage.PARSING_CONFIGURATION__PRODUCT_ID, newProductID, newProductID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormatSpecification getFormat()
  {
    return format;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFormat(FormatSpecification newFormat, NotificationChain msgs)
  {
    FormatSpecification oldFormat = format;
    format = newFormat;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariCellPackage.PARSING_CONFIGURATION__FORMAT, oldFormat, newFormat);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFormat(FormatSpecification newFormat)
  {
    if (newFormat != format)
    {
      NotificationChain msgs = null;
      if (format != null)
        msgs = ((InternalEObject)format).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.PARSING_CONFIGURATION__FORMAT, null, msgs);
      if (newFormat != null)
        msgs = ((InternalEObject)newFormat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.PARSING_CONFIGURATION__FORMAT, null, msgs);
      msgs = basicSetFormat(newFormat, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VariCellPackage.PARSING_CONFIGURATION__FORMAT, newFormat, newFormat));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SyntacticalInterpretation getSinterpret()
  {
    return sinterpret;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSinterpret(SyntacticalInterpretation newSinterpret, NotificationChain msgs)
  {
    SyntacticalInterpretation oldSinterpret = sinterpret;
    sinterpret = newSinterpret;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariCellPackage.PARSING_CONFIGURATION__SINTERPRET, oldSinterpret, newSinterpret);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSinterpret(SyntacticalInterpretation newSinterpret)
  {
    if (newSinterpret != sinterpret)
    {
      NotificationChain msgs = null;
      if (sinterpret != null)
        msgs = ((InternalEObject)sinterpret).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.PARSING_CONFIGURATION__SINTERPRET, null, msgs);
      if (newSinterpret != null)
        msgs = ((InternalEObject)newSinterpret).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.PARSING_CONFIGURATION__SINTERPRET, null, msgs);
      msgs = basicSetSinterpret(newSinterpret, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VariCellPackage.PARSING_CONFIGURATION__SINTERPRET, newSinterpret, newSinterpret));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSVSeparator getSeparator()
  {
    return separator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSeparator(CSVSeparator newSeparator, NotificationChain msgs)
  {
    CSVSeparator oldSeparator = separator;
    separator = newSeparator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariCellPackage.PARSING_CONFIGURATION__SEPARATOR, oldSeparator, newSeparator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSeparator(CSVSeparator newSeparator)
  {
    if (newSeparator != separator)
    {
      NotificationChain msgs = null;
      if (separator != null)
        msgs = ((InternalEObject)separator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.PARSING_CONFIGURATION__SEPARATOR, null, msgs);
      if (newSeparator != null)
        msgs = ((InternalEObject)newSeparator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.PARSING_CONFIGURATION__SEPARATOR, null, msgs);
      msgs = basicSetSeparator(newSeparator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VariCellPackage.PARSING_CONFIGURATION__SEPARATOR, newSeparator, newSeparator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSVMultiSeparator getMseparator()
  {
    return mseparator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMseparator(CSVMultiSeparator newMseparator, NotificationChain msgs)
  {
    CSVMultiSeparator oldMseparator = mseparator;
    mseparator = newMseparator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariCellPackage.PARSING_CONFIGURATION__MSEPARATOR, oldMseparator, newMseparator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMseparator(CSVMultiSeparator newMseparator)
  {
    if (newMseparator != mseparator)
    {
      NotificationChain msgs = null;
      if (mseparator != null)
        msgs = ((InternalEObject)mseparator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.PARSING_CONFIGURATION__MSEPARATOR, null, msgs);
      if (newMseparator != null)
        msgs = ((InternalEObject)newMseparator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.PARSING_CONFIGURATION__MSEPARATOR, null, msgs);
      msgs = basicSetMseparator(newMseparator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VariCellPackage.PARSING_CONFIGURATION__MSEPARATOR, newMseparator, newMseparator));
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
      case VariCellPackage.PARSING_CONFIGURATION__PRODUCT_ID:
        return basicSetProductID(null, msgs);
      case VariCellPackage.PARSING_CONFIGURATION__FORMAT:
        return basicSetFormat(null, msgs);
      case VariCellPackage.PARSING_CONFIGURATION__SINTERPRET:
        return basicSetSinterpret(null, msgs);
      case VariCellPackage.PARSING_CONFIGURATION__SEPARATOR:
        return basicSetSeparator(null, msgs);
      case VariCellPackage.PARSING_CONFIGURATION__MSEPARATOR:
        return basicSetMseparator(null, msgs);
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
      case VariCellPackage.PARSING_CONFIGURATION__PRODUCT_ID:
        return getProductID();
      case VariCellPackage.PARSING_CONFIGURATION__FORMAT:
        return getFormat();
      case VariCellPackage.PARSING_CONFIGURATION__SINTERPRET:
        return getSinterpret();
      case VariCellPackage.PARSING_CONFIGURATION__SEPARATOR:
        return getSeparator();
      case VariCellPackage.PARSING_CONFIGURATION__MSEPARATOR:
        return getMseparator();
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
      case VariCellPackage.PARSING_CONFIGURATION__PRODUCT_ID:
        setProductID((Key)newValue);
        return;
      case VariCellPackage.PARSING_CONFIGURATION__FORMAT:
        setFormat((FormatSpecification)newValue);
        return;
      case VariCellPackage.PARSING_CONFIGURATION__SINTERPRET:
        setSinterpret((SyntacticalInterpretation)newValue);
        return;
      case VariCellPackage.PARSING_CONFIGURATION__SEPARATOR:
        setSeparator((CSVSeparator)newValue);
        return;
      case VariCellPackage.PARSING_CONFIGURATION__MSEPARATOR:
        setMseparator((CSVMultiSeparator)newValue);
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
      case VariCellPackage.PARSING_CONFIGURATION__PRODUCT_ID:
        setProductID((Key)null);
        return;
      case VariCellPackage.PARSING_CONFIGURATION__FORMAT:
        setFormat((FormatSpecification)null);
        return;
      case VariCellPackage.PARSING_CONFIGURATION__SINTERPRET:
        setSinterpret((SyntacticalInterpretation)null);
        return;
      case VariCellPackage.PARSING_CONFIGURATION__SEPARATOR:
        setSeparator((CSVSeparator)null);
        return;
      case VariCellPackage.PARSING_CONFIGURATION__MSEPARATOR:
        setMseparator((CSVMultiSeparator)null);
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
      case VariCellPackage.PARSING_CONFIGURATION__PRODUCT_ID:
        return productID != null;
      case VariCellPackage.PARSING_CONFIGURATION__FORMAT:
        return format != null;
      case VariCellPackage.PARSING_CONFIGURATION__SINTERPRET:
        return sinterpret != null;
      case VariCellPackage.PARSING_CONFIGURATION__SEPARATOR:
        return separator != null;
      case VariCellPackage.PARSING_CONFIGURATION__MSEPARATOR:
        return mseparator != null;
    }
    return super.eIsSet(featureID);
  }

} //ParsingConfigurationImpl
