/**
 */
package org.xtext.example.mydsl.variCell;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>And expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.variCell.And_expr#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.variCell.And_expr#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.variCell.VariCellPackage#getAnd_expr()
 * @model
 * @generated
 */
public interface And_expr extends IExpression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(IExpression)
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getAnd_expr_Left()
   * @model containment="true"
   * @generated
   */
  IExpression getLeft();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.variCell.And_expr#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(IExpression value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(IExpression)
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getAnd_expr_Right()
   * @model containment="true"
   * @generated
   */
  IExpression getRight();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.variCell.And_expr#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(IExpression value);

} // And_expr
