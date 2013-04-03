/**
 */
package org.xtext.example.mydsl.variCell;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structuring Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.variCell.StructuringInformation#getRelations <em>Relations</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.StructuringInformation#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.StructuringInformation#getMp <em>Mp</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.variCell.VariCellPackage#getStructuringInformation()
 * @model
 * @generated
 */
public interface StructuringInformation extends EObject
{
  /**
   * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.variCell.ItemRelation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relations</em>' containment reference list.
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getStructuringInformation_Relations()
   * @model containment="true"
   * @generated
   */
  EList<ItemRelation> getRelations();

  /**
   * Returns the value of the '<em><b>Abstract</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.variCell.ItemGeneralization}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstract</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract</em>' containment reference list.
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getStructuringInformation_Abstract()
   * @model containment="true"
   * @generated
   */
  EList<ItemGeneralization> getAbstract();

  /**
   * Returns the value of the '<em><b>Mp</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.variCell.ItemMapping}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mp</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mp</em>' containment reference list.
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getStructuringInformation_Mp()
   * @model containment="true"
   * @generated
   */
  EList<ItemMapping> getMp();

} // StructuringInformation
