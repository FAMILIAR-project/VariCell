/**
 */
package org.xtext.example.mydsl.variCell;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parsing Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.variCell.ParsingConfiguration#getProductID <em>Product ID</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.ParsingConfiguration#getFormat <em>Format</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.ParsingConfiguration#getSinterpret <em>Sinterpret</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.ParsingConfiguration#getSeparator <em>Separator</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.ParsingConfiguration#getMseparator <em>Mseparator</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.variCell.VariCellPackage#getParsingConfiguration()
 * @model
 * @generated
 */
public interface ParsingConfiguration extends EObject
{
  /**
   * Returns the value of the '<em><b>Product ID</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Product ID</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Product ID</em>' containment reference.
   * @see #setProductID(Key)
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getParsingConfiguration_ProductID()
   * @model containment="true"
   * @generated
   */
  Key getProductID();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.variCell.ParsingConfiguration#getProductID <em>Product ID</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Product ID</em>' containment reference.
   * @see #getProductID()
   * @generated
   */
  void setProductID(Key value);

  /**
   * Returns the value of the '<em><b>Format</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Format</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Format</em>' containment reference.
   * @see #setFormat(FormatSpecification)
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getParsingConfiguration_Format()
   * @model containment="true"
   * @generated
   */
  FormatSpecification getFormat();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.variCell.ParsingConfiguration#getFormat <em>Format</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Format</em>' containment reference.
   * @see #getFormat()
   * @generated
   */
  void setFormat(FormatSpecification value);

  /**
   * Returns the value of the '<em><b>Sinterpret</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sinterpret</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sinterpret</em>' containment reference.
   * @see #setSinterpret(SyntacticalInterpretation)
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getParsingConfiguration_Sinterpret()
   * @model containment="true"
   * @generated
   */
  SyntacticalInterpretation getSinterpret();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.variCell.ParsingConfiguration#getSinterpret <em>Sinterpret</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sinterpret</em>' containment reference.
   * @see #getSinterpret()
   * @generated
   */
  void setSinterpret(SyntacticalInterpretation value);

  /**
   * Returns the value of the '<em><b>Separator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Separator</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Separator</em>' containment reference.
   * @see #setSeparator(CSVSeparator)
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getParsingConfiguration_Separator()
   * @model containment="true"
   * @generated
   */
  CSVSeparator getSeparator();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.variCell.ParsingConfiguration#getSeparator <em>Separator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Separator</em>' containment reference.
   * @see #getSeparator()
   * @generated
   */
  void setSeparator(CSVSeparator value);

  /**
   * Returns the value of the '<em><b>Mseparator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mseparator</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mseparator</em>' containment reference.
   * @see #setMseparator(CSVMultiSeparator)
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getParsingConfiguration_Mseparator()
   * @model containment="true"
   * @generated
   */
  CSVMultiSeparator getMseparator();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.variCell.ParsingConfiguration#getMseparator <em>Mseparator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mseparator</em>' containment reference.
   * @see #getMseparator()
   * @generated
   */
  void setMseparator(CSVMultiSeparator value);

} // ParsingConfiguration
