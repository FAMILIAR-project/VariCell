/**
 */
package org.xtext.example.mydsl.variCell;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Neg expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.variCell.Neg_expr#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.variCell.VariCellPackage#getNeg_expr()
 * @model
 * @generated
 */
public interface Neg_expr extends IExpression
{
  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(IExpression)
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#getNeg_expr_Expr()
   * @model containment="true"
   * @generated
   */
  IExpression getExpr();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.variCell.Neg_expr#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(IExpression value);

} // Neg_expr
