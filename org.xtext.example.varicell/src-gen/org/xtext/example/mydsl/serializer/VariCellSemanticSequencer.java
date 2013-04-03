package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.services.VariCellGrammarAccess;
import org.xtext.example.mydsl.variCell.And_expr;
import org.xtext.example.mydsl.variCell.CSVMultiSeparator;
import org.xtext.example.mydsl.variCell.CSVSeparator;
import org.xtext.example.mydsl.variCell.DataView;
import org.xtext.example.mydsl.variCell.Default;
import org.xtext.example.mydsl.variCell.ExceptFeature;
import org.xtext.example.mydsl.variCell.ExceptProduct;
import org.xtext.example.mydsl.variCell.FeatureInclusionExclusion;
import org.xtext.example.mydsl.variCell.FormatSpecification;
import org.xtext.example.mydsl.variCell.IExpression;
import org.xtext.example.mydsl.variCell.ImportViews;
import org.xtext.example.mydsl.variCell.ItemGeneralization;
import org.xtext.example.mydsl.variCell.ItemMapping;
import org.xtext.example.mydsl.variCell.ItemRelation;
import org.xtext.example.mydsl.variCell.Key;
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
import org.xtext.example.mydsl.variCell.ProductInclusionExclusion;
import org.xtext.example.mydsl.variCell.Rewriting;
import org.xtext.example.mydsl.variCell.SPLName;
import org.xtext.example.mydsl.variCell.SToFMModel;
import org.xtext.example.mydsl.variCell.ScopingView;
import org.xtext.example.mydsl.variCell.StructuringInformation;
import org.xtext.example.mydsl.variCell.SyntacticalInterpretation;
import org.xtext.example.mydsl.variCell.Unknown;
import org.xtext.example.mydsl.variCell.VariCellPackage;
import org.xtext.example.mydsl.variCell.ViewName;

@SuppressWarnings("all")
public class VariCellSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private VariCellGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == VariCellPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case VariCellPackage.AND_EXPR:
				if(context == grammarAccess.getAnd_exprRule() ||
				   context == grammarAccess.getAnd_exprAccess().getAnd_exprLeftAction_1_0() ||
				   context == grammarAccess.getOr_exprRule() ||
				   context == grammarAccess.getOr_exprAccess().getOr_exprLeftAction_1_0() ||
				   context == grammarAccess.getPredicateItemRule() ||
				   context == grammarAccess.getPrimary_exprRule() ||
				   context == grammarAccess.getUnary_exprRule()) {
					sequence_And_expr(context, (And_expr) semanticObject); 
					return; 
				}
				else break;
			case VariCellPackage.CSV_MULTI_SEPARATOR:
				if(context == grammarAccess.getCSVMultiSeparatorRule()) {
					sequence_CSVMultiSeparator(context, (CSVMultiSeparator) semanticObject); 
					return; 
				}
				else break;
			case VariCellPackage.CSV_SEPARATOR:
				if(context == grammarAccess.getCSVSeparatorRule()) {
					sequence_CSVSeparator(context, (CSVSeparator) semanticObject); 
					return; 
				}
				else break;
			case VariCellPackage.DATA_VIEW:
				if(context == grammarAccess.getDataViewRule()) {
					sequence_DataView(context, (DataView) semanticObject); 
					return; 
				}
				else break;
			case VariCellPackage.DEFAULT:
				if(context == grammarAccess.getDefaultRule()) {
					sequence_Default(context, (Default) semanticObject); 
					return; 
				}
				else break;
			case VariCellPackage.EXCEPT_FEATURE:
				if(context == grammarAccess.getExceptFeatureRule()) {
					sequence_ExceptFeature(context, (ExceptFeature) semanticObject); 
					return; 
				}
				else break;
			case VariCellPackage.EXCEPT_PRODUCT:
				if(context == grammarAccess.getExceptProductRule()) {
					sequence_ExceptProduct(context, (ExceptProduct) semanticObject); 
					return; 
				}
				else break;
			case VariCellPackage.FEATURE_INCLUSION_EXCLUSION:
				if(context == grammarAccess.getFeatureInclusionExclusionRule() ||
				   context == grammarAccess.getScopingFeaturesRule()) {
					sequence_FeatureInclusionExclusion(context, (FeatureInclusionExclusion) semanticObject); 
					return; 
				}
				else break;
			case VariCellPackage.FORMAT_SPECIFICATION:
				if(context == grammarAccess.getFormatSpecificationRule()) {
					sequence_FormatSpecification(context, (FormatSpecification) semanticObject); 
					return; 
				}
				else break;
			case VariCellPackage.IEXPRESSION:
				if(context == grammarAccess.getAnd_exprRule() ||
				   context == grammarAccess.getAnd_exprAccess().getAnd_exprLeftAction_1_0() ||
				   context == grammarAccess.getOr_exprRule() ||
				   context == grammarAccess.getOr_exprAccess().getOr_exprLeftAction_1_0() ||
				   context == grammarAccess.getPredicateItemRule() ||
				   context == grammarAccess.getPrimary_exprRule() ||
				   context == grammarAccess.getUnary_exprRule()) {
					sequence_Primary_expr(context, (IExpression) semanticObject); 
					return; 
				}
				else break;
			case VariCellPackage.IMPORT_VIEWS:
				if(context == grammarAccess.getImportViewsRule()) {
					sequence_ImportViews(context, (ImportViews) semanticObject); 
					return; 
				}
				else break;
			case VariCellPackage.ITEM_GENERALIZATION:
				if(context == grammarAccess.getItemGeneralizationRule()) {
					sequence_ItemGeneralization(context, (ItemGeneralization) semanticObject); 
					return; 
				}
				else break;
			case VariCellPackage.ITEM_MAPPING:
				if(context == grammarAccess.getItemMappingRule()) {
					sequence_ItemMapping(context, (ItemMapping) semanticObject); 
					return; 
				}
				else break;
			case VariCellPackage.ITEM_RELATION:
				if(context == grammarAccess.getItemRelationRule()) {
					sequence_ItemRelation(context, (ItemRelation) semanticObject); 
					return; 
				}
				else break;
			case VariCellPackage.KEY:
				if(context == grammarAccess.getKeyRule()) {
					sequence_Key(context, (Key) semanticObject); 
					return; 
				}
				else break;
			case VariCellPackage.MANDATORY:
				if(context == grammarAccess.getMandatoryRule()) {
					sequence_Mandatory(context, (Mandatory) semanticObject); 
					return; 
				}
				else break;
			case VariCellPackage.MULTI_VALUE_INTERPRETATION:
				if(context == grammarAccess.getMultiValueInterpretationRule()) {
					sequence_MultiValueInterpretation(context, (MultiValueInterpretation) semanticObject); 
					return; 
				}
				else break;
			case VariCellPackage.MULTI_VALUES_INTERPRETATION:
				if(context == grammarAccess.getMultiValuesInterpretationRule()) {
					sequence_MultiValuesInterpretation(context, (MultiValuesInterpretation) semanticObject); 
					return; 
				}
				else break;
			case VariCellPackage.NEG_EXPR:
				if(context == grammarAccess.getAnd_exprRule() ||
				   context == grammarAccess.getAnd_exprAccess().getAnd_exprLeftAction_1_0() ||
				   context == grammarAccess.getNeg_exprRule() ||
				   context == grammarAccess.getOr_exprRule() ||
				   context == grammarAccess.getOr_exprAccess().getOr_exprLeftAction_1_0() ||
				   context == grammarAccess.getPredicateItemRule() ||
				   context == grammarAccess.getPrimary_exprRule() ||
				   context == grammarAccess.getUnary_exprRule()) {
					sequence_Neg_expr(context, (Neg_expr) semanticObject); 
					return; 
				}
				else break;
			case VariCellPackage.NOT_PRESENT:
				if(context == grammarAccess.getNotPresentRule()) {
					sequence_NotPresent(context, (NotPresent) semanticObject); 
					return; 
				}
				else break;
			case VariCellPackage.ONLY_FEATURE:
				if(context == grammarAccess.getOnlyFeatureRule()) {
					sequence_OnlyFeature(context, (OnlyFeature) semanticObject); 
					return; 
				}
				else break;
			case VariCellPackage.ONLY_PRODUCT:
				if(context == grammarAccess.getOnlyProductRule()) {
					sequence_OnlyProduct(context, (OnlyProduct) semanticObject); 
					return; 
				}
				else break;
			case VariCellPackage.OPTIONAL:
				if(context == grammarAccess.getOptionalRule()) {
					sequence_Optional(context, (Optional) semanticObject); 
					return; 
				}
				else break;
			case VariCellPackage.OR_EXPR:
				if(context == grammarAccess.getAnd_exprRule() ||
				   context == grammarAccess.getAnd_exprAccess().getAnd_exprLeftAction_1_0() ||
				   context == grammarAccess.getOr_exprRule() ||
				   context == grammarAccess.getOr_exprAccess().getOr_exprLeftAction_1_0() ||
				   context == grammarAccess.getPredicateItemRule() ||
				   context == grammarAccess.getPrimary_exprRule() ||
				   context == grammarAccess.getUnary_exprRule()) {
					sequence_Or_expr(context, (Or_expr) semanticObject); 
					return; 
				}
				else break;
			case VariCellPackage.PARSING_CONFIGURATION:
				if(context == grammarAccess.getParsingConfigurationRule()) {
					sequence_ParsingConfiguration(context, (ParsingConfiguration) semanticObject); 
					return; 
				}
				else break;
			case VariCellPackage.PRODUCT_INCLUSION_EXCLUSION:
				if(context == grammarAccess.getProductInclusionExclusionRule() ||
				   context == grammarAccess.getScopingProductsRule()) {
					sequence_ProductInclusionExclusion(context, (ProductInclusionExclusion) semanticObject); 
					return; 
				}
				else break;
			case VariCellPackage.REWRITING:
				if(context == grammarAccess.getRewritingRule()) {
					sequence_Rewriting(context, (Rewriting) semanticObject); 
					return; 
				}
				else break;
			case VariCellPackage.SPL_NAME:
				if(context == grammarAccess.getSPLNameRule()) {
					sequence_SPLName(context, (SPLName) semanticObject); 
					return; 
				}
				else break;
			case VariCellPackage.STO_FM_MODEL:
				if(context == grammarAccess.getSToFMModelRule()) {
					sequence_SToFMModel(context, (SToFMModel) semanticObject); 
					return; 
				}
				else break;
			case VariCellPackage.SCOPING_VIEW:
				if(context == grammarAccess.getScopingViewRule()) {
					sequence_ScopingView(context, (ScopingView) semanticObject); 
					return; 
				}
				else break;
			case VariCellPackage.STRUCTURING_INFORMATION:
				if(context == grammarAccess.getStructuringInformationRule()) {
					sequence_StructuringInformation(context, (StructuringInformation) semanticObject); 
					return; 
				}
				else break;
			case VariCellPackage.SYNTACTICAL_INTERPRETATION:
				if(context == grammarAccess.getSyntacticalInterpretationRule()) {
					sequence_SyntacticalInterpretation(context, (SyntacticalInterpretation) semanticObject); 
					return; 
				}
				else break;
			case VariCellPackage.UNKNOWN:
				if(context == grammarAccess.getUnknownRule()) {
					sequence_Unknown(context, (Unknown) semanticObject); 
					return; 
				}
				else break;
			case VariCellPackage.VIEW_NAME:
				if(context == grammarAccess.getViewNameRule()) {
					sequence_ViewName(context, (ViewName) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (left=And_expr_And_expr_1_0 right=Unary_expr)
	 */
	protected void sequence_And_expr(EObject context, And_expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     seps+=STRING+
	 */
	protected void sequence_CSVMultiSeparator(EObject context, CSVMultiSeparator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     sep=STRING
	 */
	protected void sequence_CSVSeparator(EObject context, CSVSeparator semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VariCellPackage.Literals.CSV_SEPARATOR__SEP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VariCellPackage.Literals.CSV_SEPARATOR__SEP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCSVSeparatorAccess().getSepSTRINGTerminalRuleCall_1_0(), semanticObject.getSep());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (file=STRING viewname=ID?)
	 */
	protected void sequence_DataView(EObject context, DataView semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (configs=ParsingConfiguration? products=ScopingProducts?)
	 */
	protected void sequence_Default(EObject context, Default semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (fts+=ID | fts+=STRING)+
	 */
	protected void sequence_ExceptFeature(EObject context, ExceptFeature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (pds+=ID | pds+=STRING)+
	 */
	protected void sequence_ExceptProduct(EObject context, ExceptProduct semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (except=ExceptFeature | only=OnlyFeature)
	 */
	protected void sequence_FeatureInclusionExclusion(EObject context, FeatureInclusionExclusion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     fileformat=FileFormat
	 */
	protected void sequence_FormatSpecification(EObject context, FormatSpecification semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VariCellPackage.Literals.FORMAT_SPECIFICATION__FILEFORMAT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VariCellPackage.Literals.FORMAT_SPECIFICATION__FILEFORMAT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFormatSpecificationAccess().getFileformatFileFormatEnumRuleCall_1_0(), semanticObject.getFileformat());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     views+=DataView+
	 */
	protected void sequence_ImportViews(EObject context, ImportViews semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((generalize=ID | generalize=STRING) (views+=ID | views+=STRING)+)
	 */
	protected void sequence_ItemGeneralization(EObject context, ItemGeneralization semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((item=ID | item=STRING) (act='replace' | act='correspondsTo') pfts=PredicateItem)
	 */
	protected void sequence_ItemMapping(EObject context, ItemMapping semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((view1=ID | view1=STRING) rel=KindRelation (view2=ID | view2=STRING))
	 */
	protected void sequence_ItemRelation(EObject context, ItemRelation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     cid+=STRING+
	 */
	protected void sequence_Key(EObject context, Key semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     values+=STRING+
	 */
	protected void sequence_Mandatory(EObject context, Mandatory semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((val=ID | val=STRING) variability=VariabilityInterpretation)
	 */
	protected void sequence_MultiValueInterpretation(EObject context, MultiValueInterpretation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     multi+=MultiValueInterpretation+
	 */
	protected void sequence_MultiValuesInterpretation(EObject context, MultiValuesInterpretation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expr=Primary_expr
	 */
	protected void sequence_Neg_expr(EObject context, Neg_expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     values+=STRING+
	 */
	protected void sequence_NotPresent(EObject context, NotPresent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (fts+=ID | fts+=STRING)+
	 */
	protected void sequence_OnlyFeature(EObject context, OnlyFeature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (pds+=ID | pds+=STRING)+
	 */
	protected void sequence_OnlyProduct(EObject context, OnlyProduct semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     values+=STRING+
	 */
	protected void sequence_Optional(EObject context, Optional semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Or_expr_Or_expr_1_0 right=And_expr)
	 */
	protected void sequence_Or_expr(EObject context, Or_expr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (productID=Key? format=FormatSpecification? sinterpret=SyntacticalInterpretation? separator=CSVSeparator? mseparator=CSVMultiSeparator?)
	 */
	protected void sequence_ParsingConfiguration(EObject context, ParsingConfiguration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID | name=STRING)
	 */
	protected void sequence_Primary_expr(EObject context, IExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (except=ExceptProduct | only=OnlyProduct)
	 */
	protected void sequence_ProductInclusionExclusion(EObject context, ProductInclusionExclusion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((oft=ID | oft=STRING) nft=STRING)
	 */
	protected void sequence_Rewriting(EObject context, Rewriting semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=STRING | name=ID)
	 */
	protected void sequence_SPLName(EObject context, SPLName semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (importViews=ImportViews splName=SPLName schema=StructuringInformation? default=Default? scoping+=ScopingView*)
	 */
	protected void sequence_SToFMModel(EObject context, SToFMModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         view=ID 
	 *         viewname=ViewName? 
	 *         schema=StructuringInformation? 
	 *         config=ParsingConfiguration? 
	 *         products=ScopingProducts? 
	 *         fts=ScopingFeatures? 
	 *         alignment=Rewriting? 
	 *         interpretation=MultiValuesInterpretation?
	 *     )
	 */
	protected void sequence_ScopingView(EObject context, ScopingView semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (relations+=ItemRelation* abstract+=ItemGeneralization* mp+=ItemMapping*)
	 */
	protected void sequence_StructuringInformation(EObject context, StructuringInformation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (opt=Optional? yes=Mandatory? no=NotPresent? na=Unknown?)
	 */
	protected void sequence_SyntacticalInterpretation(EObject context, SyntacticalInterpretation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     values+=STRING+
	 */
	protected void sequence_Unknown(EObject context, Unknown semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=STRING
	 */
	protected void sequence_ViewName(EObject context, ViewName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VariCellPackage.Literals.VIEW_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VariCellPackage.Literals.VIEW_NAME__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getViewNameAccess().getNameSTRINGTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
}
