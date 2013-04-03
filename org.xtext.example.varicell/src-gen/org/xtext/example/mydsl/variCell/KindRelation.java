/**
 */
package org.xtext.example.mydsl.variCell;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Kind Relation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.variCell.VariCellPackage#getKindRelation()
 * @model
 * @generated
 */
public enum KindRelation implements Enumerator
{
  /**
   * The '<em><b>BELOW</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BELOW_VALUE
   * @generated
   * @ordered
   */
  BELOW(0, "BELOW", "below"),

  /**
   * The '<em><b>ABOVE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ABOVE_VALUE
   * @generated
   * @ordered
   */
  ABOVE(1, "ABOVE", "above"),

  /**
   * The '<em><b>MOVE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MOVE_VALUE
   * @generated
   * @ordered
   */
  MOVE(2, "MOVE", "moveIn"),

  /**
   * The '<em><b>COPY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COPY_VALUE
   * @generated
   * @ordered
   */
  COPY(3, "COPY", "copyIn");

  /**
   * The '<em><b>BELOW</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>BELOW</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BELOW
   * @model literal="below"
   * @generated
   * @ordered
   */
  public static final int BELOW_VALUE = 0;

  /**
   * The '<em><b>ABOVE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ABOVE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ABOVE
   * @model literal="above"
   * @generated
   * @ordered
   */
  public static final int ABOVE_VALUE = 1;

  /**
   * The '<em><b>MOVE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MOVE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MOVE
   * @model literal="moveIn"
   * @generated
   * @ordered
   */
  public static final int MOVE_VALUE = 2;

  /**
   * The '<em><b>COPY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>COPY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #COPY
   * @model literal="copyIn"
   * @generated
   * @ordered
   */
  public static final int COPY_VALUE = 3;

  /**
   * An array of all the '<em><b>Kind Relation</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final KindRelation[] VALUES_ARRAY =
    new KindRelation[]
    {
      BELOW,
      ABOVE,
      MOVE,
      COPY,
    };

  /**
   * A public read-only list of all the '<em><b>Kind Relation</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<KindRelation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Kind Relation</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static KindRelation get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      KindRelation result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Kind Relation</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static KindRelation getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      KindRelation result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Kind Relation</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static KindRelation get(int value)
  {
    switch (value)
    {
      case BELOW_VALUE: return BELOW;
      case ABOVE_VALUE: return ABOVE;
      case MOVE_VALUE: return MOVE;
      case COPY_VALUE: return COPY;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private KindRelation(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //KindRelation
