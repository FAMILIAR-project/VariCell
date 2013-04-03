/**
 */
package org.xtext.example.mydsl.variCell;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Inclusion Exclusion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.variCell.FeatureInclusionExclusion#getExcept <em>Except</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.FeatureInclusionExclusion#getOnly <em>Only</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.variCell.VariCellPackage#getFeatureInclusionExclusion()
 * @model
 * @generated
 */
public interface FeatureInclusionExclusion extends ScopingFeatures
{
  /**
   * Returns the value of the '<em><b>Except</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Except</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Except</em>' containment reference.
   * @see #setExcept(ExceptFeature)
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getFeatureInclusionExclusion_Except()
   * @model containment="true"
   * @generated
   */
  ExceptFeature getExcept();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.variCell.FeatureInclusionExclusion#getExcept <em>Except</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Except</em>' containment reference.
   * @see #getExcept()
   * @generated
   */
  void setExcept(ExceptFeature value);

  /**
   * Returns the value of the '<em><b>Only</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Only</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Only</em>' containment reference.
   * @see #setOnly(OnlyFeature)
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getFeatureInclusionExclusion_Only()
   * @model containment="true"
   * @generated
   */
  OnlyFeature getOnly();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.variCell.FeatureInclusionExclusion#getOnly <em>Only</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Only</em>' containment reference.
   * @see #getOnly()
   * @generated
   */
  void setOnly(OnlyFeature value);

} // FeatureInclusionExclusion
