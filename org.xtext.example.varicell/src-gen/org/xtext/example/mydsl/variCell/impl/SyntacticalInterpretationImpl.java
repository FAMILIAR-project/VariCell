/**
 */
package org.xtext.example.mydsl.variCell.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.variCell.Mandatory;
import org.xtext.example.mydsl.variCell.NotPresent;
import org.xtext.example.mydsl.variCell.Optional;
import org.xtext.example.mydsl.variCell.SyntacticalInterpretation;
import org.xtext.example.mydsl.variCell.Unknown;
import org.xtext.example.mydsl.variCell.VariCellPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Syntactical Interpretation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.variCell.impl.SyntacticalInterpretationImpl#getOpt <em>Opt</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.impl.SyntacticalInterpretationImpl#getYes <em>Yes</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.impl.SyntacticalInterpretationImpl#getNo <em>No</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.impl.SyntacticalInterpretationImpl#getNa <em>Na</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SyntacticalInterpretationImpl extends MinimalEObjectImpl.Container implements SyntacticalInterpretation
{
  /**
   * The cached value of the '{@link #getOpt() <em>Opt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpt()
   * @generated
   * @ordered
   */
  protected Optional opt;

  /**
   * The cached value of the '{@link #getYes() <em>Yes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYes()
   * @generated
   * @ordered
   */
  protected Mandatory yes;

  /**
   * The cached value of the '{@link #getNo() <em>No</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNo()
   * @generated
   * @ordered
   */
  protected NotPresent no;

  /**
   * The cached value of the '{@link #getNa() <em>Na</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNa()
   * @generated
   * @ordered
   */
  protected Unknown na;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SyntacticalInterpretationImpl()
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
    return VariCellPackage.Literals.SYNTACTICAL_INTERPRETATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Optional getOpt()
  {
    return opt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOpt(Optional newOpt, NotificationChain msgs)
  {
    Optional oldOpt = opt;
    opt = newOpt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariCellPackage.SYNTACTICAL_INTERPRETATION__OPT, oldOpt, newOpt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpt(Optional newOpt)
  {
    if (newOpt != opt)
    {
      NotificationChain msgs = null;
      if (opt != null)
        msgs = ((InternalEObject)opt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.SYNTACTICAL_INTERPRETATION__OPT, null, msgs);
      if (newOpt != null)
        msgs = ((InternalEObject)newOpt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.SYNTACTICAL_INTERPRETATION__OPT, null, msgs);
      msgs = basicSetOpt(newOpt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VariCellPackage.SYNTACTICAL_INTERPRETATION__OPT, newOpt, newOpt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mandatory getYes()
  {
    return yes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetYes(Mandatory newYes, NotificationChain msgs)
  {
    Mandatory oldYes = yes;
    yes = newYes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariCellPackage.SYNTACTICAL_INTERPRETATION__YES, oldYes, newYes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setYes(Mandatory newYes)
  {
    if (newYes != yes)
    {
      NotificationChain msgs = null;
      if (yes != null)
        msgs = ((InternalEObject)yes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.SYNTACTICAL_INTERPRETATION__YES, null, msgs);
      if (newYes != null)
        msgs = ((InternalEObject)newYes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.SYNTACTICAL_INTERPRETATION__YES, null, msgs);
      msgs = basicSetYes(newYes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VariCellPackage.SYNTACTICAL_INTERPRETATION__YES, newYes, newYes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotPresent getNo()
  {
    return no;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNo(NotPresent newNo, NotificationChain msgs)
  {
    NotPresent oldNo = no;
    no = newNo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariCellPackage.SYNTACTICAL_INTERPRETATION__NO, oldNo, newNo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNo(NotPresent newNo)
  {
    if (newNo != no)
    {
      NotificationChain msgs = null;
      if (no != null)
        msgs = ((InternalEObject)no).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.SYNTACTICAL_INTERPRETATION__NO, null, msgs);
      if (newNo != null)
        msgs = ((InternalEObject)newNo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.SYNTACTICAL_INTERPRETATION__NO, null, msgs);
      msgs = basicSetNo(newNo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VariCellPackage.SYNTACTICAL_INTERPRETATION__NO, newNo, newNo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Unknown getNa()
  {
    return na;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNa(Unknown newNa, NotificationChain msgs)
  {
    Unknown oldNa = na;
    na = newNa;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VariCellPackage.SYNTACTICAL_INTERPRETATION__NA, oldNa, newNa);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNa(Unknown newNa)
  {
    if (newNa != na)
    {
      NotificationChain msgs = null;
      if (na != null)
        msgs = ((InternalEObject)na).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.SYNTACTICAL_INTERPRETATION__NA, null, msgs);
      if (newNa != null)
        msgs = ((InternalEObject)newNa).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VariCellPackage.SYNTACTICAL_INTERPRETATION__NA, null, msgs);
      msgs = basicSetNa(newNa, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VariCellPackage.SYNTACTICAL_INTERPRETATION__NA, newNa, newNa));
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
      case VariCellPackage.SYNTACTICAL_INTERPRETATION__OPT:
        return basicSetOpt(null, msgs);
      case VariCellPackage.SYNTACTICAL_INTERPRETATION__YES:
        return basicSetYes(null, msgs);
      case VariCellPackage.SYNTACTICAL_INTERPRETATION__NO:
        return basicSetNo(null, msgs);
      case VariCellPackage.SYNTACTICAL_INTERPRETATION__NA:
        return basicSetNa(null, msgs);
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
      case VariCellPackage.SYNTACTICAL_INTERPRETATION__OPT:
        return getOpt();
      case VariCellPackage.SYNTACTICAL_INTERPRETATION__YES:
        return getYes();
      case VariCellPackage.SYNTACTICAL_INTERPRETATION__NO:
        return getNo();
      case VariCellPackage.SYNTACTICAL_INTERPRETATION__NA:
        return getNa();
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
      case VariCellPackage.SYNTACTICAL_INTERPRETATION__OPT:
        setOpt((Optional)newValue);
        return;
      case VariCellPackage.SYNTACTICAL_INTERPRETATION__YES:
        setYes((Mandatory)newValue);
        return;
      case VariCellPackage.SYNTACTICAL_INTERPRETATION__NO:
        setNo((NotPresent)newValue);
        return;
      case VariCellPackage.SYNTACTICAL_INTERPRETATION__NA:
        setNa((Unknown)newValue);
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
      case VariCellPackage.SYNTACTICAL_INTERPRETATION__OPT:
        setOpt((Optional)null);
        return;
      case VariCellPackage.SYNTACTICAL_INTERPRETATION__YES:
        setYes((Mandatory)null);
        return;
      case VariCellPackage.SYNTACTICAL_INTERPRETATION__NO:
        setNo((NotPresent)null);
        return;
      case VariCellPackage.SYNTACTICAL_INTERPRETATION__NA:
        setNa((Unknown)null);
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
      case VariCellPackage.SYNTACTICAL_INTERPRETATION__OPT:
        return opt != null;
      case VariCellPackage.SYNTACTICAL_INTERPRETATION__YES:
        return yes != null;
      case VariCellPackage.SYNTACTICAL_INTERPRETATION__NO:
        return no != null;
      case VariCellPackage.SYNTACTICAL_INTERPRETATION__NA:
        return na != null;
    }
    return super.eIsSet(featureID);
  }

} //SyntacticalInterpretationImpl
