/**
 */
package org.xtext.example.mydsl.variCell;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.variCell.VariCellFactory
 * @model kind="package"
 * @generated
 */
public interface VariCellPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "variCell";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/VariCell";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "variCell";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  VariCellPackage eINSTANCE = org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.variCell.impl.SToFMModelImpl <em>STo FM Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.variCell.impl.SToFMModelImpl
   * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getSToFMModel()
   * @generated
   */
  int STO_FM_MODEL = 0;

  /**
   * The feature id for the '<em><b>Import Views</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STO_FM_MODEL__IMPORT_VIEWS = 0;

  /**
   * The feature id for the '<em><b>Spl Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STO_FM_MODEL__SPL_NAME = 1;

  /**
   * The feature id for the '<em><b>Schema</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STO_FM_MODEL__SCHEMA = 2;

  /**
   * The feature id for the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STO_FM_MODEL__DEFAULT = 3;

  /**
   * The feature id for the '<em><b>Scoping</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STO_FM_MODEL__SCOPING = 4;

  /**
   * The number of structural features of the '<em>STo FM Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STO_FM_MODEL_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.variCell.impl.ImportViewsImpl <em>Import Views</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.variCell.impl.ImportViewsImpl
   * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getImportViews()
   * @generated
   */
  int IMPORT_VIEWS = 1;

  /**
   * The feature id for the '<em><b>Views</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_VIEWS__VIEWS = 0;

  /**
   * The number of structural features of the '<em>Import Views</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_VIEWS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.variCell.impl.DataViewImpl <em>Data View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.variCell.impl.DataViewImpl
   * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getDataView()
   * @generated
   */
  int DATA_VIEW = 2;

  /**
   * The feature id for the '<em><b>File</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_VIEW__FILE = 0;

  /**
   * The feature id for the '<em><b>Viewname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_VIEW__VIEWNAME = 1;

  /**
   * The number of structural features of the '<em>Data View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_VIEW_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.variCell.impl.SPLNameImpl <em>SPL Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.variCell.impl.SPLNameImpl
   * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getSPLName()
   * @generated
   */
  int SPL_NAME = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPL_NAME__NAME = 0;

  /**
   * The number of structural features of the '<em>SPL Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPL_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.variCell.impl.StructuringInformationImpl <em>Structuring Information</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.variCell.impl.StructuringInformationImpl
   * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getStructuringInformation()
   * @generated
   */
  int STRUCTURING_INFORMATION = 4;

  /**
   * The feature id for the '<em><b>Relations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURING_INFORMATION__RELATIONS = 0;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURING_INFORMATION__ABSTRACT = 1;

  /**
   * The feature id for the '<em><b>Mp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURING_INFORMATION__MP = 2;

  /**
   * The number of structural features of the '<em>Structuring Information</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURING_INFORMATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.variCell.impl.ItemRelationImpl <em>Item Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.variCell.impl.ItemRelationImpl
   * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getItemRelation()
   * @generated
   */
  int ITEM_RELATION = 5;

  /**
   * The feature id for the '<em><b>View1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_RELATION__VIEW1 = 0;

  /**
   * The feature id for the '<em><b>Rel</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_RELATION__REL = 1;

  /**
   * The feature id for the '<em><b>View2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_RELATION__VIEW2 = 2;

  /**
   * The number of structural features of the '<em>Item Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_RELATION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.variCell.impl.ItemGeneralizationImpl <em>Item Generalization</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.variCell.impl.ItemGeneralizationImpl
   * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getItemGeneralization()
   * @generated
   */
  int ITEM_GENERALIZATION = 6;

  /**
   * The feature id for the '<em><b>Generalize</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_GENERALIZATION__GENERALIZE = 0;

  /**
   * The feature id for the '<em><b>Views</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_GENERALIZATION__VIEWS = 1;

  /**
   * The number of structural features of the '<em>Item Generalization</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_GENERALIZATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.variCell.impl.ItemMappingImpl <em>Item Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.variCell.impl.ItemMappingImpl
   * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getItemMapping()
   * @generated
   */
  int ITEM_MAPPING = 7;

  /**
   * The feature id for the '<em><b>Item</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_MAPPING__ITEM = 0;

  /**
   * The feature id for the '<em><b>Act</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_MAPPING__ACT = 1;

  /**
   * The feature id for the '<em><b>Pfts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_MAPPING__PFTS = 2;

  /**
   * The number of structural features of the '<em>Item Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITEM_MAPPING_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.variCell.impl.PredicateItemImpl <em>Predicate Item</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.variCell.impl.PredicateItemImpl
   * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getPredicateItem()
   * @generated
   */
  int PREDICATE_ITEM = 8;

  /**
   * The number of structural features of the '<em>Predicate Item</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDICATE_ITEM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.variCell.impl.IExpressionImpl <em>IExpression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.variCell.impl.IExpressionImpl
   * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getIExpression()
   * @generated
   */
  int IEXPRESSION = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IEXPRESSION__NAME = PREDICATE_ITEM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>IExpression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IEXPRESSION_FEATURE_COUNT = PREDICATE_ITEM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.variCell.impl.Neg_exprImpl <em>Neg expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.variCell.impl.Neg_exprImpl
   * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getNeg_expr()
   * @generated
   */
  int NEG_EXPR = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEG_EXPR__NAME = IEXPRESSION__NAME;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEG_EXPR__EXPR = IEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Neg expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NEG_EXPR_FEATURE_COUNT = IEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.variCell.impl.DefaultImpl <em>Default</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.variCell.impl.DefaultImpl
   * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getDefault()
   * @generated
   */
  int DEFAULT = 11;

  /**
   * The feature id for the '<em><b>Configs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT__CONFIGS = 0;

  /**
   * The feature id for the '<em><b>Products</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT__PRODUCTS = 1;

  /**
   * The number of structural features of the '<em>Default</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.variCell.impl.ParsingConfigurationImpl <em>Parsing Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.variCell.impl.ParsingConfigurationImpl
   * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getParsingConfiguration()
   * @generated
   */
  int PARSING_CONFIGURATION = 12;

  /**
   * The feature id for the '<em><b>Product ID</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARSING_CONFIGURATION__PRODUCT_ID = 0;

  /**
   * The feature id for the '<em><b>Format</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARSING_CONFIGURATION__FORMAT = 1;

  /**
   * The feature id for the '<em><b>Sinterpret</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARSING_CONFIGURATION__SINTERPRET = 2;

  /**
   * The feature id for the '<em><b>Separator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARSING_CONFIGURATION__SEPARATOR = 3;

  /**
   * The feature id for the '<em><b>Mseparator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARSING_CONFIGURATION__MSEPARATOR = 4;

  /**
   * The number of structural features of the '<em>Parsing Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARSING_CONFIGURATION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.variCell.impl.FormatSpecificationImpl <em>Format Specification</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.variCell.impl.FormatSpecificationImpl
   * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getFormatSpecification()
   * @generated
   */
  int FORMAT_SPECIFICATION = 13;

  /**
   * The feature id for the '<em><b>Fileformat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAT_SPECIFICATION__FILEFORMAT = 0;

  /**
   * The number of structural features of the '<em>Format Specification</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORMAT_SPECIFICATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.variCell.impl.SyntacticalInterpretationImpl <em>Syntactical Interpretation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.variCell.impl.SyntacticalInterpretationImpl
   * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getSyntacticalInterpretation()
   * @generated
   */
  int SYNTACTICAL_INTERPRETATION = 14;

  /**
   * The feature id for the '<em><b>Opt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYNTACTICAL_INTERPRETATION__OPT = 0;

  /**
   * The feature id for the '<em><b>Yes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYNTACTICAL_INTERPRETATION__YES = 1;

  /**
   * The feature id for the '<em><b>No</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYNTACTICAL_INTERPRETATION__NO = 2;

  /**
   * The feature id for the '<em><b>Na</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYNTACTICAL_INTERPRETATION__NA = 3;

  /**
   * The number of structural features of the '<em>Syntactical Interpretation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYNTACTICAL_INTERPRETATION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.variCell.impl.KeyImpl <em>Key</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.variCell.impl.KeyImpl
   * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getKey()
   * @generated
   */
  int KEY = 15;

  /**
   * The feature id for the '<em><b>Cid</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY__CID = 0;

  /**
   * The number of structural features of the '<em>Key</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KEY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.variCell.impl.CSVSeparatorImpl <em>CSV Separator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.variCell.impl.CSVSeparatorImpl
   * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getCSVSeparator()
   * @generated
   */
  int CSV_SEPARATOR = 16;

  /**
   * The feature id for the '<em><b>Sep</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSV_SEPARATOR__SEP = 0;

  /**
   * The number of structural features of the '<em>CSV Separator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSV_SEPARATOR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.variCell.impl.CSVMultiSeparatorImpl <em>CSV Multi Separator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.variCell.impl.CSVMultiSeparatorImpl
   * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getCSVMultiSeparator()
   * @generated
   */
  int CSV_MULTI_SEPARATOR = 17;

  /**
   * The feature id for the '<em><b>Seps</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSV_MULTI_SEPARATOR__SEPS = 0;

  /**
   * The number of structural features of the '<em>CSV Multi Separator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSV_MULTI_SEPARATOR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.variCell.impl.OptionalImpl <em>Optional</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.variCell.impl.OptionalImpl
   * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getOptional()
   * @generated
   */
  int OPTIONAL = 18;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL__VALUES = 0;

  /**
   * The number of structural features of the '<em>Optional</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.variCell.impl.MandatoryImpl <em>Mandatory</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.variCell.impl.MandatoryImpl
   * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getMandatory()
   * @generated
   */
  int MANDATORY = 19;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY__VALUES = 0;

  /**
   * The number of structural features of the '<em>Mandatory</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.variCell.impl.NotPresentImpl <em>Not Present</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.variCell.impl.NotPresentImpl
   * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getNotPresent()
   * @generated
   */
  int NOT_PRESENT = 20;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_PRESENT__VALUES = 0;

  /**
   * The number of structural features of the '<em>Not Present</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_PRESENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.variCell.impl.UnknownImpl <em>Unknown</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.variCell.impl.UnknownImpl
   * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getUnknown()
   * @generated
   */
  int UNKNOWN = 21;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNKNOWN__VALUES = 0;

  /**
   * The number of structural features of the '<em>Unknown</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNKNOWN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.variCell.impl.ScopingViewImpl <em>Scoping View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.variCell.impl.ScopingViewImpl
   * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getScopingView()
   * @generated
   */
  int SCOPING_VIEW = 22;

  /**
   * The feature id for the '<em><b>View</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPING_VIEW__VIEW = 0;

  /**
   * The feature id for the '<em><b>Viewname</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPING_VIEW__VIEWNAME = 1;

  /**
   * The feature id for the '<em><b>Schema</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPING_VIEW__SCHEMA = 2;

  /**
   * The feature id for the '<em><b>Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPING_VIEW__CONFIG = 3;

  /**
   * The feature id for the '<em><b>Products</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPING_VIEW__PRODUCTS = 4;

  /**
   * The feature id for the '<em><b>Fts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPING_VIEW__FTS = 5;

  /**
   * The feature id for the '<em><b>Alignment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPING_VIEW__ALIGNMENT = 6;

  /**
   * The feature id for the '<em><b>Interpretation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPING_VIEW__INTERPRETATION = 7;

  /**
   * The number of structural features of the '<em>Scoping View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPING_VIEW_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.variCell.impl.ViewNameImpl <em>View Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.variCell.impl.ViewNameImpl
   * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getViewName()
   * @generated
   */
  int VIEW_NAME = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_NAME__NAME = 0;

  /**
   * The number of structural features of the '<em>View Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.variCell.impl.ScopingProductsImpl <em>Scoping Products</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.variCell.impl.ScopingProductsImpl
   * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getScopingProducts()
   * @generated
   */
  int SCOPING_PRODUCTS = 24;

  /**
   * The number of structural features of the '<em>Scoping Products</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPING_PRODUCTS_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.variCell.impl.ScopingFeaturesImpl <em>Scoping Features</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.variCell.impl.ScopingFeaturesImpl
   * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getScopingFeatures()
   * @generated
   */
  int SCOPING_FEATURES = 25;

  /**
   * The number of structural features of the '<em>Scoping Features</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCOPING_FEATURES_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.variCell.impl.FeatureInclusionExclusionImpl <em>Feature Inclusion Exclusion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.variCell.impl.FeatureInclusionExclusionImpl
   * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getFeatureInclusionExclusion()
   * @generated
   */
  int FEATURE_INCLUSION_EXCLUSION = 26;

  /**
   * The feature id for the '<em><b>Except</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_INCLUSION_EXCLUSION__EXCEPT = SCOPING_FEATURES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Only</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_INCLUSION_EXCLUSION__ONLY = SCOPING_FEATURES_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Feature Inclusion Exclusion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_INCLUSION_EXCLUSION_FEATURE_COUNT = SCOPING_FEATURES_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.variCell.impl.ExceptFeatureImpl <em>Except Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.variCell.impl.ExceptFeatureImpl
   * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getExceptFeature()
   * @generated
   */
  int EXCEPT_FEATURE = 27;

  /**
   * The feature id for the '<em><b>Fts</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPT_FEATURE__FTS = 0;

  /**
   * The number of structural features of the '<em>Except Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPT_FEATURE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.variCell.impl.OnlyFeatureImpl <em>Only Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.variCell.impl.OnlyFeatureImpl
   * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getOnlyFeature()
   * @generated
   */
  int ONLY_FEATURE = 28;

  /**
   * The feature id for the '<em><b>Fts</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONLY_FEATURE__FTS = 0;

  /**
   * The number of structural features of the '<em>Only Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONLY_FEATURE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.variCell.impl.ProductInclusionExclusionImpl <em>Product Inclusion Exclusion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.variCell.impl.ProductInclusionExclusionImpl
   * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getProductInclusionExclusion()
   * @generated
   */
  int PRODUCT_INCLUSION_EXCLUSION = 29;

  /**
   * The feature id for the '<em><b>Except</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_INCLUSION_EXCLUSION__EXCEPT = SCOPING_PRODUCTS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Only</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_INCLUSION_EXCLUSION__ONLY = SCOPING_PRODUCTS_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Product Inclusion Exclusion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRODUCT_INCLUSION_EXCLUSION_FEATURE_COUNT = SCOPING_PRODUCTS_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.variCell.impl.ExceptProductImpl <em>Except Product</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.variCell.impl.ExceptProductImpl
   * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getExceptProduct()
   * @generated
   */
  int EXCEPT_PRODUCT = 30;

  /**
   * The feature id for the '<em><b>Pds</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPT_PRODUCT__PDS = 0;

  /**
   * The number of structural features of the '<em>Except Product</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCEPT_PRODUCT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.variCell.impl.OnlyProductImpl <em>Only Product</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.variCell.impl.OnlyProductImpl
   * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getOnlyProduct()
   * @generated
   */
  int ONLY_PRODUCT = 31;

  /**
   * The feature id for the '<em><b>Pds</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONLY_PRODUCT__PDS = 0;

  /**
   * The number of structural features of the '<em>Only Product</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ONLY_PRODUCT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.variCell.impl.RewritingImpl <em>Rewriting</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.variCell.impl.RewritingImpl
   * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getRewriting()
   * @generated
   */
  int REWRITING = 32;

  /**
   * The feature id for the '<em><b>Oft</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REWRITING__OFT = 0;

  /**
   * The feature id for the '<em><b>Nft</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REWRITING__NFT = 1;

  /**
   * The number of structural features of the '<em>Rewriting</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REWRITING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.variCell.impl.MultiValuesInterpretationImpl <em>Multi Values Interpretation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.variCell.impl.MultiValuesInterpretationImpl
   * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getMultiValuesInterpretation()
   * @generated
   */
  int MULTI_VALUES_INTERPRETATION = 33;

  /**
   * The feature id for the '<em><b>Multi</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_VALUES_INTERPRETATION__MULTI = 0;

  /**
   * The number of structural features of the '<em>Multi Values Interpretation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_VALUES_INTERPRETATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.variCell.impl.MultiValueInterpretationImpl <em>Multi Value Interpretation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.variCell.impl.MultiValueInterpretationImpl
   * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getMultiValueInterpretation()
   * @generated
   */
  int MULTI_VALUE_INTERPRETATION = 34;

  /**
   * The feature id for the '<em><b>Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_VALUE_INTERPRETATION__VAL = 0;

  /**
   * The feature id for the '<em><b>Variability</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_VALUE_INTERPRETATION__VARIABILITY = 1;

  /**
   * The number of structural features of the '<em>Multi Value Interpretation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_VALUE_INTERPRETATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.variCell.impl.Or_exprImpl <em>Or expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.variCell.impl.Or_exprImpl
   * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getOr_expr()
   * @generated
   */
  int OR_EXPR = 35;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR__NAME = IEXPRESSION__NAME;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR__LEFT = IEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR__RIGHT = IEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Or expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPR_FEATURE_COUNT = IEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.variCell.impl.And_exprImpl <em>And expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.variCell.impl.And_exprImpl
   * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getAnd_expr()
   * @generated
   */
  int AND_EXPR = 36;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__NAME = IEXPRESSION__NAME;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__LEFT = IEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR__RIGHT = IEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>And expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPR_FEATURE_COUNT = IEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.variCell.KindRelation <em>Kind Relation</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.variCell.KindRelation
   * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getKindRelation()
   * @generated
   */
  int KIND_RELATION = 37;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.variCell.FileFormat <em>File Format</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.variCell.FileFormat
   * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getFileFormat()
   * @generated
   */
  int FILE_FORMAT = 38;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.variCell.VariabilityInterpretation <em>Variability Interpretation</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.variCell.VariabilityInterpretation
   * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getVariabilityInterpretation()
   * @generated
   */
  int VARIABILITY_INTERPRETATION = 39;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.variCell.SToFMModel <em>STo FM Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>STo FM Model</em>'.
   * @see org.xtext.example.mydsl.variCell.SToFMModel
   * @generated
   */
  EClass getSToFMModel();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.variCell.SToFMModel#getImportViews <em>Import Views</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Import Views</em>'.
   * @see org.xtext.example.mydsl.variCell.SToFMModel#getImportViews()
   * @see #getSToFMModel()
   * @generated
   */
  EReference getSToFMModel_ImportViews();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.variCell.SToFMModel#getSplName <em>Spl Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Spl Name</em>'.
   * @see org.xtext.example.mydsl.variCell.SToFMModel#getSplName()
   * @see #getSToFMModel()
   * @generated
   */
  EReference getSToFMModel_SplName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.variCell.SToFMModel#getSchema <em>Schema</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Schema</em>'.
   * @see org.xtext.example.mydsl.variCell.SToFMModel#getSchema()
   * @see #getSToFMModel()
   * @generated
   */
  EReference getSToFMModel_Schema();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.variCell.SToFMModel#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default</em>'.
   * @see org.xtext.example.mydsl.variCell.SToFMModel#getDefault()
   * @see #getSToFMModel()
   * @generated
   */
  EReference getSToFMModel_Default();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.variCell.SToFMModel#getScoping <em>Scoping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Scoping</em>'.
   * @see org.xtext.example.mydsl.variCell.SToFMModel#getScoping()
   * @see #getSToFMModel()
   * @generated
   */
  EReference getSToFMModel_Scoping();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.variCell.ImportViews <em>Import Views</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import Views</em>'.
   * @see org.xtext.example.mydsl.variCell.ImportViews
   * @generated
   */
  EClass getImportViews();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.variCell.ImportViews#getViews <em>Views</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Views</em>'.
   * @see org.xtext.example.mydsl.variCell.ImportViews#getViews()
   * @see #getImportViews()
   * @generated
   */
  EReference getImportViews_Views();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.variCell.DataView <em>Data View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data View</em>'.
   * @see org.xtext.example.mydsl.variCell.DataView
   * @generated
   */
  EClass getDataView();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.variCell.DataView#getFile <em>File</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>File</em>'.
   * @see org.xtext.example.mydsl.variCell.DataView#getFile()
   * @see #getDataView()
   * @generated
   */
  EAttribute getDataView_File();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.variCell.DataView#getViewname <em>Viewname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Viewname</em>'.
   * @see org.xtext.example.mydsl.variCell.DataView#getViewname()
   * @see #getDataView()
   * @generated
   */
  EAttribute getDataView_Viewname();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.variCell.SPLName <em>SPL Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SPL Name</em>'.
   * @see org.xtext.example.mydsl.variCell.SPLName
   * @generated
   */
  EClass getSPLName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.variCell.SPLName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.variCell.SPLName#getName()
   * @see #getSPLName()
   * @generated
   */
  EAttribute getSPLName_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.variCell.StructuringInformation <em>Structuring Information</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Structuring Information</em>'.
   * @see org.xtext.example.mydsl.variCell.StructuringInformation
   * @generated
   */
  EClass getStructuringInformation();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.variCell.StructuringInformation#getRelations <em>Relations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Relations</em>'.
   * @see org.xtext.example.mydsl.variCell.StructuringInformation#getRelations()
   * @see #getStructuringInformation()
   * @generated
   */
  EReference getStructuringInformation_Relations();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.variCell.StructuringInformation#getAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Abstract</em>'.
   * @see org.xtext.example.mydsl.variCell.StructuringInformation#getAbstract()
   * @see #getStructuringInformation()
   * @generated
   */
  EReference getStructuringInformation_Abstract();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.variCell.StructuringInformation#getMp <em>Mp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mp</em>'.
   * @see org.xtext.example.mydsl.variCell.StructuringInformation#getMp()
   * @see #getStructuringInformation()
   * @generated
   */
  EReference getStructuringInformation_Mp();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.variCell.ItemRelation <em>Item Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Item Relation</em>'.
   * @see org.xtext.example.mydsl.variCell.ItemRelation
   * @generated
   */
  EClass getItemRelation();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.variCell.ItemRelation#getView1 <em>View1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>View1</em>'.
   * @see org.xtext.example.mydsl.variCell.ItemRelation#getView1()
   * @see #getItemRelation()
   * @generated
   */
  EAttribute getItemRelation_View1();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.variCell.ItemRelation#getRel <em>Rel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rel</em>'.
   * @see org.xtext.example.mydsl.variCell.ItemRelation#getRel()
   * @see #getItemRelation()
   * @generated
   */
  EAttribute getItemRelation_Rel();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.variCell.ItemRelation#getView2 <em>View2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>View2</em>'.
   * @see org.xtext.example.mydsl.variCell.ItemRelation#getView2()
   * @see #getItemRelation()
   * @generated
   */
  EAttribute getItemRelation_View2();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.variCell.ItemGeneralization <em>Item Generalization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Item Generalization</em>'.
   * @see org.xtext.example.mydsl.variCell.ItemGeneralization
   * @generated
   */
  EClass getItemGeneralization();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.variCell.ItemGeneralization#getGeneralize <em>Generalize</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Generalize</em>'.
   * @see org.xtext.example.mydsl.variCell.ItemGeneralization#getGeneralize()
   * @see #getItemGeneralization()
   * @generated
   */
  EAttribute getItemGeneralization_Generalize();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.variCell.ItemGeneralization#getViews <em>Views</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Views</em>'.
   * @see org.xtext.example.mydsl.variCell.ItemGeneralization#getViews()
   * @see #getItemGeneralization()
   * @generated
   */
  EAttribute getItemGeneralization_Views();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.variCell.ItemMapping <em>Item Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Item Mapping</em>'.
   * @see org.xtext.example.mydsl.variCell.ItemMapping
   * @generated
   */
  EClass getItemMapping();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.variCell.ItemMapping#getItem <em>Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Item</em>'.
   * @see org.xtext.example.mydsl.variCell.ItemMapping#getItem()
   * @see #getItemMapping()
   * @generated
   */
  EAttribute getItemMapping_Item();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.variCell.ItemMapping#getAct <em>Act</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Act</em>'.
   * @see org.xtext.example.mydsl.variCell.ItemMapping#getAct()
   * @see #getItemMapping()
   * @generated
   */
  EAttribute getItemMapping_Act();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.variCell.ItemMapping#getPfts <em>Pfts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pfts</em>'.
   * @see org.xtext.example.mydsl.variCell.ItemMapping#getPfts()
   * @see #getItemMapping()
   * @generated
   */
  EReference getItemMapping_Pfts();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.variCell.PredicateItem <em>Predicate Item</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Predicate Item</em>'.
   * @see org.xtext.example.mydsl.variCell.PredicateItem
   * @generated
   */
  EClass getPredicateItem();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.variCell.IExpression <em>IExpression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>IExpression</em>'.
   * @see org.xtext.example.mydsl.variCell.IExpression
   * @generated
   */
  EClass getIExpression();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.variCell.IExpression#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.variCell.IExpression#getName()
   * @see #getIExpression()
   * @generated
   */
  EAttribute getIExpression_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.variCell.Neg_expr <em>Neg expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Neg expr</em>'.
   * @see org.xtext.example.mydsl.variCell.Neg_expr
   * @generated
   */
  EClass getNeg_expr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.variCell.Neg_expr#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.xtext.example.mydsl.variCell.Neg_expr#getExpr()
   * @see #getNeg_expr()
   * @generated
   */
  EReference getNeg_expr_Expr();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.variCell.Default <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Default</em>'.
   * @see org.xtext.example.mydsl.variCell.Default
   * @generated
   */
  EClass getDefault();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.variCell.Default#getConfigs <em>Configs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Configs</em>'.
   * @see org.xtext.example.mydsl.variCell.Default#getConfigs()
   * @see #getDefault()
   * @generated
   */
  EReference getDefault_Configs();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.variCell.Default#getProducts <em>Products</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Products</em>'.
   * @see org.xtext.example.mydsl.variCell.Default#getProducts()
   * @see #getDefault()
   * @generated
   */
  EReference getDefault_Products();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.variCell.ParsingConfiguration <em>Parsing Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parsing Configuration</em>'.
   * @see org.xtext.example.mydsl.variCell.ParsingConfiguration
   * @generated
   */
  EClass getParsingConfiguration();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.variCell.ParsingConfiguration#getProductID <em>Product ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Product ID</em>'.
   * @see org.xtext.example.mydsl.variCell.ParsingConfiguration#getProductID()
   * @see #getParsingConfiguration()
   * @generated
   */
  EReference getParsingConfiguration_ProductID();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.variCell.ParsingConfiguration#getFormat <em>Format</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Format</em>'.
   * @see org.xtext.example.mydsl.variCell.ParsingConfiguration#getFormat()
   * @see #getParsingConfiguration()
   * @generated
   */
  EReference getParsingConfiguration_Format();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.variCell.ParsingConfiguration#getSinterpret <em>Sinterpret</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sinterpret</em>'.
   * @see org.xtext.example.mydsl.variCell.ParsingConfiguration#getSinterpret()
   * @see #getParsingConfiguration()
   * @generated
   */
  EReference getParsingConfiguration_Sinterpret();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.variCell.ParsingConfiguration#getSeparator <em>Separator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Separator</em>'.
   * @see org.xtext.example.mydsl.variCell.ParsingConfiguration#getSeparator()
   * @see #getParsingConfiguration()
   * @generated
   */
  EReference getParsingConfiguration_Separator();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.variCell.ParsingConfiguration#getMseparator <em>Mseparator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mseparator</em>'.
   * @see org.xtext.example.mydsl.variCell.ParsingConfiguration#getMseparator()
   * @see #getParsingConfiguration()
   * @generated
   */
  EReference getParsingConfiguration_Mseparator();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.variCell.FormatSpecification <em>Format Specification</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Format Specification</em>'.
   * @see org.xtext.example.mydsl.variCell.FormatSpecification
   * @generated
   */
  EClass getFormatSpecification();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.variCell.FormatSpecification#getFileformat <em>Fileformat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fileformat</em>'.
   * @see org.xtext.example.mydsl.variCell.FormatSpecification#getFileformat()
   * @see #getFormatSpecification()
   * @generated
   */
  EAttribute getFormatSpecification_Fileformat();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.variCell.SyntacticalInterpretation <em>Syntactical Interpretation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Syntactical Interpretation</em>'.
   * @see org.xtext.example.mydsl.variCell.SyntacticalInterpretation
   * @generated
   */
  EClass getSyntacticalInterpretation();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.variCell.SyntacticalInterpretation#getOpt <em>Opt</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Opt</em>'.
   * @see org.xtext.example.mydsl.variCell.SyntacticalInterpretation#getOpt()
   * @see #getSyntacticalInterpretation()
   * @generated
   */
  EReference getSyntacticalInterpretation_Opt();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.variCell.SyntacticalInterpretation#getYes <em>Yes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Yes</em>'.
   * @see org.xtext.example.mydsl.variCell.SyntacticalInterpretation#getYes()
   * @see #getSyntacticalInterpretation()
   * @generated
   */
  EReference getSyntacticalInterpretation_Yes();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.variCell.SyntacticalInterpretation#getNo <em>No</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>No</em>'.
   * @see org.xtext.example.mydsl.variCell.SyntacticalInterpretation#getNo()
   * @see #getSyntacticalInterpretation()
   * @generated
   */
  EReference getSyntacticalInterpretation_No();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.variCell.SyntacticalInterpretation#getNa <em>Na</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Na</em>'.
   * @see org.xtext.example.mydsl.variCell.SyntacticalInterpretation#getNa()
   * @see #getSyntacticalInterpretation()
   * @generated
   */
  EReference getSyntacticalInterpretation_Na();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.variCell.Key <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Key</em>'.
   * @see org.xtext.example.mydsl.variCell.Key
   * @generated
   */
  EClass getKey();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.variCell.Key#getCid <em>Cid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Cid</em>'.
   * @see org.xtext.example.mydsl.variCell.Key#getCid()
   * @see #getKey()
   * @generated
   */
  EAttribute getKey_Cid();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.variCell.CSVSeparator <em>CSV Separator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CSV Separator</em>'.
   * @see org.xtext.example.mydsl.variCell.CSVSeparator
   * @generated
   */
  EClass getCSVSeparator();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.variCell.CSVSeparator#getSep <em>Sep</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sep</em>'.
   * @see org.xtext.example.mydsl.variCell.CSVSeparator#getSep()
   * @see #getCSVSeparator()
   * @generated
   */
  EAttribute getCSVSeparator_Sep();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.variCell.CSVMultiSeparator <em>CSV Multi Separator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CSV Multi Separator</em>'.
   * @see org.xtext.example.mydsl.variCell.CSVMultiSeparator
   * @generated
   */
  EClass getCSVMultiSeparator();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.variCell.CSVMultiSeparator#getSeps <em>Seps</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Seps</em>'.
   * @see org.xtext.example.mydsl.variCell.CSVMultiSeparator#getSeps()
   * @see #getCSVMultiSeparator()
   * @generated
   */
  EAttribute getCSVMultiSeparator_Seps();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.variCell.Optional <em>Optional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Optional</em>'.
   * @see org.xtext.example.mydsl.variCell.Optional
   * @generated
   */
  EClass getOptional();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.variCell.Optional#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Values</em>'.
   * @see org.xtext.example.mydsl.variCell.Optional#getValues()
   * @see #getOptional()
   * @generated
   */
  EAttribute getOptional_Values();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.variCell.Mandatory <em>Mandatory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mandatory</em>'.
   * @see org.xtext.example.mydsl.variCell.Mandatory
   * @generated
   */
  EClass getMandatory();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.variCell.Mandatory#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Values</em>'.
   * @see org.xtext.example.mydsl.variCell.Mandatory#getValues()
   * @see #getMandatory()
   * @generated
   */
  EAttribute getMandatory_Values();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.variCell.NotPresent <em>Not Present</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Not Present</em>'.
   * @see org.xtext.example.mydsl.variCell.NotPresent
   * @generated
   */
  EClass getNotPresent();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.variCell.NotPresent#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Values</em>'.
   * @see org.xtext.example.mydsl.variCell.NotPresent#getValues()
   * @see #getNotPresent()
   * @generated
   */
  EAttribute getNotPresent_Values();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.variCell.Unknown <em>Unknown</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unknown</em>'.
   * @see org.xtext.example.mydsl.variCell.Unknown
   * @generated
   */
  EClass getUnknown();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.variCell.Unknown#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Values</em>'.
   * @see org.xtext.example.mydsl.variCell.Unknown#getValues()
   * @see #getUnknown()
   * @generated
   */
  EAttribute getUnknown_Values();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.variCell.ScopingView <em>Scoping View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scoping View</em>'.
   * @see org.xtext.example.mydsl.variCell.ScopingView
   * @generated
   */
  EClass getScopingView();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.variCell.ScopingView#getView <em>View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>View</em>'.
   * @see org.xtext.example.mydsl.variCell.ScopingView#getView()
   * @see #getScopingView()
   * @generated
   */
  EAttribute getScopingView_View();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.variCell.ScopingView#getViewname <em>Viewname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Viewname</em>'.
   * @see org.xtext.example.mydsl.variCell.ScopingView#getViewname()
   * @see #getScopingView()
   * @generated
   */
  EReference getScopingView_Viewname();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.variCell.ScopingView#getSchema <em>Schema</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Schema</em>'.
   * @see org.xtext.example.mydsl.variCell.ScopingView#getSchema()
   * @see #getScopingView()
   * @generated
   */
  EReference getScopingView_Schema();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.variCell.ScopingView#getConfig <em>Config</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Config</em>'.
   * @see org.xtext.example.mydsl.variCell.ScopingView#getConfig()
   * @see #getScopingView()
   * @generated
   */
  EReference getScopingView_Config();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.variCell.ScopingView#getProducts <em>Products</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Products</em>'.
   * @see org.xtext.example.mydsl.variCell.ScopingView#getProducts()
   * @see #getScopingView()
   * @generated
   */
  EReference getScopingView_Products();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.variCell.ScopingView#getFts <em>Fts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fts</em>'.
   * @see org.xtext.example.mydsl.variCell.ScopingView#getFts()
   * @see #getScopingView()
   * @generated
   */
  EReference getScopingView_Fts();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.variCell.ScopingView#getAlignment <em>Alignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Alignment</em>'.
   * @see org.xtext.example.mydsl.variCell.ScopingView#getAlignment()
   * @see #getScopingView()
   * @generated
   */
  EReference getScopingView_Alignment();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.variCell.ScopingView#getInterpretation <em>Interpretation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Interpretation</em>'.
   * @see org.xtext.example.mydsl.variCell.ScopingView#getInterpretation()
   * @see #getScopingView()
   * @generated
   */
  EReference getScopingView_Interpretation();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.variCell.ViewName <em>View Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View Name</em>'.
   * @see org.xtext.example.mydsl.variCell.ViewName
   * @generated
   */
  EClass getViewName();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.variCell.ViewName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.variCell.ViewName#getName()
   * @see #getViewName()
   * @generated
   */
  EAttribute getViewName_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.variCell.ScopingProducts <em>Scoping Products</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scoping Products</em>'.
   * @see org.xtext.example.mydsl.variCell.ScopingProducts
   * @generated
   */
  EClass getScopingProducts();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.variCell.ScopingFeatures <em>Scoping Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Scoping Features</em>'.
   * @see org.xtext.example.mydsl.variCell.ScopingFeatures
   * @generated
   */
  EClass getScopingFeatures();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.variCell.FeatureInclusionExclusion <em>Feature Inclusion Exclusion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature Inclusion Exclusion</em>'.
   * @see org.xtext.example.mydsl.variCell.FeatureInclusionExclusion
   * @generated
   */
  EClass getFeatureInclusionExclusion();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.variCell.FeatureInclusionExclusion#getExcept <em>Except</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Except</em>'.
   * @see org.xtext.example.mydsl.variCell.FeatureInclusionExclusion#getExcept()
   * @see #getFeatureInclusionExclusion()
   * @generated
   */
  EReference getFeatureInclusionExclusion_Except();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.variCell.FeatureInclusionExclusion#getOnly <em>Only</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Only</em>'.
   * @see org.xtext.example.mydsl.variCell.FeatureInclusionExclusion#getOnly()
   * @see #getFeatureInclusionExclusion()
   * @generated
   */
  EReference getFeatureInclusionExclusion_Only();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.variCell.ExceptFeature <em>Except Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Except Feature</em>'.
   * @see org.xtext.example.mydsl.variCell.ExceptFeature
   * @generated
   */
  EClass getExceptFeature();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.variCell.ExceptFeature#getFts <em>Fts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Fts</em>'.
   * @see org.xtext.example.mydsl.variCell.ExceptFeature#getFts()
   * @see #getExceptFeature()
   * @generated
   */
  EAttribute getExceptFeature_Fts();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.variCell.OnlyFeature <em>Only Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Only Feature</em>'.
   * @see org.xtext.example.mydsl.variCell.OnlyFeature
   * @generated
   */
  EClass getOnlyFeature();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.variCell.OnlyFeature#getFts <em>Fts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Fts</em>'.
   * @see org.xtext.example.mydsl.variCell.OnlyFeature#getFts()
   * @see #getOnlyFeature()
   * @generated
   */
  EAttribute getOnlyFeature_Fts();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.variCell.ProductInclusionExclusion <em>Product Inclusion Exclusion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Product Inclusion Exclusion</em>'.
   * @see org.xtext.example.mydsl.variCell.ProductInclusionExclusion
   * @generated
   */
  EClass getProductInclusionExclusion();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.variCell.ProductInclusionExclusion#getExcept <em>Except</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Except</em>'.
   * @see org.xtext.example.mydsl.variCell.ProductInclusionExclusion#getExcept()
   * @see #getProductInclusionExclusion()
   * @generated
   */
  EReference getProductInclusionExclusion_Except();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.variCell.ProductInclusionExclusion#getOnly <em>Only</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Only</em>'.
   * @see org.xtext.example.mydsl.variCell.ProductInclusionExclusion#getOnly()
   * @see #getProductInclusionExclusion()
   * @generated
   */
  EReference getProductInclusionExclusion_Only();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.variCell.ExceptProduct <em>Except Product</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Except Product</em>'.
   * @see org.xtext.example.mydsl.variCell.ExceptProduct
   * @generated
   */
  EClass getExceptProduct();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.variCell.ExceptProduct#getPds <em>Pds</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Pds</em>'.
   * @see org.xtext.example.mydsl.variCell.ExceptProduct#getPds()
   * @see #getExceptProduct()
   * @generated
   */
  EAttribute getExceptProduct_Pds();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.variCell.OnlyProduct <em>Only Product</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Only Product</em>'.
   * @see org.xtext.example.mydsl.variCell.OnlyProduct
   * @generated
   */
  EClass getOnlyProduct();

  /**
   * Returns the meta object for the attribute list '{@link org.xtext.example.mydsl.variCell.OnlyProduct#getPds <em>Pds</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Pds</em>'.
   * @see org.xtext.example.mydsl.variCell.OnlyProduct#getPds()
   * @see #getOnlyProduct()
   * @generated
   */
  EAttribute getOnlyProduct_Pds();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.variCell.Rewriting <em>Rewriting</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rewriting</em>'.
   * @see org.xtext.example.mydsl.variCell.Rewriting
   * @generated
   */
  EClass getRewriting();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.variCell.Rewriting#getOft <em>Oft</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Oft</em>'.
   * @see org.xtext.example.mydsl.variCell.Rewriting#getOft()
   * @see #getRewriting()
   * @generated
   */
  EAttribute getRewriting_Oft();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.variCell.Rewriting#getNft <em>Nft</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Nft</em>'.
   * @see org.xtext.example.mydsl.variCell.Rewriting#getNft()
   * @see #getRewriting()
   * @generated
   */
  EAttribute getRewriting_Nft();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.variCell.MultiValuesInterpretation <em>Multi Values Interpretation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multi Values Interpretation</em>'.
   * @see org.xtext.example.mydsl.variCell.MultiValuesInterpretation
   * @generated
   */
  EClass getMultiValuesInterpretation();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.example.mydsl.variCell.MultiValuesInterpretation#getMulti <em>Multi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Multi</em>'.
   * @see org.xtext.example.mydsl.variCell.MultiValuesInterpretation#getMulti()
   * @see #getMultiValuesInterpretation()
   * @generated
   */
  EReference getMultiValuesInterpretation_Multi();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.variCell.MultiValueInterpretation <em>Multi Value Interpretation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multi Value Interpretation</em>'.
   * @see org.xtext.example.mydsl.variCell.MultiValueInterpretation
   * @generated
   */
  EClass getMultiValueInterpretation();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.variCell.MultiValueInterpretation#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Val</em>'.
   * @see org.xtext.example.mydsl.variCell.MultiValueInterpretation#getVal()
   * @see #getMultiValueInterpretation()
   * @generated
   */
  EAttribute getMultiValueInterpretation_Val();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.variCell.MultiValueInterpretation#getVariability <em>Variability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Variability</em>'.
   * @see org.xtext.example.mydsl.variCell.MultiValueInterpretation#getVariability()
   * @see #getMultiValueInterpretation()
   * @generated
   */
  EAttribute getMultiValueInterpretation_Variability();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.variCell.Or_expr <em>Or expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or expr</em>'.
   * @see org.xtext.example.mydsl.variCell.Or_expr
   * @generated
   */
  EClass getOr_expr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.variCell.Or_expr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.example.mydsl.variCell.Or_expr#getLeft()
   * @see #getOr_expr()
   * @generated
   */
  EReference getOr_expr_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.variCell.Or_expr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.example.mydsl.variCell.Or_expr#getRight()
   * @see #getOr_expr()
   * @generated
   */
  EReference getOr_expr_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.variCell.And_expr <em>And expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And expr</em>'.
   * @see org.xtext.example.mydsl.variCell.And_expr
   * @generated
   */
  EClass getAnd_expr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.variCell.And_expr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.example.mydsl.variCell.And_expr#getLeft()
   * @see #getAnd_expr()
   * @generated
   */
  EReference getAnd_expr_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.variCell.And_expr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.example.mydsl.variCell.And_expr#getRight()
   * @see #getAnd_expr()
   * @generated
   */
  EReference getAnd_expr_Right();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.variCell.KindRelation <em>Kind Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Kind Relation</em>'.
   * @see org.xtext.example.mydsl.variCell.KindRelation
   * @generated
   */
  EEnum getKindRelation();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.variCell.FileFormat <em>File Format</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>File Format</em>'.
   * @see org.xtext.example.mydsl.variCell.FileFormat
   * @generated
   */
  EEnum getFileFormat();

  /**
   * Returns the meta object for enum '{@link org.xtext.example.mydsl.variCell.VariabilityInterpretation <em>Variability Interpretation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Variability Interpretation</em>'.
   * @see org.xtext.example.mydsl.variCell.VariabilityInterpretation
   * @generated
   */
  EEnum getVariabilityInterpretation();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  VariCellFactory getVariCellFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.variCell.impl.SToFMModelImpl <em>STo FM Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.variCell.impl.SToFMModelImpl
     * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getSToFMModel()
     * @generated
     */
    EClass STO_FM_MODEL = eINSTANCE.getSToFMModel();

    /**
     * The meta object literal for the '<em><b>Import Views</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STO_FM_MODEL__IMPORT_VIEWS = eINSTANCE.getSToFMModel_ImportViews();

    /**
     * The meta object literal for the '<em><b>Spl Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STO_FM_MODEL__SPL_NAME = eINSTANCE.getSToFMModel_SplName();

    /**
     * The meta object literal for the '<em><b>Schema</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STO_FM_MODEL__SCHEMA = eINSTANCE.getSToFMModel_Schema();

    /**
     * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STO_FM_MODEL__DEFAULT = eINSTANCE.getSToFMModel_Default();

    /**
     * The meta object literal for the '<em><b>Scoping</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STO_FM_MODEL__SCOPING = eINSTANCE.getSToFMModel_Scoping();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.variCell.impl.ImportViewsImpl <em>Import Views</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.variCell.impl.ImportViewsImpl
     * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getImportViews()
     * @generated
     */
    EClass IMPORT_VIEWS = eINSTANCE.getImportViews();

    /**
     * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPORT_VIEWS__VIEWS = eINSTANCE.getImportViews_Views();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.variCell.impl.DataViewImpl <em>Data View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.variCell.impl.DataViewImpl
     * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getDataView()
     * @generated
     */
    EClass DATA_VIEW = eINSTANCE.getDataView();

    /**
     * The meta object literal for the '<em><b>File</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_VIEW__FILE = eINSTANCE.getDataView_File();

    /**
     * The meta object literal for the '<em><b>Viewname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_VIEW__VIEWNAME = eINSTANCE.getDataView_Viewname();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.variCell.impl.SPLNameImpl <em>SPL Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.variCell.impl.SPLNameImpl
     * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getSPLName()
     * @generated
     */
    EClass SPL_NAME = eINSTANCE.getSPLName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPL_NAME__NAME = eINSTANCE.getSPLName_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.variCell.impl.StructuringInformationImpl <em>Structuring Information</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.variCell.impl.StructuringInformationImpl
     * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getStructuringInformation()
     * @generated
     */
    EClass STRUCTURING_INFORMATION = eINSTANCE.getStructuringInformation();

    /**
     * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCTURING_INFORMATION__RELATIONS = eINSTANCE.getStructuringInformation_Relations();

    /**
     * The meta object literal for the '<em><b>Abstract</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCTURING_INFORMATION__ABSTRACT = eINSTANCE.getStructuringInformation_Abstract();

    /**
     * The meta object literal for the '<em><b>Mp</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCTURING_INFORMATION__MP = eINSTANCE.getStructuringInformation_Mp();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.variCell.impl.ItemRelationImpl <em>Item Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.variCell.impl.ItemRelationImpl
     * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getItemRelation()
     * @generated
     */
    EClass ITEM_RELATION = eINSTANCE.getItemRelation();

    /**
     * The meta object literal for the '<em><b>View1</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ITEM_RELATION__VIEW1 = eINSTANCE.getItemRelation_View1();

    /**
     * The meta object literal for the '<em><b>Rel</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ITEM_RELATION__REL = eINSTANCE.getItemRelation_Rel();

    /**
     * The meta object literal for the '<em><b>View2</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ITEM_RELATION__VIEW2 = eINSTANCE.getItemRelation_View2();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.variCell.impl.ItemGeneralizationImpl <em>Item Generalization</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.variCell.impl.ItemGeneralizationImpl
     * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getItemGeneralization()
     * @generated
     */
    EClass ITEM_GENERALIZATION = eINSTANCE.getItemGeneralization();

    /**
     * The meta object literal for the '<em><b>Generalize</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ITEM_GENERALIZATION__GENERALIZE = eINSTANCE.getItemGeneralization_Generalize();

    /**
     * The meta object literal for the '<em><b>Views</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ITEM_GENERALIZATION__VIEWS = eINSTANCE.getItemGeneralization_Views();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.variCell.impl.ItemMappingImpl <em>Item Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.variCell.impl.ItemMappingImpl
     * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getItemMapping()
     * @generated
     */
    EClass ITEM_MAPPING = eINSTANCE.getItemMapping();

    /**
     * The meta object literal for the '<em><b>Item</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ITEM_MAPPING__ITEM = eINSTANCE.getItemMapping_Item();

    /**
     * The meta object literal for the '<em><b>Act</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ITEM_MAPPING__ACT = eINSTANCE.getItemMapping_Act();

    /**
     * The meta object literal for the '<em><b>Pfts</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ITEM_MAPPING__PFTS = eINSTANCE.getItemMapping_Pfts();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.variCell.impl.PredicateItemImpl <em>Predicate Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.variCell.impl.PredicateItemImpl
     * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getPredicateItem()
     * @generated
     */
    EClass PREDICATE_ITEM = eINSTANCE.getPredicateItem();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.variCell.impl.IExpressionImpl <em>IExpression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.variCell.impl.IExpressionImpl
     * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getIExpression()
     * @generated
     */
    EClass IEXPRESSION = eINSTANCE.getIExpression();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IEXPRESSION__NAME = eINSTANCE.getIExpression_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.variCell.impl.Neg_exprImpl <em>Neg expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.variCell.impl.Neg_exprImpl
     * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getNeg_expr()
     * @generated
     */
    EClass NEG_EXPR = eINSTANCE.getNeg_expr();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NEG_EXPR__EXPR = eINSTANCE.getNeg_expr_Expr();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.variCell.impl.DefaultImpl <em>Default</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.variCell.impl.DefaultImpl
     * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getDefault()
     * @generated
     */
    EClass DEFAULT = eINSTANCE.getDefault();

    /**
     * The meta object literal for the '<em><b>Configs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFAULT__CONFIGS = eINSTANCE.getDefault_Configs();

    /**
     * The meta object literal for the '<em><b>Products</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DEFAULT__PRODUCTS = eINSTANCE.getDefault_Products();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.variCell.impl.ParsingConfigurationImpl <em>Parsing Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.variCell.impl.ParsingConfigurationImpl
     * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getParsingConfiguration()
     * @generated
     */
    EClass PARSING_CONFIGURATION = eINSTANCE.getParsingConfiguration();

    /**
     * The meta object literal for the '<em><b>Product ID</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARSING_CONFIGURATION__PRODUCT_ID = eINSTANCE.getParsingConfiguration_ProductID();

    /**
     * The meta object literal for the '<em><b>Format</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARSING_CONFIGURATION__FORMAT = eINSTANCE.getParsingConfiguration_Format();

    /**
     * The meta object literal for the '<em><b>Sinterpret</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARSING_CONFIGURATION__SINTERPRET = eINSTANCE.getParsingConfiguration_Sinterpret();

    /**
     * The meta object literal for the '<em><b>Separator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARSING_CONFIGURATION__SEPARATOR = eINSTANCE.getParsingConfiguration_Separator();

    /**
     * The meta object literal for the '<em><b>Mseparator</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARSING_CONFIGURATION__MSEPARATOR = eINSTANCE.getParsingConfiguration_Mseparator();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.variCell.impl.FormatSpecificationImpl <em>Format Specification</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.variCell.impl.FormatSpecificationImpl
     * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getFormatSpecification()
     * @generated
     */
    EClass FORMAT_SPECIFICATION = eINSTANCE.getFormatSpecification();

    /**
     * The meta object literal for the '<em><b>Fileformat</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FORMAT_SPECIFICATION__FILEFORMAT = eINSTANCE.getFormatSpecification_Fileformat();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.variCell.impl.SyntacticalInterpretationImpl <em>Syntactical Interpretation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.variCell.impl.SyntacticalInterpretationImpl
     * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getSyntacticalInterpretation()
     * @generated
     */
    EClass SYNTACTICAL_INTERPRETATION = eINSTANCE.getSyntacticalInterpretation();

    /**
     * The meta object literal for the '<em><b>Opt</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYNTACTICAL_INTERPRETATION__OPT = eINSTANCE.getSyntacticalInterpretation_Opt();

    /**
     * The meta object literal for the '<em><b>Yes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYNTACTICAL_INTERPRETATION__YES = eINSTANCE.getSyntacticalInterpretation_Yes();

    /**
     * The meta object literal for the '<em><b>No</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYNTACTICAL_INTERPRETATION__NO = eINSTANCE.getSyntacticalInterpretation_No();

    /**
     * The meta object literal for the '<em><b>Na</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYNTACTICAL_INTERPRETATION__NA = eINSTANCE.getSyntacticalInterpretation_Na();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.variCell.impl.KeyImpl <em>Key</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.variCell.impl.KeyImpl
     * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getKey()
     * @generated
     */
    EClass KEY = eINSTANCE.getKey();

    /**
     * The meta object literal for the '<em><b>Cid</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KEY__CID = eINSTANCE.getKey_Cid();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.variCell.impl.CSVSeparatorImpl <em>CSV Separator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.variCell.impl.CSVSeparatorImpl
     * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getCSVSeparator()
     * @generated
     */
    EClass CSV_SEPARATOR = eINSTANCE.getCSVSeparator();

    /**
     * The meta object literal for the '<em><b>Sep</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CSV_SEPARATOR__SEP = eINSTANCE.getCSVSeparator_Sep();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.variCell.impl.CSVMultiSeparatorImpl <em>CSV Multi Separator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.variCell.impl.CSVMultiSeparatorImpl
     * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getCSVMultiSeparator()
     * @generated
     */
    EClass CSV_MULTI_SEPARATOR = eINSTANCE.getCSVMultiSeparator();

    /**
     * The meta object literal for the '<em><b>Seps</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CSV_MULTI_SEPARATOR__SEPS = eINSTANCE.getCSVMultiSeparator_Seps();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.variCell.impl.OptionalImpl <em>Optional</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.variCell.impl.OptionalImpl
     * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getOptional()
     * @generated
     */
    EClass OPTIONAL = eINSTANCE.getOptional();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPTIONAL__VALUES = eINSTANCE.getOptional_Values();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.variCell.impl.MandatoryImpl <em>Mandatory</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.variCell.impl.MandatoryImpl
     * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getMandatory()
     * @generated
     */
    EClass MANDATORY = eINSTANCE.getMandatory();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MANDATORY__VALUES = eINSTANCE.getMandatory_Values();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.variCell.impl.NotPresentImpl <em>Not Present</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.variCell.impl.NotPresentImpl
     * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getNotPresent()
     * @generated
     */
    EClass NOT_PRESENT = eINSTANCE.getNotPresent();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NOT_PRESENT__VALUES = eINSTANCE.getNotPresent_Values();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.variCell.impl.UnknownImpl <em>Unknown</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.variCell.impl.UnknownImpl
     * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getUnknown()
     * @generated
     */
    EClass UNKNOWN = eINSTANCE.getUnknown();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNKNOWN__VALUES = eINSTANCE.getUnknown_Values();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.variCell.impl.ScopingViewImpl <em>Scoping View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.variCell.impl.ScopingViewImpl
     * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getScopingView()
     * @generated
     */
    EClass SCOPING_VIEW = eINSTANCE.getScopingView();

    /**
     * The meta object literal for the '<em><b>View</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCOPING_VIEW__VIEW = eINSTANCE.getScopingView_View();

    /**
     * The meta object literal for the '<em><b>Viewname</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCOPING_VIEW__VIEWNAME = eINSTANCE.getScopingView_Viewname();

    /**
     * The meta object literal for the '<em><b>Schema</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCOPING_VIEW__SCHEMA = eINSTANCE.getScopingView_Schema();

    /**
     * The meta object literal for the '<em><b>Config</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCOPING_VIEW__CONFIG = eINSTANCE.getScopingView_Config();

    /**
     * The meta object literal for the '<em><b>Products</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCOPING_VIEW__PRODUCTS = eINSTANCE.getScopingView_Products();

    /**
     * The meta object literal for the '<em><b>Fts</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCOPING_VIEW__FTS = eINSTANCE.getScopingView_Fts();

    /**
     * The meta object literal for the '<em><b>Alignment</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCOPING_VIEW__ALIGNMENT = eINSTANCE.getScopingView_Alignment();

    /**
     * The meta object literal for the '<em><b>Interpretation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCOPING_VIEW__INTERPRETATION = eINSTANCE.getScopingView_Interpretation();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.variCell.impl.ViewNameImpl <em>View Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.variCell.impl.ViewNameImpl
     * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getViewName()
     * @generated
     */
    EClass VIEW_NAME = eINSTANCE.getViewName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEW_NAME__NAME = eINSTANCE.getViewName_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.variCell.impl.ScopingProductsImpl <em>Scoping Products</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.variCell.impl.ScopingProductsImpl
     * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getScopingProducts()
     * @generated
     */
    EClass SCOPING_PRODUCTS = eINSTANCE.getScopingProducts();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.variCell.impl.ScopingFeaturesImpl <em>Scoping Features</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.variCell.impl.ScopingFeaturesImpl
     * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getScopingFeatures()
     * @generated
     */
    EClass SCOPING_FEATURES = eINSTANCE.getScopingFeatures();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.variCell.impl.FeatureInclusionExclusionImpl <em>Feature Inclusion Exclusion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.variCell.impl.FeatureInclusionExclusionImpl
     * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getFeatureInclusionExclusion()
     * @generated
     */
    EClass FEATURE_INCLUSION_EXCLUSION = eINSTANCE.getFeatureInclusionExclusion();

    /**
     * The meta object literal for the '<em><b>Except</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_INCLUSION_EXCLUSION__EXCEPT = eINSTANCE.getFeatureInclusionExclusion_Except();

    /**
     * The meta object literal for the '<em><b>Only</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FEATURE_INCLUSION_EXCLUSION__ONLY = eINSTANCE.getFeatureInclusionExclusion_Only();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.variCell.impl.ExceptFeatureImpl <em>Except Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.variCell.impl.ExceptFeatureImpl
     * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getExceptFeature()
     * @generated
     */
    EClass EXCEPT_FEATURE = eINSTANCE.getExceptFeature();

    /**
     * The meta object literal for the '<em><b>Fts</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXCEPT_FEATURE__FTS = eINSTANCE.getExceptFeature_Fts();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.variCell.impl.OnlyFeatureImpl <em>Only Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.variCell.impl.OnlyFeatureImpl
     * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getOnlyFeature()
     * @generated
     */
    EClass ONLY_FEATURE = eINSTANCE.getOnlyFeature();

    /**
     * The meta object literal for the '<em><b>Fts</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ONLY_FEATURE__FTS = eINSTANCE.getOnlyFeature_Fts();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.variCell.impl.ProductInclusionExclusionImpl <em>Product Inclusion Exclusion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.variCell.impl.ProductInclusionExclusionImpl
     * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getProductInclusionExclusion()
     * @generated
     */
    EClass PRODUCT_INCLUSION_EXCLUSION = eINSTANCE.getProductInclusionExclusion();

    /**
     * The meta object literal for the '<em><b>Except</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRODUCT_INCLUSION_EXCLUSION__EXCEPT = eINSTANCE.getProductInclusionExclusion_Except();

    /**
     * The meta object literal for the '<em><b>Only</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRODUCT_INCLUSION_EXCLUSION__ONLY = eINSTANCE.getProductInclusionExclusion_Only();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.variCell.impl.ExceptProductImpl <em>Except Product</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.variCell.impl.ExceptProductImpl
     * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getExceptProduct()
     * @generated
     */
    EClass EXCEPT_PRODUCT = eINSTANCE.getExceptProduct();

    /**
     * The meta object literal for the '<em><b>Pds</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXCEPT_PRODUCT__PDS = eINSTANCE.getExceptProduct_Pds();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.variCell.impl.OnlyProductImpl <em>Only Product</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.variCell.impl.OnlyProductImpl
     * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getOnlyProduct()
     * @generated
     */
    EClass ONLY_PRODUCT = eINSTANCE.getOnlyProduct();

    /**
     * The meta object literal for the '<em><b>Pds</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ONLY_PRODUCT__PDS = eINSTANCE.getOnlyProduct_Pds();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.variCell.impl.RewritingImpl <em>Rewriting</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.variCell.impl.RewritingImpl
     * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getRewriting()
     * @generated
     */
    EClass REWRITING = eINSTANCE.getRewriting();

    /**
     * The meta object literal for the '<em><b>Oft</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REWRITING__OFT = eINSTANCE.getRewriting_Oft();

    /**
     * The meta object literal for the '<em><b>Nft</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REWRITING__NFT = eINSTANCE.getRewriting_Nft();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.variCell.impl.MultiValuesInterpretationImpl <em>Multi Values Interpretation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.variCell.impl.MultiValuesInterpretationImpl
     * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getMultiValuesInterpretation()
     * @generated
     */
    EClass MULTI_VALUES_INTERPRETATION = eINSTANCE.getMultiValuesInterpretation();

    /**
     * The meta object literal for the '<em><b>Multi</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTI_VALUES_INTERPRETATION__MULTI = eINSTANCE.getMultiValuesInterpretation_Multi();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.variCell.impl.MultiValueInterpretationImpl <em>Multi Value Interpretation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.variCell.impl.MultiValueInterpretationImpl
     * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getMultiValueInterpretation()
     * @generated
     */
    EClass MULTI_VALUE_INTERPRETATION = eINSTANCE.getMultiValueInterpretation();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTI_VALUE_INTERPRETATION__VAL = eINSTANCE.getMultiValueInterpretation_Val();

    /**
     * The meta object literal for the '<em><b>Variability</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTI_VALUE_INTERPRETATION__VARIABILITY = eINSTANCE.getMultiValueInterpretation_Variability();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.variCell.impl.Or_exprImpl <em>Or expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.variCell.impl.Or_exprImpl
     * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getOr_expr()
     * @generated
     */
    EClass OR_EXPR = eINSTANCE.getOr_expr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_EXPR__LEFT = eINSTANCE.getOr_expr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_EXPR__RIGHT = eINSTANCE.getOr_expr_Right();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.variCell.impl.And_exprImpl <em>And expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.variCell.impl.And_exprImpl
     * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getAnd_expr()
     * @generated
     */
    EClass AND_EXPR = eINSTANCE.getAnd_expr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_EXPR__LEFT = eINSTANCE.getAnd_expr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_EXPR__RIGHT = eINSTANCE.getAnd_expr_Right();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.variCell.KindRelation <em>Kind Relation</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.variCell.KindRelation
     * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getKindRelation()
     * @generated
     */
    EEnum KIND_RELATION = eINSTANCE.getKindRelation();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.variCell.FileFormat <em>File Format</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.variCell.FileFormat
     * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getFileFormat()
     * @generated
     */
    EEnum FILE_FORMAT = eINSTANCE.getFileFormat();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.variCell.VariabilityInterpretation <em>Variability Interpretation</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.variCell.VariabilityInterpretation
     * @see org.xtext.example.mydsl.variCell.impl.VariCellPackageImpl#getVariabilityInterpretation()
     * @generated
     */
    EEnum VARIABILITY_INTERPRETATION = eINSTANCE.getVariabilityInterpretation();

  }

} //VariCellPackage
