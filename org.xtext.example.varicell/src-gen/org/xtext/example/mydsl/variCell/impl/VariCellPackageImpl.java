/**
 */
package org.xtext.example.mydsl.variCell.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.xtext.example.mydsl.variCell.And_expr;
import org.xtext.example.mydsl.variCell.CSVMultiSeparator;
import org.xtext.example.mydsl.variCell.CSVSeparator;
import org.xtext.example.mydsl.variCell.DataView;
import org.xtext.example.mydsl.variCell.Default;
import org.xtext.example.mydsl.variCell.ExceptFeature;
import org.xtext.example.mydsl.variCell.ExceptProduct;
import org.xtext.example.mydsl.variCell.FeatureInclusionExclusion;
import org.xtext.example.mydsl.variCell.FileFormat;
import org.xtext.example.mydsl.variCell.FormatSpecification;
import org.xtext.example.mydsl.variCell.IExpression;
import org.xtext.example.mydsl.variCell.ImportViews;
import org.xtext.example.mydsl.variCell.ItemGeneralization;
import org.xtext.example.mydsl.variCell.ItemMapping;
import org.xtext.example.mydsl.variCell.ItemRelation;
import org.xtext.example.mydsl.variCell.Key;
import org.xtext.example.mydsl.variCell.KindRelation;
import org.xtext.example.mydsl.variCell.Mandatory;
import org.xtext.example.mydsl.variCell.MultiValueInterpretation;
import org.xtext.example.mydsl.variCell.MultiValuesInterpretation;
import org.xtext.example.mydsl.variCell.Neg_expr;
import org.xtext.example.mydsl.variCell.NotPresent;
import org.xtext.example.mydsl.variCell.OnlyFeature;
import org.xtext.example.mydsl.variCell.OnlyProduct;
import org.xtext.example.mydsl.variCell.Optional;
import org.xtext.example.mydsl.variCell.Or_expr;
import org.xtext.example.mydsl.variCell.ParsingConfiguration;
import org.xtext.example.mydsl.variCell.PredicateItem;
import org.xtext.example.mydsl.variCell.ProductInclusionExclusion;
import org.xtext.example.mydsl.variCell.Rewriting;
import org.xtext.example.mydsl.variCell.SPLName;
import org.xtext.example.mydsl.variCell.SToFMModel;
import org.xtext.example.mydsl.variCell.ScopingFeatures;
import org.xtext.example.mydsl.variCell.ScopingProducts;
import org.xtext.example.mydsl.variCell.ScopingView;
import org.xtext.example.mydsl.variCell.StructuringInformation;
import org.xtext.example.mydsl.variCell.SyntacticalInterpretation;
import org.xtext.example.mydsl.variCell.Unknown;
import org.xtext.example.mydsl.variCell.VariCellFactory;
import org.xtext.example.mydsl.variCell.VariCellPackage;
import org.xtext.example.mydsl.variCell.VariabilityInterpretation;
import org.xtext.example.mydsl.variCell.ViewName;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VariCellPackageImpl extends EPackageImpl implements VariCellPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass sToFMModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importViewsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataViewEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass splNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass structuringInformationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass itemRelationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass itemGeneralizationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass itemMappingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass predicateItemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass iExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass neg_exprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass defaultEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parsingConfigurationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass formatSpecificationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass syntacticalInterpretationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass keyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass csvSeparatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass csvMultiSeparatorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass optionalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mandatoryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass notPresentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unknownEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scopingViewEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass viewNameEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scopingProductsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scopingFeaturesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass featureInclusionExclusionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exceptFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass onlyFeatureEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass productInclusionExclusionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exceptProductEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass onlyProductEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rewritingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiValuesInterpretationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass multiValueInterpretationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass or_exprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass and_exprEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum kindRelationEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum fileFormatEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum variabilityInterpretationEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.xtext.example.mydsl.variCell.VariCellPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private VariCellPackageImpl()
  {
    super(eNS_URI, VariCellFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link VariCellPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static VariCellPackage init()
  {
    if (isInited) return (VariCellPackage)EPackage.Registry.INSTANCE.getEPackage(VariCellPackage.eNS_URI);

    // Obtain or create and register package
    VariCellPackageImpl theVariCellPackage = (VariCellPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VariCellPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VariCellPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theVariCellPackage.createPackageContents();

    // Initialize created meta-data
    theVariCellPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theVariCellPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(VariCellPackage.eNS_URI, theVariCellPackage);
    return theVariCellPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSToFMModel()
  {
    return sToFMModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSToFMModel_ImportViews()
  {
    return (EReference)sToFMModelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSToFMModel_SplName()
  {
    return (EReference)sToFMModelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSToFMModel_Schema()
  {
    return (EReference)sToFMModelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSToFMModel_Default()
  {
    return (EReference)sToFMModelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSToFMModel_Scoping()
  {
    return (EReference)sToFMModelEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImportViews()
  {
    return importViewsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getImportViews_Views()
  {
    return (EReference)importViewsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataView()
  {
    return dataViewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataView_File()
  {
    return (EAttribute)dataViewEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataView_Viewname()
  {
    return (EAttribute)dataViewEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSPLName()
  {
    return splNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSPLName_Name()
  {
    return (EAttribute)splNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStructuringInformation()
  {
    return structuringInformationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStructuringInformation_Relations()
  {
    return (EReference)structuringInformationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStructuringInformation_Abstract()
  {
    return (EReference)structuringInformationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStructuringInformation_Mp()
  {
    return (EReference)structuringInformationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getItemRelation()
  {
    return itemRelationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getItemRelation_View1()
  {
    return (EAttribute)itemRelationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getItemRelation_Rel()
  {
    return (EAttribute)itemRelationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getItemRelation_View2()
  {
    return (EAttribute)itemRelationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getItemGeneralization()
  {
    return itemGeneralizationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getItemGeneralization_Generalize()
  {
    return (EAttribute)itemGeneralizationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getItemGeneralization_Views()
  {
    return (EAttribute)itemGeneralizationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getItemMapping()
  {
    return itemMappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getItemMapping_Item()
  {
    return (EAttribute)itemMappingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getItemMapping_Act()
  {
    return (EAttribute)itemMappingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getItemMapping_Pfts()
  {
    return (EReference)itemMappingEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPredicateItem()
  {
    return predicateItemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIExpression()
  {
    return iExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getIExpression_Name()
  {
    return (EAttribute)iExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNeg_expr()
  {
    return neg_exprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getNeg_expr_Expr()
  {
    return (EReference)neg_exprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefault()
  {
    return defaultEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDefault_Configs()
  {
    return (EReference)defaultEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDefault_Products()
  {
    return (EReference)defaultEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParsingConfiguration()
  {
    return parsingConfigurationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParsingConfiguration_ProductID()
  {
    return (EReference)parsingConfigurationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParsingConfiguration_Format()
  {
    return (EReference)parsingConfigurationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParsingConfiguration_Sinterpret()
  {
    return (EReference)parsingConfigurationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParsingConfiguration_Separator()
  {
    return (EReference)parsingConfigurationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParsingConfiguration_Mseparator()
  {
    return (EReference)parsingConfigurationEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFormatSpecification()
  {
    return formatSpecificationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFormatSpecification_Fileformat()
  {
    return (EAttribute)formatSpecificationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSyntacticalInterpretation()
  {
    return syntacticalInterpretationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSyntacticalInterpretation_Opt()
  {
    return (EReference)syntacticalInterpretationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSyntacticalInterpretation_Yes()
  {
    return (EReference)syntacticalInterpretationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSyntacticalInterpretation_No()
  {
    return (EReference)syntacticalInterpretationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSyntacticalInterpretation_Na()
  {
    return (EReference)syntacticalInterpretationEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKey()
  {
    return keyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKey_Cid()
  {
    return (EAttribute)keyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCSVSeparator()
  {
    return csvSeparatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCSVSeparator_Sep()
  {
    return (EAttribute)csvSeparatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCSVMultiSeparator()
  {
    return csvMultiSeparatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCSVMultiSeparator_Seps()
  {
    return (EAttribute)csvMultiSeparatorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOptional()
  {
    return optionalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOptional_Values()
  {
    return (EAttribute)optionalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMandatory()
  {
    return mandatoryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMandatory_Values()
  {
    return (EAttribute)mandatoryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNotPresent()
  {
    return notPresentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNotPresent_Values()
  {
    return (EAttribute)notPresentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnknown()
  {
    return unknownEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getUnknown_Values()
  {
    return (EAttribute)unknownEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScopingView()
  {
    return scopingViewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScopingView_View()
  {
    return (EAttribute)scopingViewEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScopingView_Viewname()
  {
    return (EReference)scopingViewEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScopingView_Schema()
  {
    return (EReference)scopingViewEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScopingView_Config()
  {
    return (EReference)scopingViewEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScopingView_Products()
  {
    return (EReference)scopingViewEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScopingView_Fts()
  {
    return (EReference)scopingViewEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScopingView_Alignment()
  {
    return (EReference)scopingViewEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScopingView_Interpretation()
  {
    return (EReference)scopingViewEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getViewName()
  {
    return viewNameEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getViewName_Name()
  {
    return (EAttribute)viewNameEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScopingProducts()
  {
    return scopingProductsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScopingFeatures()
  {
    return scopingFeaturesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFeatureInclusionExclusion()
  {
    return featureInclusionExclusionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeatureInclusionExclusion_Except()
  {
    return (EReference)featureInclusionExclusionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFeatureInclusionExclusion_Only()
  {
    return (EReference)featureInclusionExclusionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExceptFeature()
  {
    return exceptFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExceptFeature_Fts()
  {
    return (EAttribute)exceptFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOnlyFeature()
  {
    return onlyFeatureEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOnlyFeature_Fts()
  {
    return (EAttribute)onlyFeatureEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProductInclusionExclusion()
  {
    return productInclusionExclusionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProductInclusionExclusion_Except()
  {
    return (EReference)productInclusionExclusionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProductInclusionExclusion_Only()
  {
    return (EReference)productInclusionExclusionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExceptProduct()
  {
    return exceptProductEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExceptProduct_Pds()
  {
    return (EAttribute)exceptProductEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOnlyProduct()
  {
    return onlyProductEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOnlyProduct_Pds()
  {
    return (EAttribute)onlyProductEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRewriting()
  {
    return rewritingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRewriting_Oft()
  {
    return (EAttribute)rewritingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRewriting_Nft()
  {
    return (EAttribute)rewritingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultiValuesInterpretation()
  {
    return multiValuesInterpretationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMultiValuesInterpretation_Multi()
  {
    return (EReference)multiValuesInterpretationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMultiValueInterpretation()
  {
    return multiValueInterpretationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMultiValueInterpretation_Val()
  {
    return (EAttribute)multiValueInterpretationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMultiValueInterpretation_Variability()
  {
    return (EAttribute)multiValueInterpretationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOr_expr()
  {
    return or_exprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOr_expr_Left()
  {
    return (EReference)or_exprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOr_expr_Right()
  {
    return (EReference)or_exprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAnd_expr()
  {
    return and_exprEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnd_expr_Left()
  {
    return (EReference)and_exprEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAnd_expr_Right()
  {
    return (EReference)and_exprEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getKindRelation()
  {
    return kindRelationEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getFileFormat()
  {
    return fileFormatEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getVariabilityInterpretation()
  {
    return variabilityInterpretationEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariCellFactory getVariCellFactory()
  {
    return (VariCellFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    sToFMModelEClass = createEClass(STO_FM_MODEL);
    createEReference(sToFMModelEClass, STO_FM_MODEL__IMPORT_VIEWS);
    createEReference(sToFMModelEClass, STO_FM_MODEL__SPL_NAME);
    createEReference(sToFMModelEClass, STO_FM_MODEL__SCHEMA);
    createEReference(sToFMModelEClass, STO_FM_MODEL__DEFAULT);
    createEReference(sToFMModelEClass, STO_FM_MODEL__SCOPING);

    importViewsEClass = createEClass(IMPORT_VIEWS);
    createEReference(importViewsEClass, IMPORT_VIEWS__VIEWS);

    dataViewEClass = createEClass(DATA_VIEW);
    createEAttribute(dataViewEClass, DATA_VIEW__FILE);
    createEAttribute(dataViewEClass, DATA_VIEW__VIEWNAME);

    splNameEClass = createEClass(SPL_NAME);
    createEAttribute(splNameEClass, SPL_NAME__NAME);

    structuringInformationEClass = createEClass(STRUCTURING_INFORMATION);
    createEReference(structuringInformationEClass, STRUCTURING_INFORMATION__RELATIONS);
    createEReference(structuringInformationEClass, STRUCTURING_INFORMATION__ABSTRACT);
    createEReference(structuringInformationEClass, STRUCTURING_INFORMATION__MP);

    itemRelationEClass = createEClass(ITEM_RELATION);
    createEAttribute(itemRelationEClass, ITEM_RELATION__VIEW1);
    createEAttribute(itemRelationEClass, ITEM_RELATION__REL);
    createEAttribute(itemRelationEClass, ITEM_RELATION__VIEW2);

    itemGeneralizationEClass = createEClass(ITEM_GENERALIZATION);
    createEAttribute(itemGeneralizationEClass, ITEM_GENERALIZATION__GENERALIZE);
    createEAttribute(itemGeneralizationEClass, ITEM_GENERALIZATION__VIEWS);

    itemMappingEClass = createEClass(ITEM_MAPPING);
    createEAttribute(itemMappingEClass, ITEM_MAPPING__ITEM);
    createEAttribute(itemMappingEClass, ITEM_MAPPING__ACT);
    createEReference(itemMappingEClass, ITEM_MAPPING__PFTS);

    predicateItemEClass = createEClass(PREDICATE_ITEM);

    iExpressionEClass = createEClass(IEXPRESSION);
    createEAttribute(iExpressionEClass, IEXPRESSION__NAME);

    neg_exprEClass = createEClass(NEG_EXPR);
    createEReference(neg_exprEClass, NEG_EXPR__EXPR);

    defaultEClass = createEClass(DEFAULT);
    createEReference(defaultEClass, DEFAULT__CONFIGS);
    createEReference(defaultEClass, DEFAULT__PRODUCTS);

    parsingConfigurationEClass = createEClass(PARSING_CONFIGURATION);
    createEReference(parsingConfigurationEClass, PARSING_CONFIGURATION__PRODUCT_ID);
    createEReference(parsingConfigurationEClass, PARSING_CONFIGURATION__FORMAT);
    createEReference(parsingConfigurationEClass, PARSING_CONFIGURATION__SINTERPRET);
    createEReference(parsingConfigurationEClass, PARSING_CONFIGURATION__SEPARATOR);
    createEReference(parsingConfigurationEClass, PARSING_CONFIGURATION__MSEPARATOR);

    formatSpecificationEClass = createEClass(FORMAT_SPECIFICATION);
    createEAttribute(formatSpecificationEClass, FORMAT_SPECIFICATION__FILEFORMAT);

    syntacticalInterpretationEClass = createEClass(SYNTACTICAL_INTERPRETATION);
    createEReference(syntacticalInterpretationEClass, SYNTACTICAL_INTERPRETATION__OPT);
    createEReference(syntacticalInterpretationEClass, SYNTACTICAL_INTERPRETATION__YES);
    createEReference(syntacticalInterpretationEClass, SYNTACTICAL_INTERPRETATION__NO);
    createEReference(syntacticalInterpretationEClass, SYNTACTICAL_INTERPRETATION__NA);

    keyEClass = createEClass(KEY);
    createEAttribute(keyEClass, KEY__CID);

    csvSeparatorEClass = createEClass(CSV_SEPARATOR);
    createEAttribute(csvSeparatorEClass, CSV_SEPARATOR__SEP);

    csvMultiSeparatorEClass = createEClass(CSV_MULTI_SEPARATOR);
    createEAttribute(csvMultiSeparatorEClass, CSV_MULTI_SEPARATOR__SEPS);

    optionalEClass = createEClass(OPTIONAL);
    createEAttribute(optionalEClass, OPTIONAL__VALUES);

    mandatoryEClass = createEClass(MANDATORY);
    createEAttribute(mandatoryEClass, MANDATORY__VALUES);

    notPresentEClass = createEClass(NOT_PRESENT);
    createEAttribute(notPresentEClass, NOT_PRESENT__VALUES);

    unknownEClass = createEClass(UNKNOWN);
    createEAttribute(unknownEClass, UNKNOWN__VALUES);

    scopingViewEClass = createEClass(SCOPING_VIEW);
    createEAttribute(scopingViewEClass, SCOPING_VIEW__VIEW);
    createEReference(scopingViewEClass, SCOPING_VIEW__VIEWNAME);
    createEReference(scopingViewEClass, SCOPING_VIEW__SCHEMA);
    createEReference(scopingViewEClass, SCOPING_VIEW__CONFIG);
    createEReference(scopingViewEClass, SCOPING_VIEW__PRODUCTS);
    createEReference(scopingViewEClass, SCOPING_VIEW__FTS);
    createEReference(scopingViewEClass, SCOPING_VIEW__ALIGNMENT);
    createEReference(scopingViewEClass, SCOPING_VIEW__INTERPRETATION);

    viewNameEClass = createEClass(VIEW_NAME);
    createEAttribute(viewNameEClass, VIEW_NAME__NAME);

    scopingProductsEClass = createEClass(SCOPING_PRODUCTS);

    scopingFeaturesEClass = createEClass(SCOPING_FEATURES);

    featureInclusionExclusionEClass = createEClass(FEATURE_INCLUSION_EXCLUSION);
    createEReference(featureInclusionExclusionEClass, FEATURE_INCLUSION_EXCLUSION__EXCEPT);
    createEReference(featureInclusionExclusionEClass, FEATURE_INCLUSION_EXCLUSION__ONLY);

    exceptFeatureEClass = createEClass(EXCEPT_FEATURE);
    createEAttribute(exceptFeatureEClass, EXCEPT_FEATURE__FTS);

    onlyFeatureEClass = createEClass(ONLY_FEATURE);
    createEAttribute(onlyFeatureEClass, ONLY_FEATURE__FTS);

    productInclusionExclusionEClass = createEClass(PRODUCT_INCLUSION_EXCLUSION);
    createEReference(productInclusionExclusionEClass, PRODUCT_INCLUSION_EXCLUSION__EXCEPT);
    createEReference(productInclusionExclusionEClass, PRODUCT_INCLUSION_EXCLUSION__ONLY);

    exceptProductEClass = createEClass(EXCEPT_PRODUCT);
    createEAttribute(exceptProductEClass, EXCEPT_PRODUCT__PDS);

    onlyProductEClass = createEClass(ONLY_PRODUCT);
    createEAttribute(onlyProductEClass, ONLY_PRODUCT__PDS);

    rewritingEClass = createEClass(REWRITING);
    createEAttribute(rewritingEClass, REWRITING__OFT);
    createEAttribute(rewritingEClass, REWRITING__NFT);

    multiValuesInterpretationEClass = createEClass(MULTI_VALUES_INTERPRETATION);
    createEReference(multiValuesInterpretationEClass, MULTI_VALUES_INTERPRETATION__MULTI);

    multiValueInterpretationEClass = createEClass(MULTI_VALUE_INTERPRETATION);
    createEAttribute(multiValueInterpretationEClass, MULTI_VALUE_INTERPRETATION__VAL);
    createEAttribute(multiValueInterpretationEClass, MULTI_VALUE_INTERPRETATION__VARIABILITY);

    or_exprEClass = createEClass(OR_EXPR);
    createEReference(or_exprEClass, OR_EXPR__LEFT);
    createEReference(or_exprEClass, OR_EXPR__RIGHT);

    and_exprEClass = createEClass(AND_EXPR);
    createEReference(and_exprEClass, AND_EXPR__LEFT);
    createEReference(and_exprEClass, AND_EXPR__RIGHT);

    // Create enums
    kindRelationEEnum = createEEnum(KIND_RELATION);
    fileFormatEEnum = createEEnum(FILE_FORMAT);
    variabilityInterpretationEEnum = createEEnum(VARIABILITY_INTERPRETATION);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    iExpressionEClass.getESuperTypes().add(this.getPredicateItem());
    neg_exprEClass.getESuperTypes().add(this.getIExpression());
    featureInclusionExclusionEClass.getESuperTypes().add(this.getScopingFeatures());
    productInclusionExclusionEClass.getESuperTypes().add(this.getScopingProducts());
    or_exprEClass.getESuperTypes().add(this.getIExpression());
    and_exprEClass.getESuperTypes().add(this.getIExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(sToFMModelEClass, SToFMModel.class, "SToFMModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSToFMModel_ImportViews(), this.getImportViews(), null, "importViews", null, 0, 1, SToFMModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSToFMModel_SplName(), this.getSPLName(), null, "splName", null, 0, 1, SToFMModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSToFMModel_Schema(), this.getStructuringInformation(), null, "schema", null, 0, 1, SToFMModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSToFMModel_Default(), this.getDefault(), null, "default", null, 0, 1, SToFMModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSToFMModel_Scoping(), this.getScopingView(), null, "scoping", null, 0, -1, SToFMModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importViewsEClass, ImportViews.class, "ImportViews", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getImportViews_Views(), this.getDataView(), null, "views", null, 0, -1, ImportViews.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataViewEClass, DataView.class, "DataView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataView_File(), ecorePackage.getEString(), "file", null, 0, 1, DataView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDataView_Viewname(), ecorePackage.getEString(), "viewname", null, 0, 1, DataView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(splNameEClass, SPLName.class, "SPLName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSPLName_Name(), ecorePackage.getEString(), "name", null, 0, 1, SPLName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(structuringInformationEClass, StructuringInformation.class, "StructuringInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStructuringInformation_Relations(), this.getItemRelation(), null, "relations", null, 0, -1, StructuringInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStructuringInformation_Abstract(), this.getItemGeneralization(), null, "abstract", null, 0, -1, StructuringInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStructuringInformation_Mp(), this.getItemMapping(), null, "mp", null, 0, -1, StructuringInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(itemRelationEClass, ItemRelation.class, "ItemRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getItemRelation_View1(), ecorePackage.getEString(), "view1", null, 0, 1, ItemRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getItemRelation_Rel(), this.getKindRelation(), "rel", null, 0, 1, ItemRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getItemRelation_View2(), ecorePackage.getEString(), "view2", null, 0, 1, ItemRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(itemGeneralizationEClass, ItemGeneralization.class, "ItemGeneralization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getItemGeneralization_Generalize(), ecorePackage.getEString(), "generalize", null, 0, 1, ItemGeneralization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getItemGeneralization_Views(), ecorePackage.getEString(), "views", null, 0, -1, ItemGeneralization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(itemMappingEClass, ItemMapping.class, "ItemMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getItemMapping_Item(), ecorePackage.getEString(), "item", null, 0, 1, ItemMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getItemMapping_Act(), ecorePackage.getEString(), "act", null, 0, 1, ItemMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getItemMapping_Pfts(), this.getPredicateItem(), null, "pfts", null, 0, 1, ItemMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(predicateItemEClass, PredicateItem.class, "PredicateItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(iExpressionEClass, IExpression.class, "IExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIExpression_Name(), ecorePackage.getEString(), "name", null, 0, 1, IExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(neg_exprEClass, Neg_expr.class, "Neg_expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNeg_expr_Expr(), this.getIExpression(), null, "expr", null, 0, 1, Neg_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(defaultEClass, Default.class, "Default", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDefault_Configs(), this.getParsingConfiguration(), null, "configs", null, 0, 1, Default.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDefault_Products(), this.getScopingProducts(), null, "products", null, 0, 1, Default.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parsingConfigurationEClass, ParsingConfiguration.class, "ParsingConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParsingConfiguration_ProductID(), this.getKey(), null, "productID", null, 0, 1, ParsingConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParsingConfiguration_Format(), this.getFormatSpecification(), null, "format", null, 0, 1, ParsingConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParsingConfiguration_Sinterpret(), this.getSyntacticalInterpretation(), null, "sinterpret", null, 0, 1, ParsingConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParsingConfiguration_Separator(), this.getCSVSeparator(), null, "separator", null, 0, 1, ParsingConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getParsingConfiguration_Mseparator(), this.getCSVMultiSeparator(), null, "mseparator", null, 0, 1, ParsingConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(formatSpecificationEClass, FormatSpecification.class, "FormatSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFormatSpecification_Fileformat(), this.getFileFormat(), "fileformat", null, 0, 1, FormatSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(syntacticalInterpretationEClass, SyntacticalInterpretation.class, "SyntacticalInterpretation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSyntacticalInterpretation_Opt(), this.getOptional(), null, "opt", null, 0, 1, SyntacticalInterpretation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSyntacticalInterpretation_Yes(), this.getMandatory(), null, "yes", null, 0, 1, SyntacticalInterpretation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSyntacticalInterpretation_No(), this.getNotPresent(), null, "no", null, 0, 1, SyntacticalInterpretation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSyntacticalInterpretation_Na(), this.getUnknown(), null, "na", null, 0, 1, SyntacticalInterpretation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(keyEClass, Key.class, "Key", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getKey_Cid(), ecorePackage.getEString(), "cid", null, 0, -1, Key.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(csvSeparatorEClass, CSVSeparator.class, "CSVSeparator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCSVSeparator_Sep(), ecorePackage.getEString(), "sep", null, 0, 1, CSVSeparator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(csvMultiSeparatorEClass, CSVMultiSeparator.class, "CSVMultiSeparator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCSVMultiSeparator_Seps(), ecorePackage.getEString(), "seps", null, 0, -1, CSVMultiSeparator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(optionalEClass, Optional.class, "Optional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOptional_Values(), ecorePackage.getEString(), "values", null, 0, -1, Optional.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mandatoryEClass, Mandatory.class, "Mandatory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMandatory_Values(), ecorePackage.getEString(), "values", null, 0, -1, Mandatory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(notPresentEClass, NotPresent.class, "NotPresent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNotPresent_Values(), ecorePackage.getEString(), "values", null, 0, -1, NotPresent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(unknownEClass, Unknown.class, "Unknown", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getUnknown_Values(), ecorePackage.getEString(), "values", null, 0, -1, Unknown.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scopingViewEClass, ScopingView.class, "ScopingView", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getScopingView_View(), ecorePackage.getEString(), "view", null, 0, 1, ScopingView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScopingView_Viewname(), this.getViewName(), null, "viewname", null, 0, 1, ScopingView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScopingView_Schema(), this.getStructuringInformation(), null, "schema", null, 0, 1, ScopingView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScopingView_Config(), this.getParsingConfiguration(), null, "config", null, 0, 1, ScopingView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScopingView_Products(), this.getScopingProducts(), null, "products", null, 0, 1, ScopingView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScopingView_Fts(), this.getScopingFeatures(), null, "fts", null, 0, 1, ScopingView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScopingView_Alignment(), this.getRewriting(), null, "alignment", null, 0, 1, ScopingView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScopingView_Interpretation(), this.getMultiValuesInterpretation(), null, "interpretation", null, 0, 1, ScopingView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(viewNameEClass, ViewName.class, "ViewName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getViewName_Name(), ecorePackage.getEString(), "name", null, 0, 1, ViewName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scopingProductsEClass, ScopingProducts.class, "ScopingProducts", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(scopingFeaturesEClass, ScopingFeatures.class, "ScopingFeatures", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(featureInclusionExclusionEClass, FeatureInclusionExclusion.class, "FeatureInclusionExclusion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFeatureInclusionExclusion_Except(), this.getExceptFeature(), null, "except", null, 0, 1, FeatureInclusionExclusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFeatureInclusionExclusion_Only(), this.getOnlyFeature(), null, "only", null, 0, 1, FeatureInclusionExclusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exceptFeatureEClass, ExceptFeature.class, "ExceptFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExceptFeature_Fts(), ecorePackage.getEString(), "fts", null, 0, -1, ExceptFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(onlyFeatureEClass, OnlyFeature.class, "OnlyFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOnlyFeature_Fts(), ecorePackage.getEString(), "fts", null, 0, -1, OnlyFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(productInclusionExclusionEClass, ProductInclusionExclusion.class, "ProductInclusionExclusion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getProductInclusionExclusion_Except(), this.getExceptProduct(), null, "except", null, 0, 1, ProductInclusionExclusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProductInclusionExclusion_Only(), this.getOnlyProduct(), null, "only", null, 0, 1, ProductInclusionExclusion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exceptProductEClass, ExceptProduct.class, "ExceptProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExceptProduct_Pds(), ecorePackage.getEString(), "pds", null, 0, -1, ExceptProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(onlyProductEClass, OnlyProduct.class, "OnlyProduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOnlyProduct_Pds(), ecorePackage.getEString(), "pds", null, 0, -1, OnlyProduct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rewritingEClass, Rewriting.class, "Rewriting", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRewriting_Oft(), ecorePackage.getEString(), "oft", null, 0, 1, Rewriting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRewriting_Nft(), ecorePackage.getEString(), "nft", null, 0, 1, Rewriting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multiValuesInterpretationEClass, MultiValuesInterpretation.class, "MultiValuesInterpretation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMultiValuesInterpretation_Multi(), this.getMultiValueInterpretation(), null, "multi", null, 0, -1, MultiValuesInterpretation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(multiValueInterpretationEClass, MultiValueInterpretation.class, "MultiValueInterpretation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMultiValueInterpretation_Val(), ecorePackage.getEString(), "val", null, 0, 1, MultiValueInterpretation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMultiValueInterpretation_Variability(), this.getVariabilityInterpretation(), "variability", null, 0, 1, MultiValueInterpretation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(or_exprEClass, Or_expr.class, "Or_expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOr_expr_Left(), this.getIExpression(), null, "left", null, 0, 1, Or_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOr_expr_Right(), this.getIExpression(), null, "right", null, 0, 1, Or_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(and_exprEClass, And_expr.class, "And_expr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAnd_expr_Left(), this.getIExpression(), null, "left", null, 0, 1, And_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAnd_expr_Right(), this.getIExpression(), null, "right", null, 0, 1, And_expr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(kindRelationEEnum, KindRelation.class, "KindRelation");
    addEEnumLiteral(kindRelationEEnum, KindRelation.BELOW);
    addEEnumLiteral(kindRelationEEnum, KindRelation.ABOVE);
    addEEnumLiteral(kindRelationEEnum, KindRelation.MOVE);
    addEEnumLiteral(kindRelationEEnum, KindRelation.COPY);

    initEEnum(fileFormatEEnum, FileFormat.class, "FileFormat");
    addEEnumLiteral(fileFormatEEnum, FileFormat.CSV);
    addEEnumLiteral(fileFormatEEnum, FileFormat.RDF);
    addEEnumLiteral(fileFormatEEnum, FileFormat.XML);

    initEEnum(variabilityInterpretationEEnum, VariabilityInterpretation.class, "VariabilityInterpretation");
    addEEnumLiteral(variabilityInterpretationEEnum, VariabilityInterpretation.XOR);
    addEEnumLiteral(variabilityInterpretationEEnum, VariabilityInterpretation.OR);
    addEEnumLiteral(variabilityInterpretationEEnum, VariabilityInterpretation.OPT);
    addEEnumLiteral(variabilityInterpretationEEnum, VariabilityInterpretation.MAND);
    addEEnumLiteral(variabilityInterpretationEEnum, VariabilityInterpretation.CONCAT);

    // Create resource
    createResource(eNS_URI);
  }

} //VariCellPackageImpl
