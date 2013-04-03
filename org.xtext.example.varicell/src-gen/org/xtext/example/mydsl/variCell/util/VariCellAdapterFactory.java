/**
 */
package org.xtext.example.mydsl.variCell.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.xtext.example.mydsl.variCell.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.variCell.VariCellPackage
 * @generated
 */
public class VariCellAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static VariCellPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariCellAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = VariCellPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariCellSwitch<Adapter> modelSwitch =
    new VariCellSwitch<Adapter>()
    {
      @Override
      public Adapter caseSToFMModel(SToFMModel object)
      {
        return createSToFMModelAdapter();
      }
      @Override
      public Adapter caseImportViews(ImportViews object)
      {
        return createImportViewsAdapter();
      }
      @Override
      public Adapter caseDataView(DataView object)
      {
        return createDataViewAdapter();
      }
      @Override
      public Adapter caseSPLName(SPLName object)
      {
        return createSPLNameAdapter();
      }
      @Override
      public Adapter caseStructuringInformation(StructuringInformation object)
      {
        return createStructuringInformationAdapter();
      }
      @Override
      public Adapter caseItemRelation(ItemRelation object)
      {
        return createItemRelationAdapter();
      }
      @Override
      public Adapter caseItemGeneralization(ItemGeneralization object)
      {
        return createItemGeneralizationAdapter();
      }
      @Override
      public Adapter caseItemMapping(ItemMapping object)
      {
        return createItemMappingAdapter();
      }
      @Override
      public Adapter casePredicateItem(PredicateItem object)
      {
        return createPredicateItemAdapter();
      }
      @Override
      public Adapter caseIExpression(IExpression object)
      {
        return createIExpressionAdapter();
      }
      @Override
      public Adapter caseNeg_expr(Neg_expr object)
      {
        return createNeg_exprAdapter();
      }
      @Override
      public Adapter caseDefault(Default object)
      {
        return createDefaultAdapter();
      }
      @Override
      public Adapter caseParsingConfiguration(ParsingConfiguration object)
      {
        return createParsingConfigurationAdapter();
      }
      @Override
      public Adapter caseFormatSpecification(FormatSpecification object)
      {
        return createFormatSpecificationAdapter();
      }
      @Override
      public Adapter caseSyntacticalInterpretation(SyntacticalInterpretation object)
      {
        return createSyntacticalInterpretationAdapter();
      }
      @Override
      public Adapter caseKey(Key object)
      {
        return createKeyAdapter();
      }
      @Override
      public Adapter caseCSVSeparator(CSVSeparator object)
      {
        return createCSVSeparatorAdapter();
      }
      @Override
      public Adapter caseCSVMultiSeparator(CSVMultiSeparator object)
      {
        return createCSVMultiSeparatorAdapter();
      }
      @Override
      public Adapter caseOptional(Optional object)
      {
        return createOptionalAdapter();
      }
      @Override
      public Adapter caseMandatory(Mandatory object)
      {
        return createMandatoryAdapter();
      }
      @Override
      public Adapter caseNotPresent(NotPresent object)
      {
        return createNotPresentAdapter();
      }
      @Override
      public Adapter caseUnknown(Unknown object)
      {
        return createUnknownAdapter();
      }
      @Override
      public Adapter caseScopingView(ScopingView object)
      {
        return createScopingViewAdapter();
      }
      @Override
      public Adapter caseViewName(ViewName object)
      {
        return createViewNameAdapter();
      }
      @Override
      public Adapter caseScopingProducts(ScopingProducts object)
      {
        return createScopingProductsAdapter();
      }
      @Override
      public Adapter caseScopingFeatures(ScopingFeatures object)
      {
        return createScopingFeaturesAdapter();
      }
      @Override
      public Adapter caseFeatureInclusionExclusion(FeatureInclusionExclusion object)
      {
        return createFeatureInclusionExclusionAdapter();
      }
      @Override
      public Adapter caseExceptFeature(ExceptFeature object)
      {
        return createExceptFeatureAdapter();
      }
      @Override
      public Adapter caseOnlyFeature(OnlyFeature object)
      {
        return createOnlyFeatureAdapter();
      }
      @Override
      public Adapter caseProductInclusionExclusion(ProductInclusionExclusion object)
      {
        return createProductInclusionExclusionAdapter();
      }
      @Override
      public Adapter caseExceptProduct(ExceptProduct object)
      {
        return createExceptProductAdapter();
      }
      @Override
      public Adapter caseOnlyProduct(OnlyProduct object)
      {
        return createOnlyProductAdapter();
      }
      @Override
      public Adapter caseRewriting(Rewriting object)
      {
        return createRewritingAdapter();
      }
      @Override
      public Adapter caseMultiValuesInterpretation(MultiValuesInterpretation object)
      {
        return createMultiValuesInterpretationAdapter();
      }
      @Override
      public Adapter caseMultiValueInterpretation(MultiValueInterpretation object)
      {
        return createMultiValueInterpretationAdapter();
      }
      @Override
      public Adapter caseOr_expr(Or_expr object)
      {
        return createOr_exprAdapter();
      }
      @Override
      public Adapter caseAnd_expr(And_expr object)
      {
        return createAnd_exprAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.variCell.SToFMModel <em>STo FM Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.variCell.SToFMModel
   * @generated
   */
  public Adapter createSToFMModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.variCell.ImportViews <em>Import Views</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.variCell.ImportViews
   * @generated
   */
  public Adapter createImportViewsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.variCell.DataView <em>Data View</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.variCell.DataView
   * @generated
   */
  public Adapter createDataViewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.variCell.SPLName <em>SPL Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.variCell.SPLName
   * @generated
   */
  public Adapter createSPLNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.variCell.StructuringInformation <em>Structuring Information</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.variCell.StructuringInformation
   * @generated
   */
  public Adapter createStructuringInformationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.variCell.ItemRelation <em>Item Relation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.variCell.ItemRelation
   * @generated
   */
  public Adapter createItemRelationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.variCell.ItemGeneralization <em>Item Generalization</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.variCell.ItemGeneralization
   * @generated
   */
  public Adapter createItemGeneralizationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.variCell.ItemMapping <em>Item Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.variCell.ItemMapping
   * @generated
   */
  public Adapter createItemMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.variCell.PredicateItem <em>Predicate Item</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.variCell.PredicateItem
   * @generated
   */
  public Adapter createPredicateItemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.variCell.IExpression <em>IExpression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.variCell.IExpression
   * @generated
   */
  public Adapter createIExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.variCell.Neg_expr <em>Neg expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.variCell.Neg_expr
   * @generated
   */
  public Adapter createNeg_exprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.variCell.Default <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.variCell.Default
   * @generated
   */
  public Adapter createDefaultAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.variCell.ParsingConfiguration <em>Parsing Configuration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.variCell.ParsingConfiguration
   * @generated
   */
  public Adapter createParsingConfigurationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.variCell.FormatSpecification <em>Format Specification</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.variCell.FormatSpecification
   * @generated
   */
  public Adapter createFormatSpecificationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.variCell.SyntacticalInterpretation <em>Syntactical Interpretation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.variCell.SyntacticalInterpretation
   * @generated
   */
  public Adapter createSyntacticalInterpretationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.variCell.Key <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.variCell.Key
   * @generated
   */
  public Adapter createKeyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.variCell.CSVSeparator <em>CSV Separator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.variCell.CSVSeparator
   * @generated
   */
  public Adapter createCSVSeparatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.variCell.CSVMultiSeparator <em>CSV Multi Separator</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.variCell.CSVMultiSeparator
   * @generated
   */
  public Adapter createCSVMultiSeparatorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.variCell.Optional <em>Optional</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.variCell.Optional
   * @generated
   */
  public Adapter createOptionalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.variCell.Mandatory <em>Mandatory</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.variCell.Mandatory
   * @generated
   */
  public Adapter createMandatoryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.variCell.NotPresent <em>Not Present</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.variCell.NotPresent
   * @generated
   */
  public Adapter createNotPresentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.variCell.Unknown <em>Unknown</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.variCell.Unknown
   * @generated
   */
  public Adapter createUnknownAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.variCell.ScopingView <em>Scoping View</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.variCell.ScopingView
   * @generated
   */
  public Adapter createScopingViewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.variCell.ViewName <em>View Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.variCell.ViewName
   * @generated
   */
  public Adapter createViewNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.variCell.ScopingProducts <em>Scoping Products</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.variCell.ScopingProducts
   * @generated
   */
  public Adapter createScopingProductsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.variCell.ScopingFeatures <em>Scoping Features</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.variCell.ScopingFeatures
   * @generated
   */
  public Adapter createScopingFeaturesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.variCell.FeatureInclusionExclusion <em>Feature Inclusion Exclusion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.variCell.FeatureInclusionExclusion
   * @generated
   */
  public Adapter createFeatureInclusionExclusionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.variCell.ExceptFeature <em>Except Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.variCell.ExceptFeature
   * @generated
   */
  public Adapter createExceptFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.variCell.OnlyFeature <em>Only Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.variCell.OnlyFeature
   * @generated
   */
  public Adapter createOnlyFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.variCell.ProductInclusionExclusion <em>Product Inclusion Exclusion</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.variCell.ProductInclusionExclusion
   * @generated
   */
  public Adapter createProductInclusionExclusionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.variCell.ExceptProduct <em>Except Product</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.variCell.ExceptProduct
   * @generated
   */
  public Adapter createExceptProductAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.variCell.OnlyProduct <em>Only Product</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.variCell.OnlyProduct
   * @generated
   */
  public Adapter createOnlyProductAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.variCell.Rewriting <em>Rewriting</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.variCell.Rewriting
   * @generated
   */
  public Adapter createRewritingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.variCell.MultiValuesInterpretation <em>Multi Values Interpretation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.variCell.MultiValuesInterpretation
   * @generated
   */
  public Adapter createMultiValuesInterpretationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.variCell.MultiValueInterpretation <em>Multi Value Interpretation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.variCell.MultiValueInterpretation
   * @generated
   */
  public Adapter createMultiValueInterpretationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.variCell.Or_expr <em>Or expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.variCell.Or_expr
   * @generated
   */
  public Adapter createOr_exprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.xtext.example.mydsl.variCell.And_expr <em>And expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.xtext.example.mydsl.variCell.And_expr
   * @generated
   */
  public Adapter createAnd_exprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //VariCellAdapterFactory
