/**
 */
package org.xtext.example.mydsl.variCell;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.variCell.ItemMapping#getItem <em>Item</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.ItemMapping#getAct <em>Act</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.ItemMapping#getPfts <em>Pfts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.variCell.VariCellPackage#getItemMapping()
 * @model
 * @generated
 */
public interface ItemMapping extends EObject
{
  /**
   * Returns the value of the '<em><b>Item</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Item</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Item</em>' attribute.
   * @see #setItem(String)
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getItemMapping_Item()
   * @model
   * @generated
   */
  String getItem();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.variCell.ItemMapping#getItem <em>Item</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Item</em>' attribute.
   * @see #getItem()
   * @generated
   */
  void setItem(String value);

  /**
   * Returns the value of the '<em><b>Act</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Act</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Act</em>' attribute.
   * @see #setAct(String)
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getItemMapping_Act()
   * @model
   * @generated
   */
  String getAct();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.variCell.ItemMapping#getAct <em>Act</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Act</em>' attribute.
   * @see #getAct()
   * @generated
   */
  void setAct(String value);

  /**
   * Returns the value of the '<em><b>Pfts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pfts</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pfts</em>' containment reference.
   * @see #setPfts(PredicateItem)
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getItemMapping_Pfts()
   * @model containment="true"
   * @generated
   */
  PredicateItem getPfts();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.variCell.ItemMapping#getPfts <em>Pfts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pfts</em>' containment reference.
   * @see #getPfts()
   * @generated
   */
  void setPfts(PredicateItem value);

} // ItemMapping
