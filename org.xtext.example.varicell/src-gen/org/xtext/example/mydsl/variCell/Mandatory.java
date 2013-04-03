/**
 */
package org.xtext.example.mydsl.variCell;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mandatory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.variCell.Mandatory#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.variCell.VariCellPackage#getMandatory()
 * @model
 * @generated
 */
public interface Mandatory extends EObject
{
  /**
   * Returns the value of the '<em><b>Values</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' attribute list.
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getMandatory_Values()
   * @model unique="false"
   * @generated
   */
  EList<String> getValues();

} // Mandatory
