/**
 */
package org.xtext.example.mydsl.variCell;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scoping View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.variCell.ScopingView#getView <em>View</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.ScopingView#getViewname <em>Viewname</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.ScopingView#getSchema <em>Schema</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.ScopingView#getConfig <em>Config</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.ScopingView#getProducts <em>Products</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.ScopingView#getFts <em>Fts</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.ScopingView#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.ScopingView#getInterpretation <em>Interpretation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.variCell.VariCellPackage#getScopingView()
 * @model
 * @generated
 */
public interface ScopingView extends EObject
{
  /**
   * Returns the value of the '<em><b>View</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>View</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>View</em>' attribute.
   * @see #setView(String)
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getScopingView_View()
   * @model
   * @generated
   */
  String getView();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.variCell.ScopingView#getView <em>View</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>View</em>' attribute.
   * @see #getView()
   * @generated
   */
  void setView(String value);

  /**
   * Returns the value of the '<em><b>Viewname</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Viewname</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Viewname</em>' containment reference.
   * @see #setViewname(ViewName)
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getScopingView_Viewname()
   * @model containment="true"
   * @generated
   */
  ViewName getViewname();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.variCell.ScopingView#getViewname <em>Viewname</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Viewname</em>' containment reference.
   * @see #getViewname()
   * @generated
   */
  void setViewname(ViewName value);

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
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getScopingView_Schema()
   * @model containment="true"
   * @generated
   */
  StructuringInformation getSchema();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.variCell.ScopingView#getSchema <em>Schema</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Schema</em>' containment reference.
   * @see #getSchema()
   * @generated
   */
  void setSchema(StructuringInformation value);

  /**
   * Returns the value of the '<em><b>Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Config</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Config</em>' containment reference.
   * @see #setConfig(ParsingConfiguration)
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getScopingView_Config()
   * @model containment="true"
   * @generated
   */
  ParsingConfiguration getConfig();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.variCell.ScopingView#getConfig <em>Config</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Config</em>' containment reference.
   * @see #getConfig()
   * @generated
   */
  void setConfig(ParsingConfiguration value);

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
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getScopingView_Products()
   * @model containment="true"
   * @generated
   */
  ScopingProducts getProducts();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.variCell.ScopingView#getProducts <em>Products</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Products</em>' containment reference.
   * @see #getProducts()
   * @generated
   */
  void setProducts(ScopingProducts value);

  /**
   * Returns the value of the '<em><b>Fts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fts</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fts</em>' containment reference.
   * @see #setFts(ScopingFeatures)
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getScopingView_Fts()
   * @model containment="true"
   * @generated
   */
  ScopingFeatures getFts();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.variCell.ScopingView#getFts <em>Fts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fts</em>' containment reference.
   * @see #getFts()
   * @generated
   */
  void setFts(ScopingFeatures value);

  /**
   * Returns the value of the '<em><b>Alignment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alignment</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alignment</em>' containment reference.
   * @see #setAlignment(Rewriting)
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getScopingView_Alignment()
   * @model containment="true"
   * @generated
   */
  Rewriting getAlignment();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.variCell.ScopingView#getAlignment <em>Alignment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alignment</em>' containment reference.
   * @see #getAlignment()
   * @generated
   */
  void setAlignment(Rewriting value);

  /**
   * Returns the value of the '<em><b>Interpretation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interpretation</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interpretation</em>' containment reference.
   * @see #setInterpretation(MultiValuesInterpretation)
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getScopingView_Interpretation()
   * @model containment="true"
   * @generated
   */
  MultiValuesInterpretation getInterpretation();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.variCell.ScopingView#getInterpretation <em>Interpretation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interpretation</em>' containment reference.
   * @see #getInterpretation()
   * @generated
   */
  void setInterpretation(MultiValuesInterpretation value);

} // ScopingView
