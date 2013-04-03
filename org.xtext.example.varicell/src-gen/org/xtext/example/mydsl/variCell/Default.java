/**
 */
package org.xtext.example.mydsl.variCell;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.variCell.Default#getConfigs <em>Configs</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.Default#getProducts <em>Products</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.variCell.VariCellPackage#getDefault()
 * @model
 * @generated
 */
public interface Default extends EObject
{
  /**
   * Returns the value of the '<em><b>Configs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Configs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Configs</em>' containment reference.
   * @see #setConfigs(ParsingConfiguration)
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getDefault_Configs()
   * @model containment="true"
   * @generated
   */
  ParsingConfiguration getConfigs();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.variCell.Default#getConfigs <em>Configs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Configs</em>' containment reference.
   * @see #getConfigs()
   * @generated
   */
  void setConfigs(ParsingConfiguration value);

  /**
   * Returns the value of the '<em><b>Products</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Products</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Products</em>' containment reference.
   * @see #setProducts(ScopingProducts)
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getDefault_Products()
   * @model containment="true"
   * @generated
   */
  ScopingProducts getProducts();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.variCell.Default#getProducts <em>Products</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Products</em>' containment reference.
   * @see #getProducts()
   * @generated
   */
  void setProducts(ScopingProducts value);

} // Default
