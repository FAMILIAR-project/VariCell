/**
 */
package org.xtext.example.mydsl.variCell;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Format Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.variCell.FormatSpecification#getFileformat <em>Fileformat</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.variCell.VariCellPackage#getFormatSpecification()
 * @model
 * @generated
 */
public interface FormatSpecification extends EObject
{
  /**
   * Returns the value of the '<em><b>Fileformat</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.variCell.FileFormat}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fileformat</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fileformat</em>' attribute.
   * @see org.xtext.example.mydsl.variCell.FileFormat
   * @see #setFileformat(FileFormat)
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getFormatSpecification_Fileformat()
   * @model
   * @generated
   */
  FileFormat getFileformat();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.variCell.FormatSpecification#getFileformat <em>Fileformat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fileformat</em>' attribute.
   * @see org.xtext.example.mydsl.variCell.FileFormat
   * @see #getFileformat()
   * @generated
   */
  void setFileformat(FileFormat value);

} // FormatSpecification
