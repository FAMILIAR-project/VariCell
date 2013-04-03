/**
 */
package org.xtext.example.mydsl.variCell;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Syntactical Interpretation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.variCell.SyntacticalInterpretation#getOpt <em>Opt</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.SyntacticalInterpretation#getYes <em>Yes</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.SyntacticalInterpretation#getNo <em>No</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.SyntacticalInterpretation#getNa <em>Na</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.variCell.VariCellPackage#getSyntacticalInterpretation()
 * @model
 * @generated
 */
public interface SyntacticalInterpretation extends EObject
{
  /**
   * Returns the value of the '<em><b>Opt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Opt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Opt</em>' containment reference.
   * @see #setOpt(Optional)
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getSyntacticalInterpretation_Opt()
   * @model containment="true"
   * @generated
   */
  Optional getOpt();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.variCell.SyntacticalInterpretation#getOpt <em>Opt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opt</em>' containment reference.
   * @see #getOpt()
   * @generated
   */
  void setOpt(Optional value);

  /**
   * Returns the value of the '<em><b>Yes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Yes</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Yes</em>' containment reference.
   * @see #setYes(Mandatory)
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getSyntacticalInterpretation_Yes()
   * @model containment="true"
   * @generated
   */
  Mandatory getYes();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.variCell.SyntacticalInterpretation#getYes <em>Yes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Yes</em>' containment reference.
   * @see #getYes()
   * @generated
   */
  void setYes(Mandatory value);

  /**
   * Returns the value of the '<em><b>No</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>No</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>No</em>' containment reference.
   * @see #setNo(NotPresent)
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getSyntacticalInterpretation_No()
   * @model containment="true"
   * @generated
   */
  NotPresent getNo();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.variCell.SyntacticalInterpretation#getNo <em>No</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>No</em>' containment reference.
   * @see #getNo()
   * @generated
   */
  void setNo(NotPresent value);

  /**
   * Returns the value of the '<em><b>Na</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Na</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Na</em>' containment reference.
   * @see #setNa(Unknown)
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getSyntacticalInterpretation_Na()
   * @model containment="true"
   * @generated
   */
  Unknown getNa();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.variCell.SyntacticalInterpretation#getNa <em>Na</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Na</em>' containment reference.
   * @see #getNa()
   * @generated
   */
  void setNa(Unknown value);

} // SyntacticalInterpretation
