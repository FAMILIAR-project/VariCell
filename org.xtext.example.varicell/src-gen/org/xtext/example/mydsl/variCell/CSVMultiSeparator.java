/**
 */
package org.xtext.example.mydsl.variCell;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSV Multi Separator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.variCell.CSVMultiSeparator#getSeps <em>Seps</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.variCell.VariCellPackage#getCSVMultiSeparator()
 * @model
 * @generated
 */
public interface CSVMultiSeparator extends EObject
{
  /**
   * Returns the value of the '<em><b>Seps</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Seps</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Seps</em>' attribute list.
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getCSVMultiSeparator_Seps()
   * @model unique="false"
   * @generated
   */
  EList<String> getSeps();

} // CSVMultiSeparator
