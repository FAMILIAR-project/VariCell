/**
 */
package org.xtext.example.mydsl.variCell;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.variCell.VariCellPackage
 * @generated
 */
public interface VariCellFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  VariCellFactory eINSTANCE = org.xtext.example.mydsl.variCell.impl.VariCellFactoryImpl.init();

  /**
   * Returns a new object of class '<em>STo FM Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>STo FM Model</em>'.
   * @generated
   */
  SToFMModel createSToFMModel();

  /**
   * Returns a new object of class '<em>Import Views</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import Views</em>'.
   * @generated
   */
  ImportViews createImportViews();

  /**
   * Returns a new object of class '<em>Data View</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data View</em>'.
   * @generated
   */
  DataView createDataView();

  /**
   * Returns a new object of class '<em>SPL Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>SPL Name</em>'.
   * @generated
   */
  SPLName createSPLName();

  /**
   * Returns a new object of class '<em>Structuring Information</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Structuring Information</em>'.
   * @generated
   */
  StructuringInformation createStructuringInformation();

  /**
   * Returns a new object of class '<em>Item Relation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Item Relation</em>'.
   * @generated
   */
  ItemRelation createItemRelation();

  /**
   * Returns a new object of class '<em>Item Generalization</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Item Generalization</em>'.
   * @generated
   */
  ItemGeneralization createItemGeneralization();

  /**
   * Returns a new object of class '<em>Item Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Item Mapping</em>'.
   * @generated
   */
  ItemMapping createItemMapping();

  /**
   * Returns a new object of class '<em>Predicate Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Predicate Item</em>'.
   * @generated
   */
  PredicateItem createPredicateItem();

  /**
   * Returns a new object of class '<em>IExpression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>IExpression</em>'.
   * @generated
   */
  IExpression createIExpression();

  /**
   * Returns a new object of class '<em>Neg expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Neg expr</em>'.
   * @generated
   */
  Neg_expr createNeg_expr();

  /**
   * Returns a new object of class '<em>Default</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Default</em>'.
   * @generated
   */
  Default createDefault();

  /**
   * Returns a new object of class '<em>Parsing Configuration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parsing Configuration</em>'.
   * @generated
   */
  ParsingConfiguration createParsingConfiguration();

  /**
   * Returns a new object of class '<em>Format Specification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Format Specification</em>'.
   * @generated
   */
  FormatSpecification createFormatSpecification();

  /**
   * Returns a new object of class '<em>Syntactical Interpretation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Syntactical Interpretation</em>'.
   * @generated
   */
  SyntacticalInterpretation createSyntacticalInterpretation();

  /**
   * Returns a new object of class '<em>Key</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Key</em>'.
   * @generated
   */
  Key createKey();

  /**
   * Returns a new object of class '<em>CSV Separator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CSV Separator</em>'.
   * @generated
   */
  CSVSeparator createCSVSeparator();

  /**
   * Returns a new object of class '<em>CSV Multi Separator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>CSV Multi Separator</em>'.
   * @generated
   */
  CSVMultiSeparator createCSVMultiSeparator();

  /**
   * Returns a new object of class '<em>Optional</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Optional</em>'.
   * @generated
   */
  Optional createOptional();

  /**
   * Returns a new object of class '<em>Mandatory</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mandatory</em>'.
   * @generated
   */
  Mandatory createMandatory();

  /**
   * Returns a new object of class '<em>Not Present</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Not Present</em>'.
   * @generated
   */
  NotPresent createNotPresent();

  /**
   * Returns a new object of class '<em>Unknown</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unknown</em>'.
   * @generated
   */
  Unknown createUnknown();

  /**
   * Returns a new object of class '<em>Scoping View</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scoping View</em>'.
   * @generated
   */
  ScopingView createScopingView();

  /**
   * Returns a new object of class '<em>View Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>View Name</em>'.
   * @generated
   */
  ViewName createViewName();

  /**
   * Returns a new object of class '<em>Scoping Products</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scoping Products</em>'.
   * @generated
   */
  ScopingProducts createScopingProducts();

  /**
   * Returns a new object of class '<em>Scoping Features</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scoping Features</em>'.
   * @generated
   */
  ScopingFeatures createScopingFeatures();

  /**
   * Returns a new object of class '<em>Feature Inclusion Exclusion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Feature Inclusion Exclusion</em>'.
   * @generated
   */
  FeatureInclusionExclusion createFeatureInclusionExclusion();

  /**
   * Returns a new object of class '<em>Except Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Except Feature</em>'.
   * @generated
   */
  ExceptFeature createExceptFeature();

  /**
   * Returns a new object of class '<em>Only Feature</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Only Feature</em>'.
   * @generated
   */
  OnlyFeature createOnlyFeature();

  /**
   * Returns a new object of class '<em>Product Inclusion Exclusion</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Product Inclusion Exclusion</em>'.
   * @generated
   */
  ProductInclusionExclusion createProductInclusionExclusion();

  /**
   * Returns a new object of class '<em>Except Product</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Except Product</em>'.
   * @generated
   */
  ExceptProduct createExceptProduct();

  /**
   * Returns a new object of class '<em>Only Product</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Only Product</em>'.
   * @generated
   */
  OnlyProduct createOnlyProduct();

  /**
   * Returns a new object of class '<em>Rewriting</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rewriting</em>'.
   * @generated
   */
  Rewriting createRewriting();

  /**
   * Returns a new object of class '<em>Multi Values Interpretation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multi Values Interpretation</em>'.
   * @generated
   */
  MultiValuesInterpretation createMultiValuesInterpretation();

  /**
   * Returns a new object of class '<em>Multi Value Interpretation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multi Value Interpretation</em>'.
   * @generated
   */
  MultiValueInterpretation createMultiValueInterpretation();

  /**
   * Returns a new object of class '<em>Or expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Or expr</em>'.
   * @generated
   */
  Or_expr createOr_expr();

  /**
   * Returns a new object of class '<em>And expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And expr</em>'.
   * @generated
   */
  And_expr createAnd_expr();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  VariCellPackage getVariCellPackage();

} //VariCellFactory
