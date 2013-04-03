/**
 */
package org.xtext.example.mydsl.variCell.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.variCell.Rewriting;
import org.xtext.example.mydsl.variCell.VariCellPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rewriting</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.variCell.impl.RewritingImpl#getOft <em>Oft</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.impl.RewritingImpl#getNft <em>Nft</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RewritingImpl extends MinimalEObjectImpl.Container implements Rewriting
{
  /**
   * The default value of the '{@link #getOft() <em>Oft</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOft()
   * @generated
   * @ordered
   */
  protected static final String OFT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOft() <em>Oft</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOft()
   * @generated
   * @ordered
   */
  protected String oft = OFT_EDEFAULT;

  /**
   * The default value of the '{@link #getNft() <em>Nft</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNft()
   * @generated
   * @ordered
   */
  protected static final String NFT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNft() <em>Nft</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNft()
   * @generated
   * @ordered
   */
  protected String nft = NFT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RewritingImpl()
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
    return VariCellPackage.Literals.REWRITING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOft()
  {
    return oft;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOft(String newOft)
  {
    String oldOft = oft;
    oft = newOft;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VariCellPackage.REWRITING__OFT, oldOft, oft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNft()
  {
    return nft;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNft(String newNft)
  {
    String oldNft = nft;
    nft = newNft;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VariCellPackage.REWRITING__NFT, oldNft, nft));
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
      case VariCellPackage.REWRITING__OFT:
        return getOft();
      case VariCellPackage.REWRITING__NFT:
        return getNft();
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
      case VariCellPackage.REWRITING__OFT:
        setOft((String)newValue);
        return;
      case VariCellPackage.REWRITING__NFT:
        setNft((String)newValue);
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
      case VariCellPackage.REWRITING__OFT:
        setOft(OFT_EDEFAULT);
        return;
      case VariCellPackage.REWRITING__NFT:
        setNft(NFT_EDEFAULT);
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
      case VariCellPackage.REWRITING__OFT:
        return OFT_EDEFAULT == null ? oft != null : !OFT_EDEFAULT.equals(oft);
      case VariCellPackage.REWRITING__NFT:
        return NFT_EDEFAULT == null ? nft != null : !NFT_EDEFAULT.equals(nft);
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
    result.append(" (oft: ");
    result.append(oft);
    result.append(", nft: ");
    result.append(nft);
    result.append(')');
    return result.toString();
  }

} //RewritingImpl
