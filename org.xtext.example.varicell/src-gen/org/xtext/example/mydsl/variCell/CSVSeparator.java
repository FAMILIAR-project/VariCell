/**
 */
package org.xtext.example.mydsl.variCell;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CSV Separator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.variCell.CSVSeparator#getSep <em>Sep</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.variCell.VariCellPackage#getCSVSeparator()
 * @model
 * @generated
 */
public interface CSVSeparator extends EObject
{
  /**
   * Returns the value of the '<em><b>Sep</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sep</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sep</em>' attribute.
   * @see #setSep(String)
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getCSVSeparator_Sep()
   * @model
   * @generated
   */
  String getSep();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.variCell.CSVSeparator#getSep <em>Sep</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sep</em>' attribute.
   * @see #getSep()
   * @generated
   */
  void setSep(String value);

} // CSVSeparator
