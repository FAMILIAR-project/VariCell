/**
 */
package org.xtext.example.mydsl.variCell;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Values Interpretation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.variCell.MultiValuesInterpretation#getMulti <em>Multi</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.variCell.VariCellPackage#getMultiValuesInterpretation()
 * @model
 * @generated
 */
public interface MultiValuesInterpretation extends EObject
{
  /**
   * Returns the value of the '<em><b>Multi</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.variCell.MultiValueInterpretation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multi</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multi</em>' containment reference list.
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getMultiValuesInterpretation_Multi()
   * @model containment="true"
   * @generated
   */
  EList<MultiValueInterpretation> getMulti();

} // MultiValuesInterpretation
