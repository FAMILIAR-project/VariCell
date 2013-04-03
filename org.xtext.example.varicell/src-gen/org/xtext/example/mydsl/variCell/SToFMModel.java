/**
 */
package org.xtext.example.mydsl.variCell;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>STo FM Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.variCell.SToFMModel#getImportViews <em>Import Views</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.SToFMModel#getSplName <em>Spl Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.SToFMModel#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.SToFMModel#getDefault <em>Default</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.SToFMModel#getScoping <em>Scoping</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.variCell.VariCellPackage#getSToFMModel()
 * @model
 * @generated
 */
public interface SToFMModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Import Views</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Import Views</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import Views</em>' containment reference.
   * @see #setImportViews(ImportViews)
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getSToFMModel_ImportViews()
   * @model containment="true"
   * @generated
   */
  ImportViews getImportViews();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.variCell.SToFMModel#getImportViews <em>Import Views</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Import Views</em>' containment reference.
   * @see #getImportViews()
   * @generated
   */
  void setImportViews(ImportViews value);

  /**
   * Returns the value of the '<em><b>Spl Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Spl Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Spl Name</em>' containment reference.
   * @see #setSplName(SPLName)
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getSToFMModel_SplName()
   * @model containment="true"
   * @generated
   */
  SPLName getSplName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.variCell.SToFMModel#getSplName <em>Spl Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Spl Name</em>' containment reference.
   * @see #getSplName()
   * @generated
   */
  void setSplName(SPLName value);

  /**
   * Returns the value of the '<em><b>Schema</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Schema</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Schema</em>' containment reference.
   * @see #setSchema(StructuringInformation)
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getSToFMModel_Schema()
   * @model containment="true"
   * @generated
   */
  StructuringInformation getSchema();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.variCell.SToFMModel#getSchema <em>Schema</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Schema</em>' containment reference.
   * @see #getSchema()
   * @generated
   */
  void setSchema(StructuringInformation value);

  /**
   * Returns the value of the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default</em>' containment reference.
   * @see #setDefault(Default)
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getSToFMModel_Default()
   * @model containment="true"
   * @generated
   */
  Default getDefault();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.variCell.SToFMModel#getDefault <em>Default</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default</em>' containment reference.
   * @see #getDefault()
   * @generated
   */
  void setDefault(Default value);

  /**
   * Returns the value of the '<em><b>Scoping</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.variCell.ScopingView}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scoping</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scoping</em>' containment reference list.
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getSToFMModel_Scoping()
   * @model containment="true"
   * @generated
   */
  EList<ScopingView> getScoping();

} // SToFMModel
