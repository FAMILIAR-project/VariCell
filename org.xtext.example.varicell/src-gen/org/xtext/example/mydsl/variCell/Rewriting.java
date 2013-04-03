/**
 */
package org.xtext.example.mydsl.variCell;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rewriting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.variCell.Rewriting#getOft <em>Oft</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.Rewriting#getNft <em>Nft</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.variCell.VariCellPackage#getRewriting()
 * @model
 * @generated
 */
public interface Rewriting extends EObject
{
  /**
   * Returns the value of the '<em><b>Oft</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Oft</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Oft</em>' attribute.
   * @see #setOft(String)
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getRewriting_Oft()
   * @model
   * @generated
   */
  String getOft();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.variCell.Rewriting#getOft <em>Oft</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Oft</em>' attribute.
   * @see #getOft()
   * @generated
   */
  void setOft(String value);

  /**
   * Returns the value of the '<em><b>Nft</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Nft</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Nft</em>' attribute.
   * @see #setNft(String)
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getRewriting_Nft()
   * @model
   * @generated
   */
  String getNft();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.variCell.Rewriting#getNft <em>Nft</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Nft</em>' attribute.
   * @see #getNft()
   * @generated
   */
  void setNft(String value);

} // Rewriting
