/**
 */
package org.xtext.example.mydsl.variCell.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl.variCell.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VariCellFactoryImpl extends EFactoryImpl implements VariCellFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static VariCellFactory init()
  {
    try
    {
      VariCellFactory theVariCellFactory = (VariCellFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.xtext.org/example/mydsl/VariCell"); 
      if (theVariCellFactory != null)
      {
        return theVariCellFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new VariCellFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariCellFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case VariCellPackage.STO_FM_MODEL: return createSToFMModel();
      case VariCellPackage.IMPORT_VIEWS: return createImportViews();
      case VariCellPackage.DATA_VIEW: return createDataView();
      case VariCellPackage.SPL_NAME: return createSPLName();
      case VariCellPackage.STRUCTURING_INFORMATION: return createStructuringInformation();
      case VariCellPackage.ITEM_RELATION: return createItemRelation();
      case VariCellPackage.ITEM_GENERALIZATION: return createItemGeneralization();
      case VariCellPackage.ITEM_MAPPING: return createItemMapping();
      case VariCellPackage.PREDICATE_ITEM: return createPredicateItem();
      case VariCellPackage.IEXPRESSION: return createIExpression();
      case VariCellPackage.NEG_EXPR: return createNeg_expr();
      case VariCellPackage.DEFAULT: return createDefault();
      case VariCellPackage.PARSING_CONFIGURATION: return createParsingConfiguration();
      case VariCellPackage.FORMAT_SPECIFICATION: return createFormatSpecification();
      case VariCellPackage.SYNTACTICAL_INTERPRETATION: return createSyntacticalInterpretation();
      case VariCellPackage.KEY: return createKey();
      case VariCellPackage.CSV_SEPARATOR: return createCSVSeparator();
      case VariCellPackage.CSV_MULTI_SEPARATOR: return createCSVMultiSeparator();
      case VariCellPackage.OPTIONAL: return createOptional();
      case VariCellPackage.MANDATORY: return createMandatory();
      case VariCellPackage.NOT_PRESENT: return createNotPresent();
      case VariCellPackage.UNKNOWN: return createUnknown();
      case VariCellPackage.SCOPING_VIEW: return createScopingView();
      case VariCellPackage.VIEW_NAME: return createViewName();
      case VariCellPackage.SCOPING_PRODUCTS: return createScopingProducts();
      case VariCellPackage.SCOPING_FEATURES: return createScopingFeatures();
      case VariCellPackage.FEATURE_INCLUSION_EXCLUSION: return createFeatureInclusionExclusion();
      case VariCellPackage.EXCEPT_FEATURE: return createExceptFeature();
      case VariCellPackage.ONLY_FEATURE: return createOnlyFeature();
      case VariCellPackage.PRODUCT_INCLUSION_EXCLUSION: return createProductInclusionExclusion();
      case VariCellPackage.EXCEPT_PRODUCT: return createExceptProduct();
      case VariCellPackage.ONLY_PRODUCT: return createOnlyProduct();
      case VariCellPackage.REWRITING: return createRewriting();
      case VariCellPackage.MULTI_VALUES_INTERPRETATION: return createMultiValuesInterpretation();
      case VariCellPackage.MULTI_VALUE_INTERPRETATION: return createMultiValueInterpretation();
      case VariCellPackage.OR_EXPR: return createOr_expr();
      case VariCellPackage.AND_EXPR: return createAnd_expr();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case VariCellPackage.KIND_RELATION:
        return createKindRelationFromString(eDataType, initialValue);
      case VariCellPackage.FILE_FORMAT:
        return createFileFormatFromString(eDataType, initialValue);
      case VariCellPackage.VARIABILITY_INTERPRETATION:
        return createVariabilityInterpretationFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case VariCellPackage.KIND_RELATION:
        return convertKindRelationToString(eDataType, instanceValue);
      case VariCellPackage.FILE_FORMAT:
        return convertFileFormatToString(eDataType, instanceValue);
      case VariCellPackage.VARIABILITY_INTERPRETATION:
        return convertVariabilityInterpretationToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SToFMModel createSToFMModel()
  {
    SToFMModelImpl sToFMModel = new SToFMModelImpl();
    return sToFMModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportViews createImportViews()
  {
    ImportViewsImpl importViews = new ImportViewsImpl();
    return importViews;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataView createDataView()
  {
    DataViewImpl dataView = new DataViewImpl();
    return dataView;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SPLName createSPLName()
  {
    SPLNameImpl splName = new SPLNameImpl();
    return splName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructuringInformation createStructuringInformation()
  {
    StructuringInformationImpl structuringInformation = new StructuringInformationImpl();
    return structuringInformation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItemRelation createItemRelation()
  {
    ItemRelationImpl itemRelation = new ItemRelationImpl();
    return itemRelation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItemGeneralization createItemGeneralization()
  {
    ItemGeneralizationImpl itemGeneralization = new ItemGeneralizationImpl();
    return itemGeneralization;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ItemMapping createItemMapping()
  {
    ItemMappingImpl itemMapping = new ItemMappingImpl();
    return itemMapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PredicateItem createPredicateItem()
  {
    PredicateItemImpl predicateItem = new PredicateItemImpl();
    return predicateItem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IExpression createIExpression()
  {
    IExpressionImpl iExpression = new IExpressionImpl();
    return iExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Neg_expr createNeg_expr()
  {
    Neg_exprImpl neg_expr = new Neg_exprImpl();
    return neg_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Default createDefault()
  {
    DefaultImpl default_ = new DefaultImpl();
    return default_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParsingConfiguration createParsingConfiguration()
  {
    ParsingConfigurationImpl parsingConfiguration = new ParsingConfigurationImpl();
    return parsingConfiguration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FormatSpecification createFormatSpecification()
  {
    FormatSpecificationImpl formatSpecification = new FormatSpecificationImpl();
    return formatSpecification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SyntacticalInterpretation createSyntacticalInterpretation()
  {
    SyntacticalInterpretationImpl syntacticalInterpretation = new SyntacticalInterpretationImpl();
    return syntacticalInterpretation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Key createKey()
  {
    KeyImpl key = new KeyImpl();
    return key;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSVSeparator createCSVSeparator()
  {
    CSVSeparatorImpl csvSeparator = new CSVSeparatorImpl();
    return csvSeparator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSVMultiSeparator createCSVMultiSeparator()
  {
    CSVMultiSeparatorImpl csvMultiSeparator = new CSVMultiSeparatorImpl();
    return csvMultiSeparator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Optional createOptional()
  {
    OptionalImpl optional = new OptionalImpl();
    return optional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mandatory createMandatory()
  {
    MandatoryImpl mandatory = new MandatoryImpl();
    return mandatory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotPresent createNotPresent()
  {
    NotPresentImpl notPresent = new NotPresentImpl();
    return notPresent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Unknown createUnknown()
  {
    UnknownImpl unknown = new UnknownImpl();
    return unknown;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScopingView createScopingView()
  {
    ScopingViewImpl scopingView = new ScopingViewImpl();
    return scopingView;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ViewName createViewName()
  {
    ViewNameImpl viewName = new ViewNameImpl();
    return viewName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScopingProducts createScopingProducts()
  {
    ScopingProductsImpl scopingProducts = new ScopingProductsImpl();
    return scopingProducts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ScopingFeatures createScopingFeatures()
  {
    ScopingFeaturesImpl scopingFeatures = new ScopingFeaturesImpl();
    return scopingFeatures;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FeatureInclusionExclusion createFeatureInclusionExclusion()
  {
    FeatureInclusionExclusionImpl featureInclusionExclusion = new FeatureInclusionExclusionImpl();
    return featureInclusionExclusion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExceptFeature createExceptFeature()
  {
    ExceptFeatureImpl exceptFeature = new ExceptFeatureImpl();
    return exceptFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OnlyFeature createOnlyFeature()
  {
    OnlyFeatureImpl onlyFeature = new OnlyFeatureImpl();
    return onlyFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProductInclusionExclusion createProductInclusionExclusion()
  {
    ProductInclusionExclusionImpl productInclusionExclusion = new ProductInclusionExclusionImpl();
    return productInclusionExclusion;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExceptProduct createExceptProduct()
  {
    ExceptProductImpl exceptProduct = new ExceptProductImpl();
    return exceptProduct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OnlyProduct createOnlyProduct()
  {
    OnlyProductImpl onlyProduct = new OnlyProductImpl();
    return onlyProduct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rewriting createRewriting()
  {
    RewritingImpl rewriting = new RewritingImpl();
    return rewriting;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiValuesInterpretation createMultiValuesInterpretation()
  {
    MultiValuesInterpretationImpl multiValuesInterpretation = new MultiValuesInterpretationImpl();
    return multiValuesInterpretation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MultiValueInterpretation createMultiValueInterpretation()
  {
    MultiValueInterpretationImpl multiValueInterpretation = new MultiValueInterpretationImpl();
    return multiValueInterpretation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Or_expr createOr_expr()
  {
    Or_exprImpl or_expr = new Or_exprImpl();
    return or_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public And_expr createAnd_expr()
  {
    And_exprImpl and_expr = new And_exprImpl();
    return and_expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KindRelation createKindRelationFromString(EDataType eDataType, String initialValue)
  {
    KindRelation result = KindRelation.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertKindRelationToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FileFormat createFileFormatFromString(EDataType eDataType, String initialValue)
  {
    FileFormat result = FileFormat.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertFileFormatToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariabilityInterpretation createVariabilityInterpretationFromString(EDataType eDataType, String initialValue)
  {
    VariabilityInterpretation result = VariabilityInterpretation.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertVariabilityInterpretationToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariCellPackage getVariCellPackage()
  {
    return (VariCellPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static VariCellPackage getPackage()
  {
    return VariCellPackage.eINSTANCE;
  }

} //VariCellFactoryImpl
