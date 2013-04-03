/**
 */
package org.xtext.example.mydsl.variCell;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Generalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.variCell.ItemGeneralization#getGeneralize <em>Generalize</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.ItemGeneralization#getViews <em>Views</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.variCell.VariCellPackage#getItemGeneralization()
 * @model
 * @generated
 */
public interface ItemGeneralization extends EObject
{
  /**
   * Returns the value of the '<em><b>Generalize</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Generalize</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Generalize</em>' attribute.
   * @see #setGeneralize(String)
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getItemGeneralization_Generalize()
   * @model
   * @generated
   */
  String getGeneralize();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.variCell.ItemGeneralization#getGeneralize <em>Generalize</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Generalize</em>' attribute.
   * @see #getGeneralize()
   * @generated
   */
  void setGeneralize(String value);

  /**
   * Returns the value of the '<em><b>Views</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Views</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Views</em>' attribute list.
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getItemGeneralization_Views()
   * @model unique="false"
   * @generated
   */
  EList<String> getViews();

} // ItemGeneralization
