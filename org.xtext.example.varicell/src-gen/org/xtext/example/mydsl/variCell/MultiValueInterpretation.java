/**
 */
package org.xtext.example.mydsl.variCell;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Value Interpretation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.variCell.MultiValueInterpretation#getVal <em>Val</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.MultiValueInterpretation#getVariability <em>Variability</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.variCell.VariCellPackage#getMultiValueInterpretation()
 * @model
 * @generated
 */
public interface MultiValueInterpretation extends EObject
{
  /**
   * Returns the value of the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val</em>' attribute.
   * @see #setVal(String)
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getMultiValueInterpretation_Val()
   * @model
   * @generated
   */
  String getVal();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.variCell.MultiValueInterpretation#getVal <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val</em>' attribute.
   * @see #getVal()
   * @generated
   */
  void setVal(String value);

  /**
   * Returns the value of the '<em><b>Variability</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.variCell.VariabilityInterpretation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variability</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variability</em>' attribute.
   * @see org.xtext.example.mydsl.variCell.VariabilityInterpretation
   * @see #setVariability(VariabilityInterpretation)
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getMultiValueInterpretation_Variability()
   * @model
   * @generated
   */
  VariabilityInterpretation getVariability();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.variCell.MultiValueInterpretation#getVariability <em>Variability</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variability</em>' attribute.
   * @see org.xtext.example.mydsl.variCell.VariabilityInterpretation
   * @see #getVariability()
   * @generated
   */
  void setVariability(VariabilityInterpretation value);

} // MultiValueInterpretation
