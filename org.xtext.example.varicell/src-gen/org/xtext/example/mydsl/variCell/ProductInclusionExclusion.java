/**
 */
package org.xtext.example.mydsl.variCell;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Product Inclusion Exclusion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.variCell.ProductInclusionExclusion#getExcept <em>Except</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.ProductInclusionExclusion#getOnly <em>Only</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.variCell.VariCellPackage#getProductInclusionExclusion()
 * @model
 * @generated
 */
public interface ProductInclusionExclusion extends ScopingProducts
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
   * @see #setExcept(ExceptProduct)
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getProductInclusionExclusion_Except()
   * @model containment="true"
   * @generated
   */
  ExceptProduct getExcept();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.variCell.ProductInclusionExclusion#getExcept <em>Except</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Except</em>' containment reference.
   * @see #getExcept()
   * @generated
   */
  void setExcept(ExceptProduct value);

  /**
   * Returns the value of the '<em><b>Only</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Only</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Only</em>' containment reference.
   * @see #setOnly(OnlyProduct)
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getProductInclusionExclusion_Only()
   * @model containment="true"
   * @generated
   */
  OnlyProduct getOnly();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.variCell.ProductInclusionExclusion#getOnly <em>Only</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Only</em>' containment reference.
   * @see #getOnly()
   * @generated
   */
  void setOnly(OnlyProduct value);

} // ProductInclusionExclusion
