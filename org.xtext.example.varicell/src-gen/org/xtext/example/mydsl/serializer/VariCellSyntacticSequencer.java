package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.mydsl.services.VariCellGrammarAccess;

@SuppressWarnings("all")
public class VariCellSyntacticSequencer extends AbstractSyntacticSequencer {

	protected VariCellGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Default_AllKeyword_1_2_or_AllviewsKeyword_1_1_or_DefaultKeyword_1_0;
	protected AbstractElementAlias match_ItemGeneralization_AbstractKeyword_1_1_or_GeneralizeKeyword_1_0;
	protected AbstractElementAlias match_Primary_expr_LeftParenthesisKeyword_1_0_a;
	protected AbstractElementAlias match_Primary_expr_LeftParenthesisKeyword_1_0_p;
	protected AbstractElementAlias match_Rewriting_RenamingKeyword_0_1_or_RewritingKeyword_0_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (VariCellGrammarAccess) access;
		match_Default_AllKeyword_1_2_or_AllviewsKeyword_1_1_or_DefaultKeyword_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getDefaultAccess().getAllKeyword_1_2()), new TokenAlias(false, false, grammarAccess.getDefaultAccess().getAllviewsKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getDefaultAccess().getDefaultKeyword_1_0()));
		match_ItemGeneralization_AbstractKeyword_1_1_or_GeneralizeKeyword_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getItemGeneralizationAccess().getAbstractKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getItemGeneralizationAccess().getGeneralizeKeyword_1_0()));
		match_Primary_expr_LeftParenthesisKeyword_1_0_a = new TokenAlias(true, true, grammarAccess.getPrimary_exprAccess().getLeftParenthesisKeyword_1_0());
		match_Primary_expr_LeftParenthesisKeyword_1_0_p = new TokenAlias(true, false, grammarAccess.getPrimary_exprAccess().getLeftParenthesisKeyword_1_0());
		match_Rewriting_RenamingKeyword_0_1_or_RewritingKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getRewritingAccess().getRenamingKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getRewritingAccess().getRewritingKeyword_0_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Default_AllKeyword_1_2_or_AllviewsKeyword_1_1_or_DefaultKeyword_1_0.equals(syntax))
				emit_Default_AllKeyword_1_2_or_AllviewsKeyword_1_1_or_DefaultKeyword_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ItemGeneralization_AbstractKeyword_1_1_or_GeneralizeKeyword_1_0.equals(syntax))
				emit_ItemGeneralization_AbstractKeyword_1_1_or_GeneralizeKeyword_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Primary_expr_LeftParenthesisKeyword_1_0_a.equals(syntax))
				emit_Primary_expr_LeftParenthesisKeyword_1_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Primary_expr_LeftParenthesisKeyword_1_0_p.equals(syntax))
				emit_Primary_expr_LeftParenthesisKeyword_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Rewriting_RenamingKeyword_0_1_or_RewritingKeyword_0_0.equals(syntax))
				emit_Rewriting_RenamingKeyword_0_1_or_RewritingKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'allviews:' | 'all:' | 'default:'
	 */
	protected void emit_Default_AllKeyword_1_2_or_AllviewsKeyword_1_1_or_DefaultKeyword_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'generalize' | 'abstract'
	 */
	protected void emit_ItemGeneralization_AbstractKeyword_1_1_or_GeneralizeKeyword_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_Primary_expr_LeftParenthesisKeyword_1_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_Primary_expr_LeftParenthesisKeyword_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'rewriting:' | 'renaming:'
	 */
	protected void emit_Rewriting_RenamingKeyword_0_1_or_RewritingKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
