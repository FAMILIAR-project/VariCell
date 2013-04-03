/**
 */
package org.xtext.example.mydsl.variCell.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.example.mydsl.variCell.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.variCell.VariCellPackage
 * @generated
 */
public class VariCellSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static VariCellPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariCellSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = VariCellPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case VariCellPackage.STO_FM_MODEL:
      {
        SToFMModel sToFMModel = (SToFMModel)theEObject;
        T result = caseSToFMModel(sToFMModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VariCellPackage.IMPORT_VIEWS:
      {
        ImportViews importViews = (ImportViews)theEObject;
        T result = caseImportViews(importViews);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VariCellPackage.DATA_VIEW:
      {
        DataView dataView = (DataView)theEObject;
        T result = caseDataView(dataView);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VariCellPackage.SPL_NAME:
      {
        SPLName splName = (SPLName)theEObject;
        T result = caseSPLName(splName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VariCellPackage.STRUCTURING_INFORMATION:
      {
        StructuringInformation structuringInformation = (StructuringInformation)theEObject;
        T result = caseStructuringInformation(structuringInformation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VariCellPackage.ITEM_RELATION:
      {
        ItemRelation itemRelation = (ItemRelation)theEObject;
        T result = caseItemRelation(itemRelation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VariCellPackage.ITEM_GENERALIZATION:
      {
        ItemGeneralization itemGeneralization = (ItemGeneralization)theEObject;
        T result = caseItemGeneralization(itemGeneralization);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VariCellPackage.ITEM_MAPPING:
      {
        ItemMapping itemMapping = (ItemMapping)theEObject;
        T result = caseItemMapping(itemMapping);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VariCellPackage.PREDICATE_ITEM:
      {
        PredicateItem predicateItem = (PredicateItem)theEObject;
        T result = casePredicateItem(predicateItem);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VariCellPackage.IEXPRESSION:
      {
        IExpression iExpression = (IExpression)theEObject;
        T result = caseIExpression(iExpression);
        if (result == null) result = casePredicateItem(iExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VariCellPackage.NEG_EXPR:
      {
        Neg_expr neg_expr = (Neg_expr)theEObject;
        T result = caseNeg_expr(neg_expr);
        if (result == null) result = caseIExpression(neg_expr);
        if (result == null) result = casePredicateItem(neg_expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VariCellPackage.DEFAULT:
      {
        Default default_ = (Default)theEObject;
        T result = caseDefault(default_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VariCellPackage.PARSING_CONFIGURATION:
      {
        ParsingConfiguration parsingConfiguration = (ParsingConfiguration)theEObject;
        T result = caseParsingConfiguration(parsingConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VariCellPackage.FORMAT_SPECIFICATION:
      {
        FormatSpecification formatSpecification = (FormatSpecification)theEObject;
        T result = caseFormatSpecification(formatSpecification);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VariCellPackage.SYNTACTICAL_INTERPRETATION:
      {
        SyntacticalInterpretation syntacticalInterpretation = (SyntacticalInterpretation)theEObject;
        T result = caseSyntacticalInterpretation(syntacticalInterpretation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VariCellPackage.KEY:
      {
        Key key = (Key)theEObject;
        T result = caseKey(key);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VariCellPackage.CSV_SEPARATOR:
      {
        CSVSeparator csvSeparator = (CSVSeparator)theEObject;
        T result = caseCSVSeparator(csvSeparator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VariCellPackage.CSV_MULTI_SEPARATOR:
      {
        CSVMultiSeparator csvMultiSeparator = (CSVMultiSeparator)theEObject;
        T result = caseCSVMultiSeparator(csvMultiSeparator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VariCellPackage.OPTIONAL:
      {
        Optional optional = (Optional)theEObject;
        T result = caseOptional(optional);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VariCellPackage.MANDATORY:
      {
        Mandatory mandatory = (Mandatory)theEObject;
        T result = caseMandatory(mandatory);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VariCellPackage.NOT_PRESENT:
      {
        NotPresent notPresent = (NotPresent)theEObject;
        T result = caseNotPresent(notPresent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VariCellPackage.UNKNOWN:
      {
        Unknown unknown = (Unknown)theEObject;
        T result = caseUnknown(unknown);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VariCellPackage.SCOPING_VIEW:
      {
        ScopingView scopingView = (ScopingView)theEObject;
        T result = caseScopingView(scopingView);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VariCellPackage.VIEW_NAME:
      {
        ViewName viewName = (ViewName)theEObject;
        T result = caseViewName(viewName);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VariCellPackage.SCOPING_PRODUCTS:
      {
        ScopingProducts scopingProducts = (ScopingProducts)theEObject;
        T result = caseScopingProducts(scopingProducts);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VariCellPackage.SCOPING_FEATURES:
      {
        ScopingFeatures scopingFeatures = (ScopingFeatures)theEObject;
        T result = caseScopingFeatures(scopingFeatures);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VariCellPackage.FEATURE_INCLUSION_EXCLUSION:
      {
        FeatureInclusionExclusion featureInclusionExclusion = (FeatureInclusionExclusion)theEObject;
        T result = caseFeatureInclusionExclusion(featureInclusionExclusion);
        if (result == null) result = caseScopingFeatures(featureInclusionExclusion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VariCellPackage.EXCEPT_FEATURE:
      {
        ExceptFeature exceptFeature = (ExceptFeature)theEObject;
        T result = caseExceptFeature(exceptFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VariCellPackage.ONLY_FEATURE:
      {
        OnlyFeature onlyFeature = (OnlyFeature)theEObject;
        T result = caseOnlyFeature(onlyFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VariCellPackage.PRODUCT_INCLUSION_EXCLUSION:
      {
        ProductInclusionExclusion productInclusionExclusion = (ProductInclusionExclusion)theEObject;
        T result = caseProductInclusionExclusion(productInclusionExclusion);
        if (result == null) result = caseScopingProducts(productInclusionExclusion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VariCellPackage.EXCEPT_PRODUCT:
      {
        ExceptProduct exceptProduct = (ExceptProduct)theEObject;
        T result = caseExceptProduct(exceptProduct);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VariCellPackage.ONLY_PRODUCT:
      {
        OnlyProduct onlyProduct = (OnlyProduct)theEObject;
        T result = caseOnlyProduct(onlyProduct);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VariCellPackage.REWRITING:
      {
        Rewriting rewriting = (Rewriting)theEObject;
        T result = caseRewriting(rewriting);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VariCellPackage.MULTI_VALUES_INTERPRETATION:
      {
        MultiValuesInterpretation multiValuesInterpretation = (MultiValuesInterpretation)theEObject;
        T result = caseMultiValuesInterpretation(multiValuesInterpretation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VariCellPackage.MULTI_VALUE_INTERPRETATION:
      {
        MultiValueInterpretation multiValueInterpretation = (MultiValueInterpretation)theEObject;
        T result = caseMultiValueInterpretation(multiValueInterpretation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VariCellPackage.OR_EXPR:
      {
        Or_expr or_expr = (Or_expr)theEObject;
        T result = caseOr_expr(or_expr);
        if (result == null) result = caseIExpression(or_expr);
        if (result == null) result = casePredicateItem(or_expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VariCellPackage.AND_EXPR:
      {
        And_expr and_expr = (And_expr)theEObject;
        T result = caseAnd_expr(and_expr);
        if (result == null) result = caseIExpression(and_expr);
        if (result == null) result = casePredicateItem(and_expr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>STo FM Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>STo FM Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSToFMModel(SToFMModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import Views</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import Views</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImportViews(ImportViews object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data View</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataView(DataView object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SPL Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SPL Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSPLName(SPLName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Structuring Information</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Structuring Information</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStructuringInformation(StructuringInformation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Item Relation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Item Relation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseItemRelation(ItemRelation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Item Generalization</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Item Generalization</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseItemGeneralization(ItemGeneralization object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Item Mapping</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Item Mapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseItemMapping(ItemMapping object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Predicate Item</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Predicate Item</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePredicateItem(PredicateItem object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>IExpression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>IExpression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIExpression(IExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Neg expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Neg expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNeg_expr(Neg_expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Default</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Default</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefault(Default object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parsing Configuration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parsing Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParsingConfiguration(ParsingConfiguration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Format Specification</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Format Specification</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormatSpecification(FormatSpecification object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Syntactical Interpretation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Syntactical Interpretation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSyntacticalInterpretation(SyntacticalInterpretation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Key</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Key</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKey(Key object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CSV Separator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CSV Separator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCSVSeparator(CSVSeparator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CSV Multi Separator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CSV Multi Separator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCSVMultiSeparator(CSVMultiSeparator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Optional</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Optional</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOptional(Optional object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mandatory</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mandatory</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMandatory(Mandatory object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Not Present</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Not Present</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNotPresent(NotPresent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unknown</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unknown</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnknown(Unknown object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scoping View</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scoping View</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScopingView(ScopingView object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>View Name</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>View Name</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseViewName(ViewName object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scoping Products</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scoping Products</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScopingProducts(ScopingProducts object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Scoping Features</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Scoping Features</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScopingFeatures(ScopingFeatures object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Feature Inclusion Exclusion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Feature Inclusion Exclusion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFeatureInclusionExclusion(FeatureInclusionExclusion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Except Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Except Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExceptFeature(ExceptFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Only Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Only Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOnlyFeature(OnlyFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Product Inclusion Exclusion</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Product Inclusion Exclusion</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProductInclusionExclusion(ProductInclusionExclusion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Except Product</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Except Product</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExceptProduct(ExceptProduct object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Only Product</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Only Product</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOnlyProduct(OnlyProduct object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rewriting</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rewriting</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRewriting(Rewriting object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multi Values Interpretation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multi Values Interpretation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiValuesInterpretation(MultiValuesInterpretation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multi Value Interpretation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multi Value Interpretation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiValueInterpretation(MultiValueInterpretation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOr_expr(Or_expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnd_expr(And_expr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //VariCellSwitch
