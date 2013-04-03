/**
 */
package org.xtext.example.mydsl.variCell;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.variCell.ItemRelation#getView1 <em>View1</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.ItemRelation#getRel <em>Rel</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.ItemRelation#getView2 <em>View2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.variCell.VariCellPackage#getItemRelation()
 * @model
 * @generated
 */
public interface ItemRelation extends EObject
{
  /**
   * Returns the value of the '<em><b>View1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>View1</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>View1</em>' attribute.
   * @see #setView1(String)
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getItemRelation_View1()
   * @model
   * @generated
   */
  String getView1();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.variCell.ItemRelation#getView1 <em>View1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>View1</em>' attribute.
   * @see #getView1()
   * @generated
   */
  void setView1(String value);

  /**
   * Returns the value of the '<em><b>Rel</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.variCell.KindRelation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rel</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rel</em>' attribute.
   * @see org.xtext.example.mydsl.variCell.KindRelation
   * @see #setRel(KindRelation)
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getItemRelation_Rel()
   * @model
   * @generated
   */
  KindRelation getRel();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.variCell.ItemRelation#getRel <em>Rel</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rel</em>' attribute.
   * @see org.xtext.example.mydsl.variCell.KindRelation
   * @see #getRel()
   * @generated
   */
  void setRel(KindRelation value);

  /**
   * Returns the value of the '<em><b>View2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>View2</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>View2</em>' attribute.
   * @see #setView2(String)
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getItemRelation_View2()
   * @model
   * @generated
   */
  String getView2();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.variCell.ItemRelation#getView2 <em>View2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>View2</em>' attribute.
   * @see #getView2()
   * @generated
   */
  void setView2(String value);

} // ItemRelation
