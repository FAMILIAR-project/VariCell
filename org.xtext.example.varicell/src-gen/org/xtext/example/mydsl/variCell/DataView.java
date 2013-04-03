/**
 */
package org.xtext.example.mydsl.variCell;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.variCell.DataView#getFile <em>File</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.DataView#getViewname <em>Viewname</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.variCell.VariCellPackage#getDataView()
 * @model
 * @generated
 */
public interface DataView extends EObject
{
  /**
   * Returns the value of the '<em><b>File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>File</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>File</em>' attribute.
   * @see #setFile(String)
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getDataView_File()
   * @model
   * @generated
   */
  String getFile();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.variCell.DataView#getFile <em>File</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>File</em>' attribute.
   * @see #getFile()
   * @generated
   */
  void setFile(String value);

  /**
   * Returns the value of the '<em><b>Viewname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Viewname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Viewname</em>' attribute.
   * @see #setViewname(String)
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getDataView_Viewname()
   * @model
   * @generated
   */
  String getViewname();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.variCell.DataView#getViewname <em>Viewname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Viewname</em>' attribute.
   * @see #getViewname()
   * @generated
   */
  void setViewname(String value);

} // DataView
