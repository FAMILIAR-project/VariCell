/*
* generated by Xtext
*/
package org.xtext.example.mydsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.xtext.example.mydsl.services.VariCellGrammarAccess;

public class VariCellParser extends AbstractContentAssistParser {
	
	@Inject
	private VariCellGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalVariCellParser createParser() {
		org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalVariCellParser result = new org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalVariCellParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getSPLNameAccess().getNameAlternatives_1_0(), "rule__SPLName__NameAlternatives_1_0");
					put(grammarAccess.getItemRelationAccess().getView1Alternatives_0_0(), "rule__ItemRelation__View1Alternatives_0_0");
					put(grammarAccess.getItemRelationAccess().getView2Alternatives_2_0(), "rule__ItemRelation__View2Alternatives_2_0");
					put(grammarAccess.getItemGeneralizationAccess().getGeneralizeAlternatives_0_0(), "rule__ItemGeneralization__GeneralizeAlternatives_0_0");
					put(grammarAccess.getItemGeneralizationAccess().getAlternatives_1(), "rule__ItemGeneralization__Alternatives_1");
					put(grammarAccess.getItemGeneralizationAccess().getViewsAlternatives_2_0(), "rule__ItemGeneralization__ViewsAlternatives_2_0");
					put(grammarAccess.getItemMappingAccess().getItemAlternatives_0_0(), "rule__ItemMapping__ItemAlternatives_0_0");
					put(grammarAccess.getItemMappingAccess().getActAlternatives_1_0(), "rule__ItemMapping__ActAlternatives_1_0");
					put(grammarAccess.getUnary_exprAccess().getAlternatives(), "rule__Unary_expr__Alternatives");
					put(grammarAccess.getPrimary_exprAccess().getAlternatives(), "rule__Primary_expr__Alternatives");
					put(grammarAccess.getPrimary_exprAccess().getNameAlternatives_0_0(), "rule__Primary_expr__NameAlternatives_0_0");
					put(grammarAccess.getDefaultAccess().getAlternatives_1(), "rule__Default__Alternatives_1");
					put(grammarAccess.getFeatureInclusionExclusionAccess().getAlternatives(), "rule__FeatureInclusionExclusion__Alternatives");
					put(grammarAccess.getExceptFeatureAccess().getFtsAlternatives_1_0(), "rule__ExceptFeature__FtsAlternatives_1_0");
					put(grammarAccess.getOnlyFeatureAccess().getFtsAlternatives_1_0(), "rule__OnlyFeature__FtsAlternatives_1_0");
					put(grammarAccess.getProductInclusionExclusionAccess().getAlternatives(), "rule__ProductInclusionExclusion__Alternatives");
					put(grammarAccess.getExceptProductAccess().getPdsAlternatives_1_0(), "rule__ExceptProduct__PdsAlternatives_1_0");
					put(grammarAccess.getOnlyProductAccess().getPdsAlternatives_1_0(), "rule__OnlyProduct__PdsAlternatives_1_0");
					put(grammarAccess.getRewritingAccess().getAlternatives_0(), "rule__Rewriting__Alternatives_0");
					put(grammarAccess.getRewritingAccess().getOftAlternatives_1_0(), "rule__Rewriting__OftAlternatives_1_0");
					put(grammarAccess.getMultiValueInterpretationAccess().getValAlternatives_0_0(), "rule__MultiValueInterpretation__ValAlternatives_0_0");
					put(grammarAccess.getKindRelationAccess().getAlternatives(), "rule__KindRelation__Alternatives");
					put(grammarAccess.getFileFormatAccess().getAlternatives(), "rule__FileFormat__Alternatives");
					put(grammarAccess.getVariabilityInterpretationAccess().getAlternatives(), "rule__VariabilityInterpretation__Alternatives");
					put(grammarAccess.getSToFMModelAccess().getGroup(), "rule__SToFMModel__Group__0");
					put(grammarAccess.getImportViewsAccess().getGroup(), "rule__ImportViews__Group__0");
					put(grammarAccess.getDataViewAccess().getGroup(), "rule__DataView__Group__0");
					put(grammarAccess.getDataViewAccess().getGroup_1(), "rule__DataView__Group_1__0");
					put(grammarAccess.getSPLNameAccess().getGroup(), "rule__SPLName__Group__0");
					put(grammarAccess.getStructuringInformationAccess().getGroup(), "rule__StructuringInformation__Group__0");
					put(grammarAccess.getItemRelationAccess().getGroup(), "rule__ItemRelation__Group__0");
					put(grammarAccess.getItemGeneralizationAccess().getGroup(), "rule__ItemGeneralization__Group__0");
					put(grammarAccess.getItemMappingAccess().getGroup(), "rule__ItemMapping__Group__0");
					put(grammarAccess.getOr_exprAccess().getGroup(), "rule__Or_expr__Group__0");
					put(grammarAccess.getOr_exprAccess().getGroup_1(), "rule__Or_expr__Group_1__0");
					put(grammarAccess.getAnd_exprAccess().getGroup(), "rule__And_expr__Group__0");
					put(grammarAccess.getAnd_exprAccess().getGroup_1(), "rule__And_expr__Group_1__0");
					put(grammarAccess.getNeg_exprAccess().getGroup(), "rule__Neg_expr__Group__0");
					put(grammarAccess.getPrimary_exprAccess().getGroup_1(), "rule__Primary_expr__Group_1__0");
					put(grammarAccess.getDefaultAccess().getGroup(), "rule__Default__Group__0");
					put(grammarAccess.getParsingConfigurationAccess().getGroup(), "rule__ParsingConfiguration__Group__0");
					put(grammarAccess.getFormatSpecificationAccess().getGroup(), "rule__FormatSpecification__Group__0");
					put(grammarAccess.getSyntacticalInterpretationAccess().getGroup(), "rule__SyntacticalInterpretation__Group__0");
					put(grammarAccess.getKeyAccess().getGroup(), "rule__Key__Group__0");
					put(grammarAccess.getCSVSeparatorAccess().getGroup(), "rule__CSVSeparator__Group__0");
					put(grammarAccess.getCSVMultiSeparatorAccess().getGroup(), "rule__CSVMultiSeparator__Group__0");
					put(grammarAccess.getOptionalAccess().getGroup(), "rule__Optional__Group__0");
					put(grammarAccess.getMandatoryAccess().getGroup(), "rule__Mandatory__Group__0");
					put(grammarAccess.getNotPresentAccess().getGroup(), "rule__NotPresent__Group__0");
					put(grammarAccess.getUnknownAccess().getGroup(), "rule__Unknown__Group__0");
					put(grammarAccess.getScopingViewAccess().getGroup(), "rule__ScopingView__Group__0");
					put(grammarAccess.getViewNameAccess().getGroup(), "rule__ViewName__Group__0");
					put(grammarAccess.getExceptFeatureAccess().getGroup(), "rule__ExceptFeature__Group__0");
					put(grammarAccess.getOnlyFeatureAccess().getGroup(), "rule__OnlyFeature__Group__0");
					put(grammarAccess.getExceptProductAccess().getGroup(), "rule__ExceptProduct__Group__0");
					put(grammarAccess.getOnlyProductAccess().getGroup(), "rule__OnlyProduct__Group__0");
					put(grammarAccess.getRewritingAccess().getGroup(), "rule__Rewriting__Group__0");
					put(grammarAccess.getMultiValuesInterpretationAccess().getGroup(), "rule__MultiValuesInterpretation__Group__0");
					put(grammarAccess.getMultiValueInterpretationAccess().getGroup(), "rule__MultiValueInterpretation__Group__0");
					put(grammarAccess.getSToFMModelAccess().getImportViewsAssignment_0(), "rule__SToFMModel__ImportViewsAssignment_0");
					put(grammarAccess.getSToFMModelAccess().getSplNameAssignment_1(), "rule__SToFMModel__SplNameAssignment_1");
					put(grammarAccess.getSToFMModelAccess().getSchemaAssignment_2(), "rule__SToFMModel__SchemaAssignment_2");
					put(grammarAccess.getSToFMModelAccess().getDefaultAssignment_3(), "rule__SToFMModel__DefaultAssignment_3");
					put(grammarAccess.getSToFMModelAccess().getScopingAssignment_4(), "rule__SToFMModel__ScopingAssignment_4");
					put(grammarAccess.getImportViewsAccess().getViewsAssignment_1(), "rule__ImportViews__ViewsAssignment_1");
					put(grammarAccess.getDataViewAccess().getFileAssignment_0(), "rule__DataView__FileAssignment_0");
					put(grammarAccess.getDataViewAccess().getViewnameAssignment_1_1(), "rule__DataView__ViewnameAssignment_1_1");
					put(grammarAccess.getSPLNameAccess().getNameAssignment_1(), "rule__SPLName__NameAssignment_1");
					put(grammarAccess.getStructuringInformationAccess().getRelationsAssignment_2(), "rule__StructuringInformation__RelationsAssignment_2");
					put(grammarAccess.getStructuringInformationAccess().getAbstractAssignment_3(), "rule__StructuringInformation__AbstractAssignment_3");
					put(grammarAccess.getStructuringInformationAccess().getMpAssignment_4(), "rule__StructuringInformation__MpAssignment_4");
					put(grammarAccess.getItemRelationAccess().getView1Assignment_0(), "rule__ItemRelation__View1Assignment_0");
					put(grammarAccess.getItemRelationAccess().getRelAssignment_1(), "rule__ItemRelation__RelAssignment_1");
					put(grammarAccess.getItemRelationAccess().getView2Assignment_2(), "rule__ItemRelation__View2Assignment_2");
					put(grammarAccess.getItemGeneralizationAccess().getGeneralizeAssignment_0(), "rule__ItemGeneralization__GeneralizeAssignment_0");
					put(grammarAccess.getItemGeneralizationAccess().getViewsAssignment_2(), "rule__ItemGeneralization__ViewsAssignment_2");
					put(grammarAccess.getItemMappingAccess().getItemAssignment_0(), "rule__ItemMapping__ItemAssignment_0");
					put(grammarAccess.getItemMappingAccess().getActAssignment_1(), "rule__ItemMapping__ActAssignment_1");
					put(grammarAccess.getItemMappingAccess().getPftsAssignment_2(), "rule__ItemMapping__PftsAssignment_2");
					put(grammarAccess.getOr_exprAccess().getRightAssignment_1_2(), "rule__Or_expr__RightAssignment_1_2");
					put(grammarAccess.getAnd_exprAccess().getRightAssignment_1_2(), "rule__And_expr__RightAssignment_1_2");
					put(grammarAccess.getNeg_exprAccess().getExprAssignment_1(), "rule__Neg_expr__ExprAssignment_1");
					put(grammarAccess.getPrimary_exprAccess().getNameAssignment_0(), "rule__Primary_expr__NameAssignment_0");
					put(grammarAccess.getDefaultAccess().getConfigsAssignment_2(), "rule__Default__ConfigsAssignment_2");
					put(grammarAccess.getDefaultAccess().getProductsAssignment_3(), "rule__Default__ProductsAssignment_3");
					put(grammarAccess.getParsingConfigurationAccess().getProductIDAssignment_2(), "rule__ParsingConfiguration__ProductIDAssignment_2");
					put(grammarAccess.getParsingConfigurationAccess().getFormatAssignment_3(), "rule__ParsingConfiguration__FormatAssignment_3");
					put(grammarAccess.getParsingConfigurationAccess().getSinterpretAssignment_4(), "rule__ParsingConfiguration__SinterpretAssignment_4");
					put(grammarAccess.getParsingConfigurationAccess().getSeparatorAssignment_5(), "rule__ParsingConfiguration__SeparatorAssignment_5");
					put(grammarAccess.getParsingConfigurationAccess().getMseparatorAssignment_6(), "rule__ParsingConfiguration__MseparatorAssignment_6");
					put(grammarAccess.getFormatSpecificationAccess().getFileformatAssignment_1(), "rule__FormatSpecification__FileformatAssignment_1");
					put(grammarAccess.getSyntacticalInterpretationAccess().getOptAssignment_2(), "rule__SyntacticalInterpretation__OptAssignment_2");
					put(grammarAccess.getSyntacticalInterpretationAccess().getYesAssignment_3(), "rule__SyntacticalInterpretation__YesAssignment_3");
					put(grammarAccess.getSyntacticalInterpretationAccess().getNoAssignment_4(), "rule__SyntacticalInterpretation__NoAssignment_4");
					put(grammarAccess.getSyntacticalInterpretationAccess().getNaAssignment_5(), "rule__SyntacticalInterpretation__NaAssignment_5");
					put(grammarAccess.getKeyAccess().getCidAssignment_1(), "rule__Key__CidAssignment_1");
					put(grammarAccess.getCSVSeparatorAccess().getSepAssignment_1(), "rule__CSVSeparator__SepAssignment_1");
					put(grammarAccess.getCSVMultiSeparatorAccess().getSepsAssignment_1(), "rule__CSVMultiSeparator__SepsAssignment_1");
					put(grammarAccess.getOptionalAccess().getValuesAssignment_1(), "rule__Optional__ValuesAssignment_1");
					put(grammarAccess.getMandatoryAccess().getValuesAssignment_1(), "rule__Mandatory__ValuesAssignment_1");
					put(grammarAccess.getNotPresentAccess().getValuesAssignment_1(), "rule__NotPresent__ValuesAssignment_1");
					put(grammarAccess.getUnknownAccess().getValuesAssignment_1(), "rule__Unknown__ValuesAssignment_1");
					put(grammarAccess.getScopingViewAccess().getViewAssignment_1(), "rule__ScopingView__ViewAssignment_1");
					put(grammarAccess.getScopingViewAccess().getViewnameAssignment_2(), "rule__ScopingView__ViewnameAssignment_2");
					put(grammarAccess.getScopingViewAccess().getSchemaAssignment_3(), "rule__ScopingView__SchemaAssignment_3");
					put(grammarAccess.getScopingViewAccess().getConfigAssignment_4(), "rule__ScopingView__ConfigAssignment_4");
					put(grammarAccess.getScopingViewAccess().getProductsAssignment_5(), "rule__ScopingView__ProductsAssignment_5");
					put(grammarAccess.getScopingViewAccess().getFtsAssignment_6(), "rule__ScopingView__FtsAssignment_6");
					put(grammarAccess.getScopingViewAccess().getAlignmentAssignment_7(), "rule__ScopingView__AlignmentAssignment_7");
					put(grammarAccess.getScopingViewAccess().getInterpretationAssignment_8(), "rule__ScopingView__InterpretationAssignment_8");
					put(grammarAccess.getViewNameAccess().getNameAssignment_1(), "rule__ViewName__NameAssignment_1");
					put(grammarAccess.getFeatureInclusionExclusionAccess().getExceptAssignment_0(), "rule__FeatureInclusionExclusion__ExceptAssignment_0");
					put(grammarAccess.getFeatureInclusionExclusionAccess().getOnlyAssignment_1(), "rule__FeatureInclusionExclusion__OnlyAssignment_1");
					put(grammarAccess.getExceptFeatureAccess().getFtsAssignment_1(), "rule__ExceptFeature__FtsAssignment_1");
					put(grammarAccess.getOnlyFeatureAccess().getFtsAssignment_1(), "rule__OnlyFeature__FtsAssignment_1");
					put(grammarAccess.getProductInclusionExclusionAccess().getExceptAssignment_0(), "rule__ProductInclusionExclusion__ExceptAssignment_0");
					put(grammarAccess.getProductInclusionExclusionAccess().getOnlyAssignment_1(), "rule__ProductInclusionExclusion__OnlyAssignment_1");
					put(grammarAccess.getExceptProductAccess().getPdsAssignment_1(), "rule__ExceptProduct__PdsAssignment_1");
					put(grammarAccess.getOnlyProductAccess().getPdsAssignment_1(), "rule__OnlyProduct__PdsAssignment_1");
					put(grammarAccess.getRewritingAccess().getOftAssignment_1(), "rule__Rewriting__OftAssignment_1");
					put(grammarAccess.getRewritingAccess().getNftAssignment_3(), "rule__Rewriting__NftAssignment_3");
					put(grammarAccess.getMultiValuesInterpretationAccess().getMultiAssignment_1(), "rule__MultiValuesInterpretation__MultiAssignment_1");
					put(grammarAccess.getMultiValueInterpretationAccess().getValAssignment_0(), "rule__MultiValueInterpretation__ValAssignment_0");
					put(grammarAccess.getMultiValueInterpretationAccess().getVariabilityAssignment_2(), "rule__MultiValueInterpretation__VariabilityAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalVariCellParser typedParser = (org.xtext.example.mydsl.ui.contentassist.antlr.internal.InternalVariCellParser) parser;
			typedParser.entryRuleSToFMModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public VariCellGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(VariCellGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
