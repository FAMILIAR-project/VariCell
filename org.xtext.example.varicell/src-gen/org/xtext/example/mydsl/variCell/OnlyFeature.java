/**
 */
package org.xtext.example.mydsl.variCell;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Only Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.variCell.OnlyFeature#getFts <em>Fts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.variCell.VariCellPackage#getOnlyFeature()
 * @model
 * @generated
 */
public interface OnlyFeature extends EObject
{
  /**
   * Returns the value of the '<em><b>Fts</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fts</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fts</em>' attribute list.
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getOnlyFeature_Fts()
   * @model unique="false"
   * @generated
   */
  EList<String> getFts();

} // OnlyFeature
