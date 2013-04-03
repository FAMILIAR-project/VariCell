package org.xtext.example.mydsl.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.VariCellGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVariCellParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'generalize'", "'abstract'", "'replace'", "'correspondsTo'", "'default:'", "'allviews:'", "'all:'", "'rewriting:'", "'renaming:'", "'below'", "'above'", "'moveIn'", "'copyIn'", "'CSV'", "'RDF'", "'XML'", "'Alternatives'", "'OR-Alternatives'", "'Optional'", "'Mandatory'", "'Concat'", "'import:'", "'as'", "'name:'", "'structure:'", "'or'", "'and'", "'not'", "'('", "')'", "'parsing:'", "'format:'", "'variability:'", "'key:'", "'separator:'", "'multivalued_separator:'", "'optional:'", "'mandatory:'", "'notpresent:'", "'unknown:'", "'view:'", "'rootname:'", "'except_features:'", "'only_features:'", "'except_products:'", "'only_products:'", "'=>'", "'multivalues:'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalVariCellParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVariCellParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVariCellParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g"; }


     
     	private VariCellGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(VariCellGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleSToFMModel"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:60:1: entryRuleSToFMModel : ruleSToFMModel EOF ;
    public final void entryRuleSToFMModel() throws RecognitionException {
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:61:1: ( ruleSToFMModel EOF )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:62:1: ruleSToFMModel EOF
            {
             before(grammarAccess.getSToFMModelRule()); 
            pushFollow(FOLLOW_ruleSToFMModel_in_entryRuleSToFMModel61);
            ruleSToFMModel();

            state._fsp--;

             after(grammarAccess.getSToFMModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSToFMModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSToFMModel"


    // $ANTLR start "ruleSToFMModel"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:69:1: ruleSToFMModel : ( ( rule__SToFMModel__Group__0 ) ) ;
    public final void ruleSToFMModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:73:2: ( ( ( rule__SToFMModel__Group__0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:74:1: ( ( rule__SToFMModel__Group__0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:74:1: ( ( rule__SToFMModel__Group__0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:75:1: ( rule__SToFMModel__Group__0 )
            {
             before(grammarAccess.getSToFMModelAccess().getGroup()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:76:1: ( rule__SToFMModel__Group__0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:76:2: rule__SToFMModel__Group__0
            {
            pushFollow(FOLLOW_rule__SToFMModel__Group__0_in_ruleSToFMModel94);
            rule__SToFMModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSToFMModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSToFMModel"


    // $ANTLR start "entryRuleImportViews"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:88:1: entryRuleImportViews : ruleImportViews EOF ;
    public final void entryRuleImportViews() throws RecognitionException {
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:89:1: ( ruleImportViews EOF )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:90:1: ruleImportViews EOF
            {
             before(grammarAccess.getImportViewsRule()); 
            pushFollow(FOLLOW_ruleImportViews_in_entryRuleImportViews121);
            ruleImportViews();

            state._fsp--;

             after(grammarAccess.getImportViewsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportViews128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImportViews"


    // $ANTLR start "ruleImportViews"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:97:1: ruleImportViews : ( ( rule__ImportViews__Group__0 ) ) ;
    public final void ruleImportViews() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:101:2: ( ( ( rule__ImportViews__Group__0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:102:1: ( ( rule__ImportViews__Group__0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:102:1: ( ( rule__ImportViews__Group__0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:103:1: ( rule__ImportViews__Group__0 )
            {
             before(grammarAccess.getImportViewsAccess().getGroup()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:104:1: ( rule__ImportViews__Group__0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:104:2: rule__ImportViews__Group__0
            {
            pushFollow(FOLLOW_rule__ImportViews__Group__0_in_ruleImportViews154);
            rule__ImportViews__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportViewsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImportViews"


    // $ANTLR start "entryRuleDataView"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:116:1: entryRuleDataView : ruleDataView EOF ;
    public final void entryRuleDataView() throws RecognitionException {
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:117:1: ( ruleDataView EOF )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:118:1: ruleDataView EOF
            {
             before(grammarAccess.getDataViewRule()); 
            pushFollow(FOLLOW_ruleDataView_in_entryRuleDataView181);
            ruleDataView();

            state._fsp--;

             after(grammarAccess.getDataViewRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataView188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataView"


    // $ANTLR start "ruleDataView"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:125:1: ruleDataView : ( ( rule__DataView__Group__0 ) ) ;
    public final void ruleDataView() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:129:2: ( ( ( rule__DataView__Group__0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:130:1: ( ( rule__DataView__Group__0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:130:1: ( ( rule__DataView__Group__0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:131:1: ( rule__DataView__Group__0 )
            {
             before(grammarAccess.getDataViewAccess().getGroup()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:132:1: ( rule__DataView__Group__0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:132:2: rule__DataView__Group__0
            {
            pushFollow(FOLLOW_rule__DataView__Group__0_in_ruleDataView214);
            rule__DataView__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataViewAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataView"


    // $ANTLR start "entryRuleSPLName"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:144:1: entryRuleSPLName : ruleSPLName EOF ;
    public final void entryRuleSPLName() throws RecognitionException {
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:145:1: ( ruleSPLName EOF )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:146:1: ruleSPLName EOF
            {
             before(grammarAccess.getSPLNameRule()); 
            pushFollow(FOLLOW_ruleSPLName_in_entryRuleSPLName241);
            ruleSPLName();

            state._fsp--;

             after(grammarAccess.getSPLNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSPLName248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSPLName"


    // $ANTLR start "ruleSPLName"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:153:1: ruleSPLName : ( ( rule__SPLName__Group__0 ) ) ;
    public final void ruleSPLName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:157:2: ( ( ( rule__SPLName__Group__0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:158:1: ( ( rule__SPLName__Group__0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:158:1: ( ( rule__SPLName__Group__0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:159:1: ( rule__SPLName__Group__0 )
            {
             before(grammarAccess.getSPLNameAccess().getGroup()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:160:1: ( rule__SPLName__Group__0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:160:2: rule__SPLName__Group__0
            {
            pushFollow(FOLLOW_rule__SPLName__Group__0_in_ruleSPLName274);
            rule__SPLName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSPLNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSPLName"


    // $ANTLR start "entryRuleStructuringInformation"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:172:1: entryRuleStructuringInformation : ruleStructuringInformation EOF ;
    public final void entryRuleStructuringInformation() throws RecognitionException {
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:173:1: ( ruleStructuringInformation EOF )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:174:1: ruleStructuringInformation EOF
            {
             before(grammarAccess.getStructuringInformationRule()); 
            pushFollow(FOLLOW_ruleStructuringInformation_in_entryRuleStructuringInformation301);
            ruleStructuringInformation();

            state._fsp--;

             after(grammarAccess.getStructuringInformationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructuringInformation308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStructuringInformation"


    // $ANTLR start "ruleStructuringInformation"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:181:1: ruleStructuringInformation : ( ( rule__StructuringInformation__Group__0 ) ) ;
    public final void ruleStructuringInformation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:185:2: ( ( ( rule__StructuringInformation__Group__0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:186:1: ( ( rule__StructuringInformation__Group__0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:186:1: ( ( rule__StructuringInformation__Group__0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:187:1: ( rule__StructuringInformation__Group__0 )
            {
             before(grammarAccess.getStructuringInformationAccess().getGroup()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:188:1: ( rule__StructuringInformation__Group__0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:188:2: rule__StructuringInformation__Group__0
            {
            pushFollow(FOLLOW_rule__StructuringInformation__Group__0_in_ruleStructuringInformation334);
            rule__StructuringInformation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStructuringInformationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStructuringInformation"


    // $ANTLR start "entryRuleItemRelation"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:200:1: entryRuleItemRelation : ruleItemRelation EOF ;
    public final void entryRuleItemRelation() throws RecognitionException {
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:201:1: ( ruleItemRelation EOF )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:202:1: ruleItemRelation EOF
            {
             before(grammarAccess.getItemRelationRule()); 
            pushFollow(FOLLOW_ruleItemRelation_in_entryRuleItemRelation361);
            ruleItemRelation();

            state._fsp--;

             after(grammarAccess.getItemRelationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItemRelation368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleItemRelation"


    // $ANTLR start "ruleItemRelation"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:209:1: ruleItemRelation : ( ( rule__ItemRelation__Group__0 ) ) ;
    public final void ruleItemRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:213:2: ( ( ( rule__ItemRelation__Group__0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:214:1: ( ( rule__ItemRelation__Group__0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:214:1: ( ( rule__ItemRelation__Group__0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:215:1: ( rule__ItemRelation__Group__0 )
            {
             before(grammarAccess.getItemRelationAccess().getGroup()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:216:1: ( rule__ItemRelation__Group__0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:216:2: rule__ItemRelation__Group__0
            {
            pushFollow(FOLLOW_rule__ItemRelation__Group__0_in_ruleItemRelation394);
            rule__ItemRelation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getItemRelationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItemRelation"


    // $ANTLR start "entryRuleItemGeneralization"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:228:1: entryRuleItemGeneralization : ruleItemGeneralization EOF ;
    public final void entryRuleItemGeneralization() throws RecognitionException {
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:229:1: ( ruleItemGeneralization EOF )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:230:1: ruleItemGeneralization EOF
            {
             before(grammarAccess.getItemGeneralizationRule()); 
            pushFollow(FOLLOW_ruleItemGeneralization_in_entryRuleItemGeneralization421);
            ruleItemGeneralization();

            state._fsp--;

             after(grammarAccess.getItemGeneralizationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItemGeneralization428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleItemGeneralization"


    // $ANTLR start "ruleItemGeneralization"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:237:1: ruleItemGeneralization : ( ( rule__ItemGeneralization__Group__0 ) ) ;
    public final void ruleItemGeneralization() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:241:2: ( ( ( rule__ItemGeneralization__Group__0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:242:1: ( ( rule__ItemGeneralization__Group__0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:242:1: ( ( rule__ItemGeneralization__Group__0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:243:1: ( rule__ItemGeneralization__Group__0 )
            {
             before(grammarAccess.getItemGeneralizationAccess().getGroup()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:244:1: ( rule__ItemGeneralization__Group__0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:244:2: rule__ItemGeneralization__Group__0
            {
            pushFollow(FOLLOW_rule__ItemGeneralization__Group__0_in_ruleItemGeneralization454);
            rule__ItemGeneralization__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getItemGeneralizationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItemGeneralization"


    // $ANTLR start "entryRuleItemMapping"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:256:1: entryRuleItemMapping : ruleItemMapping EOF ;
    public final void entryRuleItemMapping() throws RecognitionException {
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:257:1: ( ruleItemMapping EOF )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:258:1: ruleItemMapping EOF
            {
             before(grammarAccess.getItemMappingRule()); 
            pushFollow(FOLLOW_ruleItemMapping_in_entryRuleItemMapping481);
            ruleItemMapping();

            state._fsp--;

             after(grammarAccess.getItemMappingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItemMapping488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleItemMapping"


    // $ANTLR start "ruleItemMapping"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:265:1: ruleItemMapping : ( ( rule__ItemMapping__Group__0 ) ) ;
    public final void ruleItemMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:269:2: ( ( ( rule__ItemMapping__Group__0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:270:1: ( ( rule__ItemMapping__Group__0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:270:1: ( ( rule__ItemMapping__Group__0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:271:1: ( rule__ItemMapping__Group__0 )
            {
             before(grammarAccess.getItemMappingAccess().getGroup()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:272:1: ( rule__ItemMapping__Group__0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:272:2: rule__ItemMapping__Group__0
            {
            pushFollow(FOLLOW_rule__ItemMapping__Group__0_in_ruleItemMapping514);
            rule__ItemMapping__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getItemMappingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItemMapping"


    // $ANTLR start "entryRulePredicateItem"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:284:1: entryRulePredicateItem : rulePredicateItem EOF ;
    public final void entryRulePredicateItem() throws RecognitionException {
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:285:1: ( rulePredicateItem EOF )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:286:1: rulePredicateItem EOF
            {
             before(grammarAccess.getPredicateItemRule()); 
            pushFollow(FOLLOW_rulePredicateItem_in_entryRulePredicateItem541);
            rulePredicateItem();

            state._fsp--;

             after(grammarAccess.getPredicateItemRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateItem548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePredicateItem"


    // $ANTLR start "rulePredicateItem"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:293:1: rulePredicateItem : ( ruleOr_expr ) ;
    public final void rulePredicateItem() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:297:2: ( ( ruleOr_expr ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:298:1: ( ruleOr_expr )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:298:1: ( ruleOr_expr )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:299:1: ruleOr_expr
            {
             before(grammarAccess.getPredicateItemAccess().getOr_exprParserRuleCall()); 
            pushFollow(FOLLOW_ruleOr_expr_in_rulePredicateItem574);
            ruleOr_expr();

            state._fsp--;

             after(grammarAccess.getPredicateItemAccess().getOr_exprParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredicateItem"


    // $ANTLR start "entryRuleOr_expr"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:312:1: entryRuleOr_expr : ruleOr_expr EOF ;
    public final void entryRuleOr_expr() throws RecognitionException {
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:313:1: ( ruleOr_expr EOF )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:314:1: ruleOr_expr EOF
            {
             before(grammarAccess.getOr_exprRule()); 
            pushFollow(FOLLOW_ruleOr_expr_in_entryRuleOr_expr600);
            ruleOr_expr();

            state._fsp--;

             after(grammarAccess.getOr_exprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr_expr607); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOr_expr"


    // $ANTLR start "ruleOr_expr"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:321:1: ruleOr_expr : ( ( rule__Or_expr__Group__0 ) ) ;
    public final void ruleOr_expr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:325:2: ( ( ( rule__Or_expr__Group__0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:326:1: ( ( rule__Or_expr__Group__0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:326:1: ( ( rule__Or_expr__Group__0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:327:1: ( rule__Or_expr__Group__0 )
            {
             before(grammarAccess.getOr_exprAccess().getGroup()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:328:1: ( rule__Or_expr__Group__0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:328:2: rule__Or_expr__Group__0
            {
            pushFollow(FOLLOW_rule__Or_expr__Group__0_in_ruleOr_expr633);
            rule__Or_expr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOr_exprAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOr_expr"


    // $ANTLR start "entryRuleAnd_expr"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:340:1: entryRuleAnd_expr : ruleAnd_expr EOF ;
    public final void entryRuleAnd_expr() throws RecognitionException {
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:341:1: ( ruleAnd_expr EOF )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:342:1: ruleAnd_expr EOF
            {
             before(grammarAccess.getAnd_exprRule()); 
            pushFollow(FOLLOW_ruleAnd_expr_in_entryRuleAnd_expr660);
            ruleAnd_expr();

            state._fsp--;

             after(grammarAccess.getAnd_exprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd_expr667); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnd_expr"


    // $ANTLR start "ruleAnd_expr"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:349:1: ruleAnd_expr : ( ( rule__And_expr__Group__0 ) ) ;
    public final void ruleAnd_expr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:353:2: ( ( ( rule__And_expr__Group__0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:354:1: ( ( rule__And_expr__Group__0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:354:1: ( ( rule__And_expr__Group__0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:355:1: ( rule__And_expr__Group__0 )
            {
             before(grammarAccess.getAnd_exprAccess().getGroup()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:356:1: ( rule__And_expr__Group__0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:356:2: rule__And_expr__Group__0
            {
            pushFollow(FOLLOW_rule__And_expr__Group__0_in_ruleAnd_expr693);
            rule__And_expr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnd_exprAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnd_expr"


    // $ANTLR start "entryRuleUnary_expr"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:368:1: entryRuleUnary_expr : ruleUnary_expr EOF ;
    public final void entryRuleUnary_expr() throws RecognitionException {
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:369:1: ( ruleUnary_expr EOF )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:370:1: ruleUnary_expr EOF
            {
             before(grammarAccess.getUnary_exprRule()); 
            pushFollow(FOLLOW_ruleUnary_expr_in_entryRuleUnary_expr720);
            ruleUnary_expr();

            state._fsp--;

             after(grammarAccess.getUnary_exprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnary_expr727); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnary_expr"


    // $ANTLR start "ruleUnary_expr"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:377:1: ruleUnary_expr : ( ( rule__Unary_expr__Alternatives ) ) ;
    public final void ruleUnary_expr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:381:2: ( ( ( rule__Unary_expr__Alternatives ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:382:1: ( ( rule__Unary_expr__Alternatives ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:382:1: ( ( rule__Unary_expr__Alternatives ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:383:1: ( rule__Unary_expr__Alternatives )
            {
             before(grammarAccess.getUnary_exprAccess().getAlternatives()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:384:1: ( rule__Unary_expr__Alternatives )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:384:2: rule__Unary_expr__Alternatives
            {
            pushFollow(FOLLOW_rule__Unary_expr__Alternatives_in_ruleUnary_expr753);
            rule__Unary_expr__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnary_exprAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnary_expr"


    // $ANTLR start "entryRuleNeg_expr"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:396:1: entryRuleNeg_expr : ruleNeg_expr EOF ;
    public final void entryRuleNeg_expr() throws RecognitionException {
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:397:1: ( ruleNeg_expr EOF )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:398:1: ruleNeg_expr EOF
            {
             before(grammarAccess.getNeg_exprRule()); 
            pushFollow(FOLLOW_ruleNeg_expr_in_entryRuleNeg_expr780);
            ruleNeg_expr();

            state._fsp--;

             after(grammarAccess.getNeg_exprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNeg_expr787); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNeg_expr"


    // $ANTLR start "ruleNeg_expr"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:405:1: ruleNeg_expr : ( ( rule__Neg_expr__Group__0 ) ) ;
    public final void ruleNeg_expr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:409:2: ( ( ( rule__Neg_expr__Group__0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:410:1: ( ( rule__Neg_expr__Group__0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:410:1: ( ( rule__Neg_expr__Group__0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:411:1: ( rule__Neg_expr__Group__0 )
            {
             before(grammarAccess.getNeg_exprAccess().getGroup()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:412:1: ( rule__Neg_expr__Group__0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:412:2: rule__Neg_expr__Group__0
            {
            pushFollow(FOLLOW_rule__Neg_expr__Group__0_in_ruleNeg_expr813);
            rule__Neg_expr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNeg_exprAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNeg_expr"


    // $ANTLR start "entryRulePrimary_expr"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:424:1: entryRulePrimary_expr : rulePrimary_expr EOF ;
    public final void entryRulePrimary_expr() throws RecognitionException {
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:425:1: ( rulePrimary_expr EOF )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:426:1: rulePrimary_expr EOF
            {
             before(grammarAccess.getPrimary_exprRule()); 
            pushFollow(FOLLOW_rulePrimary_expr_in_entryRulePrimary_expr840);
            rulePrimary_expr();

            state._fsp--;

             after(grammarAccess.getPrimary_exprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary_expr847); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimary_expr"


    // $ANTLR start "rulePrimary_expr"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:433:1: rulePrimary_expr : ( ( rule__Primary_expr__Alternatives ) ) ;
    public final void rulePrimary_expr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:437:2: ( ( ( rule__Primary_expr__Alternatives ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:438:1: ( ( rule__Primary_expr__Alternatives ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:438:1: ( ( rule__Primary_expr__Alternatives ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:439:1: ( rule__Primary_expr__Alternatives )
            {
             before(grammarAccess.getPrimary_exprAccess().getAlternatives()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:440:1: ( rule__Primary_expr__Alternatives )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:440:2: rule__Primary_expr__Alternatives
            {
            pushFollow(FOLLOW_rule__Primary_expr__Alternatives_in_rulePrimary_expr873);
            rule__Primary_expr__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimary_exprAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary_expr"


    // $ANTLR start "entryRuleDefault"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:452:1: entryRuleDefault : ruleDefault EOF ;
    public final void entryRuleDefault() throws RecognitionException {
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:453:1: ( ruleDefault EOF )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:454:1: ruleDefault EOF
            {
             before(grammarAccess.getDefaultRule()); 
            pushFollow(FOLLOW_ruleDefault_in_entryRuleDefault900);
            ruleDefault();

            state._fsp--;

             after(grammarAccess.getDefaultRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefault907); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefault"


    // $ANTLR start "ruleDefault"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:461:1: ruleDefault : ( ( rule__Default__Group__0 ) ) ;
    public final void ruleDefault() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:465:2: ( ( ( rule__Default__Group__0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:466:1: ( ( rule__Default__Group__0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:466:1: ( ( rule__Default__Group__0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:467:1: ( rule__Default__Group__0 )
            {
             before(grammarAccess.getDefaultAccess().getGroup()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:468:1: ( rule__Default__Group__0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:468:2: rule__Default__Group__0
            {
            pushFollow(FOLLOW_rule__Default__Group__0_in_ruleDefault933);
            rule__Default__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefaultAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefault"


    // $ANTLR start "entryRuleParsingConfiguration"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:480:1: entryRuleParsingConfiguration : ruleParsingConfiguration EOF ;
    public final void entryRuleParsingConfiguration() throws RecognitionException {
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:481:1: ( ruleParsingConfiguration EOF )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:482:1: ruleParsingConfiguration EOF
            {
             before(grammarAccess.getParsingConfigurationRule()); 
            pushFollow(FOLLOW_ruleParsingConfiguration_in_entryRuleParsingConfiguration960);
            ruleParsingConfiguration();

            state._fsp--;

             after(grammarAccess.getParsingConfigurationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParsingConfiguration967); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParsingConfiguration"


    // $ANTLR start "ruleParsingConfiguration"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:489:1: ruleParsingConfiguration : ( ( rule__ParsingConfiguration__Group__0 ) ) ;
    public final void ruleParsingConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:493:2: ( ( ( rule__ParsingConfiguration__Group__0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:494:1: ( ( rule__ParsingConfiguration__Group__0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:494:1: ( ( rule__ParsingConfiguration__Group__0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:495:1: ( rule__ParsingConfiguration__Group__0 )
            {
             before(grammarAccess.getParsingConfigurationAccess().getGroup()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:496:1: ( rule__ParsingConfiguration__Group__0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:496:2: rule__ParsingConfiguration__Group__0
            {
            pushFollow(FOLLOW_rule__ParsingConfiguration__Group__0_in_ruleParsingConfiguration993);
            rule__ParsingConfiguration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParsingConfigurationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParsingConfiguration"


    // $ANTLR start "entryRuleFormatSpecification"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:508:1: entryRuleFormatSpecification : ruleFormatSpecification EOF ;
    public final void entryRuleFormatSpecification() throws RecognitionException {
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:509:1: ( ruleFormatSpecification EOF )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:510:1: ruleFormatSpecification EOF
            {
             before(grammarAccess.getFormatSpecificationRule()); 
            pushFollow(FOLLOW_ruleFormatSpecification_in_entryRuleFormatSpecification1020);
            ruleFormatSpecification();

            state._fsp--;

             after(grammarAccess.getFormatSpecificationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormatSpecification1027); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFormatSpecification"


    // $ANTLR start "ruleFormatSpecification"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:517:1: ruleFormatSpecification : ( ( rule__FormatSpecification__Group__0 ) ) ;
    public final void ruleFormatSpecification() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:521:2: ( ( ( rule__FormatSpecification__Group__0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:522:1: ( ( rule__FormatSpecification__Group__0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:522:1: ( ( rule__FormatSpecification__Group__0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:523:1: ( rule__FormatSpecification__Group__0 )
            {
             before(grammarAccess.getFormatSpecificationAccess().getGroup()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:524:1: ( rule__FormatSpecification__Group__0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:524:2: rule__FormatSpecification__Group__0
            {
            pushFollow(FOLLOW_rule__FormatSpecification__Group__0_in_ruleFormatSpecification1053);
            rule__FormatSpecification__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFormatSpecificationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormatSpecification"


    // $ANTLR start "entryRuleSyntacticalInterpretation"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:536:1: entryRuleSyntacticalInterpretation : ruleSyntacticalInterpretation EOF ;
    public final void entryRuleSyntacticalInterpretation() throws RecognitionException {
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:537:1: ( ruleSyntacticalInterpretation EOF )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:538:1: ruleSyntacticalInterpretation EOF
            {
             before(grammarAccess.getSyntacticalInterpretationRule()); 
            pushFollow(FOLLOW_ruleSyntacticalInterpretation_in_entryRuleSyntacticalInterpretation1080);
            ruleSyntacticalInterpretation();

            state._fsp--;

             after(grammarAccess.getSyntacticalInterpretationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSyntacticalInterpretation1087); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSyntacticalInterpretation"


    // $ANTLR start "ruleSyntacticalInterpretation"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:545:1: ruleSyntacticalInterpretation : ( ( rule__SyntacticalInterpretation__Group__0 ) ) ;
    public final void ruleSyntacticalInterpretation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:549:2: ( ( ( rule__SyntacticalInterpretation__Group__0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:550:1: ( ( rule__SyntacticalInterpretation__Group__0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:550:1: ( ( rule__SyntacticalInterpretation__Group__0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:551:1: ( rule__SyntacticalInterpretation__Group__0 )
            {
             before(grammarAccess.getSyntacticalInterpretationAccess().getGroup()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:552:1: ( rule__SyntacticalInterpretation__Group__0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:552:2: rule__SyntacticalInterpretation__Group__0
            {
            pushFollow(FOLLOW_rule__SyntacticalInterpretation__Group__0_in_ruleSyntacticalInterpretation1113);
            rule__SyntacticalInterpretation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSyntacticalInterpretationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSyntacticalInterpretation"


    // $ANTLR start "entryRuleKey"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:564:1: entryRuleKey : ruleKey EOF ;
    public final void entryRuleKey() throws RecognitionException {
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:565:1: ( ruleKey EOF )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:566:1: ruleKey EOF
            {
             before(grammarAccess.getKeyRule()); 
            pushFollow(FOLLOW_ruleKey_in_entryRuleKey1140);
            ruleKey();

            state._fsp--;

             after(grammarAccess.getKeyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKey1147); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKey"


    // $ANTLR start "ruleKey"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:573:1: ruleKey : ( ( rule__Key__Group__0 ) ) ;
    public final void ruleKey() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:577:2: ( ( ( rule__Key__Group__0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:578:1: ( ( rule__Key__Group__0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:578:1: ( ( rule__Key__Group__0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:579:1: ( rule__Key__Group__0 )
            {
             before(grammarAccess.getKeyAccess().getGroup()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:580:1: ( rule__Key__Group__0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:580:2: rule__Key__Group__0
            {
            pushFollow(FOLLOW_rule__Key__Group__0_in_ruleKey1173);
            rule__Key__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKeyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKey"


    // $ANTLR start "entryRuleCSVSeparator"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:592:1: entryRuleCSVSeparator : ruleCSVSeparator EOF ;
    public final void entryRuleCSVSeparator() throws RecognitionException {
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:593:1: ( ruleCSVSeparator EOF )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:594:1: ruleCSVSeparator EOF
            {
             before(grammarAccess.getCSVSeparatorRule()); 
            pushFollow(FOLLOW_ruleCSVSeparator_in_entryRuleCSVSeparator1200);
            ruleCSVSeparator();

            state._fsp--;

             after(grammarAccess.getCSVSeparatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSVSeparator1207); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCSVSeparator"


    // $ANTLR start "ruleCSVSeparator"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:601:1: ruleCSVSeparator : ( ( rule__CSVSeparator__Group__0 ) ) ;
    public final void ruleCSVSeparator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:605:2: ( ( ( rule__CSVSeparator__Group__0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:606:1: ( ( rule__CSVSeparator__Group__0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:606:1: ( ( rule__CSVSeparator__Group__0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:607:1: ( rule__CSVSeparator__Group__0 )
            {
             before(grammarAccess.getCSVSeparatorAccess().getGroup()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:608:1: ( rule__CSVSeparator__Group__0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:608:2: rule__CSVSeparator__Group__0
            {
            pushFollow(FOLLOW_rule__CSVSeparator__Group__0_in_ruleCSVSeparator1233);
            rule__CSVSeparator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCSVSeparatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCSVSeparator"


    // $ANTLR start "entryRuleCSVMultiSeparator"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:620:1: entryRuleCSVMultiSeparator : ruleCSVMultiSeparator EOF ;
    public final void entryRuleCSVMultiSeparator() throws RecognitionException {
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:621:1: ( ruleCSVMultiSeparator EOF )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:622:1: ruleCSVMultiSeparator EOF
            {
             before(grammarAccess.getCSVMultiSeparatorRule()); 
            pushFollow(FOLLOW_ruleCSVMultiSeparator_in_entryRuleCSVMultiSeparator1260);
            ruleCSVMultiSeparator();

            state._fsp--;

             after(grammarAccess.getCSVMultiSeparatorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSVMultiSeparator1267); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCSVMultiSeparator"


    // $ANTLR start "ruleCSVMultiSeparator"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:629:1: ruleCSVMultiSeparator : ( ( rule__CSVMultiSeparator__Group__0 ) ) ;
    public final void ruleCSVMultiSeparator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:633:2: ( ( ( rule__CSVMultiSeparator__Group__0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:634:1: ( ( rule__CSVMultiSeparator__Group__0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:634:1: ( ( rule__CSVMultiSeparator__Group__0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:635:1: ( rule__CSVMultiSeparator__Group__0 )
            {
             before(grammarAccess.getCSVMultiSeparatorAccess().getGroup()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:636:1: ( rule__CSVMultiSeparator__Group__0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:636:2: rule__CSVMultiSeparator__Group__0
            {
            pushFollow(FOLLOW_rule__CSVMultiSeparator__Group__0_in_ruleCSVMultiSeparator1293);
            rule__CSVMultiSeparator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCSVMultiSeparatorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCSVMultiSeparator"


    // $ANTLR start "entryRuleOptional"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:648:1: entryRuleOptional : ruleOptional EOF ;
    public final void entryRuleOptional() throws RecognitionException {
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:649:1: ( ruleOptional EOF )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:650:1: ruleOptional EOF
            {
             before(grammarAccess.getOptionalRule()); 
            pushFollow(FOLLOW_ruleOptional_in_entryRuleOptional1320);
            ruleOptional();

            state._fsp--;

             after(grammarAccess.getOptionalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptional1327); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOptional"


    // $ANTLR start "ruleOptional"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:657:1: ruleOptional : ( ( rule__Optional__Group__0 ) ) ;
    public final void ruleOptional() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:661:2: ( ( ( rule__Optional__Group__0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:662:1: ( ( rule__Optional__Group__0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:662:1: ( ( rule__Optional__Group__0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:663:1: ( rule__Optional__Group__0 )
            {
             before(grammarAccess.getOptionalAccess().getGroup()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:664:1: ( rule__Optional__Group__0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:664:2: rule__Optional__Group__0
            {
            pushFollow(FOLLOW_rule__Optional__Group__0_in_ruleOptional1353);
            rule__Optional__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOptionalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOptional"


    // $ANTLR start "entryRuleMandatory"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:676:1: entryRuleMandatory : ruleMandatory EOF ;
    public final void entryRuleMandatory() throws RecognitionException {
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:677:1: ( ruleMandatory EOF )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:678:1: ruleMandatory EOF
            {
             before(grammarAccess.getMandatoryRule()); 
            pushFollow(FOLLOW_ruleMandatory_in_entryRuleMandatory1380);
            ruleMandatory();

            state._fsp--;

             after(grammarAccess.getMandatoryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMandatory1387); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMandatory"


    // $ANTLR start "ruleMandatory"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:685:1: ruleMandatory : ( ( rule__Mandatory__Group__0 ) ) ;
    public final void ruleMandatory() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:689:2: ( ( ( rule__Mandatory__Group__0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:690:1: ( ( rule__Mandatory__Group__0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:690:1: ( ( rule__Mandatory__Group__0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:691:1: ( rule__Mandatory__Group__0 )
            {
             before(grammarAccess.getMandatoryAccess().getGroup()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:692:1: ( rule__Mandatory__Group__0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:692:2: rule__Mandatory__Group__0
            {
            pushFollow(FOLLOW_rule__Mandatory__Group__0_in_ruleMandatory1413);
            rule__Mandatory__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMandatory"


    // $ANTLR start "entryRuleNotPresent"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:704:1: entryRuleNotPresent : ruleNotPresent EOF ;
    public final void entryRuleNotPresent() throws RecognitionException {
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:705:1: ( ruleNotPresent EOF )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:706:1: ruleNotPresent EOF
            {
             before(grammarAccess.getNotPresentRule()); 
            pushFollow(FOLLOW_ruleNotPresent_in_entryRuleNotPresent1440);
            ruleNotPresent();

            state._fsp--;

             after(grammarAccess.getNotPresentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotPresent1447); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNotPresent"


    // $ANTLR start "ruleNotPresent"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:713:1: ruleNotPresent : ( ( rule__NotPresent__Group__0 ) ) ;
    public final void ruleNotPresent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:717:2: ( ( ( rule__NotPresent__Group__0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:718:1: ( ( rule__NotPresent__Group__0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:718:1: ( ( rule__NotPresent__Group__0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:719:1: ( rule__NotPresent__Group__0 )
            {
             before(grammarAccess.getNotPresentAccess().getGroup()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:720:1: ( rule__NotPresent__Group__0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:720:2: rule__NotPresent__Group__0
            {
            pushFollow(FOLLOW_rule__NotPresent__Group__0_in_ruleNotPresent1473);
            rule__NotPresent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNotPresentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNotPresent"


    // $ANTLR start "entryRuleUnknown"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:732:1: entryRuleUnknown : ruleUnknown EOF ;
    public final void entryRuleUnknown() throws RecognitionException {
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:733:1: ( ruleUnknown EOF )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:734:1: ruleUnknown EOF
            {
             before(grammarAccess.getUnknownRule()); 
            pushFollow(FOLLOW_ruleUnknown_in_entryRuleUnknown1500);
            ruleUnknown();

            state._fsp--;

             after(grammarAccess.getUnknownRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnknown1507); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUnknown"


    // $ANTLR start "ruleUnknown"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:741:1: ruleUnknown : ( ( rule__Unknown__Group__0 ) ) ;
    public final void ruleUnknown() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:745:2: ( ( ( rule__Unknown__Group__0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:746:1: ( ( rule__Unknown__Group__0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:746:1: ( ( rule__Unknown__Group__0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:747:1: ( rule__Unknown__Group__0 )
            {
             before(grammarAccess.getUnknownAccess().getGroup()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:748:1: ( rule__Unknown__Group__0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:748:2: rule__Unknown__Group__0
            {
            pushFollow(FOLLOW_rule__Unknown__Group__0_in_ruleUnknown1533);
            rule__Unknown__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnknownAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnknown"


    // $ANTLR start "entryRuleScopingView"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:760:1: entryRuleScopingView : ruleScopingView EOF ;
    public final void entryRuleScopingView() throws RecognitionException {
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:761:1: ( ruleScopingView EOF )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:762:1: ruleScopingView EOF
            {
             before(grammarAccess.getScopingViewRule()); 
            pushFollow(FOLLOW_ruleScopingView_in_entryRuleScopingView1560);
            ruleScopingView();

            state._fsp--;

             after(grammarAccess.getScopingViewRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScopingView1567); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScopingView"


    // $ANTLR start "ruleScopingView"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:769:1: ruleScopingView : ( ( rule__ScopingView__Group__0 ) ) ;
    public final void ruleScopingView() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:773:2: ( ( ( rule__ScopingView__Group__0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:774:1: ( ( rule__ScopingView__Group__0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:774:1: ( ( rule__ScopingView__Group__0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:775:1: ( rule__ScopingView__Group__0 )
            {
             before(grammarAccess.getScopingViewAccess().getGroup()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:776:1: ( rule__ScopingView__Group__0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:776:2: rule__ScopingView__Group__0
            {
            pushFollow(FOLLOW_rule__ScopingView__Group__0_in_ruleScopingView1593);
            rule__ScopingView__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getScopingViewAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScopingView"


    // $ANTLR start "entryRuleViewName"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:788:1: entryRuleViewName : ruleViewName EOF ;
    public final void entryRuleViewName() throws RecognitionException {
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:789:1: ( ruleViewName EOF )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:790:1: ruleViewName EOF
            {
             before(grammarAccess.getViewNameRule()); 
            pushFollow(FOLLOW_ruleViewName_in_entryRuleViewName1620);
            ruleViewName();

            state._fsp--;

             after(grammarAccess.getViewNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewName1627); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleViewName"


    // $ANTLR start "ruleViewName"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:797:1: ruleViewName : ( ( rule__ViewName__Group__0 ) ) ;
    public final void ruleViewName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:801:2: ( ( ( rule__ViewName__Group__0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:802:1: ( ( rule__ViewName__Group__0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:802:1: ( ( rule__ViewName__Group__0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:803:1: ( rule__ViewName__Group__0 )
            {
             before(grammarAccess.getViewNameAccess().getGroup()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:804:1: ( rule__ViewName__Group__0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:804:2: rule__ViewName__Group__0
            {
            pushFollow(FOLLOW_rule__ViewName__Group__0_in_ruleViewName1653);
            rule__ViewName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getViewNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleViewName"


    // $ANTLR start "entryRuleScopingProducts"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:816:1: entryRuleScopingProducts : ruleScopingProducts EOF ;
    public final void entryRuleScopingProducts() throws RecognitionException {
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:817:1: ( ruleScopingProducts EOF )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:818:1: ruleScopingProducts EOF
            {
             before(grammarAccess.getScopingProductsRule()); 
            pushFollow(FOLLOW_ruleScopingProducts_in_entryRuleScopingProducts1680);
            ruleScopingProducts();

            state._fsp--;

             after(grammarAccess.getScopingProductsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScopingProducts1687); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScopingProducts"


    // $ANTLR start "ruleScopingProducts"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:825:1: ruleScopingProducts : ( ruleProductInclusionExclusion ) ;
    public final void ruleScopingProducts() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:829:2: ( ( ruleProductInclusionExclusion ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:830:1: ( ruleProductInclusionExclusion )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:830:1: ( ruleProductInclusionExclusion )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:831:1: ruleProductInclusionExclusion
            {
             before(grammarAccess.getScopingProductsAccess().getProductInclusionExclusionParserRuleCall()); 
            pushFollow(FOLLOW_ruleProductInclusionExclusion_in_ruleScopingProducts1713);
            ruleProductInclusionExclusion();

            state._fsp--;

             after(grammarAccess.getScopingProductsAccess().getProductInclusionExclusionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScopingProducts"


    // $ANTLR start "entryRuleScopingFeatures"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:844:1: entryRuleScopingFeatures : ruleScopingFeatures EOF ;
    public final void entryRuleScopingFeatures() throws RecognitionException {
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:845:1: ( ruleScopingFeatures EOF )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:846:1: ruleScopingFeatures EOF
            {
             before(grammarAccess.getScopingFeaturesRule()); 
            pushFollow(FOLLOW_ruleScopingFeatures_in_entryRuleScopingFeatures1739);
            ruleScopingFeatures();

            state._fsp--;

             after(grammarAccess.getScopingFeaturesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScopingFeatures1746); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScopingFeatures"


    // $ANTLR start "ruleScopingFeatures"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:853:1: ruleScopingFeatures : ( ruleFeatureInclusionExclusion ) ;
    public final void ruleScopingFeatures() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:857:2: ( ( ruleFeatureInclusionExclusion ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:858:1: ( ruleFeatureInclusionExclusion )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:858:1: ( ruleFeatureInclusionExclusion )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:859:1: ruleFeatureInclusionExclusion
            {
             before(grammarAccess.getScopingFeaturesAccess().getFeatureInclusionExclusionParserRuleCall()); 
            pushFollow(FOLLOW_ruleFeatureInclusionExclusion_in_ruleScopingFeatures1772);
            ruleFeatureInclusionExclusion();

            state._fsp--;

             after(grammarAccess.getScopingFeaturesAccess().getFeatureInclusionExclusionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScopingFeatures"


    // $ANTLR start "entryRuleFeatureInclusionExclusion"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:872:1: entryRuleFeatureInclusionExclusion : ruleFeatureInclusionExclusion EOF ;
    public final void entryRuleFeatureInclusionExclusion() throws RecognitionException {
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:873:1: ( ruleFeatureInclusionExclusion EOF )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:874:1: ruleFeatureInclusionExclusion EOF
            {
             before(grammarAccess.getFeatureInclusionExclusionRule()); 
            pushFollow(FOLLOW_ruleFeatureInclusionExclusion_in_entryRuleFeatureInclusionExclusion1798);
            ruleFeatureInclusionExclusion();

            state._fsp--;

             after(grammarAccess.getFeatureInclusionExclusionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureInclusionExclusion1805); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeatureInclusionExclusion"


    // $ANTLR start "ruleFeatureInclusionExclusion"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:881:1: ruleFeatureInclusionExclusion : ( ( rule__FeatureInclusionExclusion__Alternatives ) ) ;
    public final void ruleFeatureInclusionExclusion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:885:2: ( ( ( rule__FeatureInclusionExclusion__Alternatives ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:886:1: ( ( rule__FeatureInclusionExclusion__Alternatives ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:886:1: ( ( rule__FeatureInclusionExclusion__Alternatives ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:887:1: ( rule__FeatureInclusionExclusion__Alternatives )
            {
             before(grammarAccess.getFeatureInclusionExclusionAccess().getAlternatives()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:888:1: ( rule__FeatureInclusionExclusion__Alternatives )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:888:2: rule__FeatureInclusionExclusion__Alternatives
            {
            pushFollow(FOLLOW_rule__FeatureInclusionExclusion__Alternatives_in_ruleFeatureInclusionExclusion1831);
            rule__FeatureInclusionExclusion__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFeatureInclusionExclusionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeatureInclusionExclusion"


    // $ANTLR start "entryRuleExceptFeature"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:900:1: entryRuleExceptFeature : ruleExceptFeature EOF ;
    public final void entryRuleExceptFeature() throws RecognitionException {
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:901:1: ( ruleExceptFeature EOF )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:902:1: ruleExceptFeature EOF
            {
             before(grammarAccess.getExceptFeatureRule()); 
            pushFollow(FOLLOW_ruleExceptFeature_in_entryRuleExceptFeature1858);
            ruleExceptFeature();

            state._fsp--;

             after(grammarAccess.getExceptFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExceptFeature1865); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExceptFeature"


    // $ANTLR start "ruleExceptFeature"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:909:1: ruleExceptFeature : ( ( rule__ExceptFeature__Group__0 ) ) ;
    public final void ruleExceptFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:913:2: ( ( ( rule__ExceptFeature__Group__0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:914:1: ( ( rule__ExceptFeature__Group__0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:914:1: ( ( rule__ExceptFeature__Group__0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:915:1: ( rule__ExceptFeature__Group__0 )
            {
             before(grammarAccess.getExceptFeatureAccess().getGroup()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:916:1: ( rule__ExceptFeature__Group__0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:916:2: rule__ExceptFeature__Group__0
            {
            pushFollow(FOLLOW_rule__ExceptFeature__Group__0_in_ruleExceptFeature1891);
            rule__ExceptFeature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExceptFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExceptFeature"


    // $ANTLR start "entryRuleOnlyFeature"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:928:1: entryRuleOnlyFeature : ruleOnlyFeature EOF ;
    public final void entryRuleOnlyFeature() throws RecognitionException {
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:929:1: ( ruleOnlyFeature EOF )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:930:1: ruleOnlyFeature EOF
            {
             before(grammarAccess.getOnlyFeatureRule()); 
            pushFollow(FOLLOW_ruleOnlyFeature_in_entryRuleOnlyFeature1918);
            ruleOnlyFeature();

            state._fsp--;

             after(grammarAccess.getOnlyFeatureRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOnlyFeature1925); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOnlyFeature"


    // $ANTLR start "ruleOnlyFeature"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:937:1: ruleOnlyFeature : ( ( rule__OnlyFeature__Group__0 ) ) ;
    public final void ruleOnlyFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:941:2: ( ( ( rule__OnlyFeature__Group__0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:942:1: ( ( rule__OnlyFeature__Group__0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:942:1: ( ( rule__OnlyFeature__Group__0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:943:1: ( rule__OnlyFeature__Group__0 )
            {
             before(grammarAccess.getOnlyFeatureAccess().getGroup()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:944:1: ( rule__OnlyFeature__Group__0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:944:2: rule__OnlyFeature__Group__0
            {
            pushFollow(FOLLOW_rule__OnlyFeature__Group__0_in_ruleOnlyFeature1951);
            rule__OnlyFeature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOnlyFeatureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOnlyFeature"


    // $ANTLR start "entryRuleProductInclusionExclusion"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:956:1: entryRuleProductInclusionExclusion : ruleProductInclusionExclusion EOF ;
    public final void entryRuleProductInclusionExclusion() throws RecognitionException {
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:957:1: ( ruleProductInclusionExclusion EOF )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:958:1: ruleProductInclusionExclusion EOF
            {
             before(grammarAccess.getProductInclusionExclusionRule()); 
            pushFollow(FOLLOW_ruleProductInclusionExclusion_in_entryRuleProductInclusionExclusion1978);
            ruleProductInclusionExclusion();

            state._fsp--;

             after(grammarAccess.getProductInclusionExclusionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProductInclusionExclusion1985); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProductInclusionExclusion"


    // $ANTLR start "ruleProductInclusionExclusion"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:965:1: ruleProductInclusionExclusion : ( ( rule__ProductInclusionExclusion__Alternatives ) ) ;
    public final void ruleProductInclusionExclusion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:969:2: ( ( ( rule__ProductInclusionExclusion__Alternatives ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:970:1: ( ( rule__ProductInclusionExclusion__Alternatives ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:970:1: ( ( rule__ProductInclusionExclusion__Alternatives ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:971:1: ( rule__ProductInclusionExclusion__Alternatives )
            {
             before(grammarAccess.getProductInclusionExclusionAccess().getAlternatives()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:972:1: ( rule__ProductInclusionExclusion__Alternatives )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:972:2: rule__ProductInclusionExclusion__Alternatives
            {
            pushFollow(FOLLOW_rule__ProductInclusionExclusion__Alternatives_in_ruleProductInclusionExclusion2011);
            rule__ProductInclusionExclusion__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProductInclusionExclusionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProductInclusionExclusion"


    // $ANTLR start "entryRuleExceptProduct"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:984:1: entryRuleExceptProduct : ruleExceptProduct EOF ;
    public final void entryRuleExceptProduct() throws RecognitionException {
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:985:1: ( ruleExceptProduct EOF )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:986:1: ruleExceptProduct EOF
            {
             before(grammarAccess.getExceptProductRule()); 
            pushFollow(FOLLOW_ruleExceptProduct_in_entryRuleExceptProduct2038);
            ruleExceptProduct();

            state._fsp--;

             after(grammarAccess.getExceptProductRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExceptProduct2045); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExceptProduct"


    // $ANTLR start "ruleExceptProduct"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:993:1: ruleExceptProduct : ( ( rule__ExceptProduct__Group__0 ) ) ;
    public final void ruleExceptProduct() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:997:2: ( ( ( rule__ExceptProduct__Group__0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:998:1: ( ( rule__ExceptProduct__Group__0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:998:1: ( ( rule__ExceptProduct__Group__0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:999:1: ( rule__ExceptProduct__Group__0 )
            {
             before(grammarAccess.getExceptProductAccess().getGroup()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1000:1: ( rule__ExceptProduct__Group__0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1000:2: rule__ExceptProduct__Group__0
            {
            pushFollow(FOLLOW_rule__ExceptProduct__Group__0_in_ruleExceptProduct2071);
            rule__ExceptProduct__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExceptProductAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExceptProduct"


    // $ANTLR start "entryRuleOnlyProduct"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1012:1: entryRuleOnlyProduct : ruleOnlyProduct EOF ;
    public final void entryRuleOnlyProduct() throws RecognitionException {
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1013:1: ( ruleOnlyProduct EOF )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1014:1: ruleOnlyProduct EOF
            {
             before(grammarAccess.getOnlyProductRule()); 
            pushFollow(FOLLOW_ruleOnlyProduct_in_entryRuleOnlyProduct2098);
            ruleOnlyProduct();

            state._fsp--;

             after(grammarAccess.getOnlyProductRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOnlyProduct2105); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOnlyProduct"


    // $ANTLR start "ruleOnlyProduct"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1021:1: ruleOnlyProduct : ( ( rule__OnlyProduct__Group__0 ) ) ;
    public final void ruleOnlyProduct() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1025:2: ( ( ( rule__OnlyProduct__Group__0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1026:1: ( ( rule__OnlyProduct__Group__0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1026:1: ( ( rule__OnlyProduct__Group__0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1027:1: ( rule__OnlyProduct__Group__0 )
            {
             before(grammarAccess.getOnlyProductAccess().getGroup()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1028:1: ( rule__OnlyProduct__Group__0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1028:2: rule__OnlyProduct__Group__0
            {
            pushFollow(FOLLOW_rule__OnlyProduct__Group__0_in_ruleOnlyProduct2131);
            rule__OnlyProduct__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOnlyProductAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOnlyProduct"


    // $ANTLR start "entryRuleRewriting"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1040:1: entryRuleRewriting : ruleRewriting EOF ;
    public final void entryRuleRewriting() throws RecognitionException {
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1041:1: ( ruleRewriting EOF )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1042:1: ruleRewriting EOF
            {
             before(grammarAccess.getRewritingRule()); 
            pushFollow(FOLLOW_ruleRewriting_in_entryRuleRewriting2158);
            ruleRewriting();

            state._fsp--;

             after(grammarAccess.getRewritingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRewriting2165); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRewriting"


    // $ANTLR start "ruleRewriting"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1049:1: ruleRewriting : ( ( rule__Rewriting__Group__0 ) ) ;
    public final void ruleRewriting() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1053:2: ( ( ( rule__Rewriting__Group__0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1054:1: ( ( rule__Rewriting__Group__0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1054:1: ( ( rule__Rewriting__Group__0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1055:1: ( rule__Rewriting__Group__0 )
            {
             before(grammarAccess.getRewritingAccess().getGroup()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1056:1: ( rule__Rewriting__Group__0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1056:2: rule__Rewriting__Group__0
            {
            pushFollow(FOLLOW_rule__Rewriting__Group__0_in_ruleRewriting2191);
            rule__Rewriting__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRewritingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRewriting"


    // $ANTLR start "entryRuleMultiValuesInterpretation"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1068:1: entryRuleMultiValuesInterpretation : ruleMultiValuesInterpretation EOF ;
    public final void entryRuleMultiValuesInterpretation() throws RecognitionException {
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1069:1: ( ruleMultiValuesInterpretation EOF )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1070:1: ruleMultiValuesInterpretation EOF
            {
             before(grammarAccess.getMultiValuesInterpretationRule()); 
            pushFollow(FOLLOW_ruleMultiValuesInterpretation_in_entryRuleMultiValuesInterpretation2218);
            ruleMultiValuesInterpretation();

            state._fsp--;

             after(grammarAccess.getMultiValuesInterpretationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiValuesInterpretation2225); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiValuesInterpretation"


    // $ANTLR start "ruleMultiValuesInterpretation"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1077:1: ruleMultiValuesInterpretation : ( ( rule__MultiValuesInterpretation__Group__0 ) ) ;
    public final void ruleMultiValuesInterpretation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1081:2: ( ( ( rule__MultiValuesInterpretation__Group__0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1082:1: ( ( rule__MultiValuesInterpretation__Group__0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1082:1: ( ( rule__MultiValuesInterpretation__Group__0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1083:1: ( rule__MultiValuesInterpretation__Group__0 )
            {
             before(grammarAccess.getMultiValuesInterpretationAccess().getGroup()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1084:1: ( rule__MultiValuesInterpretation__Group__0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1084:2: rule__MultiValuesInterpretation__Group__0
            {
            pushFollow(FOLLOW_rule__MultiValuesInterpretation__Group__0_in_ruleMultiValuesInterpretation2251);
            rule__MultiValuesInterpretation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiValuesInterpretationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiValuesInterpretation"


    // $ANTLR start "entryRuleMultiValueInterpretation"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1096:1: entryRuleMultiValueInterpretation : ruleMultiValueInterpretation EOF ;
    public final void entryRuleMultiValueInterpretation() throws RecognitionException {
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1097:1: ( ruleMultiValueInterpretation EOF )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1098:1: ruleMultiValueInterpretation EOF
            {
             before(grammarAccess.getMultiValueInterpretationRule()); 
            pushFollow(FOLLOW_ruleMultiValueInterpretation_in_entryRuleMultiValueInterpretation2278);
            ruleMultiValueInterpretation();

            state._fsp--;

             after(grammarAccess.getMultiValueInterpretationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiValueInterpretation2285); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiValueInterpretation"


    // $ANTLR start "ruleMultiValueInterpretation"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1105:1: ruleMultiValueInterpretation : ( ( rule__MultiValueInterpretation__Group__0 ) ) ;
    public final void ruleMultiValueInterpretation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1109:2: ( ( ( rule__MultiValueInterpretation__Group__0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1110:1: ( ( rule__MultiValueInterpretation__Group__0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1110:1: ( ( rule__MultiValueInterpretation__Group__0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1111:1: ( rule__MultiValueInterpretation__Group__0 )
            {
             before(grammarAccess.getMultiValueInterpretationAccess().getGroup()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1112:1: ( rule__MultiValueInterpretation__Group__0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1112:2: rule__MultiValueInterpretation__Group__0
            {
            pushFollow(FOLLOW_rule__MultiValueInterpretation__Group__0_in_ruleMultiValueInterpretation2311);
            rule__MultiValueInterpretation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiValueInterpretationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiValueInterpretation"


    // $ANTLR start "ruleKindRelation"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1125:1: ruleKindRelation : ( ( rule__KindRelation__Alternatives ) ) ;
    public final void ruleKindRelation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1129:1: ( ( ( rule__KindRelation__Alternatives ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1130:1: ( ( rule__KindRelation__Alternatives ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1130:1: ( ( rule__KindRelation__Alternatives ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1131:1: ( rule__KindRelation__Alternatives )
            {
             before(grammarAccess.getKindRelationAccess().getAlternatives()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1132:1: ( rule__KindRelation__Alternatives )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1132:2: rule__KindRelation__Alternatives
            {
            pushFollow(FOLLOW_rule__KindRelation__Alternatives_in_ruleKindRelation2348);
            rule__KindRelation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getKindRelationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKindRelation"


    // $ANTLR start "ruleFileFormat"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1144:1: ruleFileFormat : ( ( rule__FileFormat__Alternatives ) ) ;
    public final void ruleFileFormat() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1148:1: ( ( ( rule__FileFormat__Alternatives ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1149:1: ( ( rule__FileFormat__Alternatives ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1149:1: ( ( rule__FileFormat__Alternatives ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1150:1: ( rule__FileFormat__Alternatives )
            {
             before(grammarAccess.getFileFormatAccess().getAlternatives()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1151:1: ( rule__FileFormat__Alternatives )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1151:2: rule__FileFormat__Alternatives
            {
            pushFollow(FOLLOW_rule__FileFormat__Alternatives_in_ruleFileFormat2384);
            rule__FileFormat__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFileFormatAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFileFormat"


    // $ANTLR start "ruleVariabilityInterpretation"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1163:1: ruleVariabilityInterpretation : ( ( rule__VariabilityInterpretation__Alternatives ) ) ;
    public final void ruleVariabilityInterpretation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1167:1: ( ( ( rule__VariabilityInterpretation__Alternatives ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1168:1: ( ( rule__VariabilityInterpretation__Alternatives ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1168:1: ( ( rule__VariabilityInterpretation__Alternatives ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1169:1: ( rule__VariabilityInterpretation__Alternatives )
            {
             before(grammarAccess.getVariabilityInterpretationAccess().getAlternatives()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1170:1: ( rule__VariabilityInterpretation__Alternatives )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1170:2: rule__VariabilityInterpretation__Alternatives
            {
            pushFollow(FOLLOW_rule__VariabilityInterpretation__Alternatives_in_ruleVariabilityInterpretation2420);
            rule__VariabilityInterpretation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVariabilityInterpretationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariabilityInterpretation"


    // $ANTLR start "rule__SPLName__NameAlternatives_1_0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1181:1: rule__SPLName__NameAlternatives_1_0 : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__SPLName__NameAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1185:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1186:1: ( RULE_STRING )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1186:1: ( RULE_STRING )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1187:1: RULE_STRING
                    {
                     before(grammarAccess.getSPLNameAccess().getNameSTRINGTerminalRuleCall_1_0_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SPLName__NameAlternatives_1_02455); 
                     after(grammarAccess.getSPLNameAccess().getNameSTRINGTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1192:6: ( RULE_ID )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1192:6: ( RULE_ID )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1193:1: RULE_ID
                    {
                     before(grammarAccess.getSPLNameAccess().getNameIDTerminalRuleCall_1_0_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SPLName__NameAlternatives_1_02472); 
                     after(grammarAccess.getSPLNameAccess().getNameIDTerminalRuleCall_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPLName__NameAlternatives_1_0"


    // $ANTLR start "rule__ItemRelation__View1Alternatives_0_0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1203:1: rule__ItemRelation__View1Alternatives_0_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__ItemRelation__View1Alternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1207:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_STRING) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1208:1: ( RULE_ID )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1208:1: ( RULE_ID )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1209:1: RULE_ID
                    {
                     before(grammarAccess.getItemRelationAccess().getView1IDTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ItemRelation__View1Alternatives_0_02504); 
                     after(grammarAccess.getItemRelationAccess().getView1IDTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1214:6: ( RULE_STRING )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1214:6: ( RULE_STRING )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1215:1: RULE_STRING
                    {
                     before(grammarAccess.getItemRelationAccess().getView1STRINGTerminalRuleCall_0_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ItemRelation__View1Alternatives_0_02521); 
                     after(grammarAccess.getItemRelationAccess().getView1STRINGTerminalRuleCall_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemRelation__View1Alternatives_0_0"


    // $ANTLR start "rule__ItemRelation__View2Alternatives_2_0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1225:1: rule__ItemRelation__View2Alternatives_2_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__ItemRelation__View2Alternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1229:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_STRING) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1230:1: ( RULE_ID )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1230:1: ( RULE_ID )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1231:1: RULE_ID
                    {
                     before(grammarAccess.getItemRelationAccess().getView2IDTerminalRuleCall_2_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ItemRelation__View2Alternatives_2_02553); 
                     after(grammarAccess.getItemRelationAccess().getView2IDTerminalRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1236:6: ( RULE_STRING )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1236:6: ( RULE_STRING )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1237:1: RULE_STRING
                    {
                     before(grammarAccess.getItemRelationAccess().getView2STRINGTerminalRuleCall_2_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ItemRelation__View2Alternatives_2_02570); 
                     after(grammarAccess.getItemRelationAccess().getView2STRINGTerminalRuleCall_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemRelation__View2Alternatives_2_0"


    // $ANTLR start "rule__ItemGeneralization__GeneralizeAlternatives_0_0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1247:1: rule__ItemGeneralization__GeneralizeAlternatives_0_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__ItemGeneralization__GeneralizeAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1251:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_STRING) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1252:1: ( RULE_ID )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1252:1: ( RULE_ID )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1253:1: RULE_ID
                    {
                     before(grammarAccess.getItemGeneralizationAccess().getGeneralizeIDTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ItemGeneralization__GeneralizeAlternatives_0_02602); 
                     after(grammarAccess.getItemGeneralizationAccess().getGeneralizeIDTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1258:6: ( RULE_STRING )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1258:6: ( RULE_STRING )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1259:1: RULE_STRING
                    {
                     before(grammarAccess.getItemGeneralizationAccess().getGeneralizeSTRINGTerminalRuleCall_0_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ItemGeneralization__GeneralizeAlternatives_0_02619); 
                     after(grammarAccess.getItemGeneralizationAccess().getGeneralizeSTRINGTerminalRuleCall_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGeneralization__GeneralizeAlternatives_0_0"


    // $ANTLR start "rule__ItemGeneralization__Alternatives_1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1269:1: rule__ItemGeneralization__Alternatives_1 : ( ( 'generalize' ) | ( 'abstract' ) );
    public final void rule__ItemGeneralization__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1273:1: ( ( 'generalize' ) | ( 'abstract' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1274:1: ( 'generalize' )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1274:1: ( 'generalize' )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1275:1: 'generalize'
                    {
                     before(grammarAccess.getItemGeneralizationAccess().getGeneralizeKeyword_1_0()); 
                    match(input,11,FOLLOW_11_in_rule__ItemGeneralization__Alternatives_12652); 
                     after(grammarAccess.getItemGeneralizationAccess().getGeneralizeKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1282:6: ( 'abstract' )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1282:6: ( 'abstract' )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1283:1: 'abstract'
                    {
                     before(grammarAccess.getItemGeneralizationAccess().getAbstractKeyword_1_1()); 
                    match(input,12,FOLLOW_12_in_rule__ItemGeneralization__Alternatives_12672); 
                     after(grammarAccess.getItemGeneralizationAccess().getAbstractKeyword_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGeneralization__Alternatives_1"


    // $ANTLR start "rule__ItemGeneralization__ViewsAlternatives_2_0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1295:1: rule__ItemGeneralization__ViewsAlternatives_2_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__ItemGeneralization__ViewsAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1299:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_STRING) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1300:1: ( RULE_ID )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1300:1: ( RULE_ID )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1301:1: RULE_ID
                    {
                     before(grammarAccess.getItemGeneralizationAccess().getViewsIDTerminalRuleCall_2_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ItemGeneralization__ViewsAlternatives_2_02706); 
                     after(grammarAccess.getItemGeneralizationAccess().getViewsIDTerminalRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1306:6: ( RULE_STRING )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1306:6: ( RULE_STRING )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1307:1: RULE_STRING
                    {
                     before(grammarAccess.getItemGeneralizationAccess().getViewsSTRINGTerminalRuleCall_2_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ItemGeneralization__ViewsAlternatives_2_02723); 
                     after(grammarAccess.getItemGeneralizationAccess().getViewsSTRINGTerminalRuleCall_2_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGeneralization__ViewsAlternatives_2_0"


    // $ANTLR start "rule__ItemMapping__ItemAlternatives_0_0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1317:1: rule__ItemMapping__ItemAlternatives_0_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__ItemMapping__ItemAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1321:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_STRING) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1322:1: ( RULE_ID )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1322:1: ( RULE_ID )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1323:1: RULE_ID
                    {
                     before(grammarAccess.getItemMappingAccess().getItemIDTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ItemMapping__ItemAlternatives_0_02755); 
                     after(grammarAccess.getItemMappingAccess().getItemIDTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1328:6: ( RULE_STRING )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1328:6: ( RULE_STRING )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1329:1: RULE_STRING
                    {
                     before(grammarAccess.getItemMappingAccess().getItemSTRINGTerminalRuleCall_0_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ItemMapping__ItemAlternatives_0_02772); 
                     after(grammarAccess.getItemMappingAccess().getItemSTRINGTerminalRuleCall_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemMapping__ItemAlternatives_0_0"


    // $ANTLR start "rule__ItemMapping__ActAlternatives_1_0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1339:1: rule__ItemMapping__ActAlternatives_1_0 : ( ( 'replace' ) | ( 'correspondsTo' ) );
    public final void rule__ItemMapping__ActAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1343:1: ( ( 'replace' ) | ( 'correspondsTo' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            else if ( (LA8_0==14) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1344:1: ( 'replace' )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1344:1: ( 'replace' )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1345:1: 'replace'
                    {
                     before(grammarAccess.getItemMappingAccess().getActReplaceKeyword_1_0_0()); 
                    match(input,13,FOLLOW_13_in_rule__ItemMapping__ActAlternatives_1_02805); 
                     after(grammarAccess.getItemMappingAccess().getActReplaceKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1352:6: ( 'correspondsTo' )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1352:6: ( 'correspondsTo' )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1353:1: 'correspondsTo'
                    {
                     before(grammarAccess.getItemMappingAccess().getActCorrespondsToKeyword_1_0_1()); 
                    match(input,14,FOLLOW_14_in_rule__ItemMapping__ActAlternatives_1_02825); 
                     after(grammarAccess.getItemMappingAccess().getActCorrespondsToKeyword_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemMapping__ActAlternatives_1_0"


    // $ANTLR start "rule__Unary_expr__Alternatives"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1365:1: rule__Unary_expr__Alternatives : ( ( ruleNeg_expr ) | ( rulePrimary_expr ) );
    public final void rule__Unary_expr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1369:1: ( ( ruleNeg_expr ) | ( rulePrimary_expr ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==38) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)||LA9_0==39) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1370:1: ( ruleNeg_expr )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1370:1: ( ruleNeg_expr )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1371:1: ruleNeg_expr
                    {
                     before(grammarAccess.getUnary_exprAccess().getNeg_exprParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleNeg_expr_in_rule__Unary_expr__Alternatives2859);
                    ruleNeg_expr();

                    state._fsp--;

                     after(grammarAccess.getUnary_exprAccess().getNeg_exprParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1376:6: ( rulePrimary_expr )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1376:6: ( rulePrimary_expr )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1377:1: rulePrimary_expr
                    {
                     before(grammarAccess.getUnary_exprAccess().getPrimary_exprParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePrimary_expr_in_rule__Unary_expr__Alternatives2876);
                    rulePrimary_expr();

                    state._fsp--;

                     after(grammarAccess.getUnary_exprAccess().getPrimary_exprParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unary_expr__Alternatives"


    // $ANTLR start "rule__Primary_expr__Alternatives"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1387:1: rule__Primary_expr__Alternatives : ( ( ( rule__Primary_expr__NameAssignment_0 ) ) | ( ( rule__Primary_expr__Group_1__0 ) ) );
    public final void rule__Primary_expr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1391:1: ( ( ( rule__Primary_expr__NameAssignment_0 ) ) | ( ( rule__Primary_expr__Group_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)) ) {
                alt10=1;
            }
            else if ( (LA10_0==39) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1392:1: ( ( rule__Primary_expr__NameAssignment_0 ) )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1392:1: ( ( rule__Primary_expr__NameAssignment_0 ) )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1393:1: ( rule__Primary_expr__NameAssignment_0 )
                    {
                     before(grammarAccess.getPrimary_exprAccess().getNameAssignment_0()); 
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1394:1: ( rule__Primary_expr__NameAssignment_0 )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1394:2: rule__Primary_expr__NameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Primary_expr__NameAssignment_0_in_rule__Primary_expr__Alternatives2908);
                    rule__Primary_expr__NameAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimary_exprAccess().getNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1398:6: ( ( rule__Primary_expr__Group_1__0 ) )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1398:6: ( ( rule__Primary_expr__Group_1__0 ) )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1399:1: ( rule__Primary_expr__Group_1__0 )
                    {
                     before(grammarAccess.getPrimary_exprAccess().getGroup_1()); 
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1400:1: ( rule__Primary_expr__Group_1__0 )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1400:2: rule__Primary_expr__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Primary_expr__Group_1__0_in_rule__Primary_expr__Alternatives2926);
                    rule__Primary_expr__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimary_exprAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary_expr__Alternatives"


    // $ANTLR start "rule__Primary_expr__NameAlternatives_0_0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1409:1: rule__Primary_expr__NameAlternatives_0_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__Primary_expr__NameAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1413:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_STRING) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1414:1: ( RULE_ID )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1414:1: ( RULE_ID )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1415:1: RULE_ID
                    {
                     before(grammarAccess.getPrimary_exprAccess().getNameIDTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Primary_expr__NameAlternatives_0_02959); 
                     after(grammarAccess.getPrimary_exprAccess().getNameIDTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1420:6: ( RULE_STRING )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1420:6: ( RULE_STRING )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1421:1: RULE_STRING
                    {
                     before(grammarAccess.getPrimary_exprAccess().getNameSTRINGTerminalRuleCall_0_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Primary_expr__NameAlternatives_0_02976); 
                     after(grammarAccess.getPrimary_exprAccess().getNameSTRINGTerminalRuleCall_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary_expr__NameAlternatives_0_0"


    // $ANTLR start "rule__Default__Alternatives_1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1431:1: rule__Default__Alternatives_1 : ( ( 'default:' ) | ( 'allviews:' ) | ( 'all:' ) );
    public final void rule__Default__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1435:1: ( ( 'default:' ) | ( 'allviews:' ) | ( 'all:' ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt12=1;
                }
                break;
            case 16:
                {
                alt12=2;
                }
                break;
            case 17:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1436:1: ( 'default:' )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1436:1: ( 'default:' )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1437:1: 'default:'
                    {
                     before(grammarAccess.getDefaultAccess().getDefaultKeyword_1_0()); 
                    match(input,15,FOLLOW_15_in_rule__Default__Alternatives_13009); 
                     after(grammarAccess.getDefaultAccess().getDefaultKeyword_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1444:6: ( 'allviews:' )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1444:6: ( 'allviews:' )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1445:1: 'allviews:'
                    {
                     before(grammarAccess.getDefaultAccess().getAllviewsKeyword_1_1()); 
                    match(input,16,FOLLOW_16_in_rule__Default__Alternatives_13029); 
                     after(grammarAccess.getDefaultAccess().getAllviewsKeyword_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1452:6: ( 'all:' )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1452:6: ( 'all:' )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1453:1: 'all:'
                    {
                     before(grammarAccess.getDefaultAccess().getAllKeyword_1_2()); 
                    match(input,17,FOLLOW_17_in_rule__Default__Alternatives_13049); 
                     after(grammarAccess.getDefaultAccess().getAllKeyword_1_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Alternatives_1"


    // $ANTLR start "rule__FeatureInclusionExclusion__Alternatives"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1465:1: rule__FeatureInclusionExclusion__Alternatives : ( ( ( rule__FeatureInclusionExclusion__ExceptAssignment_0 ) ) | ( ( rule__FeatureInclusionExclusion__OnlyAssignment_1 ) ) );
    public final void rule__FeatureInclusionExclusion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1469:1: ( ( ( rule__FeatureInclusionExclusion__ExceptAssignment_0 ) ) | ( ( rule__FeatureInclusionExclusion__OnlyAssignment_1 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==53) ) {
                alt13=1;
            }
            else if ( (LA13_0==54) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1470:1: ( ( rule__FeatureInclusionExclusion__ExceptAssignment_0 ) )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1470:1: ( ( rule__FeatureInclusionExclusion__ExceptAssignment_0 ) )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1471:1: ( rule__FeatureInclusionExclusion__ExceptAssignment_0 )
                    {
                     before(grammarAccess.getFeatureInclusionExclusionAccess().getExceptAssignment_0()); 
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1472:1: ( rule__FeatureInclusionExclusion__ExceptAssignment_0 )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1472:2: rule__FeatureInclusionExclusion__ExceptAssignment_0
                    {
                    pushFollow(FOLLOW_rule__FeatureInclusionExclusion__ExceptAssignment_0_in_rule__FeatureInclusionExclusion__Alternatives3083);
                    rule__FeatureInclusionExclusion__ExceptAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFeatureInclusionExclusionAccess().getExceptAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1476:6: ( ( rule__FeatureInclusionExclusion__OnlyAssignment_1 ) )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1476:6: ( ( rule__FeatureInclusionExclusion__OnlyAssignment_1 ) )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1477:1: ( rule__FeatureInclusionExclusion__OnlyAssignment_1 )
                    {
                     before(grammarAccess.getFeatureInclusionExclusionAccess().getOnlyAssignment_1()); 
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1478:1: ( rule__FeatureInclusionExclusion__OnlyAssignment_1 )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1478:2: rule__FeatureInclusionExclusion__OnlyAssignment_1
                    {
                    pushFollow(FOLLOW_rule__FeatureInclusionExclusion__OnlyAssignment_1_in_rule__FeatureInclusionExclusion__Alternatives3101);
                    rule__FeatureInclusionExclusion__OnlyAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFeatureInclusionExclusionAccess().getOnlyAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureInclusionExclusion__Alternatives"


    // $ANTLR start "rule__ExceptFeature__FtsAlternatives_1_0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1487:1: rule__ExceptFeature__FtsAlternatives_1_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__ExceptFeature__FtsAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1491:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_STRING) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1492:1: ( RULE_ID )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1492:1: ( RULE_ID )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1493:1: RULE_ID
                    {
                     before(grammarAccess.getExceptFeatureAccess().getFtsIDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExceptFeature__FtsAlternatives_1_03134); 
                     after(grammarAccess.getExceptFeatureAccess().getFtsIDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1498:6: ( RULE_STRING )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1498:6: ( RULE_STRING )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1499:1: RULE_STRING
                    {
                     before(grammarAccess.getExceptFeatureAccess().getFtsSTRINGTerminalRuleCall_1_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ExceptFeature__FtsAlternatives_1_03151); 
                     after(grammarAccess.getExceptFeatureAccess().getFtsSTRINGTerminalRuleCall_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptFeature__FtsAlternatives_1_0"


    // $ANTLR start "rule__OnlyFeature__FtsAlternatives_1_0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1509:1: rule__OnlyFeature__FtsAlternatives_1_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__OnlyFeature__FtsAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1513:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_STRING) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1514:1: ( RULE_ID )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1514:1: ( RULE_ID )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1515:1: RULE_ID
                    {
                     before(grammarAccess.getOnlyFeatureAccess().getFtsIDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OnlyFeature__FtsAlternatives_1_03183); 
                     after(grammarAccess.getOnlyFeatureAccess().getFtsIDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1520:6: ( RULE_STRING )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1520:6: ( RULE_STRING )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1521:1: RULE_STRING
                    {
                     before(grammarAccess.getOnlyFeatureAccess().getFtsSTRINGTerminalRuleCall_1_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__OnlyFeature__FtsAlternatives_1_03200); 
                     after(grammarAccess.getOnlyFeatureAccess().getFtsSTRINGTerminalRuleCall_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnlyFeature__FtsAlternatives_1_0"


    // $ANTLR start "rule__ProductInclusionExclusion__Alternatives"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1531:1: rule__ProductInclusionExclusion__Alternatives : ( ( ( rule__ProductInclusionExclusion__ExceptAssignment_0 ) ) | ( ( rule__ProductInclusionExclusion__OnlyAssignment_1 ) ) );
    public final void rule__ProductInclusionExclusion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1535:1: ( ( ( rule__ProductInclusionExclusion__ExceptAssignment_0 ) ) | ( ( rule__ProductInclusionExclusion__OnlyAssignment_1 ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==55) ) {
                alt16=1;
            }
            else if ( (LA16_0==56) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1536:1: ( ( rule__ProductInclusionExclusion__ExceptAssignment_0 ) )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1536:1: ( ( rule__ProductInclusionExclusion__ExceptAssignment_0 ) )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1537:1: ( rule__ProductInclusionExclusion__ExceptAssignment_0 )
                    {
                     before(grammarAccess.getProductInclusionExclusionAccess().getExceptAssignment_0()); 
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1538:1: ( rule__ProductInclusionExclusion__ExceptAssignment_0 )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1538:2: rule__ProductInclusionExclusion__ExceptAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ProductInclusionExclusion__ExceptAssignment_0_in_rule__ProductInclusionExclusion__Alternatives3232);
                    rule__ProductInclusionExclusion__ExceptAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProductInclusionExclusionAccess().getExceptAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1542:6: ( ( rule__ProductInclusionExclusion__OnlyAssignment_1 ) )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1542:6: ( ( rule__ProductInclusionExclusion__OnlyAssignment_1 ) )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1543:1: ( rule__ProductInclusionExclusion__OnlyAssignment_1 )
                    {
                     before(grammarAccess.getProductInclusionExclusionAccess().getOnlyAssignment_1()); 
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1544:1: ( rule__ProductInclusionExclusion__OnlyAssignment_1 )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1544:2: rule__ProductInclusionExclusion__OnlyAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ProductInclusionExclusion__OnlyAssignment_1_in_rule__ProductInclusionExclusion__Alternatives3250);
                    rule__ProductInclusionExclusion__OnlyAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getProductInclusionExclusionAccess().getOnlyAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductInclusionExclusion__Alternatives"


    // $ANTLR start "rule__ExceptProduct__PdsAlternatives_1_0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1553:1: rule__ExceptProduct__PdsAlternatives_1_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__ExceptProduct__PdsAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1557:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_STRING) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1558:1: ( RULE_ID )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1558:1: ( RULE_ID )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1559:1: RULE_ID
                    {
                     before(grammarAccess.getExceptProductAccess().getPdsIDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExceptProduct__PdsAlternatives_1_03283); 
                     after(grammarAccess.getExceptProductAccess().getPdsIDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1564:6: ( RULE_STRING )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1564:6: ( RULE_STRING )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1565:1: RULE_STRING
                    {
                     before(grammarAccess.getExceptProductAccess().getPdsSTRINGTerminalRuleCall_1_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ExceptProduct__PdsAlternatives_1_03300); 
                     after(grammarAccess.getExceptProductAccess().getPdsSTRINGTerminalRuleCall_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptProduct__PdsAlternatives_1_0"


    // $ANTLR start "rule__OnlyProduct__PdsAlternatives_1_0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1575:1: rule__OnlyProduct__PdsAlternatives_1_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__OnlyProduct__PdsAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1579:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_STRING) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1580:1: ( RULE_ID )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1580:1: ( RULE_ID )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1581:1: RULE_ID
                    {
                     before(grammarAccess.getOnlyProductAccess().getPdsIDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OnlyProduct__PdsAlternatives_1_03332); 
                     after(grammarAccess.getOnlyProductAccess().getPdsIDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1586:6: ( RULE_STRING )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1586:6: ( RULE_STRING )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1587:1: RULE_STRING
                    {
                     before(grammarAccess.getOnlyProductAccess().getPdsSTRINGTerminalRuleCall_1_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__OnlyProduct__PdsAlternatives_1_03349); 
                     after(grammarAccess.getOnlyProductAccess().getPdsSTRINGTerminalRuleCall_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnlyProduct__PdsAlternatives_1_0"


    // $ANTLR start "rule__Rewriting__Alternatives_0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1597:1: rule__Rewriting__Alternatives_0 : ( ( 'rewriting:' ) | ( 'renaming:' ) );
    public final void rule__Rewriting__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1601:1: ( ( 'rewriting:' ) | ( 'renaming:' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==18) ) {
                alt19=1;
            }
            else if ( (LA19_0==19) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1602:1: ( 'rewriting:' )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1602:1: ( 'rewriting:' )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1603:1: 'rewriting:'
                    {
                     before(grammarAccess.getRewritingAccess().getRewritingKeyword_0_0()); 
                    match(input,18,FOLLOW_18_in_rule__Rewriting__Alternatives_03382); 
                     after(grammarAccess.getRewritingAccess().getRewritingKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1610:6: ( 'renaming:' )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1610:6: ( 'renaming:' )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1611:1: 'renaming:'
                    {
                     before(grammarAccess.getRewritingAccess().getRenamingKeyword_0_1()); 
                    match(input,19,FOLLOW_19_in_rule__Rewriting__Alternatives_03402); 
                     after(grammarAccess.getRewritingAccess().getRenamingKeyword_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rewriting__Alternatives_0"


    // $ANTLR start "rule__Rewriting__OftAlternatives_1_0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1623:1: rule__Rewriting__OftAlternatives_1_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__Rewriting__OftAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1627:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_STRING) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1628:1: ( RULE_ID )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1628:1: ( RULE_ID )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1629:1: RULE_ID
                    {
                     before(grammarAccess.getRewritingAccess().getOftIDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Rewriting__OftAlternatives_1_03436); 
                     after(grammarAccess.getRewritingAccess().getOftIDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1634:6: ( RULE_STRING )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1634:6: ( RULE_STRING )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1635:1: RULE_STRING
                    {
                     before(grammarAccess.getRewritingAccess().getOftSTRINGTerminalRuleCall_1_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Rewriting__OftAlternatives_1_03453); 
                     after(grammarAccess.getRewritingAccess().getOftSTRINGTerminalRuleCall_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rewriting__OftAlternatives_1_0"


    // $ANTLR start "rule__MultiValueInterpretation__ValAlternatives_0_0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1645:1: rule__MultiValueInterpretation__ValAlternatives_0_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__MultiValueInterpretation__ValAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1649:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_STRING) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1650:1: ( RULE_ID )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1650:1: ( RULE_ID )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1651:1: RULE_ID
                    {
                     before(grammarAccess.getMultiValueInterpretationAccess().getValIDTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MultiValueInterpretation__ValAlternatives_0_03485); 
                     after(grammarAccess.getMultiValueInterpretationAccess().getValIDTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1656:6: ( RULE_STRING )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1656:6: ( RULE_STRING )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1657:1: RULE_STRING
                    {
                     before(grammarAccess.getMultiValueInterpretationAccess().getValSTRINGTerminalRuleCall_0_0_1()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__MultiValueInterpretation__ValAlternatives_0_03502); 
                     after(grammarAccess.getMultiValueInterpretationAccess().getValSTRINGTerminalRuleCall_0_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiValueInterpretation__ValAlternatives_0_0"


    // $ANTLR start "rule__KindRelation__Alternatives"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1667:1: rule__KindRelation__Alternatives : ( ( ( 'below' ) ) | ( ( 'above' ) ) | ( ( 'moveIn' ) ) | ( ( 'copyIn' ) ) );
    public final void rule__KindRelation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1671:1: ( ( ( 'below' ) ) | ( ( 'above' ) ) | ( ( 'moveIn' ) ) | ( ( 'copyIn' ) ) )
            int alt22=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt22=1;
                }
                break;
            case 21:
                {
                alt22=2;
                }
                break;
            case 22:
                {
                alt22=3;
                }
                break;
            case 23:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1672:1: ( ( 'below' ) )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1672:1: ( ( 'below' ) )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1673:1: ( 'below' )
                    {
                     before(grammarAccess.getKindRelationAccess().getBELOWEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1674:1: ( 'below' )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1674:3: 'below'
                    {
                    match(input,20,FOLLOW_20_in_rule__KindRelation__Alternatives3535); 

                    }

                     after(grammarAccess.getKindRelationAccess().getBELOWEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1679:6: ( ( 'above' ) )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1679:6: ( ( 'above' ) )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1680:1: ( 'above' )
                    {
                     before(grammarAccess.getKindRelationAccess().getABOVEEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1681:1: ( 'above' )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1681:3: 'above'
                    {
                    match(input,21,FOLLOW_21_in_rule__KindRelation__Alternatives3556); 

                    }

                     after(grammarAccess.getKindRelationAccess().getABOVEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1686:6: ( ( 'moveIn' ) )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1686:6: ( ( 'moveIn' ) )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1687:1: ( 'moveIn' )
                    {
                     before(grammarAccess.getKindRelationAccess().getMOVEEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1688:1: ( 'moveIn' )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1688:3: 'moveIn'
                    {
                    match(input,22,FOLLOW_22_in_rule__KindRelation__Alternatives3577); 

                    }

                     after(grammarAccess.getKindRelationAccess().getMOVEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1693:6: ( ( 'copyIn' ) )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1693:6: ( ( 'copyIn' ) )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1694:1: ( 'copyIn' )
                    {
                     before(grammarAccess.getKindRelationAccess().getCOPYEnumLiteralDeclaration_3()); 
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1695:1: ( 'copyIn' )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1695:3: 'copyIn'
                    {
                    match(input,23,FOLLOW_23_in_rule__KindRelation__Alternatives3598); 

                    }

                     after(grammarAccess.getKindRelationAccess().getCOPYEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KindRelation__Alternatives"


    // $ANTLR start "rule__FileFormat__Alternatives"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1705:1: rule__FileFormat__Alternatives : ( ( ( 'CSV' ) ) | ( ( 'RDF' ) ) | ( ( 'XML' ) ) );
    public final void rule__FileFormat__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1709:1: ( ( ( 'CSV' ) ) | ( ( 'RDF' ) ) | ( ( 'XML' ) ) )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt23=1;
                }
                break;
            case 25:
                {
                alt23=2;
                }
                break;
            case 26:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1710:1: ( ( 'CSV' ) )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1710:1: ( ( 'CSV' ) )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1711:1: ( 'CSV' )
                    {
                     before(grammarAccess.getFileFormatAccess().getCSVEnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1712:1: ( 'CSV' )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1712:3: 'CSV'
                    {
                    match(input,24,FOLLOW_24_in_rule__FileFormat__Alternatives3634); 

                    }

                     after(grammarAccess.getFileFormatAccess().getCSVEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1717:6: ( ( 'RDF' ) )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1717:6: ( ( 'RDF' ) )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1718:1: ( 'RDF' )
                    {
                     before(grammarAccess.getFileFormatAccess().getRDFEnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1719:1: ( 'RDF' )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1719:3: 'RDF'
                    {
                    match(input,25,FOLLOW_25_in_rule__FileFormat__Alternatives3655); 

                    }

                     after(grammarAccess.getFileFormatAccess().getRDFEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1724:6: ( ( 'XML' ) )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1724:6: ( ( 'XML' ) )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1725:1: ( 'XML' )
                    {
                     before(grammarAccess.getFileFormatAccess().getXMLEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1726:1: ( 'XML' )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1726:3: 'XML'
                    {
                    match(input,26,FOLLOW_26_in_rule__FileFormat__Alternatives3676); 

                    }

                     after(grammarAccess.getFileFormatAccess().getXMLEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileFormat__Alternatives"


    // $ANTLR start "rule__VariabilityInterpretation__Alternatives"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1736:1: rule__VariabilityInterpretation__Alternatives : ( ( ( 'Alternatives' ) ) | ( ( 'OR-Alternatives' ) ) | ( ( 'Optional' ) ) | ( ( 'Mandatory' ) ) | ( ( 'Concat' ) ) );
    public final void rule__VariabilityInterpretation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1740:1: ( ( ( 'Alternatives' ) ) | ( ( 'OR-Alternatives' ) ) | ( ( 'Optional' ) ) | ( ( 'Mandatory' ) ) | ( ( 'Concat' ) ) )
            int alt24=5;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt24=1;
                }
                break;
            case 28:
                {
                alt24=2;
                }
                break;
            case 29:
                {
                alt24=3;
                }
                break;
            case 30:
                {
                alt24=4;
                }
                break;
            case 31:
                {
                alt24=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1741:1: ( ( 'Alternatives' ) )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1741:1: ( ( 'Alternatives' ) )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1742:1: ( 'Alternatives' )
                    {
                     before(grammarAccess.getVariabilityInterpretationAccess().getXOREnumLiteralDeclaration_0()); 
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1743:1: ( 'Alternatives' )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1743:3: 'Alternatives'
                    {
                    match(input,27,FOLLOW_27_in_rule__VariabilityInterpretation__Alternatives3712); 

                    }

                     after(grammarAccess.getVariabilityInterpretationAccess().getXOREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1748:6: ( ( 'OR-Alternatives' ) )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1748:6: ( ( 'OR-Alternatives' ) )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1749:1: ( 'OR-Alternatives' )
                    {
                     before(grammarAccess.getVariabilityInterpretationAccess().getOREnumLiteralDeclaration_1()); 
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1750:1: ( 'OR-Alternatives' )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1750:3: 'OR-Alternatives'
                    {
                    match(input,28,FOLLOW_28_in_rule__VariabilityInterpretation__Alternatives3733); 

                    }

                     after(grammarAccess.getVariabilityInterpretationAccess().getOREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1755:6: ( ( 'Optional' ) )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1755:6: ( ( 'Optional' ) )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1756:1: ( 'Optional' )
                    {
                     before(grammarAccess.getVariabilityInterpretationAccess().getOPTEnumLiteralDeclaration_2()); 
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1757:1: ( 'Optional' )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1757:3: 'Optional'
                    {
                    match(input,29,FOLLOW_29_in_rule__VariabilityInterpretation__Alternatives3754); 

                    }

                     after(grammarAccess.getVariabilityInterpretationAccess().getOPTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1762:6: ( ( 'Mandatory' ) )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1762:6: ( ( 'Mandatory' ) )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1763:1: ( 'Mandatory' )
                    {
                     before(grammarAccess.getVariabilityInterpretationAccess().getMANDEnumLiteralDeclaration_3()); 
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1764:1: ( 'Mandatory' )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1764:3: 'Mandatory'
                    {
                    match(input,30,FOLLOW_30_in_rule__VariabilityInterpretation__Alternatives3775); 

                    }

                     after(grammarAccess.getVariabilityInterpretationAccess().getMANDEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1769:6: ( ( 'Concat' ) )
                    {
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1769:6: ( ( 'Concat' ) )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1770:1: ( 'Concat' )
                    {
                     before(grammarAccess.getVariabilityInterpretationAccess().getCONCATEnumLiteralDeclaration_4()); 
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1771:1: ( 'Concat' )
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1771:3: 'Concat'
                    {
                    match(input,31,FOLLOW_31_in_rule__VariabilityInterpretation__Alternatives3796); 

                    }

                     after(grammarAccess.getVariabilityInterpretationAccess().getCONCATEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariabilityInterpretation__Alternatives"


    // $ANTLR start "rule__SToFMModel__Group__0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1783:1: rule__SToFMModel__Group__0 : rule__SToFMModel__Group__0__Impl rule__SToFMModel__Group__1 ;
    public final void rule__SToFMModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1787:1: ( rule__SToFMModel__Group__0__Impl rule__SToFMModel__Group__1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1788:2: rule__SToFMModel__Group__0__Impl rule__SToFMModel__Group__1
            {
            pushFollow(FOLLOW_rule__SToFMModel__Group__0__Impl_in_rule__SToFMModel__Group__03829);
            rule__SToFMModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SToFMModel__Group__1_in_rule__SToFMModel__Group__03832);
            rule__SToFMModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SToFMModel__Group__0"


    // $ANTLR start "rule__SToFMModel__Group__0__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1795:1: rule__SToFMModel__Group__0__Impl : ( ( rule__SToFMModel__ImportViewsAssignment_0 ) ) ;
    public final void rule__SToFMModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1799:1: ( ( ( rule__SToFMModel__ImportViewsAssignment_0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1800:1: ( ( rule__SToFMModel__ImportViewsAssignment_0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1800:1: ( ( rule__SToFMModel__ImportViewsAssignment_0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1801:1: ( rule__SToFMModel__ImportViewsAssignment_0 )
            {
             before(grammarAccess.getSToFMModelAccess().getImportViewsAssignment_0()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1802:1: ( rule__SToFMModel__ImportViewsAssignment_0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1802:2: rule__SToFMModel__ImportViewsAssignment_0
            {
            pushFollow(FOLLOW_rule__SToFMModel__ImportViewsAssignment_0_in_rule__SToFMModel__Group__0__Impl3859);
            rule__SToFMModel__ImportViewsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSToFMModelAccess().getImportViewsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SToFMModel__Group__0__Impl"


    // $ANTLR start "rule__SToFMModel__Group__1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1812:1: rule__SToFMModel__Group__1 : rule__SToFMModel__Group__1__Impl rule__SToFMModel__Group__2 ;
    public final void rule__SToFMModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1816:1: ( rule__SToFMModel__Group__1__Impl rule__SToFMModel__Group__2 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1817:2: rule__SToFMModel__Group__1__Impl rule__SToFMModel__Group__2
            {
            pushFollow(FOLLOW_rule__SToFMModel__Group__1__Impl_in_rule__SToFMModel__Group__13889);
            rule__SToFMModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SToFMModel__Group__2_in_rule__SToFMModel__Group__13892);
            rule__SToFMModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SToFMModel__Group__1"


    // $ANTLR start "rule__SToFMModel__Group__1__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1824:1: rule__SToFMModel__Group__1__Impl : ( ( rule__SToFMModel__SplNameAssignment_1 ) ) ;
    public final void rule__SToFMModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1828:1: ( ( ( rule__SToFMModel__SplNameAssignment_1 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1829:1: ( ( rule__SToFMModel__SplNameAssignment_1 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1829:1: ( ( rule__SToFMModel__SplNameAssignment_1 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1830:1: ( rule__SToFMModel__SplNameAssignment_1 )
            {
             before(grammarAccess.getSToFMModelAccess().getSplNameAssignment_1()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1831:1: ( rule__SToFMModel__SplNameAssignment_1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1831:2: rule__SToFMModel__SplNameAssignment_1
            {
            pushFollow(FOLLOW_rule__SToFMModel__SplNameAssignment_1_in_rule__SToFMModel__Group__1__Impl3919);
            rule__SToFMModel__SplNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSToFMModelAccess().getSplNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SToFMModel__Group__1__Impl"


    // $ANTLR start "rule__SToFMModel__Group__2"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1841:1: rule__SToFMModel__Group__2 : rule__SToFMModel__Group__2__Impl rule__SToFMModel__Group__3 ;
    public final void rule__SToFMModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1845:1: ( rule__SToFMModel__Group__2__Impl rule__SToFMModel__Group__3 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1846:2: rule__SToFMModel__Group__2__Impl rule__SToFMModel__Group__3
            {
            pushFollow(FOLLOW_rule__SToFMModel__Group__2__Impl_in_rule__SToFMModel__Group__23949);
            rule__SToFMModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SToFMModel__Group__3_in_rule__SToFMModel__Group__23952);
            rule__SToFMModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SToFMModel__Group__2"


    // $ANTLR start "rule__SToFMModel__Group__2__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1853:1: rule__SToFMModel__Group__2__Impl : ( ( rule__SToFMModel__SchemaAssignment_2 )? ) ;
    public final void rule__SToFMModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1857:1: ( ( ( rule__SToFMModel__SchemaAssignment_2 )? ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1858:1: ( ( rule__SToFMModel__SchemaAssignment_2 )? )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1858:1: ( ( rule__SToFMModel__SchemaAssignment_2 )? )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1859:1: ( rule__SToFMModel__SchemaAssignment_2 )?
            {
             before(grammarAccess.getSToFMModelAccess().getSchemaAssignment_2()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1860:1: ( rule__SToFMModel__SchemaAssignment_2 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==35) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1860:2: rule__SToFMModel__SchemaAssignment_2
                    {
                    pushFollow(FOLLOW_rule__SToFMModel__SchemaAssignment_2_in_rule__SToFMModel__Group__2__Impl3979);
                    rule__SToFMModel__SchemaAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSToFMModelAccess().getSchemaAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SToFMModel__Group__2__Impl"


    // $ANTLR start "rule__SToFMModel__Group__3"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1870:1: rule__SToFMModel__Group__3 : rule__SToFMModel__Group__3__Impl rule__SToFMModel__Group__4 ;
    public final void rule__SToFMModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1874:1: ( rule__SToFMModel__Group__3__Impl rule__SToFMModel__Group__4 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1875:2: rule__SToFMModel__Group__3__Impl rule__SToFMModel__Group__4
            {
            pushFollow(FOLLOW_rule__SToFMModel__Group__3__Impl_in_rule__SToFMModel__Group__34010);
            rule__SToFMModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SToFMModel__Group__4_in_rule__SToFMModel__Group__34013);
            rule__SToFMModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SToFMModel__Group__3"


    // $ANTLR start "rule__SToFMModel__Group__3__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1882:1: rule__SToFMModel__Group__3__Impl : ( ( rule__SToFMModel__DefaultAssignment_3 )? ) ;
    public final void rule__SToFMModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1886:1: ( ( ( rule__SToFMModel__DefaultAssignment_3 )? ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1887:1: ( ( rule__SToFMModel__DefaultAssignment_3 )? )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1887:1: ( ( rule__SToFMModel__DefaultAssignment_3 )? )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1888:1: ( rule__SToFMModel__DefaultAssignment_3 )?
            {
             before(grammarAccess.getSToFMModelAccess().getDefaultAssignment_3()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1889:1: ( rule__SToFMModel__DefaultAssignment_3 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=15 && LA26_0<=17)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1889:2: rule__SToFMModel__DefaultAssignment_3
                    {
                    pushFollow(FOLLOW_rule__SToFMModel__DefaultAssignment_3_in_rule__SToFMModel__Group__3__Impl4040);
                    rule__SToFMModel__DefaultAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSToFMModelAccess().getDefaultAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SToFMModel__Group__3__Impl"


    // $ANTLR start "rule__SToFMModel__Group__4"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1899:1: rule__SToFMModel__Group__4 : rule__SToFMModel__Group__4__Impl ;
    public final void rule__SToFMModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1903:1: ( rule__SToFMModel__Group__4__Impl )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1904:2: rule__SToFMModel__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SToFMModel__Group__4__Impl_in_rule__SToFMModel__Group__44071);
            rule__SToFMModel__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SToFMModel__Group__4"


    // $ANTLR start "rule__SToFMModel__Group__4__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1910:1: rule__SToFMModel__Group__4__Impl : ( ( rule__SToFMModel__ScopingAssignment_4 )* ) ;
    public final void rule__SToFMModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1914:1: ( ( ( rule__SToFMModel__ScopingAssignment_4 )* ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1915:1: ( ( rule__SToFMModel__ScopingAssignment_4 )* )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1915:1: ( ( rule__SToFMModel__ScopingAssignment_4 )* )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1916:1: ( rule__SToFMModel__ScopingAssignment_4 )*
            {
             before(grammarAccess.getSToFMModelAccess().getScopingAssignment_4()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1917:1: ( rule__SToFMModel__ScopingAssignment_4 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==51) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1917:2: rule__SToFMModel__ScopingAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__SToFMModel__ScopingAssignment_4_in_rule__SToFMModel__Group__4__Impl4098);
            	    rule__SToFMModel__ScopingAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getSToFMModelAccess().getScopingAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SToFMModel__Group__4__Impl"


    // $ANTLR start "rule__ImportViews__Group__0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1937:1: rule__ImportViews__Group__0 : rule__ImportViews__Group__0__Impl rule__ImportViews__Group__1 ;
    public final void rule__ImportViews__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1941:1: ( rule__ImportViews__Group__0__Impl rule__ImportViews__Group__1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1942:2: rule__ImportViews__Group__0__Impl rule__ImportViews__Group__1
            {
            pushFollow(FOLLOW_rule__ImportViews__Group__0__Impl_in_rule__ImportViews__Group__04139);
            rule__ImportViews__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImportViews__Group__1_in_rule__ImportViews__Group__04142);
            rule__ImportViews__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportViews__Group__0"


    // $ANTLR start "rule__ImportViews__Group__0__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1949:1: rule__ImportViews__Group__0__Impl : ( 'import:' ) ;
    public final void rule__ImportViews__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1953:1: ( ( 'import:' ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1954:1: ( 'import:' )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1954:1: ( 'import:' )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1955:1: 'import:'
            {
             before(grammarAccess.getImportViewsAccess().getImportKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__ImportViews__Group__0__Impl4170); 
             after(grammarAccess.getImportViewsAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportViews__Group__0__Impl"


    // $ANTLR start "rule__ImportViews__Group__1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1968:1: rule__ImportViews__Group__1 : rule__ImportViews__Group__1__Impl ;
    public final void rule__ImportViews__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1972:1: ( rule__ImportViews__Group__1__Impl )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1973:2: rule__ImportViews__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ImportViews__Group__1__Impl_in_rule__ImportViews__Group__14201);
            rule__ImportViews__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportViews__Group__1"


    // $ANTLR start "rule__ImportViews__Group__1__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1979:1: rule__ImportViews__Group__1__Impl : ( ( ( rule__ImportViews__ViewsAssignment_1 ) ) ( ( rule__ImportViews__ViewsAssignment_1 )* ) ) ;
    public final void rule__ImportViews__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1983:1: ( ( ( ( rule__ImportViews__ViewsAssignment_1 ) ) ( ( rule__ImportViews__ViewsAssignment_1 )* ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1984:1: ( ( ( rule__ImportViews__ViewsAssignment_1 ) ) ( ( rule__ImportViews__ViewsAssignment_1 )* ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1984:1: ( ( ( rule__ImportViews__ViewsAssignment_1 ) ) ( ( rule__ImportViews__ViewsAssignment_1 )* ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1985:1: ( ( rule__ImportViews__ViewsAssignment_1 ) ) ( ( rule__ImportViews__ViewsAssignment_1 )* )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1985:1: ( ( rule__ImportViews__ViewsAssignment_1 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1986:1: ( rule__ImportViews__ViewsAssignment_1 )
            {
             before(grammarAccess.getImportViewsAccess().getViewsAssignment_1()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1987:1: ( rule__ImportViews__ViewsAssignment_1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1987:2: rule__ImportViews__ViewsAssignment_1
            {
            pushFollow(FOLLOW_rule__ImportViews__ViewsAssignment_1_in_rule__ImportViews__Group__1__Impl4230);
            rule__ImportViews__ViewsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportViewsAccess().getViewsAssignment_1()); 

            }

            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1990:1: ( ( rule__ImportViews__ViewsAssignment_1 )* )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1991:1: ( rule__ImportViews__ViewsAssignment_1 )*
            {
             before(grammarAccess.getImportViewsAccess().getViewsAssignment_1()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1992:1: ( rule__ImportViews__ViewsAssignment_1 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_STRING) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:1992:2: rule__ImportViews__ViewsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__ImportViews__ViewsAssignment_1_in_rule__ImportViews__Group__1__Impl4242);
            	    rule__ImportViews__ViewsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getImportViewsAccess().getViewsAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportViews__Group__1__Impl"


    // $ANTLR start "rule__DataView__Group__0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2007:1: rule__DataView__Group__0 : rule__DataView__Group__0__Impl rule__DataView__Group__1 ;
    public final void rule__DataView__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2011:1: ( rule__DataView__Group__0__Impl rule__DataView__Group__1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2012:2: rule__DataView__Group__0__Impl rule__DataView__Group__1
            {
            pushFollow(FOLLOW_rule__DataView__Group__0__Impl_in_rule__DataView__Group__04279);
            rule__DataView__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataView__Group__1_in_rule__DataView__Group__04282);
            rule__DataView__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataView__Group__0"


    // $ANTLR start "rule__DataView__Group__0__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2019:1: rule__DataView__Group__0__Impl : ( ( rule__DataView__FileAssignment_0 ) ) ;
    public final void rule__DataView__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2023:1: ( ( ( rule__DataView__FileAssignment_0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2024:1: ( ( rule__DataView__FileAssignment_0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2024:1: ( ( rule__DataView__FileAssignment_0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2025:1: ( rule__DataView__FileAssignment_0 )
            {
             before(grammarAccess.getDataViewAccess().getFileAssignment_0()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2026:1: ( rule__DataView__FileAssignment_0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2026:2: rule__DataView__FileAssignment_0
            {
            pushFollow(FOLLOW_rule__DataView__FileAssignment_0_in_rule__DataView__Group__0__Impl4309);
            rule__DataView__FileAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDataViewAccess().getFileAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataView__Group__0__Impl"


    // $ANTLR start "rule__DataView__Group__1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2036:1: rule__DataView__Group__1 : rule__DataView__Group__1__Impl ;
    public final void rule__DataView__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2040:1: ( rule__DataView__Group__1__Impl )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2041:2: rule__DataView__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DataView__Group__1__Impl_in_rule__DataView__Group__14339);
            rule__DataView__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataView__Group__1"


    // $ANTLR start "rule__DataView__Group__1__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2047:1: rule__DataView__Group__1__Impl : ( ( rule__DataView__Group_1__0 )? ) ;
    public final void rule__DataView__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2051:1: ( ( ( rule__DataView__Group_1__0 )? ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2052:1: ( ( rule__DataView__Group_1__0 )? )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2052:1: ( ( rule__DataView__Group_1__0 )? )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2053:1: ( rule__DataView__Group_1__0 )?
            {
             before(grammarAccess.getDataViewAccess().getGroup_1()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2054:1: ( rule__DataView__Group_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==33) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2054:2: rule__DataView__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__DataView__Group_1__0_in_rule__DataView__Group__1__Impl4366);
                    rule__DataView__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataViewAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataView__Group__1__Impl"


    // $ANTLR start "rule__DataView__Group_1__0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2068:1: rule__DataView__Group_1__0 : rule__DataView__Group_1__0__Impl rule__DataView__Group_1__1 ;
    public final void rule__DataView__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2072:1: ( rule__DataView__Group_1__0__Impl rule__DataView__Group_1__1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2073:2: rule__DataView__Group_1__0__Impl rule__DataView__Group_1__1
            {
            pushFollow(FOLLOW_rule__DataView__Group_1__0__Impl_in_rule__DataView__Group_1__04401);
            rule__DataView__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataView__Group_1__1_in_rule__DataView__Group_1__04404);
            rule__DataView__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataView__Group_1__0"


    // $ANTLR start "rule__DataView__Group_1__0__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2080:1: rule__DataView__Group_1__0__Impl : ( 'as' ) ;
    public final void rule__DataView__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2084:1: ( ( 'as' ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2085:1: ( 'as' )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2085:1: ( 'as' )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2086:1: 'as'
            {
             before(grammarAccess.getDataViewAccess().getAsKeyword_1_0()); 
            match(input,33,FOLLOW_33_in_rule__DataView__Group_1__0__Impl4432); 
             after(grammarAccess.getDataViewAccess().getAsKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataView__Group_1__0__Impl"


    // $ANTLR start "rule__DataView__Group_1__1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2099:1: rule__DataView__Group_1__1 : rule__DataView__Group_1__1__Impl ;
    public final void rule__DataView__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2103:1: ( rule__DataView__Group_1__1__Impl )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2104:2: rule__DataView__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__DataView__Group_1__1__Impl_in_rule__DataView__Group_1__14463);
            rule__DataView__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataView__Group_1__1"


    // $ANTLR start "rule__DataView__Group_1__1__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2110:1: rule__DataView__Group_1__1__Impl : ( ( rule__DataView__ViewnameAssignment_1_1 ) ) ;
    public final void rule__DataView__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2114:1: ( ( ( rule__DataView__ViewnameAssignment_1_1 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2115:1: ( ( rule__DataView__ViewnameAssignment_1_1 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2115:1: ( ( rule__DataView__ViewnameAssignment_1_1 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2116:1: ( rule__DataView__ViewnameAssignment_1_1 )
            {
             before(grammarAccess.getDataViewAccess().getViewnameAssignment_1_1()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2117:1: ( rule__DataView__ViewnameAssignment_1_1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2117:2: rule__DataView__ViewnameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__DataView__ViewnameAssignment_1_1_in_rule__DataView__Group_1__1__Impl4490);
            rule__DataView__ViewnameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDataViewAccess().getViewnameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataView__Group_1__1__Impl"


    // $ANTLR start "rule__SPLName__Group__0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2131:1: rule__SPLName__Group__0 : rule__SPLName__Group__0__Impl rule__SPLName__Group__1 ;
    public final void rule__SPLName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2135:1: ( rule__SPLName__Group__0__Impl rule__SPLName__Group__1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2136:2: rule__SPLName__Group__0__Impl rule__SPLName__Group__1
            {
            pushFollow(FOLLOW_rule__SPLName__Group__0__Impl_in_rule__SPLName__Group__04524);
            rule__SPLName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SPLName__Group__1_in_rule__SPLName__Group__04527);
            rule__SPLName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPLName__Group__0"


    // $ANTLR start "rule__SPLName__Group__0__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2143:1: rule__SPLName__Group__0__Impl : ( 'name:' ) ;
    public final void rule__SPLName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2147:1: ( ( 'name:' ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2148:1: ( 'name:' )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2148:1: ( 'name:' )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2149:1: 'name:'
            {
             before(grammarAccess.getSPLNameAccess().getNameKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__SPLName__Group__0__Impl4555); 
             after(grammarAccess.getSPLNameAccess().getNameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPLName__Group__0__Impl"


    // $ANTLR start "rule__SPLName__Group__1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2162:1: rule__SPLName__Group__1 : rule__SPLName__Group__1__Impl ;
    public final void rule__SPLName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2166:1: ( rule__SPLName__Group__1__Impl )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2167:2: rule__SPLName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SPLName__Group__1__Impl_in_rule__SPLName__Group__14586);
            rule__SPLName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPLName__Group__1"


    // $ANTLR start "rule__SPLName__Group__1__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2173:1: rule__SPLName__Group__1__Impl : ( ( rule__SPLName__NameAssignment_1 ) ) ;
    public final void rule__SPLName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2177:1: ( ( ( rule__SPLName__NameAssignment_1 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2178:1: ( ( rule__SPLName__NameAssignment_1 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2178:1: ( ( rule__SPLName__NameAssignment_1 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2179:1: ( rule__SPLName__NameAssignment_1 )
            {
             before(grammarAccess.getSPLNameAccess().getNameAssignment_1()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2180:1: ( rule__SPLName__NameAssignment_1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2180:2: rule__SPLName__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SPLName__NameAssignment_1_in_rule__SPLName__Group__1__Impl4613);
            rule__SPLName__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSPLNameAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPLName__Group__1__Impl"


    // $ANTLR start "rule__StructuringInformation__Group__0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2194:1: rule__StructuringInformation__Group__0 : rule__StructuringInformation__Group__0__Impl rule__StructuringInformation__Group__1 ;
    public final void rule__StructuringInformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2198:1: ( rule__StructuringInformation__Group__0__Impl rule__StructuringInformation__Group__1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2199:2: rule__StructuringInformation__Group__0__Impl rule__StructuringInformation__Group__1
            {
            pushFollow(FOLLOW_rule__StructuringInformation__Group__0__Impl_in_rule__StructuringInformation__Group__04647);
            rule__StructuringInformation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructuringInformation__Group__1_in_rule__StructuringInformation__Group__04650);
            rule__StructuringInformation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuringInformation__Group__0"


    // $ANTLR start "rule__StructuringInformation__Group__0__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2206:1: rule__StructuringInformation__Group__0__Impl : ( () ) ;
    public final void rule__StructuringInformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2210:1: ( ( () ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2211:1: ( () )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2211:1: ( () )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2212:1: ()
            {
             before(grammarAccess.getStructuringInformationAccess().getStructuringInformationAction_0()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2213:1: ()
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2215:1: 
            {
            }

             after(grammarAccess.getStructuringInformationAccess().getStructuringInformationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuringInformation__Group__0__Impl"


    // $ANTLR start "rule__StructuringInformation__Group__1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2225:1: rule__StructuringInformation__Group__1 : rule__StructuringInformation__Group__1__Impl rule__StructuringInformation__Group__2 ;
    public final void rule__StructuringInformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2229:1: ( rule__StructuringInformation__Group__1__Impl rule__StructuringInformation__Group__2 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2230:2: rule__StructuringInformation__Group__1__Impl rule__StructuringInformation__Group__2
            {
            pushFollow(FOLLOW_rule__StructuringInformation__Group__1__Impl_in_rule__StructuringInformation__Group__14708);
            rule__StructuringInformation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructuringInformation__Group__2_in_rule__StructuringInformation__Group__14711);
            rule__StructuringInformation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuringInformation__Group__1"


    // $ANTLR start "rule__StructuringInformation__Group__1__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2237:1: rule__StructuringInformation__Group__1__Impl : ( 'structure:' ) ;
    public final void rule__StructuringInformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2241:1: ( ( 'structure:' ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2242:1: ( 'structure:' )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2242:1: ( 'structure:' )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2243:1: 'structure:'
            {
             before(grammarAccess.getStructuringInformationAccess().getStructureKeyword_1()); 
            match(input,35,FOLLOW_35_in_rule__StructuringInformation__Group__1__Impl4739); 
             after(grammarAccess.getStructuringInformationAccess().getStructureKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuringInformation__Group__1__Impl"


    // $ANTLR start "rule__StructuringInformation__Group__2"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2256:1: rule__StructuringInformation__Group__2 : rule__StructuringInformation__Group__2__Impl rule__StructuringInformation__Group__3 ;
    public final void rule__StructuringInformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2260:1: ( rule__StructuringInformation__Group__2__Impl rule__StructuringInformation__Group__3 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2261:2: rule__StructuringInformation__Group__2__Impl rule__StructuringInformation__Group__3
            {
            pushFollow(FOLLOW_rule__StructuringInformation__Group__2__Impl_in_rule__StructuringInformation__Group__24770);
            rule__StructuringInformation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructuringInformation__Group__3_in_rule__StructuringInformation__Group__24773);
            rule__StructuringInformation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuringInformation__Group__2"


    // $ANTLR start "rule__StructuringInformation__Group__2__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2268:1: rule__StructuringInformation__Group__2__Impl : ( ( rule__StructuringInformation__RelationsAssignment_2 )* ) ;
    public final void rule__StructuringInformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2272:1: ( ( ( rule__StructuringInformation__RelationsAssignment_2 )* ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2273:1: ( ( rule__StructuringInformation__RelationsAssignment_2 )* )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2273:1: ( ( rule__StructuringInformation__RelationsAssignment_2 )* )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2274:1: ( rule__StructuringInformation__RelationsAssignment_2 )*
            {
             before(grammarAccess.getStructuringInformationAccess().getRelationsAssignment_2()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2275:1: ( rule__StructuringInformation__RelationsAssignment_2 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID) ) {
                    int LA30_1 = input.LA(2);

                    if ( ((LA30_1>=20 && LA30_1<=23)) ) {
                        alt30=1;
                    }


                }
                else if ( (LA30_0==RULE_STRING) ) {
                    int LA30_2 = input.LA(2);

                    if ( ((LA30_2>=20 && LA30_2<=23)) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2275:2: rule__StructuringInformation__RelationsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__StructuringInformation__RelationsAssignment_2_in_rule__StructuringInformation__Group__2__Impl4800);
            	    rule__StructuringInformation__RelationsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getStructuringInformationAccess().getRelationsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuringInformation__Group__2__Impl"


    // $ANTLR start "rule__StructuringInformation__Group__3"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2285:1: rule__StructuringInformation__Group__3 : rule__StructuringInformation__Group__3__Impl rule__StructuringInformation__Group__4 ;
    public final void rule__StructuringInformation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2289:1: ( rule__StructuringInformation__Group__3__Impl rule__StructuringInformation__Group__4 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2290:2: rule__StructuringInformation__Group__3__Impl rule__StructuringInformation__Group__4
            {
            pushFollow(FOLLOW_rule__StructuringInformation__Group__3__Impl_in_rule__StructuringInformation__Group__34831);
            rule__StructuringInformation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StructuringInformation__Group__4_in_rule__StructuringInformation__Group__34834);
            rule__StructuringInformation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuringInformation__Group__3"


    // $ANTLR start "rule__StructuringInformation__Group__3__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2297:1: rule__StructuringInformation__Group__3__Impl : ( ( rule__StructuringInformation__AbstractAssignment_3 )* ) ;
    public final void rule__StructuringInformation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2301:1: ( ( ( rule__StructuringInformation__AbstractAssignment_3 )* ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2302:1: ( ( rule__StructuringInformation__AbstractAssignment_3 )* )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2302:1: ( ( rule__StructuringInformation__AbstractAssignment_3 )* )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2303:1: ( rule__StructuringInformation__AbstractAssignment_3 )*
            {
             before(grammarAccess.getStructuringInformationAccess().getAbstractAssignment_3()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2304:1: ( rule__StructuringInformation__AbstractAssignment_3 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID) ) {
                    int LA31_1 = input.LA(2);

                    if ( ((LA31_1>=11 && LA31_1<=12)) ) {
                        alt31=1;
                    }


                }
                else if ( (LA31_0==RULE_STRING) ) {
                    int LA31_2 = input.LA(2);

                    if ( ((LA31_2>=11 && LA31_2<=12)) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2304:2: rule__StructuringInformation__AbstractAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__StructuringInformation__AbstractAssignment_3_in_rule__StructuringInformation__Group__3__Impl4861);
            	    rule__StructuringInformation__AbstractAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getStructuringInformationAccess().getAbstractAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuringInformation__Group__3__Impl"


    // $ANTLR start "rule__StructuringInformation__Group__4"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2314:1: rule__StructuringInformation__Group__4 : rule__StructuringInformation__Group__4__Impl ;
    public final void rule__StructuringInformation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2318:1: ( rule__StructuringInformation__Group__4__Impl )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2319:2: rule__StructuringInformation__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__StructuringInformation__Group__4__Impl_in_rule__StructuringInformation__Group__44892);
            rule__StructuringInformation__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuringInformation__Group__4"


    // $ANTLR start "rule__StructuringInformation__Group__4__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2325:1: rule__StructuringInformation__Group__4__Impl : ( ( rule__StructuringInformation__MpAssignment_4 )* ) ;
    public final void rule__StructuringInformation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2329:1: ( ( ( rule__StructuringInformation__MpAssignment_4 )* ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2330:1: ( ( rule__StructuringInformation__MpAssignment_4 )* )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2330:1: ( ( rule__StructuringInformation__MpAssignment_4 )* )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2331:1: ( rule__StructuringInformation__MpAssignment_4 )*
            {
             before(grammarAccess.getStructuringInformationAccess().getMpAssignment_4()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2332:1: ( rule__StructuringInformation__MpAssignment_4 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=RULE_STRING && LA32_0<=RULE_ID)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2332:2: rule__StructuringInformation__MpAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__StructuringInformation__MpAssignment_4_in_rule__StructuringInformation__Group__4__Impl4919);
            	    rule__StructuringInformation__MpAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getStructuringInformationAccess().getMpAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuringInformation__Group__4__Impl"


    // $ANTLR start "rule__ItemRelation__Group__0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2352:1: rule__ItemRelation__Group__0 : rule__ItemRelation__Group__0__Impl rule__ItemRelation__Group__1 ;
    public final void rule__ItemRelation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2356:1: ( rule__ItemRelation__Group__0__Impl rule__ItemRelation__Group__1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2357:2: rule__ItemRelation__Group__0__Impl rule__ItemRelation__Group__1
            {
            pushFollow(FOLLOW_rule__ItemRelation__Group__0__Impl_in_rule__ItemRelation__Group__04960);
            rule__ItemRelation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItemRelation__Group__1_in_rule__ItemRelation__Group__04963);
            rule__ItemRelation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemRelation__Group__0"


    // $ANTLR start "rule__ItemRelation__Group__0__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2364:1: rule__ItemRelation__Group__0__Impl : ( ( rule__ItemRelation__View1Assignment_0 ) ) ;
    public final void rule__ItemRelation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2368:1: ( ( ( rule__ItemRelation__View1Assignment_0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2369:1: ( ( rule__ItemRelation__View1Assignment_0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2369:1: ( ( rule__ItemRelation__View1Assignment_0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2370:1: ( rule__ItemRelation__View1Assignment_0 )
            {
             before(grammarAccess.getItemRelationAccess().getView1Assignment_0()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2371:1: ( rule__ItemRelation__View1Assignment_0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2371:2: rule__ItemRelation__View1Assignment_0
            {
            pushFollow(FOLLOW_rule__ItemRelation__View1Assignment_0_in_rule__ItemRelation__Group__0__Impl4990);
            rule__ItemRelation__View1Assignment_0();

            state._fsp--;


            }

             after(grammarAccess.getItemRelationAccess().getView1Assignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemRelation__Group__0__Impl"


    // $ANTLR start "rule__ItemRelation__Group__1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2381:1: rule__ItemRelation__Group__1 : rule__ItemRelation__Group__1__Impl rule__ItemRelation__Group__2 ;
    public final void rule__ItemRelation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2385:1: ( rule__ItemRelation__Group__1__Impl rule__ItemRelation__Group__2 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2386:2: rule__ItemRelation__Group__1__Impl rule__ItemRelation__Group__2
            {
            pushFollow(FOLLOW_rule__ItemRelation__Group__1__Impl_in_rule__ItemRelation__Group__15020);
            rule__ItemRelation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItemRelation__Group__2_in_rule__ItemRelation__Group__15023);
            rule__ItemRelation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemRelation__Group__1"


    // $ANTLR start "rule__ItemRelation__Group__1__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2393:1: rule__ItemRelation__Group__1__Impl : ( ( rule__ItemRelation__RelAssignment_1 ) ) ;
    public final void rule__ItemRelation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2397:1: ( ( ( rule__ItemRelation__RelAssignment_1 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2398:1: ( ( rule__ItemRelation__RelAssignment_1 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2398:1: ( ( rule__ItemRelation__RelAssignment_1 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2399:1: ( rule__ItemRelation__RelAssignment_1 )
            {
             before(grammarAccess.getItemRelationAccess().getRelAssignment_1()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2400:1: ( rule__ItemRelation__RelAssignment_1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2400:2: rule__ItemRelation__RelAssignment_1
            {
            pushFollow(FOLLOW_rule__ItemRelation__RelAssignment_1_in_rule__ItemRelation__Group__1__Impl5050);
            rule__ItemRelation__RelAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getItemRelationAccess().getRelAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemRelation__Group__1__Impl"


    // $ANTLR start "rule__ItemRelation__Group__2"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2410:1: rule__ItemRelation__Group__2 : rule__ItemRelation__Group__2__Impl ;
    public final void rule__ItemRelation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2414:1: ( rule__ItemRelation__Group__2__Impl )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2415:2: rule__ItemRelation__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ItemRelation__Group__2__Impl_in_rule__ItemRelation__Group__25080);
            rule__ItemRelation__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemRelation__Group__2"


    // $ANTLR start "rule__ItemRelation__Group__2__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2421:1: rule__ItemRelation__Group__2__Impl : ( ( rule__ItemRelation__View2Assignment_2 ) ) ;
    public final void rule__ItemRelation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2425:1: ( ( ( rule__ItemRelation__View2Assignment_2 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2426:1: ( ( rule__ItemRelation__View2Assignment_2 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2426:1: ( ( rule__ItemRelation__View2Assignment_2 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2427:1: ( rule__ItemRelation__View2Assignment_2 )
            {
             before(grammarAccess.getItemRelationAccess().getView2Assignment_2()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2428:1: ( rule__ItemRelation__View2Assignment_2 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2428:2: rule__ItemRelation__View2Assignment_2
            {
            pushFollow(FOLLOW_rule__ItemRelation__View2Assignment_2_in_rule__ItemRelation__Group__2__Impl5107);
            rule__ItemRelation__View2Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getItemRelationAccess().getView2Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemRelation__Group__2__Impl"


    // $ANTLR start "rule__ItemGeneralization__Group__0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2444:1: rule__ItemGeneralization__Group__0 : rule__ItemGeneralization__Group__0__Impl rule__ItemGeneralization__Group__1 ;
    public final void rule__ItemGeneralization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2448:1: ( rule__ItemGeneralization__Group__0__Impl rule__ItemGeneralization__Group__1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2449:2: rule__ItemGeneralization__Group__0__Impl rule__ItemGeneralization__Group__1
            {
            pushFollow(FOLLOW_rule__ItemGeneralization__Group__0__Impl_in_rule__ItemGeneralization__Group__05143);
            rule__ItemGeneralization__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItemGeneralization__Group__1_in_rule__ItemGeneralization__Group__05146);
            rule__ItemGeneralization__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGeneralization__Group__0"


    // $ANTLR start "rule__ItemGeneralization__Group__0__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2456:1: rule__ItemGeneralization__Group__0__Impl : ( ( rule__ItemGeneralization__GeneralizeAssignment_0 ) ) ;
    public final void rule__ItemGeneralization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2460:1: ( ( ( rule__ItemGeneralization__GeneralizeAssignment_0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2461:1: ( ( rule__ItemGeneralization__GeneralizeAssignment_0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2461:1: ( ( rule__ItemGeneralization__GeneralizeAssignment_0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2462:1: ( rule__ItemGeneralization__GeneralizeAssignment_0 )
            {
             before(grammarAccess.getItemGeneralizationAccess().getGeneralizeAssignment_0()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2463:1: ( rule__ItemGeneralization__GeneralizeAssignment_0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2463:2: rule__ItemGeneralization__GeneralizeAssignment_0
            {
            pushFollow(FOLLOW_rule__ItemGeneralization__GeneralizeAssignment_0_in_rule__ItemGeneralization__Group__0__Impl5173);
            rule__ItemGeneralization__GeneralizeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getItemGeneralizationAccess().getGeneralizeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGeneralization__Group__0__Impl"


    // $ANTLR start "rule__ItemGeneralization__Group__1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2473:1: rule__ItemGeneralization__Group__1 : rule__ItemGeneralization__Group__1__Impl rule__ItemGeneralization__Group__2 ;
    public final void rule__ItemGeneralization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2477:1: ( rule__ItemGeneralization__Group__1__Impl rule__ItemGeneralization__Group__2 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2478:2: rule__ItemGeneralization__Group__1__Impl rule__ItemGeneralization__Group__2
            {
            pushFollow(FOLLOW_rule__ItemGeneralization__Group__1__Impl_in_rule__ItemGeneralization__Group__15203);
            rule__ItemGeneralization__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItemGeneralization__Group__2_in_rule__ItemGeneralization__Group__15206);
            rule__ItemGeneralization__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGeneralization__Group__1"


    // $ANTLR start "rule__ItemGeneralization__Group__1__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2485:1: rule__ItemGeneralization__Group__1__Impl : ( ( rule__ItemGeneralization__Alternatives_1 ) ) ;
    public final void rule__ItemGeneralization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2489:1: ( ( ( rule__ItemGeneralization__Alternatives_1 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2490:1: ( ( rule__ItemGeneralization__Alternatives_1 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2490:1: ( ( rule__ItemGeneralization__Alternatives_1 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2491:1: ( rule__ItemGeneralization__Alternatives_1 )
            {
             before(grammarAccess.getItemGeneralizationAccess().getAlternatives_1()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2492:1: ( rule__ItemGeneralization__Alternatives_1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2492:2: rule__ItemGeneralization__Alternatives_1
            {
            pushFollow(FOLLOW_rule__ItemGeneralization__Alternatives_1_in_rule__ItemGeneralization__Group__1__Impl5233);
            rule__ItemGeneralization__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getItemGeneralizationAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGeneralization__Group__1__Impl"


    // $ANTLR start "rule__ItemGeneralization__Group__2"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2502:1: rule__ItemGeneralization__Group__2 : rule__ItemGeneralization__Group__2__Impl ;
    public final void rule__ItemGeneralization__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2506:1: ( rule__ItemGeneralization__Group__2__Impl )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2507:2: rule__ItemGeneralization__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ItemGeneralization__Group__2__Impl_in_rule__ItemGeneralization__Group__25263);
            rule__ItemGeneralization__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGeneralization__Group__2"


    // $ANTLR start "rule__ItemGeneralization__Group__2__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2513:1: rule__ItemGeneralization__Group__2__Impl : ( ( ( rule__ItemGeneralization__ViewsAssignment_2 ) ) ( ( rule__ItemGeneralization__ViewsAssignment_2 )* ) ) ;
    public final void rule__ItemGeneralization__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2517:1: ( ( ( ( rule__ItemGeneralization__ViewsAssignment_2 ) ) ( ( rule__ItemGeneralization__ViewsAssignment_2 )* ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2518:1: ( ( ( rule__ItemGeneralization__ViewsAssignment_2 ) ) ( ( rule__ItemGeneralization__ViewsAssignment_2 )* ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2518:1: ( ( ( rule__ItemGeneralization__ViewsAssignment_2 ) ) ( ( rule__ItemGeneralization__ViewsAssignment_2 )* ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2519:1: ( ( rule__ItemGeneralization__ViewsAssignment_2 ) ) ( ( rule__ItemGeneralization__ViewsAssignment_2 )* )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2519:1: ( ( rule__ItemGeneralization__ViewsAssignment_2 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2520:1: ( rule__ItemGeneralization__ViewsAssignment_2 )
            {
             before(grammarAccess.getItemGeneralizationAccess().getViewsAssignment_2()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2521:1: ( rule__ItemGeneralization__ViewsAssignment_2 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2521:2: rule__ItemGeneralization__ViewsAssignment_2
            {
            pushFollow(FOLLOW_rule__ItemGeneralization__ViewsAssignment_2_in_rule__ItemGeneralization__Group__2__Impl5292);
            rule__ItemGeneralization__ViewsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getItemGeneralizationAccess().getViewsAssignment_2()); 

            }

            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2524:1: ( ( rule__ItemGeneralization__ViewsAssignment_2 )* )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2525:1: ( rule__ItemGeneralization__ViewsAssignment_2 )*
            {
             before(grammarAccess.getItemGeneralizationAccess().getViewsAssignment_2()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2526:1: ( rule__ItemGeneralization__ViewsAssignment_2 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID) ) {
                    int LA33_2 = input.LA(2);

                    if ( (LA33_2==EOF||(LA33_2>=RULE_STRING && LA33_2<=RULE_ID)||(LA33_2>=15 && LA33_2<=19)||LA33_2==41||LA33_2==51||(LA33_2>=53 && LA33_2<=56)||LA33_2==58) ) {
                        alt33=1;
                    }


                }
                else if ( (LA33_0==RULE_STRING) ) {
                    int LA33_3 = input.LA(2);

                    if ( (LA33_3==EOF||(LA33_3>=RULE_STRING && LA33_3<=RULE_ID)||(LA33_3>=15 && LA33_3<=19)||LA33_3==41||LA33_3==51||(LA33_3>=53 && LA33_3<=56)||LA33_3==58) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2526:2: rule__ItemGeneralization__ViewsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__ItemGeneralization__ViewsAssignment_2_in_rule__ItemGeneralization__Group__2__Impl5304);
            	    rule__ItemGeneralization__ViewsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getItemGeneralizationAccess().getViewsAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGeneralization__Group__2__Impl"


    // $ANTLR start "rule__ItemMapping__Group__0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2543:1: rule__ItemMapping__Group__0 : rule__ItemMapping__Group__0__Impl rule__ItemMapping__Group__1 ;
    public final void rule__ItemMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2547:1: ( rule__ItemMapping__Group__0__Impl rule__ItemMapping__Group__1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2548:2: rule__ItemMapping__Group__0__Impl rule__ItemMapping__Group__1
            {
            pushFollow(FOLLOW_rule__ItemMapping__Group__0__Impl_in_rule__ItemMapping__Group__05343);
            rule__ItemMapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItemMapping__Group__1_in_rule__ItemMapping__Group__05346);
            rule__ItemMapping__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemMapping__Group__0"


    // $ANTLR start "rule__ItemMapping__Group__0__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2555:1: rule__ItemMapping__Group__0__Impl : ( ( rule__ItemMapping__ItemAssignment_0 ) ) ;
    public final void rule__ItemMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2559:1: ( ( ( rule__ItemMapping__ItemAssignment_0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2560:1: ( ( rule__ItemMapping__ItemAssignment_0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2560:1: ( ( rule__ItemMapping__ItemAssignment_0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2561:1: ( rule__ItemMapping__ItemAssignment_0 )
            {
             before(grammarAccess.getItemMappingAccess().getItemAssignment_0()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2562:1: ( rule__ItemMapping__ItemAssignment_0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2562:2: rule__ItemMapping__ItemAssignment_0
            {
            pushFollow(FOLLOW_rule__ItemMapping__ItemAssignment_0_in_rule__ItemMapping__Group__0__Impl5373);
            rule__ItemMapping__ItemAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getItemMappingAccess().getItemAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemMapping__Group__0__Impl"


    // $ANTLR start "rule__ItemMapping__Group__1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2572:1: rule__ItemMapping__Group__1 : rule__ItemMapping__Group__1__Impl rule__ItemMapping__Group__2 ;
    public final void rule__ItemMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2576:1: ( rule__ItemMapping__Group__1__Impl rule__ItemMapping__Group__2 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2577:2: rule__ItemMapping__Group__1__Impl rule__ItemMapping__Group__2
            {
            pushFollow(FOLLOW_rule__ItemMapping__Group__1__Impl_in_rule__ItemMapping__Group__15403);
            rule__ItemMapping__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ItemMapping__Group__2_in_rule__ItemMapping__Group__15406);
            rule__ItemMapping__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemMapping__Group__1"


    // $ANTLR start "rule__ItemMapping__Group__1__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2584:1: rule__ItemMapping__Group__1__Impl : ( ( rule__ItemMapping__ActAssignment_1 ) ) ;
    public final void rule__ItemMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2588:1: ( ( ( rule__ItemMapping__ActAssignment_1 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2589:1: ( ( rule__ItemMapping__ActAssignment_1 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2589:1: ( ( rule__ItemMapping__ActAssignment_1 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2590:1: ( rule__ItemMapping__ActAssignment_1 )
            {
             before(grammarAccess.getItemMappingAccess().getActAssignment_1()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2591:1: ( rule__ItemMapping__ActAssignment_1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2591:2: rule__ItemMapping__ActAssignment_1
            {
            pushFollow(FOLLOW_rule__ItemMapping__ActAssignment_1_in_rule__ItemMapping__Group__1__Impl5433);
            rule__ItemMapping__ActAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getItemMappingAccess().getActAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemMapping__Group__1__Impl"


    // $ANTLR start "rule__ItemMapping__Group__2"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2601:1: rule__ItemMapping__Group__2 : rule__ItemMapping__Group__2__Impl ;
    public final void rule__ItemMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2605:1: ( rule__ItemMapping__Group__2__Impl )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2606:2: rule__ItemMapping__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ItemMapping__Group__2__Impl_in_rule__ItemMapping__Group__25463);
            rule__ItemMapping__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemMapping__Group__2"


    // $ANTLR start "rule__ItemMapping__Group__2__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2612:1: rule__ItemMapping__Group__2__Impl : ( ( rule__ItemMapping__PftsAssignment_2 ) ) ;
    public final void rule__ItemMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2616:1: ( ( ( rule__ItemMapping__PftsAssignment_2 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2617:1: ( ( rule__ItemMapping__PftsAssignment_2 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2617:1: ( ( rule__ItemMapping__PftsAssignment_2 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2618:1: ( rule__ItemMapping__PftsAssignment_2 )
            {
             before(grammarAccess.getItemMappingAccess().getPftsAssignment_2()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2619:1: ( rule__ItemMapping__PftsAssignment_2 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2619:2: rule__ItemMapping__PftsAssignment_2
            {
            pushFollow(FOLLOW_rule__ItemMapping__PftsAssignment_2_in_rule__ItemMapping__Group__2__Impl5490);
            rule__ItemMapping__PftsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getItemMappingAccess().getPftsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemMapping__Group__2__Impl"


    // $ANTLR start "rule__Or_expr__Group__0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2635:1: rule__Or_expr__Group__0 : rule__Or_expr__Group__0__Impl rule__Or_expr__Group__1 ;
    public final void rule__Or_expr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2639:1: ( rule__Or_expr__Group__0__Impl rule__Or_expr__Group__1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2640:2: rule__Or_expr__Group__0__Impl rule__Or_expr__Group__1
            {
            pushFollow(FOLLOW_rule__Or_expr__Group__0__Impl_in_rule__Or_expr__Group__05526);
            rule__Or_expr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or_expr__Group__1_in_rule__Or_expr__Group__05529);
            rule__Or_expr__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or_expr__Group__0"


    // $ANTLR start "rule__Or_expr__Group__0__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2647:1: rule__Or_expr__Group__0__Impl : ( ruleAnd_expr ) ;
    public final void rule__Or_expr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2651:1: ( ( ruleAnd_expr ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2652:1: ( ruleAnd_expr )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2652:1: ( ruleAnd_expr )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2653:1: ruleAnd_expr
            {
             before(grammarAccess.getOr_exprAccess().getAnd_exprParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAnd_expr_in_rule__Or_expr__Group__0__Impl5556);
            ruleAnd_expr();

            state._fsp--;

             after(grammarAccess.getOr_exprAccess().getAnd_exprParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or_expr__Group__0__Impl"


    // $ANTLR start "rule__Or_expr__Group__1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2664:1: rule__Or_expr__Group__1 : rule__Or_expr__Group__1__Impl ;
    public final void rule__Or_expr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2668:1: ( rule__Or_expr__Group__1__Impl )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2669:2: rule__Or_expr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Or_expr__Group__1__Impl_in_rule__Or_expr__Group__15585);
            rule__Or_expr__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or_expr__Group__1"


    // $ANTLR start "rule__Or_expr__Group__1__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2675:1: rule__Or_expr__Group__1__Impl : ( ( rule__Or_expr__Group_1__0 )* ) ;
    public final void rule__Or_expr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2679:1: ( ( ( rule__Or_expr__Group_1__0 )* ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2680:1: ( ( rule__Or_expr__Group_1__0 )* )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2680:1: ( ( rule__Or_expr__Group_1__0 )* )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2681:1: ( rule__Or_expr__Group_1__0 )*
            {
             before(grammarAccess.getOr_exprAccess().getGroup_1()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2682:1: ( rule__Or_expr__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==36) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2682:2: rule__Or_expr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Or_expr__Group_1__0_in_rule__Or_expr__Group__1__Impl5612);
            	    rule__Or_expr__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getOr_exprAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or_expr__Group__1__Impl"


    // $ANTLR start "rule__Or_expr__Group_1__0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2696:1: rule__Or_expr__Group_1__0 : rule__Or_expr__Group_1__0__Impl rule__Or_expr__Group_1__1 ;
    public final void rule__Or_expr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2700:1: ( rule__Or_expr__Group_1__0__Impl rule__Or_expr__Group_1__1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2701:2: rule__Or_expr__Group_1__0__Impl rule__Or_expr__Group_1__1
            {
            pushFollow(FOLLOW_rule__Or_expr__Group_1__0__Impl_in_rule__Or_expr__Group_1__05647);
            rule__Or_expr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or_expr__Group_1__1_in_rule__Or_expr__Group_1__05650);
            rule__Or_expr__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or_expr__Group_1__0"


    // $ANTLR start "rule__Or_expr__Group_1__0__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2708:1: rule__Or_expr__Group_1__0__Impl : ( () ) ;
    public final void rule__Or_expr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2712:1: ( ( () ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2713:1: ( () )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2713:1: ( () )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2714:1: ()
            {
             before(grammarAccess.getOr_exprAccess().getOr_exprLeftAction_1_0()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2715:1: ()
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2717:1: 
            {
            }

             after(grammarAccess.getOr_exprAccess().getOr_exprLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or_expr__Group_1__0__Impl"


    // $ANTLR start "rule__Or_expr__Group_1__1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2727:1: rule__Or_expr__Group_1__1 : rule__Or_expr__Group_1__1__Impl rule__Or_expr__Group_1__2 ;
    public final void rule__Or_expr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2731:1: ( rule__Or_expr__Group_1__1__Impl rule__Or_expr__Group_1__2 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2732:2: rule__Or_expr__Group_1__1__Impl rule__Or_expr__Group_1__2
            {
            pushFollow(FOLLOW_rule__Or_expr__Group_1__1__Impl_in_rule__Or_expr__Group_1__15708);
            rule__Or_expr__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Or_expr__Group_1__2_in_rule__Or_expr__Group_1__15711);
            rule__Or_expr__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or_expr__Group_1__1"


    // $ANTLR start "rule__Or_expr__Group_1__1__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2739:1: rule__Or_expr__Group_1__1__Impl : ( 'or' ) ;
    public final void rule__Or_expr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2743:1: ( ( 'or' ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2744:1: ( 'or' )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2744:1: ( 'or' )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2745:1: 'or'
            {
             before(grammarAccess.getOr_exprAccess().getOrKeyword_1_1()); 
            match(input,36,FOLLOW_36_in_rule__Or_expr__Group_1__1__Impl5739); 
             after(grammarAccess.getOr_exprAccess().getOrKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or_expr__Group_1__1__Impl"


    // $ANTLR start "rule__Or_expr__Group_1__2"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2758:1: rule__Or_expr__Group_1__2 : rule__Or_expr__Group_1__2__Impl ;
    public final void rule__Or_expr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2762:1: ( rule__Or_expr__Group_1__2__Impl )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2763:2: rule__Or_expr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Or_expr__Group_1__2__Impl_in_rule__Or_expr__Group_1__25770);
            rule__Or_expr__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or_expr__Group_1__2"


    // $ANTLR start "rule__Or_expr__Group_1__2__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2769:1: rule__Or_expr__Group_1__2__Impl : ( ( rule__Or_expr__RightAssignment_1_2 ) ) ;
    public final void rule__Or_expr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2773:1: ( ( ( rule__Or_expr__RightAssignment_1_2 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2774:1: ( ( rule__Or_expr__RightAssignment_1_2 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2774:1: ( ( rule__Or_expr__RightAssignment_1_2 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2775:1: ( rule__Or_expr__RightAssignment_1_2 )
            {
             before(grammarAccess.getOr_exprAccess().getRightAssignment_1_2()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2776:1: ( rule__Or_expr__RightAssignment_1_2 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2776:2: rule__Or_expr__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Or_expr__RightAssignment_1_2_in_rule__Or_expr__Group_1__2__Impl5797);
            rule__Or_expr__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getOr_exprAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or_expr__Group_1__2__Impl"


    // $ANTLR start "rule__And_expr__Group__0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2792:1: rule__And_expr__Group__0 : rule__And_expr__Group__0__Impl rule__And_expr__Group__1 ;
    public final void rule__And_expr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2796:1: ( rule__And_expr__Group__0__Impl rule__And_expr__Group__1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2797:2: rule__And_expr__Group__0__Impl rule__And_expr__Group__1
            {
            pushFollow(FOLLOW_rule__And_expr__Group__0__Impl_in_rule__And_expr__Group__05833);
            rule__And_expr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__And_expr__Group__1_in_rule__And_expr__Group__05836);
            rule__And_expr__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And_expr__Group__0"


    // $ANTLR start "rule__And_expr__Group__0__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2804:1: rule__And_expr__Group__0__Impl : ( ruleUnary_expr ) ;
    public final void rule__And_expr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2808:1: ( ( ruleUnary_expr ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2809:1: ( ruleUnary_expr )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2809:1: ( ruleUnary_expr )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2810:1: ruleUnary_expr
            {
             before(grammarAccess.getAnd_exprAccess().getUnary_exprParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleUnary_expr_in_rule__And_expr__Group__0__Impl5863);
            ruleUnary_expr();

            state._fsp--;

             after(grammarAccess.getAnd_exprAccess().getUnary_exprParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And_expr__Group__0__Impl"


    // $ANTLR start "rule__And_expr__Group__1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2821:1: rule__And_expr__Group__1 : rule__And_expr__Group__1__Impl ;
    public final void rule__And_expr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2825:1: ( rule__And_expr__Group__1__Impl )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2826:2: rule__And_expr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__And_expr__Group__1__Impl_in_rule__And_expr__Group__15892);
            rule__And_expr__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And_expr__Group__1"


    // $ANTLR start "rule__And_expr__Group__1__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2832:1: rule__And_expr__Group__1__Impl : ( ( rule__And_expr__Group_1__0 )* ) ;
    public final void rule__And_expr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2836:1: ( ( ( rule__And_expr__Group_1__0 )* ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2837:1: ( ( rule__And_expr__Group_1__0 )* )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2837:1: ( ( rule__And_expr__Group_1__0 )* )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2838:1: ( rule__And_expr__Group_1__0 )*
            {
             before(grammarAccess.getAnd_exprAccess().getGroup_1()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2839:1: ( rule__And_expr__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==37) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2839:2: rule__And_expr__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__And_expr__Group_1__0_in_rule__And_expr__Group__1__Impl5919);
            	    rule__And_expr__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getAnd_exprAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And_expr__Group__1__Impl"


    // $ANTLR start "rule__And_expr__Group_1__0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2853:1: rule__And_expr__Group_1__0 : rule__And_expr__Group_1__0__Impl rule__And_expr__Group_1__1 ;
    public final void rule__And_expr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2857:1: ( rule__And_expr__Group_1__0__Impl rule__And_expr__Group_1__1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2858:2: rule__And_expr__Group_1__0__Impl rule__And_expr__Group_1__1
            {
            pushFollow(FOLLOW_rule__And_expr__Group_1__0__Impl_in_rule__And_expr__Group_1__05954);
            rule__And_expr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__And_expr__Group_1__1_in_rule__And_expr__Group_1__05957);
            rule__And_expr__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And_expr__Group_1__0"


    // $ANTLR start "rule__And_expr__Group_1__0__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2865:1: rule__And_expr__Group_1__0__Impl : ( () ) ;
    public final void rule__And_expr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2869:1: ( ( () ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2870:1: ( () )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2870:1: ( () )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2871:1: ()
            {
             before(grammarAccess.getAnd_exprAccess().getAnd_exprLeftAction_1_0()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2872:1: ()
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2874:1: 
            {
            }

             after(grammarAccess.getAnd_exprAccess().getAnd_exprLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And_expr__Group_1__0__Impl"


    // $ANTLR start "rule__And_expr__Group_1__1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2884:1: rule__And_expr__Group_1__1 : rule__And_expr__Group_1__1__Impl rule__And_expr__Group_1__2 ;
    public final void rule__And_expr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2888:1: ( rule__And_expr__Group_1__1__Impl rule__And_expr__Group_1__2 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2889:2: rule__And_expr__Group_1__1__Impl rule__And_expr__Group_1__2
            {
            pushFollow(FOLLOW_rule__And_expr__Group_1__1__Impl_in_rule__And_expr__Group_1__16015);
            rule__And_expr__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__And_expr__Group_1__2_in_rule__And_expr__Group_1__16018);
            rule__And_expr__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And_expr__Group_1__1"


    // $ANTLR start "rule__And_expr__Group_1__1__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2896:1: rule__And_expr__Group_1__1__Impl : ( 'and' ) ;
    public final void rule__And_expr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2900:1: ( ( 'and' ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2901:1: ( 'and' )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2901:1: ( 'and' )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2902:1: 'and'
            {
             before(grammarAccess.getAnd_exprAccess().getAndKeyword_1_1()); 
            match(input,37,FOLLOW_37_in_rule__And_expr__Group_1__1__Impl6046); 
             after(grammarAccess.getAnd_exprAccess().getAndKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And_expr__Group_1__1__Impl"


    // $ANTLR start "rule__And_expr__Group_1__2"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2915:1: rule__And_expr__Group_1__2 : rule__And_expr__Group_1__2__Impl ;
    public final void rule__And_expr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2919:1: ( rule__And_expr__Group_1__2__Impl )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2920:2: rule__And_expr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__And_expr__Group_1__2__Impl_in_rule__And_expr__Group_1__26077);
            rule__And_expr__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And_expr__Group_1__2"


    // $ANTLR start "rule__And_expr__Group_1__2__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2926:1: rule__And_expr__Group_1__2__Impl : ( ( rule__And_expr__RightAssignment_1_2 ) ) ;
    public final void rule__And_expr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2930:1: ( ( ( rule__And_expr__RightAssignment_1_2 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2931:1: ( ( rule__And_expr__RightAssignment_1_2 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2931:1: ( ( rule__And_expr__RightAssignment_1_2 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2932:1: ( rule__And_expr__RightAssignment_1_2 )
            {
             before(grammarAccess.getAnd_exprAccess().getRightAssignment_1_2()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2933:1: ( rule__And_expr__RightAssignment_1_2 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2933:2: rule__And_expr__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__And_expr__RightAssignment_1_2_in_rule__And_expr__Group_1__2__Impl6104);
            rule__And_expr__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAnd_exprAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And_expr__Group_1__2__Impl"


    // $ANTLR start "rule__Neg_expr__Group__0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2949:1: rule__Neg_expr__Group__0 : rule__Neg_expr__Group__0__Impl rule__Neg_expr__Group__1 ;
    public final void rule__Neg_expr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2953:1: ( rule__Neg_expr__Group__0__Impl rule__Neg_expr__Group__1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2954:2: rule__Neg_expr__Group__0__Impl rule__Neg_expr__Group__1
            {
            pushFollow(FOLLOW_rule__Neg_expr__Group__0__Impl_in_rule__Neg_expr__Group__06140);
            rule__Neg_expr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Neg_expr__Group__1_in_rule__Neg_expr__Group__06143);
            rule__Neg_expr__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Neg_expr__Group__0"


    // $ANTLR start "rule__Neg_expr__Group__0__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2961:1: rule__Neg_expr__Group__0__Impl : ( 'not' ) ;
    public final void rule__Neg_expr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2965:1: ( ( 'not' ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2966:1: ( 'not' )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2966:1: ( 'not' )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2967:1: 'not'
            {
             before(grammarAccess.getNeg_exprAccess().getNotKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__Neg_expr__Group__0__Impl6171); 
             after(grammarAccess.getNeg_exprAccess().getNotKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Neg_expr__Group__0__Impl"


    // $ANTLR start "rule__Neg_expr__Group__1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2980:1: rule__Neg_expr__Group__1 : rule__Neg_expr__Group__1__Impl ;
    public final void rule__Neg_expr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2984:1: ( rule__Neg_expr__Group__1__Impl )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2985:2: rule__Neg_expr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Neg_expr__Group__1__Impl_in_rule__Neg_expr__Group__16202);
            rule__Neg_expr__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Neg_expr__Group__1"


    // $ANTLR start "rule__Neg_expr__Group__1__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2991:1: rule__Neg_expr__Group__1__Impl : ( ( rule__Neg_expr__ExprAssignment_1 ) ) ;
    public final void rule__Neg_expr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2995:1: ( ( ( rule__Neg_expr__ExprAssignment_1 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2996:1: ( ( rule__Neg_expr__ExprAssignment_1 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2996:1: ( ( rule__Neg_expr__ExprAssignment_1 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2997:1: ( rule__Neg_expr__ExprAssignment_1 )
            {
             before(grammarAccess.getNeg_exprAccess().getExprAssignment_1()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2998:1: ( rule__Neg_expr__ExprAssignment_1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:2998:2: rule__Neg_expr__ExprAssignment_1
            {
            pushFollow(FOLLOW_rule__Neg_expr__ExprAssignment_1_in_rule__Neg_expr__Group__1__Impl6229);
            rule__Neg_expr__ExprAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNeg_exprAccess().getExprAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Neg_expr__Group__1__Impl"


    // $ANTLR start "rule__Primary_expr__Group_1__0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3012:1: rule__Primary_expr__Group_1__0 : rule__Primary_expr__Group_1__0__Impl rule__Primary_expr__Group_1__1 ;
    public final void rule__Primary_expr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3016:1: ( rule__Primary_expr__Group_1__0__Impl rule__Primary_expr__Group_1__1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3017:2: rule__Primary_expr__Group_1__0__Impl rule__Primary_expr__Group_1__1
            {
            pushFollow(FOLLOW_rule__Primary_expr__Group_1__0__Impl_in_rule__Primary_expr__Group_1__06263);
            rule__Primary_expr__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary_expr__Group_1__1_in_rule__Primary_expr__Group_1__06266);
            rule__Primary_expr__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary_expr__Group_1__0"


    // $ANTLR start "rule__Primary_expr__Group_1__0__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3024:1: rule__Primary_expr__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Primary_expr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3028:1: ( ( '(' ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3029:1: ( '(' )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3029:1: ( '(' )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3030:1: '('
            {
             before(grammarAccess.getPrimary_exprAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,39,FOLLOW_39_in_rule__Primary_expr__Group_1__0__Impl6294); 
             after(grammarAccess.getPrimary_exprAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary_expr__Group_1__0__Impl"


    // $ANTLR start "rule__Primary_expr__Group_1__1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3043:1: rule__Primary_expr__Group_1__1 : rule__Primary_expr__Group_1__1__Impl rule__Primary_expr__Group_1__2 ;
    public final void rule__Primary_expr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3047:1: ( rule__Primary_expr__Group_1__1__Impl rule__Primary_expr__Group_1__2 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3048:2: rule__Primary_expr__Group_1__1__Impl rule__Primary_expr__Group_1__2
            {
            pushFollow(FOLLOW_rule__Primary_expr__Group_1__1__Impl_in_rule__Primary_expr__Group_1__16325);
            rule__Primary_expr__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Primary_expr__Group_1__2_in_rule__Primary_expr__Group_1__16328);
            rule__Primary_expr__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary_expr__Group_1__1"


    // $ANTLR start "rule__Primary_expr__Group_1__1__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3055:1: rule__Primary_expr__Group_1__1__Impl : ( ruleOr_expr ) ;
    public final void rule__Primary_expr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3059:1: ( ( ruleOr_expr ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3060:1: ( ruleOr_expr )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3060:1: ( ruleOr_expr )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3061:1: ruleOr_expr
            {
             before(grammarAccess.getPrimary_exprAccess().getOr_exprParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleOr_expr_in_rule__Primary_expr__Group_1__1__Impl6355);
            ruleOr_expr();

            state._fsp--;

             after(grammarAccess.getPrimary_exprAccess().getOr_exprParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary_expr__Group_1__1__Impl"


    // $ANTLR start "rule__Primary_expr__Group_1__2"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3072:1: rule__Primary_expr__Group_1__2 : rule__Primary_expr__Group_1__2__Impl ;
    public final void rule__Primary_expr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3076:1: ( rule__Primary_expr__Group_1__2__Impl )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3077:2: rule__Primary_expr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Primary_expr__Group_1__2__Impl_in_rule__Primary_expr__Group_1__26384);
            rule__Primary_expr__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary_expr__Group_1__2"


    // $ANTLR start "rule__Primary_expr__Group_1__2__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3083:1: rule__Primary_expr__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Primary_expr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3087:1: ( ( ')' ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3088:1: ( ')' )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3088:1: ( ')' )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3089:1: ')'
            {
             before(grammarAccess.getPrimary_exprAccess().getRightParenthesisKeyword_1_2()); 
            match(input,40,FOLLOW_40_in_rule__Primary_expr__Group_1__2__Impl6412); 
             after(grammarAccess.getPrimary_exprAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary_expr__Group_1__2__Impl"


    // $ANTLR start "rule__Default__Group__0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3108:1: rule__Default__Group__0 : rule__Default__Group__0__Impl rule__Default__Group__1 ;
    public final void rule__Default__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3112:1: ( rule__Default__Group__0__Impl rule__Default__Group__1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3113:2: rule__Default__Group__0__Impl rule__Default__Group__1
            {
            pushFollow(FOLLOW_rule__Default__Group__0__Impl_in_rule__Default__Group__06449);
            rule__Default__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Default__Group__1_in_rule__Default__Group__06452);
            rule__Default__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__0"


    // $ANTLR start "rule__Default__Group__0__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3120:1: rule__Default__Group__0__Impl : ( () ) ;
    public final void rule__Default__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3124:1: ( ( () ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3125:1: ( () )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3125:1: ( () )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3126:1: ()
            {
             before(grammarAccess.getDefaultAccess().getDefaultAction_0()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3127:1: ()
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3129:1: 
            {
            }

             after(grammarAccess.getDefaultAccess().getDefaultAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__0__Impl"


    // $ANTLR start "rule__Default__Group__1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3139:1: rule__Default__Group__1 : rule__Default__Group__1__Impl rule__Default__Group__2 ;
    public final void rule__Default__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3143:1: ( rule__Default__Group__1__Impl rule__Default__Group__2 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3144:2: rule__Default__Group__1__Impl rule__Default__Group__2
            {
            pushFollow(FOLLOW_rule__Default__Group__1__Impl_in_rule__Default__Group__16510);
            rule__Default__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Default__Group__2_in_rule__Default__Group__16513);
            rule__Default__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__1"


    // $ANTLR start "rule__Default__Group__1__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3151:1: rule__Default__Group__1__Impl : ( ( rule__Default__Alternatives_1 ) ) ;
    public final void rule__Default__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3155:1: ( ( ( rule__Default__Alternatives_1 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3156:1: ( ( rule__Default__Alternatives_1 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3156:1: ( ( rule__Default__Alternatives_1 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3157:1: ( rule__Default__Alternatives_1 )
            {
             before(grammarAccess.getDefaultAccess().getAlternatives_1()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3158:1: ( rule__Default__Alternatives_1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3158:2: rule__Default__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Default__Alternatives_1_in_rule__Default__Group__1__Impl6540);
            rule__Default__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getDefaultAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__1__Impl"


    // $ANTLR start "rule__Default__Group__2"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3168:1: rule__Default__Group__2 : rule__Default__Group__2__Impl rule__Default__Group__3 ;
    public final void rule__Default__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3172:1: ( rule__Default__Group__2__Impl rule__Default__Group__3 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3173:2: rule__Default__Group__2__Impl rule__Default__Group__3
            {
            pushFollow(FOLLOW_rule__Default__Group__2__Impl_in_rule__Default__Group__26570);
            rule__Default__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Default__Group__3_in_rule__Default__Group__26573);
            rule__Default__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__2"


    // $ANTLR start "rule__Default__Group__2__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3180:1: rule__Default__Group__2__Impl : ( ( rule__Default__ConfigsAssignment_2 )? ) ;
    public final void rule__Default__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3184:1: ( ( ( rule__Default__ConfigsAssignment_2 )? ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3185:1: ( ( rule__Default__ConfigsAssignment_2 )? )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3185:1: ( ( rule__Default__ConfigsAssignment_2 )? )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3186:1: ( rule__Default__ConfigsAssignment_2 )?
            {
             before(grammarAccess.getDefaultAccess().getConfigsAssignment_2()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3187:1: ( rule__Default__ConfigsAssignment_2 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==41) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3187:2: rule__Default__ConfigsAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Default__ConfigsAssignment_2_in_rule__Default__Group__2__Impl6600);
                    rule__Default__ConfigsAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDefaultAccess().getConfigsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__2__Impl"


    // $ANTLR start "rule__Default__Group__3"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3197:1: rule__Default__Group__3 : rule__Default__Group__3__Impl ;
    public final void rule__Default__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3201:1: ( rule__Default__Group__3__Impl )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3202:2: rule__Default__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Default__Group__3__Impl_in_rule__Default__Group__36631);
            rule__Default__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__3"


    // $ANTLR start "rule__Default__Group__3__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3208:1: rule__Default__Group__3__Impl : ( ( rule__Default__ProductsAssignment_3 )? ) ;
    public final void rule__Default__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3212:1: ( ( ( rule__Default__ProductsAssignment_3 )? ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3213:1: ( ( rule__Default__ProductsAssignment_3 )? )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3213:1: ( ( rule__Default__ProductsAssignment_3 )? )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3214:1: ( rule__Default__ProductsAssignment_3 )?
            {
             before(grammarAccess.getDefaultAccess().getProductsAssignment_3()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3215:1: ( rule__Default__ProductsAssignment_3 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=55 && LA37_0<=56)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3215:2: rule__Default__ProductsAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Default__ProductsAssignment_3_in_rule__Default__Group__3__Impl6658);
                    rule__Default__ProductsAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDefaultAccess().getProductsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__Group__3__Impl"


    // $ANTLR start "rule__ParsingConfiguration__Group__0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3233:1: rule__ParsingConfiguration__Group__0 : rule__ParsingConfiguration__Group__0__Impl rule__ParsingConfiguration__Group__1 ;
    public final void rule__ParsingConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3237:1: ( rule__ParsingConfiguration__Group__0__Impl rule__ParsingConfiguration__Group__1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3238:2: rule__ParsingConfiguration__Group__0__Impl rule__ParsingConfiguration__Group__1
            {
            pushFollow(FOLLOW_rule__ParsingConfiguration__Group__0__Impl_in_rule__ParsingConfiguration__Group__06697);
            rule__ParsingConfiguration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParsingConfiguration__Group__1_in_rule__ParsingConfiguration__Group__06700);
            rule__ParsingConfiguration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParsingConfiguration__Group__0"


    // $ANTLR start "rule__ParsingConfiguration__Group__0__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3245:1: rule__ParsingConfiguration__Group__0__Impl : ( () ) ;
    public final void rule__ParsingConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3249:1: ( ( () ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3250:1: ( () )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3250:1: ( () )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3251:1: ()
            {
             before(grammarAccess.getParsingConfigurationAccess().getParsingConfigurationAction_0()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3252:1: ()
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3254:1: 
            {
            }

             after(grammarAccess.getParsingConfigurationAccess().getParsingConfigurationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParsingConfiguration__Group__0__Impl"


    // $ANTLR start "rule__ParsingConfiguration__Group__1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3264:1: rule__ParsingConfiguration__Group__1 : rule__ParsingConfiguration__Group__1__Impl rule__ParsingConfiguration__Group__2 ;
    public final void rule__ParsingConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3268:1: ( rule__ParsingConfiguration__Group__1__Impl rule__ParsingConfiguration__Group__2 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3269:2: rule__ParsingConfiguration__Group__1__Impl rule__ParsingConfiguration__Group__2
            {
            pushFollow(FOLLOW_rule__ParsingConfiguration__Group__1__Impl_in_rule__ParsingConfiguration__Group__16758);
            rule__ParsingConfiguration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParsingConfiguration__Group__2_in_rule__ParsingConfiguration__Group__16761);
            rule__ParsingConfiguration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParsingConfiguration__Group__1"


    // $ANTLR start "rule__ParsingConfiguration__Group__1__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3276:1: rule__ParsingConfiguration__Group__1__Impl : ( 'parsing:' ) ;
    public final void rule__ParsingConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3280:1: ( ( 'parsing:' ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3281:1: ( 'parsing:' )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3281:1: ( 'parsing:' )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3282:1: 'parsing:'
            {
             before(grammarAccess.getParsingConfigurationAccess().getParsingKeyword_1()); 
            match(input,41,FOLLOW_41_in_rule__ParsingConfiguration__Group__1__Impl6789); 
             after(grammarAccess.getParsingConfigurationAccess().getParsingKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParsingConfiguration__Group__1__Impl"


    // $ANTLR start "rule__ParsingConfiguration__Group__2"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3295:1: rule__ParsingConfiguration__Group__2 : rule__ParsingConfiguration__Group__2__Impl rule__ParsingConfiguration__Group__3 ;
    public final void rule__ParsingConfiguration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3299:1: ( rule__ParsingConfiguration__Group__2__Impl rule__ParsingConfiguration__Group__3 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3300:2: rule__ParsingConfiguration__Group__2__Impl rule__ParsingConfiguration__Group__3
            {
            pushFollow(FOLLOW_rule__ParsingConfiguration__Group__2__Impl_in_rule__ParsingConfiguration__Group__26820);
            rule__ParsingConfiguration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParsingConfiguration__Group__3_in_rule__ParsingConfiguration__Group__26823);
            rule__ParsingConfiguration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParsingConfiguration__Group__2"


    // $ANTLR start "rule__ParsingConfiguration__Group__2__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3307:1: rule__ParsingConfiguration__Group__2__Impl : ( ( rule__ParsingConfiguration__ProductIDAssignment_2 )? ) ;
    public final void rule__ParsingConfiguration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3311:1: ( ( ( rule__ParsingConfiguration__ProductIDAssignment_2 )? ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3312:1: ( ( rule__ParsingConfiguration__ProductIDAssignment_2 )? )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3312:1: ( ( rule__ParsingConfiguration__ProductIDAssignment_2 )? )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3313:1: ( rule__ParsingConfiguration__ProductIDAssignment_2 )?
            {
             before(grammarAccess.getParsingConfigurationAccess().getProductIDAssignment_2()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3314:1: ( rule__ParsingConfiguration__ProductIDAssignment_2 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==44) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3314:2: rule__ParsingConfiguration__ProductIDAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ParsingConfiguration__ProductIDAssignment_2_in_rule__ParsingConfiguration__Group__2__Impl6850);
                    rule__ParsingConfiguration__ProductIDAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParsingConfigurationAccess().getProductIDAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParsingConfiguration__Group__2__Impl"


    // $ANTLR start "rule__ParsingConfiguration__Group__3"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3324:1: rule__ParsingConfiguration__Group__3 : rule__ParsingConfiguration__Group__3__Impl rule__ParsingConfiguration__Group__4 ;
    public final void rule__ParsingConfiguration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3328:1: ( rule__ParsingConfiguration__Group__3__Impl rule__ParsingConfiguration__Group__4 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3329:2: rule__ParsingConfiguration__Group__3__Impl rule__ParsingConfiguration__Group__4
            {
            pushFollow(FOLLOW_rule__ParsingConfiguration__Group__3__Impl_in_rule__ParsingConfiguration__Group__36881);
            rule__ParsingConfiguration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParsingConfiguration__Group__4_in_rule__ParsingConfiguration__Group__36884);
            rule__ParsingConfiguration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParsingConfiguration__Group__3"


    // $ANTLR start "rule__ParsingConfiguration__Group__3__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3336:1: rule__ParsingConfiguration__Group__3__Impl : ( ( rule__ParsingConfiguration__FormatAssignment_3 )? ) ;
    public final void rule__ParsingConfiguration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3340:1: ( ( ( rule__ParsingConfiguration__FormatAssignment_3 )? ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3341:1: ( ( rule__ParsingConfiguration__FormatAssignment_3 )? )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3341:1: ( ( rule__ParsingConfiguration__FormatAssignment_3 )? )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3342:1: ( rule__ParsingConfiguration__FormatAssignment_3 )?
            {
             before(grammarAccess.getParsingConfigurationAccess().getFormatAssignment_3()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3343:1: ( rule__ParsingConfiguration__FormatAssignment_3 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==42) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3343:2: rule__ParsingConfiguration__FormatAssignment_3
                    {
                    pushFollow(FOLLOW_rule__ParsingConfiguration__FormatAssignment_3_in_rule__ParsingConfiguration__Group__3__Impl6911);
                    rule__ParsingConfiguration__FormatAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParsingConfigurationAccess().getFormatAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParsingConfiguration__Group__3__Impl"


    // $ANTLR start "rule__ParsingConfiguration__Group__4"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3353:1: rule__ParsingConfiguration__Group__4 : rule__ParsingConfiguration__Group__4__Impl rule__ParsingConfiguration__Group__5 ;
    public final void rule__ParsingConfiguration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3357:1: ( rule__ParsingConfiguration__Group__4__Impl rule__ParsingConfiguration__Group__5 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3358:2: rule__ParsingConfiguration__Group__4__Impl rule__ParsingConfiguration__Group__5
            {
            pushFollow(FOLLOW_rule__ParsingConfiguration__Group__4__Impl_in_rule__ParsingConfiguration__Group__46942);
            rule__ParsingConfiguration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParsingConfiguration__Group__5_in_rule__ParsingConfiguration__Group__46945);
            rule__ParsingConfiguration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParsingConfiguration__Group__4"


    // $ANTLR start "rule__ParsingConfiguration__Group__4__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3365:1: rule__ParsingConfiguration__Group__4__Impl : ( ( rule__ParsingConfiguration__SinterpretAssignment_4 )? ) ;
    public final void rule__ParsingConfiguration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3369:1: ( ( ( rule__ParsingConfiguration__SinterpretAssignment_4 )? ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3370:1: ( ( rule__ParsingConfiguration__SinterpretAssignment_4 )? )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3370:1: ( ( rule__ParsingConfiguration__SinterpretAssignment_4 )? )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3371:1: ( rule__ParsingConfiguration__SinterpretAssignment_4 )?
            {
             before(grammarAccess.getParsingConfigurationAccess().getSinterpretAssignment_4()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3372:1: ( rule__ParsingConfiguration__SinterpretAssignment_4 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==43) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3372:2: rule__ParsingConfiguration__SinterpretAssignment_4
                    {
                    pushFollow(FOLLOW_rule__ParsingConfiguration__SinterpretAssignment_4_in_rule__ParsingConfiguration__Group__4__Impl6972);
                    rule__ParsingConfiguration__SinterpretAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParsingConfigurationAccess().getSinterpretAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParsingConfiguration__Group__4__Impl"


    // $ANTLR start "rule__ParsingConfiguration__Group__5"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3382:1: rule__ParsingConfiguration__Group__5 : rule__ParsingConfiguration__Group__5__Impl rule__ParsingConfiguration__Group__6 ;
    public final void rule__ParsingConfiguration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3386:1: ( rule__ParsingConfiguration__Group__5__Impl rule__ParsingConfiguration__Group__6 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3387:2: rule__ParsingConfiguration__Group__5__Impl rule__ParsingConfiguration__Group__6
            {
            pushFollow(FOLLOW_rule__ParsingConfiguration__Group__5__Impl_in_rule__ParsingConfiguration__Group__57003);
            rule__ParsingConfiguration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ParsingConfiguration__Group__6_in_rule__ParsingConfiguration__Group__57006);
            rule__ParsingConfiguration__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParsingConfiguration__Group__5"


    // $ANTLR start "rule__ParsingConfiguration__Group__5__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3394:1: rule__ParsingConfiguration__Group__5__Impl : ( ( rule__ParsingConfiguration__SeparatorAssignment_5 )? ) ;
    public final void rule__ParsingConfiguration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3398:1: ( ( ( rule__ParsingConfiguration__SeparatorAssignment_5 )? ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3399:1: ( ( rule__ParsingConfiguration__SeparatorAssignment_5 )? )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3399:1: ( ( rule__ParsingConfiguration__SeparatorAssignment_5 )? )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3400:1: ( rule__ParsingConfiguration__SeparatorAssignment_5 )?
            {
             before(grammarAccess.getParsingConfigurationAccess().getSeparatorAssignment_5()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3401:1: ( rule__ParsingConfiguration__SeparatorAssignment_5 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==45) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3401:2: rule__ParsingConfiguration__SeparatorAssignment_5
                    {
                    pushFollow(FOLLOW_rule__ParsingConfiguration__SeparatorAssignment_5_in_rule__ParsingConfiguration__Group__5__Impl7033);
                    rule__ParsingConfiguration__SeparatorAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParsingConfigurationAccess().getSeparatorAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParsingConfiguration__Group__5__Impl"


    // $ANTLR start "rule__ParsingConfiguration__Group__6"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3411:1: rule__ParsingConfiguration__Group__6 : rule__ParsingConfiguration__Group__6__Impl ;
    public final void rule__ParsingConfiguration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3415:1: ( rule__ParsingConfiguration__Group__6__Impl )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3416:2: rule__ParsingConfiguration__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__ParsingConfiguration__Group__6__Impl_in_rule__ParsingConfiguration__Group__67064);
            rule__ParsingConfiguration__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParsingConfiguration__Group__6"


    // $ANTLR start "rule__ParsingConfiguration__Group__6__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3422:1: rule__ParsingConfiguration__Group__6__Impl : ( ( rule__ParsingConfiguration__MseparatorAssignment_6 )? ) ;
    public final void rule__ParsingConfiguration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3426:1: ( ( ( rule__ParsingConfiguration__MseparatorAssignment_6 )? ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3427:1: ( ( rule__ParsingConfiguration__MseparatorAssignment_6 )? )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3427:1: ( ( rule__ParsingConfiguration__MseparatorAssignment_6 )? )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3428:1: ( rule__ParsingConfiguration__MseparatorAssignment_6 )?
            {
             before(grammarAccess.getParsingConfigurationAccess().getMseparatorAssignment_6()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3429:1: ( rule__ParsingConfiguration__MseparatorAssignment_6 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==46) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3429:2: rule__ParsingConfiguration__MseparatorAssignment_6
                    {
                    pushFollow(FOLLOW_rule__ParsingConfiguration__MseparatorAssignment_6_in_rule__ParsingConfiguration__Group__6__Impl7091);
                    rule__ParsingConfiguration__MseparatorAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParsingConfigurationAccess().getMseparatorAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParsingConfiguration__Group__6__Impl"


    // $ANTLR start "rule__FormatSpecification__Group__0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3453:1: rule__FormatSpecification__Group__0 : rule__FormatSpecification__Group__0__Impl rule__FormatSpecification__Group__1 ;
    public final void rule__FormatSpecification__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3457:1: ( rule__FormatSpecification__Group__0__Impl rule__FormatSpecification__Group__1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3458:2: rule__FormatSpecification__Group__0__Impl rule__FormatSpecification__Group__1
            {
            pushFollow(FOLLOW_rule__FormatSpecification__Group__0__Impl_in_rule__FormatSpecification__Group__07136);
            rule__FormatSpecification__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__FormatSpecification__Group__1_in_rule__FormatSpecification__Group__07139);
            rule__FormatSpecification__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormatSpecification__Group__0"


    // $ANTLR start "rule__FormatSpecification__Group__0__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3465:1: rule__FormatSpecification__Group__0__Impl : ( 'format:' ) ;
    public final void rule__FormatSpecification__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3469:1: ( ( 'format:' ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3470:1: ( 'format:' )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3470:1: ( 'format:' )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3471:1: 'format:'
            {
             before(grammarAccess.getFormatSpecificationAccess().getFormatKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__FormatSpecification__Group__0__Impl7167); 
             after(grammarAccess.getFormatSpecificationAccess().getFormatKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormatSpecification__Group__0__Impl"


    // $ANTLR start "rule__FormatSpecification__Group__1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3484:1: rule__FormatSpecification__Group__1 : rule__FormatSpecification__Group__1__Impl ;
    public final void rule__FormatSpecification__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3488:1: ( rule__FormatSpecification__Group__1__Impl )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3489:2: rule__FormatSpecification__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FormatSpecification__Group__1__Impl_in_rule__FormatSpecification__Group__17198);
            rule__FormatSpecification__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormatSpecification__Group__1"


    // $ANTLR start "rule__FormatSpecification__Group__1__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3495:1: rule__FormatSpecification__Group__1__Impl : ( ( rule__FormatSpecification__FileformatAssignment_1 ) ) ;
    public final void rule__FormatSpecification__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3499:1: ( ( ( rule__FormatSpecification__FileformatAssignment_1 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3500:1: ( ( rule__FormatSpecification__FileformatAssignment_1 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3500:1: ( ( rule__FormatSpecification__FileformatAssignment_1 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3501:1: ( rule__FormatSpecification__FileformatAssignment_1 )
            {
             before(grammarAccess.getFormatSpecificationAccess().getFileformatAssignment_1()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3502:1: ( rule__FormatSpecification__FileformatAssignment_1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3502:2: rule__FormatSpecification__FileformatAssignment_1
            {
            pushFollow(FOLLOW_rule__FormatSpecification__FileformatAssignment_1_in_rule__FormatSpecification__Group__1__Impl7225);
            rule__FormatSpecification__FileformatAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFormatSpecificationAccess().getFileformatAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormatSpecification__Group__1__Impl"


    // $ANTLR start "rule__SyntacticalInterpretation__Group__0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3516:1: rule__SyntacticalInterpretation__Group__0 : rule__SyntacticalInterpretation__Group__0__Impl rule__SyntacticalInterpretation__Group__1 ;
    public final void rule__SyntacticalInterpretation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3520:1: ( rule__SyntacticalInterpretation__Group__0__Impl rule__SyntacticalInterpretation__Group__1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3521:2: rule__SyntacticalInterpretation__Group__0__Impl rule__SyntacticalInterpretation__Group__1
            {
            pushFollow(FOLLOW_rule__SyntacticalInterpretation__Group__0__Impl_in_rule__SyntacticalInterpretation__Group__07259);
            rule__SyntacticalInterpretation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SyntacticalInterpretation__Group__1_in_rule__SyntacticalInterpretation__Group__07262);
            rule__SyntacticalInterpretation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SyntacticalInterpretation__Group__0"


    // $ANTLR start "rule__SyntacticalInterpretation__Group__0__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3528:1: rule__SyntacticalInterpretation__Group__0__Impl : ( () ) ;
    public final void rule__SyntacticalInterpretation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3532:1: ( ( () ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3533:1: ( () )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3533:1: ( () )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3534:1: ()
            {
             before(grammarAccess.getSyntacticalInterpretationAccess().getSyntacticalInterpretationAction_0()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3535:1: ()
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3537:1: 
            {
            }

             after(grammarAccess.getSyntacticalInterpretationAccess().getSyntacticalInterpretationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SyntacticalInterpretation__Group__0__Impl"


    // $ANTLR start "rule__SyntacticalInterpretation__Group__1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3547:1: rule__SyntacticalInterpretation__Group__1 : rule__SyntacticalInterpretation__Group__1__Impl rule__SyntacticalInterpretation__Group__2 ;
    public final void rule__SyntacticalInterpretation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3551:1: ( rule__SyntacticalInterpretation__Group__1__Impl rule__SyntacticalInterpretation__Group__2 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3552:2: rule__SyntacticalInterpretation__Group__1__Impl rule__SyntacticalInterpretation__Group__2
            {
            pushFollow(FOLLOW_rule__SyntacticalInterpretation__Group__1__Impl_in_rule__SyntacticalInterpretation__Group__17320);
            rule__SyntacticalInterpretation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SyntacticalInterpretation__Group__2_in_rule__SyntacticalInterpretation__Group__17323);
            rule__SyntacticalInterpretation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SyntacticalInterpretation__Group__1"


    // $ANTLR start "rule__SyntacticalInterpretation__Group__1__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3559:1: rule__SyntacticalInterpretation__Group__1__Impl : ( 'variability:' ) ;
    public final void rule__SyntacticalInterpretation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3563:1: ( ( 'variability:' ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3564:1: ( 'variability:' )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3564:1: ( 'variability:' )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3565:1: 'variability:'
            {
             before(grammarAccess.getSyntacticalInterpretationAccess().getVariabilityKeyword_1()); 
            match(input,43,FOLLOW_43_in_rule__SyntacticalInterpretation__Group__1__Impl7351); 
             after(grammarAccess.getSyntacticalInterpretationAccess().getVariabilityKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SyntacticalInterpretation__Group__1__Impl"


    // $ANTLR start "rule__SyntacticalInterpretation__Group__2"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3578:1: rule__SyntacticalInterpretation__Group__2 : rule__SyntacticalInterpretation__Group__2__Impl rule__SyntacticalInterpretation__Group__3 ;
    public final void rule__SyntacticalInterpretation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3582:1: ( rule__SyntacticalInterpretation__Group__2__Impl rule__SyntacticalInterpretation__Group__3 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3583:2: rule__SyntacticalInterpretation__Group__2__Impl rule__SyntacticalInterpretation__Group__3
            {
            pushFollow(FOLLOW_rule__SyntacticalInterpretation__Group__2__Impl_in_rule__SyntacticalInterpretation__Group__27382);
            rule__SyntacticalInterpretation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SyntacticalInterpretation__Group__3_in_rule__SyntacticalInterpretation__Group__27385);
            rule__SyntacticalInterpretation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SyntacticalInterpretation__Group__2"


    // $ANTLR start "rule__SyntacticalInterpretation__Group__2__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3590:1: rule__SyntacticalInterpretation__Group__2__Impl : ( ( rule__SyntacticalInterpretation__OptAssignment_2 )? ) ;
    public final void rule__SyntacticalInterpretation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3594:1: ( ( ( rule__SyntacticalInterpretation__OptAssignment_2 )? ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3595:1: ( ( rule__SyntacticalInterpretation__OptAssignment_2 )? )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3595:1: ( ( rule__SyntacticalInterpretation__OptAssignment_2 )? )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3596:1: ( rule__SyntacticalInterpretation__OptAssignment_2 )?
            {
             before(grammarAccess.getSyntacticalInterpretationAccess().getOptAssignment_2()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3597:1: ( rule__SyntacticalInterpretation__OptAssignment_2 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==47) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3597:2: rule__SyntacticalInterpretation__OptAssignment_2
                    {
                    pushFollow(FOLLOW_rule__SyntacticalInterpretation__OptAssignment_2_in_rule__SyntacticalInterpretation__Group__2__Impl7412);
                    rule__SyntacticalInterpretation__OptAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSyntacticalInterpretationAccess().getOptAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SyntacticalInterpretation__Group__2__Impl"


    // $ANTLR start "rule__SyntacticalInterpretation__Group__3"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3607:1: rule__SyntacticalInterpretation__Group__3 : rule__SyntacticalInterpretation__Group__3__Impl rule__SyntacticalInterpretation__Group__4 ;
    public final void rule__SyntacticalInterpretation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3611:1: ( rule__SyntacticalInterpretation__Group__3__Impl rule__SyntacticalInterpretation__Group__4 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3612:2: rule__SyntacticalInterpretation__Group__3__Impl rule__SyntacticalInterpretation__Group__4
            {
            pushFollow(FOLLOW_rule__SyntacticalInterpretation__Group__3__Impl_in_rule__SyntacticalInterpretation__Group__37443);
            rule__SyntacticalInterpretation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SyntacticalInterpretation__Group__4_in_rule__SyntacticalInterpretation__Group__37446);
            rule__SyntacticalInterpretation__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SyntacticalInterpretation__Group__3"


    // $ANTLR start "rule__SyntacticalInterpretation__Group__3__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3619:1: rule__SyntacticalInterpretation__Group__3__Impl : ( ( rule__SyntacticalInterpretation__YesAssignment_3 )? ) ;
    public final void rule__SyntacticalInterpretation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3623:1: ( ( ( rule__SyntacticalInterpretation__YesAssignment_3 )? ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3624:1: ( ( rule__SyntacticalInterpretation__YesAssignment_3 )? )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3624:1: ( ( rule__SyntacticalInterpretation__YesAssignment_3 )? )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3625:1: ( rule__SyntacticalInterpretation__YesAssignment_3 )?
            {
             before(grammarAccess.getSyntacticalInterpretationAccess().getYesAssignment_3()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3626:1: ( rule__SyntacticalInterpretation__YesAssignment_3 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==48) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3626:2: rule__SyntacticalInterpretation__YesAssignment_3
                    {
                    pushFollow(FOLLOW_rule__SyntacticalInterpretation__YesAssignment_3_in_rule__SyntacticalInterpretation__Group__3__Impl7473);
                    rule__SyntacticalInterpretation__YesAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSyntacticalInterpretationAccess().getYesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SyntacticalInterpretation__Group__3__Impl"


    // $ANTLR start "rule__SyntacticalInterpretation__Group__4"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3636:1: rule__SyntacticalInterpretation__Group__4 : rule__SyntacticalInterpretation__Group__4__Impl rule__SyntacticalInterpretation__Group__5 ;
    public final void rule__SyntacticalInterpretation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3640:1: ( rule__SyntacticalInterpretation__Group__4__Impl rule__SyntacticalInterpretation__Group__5 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3641:2: rule__SyntacticalInterpretation__Group__4__Impl rule__SyntacticalInterpretation__Group__5
            {
            pushFollow(FOLLOW_rule__SyntacticalInterpretation__Group__4__Impl_in_rule__SyntacticalInterpretation__Group__47504);
            rule__SyntacticalInterpretation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SyntacticalInterpretation__Group__5_in_rule__SyntacticalInterpretation__Group__47507);
            rule__SyntacticalInterpretation__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SyntacticalInterpretation__Group__4"


    // $ANTLR start "rule__SyntacticalInterpretation__Group__4__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3648:1: rule__SyntacticalInterpretation__Group__4__Impl : ( ( rule__SyntacticalInterpretation__NoAssignment_4 )? ) ;
    public final void rule__SyntacticalInterpretation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3652:1: ( ( ( rule__SyntacticalInterpretation__NoAssignment_4 )? ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3653:1: ( ( rule__SyntacticalInterpretation__NoAssignment_4 )? )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3653:1: ( ( rule__SyntacticalInterpretation__NoAssignment_4 )? )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3654:1: ( rule__SyntacticalInterpretation__NoAssignment_4 )?
            {
             before(grammarAccess.getSyntacticalInterpretationAccess().getNoAssignment_4()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3655:1: ( rule__SyntacticalInterpretation__NoAssignment_4 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==49) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3655:2: rule__SyntacticalInterpretation__NoAssignment_4
                    {
                    pushFollow(FOLLOW_rule__SyntacticalInterpretation__NoAssignment_4_in_rule__SyntacticalInterpretation__Group__4__Impl7534);
                    rule__SyntacticalInterpretation__NoAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSyntacticalInterpretationAccess().getNoAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SyntacticalInterpretation__Group__4__Impl"


    // $ANTLR start "rule__SyntacticalInterpretation__Group__5"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3665:1: rule__SyntacticalInterpretation__Group__5 : rule__SyntacticalInterpretation__Group__5__Impl ;
    public final void rule__SyntacticalInterpretation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3669:1: ( rule__SyntacticalInterpretation__Group__5__Impl )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3670:2: rule__SyntacticalInterpretation__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__SyntacticalInterpretation__Group__5__Impl_in_rule__SyntacticalInterpretation__Group__57565);
            rule__SyntacticalInterpretation__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SyntacticalInterpretation__Group__5"


    // $ANTLR start "rule__SyntacticalInterpretation__Group__5__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3676:1: rule__SyntacticalInterpretation__Group__5__Impl : ( ( rule__SyntacticalInterpretation__NaAssignment_5 )? ) ;
    public final void rule__SyntacticalInterpretation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3680:1: ( ( ( rule__SyntacticalInterpretation__NaAssignment_5 )? ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3681:1: ( ( rule__SyntacticalInterpretation__NaAssignment_5 )? )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3681:1: ( ( rule__SyntacticalInterpretation__NaAssignment_5 )? )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3682:1: ( rule__SyntacticalInterpretation__NaAssignment_5 )?
            {
             before(grammarAccess.getSyntacticalInterpretationAccess().getNaAssignment_5()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3683:1: ( rule__SyntacticalInterpretation__NaAssignment_5 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==50) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3683:2: rule__SyntacticalInterpretation__NaAssignment_5
                    {
                    pushFollow(FOLLOW_rule__SyntacticalInterpretation__NaAssignment_5_in_rule__SyntacticalInterpretation__Group__5__Impl7592);
                    rule__SyntacticalInterpretation__NaAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSyntacticalInterpretationAccess().getNaAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SyntacticalInterpretation__Group__5__Impl"


    // $ANTLR start "rule__Key__Group__0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3705:1: rule__Key__Group__0 : rule__Key__Group__0__Impl rule__Key__Group__1 ;
    public final void rule__Key__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3709:1: ( rule__Key__Group__0__Impl rule__Key__Group__1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3710:2: rule__Key__Group__0__Impl rule__Key__Group__1
            {
            pushFollow(FOLLOW_rule__Key__Group__0__Impl_in_rule__Key__Group__07635);
            rule__Key__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Key__Group__1_in_rule__Key__Group__07638);
            rule__Key__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Key__Group__0"


    // $ANTLR start "rule__Key__Group__0__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3717:1: rule__Key__Group__0__Impl : ( 'key:' ) ;
    public final void rule__Key__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3721:1: ( ( 'key:' ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3722:1: ( 'key:' )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3722:1: ( 'key:' )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3723:1: 'key:'
            {
             before(grammarAccess.getKeyAccess().getKeyKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__Key__Group__0__Impl7666); 
             after(grammarAccess.getKeyAccess().getKeyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Key__Group__0__Impl"


    // $ANTLR start "rule__Key__Group__1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3736:1: rule__Key__Group__1 : rule__Key__Group__1__Impl ;
    public final void rule__Key__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3740:1: ( rule__Key__Group__1__Impl )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3741:2: rule__Key__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Key__Group__1__Impl_in_rule__Key__Group__17697);
            rule__Key__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Key__Group__1"


    // $ANTLR start "rule__Key__Group__1__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3747:1: rule__Key__Group__1__Impl : ( ( ( rule__Key__CidAssignment_1 ) ) ( ( rule__Key__CidAssignment_1 )* ) ) ;
    public final void rule__Key__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3751:1: ( ( ( ( rule__Key__CidAssignment_1 ) ) ( ( rule__Key__CidAssignment_1 )* ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3752:1: ( ( ( rule__Key__CidAssignment_1 ) ) ( ( rule__Key__CidAssignment_1 )* ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3752:1: ( ( ( rule__Key__CidAssignment_1 ) ) ( ( rule__Key__CidAssignment_1 )* ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3753:1: ( ( rule__Key__CidAssignment_1 ) ) ( ( rule__Key__CidAssignment_1 )* )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3753:1: ( ( rule__Key__CidAssignment_1 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3754:1: ( rule__Key__CidAssignment_1 )
            {
             before(grammarAccess.getKeyAccess().getCidAssignment_1()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3755:1: ( rule__Key__CidAssignment_1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3755:2: rule__Key__CidAssignment_1
            {
            pushFollow(FOLLOW_rule__Key__CidAssignment_1_in_rule__Key__Group__1__Impl7726);
            rule__Key__CidAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getKeyAccess().getCidAssignment_1()); 

            }

            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3758:1: ( ( rule__Key__CidAssignment_1 )* )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3759:1: ( rule__Key__CidAssignment_1 )*
            {
             before(grammarAccess.getKeyAccess().getCidAssignment_1()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3760:1: ( rule__Key__CidAssignment_1 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_STRING) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3760:2: rule__Key__CidAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Key__CidAssignment_1_in_rule__Key__Group__1__Impl7738);
            	    rule__Key__CidAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

             after(grammarAccess.getKeyAccess().getCidAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Key__Group__1__Impl"


    // $ANTLR start "rule__CSVSeparator__Group__0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3775:1: rule__CSVSeparator__Group__0 : rule__CSVSeparator__Group__0__Impl rule__CSVSeparator__Group__1 ;
    public final void rule__CSVSeparator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3779:1: ( rule__CSVSeparator__Group__0__Impl rule__CSVSeparator__Group__1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3780:2: rule__CSVSeparator__Group__0__Impl rule__CSVSeparator__Group__1
            {
            pushFollow(FOLLOW_rule__CSVSeparator__Group__0__Impl_in_rule__CSVSeparator__Group__07775);
            rule__CSVSeparator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CSVSeparator__Group__1_in_rule__CSVSeparator__Group__07778);
            rule__CSVSeparator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSVSeparator__Group__0"


    // $ANTLR start "rule__CSVSeparator__Group__0__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3787:1: rule__CSVSeparator__Group__0__Impl : ( 'separator:' ) ;
    public final void rule__CSVSeparator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3791:1: ( ( 'separator:' ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3792:1: ( 'separator:' )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3792:1: ( 'separator:' )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3793:1: 'separator:'
            {
             before(grammarAccess.getCSVSeparatorAccess().getSeparatorKeyword_0()); 
            match(input,45,FOLLOW_45_in_rule__CSVSeparator__Group__0__Impl7806); 
             after(grammarAccess.getCSVSeparatorAccess().getSeparatorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSVSeparator__Group__0__Impl"


    // $ANTLR start "rule__CSVSeparator__Group__1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3806:1: rule__CSVSeparator__Group__1 : rule__CSVSeparator__Group__1__Impl ;
    public final void rule__CSVSeparator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3810:1: ( rule__CSVSeparator__Group__1__Impl )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3811:2: rule__CSVSeparator__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CSVSeparator__Group__1__Impl_in_rule__CSVSeparator__Group__17837);
            rule__CSVSeparator__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSVSeparator__Group__1"


    // $ANTLR start "rule__CSVSeparator__Group__1__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3817:1: rule__CSVSeparator__Group__1__Impl : ( ( rule__CSVSeparator__SepAssignment_1 ) ) ;
    public final void rule__CSVSeparator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3821:1: ( ( ( rule__CSVSeparator__SepAssignment_1 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3822:1: ( ( rule__CSVSeparator__SepAssignment_1 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3822:1: ( ( rule__CSVSeparator__SepAssignment_1 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3823:1: ( rule__CSVSeparator__SepAssignment_1 )
            {
             before(grammarAccess.getCSVSeparatorAccess().getSepAssignment_1()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3824:1: ( rule__CSVSeparator__SepAssignment_1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3824:2: rule__CSVSeparator__SepAssignment_1
            {
            pushFollow(FOLLOW_rule__CSVSeparator__SepAssignment_1_in_rule__CSVSeparator__Group__1__Impl7864);
            rule__CSVSeparator__SepAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCSVSeparatorAccess().getSepAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSVSeparator__Group__1__Impl"


    // $ANTLR start "rule__CSVMultiSeparator__Group__0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3838:1: rule__CSVMultiSeparator__Group__0 : rule__CSVMultiSeparator__Group__0__Impl rule__CSVMultiSeparator__Group__1 ;
    public final void rule__CSVMultiSeparator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3842:1: ( rule__CSVMultiSeparator__Group__0__Impl rule__CSVMultiSeparator__Group__1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3843:2: rule__CSVMultiSeparator__Group__0__Impl rule__CSVMultiSeparator__Group__1
            {
            pushFollow(FOLLOW_rule__CSVMultiSeparator__Group__0__Impl_in_rule__CSVMultiSeparator__Group__07898);
            rule__CSVMultiSeparator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__CSVMultiSeparator__Group__1_in_rule__CSVMultiSeparator__Group__07901);
            rule__CSVMultiSeparator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSVMultiSeparator__Group__0"


    // $ANTLR start "rule__CSVMultiSeparator__Group__0__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3850:1: rule__CSVMultiSeparator__Group__0__Impl : ( 'multivalued_separator:' ) ;
    public final void rule__CSVMultiSeparator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3854:1: ( ( 'multivalued_separator:' ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3855:1: ( 'multivalued_separator:' )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3855:1: ( 'multivalued_separator:' )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3856:1: 'multivalued_separator:'
            {
             before(grammarAccess.getCSVMultiSeparatorAccess().getMultivalued_separatorKeyword_0()); 
            match(input,46,FOLLOW_46_in_rule__CSVMultiSeparator__Group__0__Impl7929); 
             after(grammarAccess.getCSVMultiSeparatorAccess().getMultivalued_separatorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSVMultiSeparator__Group__0__Impl"


    // $ANTLR start "rule__CSVMultiSeparator__Group__1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3869:1: rule__CSVMultiSeparator__Group__1 : rule__CSVMultiSeparator__Group__1__Impl ;
    public final void rule__CSVMultiSeparator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3873:1: ( rule__CSVMultiSeparator__Group__1__Impl )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3874:2: rule__CSVMultiSeparator__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__CSVMultiSeparator__Group__1__Impl_in_rule__CSVMultiSeparator__Group__17960);
            rule__CSVMultiSeparator__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSVMultiSeparator__Group__1"


    // $ANTLR start "rule__CSVMultiSeparator__Group__1__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3880:1: rule__CSVMultiSeparator__Group__1__Impl : ( ( ( rule__CSVMultiSeparator__SepsAssignment_1 ) ) ( ( rule__CSVMultiSeparator__SepsAssignment_1 )* ) ) ;
    public final void rule__CSVMultiSeparator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3884:1: ( ( ( ( rule__CSVMultiSeparator__SepsAssignment_1 ) ) ( ( rule__CSVMultiSeparator__SepsAssignment_1 )* ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3885:1: ( ( ( rule__CSVMultiSeparator__SepsAssignment_1 ) ) ( ( rule__CSVMultiSeparator__SepsAssignment_1 )* ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3885:1: ( ( ( rule__CSVMultiSeparator__SepsAssignment_1 ) ) ( ( rule__CSVMultiSeparator__SepsAssignment_1 )* ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3886:1: ( ( rule__CSVMultiSeparator__SepsAssignment_1 ) ) ( ( rule__CSVMultiSeparator__SepsAssignment_1 )* )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3886:1: ( ( rule__CSVMultiSeparator__SepsAssignment_1 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3887:1: ( rule__CSVMultiSeparator__SepsAssignment_1 )
            {
             before(grammarAccess.getCSVMultiSeparatorAccess().getSepsAssignment_1()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3888:1: ( rule__CSVMultiSeparator__SepsAssignment_1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3888:2: rule__CSVMultiSeparator__SepsAssignment_1
            {
            pushFollow(FOLLOW_rule__CSVMultiSeparator__SepsAssignment_1_in_rule__CSVMultiSeparator__Group__1__Impl7989);
            rule__CSVMultiSeparator__SepsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCSVMultiSeparatorAccess().getSepsAssignment_1()); 

            }

            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3891:1: ( ( rule__CSVMultiSeparator__SepsAssignment_1 )* )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3892:1: ( rule__CSVMultiSeparator__SepsAssignment_1 )*
            {
             before(grammarAccess.getCSVMultiSeparatorAccess().getSepsAssignment_1()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3893:1: ( rule__CSVMultiSeparator__SepsAssignment_1 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_STRING) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3893:2: rule__CSVMultiSeparator__SepsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__CSVMultiSeparator__SepsAssignment_1_in_rule__CSVMultiSeparator__Group__1__Impl8001);
            	    rule__CSVMultiSeparator__SepsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

             after(grammarAccess.getCSVMultiSeparatorAccess().getSepsAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSVMultiSeparator__Group__1__Impl"


    // $ANTLR start "rule__Optional__Group__0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3908:1: rule__Optional__Group__0 : rule__Optional__Group__0__Impl rule__Optional__Group__1 ;
    public final void rule__Optional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3912:1: ( rule__Optional__Group__0__Impl rule__Optional__Group__1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3913:2: rule__Optional__Group__0__Impl rule__Optional__Group__1
            {
            pushFollow(FOLLOW_rule__Optional__Group__0__Impl_in_rule__Optional__Group__08038);
            rule__Optional__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group__1_in_rule__Optional__Group__08041);
            rule__Optional__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group__0"


    // $ANTLR start "rule__Optional__Group__0__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3920:1: rule__Optional__Group__0__Impl : ( 'optional:' ) ;
    public final void rule__Optional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3924:1: ( ( 'optional:' ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3925:1: ( 'optional:' )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3925:1: ( 'optional:' )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3926:1: 'optional:'
            {
             before(grammarAccess.getOptionalAccess().getOptionalKeyword_0()); 
            match(input,47,FOLLOW_47_in_rule__Optional__Group__0__Impl8069); 
             after(grammarAccess.getOptionalAccess().getOptionalKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group__0__Impl"


    // $ANTLR start "rule__Optional__Group__1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3939:1: rule__Optional__Group__1 : rule__Optional__Group__1__Impl ;
    public final void rule__Optional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3943:1: ( rule__Optional__Group__1__Impl )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3944:2: rule__Optional__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Optional__Group__1__Impl_in_rule__Optional__Group__18100);
            rule__Optional__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group__1"


    // $ANTLR start "rule__Optional__Group__1__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3950:1: rule__Optional__Group__1__Impl : ( ( ( rule__Optional__ValuesAssignment_1 ) ) ( ( rule__Optional__ValuesAssignment_1 )* ) ) ;
    public final void rule__Optional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3954:1: ( ( ( ( rule__Optional__ValuesAssignment_1 ) ) ( ( rule__Optional__ValuesAssignment_1 )* ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3955:1: ( ( ( rule__Optional__ValuesAssignment_1 ) ) ( ( rule__Optional__ValuesAssignment_1 )* ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3955:1: ( ( ( rule__Optional__ValuesAssignment_1 ) ) ( ( rule__Optional__ValuesAssignment_1 )* ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3956:1: ( ( rule__Optional__ValuesAssignment_1 ) ) ( ( rule__Optional__ValuesAssignment_1 )* )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3956:1: ( ( rule__Optional__ValuesAssignment_1 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3957:1: ( rule__Optional__ValuesAssignment_1 )
            {
             before(grammarAccess.getOptionalAccess().getValuesAssignment_1()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3958:1: ( rule__Optional__ValuesAssignment_1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3958:2: rule__Optional__ValuesAssignment_1
            {
            pushFollow(FOLLOW_rule__Optional__ValuesAssignment_1_in_rule__Optional__Group__1__Impl8129);
            rule__Optional__ValuesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOptionalAccess().getValuesAssignment_1()); 

            }

            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3961:1: ( ( rule__Optional__ValuesAssignment_1 )* )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3962:1: ( rule__Optional__ValuesAssignment_1 )*
            {
             before(grammarAccess.getOptionalAccess().getValuesAssignment_1()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3963:1: ( rule__Optional__ValuesAssignment_1 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_STRING) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3963:2: rule__Optional__ValuesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Optional__ValuesAssignment_1_in_rule__Optional__Group__1__Impl8141);
            	    rule__Optional__ValuesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

             after(grammarAccess.getOptionalAccess().getValuesAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group__1__Impl"


    // $ANTLR start "rule__Mandatory__Group__0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3978:1: rule__Mandatory__Group__0 : rule__Mandatory__Group__0__Impl rule__Mandatory__Group__1 ;
    public final void rule__Mandatory__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3982:1: ( rule__Mandatory__Group__0__Impl rule__Mandatory__Group__1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3983:2: rule__Mandatory__Group__0__Impl rule__Mandatory__Group__1
            {
            pushFollow(FOLLOW_rule__Mandatory__Group__0__Impl_in_rule__Mandatory__Group__08178);
            rule__Mandatory__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Mandatory__Group__1_in_rule__Mandatory__Group__08181);
            rule__Mandatory__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group__0"


    // $ANTLR start "rule__Mandatory__Group__0__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3990:1: rule__Mandatory__Group__0__Impl : ( 'mandatory:' ) ;
    public final void rule__Mandatory__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3994:1: ( ( 'mandatory:' ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3995:1: ( 'mandatory:' )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3995:1: ( 'mandatory:' )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:3996:1: 'mandatory:'
            {
             before(grammarAccess.getMandatoryAccess().getMandatoryKeyword_0()); 
            match(input,48,FOLLOW_48_in_rule__Mandatory__Group__0__Impl8209); 
             after(grammarAccess.getMandatoryAccess().getMandatoryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group__0__Impl"


    // $ANTLR start "rule__Mandatory__Group__1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4009:1: rule__Mandatory__Group__1 : rule__Mandatory__Group__1__Impl ;
    public final void rule__Mandatory__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4013:1: ( rule__Mandatory__Group__1__Impl )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4014:2: rule__Mandatory__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Mandatory__Group__1__Impl_in_rule__Mandatory__Group__18240);
            rule__Mandatory__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group__1"


    // $ANTLR start "rule__Mandatory__Group__1__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4020:1: rule__Mandatory__Group__1__Impl : ( ( ( rule__Mandatory__ValuesAssignment_1 ) ) ( ( rule__Mandatory__ValuesAssignment_1 )* ) ) ;
    public final void rule__Mandatory__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4024:1: ( ( ( ( rule__Mandatory__ValuesAssignment_1 ) ) ( ( rule__Mandatory__ValuesAssignment_1 )* ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4025:1: ( ( ( rule__Mandatory__ValuesAssignment_1 ) ) ( ( rule__Mandatory__ValuesAssignment_1 )* ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4025:1: ( ( ( rule__Mandatory__ValuesAssignment_1 ) ) ( ( rule__Mandatory__ValuesAssignment_1 )* ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4026:1: ( ( rule__Mandatory__ValuesAssignment_1 ) ) ( ( rule__Mandatory__ValuesAssignment_1 )* )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4026:1: ( ( rule__Mandatory__ValuesAssignment_1 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4027:1: ( rule__Mandatory__ValuesAssignment_1 )
            {
             before(grammarAccess.getMandatoryAccess().getValuesAssignment_1()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4028:1: ( rule__Mandatory__ValuesAssignment_1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4028:2: rule__Mandatory__ValuesAssignment_1
            {
            pushFollow(FOLLOW_rule__Mandatory__ValuesAssignment_1_in_rule__Mandatory__Group__1__Impl8269);
            rule__Mandatory__ValuesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryAccess().getValuesAssignment_1()); 

            }

            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4031:1: ( ( rule__Mandatory__ValuesAssignment_1 )* )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4032:1: ( rule__Mandatory__ValuesAssignment_1 )*
            {
             before(grammarAccess.getMandatoryAccess().getValuesAssignment_1()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4033:1: ( rule__Mandatory__ValuesAssignment_1 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==RULE_STRING) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4033:2: rule__Mandatory__ValuesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Mandatory__ValuesAssignment_1_in_rule__Mandatory__Group__1__Impl8281);
            	    rule__Mandatory__ValuesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

             after(grammarAccess.getMandatoryAccess().getValuesAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__Group__1__Impl"


    // $ANTLR start "rule__NotPresent__Group__0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4048:1: rule__NotPresent__Group__0 : rule__NotPresent__Group__0__Impl rule__NotPresent__Group__1 ;
    public final void rule__NotPresent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4052:1: ( rule__NotPresent__Group__0__Impl rule__NotPresent__Group__1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4053:2: rule__NotPresent__Group__0__Impl rule__NotPresent__Group__1
            {
            pushFollow(FOLLOW_rule__NotPresent__Group__0__Impl_in_rule__NotPresent__Group__08318);
            rule__NotPresent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NotPresent__Group__1_in_rule__NotPresent__Group__08321);
            rule__NotPresent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotPresent__Group__0"


    // $ANTLR start "rule__NotPresent__Group__0__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4060:1: rule__NotPresent__Group__0__Impl : ( 'notpresent:' ) ;
    public final void rule__NotPresent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4064:1: ( ( 'notpresent:' ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4065:1: ( 'notpresent:' )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4065:1: ( 'notpresent:' )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4066:1: 'notpresent:'
            {
             before(grammarAccess.getNotPresentAccess().getNotpresentKeyword_0()); 
            match(input,49,FOLLOW_49_in_rule__NotPresent__Group__0__Impl8349); 
             after(grammarAccess.getNotPresentAccess().getNotpresentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotPresent__Group__0__Impl"


    // $ANTLR start "rule__NotPresent__Group__1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4079:1: rule__NotPresent__Group__1 : rule__NotPresent__Group__1__Impl ;
    public final void rule__NotPresent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4083:1: ( rule__NotPresent__Group__1__Impl )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4084:2: rule__NotPresent__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NotPresent__Group__1__Impl_in_rule__NotPresent__Group__18380);
            rule__NotPresent__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotPresent__Group__1"


    // $ANTLR start "rule__NotPresent__Group__1__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4090:1: rule__NotPresent__Group__1__Impl : ( ( ( rule__NotPresent__ValuesAssignment_1 ) ) ( ( rule__NotPresent__ValuesAssignment_1 )* ) ) ;
    public final void rule__NotPresent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4094:1: ( ( ( ( rule__NotPresent__ValuesAssignment_1 ) ) ( ( rule__NotPresent__ValuesAssignment_1 )* ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4095:1: ( ( ( rule__NotPresent__ValuesAssignment_1 ) ) ( ( rule__NotPresent__ValuesAssignment_1 )* ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4095:1: ( ( ( rule__NotPresent__ValuesAssignment_1 ) ) ( ( rule__NotPresent__ValuesAssignment_1 )* ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4096:1: ( ( rule__NotPresent__ValuesAssignment_1 ) ) ( ( rule__NotPresent__ValuesAssignment_1 )* )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4096:1: ( ( rule__NotPresent__ValuesAssignment_1 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4097:1: ( rule__NotPresent__ValuesAssignment_1 )
            {
             before(grammarAccess.getNotPresentAccess().getValuesAssignment_1()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4098:1: ( rule__NotPresent__ValuesAssignment_1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4098:2: rule__NotPresent__ValuesAssignment_1
            {
            pushFollow(FOLLOW_rule__NotPresent__ValuesAssignment_1_in_rule__NotPresent__Group__1__Impl8409);
            rule__NotPresent__ValuesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNotPresentAccess().getValuesAssignment_1()); 

            }

            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4101:1: ( ( rule__NotPresent__ValuesAssignment_1 )* )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4102:1: ( rule__NotPresent__ValuesAssignment_1 )*
            {
             before(grammarAccess.getNotPresentAccess().getValuesAssignment_1()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4103:1: ( rule__NotPresent__ValuesAssignment_1 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==RULE_STRING) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4103:2: rule__NotPresent__ValuesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__NotPresent__ValuesAssignment_1_in_rule__NotPresent__Group__1__Impl8421);
            	    rule__NotPresent__ValuesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

             after(grammarAccess.getNotPresentAccess().getValuesAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotPresent__Group__1__Impl"


    // $ANTLR start "rule__Unknown__Group__0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4118:1: rule__Unknown__Group__0 : rule__Unknown__Group__0__Impl rule__Unknown__Group__1 ;
    public final void rule__Unknown__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4122:1: ( rule__Unknown__Group__0__Impl rule__Unknown__Group__1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4123:2: rule__Unknown__Group__0__Impl rule__Unknown__Group__1
            {
            pushFollow(FOLLOW_rule__Unknown__Group__0__Impl_in_rule__Unknown__Group__08458);
            rule__Unknown__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Unknown__Group__1_in_rule__Unknown__Group__08461);
            rule__Unknown__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unknown__Group__0"


    // $ANTLR start "rule__Unknown__Group__0__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4130:1: rule__Unknown__Group__0__Impl : ( 'unknown:' ) ;
    public final void rule__Unknown__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4134:1: ( ( 'unknown:' ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4135:1: ( 'unknown:' )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4135:1: ( 'unknown:' )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4136:1: 'unknown:'
            {
             before(grammarAccess.getUnknownAccess().getUnknownKeyword_0()); 
            match(input,50,FOLLOW_50_in_rule__Unknown__Group__0__Impl8489); 
             after(grammarAccess.getUnknownAccess().getUnknownKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unknown__Group__0__Impl"


    // $ANTLR start "rule__Unknown__Group__1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4149:1: rule__Unknown__Group__1 : rule__Unknown__Group__1__Impl ;
    public final void rule__Unknown__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4153:1: ( rule__Unknown__Group__1__Impl )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4154:2: rule__Unknown__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Unknown__Group__1__Impl_in_rule__Unknown__Group__18520);
            rule__Unknown__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unknown__Group__1"


    // $ANTLR start "rule__Unknown__Group__1__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4160:1: rule__Unknown__Group__1__Impl : ( ( ( rule__Unknown__ValuesAssignment_1 ) ) ( ( rule__Unknown__ValuesAssignment_1 )* ) ) ;
    public final void rule__Unknown__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4164:1: ( ( ( ( rule__Unknown__ValuesAssignment_1 ) ) ( ( rule__Unknown__ValuesAssignment_1 )* ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4165:1: ( ( ( rule__Unknown__ValuesAssignment_1 ) ) ( ( rule__Unknown__ValuesAssignment_1 )* ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4165:1: ( ( ( rule__Unknown__ValuesAssignment_1 ) ) ( ( rule__Unknown__ValuesAssignment_1 )* ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4166:1: ( ( rule__Unknown__ValuesAssignment_1 ) ) ( ( rule__Unknown__ValuesAssignment_1 )* )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4166:1: ( ( rule__Unknown__ValuesAssignment_1 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4167:1: ( rule__Unknown__ValuesAssignment_1 )
            {
             before(grammarAccess.getUnknownAccess().getValuesAssignment_1()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4168:1: ( rule__Unknown__ValuesAssignment_1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4168:2: rule__Unknown__ValuesAssignment_1
            {
            pushFollow(FOLLOW_rule__Unknown__ValuesAssignment_1_in_rule__Unknown__Group__1__Impl8549);
            rule__Unknown__ValuesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUnknownAccess().getValuesAssignment_1()); 

            }

            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4171:1: ( ( rule__Unknown__ValuesAssignment_1 )* )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4172:1: ( rule__Unknown__ValuesAssignment_1 )*
            {
             before(grammarAccess.getUnknownAccess().getValuesAssignment_1()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4173:1: ( rule__Unknown__ValuesAssignment_1 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==RULE_STRING) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4173:2: rule__Unknown__ValuesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Unknown__ValuesAssignment_1_in_rule__Unknown__Group__1__Impl8561);
            	    rule__Unknown__ValuesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

             after(grammarAccess.getUnknownAccess().getValuesAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unknown__Group__1__Impl"


    // $ANTLR start "rule__ScopingView__Group__0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4188:1: rule__ScopingView__Group__0 : rule__ScopingView__Group__0__Impl rule__ScopingView__Group__1 ;
    public final void rule__ScopingView__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4192:1: ( rule__ScopingView__Group__0__Impl rule__ScopingView__Group__1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4193:2: rule__ScopingView__Group__0__Impl rule__ScopingView__Group__1
            {
            pushFollow(FOLLOW_rule__ScopingView__Group__0__Impl_in_rule__ScopingView__Group__08598);
            rule__ScopingView__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScopingView__Group__1_in_rule__ScopingView__Group__08601);
            rule__ScopingView__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopingView__Group__0"


    // $ANTLR start "rule__ScopingView__Group__0__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4200:1: rule__ScopingView__Group__0__Impl : ( 'view:' ) ;
    public final void rule__ScopingView__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4204:1: ( ( 'view:' ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4205:1: ( 'view:' )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4205:1: ( 'view:' )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4206:1: 'view:'
            {
             before(grammarAccess.getScopingViewAccess().getViewKeyword_0()); 
            match(input,51,FOLLOW_51_in_rule__ScopingView__Group__0__Impl8629); 
             after(grammarAccess.getScopingViewAccess().getViewKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopingView__Group__0__Impl"


    // $ANTLR start "rule__ScopingView__Group__1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4219:1: rule__ScopingView__Group__1 : rule__ScopingView__Group__1__Impl rule__ScopingView__Group__2 ;
    public final void rule__ScopingView__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4223:1: ( rule__ScopingView__Group__1__Impl rule__ScopingView__Group__2 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4224:2: rule__ScopingView__Group__1__Impl rule__ScopingView__Group__2
            {
            pushFollow(FOLLOW_rule__ScopingView__Group__1__Impl_in_rule__ScopingView__Group__18660);
            rule__ScopingView__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScopingView__Group__2_in_rule__ScopingView__Group__18663);
            rule__ScopingView__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopingView__Group__1"


    // $ANTLR start "rule__ScopingView__Group__1__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4231:1: rule__ScopingView__Group__1__Impl : ( ( rule__ScopingView__ViewAssignment_1 ) ) ;
    public final void rule__ScopingView__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4235:1: ( ( ( rule__ScopingView__ViewAssignment_1 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4236:1: ( ( rule__ScopingView__ViewAssignment_1 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4236:1: ( ( rule__ScopingView__ViewAssignment_1 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4237:1: ( rule__ScopingView__ViewAssignment_1 )
            {
             before(grammarAccess.getScopingViewAccess().getViewAssignment_1()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4238:1: ( rule__ScopingView__ViewAssignment_1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4238:2: rule__ScopingView__ViewAssignment_1
            {
            pushFollow(FOLLOW_rule__ScopingView__ViewAssignment_1_in_rule__ScopingView__Group__1__Impl8690);
            rule__ScopingView__ViewAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getScopingViewAccess().getViewAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopingView__Group__1__Impl"


    // $ANTLR start "rule__ScopingView__Group__2"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4248:1: rule__ScopingView__Group__2 : rule__ScopingView__Group__2__Impl rule__ScopingView__Group__3 ;
    public final void rule__ScopingView__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4252:1: ( rule__ScopingView__Group__2__Impl rule__ScopingView__Group__3 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4253:2: rule__ScopingView__Group__2__Impl rule__ScopingView__Group__3
            {
            pushFollow(FOLLOW_rule__ScopingView__Group__2__Impl_in_rule__ScopingView__Group__28720);
            rule__ScopingView__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScopingView__Group__3_in_rule__ScopingView__Group__28723);
            rule__ScopingView__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopingView__Group__2"


    // $ANTLR start "rule__ScopingView__Group__2__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4260:1: rule__ScopingView__Group__2__Impl : ( ( rule__ScopingView__ViewnameAssignment_2 )? ) ;
    public final void rule__ScopingView__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4264:1: ( ( ( rule__ScopingView__ViewnameAssignment_2 )? ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4265:1: ( ( rule__ScopingView__ViewnameAssignment_2 )? )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4265:1: ( ( rule__ScopingView__ViewnameAssignment_2 )? )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4266:1: ( rule__ScopingView__ViewnameAssignment_2 )?
            {
             before(grammarAccess.getScopingViewAccess().getViewnameAssignment_2()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4267:1: ( rule__ScopingView__ViewnameAssignment_2 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==52) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4267:2: rule__ScopingView__ViewnameAssignment_2
                    {
                    pushFollow(FOLLOW_rule__ScopingView__ViewnameAssignment_2_in_rule__ScopingView__Group__2__Impl8750);
                    rule__ScopingView__ViewnameAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScopingViewAccess().getViewnameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopingView__Group__2__Impl"


    // $ANTLR start "rule__ScopingView__Group__3"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4277:1: rule__ScopingView__Group__3 : rule__ScopingView__Group__3__Impl rule__ScopingView__Group__4 ;
    public final void rule__ScopingView__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4281:1: ( rule__ScopingView__Group__3__Impl rule__ScopingView__Group__4 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4282:2: rule__ScopingView__Group__3__Impl rule__ScopingView__Group__4
            {
            pushFollow(FOLLOW_rule__ScopingView__Group__3__Impl_in_rule__ScopingView__Group__38781);
            rule__ScopingView__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScopingView__Group__4_in_rule__ScopingView__Group__38784);
            rule__ScopingView__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopingView__Group__3"


    // $ANTLR start "rule__ScopingView__Group__3__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4289:1: rule__ScopingView__Group__3__Impl : ( ( rule__ScopingView__SchemaAssignment_3 )? ) ;
    public final void rule__ScopingView__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4293:1: ( ( ( rule__ScopingView__SchemaAssignment_3 )? ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4294:1: ( ( rule__ScopingView__SchemaAssignment_3 )? )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4294:1: ( ( rule__ScopingView__SchemaAssignment_3 )? )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4295:1: ( rule__ScopingView__SchemaAssignment_3 )?
            {
             before(grammarAccess.getScopingViewAccess().getSchemaAssignment_3()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4296:1: ( rule__ScopingView__SchemaAssignment_3 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==35) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4296:2: rule__ScopingView__SchemaAssignment_3
                    {
                    pushFollow(FOLLOW_rule__ScopingView__SchemaAssignment_3_in_rule__ScopingView__Group__3__Impl8811);
                    rule__ScopingView__SchemaAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScopingViewAccess().getSchemaAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopingView__Group__3__Impl"


    // $ANTLR start "rule__ScopingView__Group__4"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4306:1: rule__ScopingView__Group__4 : rule__ScopingView__Group__4__Impl rule__ScopingView__Group__5 ;
    public final void rule__ScopingView__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4310:1: ( rule__ScopingView__Group__4__Impl rule__ScopingView__Group__5 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4311:2: rule__ScopingView__Group__4__Impl rule__ScopingView__Group__5
            {
            pushFollow(FOLLOW_rule__ScopingView__Group__4__Impl_in_rule__ScopingView__Group__48842);
            rule__ScopingView__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScopingView__Group__5_in_rule__ScopingView__Group__48845);
            rule__ScopingView__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopingView__Group__4"


    // $ANTLR start "rule__ScopingView__Group__4__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4318:1: rule__ScopingView__Group__4__Impl : ( ( rule__ScopingView__ConfigAssignment_4 )? ) ;
    public final void rule__ScopingView__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4322:1: ( ( ( rule__ScopingView__ConfigAssignment_4 )? ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4323:1: ( ( rule__ScopingView__ConfigAssignment_4 )? )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4323:1: ( ( rule__ScopingView__ConfigAssignment_4 )? )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4324:1: ( rule__ScopingView__ConfigAssignment_4 )?
            {
             before(grammarAccess.getScopingViewAccess().getConfigAssignment_4()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4325:1: ( rule__ScopingView__ConfigAssignment_4 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==41) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4325:2: rule__ScopingView__ConfigAssignment_4
                    {
                    pushFollow(FOLLOW_rule__ScopingView__ConfigAssignment_4_in_rule__ScopingView__Group__4__Impl8872);
                    rule__ScopingView__ConfigAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScopingViewAccess().getConfigAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopingView__Group__4__Impl"


    // $ANTLR start "rule__ScopingView__Group__5"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4335:1: rule__ScopingView__Group__5 : rule__ScopingView__Group__5__Impl rule__ScopingView__Group__6 ;
    public final void rule__ScopingView__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4339:1: ( rule__ScopingView__Group__5__Impl rule__ScopingView__Group__6 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4340:2: rule__ScopingView__Group__5__Impl rule__ScopingView__Group__6
            {
            pushFollow(FOLLOW_rule__ScopingView__Group__5__Impl_in_rule__ScopingView__Group__58903);
            rule__ScopingView__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScopingView__Group__6_in_rule__ScopingView__Group__58906);
            rule__ScopingView__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopingView__Group__5"


    // $ANTLR start "rule__ScopingView__Group__5__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4347:1: rule__ScopingView__Group__5__Impl : ( ( rule__ScopingView__ProductsAssignment_5 )? ) ;
    public final void rule__ScopingView__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4351:1: ( ( ( rule__ScopingView__ProductsAssignment_5 )? ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4352:1: ( ( rule__ScopingView__ProductsAssignment_5 )? )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4352:1: ( ( rule__ScopingView__ProductsAssignment_5 )? )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4353:1: ( rule__ScopingView__ProductsAssignment_5 )?
            {
             before(grammarAccess.getScopingViewAccess().getProductsAssignment_5()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4354:1: ( rule__ScopingView__ProductsAssignment_5 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=55 && LA56_0<=56)) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4354:2: rule__ScopingView__ProductsAssignment_5
                    {
                    pushFollow(FOLLOW_rule__ScopingView__ProductsAssignment_5_in_rule__ScopingView__Group__5__Impl8933);
                    rule__ScopingView__ProductsAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScopingViewAccess().getProductsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopingView__Group__5__Impl"


    // $ANTLR start "rule__ScopingView__Group__6"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4364:1: rule__ScopingView__Group__6 : rule__ScopingView__Group__6__Impl rule__ScopingView__Group__7 ;
    public final void rule__ScopingView__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4368:1: ( rule__ScopingView__Group__6__Impl rule__ScopingView__Group__7 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4369:2: rule__ScopingView__Group__6__Impl rule__ScopingView__Group__7
            {
            pushFollow(FOLLOW_rule__ScopingView__Group__6__Impl_in_rule__ScopingView__Group__68964);
            rule__ScopingView__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScopingView__Group__7_in_rule__ScopingView__Group__68967);
            rule__ScopingView__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopingView__Group__6"


    // $ANTLR start "rule__ScopingView__Group__6__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4376:1: rule__ScopingView__Group__6__Impl : ( ( rule__ScopingView__FtsAssignment_6 )? ) ;
    public final void rule__ScopingView__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4380:1: ( ( ( rule__ScopingView__FtsAssignment_6 )? ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4381:1: ( ( rule__ScopingView__FtsAssignment_6 )? )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4381:1: ( ( rule__ScopingView__FtsAssignment_6 )? )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4382:1: ( rule__ScopingView__FtsAssignment_6 )?
            {
             before(grammarAccess.getScopingViewAccess().getFtsAssignment_6()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4383:1: ( rule__ScopingView__FtsAssignment_6 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=53 && LA57_0<=54)) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4383:2: rule__ScopingView__FtsAssignment_6
                    {
                    pushFollow(FOLLOW_rule__ScopingView__FtsAssignment_6_in_rule__ScopingView__Group__6__Impl8994);
                    rule__ScopingView__FtsAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScopingViewAccess().getFtsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopingView__Group__6__Impl"


    // $ANTLR start "rule__ScopingView__Group__7"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4393:1: rule__ScopingView__Group__7 : rule__ScopingView__Group__7__Impl rule__ScopingView__Group__8 ;
    public final void rule__ScopingView__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4397:1: ( rule__ScopingView__Group__7__Impl rule__ScopingView__Group__8 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4398:2: rule__ScopingView__Group__7__Impl rule__ScopingView__Group__8
            {
            pushFollow(FOLLOW_rule__ScopingView__Group__7__Impl_in_rule__ScopingView__Group__79025);
            rule__ScopingView__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ScopingView__Group__8_in_rule__ScopingView__Group__79028);
            rule__ScopingView__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopingView__Group__7"


    // $ANTLR start "rule__ScopingView__Group__7__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4405:1: rule__ScopingView__Group__7__Impl : ( ( rule__ScopingView__AlignmentAssignment_7 )? ) ;
    public final void rule__ScopingView__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4409:1: ( ( ( rule__ScopingView__AlignmentAssignment_7 )? ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4410:1: ( ( rule__ScopingView__AlignmentAssignment_7 )? )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4410:1: ( ( rule__ScopingView__AlignmentAssignment_7 )? )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4411:1: ( rule__ScopingView__AlignmentAssignment_7 )?
            {
             before(grammarAccess.getScopingViewAccess().getAlignmentAssignment_7()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4412:1: ( rule__ScopingView__AlignmentAssignment_7 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=18 && LA58_0<=19)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4412:2: rule__ScopingView__AlignmentAssignment_7
                    {
                    pushFollow(FOLLOW_rule__ScopingView__AlignmentAssignment_7_in_rule__ScopingView__Group__7__Impl9055);
                    rule__ScopingView__AlignmentAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScopingViewAccess().getAlignmentAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopingView__Group__7__Impl"


    // $ANTLR start "rule__ScopingView__Group__8"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4422:1: rule__ScopingView__Group__8 : rule__ScopingView__Group__8__Impl ;
    public final void rule__ScopingView__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4426:1: ( rule__ScopingView__Group__8__Impl )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4427:2: rule__ScopingView__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__ScopingView__Group__8__Impl_in_rule__ScopingView__Group__89086);
            rule__ScopingView__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopingView__Group__8"


    // $ANTLR start "rule__ScopingView__Group__8__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4433:1: rule__ScopingView__Group__8__Impl : ( ( rule__ScopingView__InterpretationAssignment_8 )? ) ;
    public final void rule__ScopingView__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4437:1: ( ( ( rule__ScopingView__InterpretationAssignment_8 )? ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4438:1: ( ( rule__ScopingView__InterpretationAssignment_8 )? )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4438:1: ( ( rule__ScopingView__InterpretationAssignment_8 )? )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4439:1: ( rule__ScopingView__InterpretationAssignment_8 )?
            {
             before(grammarAccess.getScopingViewAccess().getInterpretationAssignment_8()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4440:1: ( rule__ScopingView__InterpretationAssignment_8 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==58) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4440:2: rule__ScopingView__InterpretationAssignment_8
                    {
                    pushFollow(FOLLOW_rule__ScopingView__InterpretationAssignment_8_in_rule__ScopingView__Group__8__Impl9113);
                    rule__ScopingView__InterpretationAssignment_8();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getScopingViewAccess().getInterpretationAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopingView__Group__8__Impl"


    // $ANTLR start "rule__ViewName__Group__0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4468:1: rule__ViewName__Group__0 : rule__ViewName__Group__0__Impl rule__ViewName__Group__1 ;
    public final void rule__ViewName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4472:1: ( rule__ViewName__Group__0__Impl rule__ViewName__Group__1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4473:2: rule__ViewName__Group__0__Impl rule__ViewName__Group__1
            {
            pushFollow(FOLLOW_rule__ViewName__Group__0__Impl_in_rule__ViewName__Group__09162);
            rule__ViewName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ViewName__Group__1_in_rule__ViewName__Group__09165);
            rule__ViewName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewName__Group__0"


    // $ANTLR start "rule__ViewName__Group__0__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4480:1: rule__ViewName__Group__0__Impl : ( 'rootname:' ) ;
    public final void rule__ViewName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4484:1: ( ( 'rootname:' ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4485:1: ( 'rootname:' )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4485:1: ( 'rootname:' )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4486:1: 'rootname:'
            {
             before(grammarAccess.getViewNameAccess().getRootnameKeyword_0()); 
            match(input,52,FOLLOW_52_in_rule__ViewName__Group__0__Impl9193); 
             after(grammarAccess.getViewNameAccess().getRootnameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewName__Group__0__Impl"


    // $ANTLR start "rule__ViewName__Group__1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4499:1: rule__ViewName__Group__1 : rule__ViewName__Group__1__Impl ;
    public final void rule__ViewName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4503:1: ( rule__ViewName__Group__1__Impl )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4504:2: rule__ViewName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ViewName__Group__1__Impl_in_rule__ViewName__Group__19224);
            rule__ViewName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewName__Group__1"


    // $ANTLR start "rule__ViewName__Group__1__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4510:1: rule__ViewName__Group__1__Impl : ( ( rule__ViewName__NameAssignment_1 ) ) ;
    public final void rule__ViewName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4514:1: ( ( ( rule__ViewName__NameAssignment_1 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4515:1: ( ( rule__ViewName__NameAssignment_1 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4515:1: ( ( rule__ViewName__NameAssignment_1 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4516:1: ( rule__ViewName__NameAssignment_1 )
            {
             before(grammarAccess.getViewNameAccess().getNameAssignment_1()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4517:1: ( rule__ViewName__NameAssignment_1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4517:2: rule__ViewName__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ViewName__NameAssignment_1_in_rule__ViewName__Group__1__Impl9251);
            rule__ViewName__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getViewNameAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewName__Group__1__Impl"


    // $ANTLR start "rule__ExceptFeature__Group__0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4531:1: rule__ExceptFeature__Group__0 : rule__ExceptFeature__Group__0__Impl rule__ExceptFeature__Group__1 ;
    public final void rule__ExceptFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4535:1: ( rule__ExceptFeature__Group__0__Impl rule__ExceptFeature__Group__1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4536:2: rule__ExceptFeature__Group__0__Impl rule__ExceptFeature__Group__1
            {
            pushFollow(FOLLOW_rule__ExceptFeature__Group__0__Impl_in_rule__ExceptFeature__Group__09285);
            rule__ExceptFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExceptFeature__Group__1_in_rule__ExceptFeature__Group__09288);
            rule__ExceptFeature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptFeature__Group__0"


    // $ANTLR start "rule__ExceptFeature__Group__0__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4543:1: rule__ExceptFeature__Group__0__Impl : ( 'except_features:' ) ;
    public final void rule__ExceptFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4547:1: ( ( 'except_features:' ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4548:1: ( 'except_features:' )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4548:1: ( 'except_features:' )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4549:1: 'except_features:'
            {
             before(grammarAccess.getExceptFeatureAccess().getExcept_featuresKeyword_0()); 
            match(input,53,FOLLOW_53_in_rule__ExceptFeature__Group__0__Impl9316); 
             after(grammarAccess.getExceptFeatureAccess().getExcept_featuresKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptFeature__Group__0__Impl"


    // $ANTLR start "rule__ExceptFeature__Group__1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4562:1: rule__ExceptFeature__Group__1 : rule__ExceptFeature__Group__1__Impl ;
    public final void rule__ExceptFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4566:1: ( rule__ExceptFeature__Group__1__Impl )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4567:2: rule__ExceptFeature__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExceptFeature__Group__1__Impl_in_rule__ExceptFeature__Group__19347);
            rule__ExceptFeature__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptFeature__Group__1"


    // $ANTLR start "rule__ExceptFeature__Group__1__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4573:1: rule__ExceptFeature__Group__1__Impl : ( ( ( rule__ExceptFeature__FtsAssignment_1 ) ) ( ( rule__ExceptFeature__FtsAssignment_1 )* ) ) ;
    public final void rule__ExceptFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4577:1: ( ( ( ( rule__ExceptFeature__FtsAssignment_1 ) ) ( ( rule__ExceptFeature__FtsAssignment_1 )* ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4578:1: ( ( ( rule__ExceptFeature__FtsAssignment_1 ) ) ( ( rule__ExceptFeature__FtsAssignment_1 )* ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4578:1: ( ( ( rule__ExceptFeature__FtsAssignment_1 ) ) ( ( rule__ExceptFeature__FtsAssignment_1 )* ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4579:1: ( ( rule__ExceptFeature__FtsAssignment_1 ) ) ( ( rule__ExceptFeature__FtsAssignment_1 )* )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4579:1: ( ( rule__ExceptFeature__FtsAssignment_1 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4580:1: ( rule__ExceptFeature__FtsAssignment_1 )
            {
             before(grammarAccess.getExceptFeatureAccess().getFtsAssignment_1()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4581:1: ( rule__ExceptFeature__FtsAssignment_1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4581:2: rule__ExceptFeature__FtsAssignment_1
            {
            pushFollow(FOLLOW_rule__ExceptFeature__FtsAssignment_1_in_rule__ExceptFeature__Group__1__Impl9376);
            rule__ExceptFeature__FtsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExceptFeatureAccess().getFtsAssignment_1()); 

            }

            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4584:1: ( ( rule__ExceptFeature__FtsAssignment_1 )* )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4585:1: ( rule__ExceptFeature__FtsAssignment_1 )*
            {
             before(grammarAccess.getExceptFeatureAccess().getFtsAssignment_1()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4586:1: ( rule__ExceptFeature__FtsAssignment_1 )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( ((LA60_0>=RULE_STRING && LA60_0<=RULE_ID)) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4586:2: rule__ExceptFeature__FtsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__ExceptFeature__FtsAssignment_1_in_rule__ExceptFeature__Group__1__Impl9388);
            	    rule__ExceptFeature__FtsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

             after(grammarAccess.getExceptFeatureAccess().getFtsAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptFeature__Group__1__Impl"


    // $ANTLR start "rule__OnlyFeature__Group__0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4601:1: rule__OnlyFeature__Group__0 : rule__OnlyFeature__Group__0__Impl rule__OnlyFeature__Group__1 ;
    public final void rule__OnlyFeature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4605:1: ( rule__OnlyFeature__Group__0__Impl rule__OnlyFeature__Group__1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4606:2: rule__OnlyFeature__Group__0__Impl rule__OnlyFeature__Group__1
            {
            pushFollow(FOLLOW_rule__OnlyFeature__Group__0__Impl_in_rule__OnlyFeature__Group__09425);
            rule__OnlyFeature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OnlyFeature__Group__1_in_rule__OnlyFeature__Group__09428);
            rule__OnlyFeature__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnlyFeature__Group__0"


    // $ANTLR start "rule__OnlyFeature__Group__0__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4613:1: rule__OnlyFeature__Group__0__Impl : ( 'only_features:' ) ;
    public final void rule__OnlyFeature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4617:1: ( ( 'only_features:' ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4618:1: ( 'only_features:' )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4618:1: ( 'only_features:' )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4619:1: 'only_features:'
            {
             before(grammarAccess.getOnlyFeatureAccess().getOnly_featuresKeyword_0()); 
            match(input,54,FOLLOW_54_in_rule__OnlyFeature__Group__0__Impl9456); 
             after(grammarAccess.getOnlyFeatureAccess().getOnly_featuresKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnlyFeature__Group__0__Impl"


    // $ANTLR start "rule__OnlyFeature__Group__1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4632:1: rule__OnlyFeature__Group__1 : rule__OnlyFeature__Group__1__Impl ;
    public final void rule__OnlyFeature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4636:1: ( rule__OnlyFeature__Group__1__Impl )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4637:2: rule__OnlyFeature__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OnlyFeature__Group__1__Impl_in_rule__OnlyFeature__Group__19487);
            rule__OnlyFeature__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnlyFeature__Group__1"


    // $ANTLR start "rule__OnlyFeature__Group__1__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4643:1: rule__OnlyFeature__Group__1__Impl : ( ( ( rule__OnlyFeature__FtsAssignment_1 ) ) ( ( rule__OnlyFeature__FtsAssignment_1 )* ) ) ;
    public final void rule__OnlyFeature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4647:1: ( ( ( ( rule__OnlyFeature__FtsAssignment_1 ) ) ( ( rule__OnlyFeature__FtsAssignment_1 )* ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4648:1: ( ( ( rule__OnlyFeature__FtsAssignment_1 ) ) ( ( rule__OnlyFeature__FtsAssignment_1 )* ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4648:1: ( ( ( rule__OnlyFeature__FtsAssignment_1 ) ) ( ( rule__OnlyFeature__FtsAssignment_1 )* ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4649:1: ( ( rule__OnlyFeature__FtsAssignment_1 ) ) ( ( rule__OnlyFeature__FtsAssignment_1 )* )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4649:1: ( ( rule__OnlyFeature__FtsAssignment_1 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4650:1: ( rule__OnlyFeature__FtsAssignment_1 )
            {
             before(grammarAccess.getOnlyFeatureAccess().getFtsAssignment_1()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4651:1: ( rule__OnlyFeature__FtsAssignment_1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4651:2: rule__OnlyFeature__FtsAssignment_1
            {
            pushFollow(FOLLOW_rule__OnlyFeature__FtsAssignment_1_in_rule__OnlyFeature__Group__1__Impl9516);
            rule__OnlyFeature__FtsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOnlyFeatureAccess().getFtsAssignment_1()); 

            }

            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4654:1: ( ( rule__OnlyFeature__FtsAssignment_1 )* )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4655:1: ( rule__OnlyFeature__FtsAssignment_1 )*
            {
             before(grammarAccess.getOnlyFeatureAccess().getFtsAssignment_1()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4656:1: ( rule__OnlyFeature__FtsAssignment_1 )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( ((LA61_0>=RULE_STRING && LA61_0<=RULE_ID)) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4656:2: rule__OnlyFeature__FtsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__OnlyFeature__FtsAssignment_1_in_rule__OnlyFeature__Group__1__Impl9528);
            	    rule__OnlyFeature__FtsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

             after(grammarAccess.getOnlyFeatureAccess().getFtsAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnlyFeature__Group__1__Impl"


    // $ANTLR start "rule__ExceptProduct__Group__0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4671:1: rule__ExceptProduct__Group__0 : rule__ExceptProduct__Group__0__Impl rule__ExceptProduct__Group__1 ;
    public final void rule__ExceptProduct__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4675:1: ( rule__ExceptProduct__Group__0__Impl rule__ExceptProduct__Group__1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4676:2: rule__ExceptProduct__Group__0__Impl rule__ExceptProduct__Group__1
            {
            pushFollow(FOLLOW_rule__ExceptProduct__Group__0__Impl_in_rule__ExceptProduct__Group__09565);
            rule__ExceptProduct__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ExceptProduct__Group__1_in_rule__ExceptProduct__Group__09568);
            rule__ExceptProduct__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptProduct__Group__0"


    // $ANTLR start "rule__ExceptProduct__Group__0__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4683:1: rule__ExceptProduct__Group__0__Impl : ( 'except_products:' ) ;
    public final void rule__ExceptProduct__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4687:1: ( ( 'except_products:' ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4688:1: ( 'except_products:' )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4688:1: ( 'except_products:' )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4689:1: 'except_products:'
            {
             before(grammarAccess.getExceptProductAccess().getExcept_productsKeyword_0()); 
            match(input,55,FOLLOW_55_in_rule__ExceptProduct__Group__0__Impl9596); 
             after(grammarAccess.getExceptProductAccess().getExcept_productsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptProduct__Group__0__Impl"


    // $ANTLR start "rule__ExceptProduct__Group__1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4702:1: rule__ExceptProduct__Group__1 : rule__ExceptProduct__Group__1__Impl ;
    public final void rule__ExceptProduct__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4706:1: ( rule__ExceptProduct__Group__1__Impl )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4707:2: rule__ExceptProduct__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExceptProduct__Group__1__Impl_in_rule__ExceptProduct__Group__19627);
            rule__ExceptProduct__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptProduct__Group__1"


    // $ANTLR start "rule__ExceptProduct__Group__1__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4713:1: rule__ExceptProduct__Group__1__Impl : ( ( ( rule__ExceptProduct__PdsAssignment_1 ) ) ( ( rule__ExceptProduct__PdsAssignment_1 )* ) ) ;
    public final void rule__ExceptProduct__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4717:1: ( ( ( ( rule__ExceptProduct__PdsAssignment_1 ) ) ( ( rule__ExceptProduct__PdsAssignment_1 )* ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4718:1: ( ( ( rule__ExceptProduct__PdsAssignment_1 ) ) ( ( rule__ExceptProduct__PdsAssignment_1 )* ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4718:1: ( ( ( rule__ExceptProduct__PdsAssignment_1 ) ) ( ( rule__ExceptProduct__PdsAssignment_1 )* ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4719:1: ( ( rule__ExceptProduct__PdsAssignment_1 ) ) ( ( rule__ExceptProduct__PdsAssignment_1 )* )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4719:1: ( ( rule__ExceptProduct__PdsAssignment_1 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4720:1: ( rule__ExceptProduct__PdsAssignment_1 )
            {
             before(grammarAccess.getExceptProductAccess().getPdsAssignment_1()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4721:1: ( rule__ExceptProduct__PdsAssignment_1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4721:2: rule__ExceptProduct__PdsAssignment_1
            {
            pushFollow(FOLLOW_rule__ExceptProduct__PdsAssignment_1_in_rule__ExceptProduct__Group__1__Impl9656);
            rule__ExceptProduct__PdsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getExceptProductAccess().getPdsAssignment_1()); 

            }

            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4724:1: ( ( rule__ExceptProduct__PdsAssignment_1 )* )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4725:1: ( rule__ExceptProduct__PdsAssignment_1 )*
            {
             before(grammarAccess.getExceptProductAccess().getPdsAssignment_1()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4726:1: ( rule__ExceptProduct__PdsAssignment_1 )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( ((LA62_0>=RULE_STRING && LA62_0<=RULE_ID)) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4726:2: rule__ExceptProduct__PdsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__ExceptProduct__PdsAssignment_1_in_rule__ExceptProduct__Group__1__Impl9668);
            	    rule__ExceptProduct__PdsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

             after(grammarAccess.getExceptProductAccess().getPdsAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptProduct__Group__1__Impl"


    // $ANTLR start "rule__OnlyProduct__Group__0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4741:1: rule__OnlyProduct__Group__0 : rule__OnlyProduct__Group__0__Impl rule__OnlyProduct__Group__1 ;
    public final void rule__OnlyProduct__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4745:1: ( rule__OnlyProduct__Group__0__Impl rule__OnlyProduct__Group__1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4746:2: rule__OnlyProduct__Group__0__Impl rule__OnlyProduct__Group__1
            {
            pushFollow(FOLLOW_rule__OnlyProduct__Group__0__Impl_in_rule__OnlyProduct__Group__09705);
            rule__OnlyProduct__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__OnlyProduct__Group__1_in_rule__OnlyProduct__Group__09708);
            rule__OnlyProduct__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnlyProduct__Group__0"


    // $ANTLR start "rule__OnlyProduct__Group__0__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4753:1: rule__OnlyProduct__Group__0__Impl : ( 'only_products:' ) ;
    public final void rule__OnlyProduct__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4757:1: ( ( 'only_products:' ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4758:1: ( 'only_products:' )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4758:1: ( 'only_products:' )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4759:1: 'only_products:'
            {
             before(grammarAccess.getOnlyProductAccess().getOnly_productsKeyword_0()); 
            match(input,56,FOLLOW_56_in_rule__OnlyProduct__Group__0__Impl9736); 
             after(grammarAccess.getOnlyProductAccess().getOnly_productsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnlyProduct__Group__0__Impl"


    // $ANTLR start "rule__OnlyProduct__Group__1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4772:1: rule__OnlyProduct__Group__1 : rule__OnlyProduct__Group__1__Impl ;
    public final void rule__OnlyProduct__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4776:1: ( rule__OnlyProduct__Group__1__Impl )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4777:2: rule__OnlyProduct__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OnlyProduct__Group__1__Impl_in_rule__OnlyProduct__Group__19767);
            rule__OnlyProduct__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnlyProduct__Group__1"


    // $ANTLR start "rule__OnlyProduct__Group__1__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4783:1: rule__OnlyProduct__Group__1__Impl : ( ( ( rule__OnlyProduct__PdsAssignment_1 ) ) ( ( rule__OnlyProduct__PdsAssignment_1 )* ) ) ;
    public final void rule__OnlyProduct__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4787:1: ( ( ( ( rule__OnlyProduct__PdsAssignment_1 ) ) ( ( rule__OnlyProduct__PdsAssignment_1 )* ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4788:1: ( ( ( rule__OnlyProduct__PdsAssignment_1 ) ) ( ( rule__OnlyProduct__PdsAssignment_1 )* ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4788:1: ( ( ( rule__OnlyProduct__PdsAssignment_1 ) ) ( ( rule__OnlyProduct__PdsAssignment_1 )* ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4789:1: ( ( rule__OnlyProduct__PdsAssignment_1 ) ) ( ( rule__OnlyProduct__PdsAssignment_1 )* )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4789:1: ( ( rule__OnlyProduct__PdsAssignment_1 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4790:1: ( rule__OnlyProduct__PdsAssignment_1 )
            {
             before(grammarAccess.getOnlyProductAccess().getPdsAssignment_1()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4791:1: ( rule__OnlyProduct__PdsAssignment_1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4791:2: rule__OnlyProduct__PdsAssignment_1
            {
            pushFollow(FOLLOW_rule__OnlyProduct__PdsAssignment_1_in_rule__OnlyProduct__Group__1__Impl9796);
            rule__OnlyProduct__PdsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOnlyProductAccess().getPdsAssignment_1()); 

            }

            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4794:1: ( ( rule__OnlyProduct__PdsAssignment_1 )* )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4795:1: ( rule__OnlyProduct__PdsAssignment_1 )*
            {
             before(grammarAccess.getOnlyProductAccess().getPdsAssignment_1()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4796:1: ( rule__OnlyProduct__PdsAssignment_1 )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( ((LA63_0>=RULE_STRING && LA63_0<=RULE_ID)) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4796:2: rule__OnlyProduct__PdsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__OnlyProduct__PdsAssignment_1_in_rule__OnlyProduct__Group__1__Impl9808);
            	    rule__OnlyProduct__PdsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

             after(grammarAccess.getOnlyProductAccess().getPdsAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnlyProduct__Group__1__Impl"


    // $ANTLR start "rule__Rewriting__Group__0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4811:1: rule__Rewriting__Group__0 : rule__Rewriting__Group__0__Impl rule__Rewriting__Group__1 ;
    public final void rule__Rewriting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4815:1: ( rule__Rewriting__Group__0__Impl rule__Rewriting__Group__1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4816:2: rule__Rewriting__Group__0__Impl rule__Rewriting__Group__1
            {
            pushFollow(FOLLOW_rule__Rewriting__Group__0__Impl_in_rule__Rewriting__Group__09845);
            rule__Rewriting__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rewriting__Group__1_in_rule__Rewriting__Group__09848);
            rule__Rewriting__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rewriting__Group__0"


    // $ANTLR start "rule__Rewriting__Group__0__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4823:1: rule__Rewriting__Group__0__Impl : ( ( rule__Rewriting__Alternatives_0 ) ) ;
    public final void rule__Rewriting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4827:1: ( ( ( rule__Rewriting__Alternatives_0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4828:1: ( ( rule__Rewriting__Alternatives_0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4828:1: ( ( rule__Rewriting__Alternatives_0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4829:1: ( rule__Rewriting__Alternatives_0 )
            {
             before(grammarAccess.getRewritingAccess().getAlternatives_0()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4830:1: ( rule__Rewriting__Alternatives_0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4830:2: rule__Rewriting__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Rewriting__Alternatives_0_in_rule__Rewriting__Group__0__Impl9875);
            rule__Rewriting__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getRewritingAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rewriting__Group__0__Impl"


    // $ANTLR start "rule__Rewriting__Group__1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4840:1: rule__Rewriting__Group__1 : rule__Rewriting__Group__1__Impl rule__Rewriting__Group__2 ;
    public final void rule__Rewriting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4844:1: ( rule__Rewriting__Group__1__Impl rule__Rewriting__Group__2 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4845:2: rule__Rewriting__Group__1__Impl rule__Rewriting__Group__2
            {
            pushFollow(FOLLOW_rule__Rewriting__Group__1__Impl_in_rule__Rewriting__Group__19905);
            rule__Rewriting__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rewriting__Group__2_in_rule__Rewriting__Group__19908);
            rule__Rewriting__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rewriting__Group__1"


    // $ANTLR start "rule__Rewriting__Group__1__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4852:1: rule__Rewriting__Group__1__Impl : ( ( rule__Rewriting__OftAssignment_1 ) ) ;
    public final void rule__Rewriting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4856:1: ( ( ( rule__Rewriting__OftAssignment_1 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4857:1: ( ( rule__Rewriting__OftAssignment_1 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4857:1: ( ( rule__Rewriting__OftAssignment_1 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4858:1: ( rule__Rewriting__OftAssignment_1 )
            {
             before(grammarAccess.getRewritingAccess().getOftAssignment_1()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4859:1: ( rule__Rewriting__OftAssignment_1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4859:2: rule__Rewriting__OftAssignment_1
            {
            pushFollow(FOLLOW_rule__Rewriting__OftAssignment_1_in_rule__Rewriting__Group__1__Impl9935);
            rule__Rewriting__OftAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRewritingAccess().getOftAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rewriting__Group__1__Impl"


    // $ANTLR start "rule__Rewriting__Group__2"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4869:1: rule__Rewriting__Group__2 : rule__Rewriting__Group__2__Impl rule__Rewriting__Group__3 ;
    public final void rule__Rewriting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4873:1: ( rule__Rewriting__Group__2__Impl rule__Rewriting__Group__3 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4874:2: rule__Rewriting__Group__2__Impl rule__Rewriting__Group__3
            {
            pushFollow(FOLLOW_rule__Rewriting__Group__2__Impl_in_rule__Rewriting__Group__29965);
            rule__Rewriting__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rewriting__Group__3_in_rule__Rewriting__Group__29968);
            rule__Rewriting__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rewriting__Group__2"


    // $ANTLR start "rule__Rewriting__Group__2__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4881:1: rule__Rewriting__Group__2__Impl : ( '=>' ) ;
    public final void rule__Rewriting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4885:1: ( ( '=>' ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4886:1: ( '=>' )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4886:1: ( '=>' )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4887:1: '=>'
            {
             before(grammarAccess.getRewritingAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            match(input,57,FOLLOW_57_in_rule__Rewriting__Group__2__Impl9996); 
             after(grammarAccess.getRewritingAccess().getEqualsSignGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rewriting__Group__2__Impl"


    // $ANTLR start "rule__Rewriting__Group__3"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4900:1: rule__Rewriting__Group__3 : rule__Rewriting__Group__3__Impl ;
    public final void rule__Rewriting__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4904:1: ( rule__Rewriting__Group__3__Impl )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4905:2: rule__Rewriting__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Rewriting__Group__3__Impl_in_rule__Rewriting__Group__310027);
            rule__Rewriting__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rewriting__Group__3"


    // $ANTLR start "rule__Rewriting__Group__3__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4911:1: rule__Rewriting__Group__3__Impl : ( ( rule__Rewriting__NftAssignment_3 ) ) ;
    public final void rule__Rewriting__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4915:1: ( ( ( rule__Rewriting__NftAssignment_3 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4916:1: ( ( rule__Rewriting__NftAssignment_3 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4916:1: ( ( rule__Rewriting__NftAssignment_3 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4917:1: ( rule__Rewriting__NftAssignment_3 )
            {
             before(grammarAccess.getRewritingAccess().getNftAssignment_3()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4918:1: ( rule__Rewriting__NftAssignment_3 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4918:2: rule__Rewriting__NftAssignment_3
            {
            pushFollow(FOLLOW_rule__Rewriting__NftAssignment_3_in_rule__Rewriting__Group__3__Impl10054);
            rule__Rewriting__NftAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRewritingAccess().getNftAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rewriting__Group__3__Impl"


    // $ANTLR start "rule__MultiValuesInterpretation__Group__0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4936:1: rule__MultiValuesInterpretation__Group__0 : rule__MultiValuesInterpretation__Group__0__Impl rule__MultiValuesInterpretation__Group__1 ;
    public final void rule__MultiValuesInterpretation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4940:1: ( rule__MultiValuesInterpretation__Group__0__Impl rule__MultiValuesInterpretation__Group__1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4941:2: rule__MultiValuesInterpretation__Group__0__Impl rule__MultiValuesInterpretation__Group__1
            {
            pushFollow(FOLLOW_rule__MultiValuesInterpretation__Group__0__Impl_in_rule__MultiValuesInterpretation__Group__010092);
            rule__MultiValuesInterpretation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiValuesInterpretation__Group__1_in_rule__MultiValuesInterpretation__Group__010095);
            rule__MultiValuesInterpretation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiValuesInterpretation__Group__0"


    // $ANTLR start "rule__MultiValuesInterpretation__Group__0__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4948:1: rule__MultiValuesInterpretation__Group__0__Impl : ( 'multivalues:' ) ;
    public final void rule__MultiValuesInterpretation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4952:1: ( ( 'multivalues:' ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4953:1: ( 'multivalues:' )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4953:1: ( 'multivalues:' )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4954:1: 'multivalues:'
            {
             before(grammarAccess.getMultiValuesInterpretationAccess().getMultivaluesKeyword_0()); 
            match(input,58,FOLLOW_58_in_rule__MultiValuesInterpretation__Group__0__Impl10123); 
             after(grammarAccess.getMultiValuesInterpretationAccess().getMultivaluesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiValuesInterpretation__Group__0__Impl"


    // $ANTLR start "rule__MultiValuesInterpretation__Group__1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4967:1: rule__MultiValuesInterpretation__Group__1 : rule__MultiValuesInterpretation__Group__1__Impl ;
    public final void rule__MultiValuesInterpretation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4971:1: ( rule__MultiValuesInterpretation__Group__1__Impl )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4972:2: rule__MultiValuesInterpretation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__MultiValuesInterpretation__Group__1__Impl_in_rule__MultiValuesInterpretation__Group__110154);
            rule__MultiValuesInterpretation__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiValuesInterpretation__Group__1"


    // $ANTLR start "rule__MultiValuesInterpretation__Group__1__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4978:1: rule__MultiValuesInterpretation__Group__1__Impl : ( ( ( rule__MultiValuesInterpretation__MultiAssignment_1 ) ) ( ( rule__MultiValuesInterpretation__MultiAssignment_1 )* ) ) ;
    public final void rule__MultiValuesInterpretation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4982:1: ( ( ( ( rule__MultiValuesInterpretation__MultiAssignment_1 ) ) ( ( rule__MultiValuesInterpretation__MultiAssignment_1 )* ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4983:1: ( ( ( rule__MultiValuesInterpretation__MultiAssignment_1 ) ) ( ( rule__MultiValuesInterpretation__MultiAssignment_1 )* ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4983:1: ( ( ( rule__MultiValuesInterpretation__MultiAssignment_1 ) ) ( ( rule__MultiValuesInterpretation__MultiAssignment_1 )* ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4984:1: ( ( rule__MultiValuesInterpretation__MultiAssignment_1 ) ) ( ( rule__MultiValuesInterpretation__MultiAssignment_1 )* )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4984:1: ( ( rule__MultiValuesInterpretation__MultiAssignment_1 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4985:1: ( rule__MultiValuesInterpretation__MultiAssignment_1 )
            {
             before(grammarAccess.getMultiValuesInterpretationAccess().getMultiAssignment_1()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4986:1: ( rule__MultiValuesInterpretation__MultiAssignment_1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4986:2: rule__MultiValuesInterpretation__MultiAssignment_1
            {
            pushFollow(FOLLOW_rule__MultiValuesInterpretation__MultiAssignment_1_in_rule__MultiValuesInterpretation__Group__1__Impl10183);
            rule__MultiValuesInterpretation__MultiAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMultiValuesInterpretationAccess().getMultiAssignment_1()); 

            }

            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4989:1: ( ( rule__MultiValuesInterpretation__MultiAssignment_1 )* )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4990:1: ( rule__MultiValuesInterpretation__MultiAssignment_1 )*
            {
             before(grammarAccess.getMultiValuesInterpretationAccess().getMultiAssignment_1()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4991:1: ( rule__MultiValuesInterpretation__MultiAssignment_1 )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( ((LA64_0>=RULE_STRING && LA64_0<=RULE_ID)) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:4991:2: rule__MultiValuesInterpretation__MultiAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__MultiValuesInterpretation__MultiAssignment_1_in_rule__MultiValuesInterpretation__Group__1__Impl10195);
            	    rule__MultiValuesInterpretation__MultiAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);

             after(grammarAccess.getMultiValuesInterpretationAccess().getMultiAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiValuesInterpretation__Group__1__Impl"


    // $ANTLR start "rule__MultiValueInterpretation__Group__0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5006:1: rule__MultiValueInterpretation__Group__0 : rule__MultiValueInterpretation__Group__0__Impl rule__MultiValueInterpretation__Group__1 ;
    public final void rule__MultiValueInterpretation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5010:1: ( rule__MultiValueInterpretation__Group__0__Impl rule__MultiValueInterpretation__Group__1 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5011:2: rule__MultiValueInterpretation__Group__0__Impl rule__MultiValueInterpretation__Group__1
            {
            pushFollow(FOLLOW_rule__MultiValueInterpretation__Group__0__Impl_in_rule__MultiValueInterpretation__Group__010232);
            rule__MultiValueInterpretation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiValueInterpretation__Group__1_in_rule__MultiValueInterpretation__Group__010235);
            rule__MultiValueInterpretation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiValueInterpretation__Group__0"


    // $ANTLR start "rule__MultiValueInterpretation__Group__0__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5018:1: rule__MultiValueInterpretation__Group__0__Impl : ( ( rule__MultiValueInterpretation__ValAssignment_0 ) ) ;
    public final void rule__MultiValueInterpretation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5022:1: ( ( ( rule__MultiValueInterpretation__ValAssignment_0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5023:1: ( ( rule__MultiValueInterpretation__ValAssignment_0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5023:1: ( ( rule__MultiValueInterpretation__ValAssignment_0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5024:1: ( rule__MultiValueInterpretation__ValAssignment_0 )
            {
             before(grammarAccess.getMultiValueInterpretationAccess().getValAssignment_0()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5025:1: ( rule__MultiValueInterpretation__ValAssignment_0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5025:2: rule__MultiValueInterpretation__ValAssignment_0
            {
            pushFollow(FOLLOW_rule__MultiValueInterpretation__ValAssignment_0_in_rule__MultiValueInterpretation__Group__0__Impl10262);
            rule__MultiValueInterpretation__ValAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiValueInterpretationAccess().getValAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiValueInterpretation__Group__0__Impl"


    // $ANTLR start "rule__MultiValueInterpretation__Group__1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5035:1: rule__MultiValueInterpretation__Group__1 : rule__MultiValueInterpretation__Group__1__Impl rule__MultiValueInterpretation__Group__2 ;
    public final void rule__MultiValueInterpretation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5039:1: ( rule__MultiValueInterpretation__Group__1__Impl rule__MultiValueInterpretation__Group__2 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5040:2: rule__MultiValueInterpretation__Group__1__Impl rule__MultiValueInterpretation__Group__2
            {
            pushFollow(FOLLOW_rule__MultiValueInterpretation__Group__1__Impl_in_rule__MultiValueInterpretation__Group__110292);
            rule__MultiValueInterpretation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__MultiValueInterpretation__Group__2_in_rule__MultiValueInterpretation__Group__110295);
            rule__MultiValueInterpretation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiValueInterpretation__Group__1"


    // $ANTLR start "rule__MultiValueInterpretation__Group__1__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5047:1: rule__MultiValueInterpretation__Group__1__Impl : ( '=>' ) ;
    public final void rule__MultiValueInterpretation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5051:1: ( ( '=>' ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5052:1: ( '=>' )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5052:1: ( '=>' )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5053:1: '=>'
            {
             before(grammarAccess.getMultiValueInterpretationAccess().getEqualsSignGreaterThanSignKeyword_1()); 
            match(input,57,FOLLOW_57_in_rule__MultiValueInterpretation__Group__1__Impl10323); 
             after(grammarAccess.getMultiValueInterpretationAccess().getEqualsSignGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiValueInterpretation__Group__1__Impl"


    // $ANTLR start "rule__MultiValueInterpretation__Group__2"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5066:1: rule__MultiValueInterpretation__Group__2 : rule__MultiValueInterpretation__Group__2__Impl ;
    public final void rule__MultiValueInterpretation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5070:1: ( rule__MultiValueInterpretation__Group__2__Impl )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5071:2: rule__MultiValueInterpretation__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__MultiValueInterpretation__Group__2__Impl_in_rule__MultiValueInterpretation__Group__210354);
            rule__MultiValueInterpretation__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiValueInterpretation__Group__2"


    // $ANTLR start "rule__MultiValueInterpretation__Group__2__Impl"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5077:1: rule__MultiValueInterpretation__Group__2__Impl : ( ( rule__MultiValueInterpretation__VariabilityAssignment_2 ) ) ;
    public final void rule__MultiValueInterpretation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5081:1: ( ( ( rule__MultiValueInterpretation__VariabilityAssignment_2 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5082:1: ( ( rule__MultiValueInterpretation__VariabilityAssignment_2 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5082:1: ( ( rule__MultiValueInterpretation__VariabilityAssignment_2 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5083:1: ( rule__MultiValueInterpretation__VariabilityAssignment_2 )
            {
             before(grammarAccess.getMultiValueInterpretationAccess().getVariabilityAssignment_2()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5084:1: ( rule__MultiValueInterpretation__VariabilityAssignment_2 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5084:2: rule__MultiValueInterpretation__VariabilityAssignment_2
            {
            pushFollow(FOLLOW_rule__MultiValueInterpretation__VariabilityAssignment_2_in_rule__MultiValueInterpretation__Group__2__Impl10381);
            rule__MultiValueInterpretation__VariabilityAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiValueInterpretationAccess().getVariabilityAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiValueInterpretation__Group__2__Impl"


    // $ANTLR start "rule__SToFMModel__ImportViewsAssignment_0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5101:1: rule__SToFMModel__ImportViewsAssignment_0 : ( ruleImportViews ) ;
    public final void rule__SToFMModel__ImportViewsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5105:1: ( ( ruleImportViews ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5106:1: ( ruleImportViews )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5106:1: ( ruleImportViews )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5107:1: ruleImportViews
            {
             before(grammarAccess.getSToFMModelAccess().getImportViewsImportViewsParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImportViews_in_rule__SToFMModel__ImportViewsAssignment_010422);
            ruleImportViews();

            state._fsp--;

             after(grammarAccess.getSToFMModelAccess().getImportViewsImportViewsParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SToFMModel__ImportViewsAssignment_0"


    // $ANTLR start "rule__SToFMModel__SplNameAssignment_1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5116:1: rule__SToFMModel__SplNameAssignment_1 : ( ruleSPLName ) ;
    public final void rule__SToFMModel__SplNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5120:1: ( ( ruleSPLName ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5121:1: ( ruleSPLName )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5121:1: ( ruleSPLName )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5122:1: ruleSPLName
            {
             before(grammarAccess.getSToFMModelAccess().getSplNameSPLNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSPLName_in_rule__SToFMModel__SplNameAssignment_110453);
            ruleSPLName();

            state._fsp--;

             after(grammarAccess.getSToFMModelAccess().getSplNameSPLNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SToFMModel__SplNameAssignment_1"


    // $ANTLR start "rule__SToFMModel__SchemaAssignment_2"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5131:1: rule__SToFMModel__SchemaAssignment_2 : ( ruleStructuringInformation ) ;
    public final void rule__SToFMModel__SchemaAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5135:1: ( ( ruleStructuringInformation ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5136:1: ( ruleStructuringInformation )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5136:1: ( ruleStructuringInformation )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5137:1: ruleStructuringInformation
            {
             before(grammarAccess.getSToFMModelAccess().getSchemaStructuringInformationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStructuringInformation_in_rule__SToFMModel__SchemaAssignment_210484);
            ruleStructuringInformation();

            state._fsp--;

             after(grammarAccess.getSToFMModelAccess().getSchemaStructuringInformationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SToFMModel__SchemaAssignment_2"


    // $ANTLR start "rule__SToFMModel__DefaultAssignment_3"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5146:1: rule__SToFMModel__DefaultAssignment_3 : ( ruleDefault ) ;
    public final void rule__SToFMModel__DefaultAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5150:1: ( ( ruleDefault ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5151:1: ( ruleDefault )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5151:1: ( ruleDefault )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5152:1: ruleDefault
            {
             before(grammarAccess.getSToFMModelAccess().getDefaultDefaultParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleDefault_in_rule__SToFMModel__DefaultAssignment_310515);
            ruleDefault();

            state._fsp--;

             after(grammarAccess.getSToFMModelAccess().getDefaultDefaultParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SToFMModel__DefaultAssignment_3"


    // $ANTLR start "rule__SToFMModel__ScopingAssignment_4"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5161:1: rule__SToFMModel__ScopingAssignment_4 : ( ruleScopingView ) ;
    public final void rule__SToFMModel__ScopingAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5165:1: ( ( ruleScopingView ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5166:1: ( ruleScopingView )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5166:1: ( ruleScopingView )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5167:1: ruleScopingView
            {
             before(grammarAccess.getSToFMModelAccess().getScopingScopingViewParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleScopingView_in_rule__SToFMModel__ScopingAssignment_410546);
            ruleScopingView();

            state._fsp--;

             after(grammarAccess.getSToFMModelAccess().getScopingScopingViewParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SToFMModel__ScopingAssignment_4"


    // $ANTLR start "rule__ImportViews__ViewsAssignment_1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5176:1: rule__ImportViews__ViewsAssignment_1 : ( ruleDataView ) ;
    public final void rule__ImportViews__ViewsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5180:1: ( ( ruleDataView ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5181:1: ( ruleDataView )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5181:1: ( ruleDataView )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5182:1: ruleDataView
            {
             before(grammarAccess.getImportViewsAccess().getViewsDataViewParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDataView_in_rule__ImportViews__ViewsAssignment_110577);
            ruleDataView();

            state._fsp--;

             after(grammarAccess.getImportViewsAccess().getViewsDataViewParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImportViews__ViewsAssignment_1"


    // $ANTLR start "rule__DataView__FileAssignment_0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5191:1: rule__DataView__FileAssignment_0 : ( RULE_STRING ) ;
    public final void rule__DataView__FileAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5195:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5196:1: ( RULE_STRING )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5196:1: ( RULE_STRING )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5197:1: RULE_STRING
            {
             before(grammarAccess.getDataViewAccess().getFileSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__DataView__FileAssignment_010608); 
             after(grammarAccess.getDataViewAccess().getFileSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataView__FileAssignment_0"


    // $ANTLR start "rule__DataView__ViewnameAssignment_1_1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5206:1: rule__DataView__ViewnameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__DataView__ViewnameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5210:1: ( ( RULE_ID ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5211:1: ( RULE_ID )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5211:1: ( RULE_ID )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5212:1: RULE_ID
            {
             before(grammarAccess.getDataViewAccess().getViewnameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DataView__ViewnameAssignment_1_110639); 
             after(grammarAccess.getDataViewAccess().getViewnameIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataView__ViewnameAssignment_1_1"


    // $ANTLR start "rule__SPLName__NameAssignment_1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5221:1: rule__SPLName__NameAssignment_1 : ( ( rule__SPLName__NameAlternatives_1_0 ) ) ;
    public final void rule__SPLName__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5225:1: ( ( ( rule__SPLName__NameAlternatives_1_0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5226:1: ( ( rule__SPLName__NameAlternatives_1_0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5226:1: ( ( rule__SPLName__NameAlternatives_1_0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5227:1: ( rule__SPLName__NameAlternatives_1_0 )
            {
             before(grammarAccess.getSPLNameAccess().getNameAlternatives_1_0()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5228:1: ( rule__SPLName__NameAlternatives_1_0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5228:2: rule__SPLName__NameAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__SPLName__NameAlternatives_1_0_in_rule__SPLName__NameAssignment_110670);
            rule__SPLName__NameAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSPLNameAccess().getNameAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SPLName__NameAssignment_1"


    // $ANTLR start "rule__StructuringInformation__RelationsAssignment_2"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5237:1: rule__StructuringInformation__RelationsAssignment_2 : ( ruleItemRelation ) ;
    public final void rule__StructuringInformation__RelationsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5241:1: ( ( ruleItemRelation ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5242:1: ( ruleItemRelation )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5242:1: ( ruleItemRelation )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5243:1: ruleItemRelation
            {
             before(grammarAccess.getStructuringInformationAccess().getRelationsItemRelationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleItemRelation_in_rule__StructuringInformation__RelationsAssignment_210703);
            ruleItemRelation();

            state._fsp--;

             after(grammarAccess.getStructuringInformationAccess().getRelationsItemRelationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuringInformation__RelationsAssignment_2"


    // $ANTLR start "rule__StructuringInformation__AbstractAssignment_3"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5252:1: rule__StructuringInformation__AbstractAssignment_3 : ( ruleItemGeneralization ) ;
    public final void rule__StructuringInformation__AbstractAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5256:1: ( ( ruleItemGeneralization ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5257:1: ( ruleItemGeneralization )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5257:1: ( ruleItemGeneralization )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5258:1: ruleItemGeneralization
            {
             before(grammarAccess.getStructuringInformationAccess().getAbstractItemGeneralizationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleItemGeneralization_in_rule__StructuringInformation__AbstractAssignment_310734);
            ruleItemGeneralization();

            state._fsp--;

             after(grammarAccess.getStructuringInformationAccess().getAbstractItemGeneralizationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuringInformation__AbstractAssignment_3"


    // $ANTLR start "rule__StructuringInformation__MpAssignment_4"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5267:1: rule__StructuringInformation__MpAssignment_4 : ( ruleItemMapping ) ;
    public final void rule__StructuringInformation__MpAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5271:1: ( ( ruleItemMapping ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5272:1: ( ruleItemMapping )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5272:1: ( ruleItemMapping )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5273:1: ruleItemMapping
            {
             before(grammarAccess.getStructuringInformationAccess().getMpItemMappingParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleItemMapping_in_rule__StructuringInformation__MpAssignment_410765);
            ruleItemMapping();

            state._fsp--;

             after(grammarAccess.getStructuringInformationAccess().getMpItemMappingParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StructuringInformation__MpAssignment_4"


    // $ANTLR start "rule__ItemRelation__View1Assignment_0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5282:1: rule__ItemRelation__View1Assignment_0 : ( ( rule__ItemRelation__View1Alternatives_0_0 ) ) ;
    public final void rule__ItemRelation__View1Assignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5286:1: ( ( ( rule__ItemRelation__View1Alternatives_0_0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5287:1: ( ( rule__ItemRelation__View1Alternatives_0_0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5287:1: ( ( rule__ItemRelation__View1Alternatives_0_0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5288:1: ( rule__ItemRelation__View1Alternatives_0_0 )
            {
             before(grammarAccess.getItemRelationAccess().getView1Alternatives_0_0()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5289:1: ( rule__ItemRelation__View1Alternatives_0_0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5289:2: rule__ItemRelation__View1Alternatives_0_0
            {
            pushFollow(FOLLOW_rule__ItemRelation__View1Alternatives_0_0_in_rule__ItemRelation__View1Assignment_010796);
            rule__ItemRelation__View1Alternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getItemRelationAccess().getView1Alternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemRelation__View1Assignment_0"


    // $ANTLR start "rule__ItemRelation__RelAssignment_1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5298:1: rule__ItemRelation__RelAssignment_1 : ( ruleKindRelation ) ;
    public final void rule__ItemRelation__RelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5302:1: ( ( ruleKindRelation ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5303:1: ( ruleKindRelation )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5303:1: ( ruleKindRelation )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5304:1: ruleKindRelation
            {
             before(grammarAccess.getItemRelationAccess().getRelKindRelationEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleKindRelation_in_rule__ItemRelation__RelAssignment_110829);
            ruleKindRelation();

            state._fsp--;

             after(grammarAccess.getItemRelationAccess().getRelKindRelationEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemRelation__RelAssignment_1"


    // $ANTLR start "rule__ItemRelation__View2Assignment_2"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5313:1: rule__ItemRelation__View2Assignment_2 : ( ( rule__ItemRelation__View2Alternatives_2_0 ) ) ;
    public final void rule__ItemRelation__View2Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5317:1: ( ( ( rule__ItemRelation__View2Alternatives_2_0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5318:1: ( ( rule__ItemRelation__View2Alternatives_2_0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5318:1: ( ( rule__ItemRelation__View2Alternatives_2_0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5319:1: ( rule__ItemRelation__View2Alternatives_2_0 )
            {
             before(grammarAccess.getItemRelationAccess().getView2Alternatives_2_0()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5320:1: ( rule__ItemRelation__View2Alternatives_2_0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5320:2: rule__ItemRelation__View2Alternatives_2_0
            {
            pushFollow(FOLLOW_rule__ItemRelation__View2Alternatives_2_0_in_rule__ItemRelation__View2Assignment_210860);
            rule__ItemRelation__View2Alternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getItemRelationAccess().getView2Alternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemRelation__View2Assignment_2"


    // $ANTLR start "rule__ItemGeneralization__GeneralizeAssignment_0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5329:1: rule__ItemGeneralization__GeneralizeAssignment_0 : ( ( rule__ItemGeneralization__GeneralizeAlternatives_0_0 ) ) ;
    public final void rule__ItemGeneralization__GeneralizeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5333:1: ( ( ( rule__ItemGeneralization__GeneralizeAlternatives_0_0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5334:1: ( ( rule__ItemGeneralization__GeneralizeAlternatives_0_0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5334:1: ( ( rule__ItemGeneralization__GeneralizeAlternatives_0_0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5335:1: ( rule__ItemGeneralization__GeneralizeAlternatives_0_0 )
            {
             before(grammarAccess.getItemGeneralizationAccess().getGeneralizeAlternatives_0_0()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5336:1: ( rule__ItemGeneralization__GeneralizeAlternatives_0_0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5336:2: rule__ItemGeneralization__GeneralizeAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__ItemGeneralization__GeneralizeAlternatives_0_0_in_rule__ItemGeneralization__GeneralizeAssignment_010893);
            rule__ItemGeneralization__GeneralizeAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getItemGeneralizationAccess().getGeneralizeAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGeneralization__GeneralizeAssignment_0"


    // $ANTLR start "rule__ItemGeneralization__ViewsAssignment_2"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5345:1: rule__ItemGeneralization__ViewsAssignment_2 : ( ( rule__ItemGeneralization__ViewsAlternatives_2_0 ) ) ;
    public final void rule__ItemGeneralization__ViewsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5349:1: ( ( ( rule__ItemGeneralization__ViewsAlternatives_2_0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5350:1: ( ( rule__ItemGeneralization__ViewsAlternatives_2_0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5350:1: ( ( rule__ItemGeneralization__ViewsAlternatives_2_0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5351:1: ( rule__ItemGeneralization__ViewsAlternatives_2_0 )
            {
             before(grammarAccess.getItemGeneralizationAccess().getViewsAlternatives_2_0()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5352:1: ( rule__ItemGeneralization__ViewsAlternatives_2_0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5352:2: rule__ItemGeneralization__ViewsAlternatives_2_0
            {
            pushFollow(FOLLOW_rule__ItemGeneralization__ViewsAlternatives_2_0_in_rule__ItemGeneralization__ViewsAssignment_210926);
            rule__ItemGeneralization__ViewsAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getItemGeneralizationAccess().getViewsAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemGeneralization__ViewsAssignment_2"


    // $ANTLR start "rule__ItemMapping__ItemAssignment_0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5361:1: rule__ItemMapping__ItemAssignment_0 : ( ( rule__ItemMapping__ItemAlternatives_0_0 ) ) ;
    public final void rule__ItemMapping__ItemAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5365:1: ( ( ( rule__ItemMapping__ItemAlternatives_0_0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5366:1: ( ( rule__ItemMapping__ItemAlternatives_0_0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5366:1: ( ( rule__ItemMapping__ItemAlternatives_0_0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5367:1: ( rule__ItemMapping__ItemAlternatives_0_0 )
            {
             before(grammarAccess.getItemMappingAccess().getItemAlternatives_0_0()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5368:1: ( rule__ItemMapping__ItemAlternatives_0_0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5368:2: rule__ItemMapping__ItemAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__ItemMapping__ItemAlternatives_0_0_in_rule__ItemMapping__ItemAssignment_010959);
            rule__ItemMapping__ItemAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getItemMappingAccess().getItemAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemMapping__ItemAssignment_0"


    // $ANTLR start "rule__ItemMapping__ActAssignment_1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5377:1: rule__ItemMapping__ActAssignment_1 : ( ( rule__ItemMapping__ActAlternatives_1_0 ) ) ;
    public final void rule__ItemMapping__ActAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5381:1: ( ( ( rule__ItemMapping__ActAlternatives_1_0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5382:1: ( ( rule__ItemMapping__ActAlternatives_1_0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5382:1: ( ( rule__ItemMapping__ActAlternatives_1_0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5383:1: ( rule__ItemMapping__ActAlternatives_1_0 )
            {
             before(grammarAccess.getItemMappingAccess().getActAlternatives_1_0()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5384:1: ( rule__ItemMapping__ActAlternatives_1_0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5384:2: rule__ItemMapping__ActAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__ItemMapping__ActAlternatives_1_0_in_rule__ItemMapping__ActAssignment_110992);
            rule__ItemMapping__ActAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getItemMappingAccess().getActAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemMapping__ActAssignment_1"


    // $ANTLR start "rule__ItemMapping__PftsAssignment_2"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5393:1: rule__ItemMapping__PftsAssignment_2 : ( rulePredicateItem ) ;
    public final void rule__ItemMapping__PftsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5397:1: ( ( rulePredicateItem ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5398:1: ( rulePredicateItem )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5398:1: ( rulePredicateItem )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5399:1: rulePredicateItem
            {
             before(grammarAccess.getItemMappingAccess().getPftsPredicateItemParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePredicateItem_in_rule__ItemMapping__PftsAssignment_211025);
            rulePredicateItem();

            state._fsp--;

             after(grammarAccess.getItemMappingAccess().getPftsPredicateItemParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ItemMapping__PftsAssignment_2"


    // $ANTLR start "rule__Or_expr__RightAssignment_1_2"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5408:1: rule__Or_expr__RightAssignment_1_2 : ( ruleAnd_expr ) ;
    public final void rule__Or_expr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5412:1: ( ( ruleAnd_expr ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5413:1: ( ruleAnd_expr )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5413:1: ( ruleAnd_expr )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5414:1: ruleAnd_expr
            {
             before(grammarAccess.getOr_exprAccess().getRightAnd_exprParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleAnd_expr_in_rule__Or_expr__RightAssignment_1_211056);
            ruleAnd_expr();

            state._fsp--;

             after(grammarAccess.getOr_exprAccess().getRightAnd_exprParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Or_expr__RightAssignment_1_2"


    // $ANTLR start "rule__And_expr__RightAssignment_1_2"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5423:1: rule__And_expr__RightAssignment_1_2 : ( ruleUnary_expr ) ;
    public final void rule__And_expr__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5427:1: ( ( ruleUnary_expr ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5428:1: ( ruleUnary_expr )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5428:1: ( ruleUnary_expr )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5429:1: ruleUnary_expr
            {
             before(grammarAccess.getAnd_exprAccess().getRightUnary_exprParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleUnary_expr_in_rule__And_expr__RightAssignment_1_211087);
            ruleUnary_expr();

            state._fsp--;

             after(grammarAccess.getAnd_exprAccess().getRightUnary_exprParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__And_expr__RightAssignment_1_2"


    // $ANTLR start "rule__Neg_expr__ExprAssignment_1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5438:1: rule__Neg_expr__ExprAssignment_1 : ( rulePrimary_expr ) ;
    public final void rule__Neg_expr__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5442:1: ( ( rulePrimary_expr ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5443:1: ( rulePrimary_expr )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5443:1: ( rulePrimary_expr )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5444:1: rulePrimary_expr
            {
             before(grammarAccess.getNeg_exprAccess().getExprPrimary_exprParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePrimary_expr_in_rule__Neg_expr__ExprAssignment_111118);
            rulePrimary_expr();

            state._fsp--;

             after(grammarAccess.getNeg_exprAccess().getExprPrimary_exprParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Neg_expr__ExprAssignment_1"


    // $ANTLR start "rule__Primary_expr__NameAssignment_0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5453:1: rule__Primary_expr__NameAssignment_0 : ( ( rule__Primary_expr__NameAlternatives_0_0 ) ) ;
    public final void rule__Primary_expr__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5457:1: ( ( ( rule__Primary_expr__NameAlternatives_0_0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5458:1: ( ( rule__Primary_expr__NameAlternatives_0_0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5458:1: ( ( rule__Primary_expr__NameAlternatives_0_0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5459:1: ( rule__Primary_expr__NameAlternatives_0_0 )
            {
             before(grammarAccess.getPrimary_exprAccess().getNameAlternatives_0_0()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5460:1: ( rule__Primary_expr__NameAlternatives_0_0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5460:2: rule__Primary_expr__NameAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__Primary_expr__NameAlternatives_0_0_in_rule__Primary_expr__NameAssignment_011149);
            rule__Primary_expr__NameAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getPrimary_exprAccess().getNameAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary_expr__NameAssignment_0"


    // $ANTLR start "rule__Default__ConfigsAssignment_2"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5469:1: rule__Default__ConfigsAssignment_2 : ( ruleParsingConfiguration ) ;
    public final void rule__Default__ConfigsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5473:1: ( ( ruleParsingConfiguration ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5474:1: ( ruleParsingConfiguration )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5474:1: ( ruleParsingConfiguration )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5475:1: ruleParsingConfiguration
            {
             before(grammarAccess.getDefaultAccess().getConfigsParsingConfigurationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleParsingConfiguration_in_rule__Default__ConfigsAssignment_211182);
            ruleParsingConfiguration();

            state._fsp--;

             after(grammarAccess.getDefaultAccess().getConfigsParsingConfigurationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__ConfigsAssignment_2"


    // $ANTLR start "rule__Default__ProductsAssignment_3"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5484:1: rule__Default__ProductsAssignment_3 : ( ruleScopingProducts ) ;
    public final void rule__Default__ProductsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5488:1: ( ( ruleScopingProducts ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5489:1: ( ruleScopingProducts )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5489:1: ( ruleScopingProducts )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5490:1: ruleScopingProducts
            {
             before(grammarAccess.getDefaultAccess().getProductsScopingProductsParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleScopingProducts_in_rule__Default__ProductsAssignment_311213);
            ruleScopingProducts();

            state._fsp--;

             after(grammarAccess.getDefaultAccess().getProductsScopingProductsParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Default__ProductsAssignment_3"


    // $ANTLR start "rule__ParsingConfiguration__ProductIDAssignment_2"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5499:1: rule__ParsingConfiguration__ProductIDAssignment_2 : ( ruleKey ) ;
    public final void rule__ParsingConfiguration__ProductIDAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5503:1: ( ( ruleKey ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5504:1: ( ruleKey )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5504:1: ( ruleKey )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5505:1: ruleKey
            {
             before(grammarAccess.getParsingConfigurationAccess().getProductIDKeyParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleKey_in_rule__ParsingConfiguration__ProductIDAssignment_211244);
            ruleKey();

            state._fsp--;

             after(grammarAccess.getParsingConfigurationAccess().getProductIDKeyParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParsingConfiguration__ProductIDAssignment_2"


    // $ANTLR start "rule__ParsingConfiguration__FormatAssignment_3"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5514:1: rule__ParsingConfiguration__FormatAssignment_3 : ( ruleFormatSpecification ) ;
    public final void rule__ParsingConfiguration__FormatAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5518:1: ( ( ruleFormatSpecification ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5519:1: ( ruleFormatSpecification )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5519:1: ( ruleFormatSpecification )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5520:1: ruleFormatSpecification
            {
             before(grammarAccess.getParsingConfigurationAccess().getFormatFormatSpecificationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleFormatSpecification_in_rule__ParsingConfiguration__FormatAssignment_311275);
            ruleFormatSpecification();

            state._fsp--;

             after(grammarAccess.getParsingConfigurationAccess().getFormatFormatSpecificationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParsingConfiguration__FormatAssignment_3"


    // $ANTLR start "rule__ParsingConfiguration__SinterpretAssignment_4"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5529:1: rule__ParsingConfiguration__SinterpretAssignment_4 : ( ruleSyntacticalInterpretation ) ;
    public final void rule__ParsingConfiguration__SinterpretAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5533:1: ( ( ruleSyntacticalInterpretation ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5534:1: ( ruleSyntacticalInterpretation )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5534:1: ( ruleSyntacticalInterpretation )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5535:1: ruleSyntacticalInterpretation
            {
             before(grammarAccess.getParsingConfigurationAccess().getSinterpretSyntacticalInterpretationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleSyntacticalInterpretation_in_rule__ParsingConfiguration__SinterpretAssignment_411306);
            ruleSyntacticalInterpretation();

            state._fsp--;

             after(grammarAccess.getParsingConfigurationAccess().getSinterpretSyntacticalInterpretationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParsingConfiguration__SinterpretAssignment_4"


    // $ANTLR start "rule__ParsingConfiguration__SeparatorAssignment_5"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5544:1: rule__ParsingConfiguration__SeparatorAssignment_5 : ( ruleCSVSeparator ) ;
    public final void rule__ParsingConfiguration__SeparatorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5548:1: ( ( ruleCSVSeparator ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5549:1: ( ruleCSVSeparator )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5549:1: ( ruleCSVSeparator )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5550:1: ruleCSVSeparator
            {
             before(grammarAccess.getParsingConfigurationAccess().getSeparatorCSVSeparatorParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleCSVSeparator_in_rule__ParsingConfiguration__SeparatorAssignment_511337);
            ruleCSVSeparator();

            state._fsp--;

             after(grammarAccess.getParsingConfigurationAccess().getSeparatorCSVSeparatorParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParsingConfiguration__SeparatorAssignment_5"


    // $ANTLR start "rule__ParsingConfiguration__MseparatorAssignment_6"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5559:1: rule__ParsingConfiguration__MseparatorAssignment_6 : ( ruleCSVMultiSeparator ) ;
    public final void rule__ParsingConfiguration__MseparatorAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5563:1: ( ( ruleCSVMultiSeparator ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5564:1: ( ruleCSVMultiSeparator )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5564:1: ( ruleCSVMultiSeparator )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5565:1: ruleCSVMultiSeparator
            {
             before(grammarAccess.getParsingConfigurationAccess().getMseparatorCSVMultiSeparatorParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleCSVMultiSeparator_in_rule__ParsingConfiguration__MseparatorAssignment_611368);
            ruleCSVMultiSeparator();

            state._fsp--;

             after(grammarAccess.getParsingConfigurationAccess().getMseparatorCSVMultiSeparatorParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParsingConfiguration__MseparatorAssignment_6"


    // $ANTLR start "rule__FormatSpecification__FileformatAssignment_1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5574:1: rule__FormatSpecification__FileformatAssignment_1 : ( ruleFileFormat ) ;
    public final void rule__FormatSpecification__FileformatAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5578:1: ( ( ruleFileFormat ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5579:1: ( ruleFileFormat )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5579:1: ( ruleFileFormat )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5580:1: ruleFileFormat
            {
             before(grammarAccess.getFormatSpecificationAccess().getFileformatFileFormatEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleFileFormat_in_rule__FormatSpecification__FileformatAssignment_111399);
            ruleFileFormat();

            state._fsp--;

             after(grammarAccess.getFormatSpecificationAccess().getFileformatFileFormatEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormatSpecification__FileformatAssignment_1"


    // $ANTLR start "rule__SyntacticalInterpretation__OptAssignment_2"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5589:1: rule__SyntacticalInterpretation__OptAssignment_2 : ( ruleOptional ) ;
    public final void rule__SyntacticalInterpretation__OptAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5593:1: ( ( ruleOptional ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5594:1: ( ruleOptional )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5594:1: ( ruleOptional )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5595:1: ruleOptional
            {
             before(grammarAccess.getSyntacticalInterpretationAccess().getOptOptionalParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleOptional_in_rule__SyntacticalInterpretation__OptAssignment_211430);
            ruleOptional();

            state._fsp--;

             after(grammarAccess.getSyntacticalInterpretationAccess().getOptOptionalParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SyntacticalInterpretation__OptAssignment_2"


    // $ANTLR start "rule__SyntacticalInterpretation__YesAssignment_3"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5604:1: rule__SyntacticalInterpretation__YesAssignment_3 : ( ruleMandatory ) ;
    public final void rule__SyntacticalInterpretation__YesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5608:1: ( ( ruleMandatory ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5609:1: ( ruleMandatory )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5609:1: ( ruleMandatory )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5610:1: ruleMandatory
            {
             before(grammarAccess.getSyntacticalInterpretationAccess().getYesMandatoryParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleMandatory_in_rule__SyntacticalInterpretation__YesAssignment_311461);
            ruleMandatory();

            state._fsp--;

             after(grammarAccess.getSyntacticalInterpretationAccess().getYesMandatoryParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SyntacticalInterpretation__YesAssignment_3"


    // $ANTLR start "rule__SyntacticalInterpretation__NoAssignment_4"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5619:1: rule__SyntacticalInterpretation__NoAssignment_4 : ( ruleNotPresent ) ;
    public final void rule__SyntacticalInterpretation__NoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5623:1: ( ( ruleNotPresent ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5624:1: ( ruleNotPresent )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5624:1: ( ruleNotPresent )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5625:1: ruleNotPresent
            {
             before(grammarAccess.getSyntacticalInterpretationAccess().getNoNotPresentParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleNotPresent_in_rule__SyntacticalInterpretation__NoAssignment_411492);
            ruleNotPresent();

            state._fsp--;

             after(grammarAccess.getSyntacticalInterpretationAccess().getNoNotPresentParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SyntacticalInterpretation__NoAssignment_4"


    // $ANTLR start "rule__SyntacticalInterpretation__NaAssignment_5"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5634:1: rule__SyntacticalInterpretation__NaAssignment_5 : ( ruleUnknown ) ;
    public final void rule__SyntacticalInterpretation__NaAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5638:1: ( ( ruleUnknown ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5639:1: ( ruleUnknown )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5639:1: ( ruleUnknown )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5640:1: ruleUnknown
            {
             before(grammarAccess.getSyntacticalInterpretationAccess().getNaUnknownParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleUnknown_in_rule__SyntacticalInterpretation__NaAssignment_511523);
            ruleUnknown();

            state._fsp--;

             after(grammarAccess.getSyntacticalInterpretationAccess().getNaUnknownParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SyntacticalInterpretation__NaAssignment_5"


    // $ANTLR start "rule__Key__CidAssignment_1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5649:1: rule__Key__CidAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Key__CidAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5653:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5654:1: ( RULE_STRING )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5654:1: ( RULE_STRING )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5655:1: RULE_STRING
            {
             before(grammarAccess.getKeyAccess().getCidSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Key__CidAssignment_111554); 
             after(grammarAccess.getKeyAccess().getCidSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Key__CidAssignment_1"


    // $ANTLR start "rule__CSVSeparator__SepAssignment_1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5664:1: rule__CSVSeparator__SepAssignment_1 : ( RULE_STRING ) ;
    public final void rule__CSVSeparator__SepAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5668:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5669:1: ( RULE_STRING )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5669:1: ( RULE_STRING )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5670:1: RULE_STRING
            {
             before(grammarAccess.getCSVSeparatorAccess().getSepSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CSVSeparator__SepAssignment_111585); 
             after(grammarAccess.getCSVSeparatorAccess().getSepSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSVSeparator__SepAssignment_1"


    // $ANTLR start "rule__CSVMultiSeparator__SepsAssignment_1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5679:1: rule__CSVMultiSeparator__SepsAssignment_1 : ( RULE_STRING ) ;
    public final void rule__CSVMultiSeparator__SepsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5683:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5684:1: ( RULE_STRING )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5684:1: ( RULE_STRING )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5685:1: RULE_STRING
            {
             before(grammarAccess.getCSVMultiSeparatorAccess().getSepsSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__CSVMultiSeparator__SepsAssignment_111616); 
             after(grammarAccess.getCSVMultiSeparatorAccess().getSepsSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CSVMultiSeparator__SepsAssignment_1"


    // $ANTLR start "rule__Optional__ValuesAssignment_1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5694:1: rule__Optional__ValuesAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Optional__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5698:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5699:1: ( RULE_STRING )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5699:1: ( RULE_STRING )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5700:1: RULE_STRING
            {
             before(grammarAccess.getOptionalAccess().getValuesSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Optional__ValuesAssignment_111647); 
             after(grammarAccess.getOptionalAccess().getValuesSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__ValuesAssignment_1"


    // $ANTLR start "rule__Mandatory__ValuesAssignment_1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5709:1: rule__Mandatory__ValuesAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Mandatory__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5713:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5714:1: ( RULE_STRING )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5714:1: ( RULE_STRING )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5715:1: RULE_STRING
            {
             before(grammarAccess.getMandatoryAccess().getValuesSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Mandatory__ValuesAssignment_111678); 
             after(grammarAccess.getMandatoryAccess().getValuesSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__ValuesAssignment_1"


    // $ANTLR start "rule__NotPresent__ValuesAssignment_1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5724:1: rule__NotPresent__ValuesAssignment_1 : ( RULE_STRING ) ;
    public final void rule__NotPresent__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5728:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5729:1: ( RULE_STRING )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5729:1: ( RULE_STRING )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5730:1: RULE_STRING
            {
             before(grammarAccess.getNotPresentAccess().getValuesSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__NotPresent__ValuesAssignment_111709); 
             after(grammarAccess.getNotPresentAccess().getValuesSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NotPresent__ValuesAssignment_1"


    // $ANTLR start "rule__Unknown__ValuesAssignment_1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5739:1: rule__Unknown__ValuesAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Unknown__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5743:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5744:1: ( RULE_STRING )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5744:1: ( RULE_STRING )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5745:1: RULE_STRING
            {
             before(grammarAccess.getUnknownAccess().getValuesSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Unknown__ValuesAssignment_111740); 
             after(grammarAccess.getUnknownAccess().getValuesSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unknown__ValuesAssignment_1"


    // $ANTLR start "rule__ScopingView__ViewAssignment_1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5754:1: rule__ScopingView__ViewAssignment_1 : ( RULE_ID ) ;
    public final void rule__ScopingView__ViewAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5758:1: ( ( RULE_ID ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5759:1: ( RULE_ID )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5759:1: ( RULE_ID )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5760:1: RULE_ID
            {
             before(grammarAccess.getScopingViewAccess().getViewIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ScopingView__ViewAssignment_111771); 
             after(grammarAccess.getScopingViewAccess().getViewIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopingView__ViewAssignment_1"


    // $ANTLR start "rule__ScopingView__ViewnameAssignment_2"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5769:1: rule__ScopingView__ViewnameAssignment_2 : ( ruleViewName ) ;
    public final void rule__ScopingView__ViewnameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5773:1: ( ( ruleViewName ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5774:1: ( ruleViewName )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5774:1: ( ruleViewName )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5775:1: ruleViewName
            {
             before(grammarAccess.getScopingViewAccess().getViewnameViewNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleViewName_in_rule__ScopingView__ViewnameAssignment_211802);
            ruleViewName();

            state._fsp--;

             after(grammarAccess.getScopingViewAccess().getViewnameViewNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopingView__ViewnameAssignment_2"


    // $ANTLR start "rule__ScopingView__SchemaAssignment_3"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5784:1: rule__ScopingView__SchemaAssignment_3 : ( ruleStructuringInformation ) ;
    public final void rule__ScopingView__SchemaAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5788:1: ( ( ruleStructuringInformation ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5789:1: ( ruleStructuringInformation )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5789:1: ( ruleStructuringInformation )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5790:1: ruleStructuringInformation
            {
             before(grammarAccess.getScopingViewAccess().getSchemaStructuringInformationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleStructuringInformation_in_rule__ScopingView__SchemaAssignment_311833);
            ruleStructuringInformation();

            state._fsp--;

             after(grammarAccess.getScopingViewAccess().getSchemaStructuringInformationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopingView__SchemaAssignment_3"


    // $ANTLR start "rule__ScopingView__ConfigAssignment_4"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5799:1: rule__ScopingView__ConfigAssignment_4 : ( ruleParsingConfiguration ) ;
    public final void rule__ScopingView__ConfigAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5803:1: ( ( ruleParsingConfiguration ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5804:1: ( ruleParsingConfiguration )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5804:1: ( ruleParsingConfiguration )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5805:1: ruleParsingConfiguration
            {
             before(grammarAccess.getScopingViewAccess().getConfigParsingConfigurationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleParsingConfiguration_in_rule__ScopingView__ConfigAssignment_411864);
            ruleParsingConfiguration();

            state._fsp--;

             after(grammarAccess.getScopingViewAccess().getConfigParsingConfigurationParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopingView__ConfigAssignment_4"


    // $ANTLR start "rule__ScopingView__ProductsAssignment_5"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5814:1: rule__ScopingView__ProductsAssignment_5 : ( ruleScopingProducts ) ;
    public final void rule__ScopingView__ProductsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5818:1: ( ( ruleScopingProducts ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5819:1: ( ruleScopingProducts )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5819:1: ( ruleScopingProducts )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5820:1: ruleScopingProducts
            {
             before(grammarAccess.getScopingViewAccess().getProductsScopingProductsParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleScopingProducts_in_rule__ScopingView__ProductsAssignment_511895);
            ruleScopingProducts();

            state._fsp--;

             after(grammarAccess.getScopingViewAccess().getProductsScopingProductsParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopingView__ProductsAssignment_5"


    // $ANTLR start "rule__ScopingView__FtsAssignment_6"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5829:1: rule__ScopingView__FtsAssignment_6 : ( ruleScopingFeatures ) ;
    public final void rule__ScopingView__FtsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5833:1: ( ( ruleScopingFeatures ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5834:1: ( ruleScopingFeatures )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5834:1: ( ruleScopingFeatures )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5835:1: ruleScopingFeatures
            {
             before(grammarAccess.getScopingViewAccess().getFtsScopingFeaturesParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleScopingFeatures_in_rule__ScopingView__FtsAssignment_611926);
            ruleScopingFeatures();

            state._fsp--;

             after(grammarAccess.getScopingViewAccess().getFtsScopingFeaturesParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopingView__FtsAssignment_6"


    // $ANTLR start "rule__ScopingView__AlignmentAssignment_7"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5844:1: rule__ScopingView__AlignmentAssignment_7 : ( ruleRewriting ) ;
    public final void rule__ScopingView__AlignmentAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5848:1: ( ( ruleRewriting ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5849:1: ( ruleRewriting )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5849:1: ( ruleRewriting )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5850:1: ruleRewriting
            {
             before(grammarAccess.getScopingViewAccess().getAlignmentRewritingParserRuleCall_7_0()); 
            pushFollow(FOLLOW_ruleRewriting_in_rule__ScopingView__AlignmentAssignment_711957);
            ruleRewriting();

            state._fsp--;

             after(grammarAccess.getScopingViewAccess().getAlignmentRewritingParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopingView__AlignmentAssignment_7"


    // $ANTLR start "rule__ScopingView__InterpretationAssignment_8"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5859:1: rule__ScopingView__InterpretationAssignment_8 : ( ruleMultiValuesInterpretation ) ;
    public final void rule__ScopingView__InterpretationAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5863:1: ( ( ruleMultiValuesInterpretation ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5864:1: ( ruleMultiValuesInterpretation )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5864:1: ( ruleMultiValuesInterpretation )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5865:1: ruleMultiValuesInterpretation
            {
             before(grammarAccess.getScopingViewAccess().getInterpretationMultiValuesInterpretationParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleMultiValuesInterpretation_in_rule__ScopingView__InterpretationAssignment_811988);
            ruleMultiValuesInterpretation();

            state._fsp--;

             after(grammarAccess.getScopingViewAccess().getInterpretationMultiValuesInterpretationParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ScopingView__InterpretationAssignment_8"


    // $ANTLR start "rule__ViewName__NameAssignment_1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5874:1: rule__ViewName__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__ViewName__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5878:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5879:1: ( RULE_STRING )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5879:1: ( RULE_STRING )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5880:1: RULE_STRING
            {
             before(grammarAccess.getViewNameAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__ViewName__NameAssignment_112019); 
             after(grammarAccess.getViewNameAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ViewName__NameAssignment_1"


    // $ANTLR start "rule__FeatureInclusionExclusion__ExceptAssignment_0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5889:1: rule__FeatureInclusionExclusion__ExceptAssignment_0 : ( ruleExceptFeature ) ;
    public final void rule__FeatureInclusionExclusion__ExceptAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5893:1: ( ( ruleExceptFeature ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5894:1: ( ruleExceptFeature )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5894:1: ( ruleExceptFeature )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5895:1: ruleExceptFeature
            {
             before(grammarAccess.getFeatureInclusionExclusionAccess().getExceptExceptFeatureParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleExceptFeature_in_rule__FeatureInclusionExclusion__ExceptAssignment_012050);
            ruleExceptFeature();

            state._fsp--;

             after(grammarAccess.getFeatureInclusionExclusionAccess().getExceptExceptFeatureParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureInclusionExclusion__ExceptAssignment_0"


    // $ANTLR start "rule__FeatureInclusionExclusion__OnlyAssignment_1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5904:1: rule__FeatureInclusionExclusion__OnlyAssignment_1 : ( ruleOnlyFeature ) ;
    public final void rule__FeatureInclusionExclusion__OnlyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5908:1: ( ( ruleOnlyFeature ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5909:1: ( ruleOnlyFeature )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5909:1: ( ruleOnlyFeature )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5910:1: ruleOnlyFeature
            {
             before(grammarAccess.getFeatureInclusionExclusionAccess().getOnlyOnlyFeatureParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleOnlyFeature_in_rule__FeatureInclusionExclusion__OnlyAssignment_112081);
            ruleOnlyFeature();

            state._fsp--;

             after(grammarAccess.getFeatureInclusionExclusionAccess().getOnlyOnlyFeatureParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureInclusionExclusion__OnlyAssignment_1"


    // $ANTLR start "rule__ExceptFeature__FtsAssignment_1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5919:1: rule__ExceptFeature__FtsAssignment_1 : ( ( rule__ExceptFeature__FtsAlternatives_1_0 ) ) ;
    public final void rule__ExceptFeature__FtsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5923:1: ( ( ( rule__ExceptFeature__FtsAlternatives_1_0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5924:1: ( ( rule__ExceptFeature__FtsAlternatives_1_0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5924:1: ( ( rule__ExceptFeature__FtsAlternatives_1_0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5925:1: ( rule__ExceptFeature__FtsAlternatives_1_0 )
            {
             before(grammarAccess.getExceptFeatureAccess().getFtsAlternatives_1_0()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5926:1: ( rule__ExceptFeature__FtsAlternatives_1_0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5926:2: rule__ExceptFeature__FtsAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__ExceptFeature__FtsAlternatives_1_0_in_rule__ExceptFeature__FtsAssignment_112112);
            rule__ExceptFeature__FtsAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExceptFeatureAccess().getFtsAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptFeature__FtsAssignment_1"


    // $ANTLR start "rule__OnlyFeature__FtsAssignment_1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5935:1: rule__OnlyFeature__FtsAssignment_1 : ( ( rule__OnlyFeature__FtsAlternatives_1_0 ) ) ;
    public final void rule__OnlyFeature__FtsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5939:1: ( ( ( rule__OnlyFeature__FtsAlternatives_1_0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5940:1: ( ( rule__OnlyFeature__FtsAlternatives_1_0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5940:1: ( ( rule__OnlyFeature__FtsAlternatives_1_0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5941:1: ( rule__OnlyFeature__FtsAlternatives_1_0 )
            {
             before(grammarAccess.getOnlyFeatureAccess().getFtsAlternatives_1_0()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5942:1: ( rule__OnlyFeature__FtsAlternatives_1_0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5942:2: rule__OnlyFeature__FtsAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__OnlyFeature__FtsAlternatives_1_0_in_rule__OnlyFeature__FtsAssignment_112145);
            rule__OnlyFeature__FtsAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getOnlyFeatureAccess().getFtsAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnlyFeature__FtsAssignment_1"


    // $ANTLR start "rule__ProductInclusionExclusion__ExceptAssignment_0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5951:1: rule__ProductInclusionExclusion__ExceptAssignment_0 : ( ruleExceptProduct ) ;
    public final void rule__ProductInclusionExclusion__ExceptAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5955:1: ( ( ruleExceptProduct ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5956:1: ( ruleExceptProduct )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5956:1: ( ruleExceptProduct )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5957:1: ruleExceptProduct
            {
             before(grammarAccess.getProductInclusionExclusionAccess().getExceptExceptProductParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleExceptProduct_in_rule__ProductInclusionExclusion__ExceptAssignment_012178);
            ruleExceptProduct();

            state._fsp--;

             after(grammarAccess.getProductInclusionExclusionAccess().getExceptExceptProductParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductInclusionExclusion__ExceptAssignment_0"


    // $ANTLR start "rule__ProductInclusionExclusion__OnlyAssignment_1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5966:1: rule__ProductInclusionExclusion__OnlyAssignment_1 : ( ruleOnlyProduct ) ;
    public final void rule__ProductInclusionExclusion__OnlyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5970:1: ( ( ruleOnlyProduct ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5971:1: ( ruleOnlyProduct )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5971:1: ( ruleOnlyProduct )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5972:1: ruleOnlyProduct
            {
             before(grammarAccess.getProductInclusionExclusionAccess().getOnlyOnlyProductParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleOnlyProduct_in_rule__ProductInclusionExclusion__OnlyAssignment_112209);
            ruleOnlyProduct();

            state._fsp--;

             after(grammarAccess.getProductInclusionExclusionAccess().getOnlyOnlyProductParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProductInclusionExclusion__OnlyAssignment_1"


    // $ANTLR start "rule__ExceptProduct__PdsAssignment_1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5981:1: rule__ExceptProduct__PdsAssignment_1 : ( ( rule__ExceptProduct__PdsAlternatives_1_0 ) ) ;
    public final void rule__ExceptProduct__PdsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5985:1: ( ( ( rule__ExceptProduct__PdsAlternatives_1_0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5986:1: ( ( rule__ExceptProduct__PdsAlternatives_1_0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5986:1: ( ( rule__ExceptProduct__PdsAlternatives_1_0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5987:1: ( rule__ExceptProduct__PdsAlternatives_1_0 )
            {
             before(grammarAccess.getExceptProductAccess().getPdsAlternatives_1_0()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5988:1: ( rule__ExceptProduct__PdsAlternatives_1_0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5988:2: rule__ExceptProduct__PdsAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__ExceptProduct__PdsAlternatives_1_0_in_rule__ExceptProduct__PdsAssignment_112240);
            rule__ExceptProduct__PdsAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExceptProductAccess().getPdsAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExceptProduct__PdsAssignment_1"


    // $ANTLR start "rule__OnlyProduct__PdsAssignment_1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:5997:1: rule__OnlyProduct__PdsAssignment_1 : ( ( rule__OnlyProduct__PdsAlternatives_1_0 ) ) ;
    public final void rule__OnlyProduct__PdsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:6001:1: ( ( ( rule__OnlyProduct__PdsAlternatives_1_0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:6002:1: ( ( rule__OnlyProduct__PdsAlternatives_1_0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:6002:1: ( ( rule__OnlyProduct__PdsAlternatives_1_0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:6003:1: ( rule__OnlyProduct__PdsAlternatives_1_0 )
            {
             before(grammarAccess.getOnlyProductAccess().getPdsAlternatives_1_0()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:6004:1: ( rule__OnlyProduct__PdsAlternatives_1_0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:6004:2: rule__OnlyProduct__PdsAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__OnlyProduct__PdsAlternatives_1_0_in_rule__OnlyProduct__PdsAssignment_112273);
            rule__OnlyProduct__PdsAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getOnlyProductAccess().getPdsAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OnlyProduct__PdsAssignment_1"


    // $ANTLR start "rule__Rewriting__OftAssignment_1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:6013:1: rule__Rewriting__OftAssignment_1 : ( ( rule__Rewriting__OftAlternatives_1_0 ) ) ;
    public final void rule__Rewriting__OftAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:6017:1: ( ( ( rule__Rewriting__OftAlternatives_1_0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:6018:1: ( ( rule__Rewriting__OftAlternatives_1_0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:6018:1: ( ( rule__Rewriting__OftAlternatives_1_0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:6019:1: ( rule__Rewriting__OftAlternatives_1_0 )
            {
             before(grammarAccess.getRewritingAccess().getOftAlternatives_1_0()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:6020:1: ( rule__Rewriting__OftAlternatives_1_0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:6020:2: rule__Rewriting__OftAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Rewriting__OftAlternatives_1_0_in_rule__Rewriting__OftAssignment_112306);
            rule__Rewriting__OftAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getRewritingAccess().getOftAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rewriting__OftAssignment_1"


    // $ANTLR start "rule__Rewriting__NftAssignment_3"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:6029:1: rule__Rewriting__NftAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Rewriting__NftAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:6033:1: ( ( RULE_STRING ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:6034:1: ( RULE_STRING )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:6034:1: ( RULE_STRING )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:6035:1: RULE_STRING
            {
             before(grammarAccess.getRewritingAccess().getNftSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Rewriting__NftAssignment_312339); 
             after(grammarAccess.getRewritingAccess().getNftSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rewriting__NftAssignment_3"


    // $ANTLR start "rule__MultiValuesInterpretation__MultiAssignment_1"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:6044:1: rule__MultiValuesInterpretation__MultiAssignment_1 : ( ruleMultiValueInterpretation ) ;
    public final void rule__MultiValuesInterpretation__MultiAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:6048:1: ( ( ruleMultiValueInterpretation ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:6049:1: ( ruleMultiValueInterpretation )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:6049:1: ( ruleMultiValueInterpretation )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:6050:1: ruleMultiValueInterpretation
            {
             before(grammarAccess.getMultiValuesInterpretationAccess().getMultiMultiValueInterpretationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleMultiValueInterpretation_in_rule__MultiValuesInterpretation__MultiAssignment_112370);
            ruleMultiValueInterpretation();

            state._fsp--;

             after(grammarAccess.getMultiValuesInterpretationAccess().getMultiMultiValueInterpretationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiValuesInterpretation__MultiAssignment_1"


    // $ANTLR start "rule__MultiValueInterpretation__ValAssignment_0"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:6059:1: rule__MultiValueInterpretation__ValAssignment_0 : ( ( rule__MultiValueInterpretation__ValAlternatives_0_0 ) ) ;
    public final void rule__MultiValueInterpretation__ValAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:6063:1: ( ( ( rule__MultiValueInterpretation__ValAlternatives_0_0 ) ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:6064:1: ( ( rule__MultiValueInterpretation__ValAlternatives_0_0 ) )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:6064:1: ( ( rule__MultiValueInterpretation__ValAlternatives_0_0 ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:6065:1: ( rule__MultiValueInterpretation__ValAlternatives_0_0 )
            {
             before(grammarAccess.getMultiValueInterpretationAccess().getValAlternatives_0_0()); 
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:6066:1: ( rule__MultiValueInterpretation__ValAlternatives_0_0 )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:6066:2: rule__MultiValueInterpretation__ValAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__MultiValueInterpretation__ValAlternatives_0_0_in_rule__MultiValueInterpretation__ValAssignment_012401);
            rule__MultiValueInterpretation__ValAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getMultiValueInterpretationAccess().getValAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiValueInterpretation__ValAssignment_0"


    // $ANTLR start "rule__MultiValueInterpretation__VariabilityAssignment_2"
    // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:6075:1: rule__MultiValueInterpretation__VariabilityAssignment_2 : ( ruleVariabilityInterpretation ) ;
    public final void rule__MultiValueInterpretation__VariabilityAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:6079:1: ( ( ruleVariabilityInterpretation ) )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:6080:1: ( ruleVariabilityInterpretation )
            {
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:6080:1: ( ruleVariabilityInterpretation )
            // ../org.xtext.example.varicell.ui/src-gen/org/xtext/example/mydsl/ui/contentassist/antlr/internal/InternalVariCell.g:6081:1: ruleVariabilityInterpretation
            {
             before(grammarAccess.getMultiValueInterpretationAccess().getVariabilityVariabilityInterpretationEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleVariabilityInterpretation_in_rule__MultiValueInterpretation__VariabilityAssignment_212434);
            ruleVariabilityInterpretation();

            state._fsp--;

             after(grammarAccess.getMultiValueInterpretationAccess().getVariabilityVariabilityInterpretationEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiValueInterpretation__VariabilityAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSToFMModel_in_entryRuleSToFMModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSToFMModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SToFMModel__Group__0_in_ruleSToFMModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportViews_in_entryRuleImportViews121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportViews128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportViews__Group__0_in_ruleImportViews154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataView_in_entryRuleDataView181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataView188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataView__Group__0_in_ruleDataView214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPLName_in_entryRuleSPLName241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPLName248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPLName__Group__0_in_ruleSPLName274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructuringInformation_in_entryRuleStructuringInformation301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructuringInformation308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructuringInformation__Group__0_in_ruleStructuringInformation334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemRelation_in_entryRuleItemRelation361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItemRelation368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemRelation__Group__0_in_ruleItemRelation394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemGeneralization_in_entryRuleItemGeneralization421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItemGeneralization428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemGeneralization__Group__0_in_ruleItemGeneralization454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemMapping_in_entryRuleItemMapping481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItemMapping488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemMapping__Group__0_in_ruleItemMapping514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateItem_in_entryRulePredicateItem541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateItem548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_expr_in_rulePredicateItem574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_expr_in_entryRuleOr_expr600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr_expr607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or_expr__Group__0_in_ruleOr_expr633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_expr_in_entryRuleAnd_expr660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd_expr667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And_expr__Group__0_in_ruleAnd_expr693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnary_expr_in_entryRuleUnary_expr720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnary_expr727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unary_expr__Alternatives_in_ruleUnary_expr753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNeg_expr_in_entryRuleNeg_expr780 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNeg_expr787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Neg_expr__Group__0_in_ruleNeg_expr813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_expr_in_entryRulePrimary_expr840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary_expr847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary_expr__Alternatives_in_rulePrimary_expr873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefault_in_entryRuleDefault900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefault907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Default__Group__0_in_ruleDefault933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParsingConfiguration_in_entryRuleParsingConfiguration960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParsingConfiguration967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParsingConfiguration__Group__0_in_ruleParsingConfiguration993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormatSpecification_in_entryRuleFormatSpecification1020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormatSpecification1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormatSpecification__Group__0_in_ruleFormatSpecification1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSyntacticalInterpretation_in_entryRuleSyntacticalInterpretation1080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSyntacticalInterpretation1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SyntacticalInterpretation__Group__0_in_ruleSyntacticalInterpretation1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKey_in_entryRuleKey1140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKey1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Key__Group__0_in_ruleKey1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSVSeparator_in_entryRuleCSVSeparator1200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSVSeparator1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSVSeparator__Group__0_in_ruleCSVSeparator1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSVMultiSeparator_in_entryRuleCSVMultiSeparator1260 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSVMultiSeparator1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSVMultiSeparator__Group__0_in_ruleCSVMultiSeparator1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptional_in_entryRuleOptional1320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptional1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group__0_in_ruleOptional1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_entryRuleMandatory1380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMandatory1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__0_in_ruleMandatory1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotPresent_in_entryRuleNotPresent1440 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotPresent1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotPresent__Group__0_in_ruleNotPresent1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnknown_in_entryRuleUnknown1500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnknown1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unknown__Group__0_in_ruleUnknown1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScopingView_in_entryRuleScopingView1560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScopingView1567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScopingView__Group__0_in_ruleScopingView1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewName_in_entryRuleViewName1620 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewName1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewName__Group__0_in_ruleViewName1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScopingProducts_in_entryRuleScopingProducts1680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScopingProducts1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProductInclusionExclusion_in_ruleScopingProducts1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScopingFeatures_in_entryRuleScopingFeatures1739 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScopingFeatures1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureInclusionExclusion_in_ruleScopingFeatures1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureInclusionExclusion_in_entryRuleFeatureInclusionExclusion1798 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureInclusionExclusion1805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureInclusionExclusion__Alternatives_in_ruleFeatureInclusionExclusion1831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptFeature_in_entryRuleExceptFeature1858 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExceptFeature1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExceptFeature__Group__0_in_ruleExceptFeature1891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnlyFeature_in_entryRuleOnlyFeature1918 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOnlyFeature1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OnlyFeature__Group__0_in_ruleOnlyFeature1951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProductInclusionExclusion_in_entryRuleProductInclusionExclusion1978 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProductInclusionExclusion1985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProductInclusionExclusion__Alternatives_in_ruleProductInclusionExclusion2011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptProduct_in_entryRuleExceptProduct2038 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExceptProduct2045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExceptProduct__Group__0_in_ruleExceptProduct2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnlyProduct_in_entryRuleOnlyProduct2098 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOnlyProduct2105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OnlyProduct__Group__0_in_ruleOnlyProduct2131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRewriting_in_entryRuleRewriting2158 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRewriting2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rewriting__Group__0_in_ruleRewriting2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiValuesInterpretation_in_entryRuleMultiValuesInterpretation2218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiValuesInterpretation2225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiValuesInterpretation__Group__0_in_ruleMultiValuesInterpretation2251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiValueInterpretation_in_entryRuleMultiValueInterpretation2278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiValueInterpretation2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiValueInterpretation__Group__0_in_ruleMultiValueInterpretation2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KindRelation__Alternatives_in_ruleKindRelation2348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FileFormat__Alternatives_in_ruleFileFormat2384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VariabilityInterpretation__Alternatives_in_ruleVariabilityInterpretation2420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SPLName__NameAlternatives_1_02455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SPLName__NameAlternatives_1_02472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ItemRelation__View1Alternatives_0_02504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ItemRelation__View1Alternatives_0_02521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ItemRelation__View2Alternatives_2_02553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ItemRelation__View2Alternatives_2_02570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ItemGeneralization__GeneralizeAlternatives_0_02602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ItemGeneralization__GeneralizeAlternatives_0_02619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__ItemGeneralization__Alternatives_12652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ItemGeneralization__Alternatives_12672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ItemGeneralization__ViewsAlternatives_2_02706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ItemGeneralization__ViewsAlternatives_2_02723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ItemMapping__ItemAlternatives_0_02755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ItemMapping__ItemAlternatives_0_02772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ItemMapping__ActAlternatives_1_02805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ItemMapping__ActAlternatives_1_02825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNeg_expr_in_rule__Unary_expr__Alternatives2859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_expr_in_rule__Unary_expr__Alternatives2876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary_expr__NameAssignment_0_in_rule__Primary_expr__Alternatives2908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary_expr__Group_1__0_in_rule__Primary_expr__Alternatives2926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Primary_expr__NameAlternatives_0_02959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Primary_expr__NameAlternatives_0_02976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Default__Alternatives_13009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Default__Alternatives_13029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Default__Alternatives_13049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureInclusionExclusion__ExceptAssignment_0_in_rule__FeatureInclusionExclusion__Alternatives3083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FeatureInclusionExclusion__OnlyAssignment_1_in_rule__FeatureInclusionExclusion__Alternatives3101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExceptFeature__FtsAlternatives_1_03134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ExceptFeature__FtsAlternatives_1_03151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OnlyFeature__FtsAlternatives_1_03183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__OnlyFeature__FtsAlternatives_1_03200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProductInclusionExclusion__ExceptAssignment_0_in_rule__ProductInclusionExclusion__Alternatives3232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProductInclusionExclusion__OnlyAssignment_1_in_rule__ProductInclusionExclusion__Alternatives3250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExceptProduct__PdsAlternatives_1_03283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ExceptProduct__PdsAlternatives_1_03300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OnlyProduct__PdsAlternatives_1_03332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__OnlyProduct__PdsAlternatives_1_03349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Rewriting__Alternatives_03382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Rewriting__Alternatives_03402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Rewriting__OftAlternatives_1_03436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Rewriting__OftAlternatives_1_03453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MultiValueInterpretation__ValAlternatives_0_03485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__MultiValueInterpretation__ValAlternatives_0_03502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__KindRelation__Alternatives3535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__KindRelation__Alternatives3556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__KindRelation__Alternatives3577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__KindRelation__Alternatives3598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__FileFormat__Alternatives3634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__FileFormat__Alternatives3655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__FileFormat__Alternatives3676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__VariabilityInterpretation__Alternatives3712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__VariabilityInterpretation__Alternatives3733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__VariabilityInterpretation__Alternatives3754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__VariabilityInterpretation__Alternatives3775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__VariabilityInterpretation__Alternatives3796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SToFMModel__Group__0__Impl_in_rule__SToFMModel__Group__03829 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__SToFMModel__Group__1_in_rule__SToFMModel__Group__03832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SToFMModel__ImportViewsAssignment_0_in_rule__SToFMModel__Group__0__Impl3859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SToFMModel__Group__1__Impl_in_rule__SToFMModel__Group__13889 = new BitSet(new long[]{0x0008000800038000L});
    public static final BitSet FOLLOW_rule__SToFMModel__Group__2_in_rule__SToFMModel__Group__13892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SToFMModel__SplNameAssignment_1_in_rule__SToFMModel__Group__1__Impl3919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SToFMModel__Group__2__Impl_in_rule__SToFMModel__Group__23949 = new BitSet(new long[]{0x0008000800038000L});
    public static final BitSet FOLLOW_rule__SToFMModel__Group__3_in_rule__SToFMModel__Group__23952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SToFMModel__SchemaAssignment_2_in_rule__SToFMModel__Group__2__Impl3979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SToFMModel__Group__3__Impl_in_rule__SToFMModel__Group__34010 = new BitSet(new long[]{0x0008000800038000L});
    public static final BitSet FOLLOW_rule__SToFMModel__Group__4_in_rule__SToFMModel__Group__34013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SToFMModel__DefaultAssignment_3_in_rule__SToFMModel__Group__3__Impl4040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SToFMModel__Group__4__Impl_in_rule__SToFMModel__Group__44071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SToFMModel__ScopingAssignment_4_in_rule__SToFMModel__Group__4__Impl4098 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_rule__ImportViews__Group__0__Impl_in_rule__ImportViews__Group__04139 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ImportViews__Group__1_in_rule__ImportViews__Group__04142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ImportViews__Group__0__Impl4170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportViews__Group__1__Impl_in_rule__ImportViews__Group__14201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImportViews__ViewsAssignment_1_in_rule__ImportViews__Group__1__Impl4230 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ImportViews__ViewsAssignment_1_in_rule__ImportViews__Group__1__Impl4242 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__DataView__Group__0__Impl_in_rule__DataView__Group__04279 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__DataView__Group__1_in_rule__DataView__Group__04282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataView__FileAssignment_0_in_rule__DataView__Group__0__Impl4309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataView__Group__1__Impl_in_rule__DataView__Group__14339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataView__Group_1__0_in_rule__DataView__Group__1__Impl4366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataView__Group_1__0__Impl_in_rule__DataView__Group_1__04401 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DataView__Group_1__1_in_rule__DataView__Group_1__04404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__DataView__Group_1__0__Impl4432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataView__Group_1__1__Impl_in_rule__DataView__Group_1__14463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataView__ViewnameAssignment_1_1_in_rule__DataView__Group_1__1__Impl4490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPLName__Group__0__Impl_in_rule__SPLName__Group__04524 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__SPLName__Group__1_in_rule__SPLName__Group__04527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__SPLName__Group__0__Impl4555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPLName__Group__1__Impl_in_rule__SPLName__Group__14586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPLName__NameAssignment_1_in_rule__SPLName__Group__1__Impl4613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructuringInformation__Group__0__Impl_in_rule__StructuringInformation__Group__04647 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__StructuringInformation__Group__1_in_rule__StructuringInformation__Group__04650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructuringInformation__Group__1__Impl_in_rule__StructuringInformation__Group__14708 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__StructuringInformation__Group__2_in_rule__StructuringInformation__Group__14711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__StructuringInformation__Group__1__Impl4739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructuringInformation__Group__2__Impl_in_rule__StructuringInformation__Group__24770 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__StructuringInformation__Group__3_in_rule__StructuringInformation__Group__24773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructuringInformation__RelationsAssignment_2_in_rule__StructuringInformation__Group__2__Impl4800 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__StructuringInformation__Group__3__Impl_in_rule__StructuringInformation__Group__34831 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__StructuringInformation__Group__4_in_rule__StructuringInformation__Group__34834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructuringInformation__AbstractAssignment_3_in_rule__StructuringInformation__Group__3__Impl4861 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__StructuringInformation__Group__4__Impl_in_rule__StructuringInformation__Group__44892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StructuringInformation__MpAssignment_4_in_rule__StructuringInformation__Group__4__Impl4919 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__ItemRelation__Group__0__Impl_in_rule__ItemRelation__Group__04960 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_rule__ItemRelation__Group__1_in_rule__ItemRelation__Group__04963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemRelation__View1Assignment_0_in_rule__ItemRelation__Group__0__Impl4990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemRelation__Group__1__Impl_in_rule__ItemRelation__Group__15020 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ItemRelation__Group__2_in_rule__ItemRelation__Group__15023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemRelation__RelAssignment_1_in_rule__ItemRelation__Group__1__Impl5050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemRelation__Group__2__Impl_in_rule__ItemRelation__Group__25080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemRelation__View2Assignment_2_in_rule__ItemRelation__Group__2__Impl5107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemGeneralization__Group__0__Impl_in_rule__ItemGeneralization__Group__05143 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__ItemGeneralization__Group__1_in_rule__ItemGeneralization__Group__05146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemGeneralization__GeneralizeAssignment_0_in_rule__ItemGeneralization__Group__0__Impl5173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemGeneralization__Group__1__Impl_in_rule__ItemGeneralization__Group__15203 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ItemGeneralization__Group__2_in_rule__ItemGeneralization__Group__15206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemGeneralization__Alternatives_1_in_rule__ItemGeneralization__Group__1__Impl5233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemGeneralization__Group__2__Impl_in_rule__ItemGeneralization__Group__25263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemGeneralization__ViewsAssignment_2_in_rule__ItemGeneralization__Group__2__Impl5292 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__ItemGeneralization__ViewsAssignment_2_in_rule__ItemGeneralization__Group__2__Impl5304 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__ItemMapping__Group__0__Impl_in_rule__ItemMapping__Group__05343 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__ItemMapping__Group__1_in_rule__ItemMapping__Group__05346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemMapping__ItemAssignment_0_in_rule__ItemMapping__Group__0__Impl5373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemMapping__Group__1__Impl_in_rule__ItemMapping__Group__15403 = new BitSet(new long[]{0x000000C000000030L});
    public static final BitSet FOLLOW_rule__ItemMapping__Group__2_in_rule__ItemMapping__Group__15406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemMapping__ActAssignment_1_in_rule__ItemMapping__Group__1__Impl5433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemMapping__Group__2__Impl_in_rule__ItemMapping__Group__25463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemMapping__PftsAssignment_2_in_rule__ItemMapping__Group__2__Impl5490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or_expr__Group__0__Impl_in_rule__Or_expr__Group__05526 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Or_expr__Group__1_in_rule__Or_expr__Group__05529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_expr_in_rule__Or_expr__Group__0__Impl5556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or_expr__Group__1__Impl_in_rule__Or_expr__Group__15585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or_expr__Group_1__0_in_rule__Or_expr__Group__1__Impl5612 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__Or_expr__Group_1__0__Impl_in_rule__Or_expr__Group_1__05647 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Or_expr__Group_1__1_in_rule__Or_expr__Group_1__05650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or_expr__Group_1__1__Impl_in_rule__Or_expr__Group_1__15708 = new BitSet(new long[]{0x000000C000000030L});
    public static final BitSet FOLLOW_rule__Or_expr__Group_1__2_in_rule__Or_expr__Group_1__15711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Or_expr__Group_1__1__Impl5739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or_expr__Group_1__2__Impl_in_rule__Or_expr__Group_1__25770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Or_expr__RightAssignment_1_2_in_rule__Or_expr__Group_1__2__Impl5797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And_expr__Group__0__Impl_in_rule__And_expr__Group__05833 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__And_expr__Group__1_in_rule__And_expr__Group__05836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnary_expr_in_rule__And_expr__Group__0__Impl5863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And_expr__Group__1__Impl_in_rule__And_expr__Group__15892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And_expr__Group_1__0_in_rule__And_expr__Group__1__Impl5919 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__And_expr__Group_1__0__Impl_in_rule__And_expr__Group_1__05954 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__And_expr__Group_1__1_in_rule__And_expr__Group_1__05957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And_expr__Group_1__1__Impl_in_rule__And_expr__Group_1__16015 = new BitSet(new long[]{0x000000C000000030L});
    public static final BitSet FOLLOW_rule__And_expr__Group_1__2_in_rule__And_expr__Group_1__16018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__And_expr__Group_1__1__Impl6046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And_expr__Group_1__2__Impl_in_rule__And_expr__Group_1__26077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__And_expr__RightAssignment_1_2_in_rule__And_expr__Group_1__2__Impl6104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Neg_expr__Group__0__Impl_in_rule__Neg_expr__Group__06140 = new BitSet(new long[]{0x000000C000000030L});
    public static final BitSet FOLLOW_rule__Neg_expr__Group__1_in_rule__Neg_expr__Group__06143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Neg_expr__Group__0__Impl6171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Neg_expr__Group__1__Impl_in_rule__Neg_expr__Group__16202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Neg_expr__ExprAssignment_1_in_rule__Neg_expr__Group__1__Impl6229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary_expr__Group_1__0__Impl_in_rule__Primary_expr__Group_1__06263 = new BitSet(new long[]{0x000000C000000030L});
    public static final BitSet FOLLOW_rule__Primary_expr__Group_1__1_in_rule__Primary_expr__Group_1__06266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Primary_expr__Group_1__0__Impl6294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary_expr__Group_1__1__Impl_in_rule__Primary_expr__Group_1__16325 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Primary_expr__Group_1__2_in_rule__Primary_expr__Group_1__16328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_expr_in_rule__Primary_expr__Group_1__1__Impl6355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary_expr__Group_1__2__Impl_in_rule__Primary_expr__Group_1__26384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Primary_expr__Group_1__2__Impl6412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Default__Group__0__Impl_in_rule__Default__Group__06449 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_rule__Default__Group__1_in_rule__Default__Group__06452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Default__Group__1__Impl_in_rule__Default__Group__16510 = new BitSet(new long[]{0x0180020000000000L});
    public static final BitSet FOLLOW_rule__Default__Group__2_in_rule__Default__Group__16513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Default__Alternatives_1_in_rule__Default__Group__1__Impl6540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Default__Group__2__Impl_in_rule__Default__Group__26570 = new BitSet(new long[]{0x0180020000000000L});
    public static final BitSet FOLLOW_rule__Default__Group__3_in_rule__Default__Group__26573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Default__ConfigsAssignment_2_in_rule__Default__Group__2__Impl6600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Default__Group__3__Impl_in_rule__Default__Group__36631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Default__ProductsAssignment_3_in_rule__Default__Group__3__Impl6658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParsingConfiguration__Group__0__Impl_in_rule__ParsingConfiguration__Group__06697 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__ParsingConfiguration__Group__1_in_rule__ParsingConfiguration__Group__06700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParsingConfiguration__Group__1__Impl_in_rule__ParsingConfiguration__Group__16758 = new BitSet(new long[]{0x00007C0000000000L});
    public static final BitSet FOLLOW_rule__ParsingConfiguration__Group__2_in_rule__ParsingConfiguration__Group__16761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ParsingConfiguration__Group__1__Impl6789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParsingConfiguration__Group__2__Impl_in_rule__ParsingConfiguration__Group__26820 = new BitSet(new long[]{0x00007C0000000000L});
    public static final BitSet FOLLOW_rule__ParsingConfiguration__Group__3_in_rule__ParsingConfiguration__Group__26823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParsingConfiguration__ProductIDAssignment_2_in_rule__ParsingConfiguration__Group__2__Impl6850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParsingConfiguration__Group__3__Impl_in_rule__ParsingConfiguration__Group__36881 = new BitSet(new long[]{0x00007C0000000000L});
    public static final BitSet FOLLOW_rule__ParsingConfiguration__Group__4_in_rule__ParsingConfiguration__Group__36884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParsingConfiguration__FormatAssignment_3_in_rule__ParsingConfiguration__Group__3__Impl6911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParsingConfiguration__Group__4__Impl_in_rule__ParsingConfiguration__Group__46942 = new BitSet(new long[]{0x00007C0000000000L});
    public static final BitSet FOLLOW_rule__ParsingConfiguration__Group__5_in_rule__ParsingConfiguration__Group__46945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParsingConfiguration__SinterpretAssignment_4_in_rule__ParsingConfiguration__Group__4__Impl6972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParsingConfiguration__Group__5__Impl_in_rule__ParsingConfiguration__Group__57003 = new BitSet(new long[]{0x00007C0000000000L});
    public static final BitSet FOLLOW_rule__ParsingConfiguration__Group__6_in_rule__ParsingConfiguration__Group__57006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParsingConfiguration__SeparatorAssignment_5_in_rule__ParsingConfiguration__Group__5__Impl7033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParsingConfiguration__Group__6__Impl_in_rule__ParsingConfiguration__Group__67064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParsingConfiguration__MseparatorAssignment_6_in_rule__ParsingConfiguration__Group__6__Impl7091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormatSpecification__Group__0__Impl_in_rule__FormatSpecification__Group__07136 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_rule__FormatSpecification__Group__1_in_rule__FormatSpecification__Group__07139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__FormatSpecification__Group__0__Impl7167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormatSpecification__Group__1__Impl_in_rule__FormatSpecification__Group__17198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FormatSpecification__FileformatAssignment_1_in_rule__FormatSpecification__Group__1__Impl7225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SyntacticalInterpretation__Group__0__Impl_in_rule__SyntacticalInterpretation__Group__07259 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__SyntacticalInterpretation__Group__1_in_rule__SyntacticalInterpretation__Group__07262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SyntacticalInterpretation__Group__1__Impl_in_rule__SyntacticalInterpretation__Group__17320 = new BitSet(new long[]{0x0007800000000000L});
    public static final BitSet FOLLOW_rule__SyntacticalInterpretation__Group__2_in_rule__SyntacticalInterpretation__Group__17323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__SyntacticalInterpretation__Group__1__Impl7351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SyntacticalInterpretation__Group__2__Impl_in_rule__SyntacticalInterpretation__Group__27382 = new BitSet(new long[]{0x0007800000000000L});
    public static final BitSet FOLLOW_rule__SyntacticalInterpretation__Group__3_in_rule__SyntacticalInterpretation__Group__27385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SyntacticalInterpretation__OptAssignment_2_in_rule__SyntacticalInterpretation__Group__2__Impl7412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SyntacticalInterpretation__Group__3__Impl_in_rule__SyntacticalInterpretation__Group__37443 = new BitSet(new long[]{0x0007800000000000L});
    public static final BitSet FOLLOW_rule__SyntacticalInterpretation__Group__4_in_rule__SyntacticalInterpretation__Group__37446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SyntacticalInterpretation__YesAssignment_3_in_rule__SyntacticalInterpretation__Group__3__Impl7473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SyntacticalInterpretation__Group__4__Impl_in_rule__SyntacticalInterpretation__Group__47504 = new BitSet(new long[]{0x0007800000000000L});
    public static final BitSet FOLLOW_rule__SyntacticalInterpretation__Group__5_in_rule__SyntacticalInterpretation__Group__47507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SyntacticalInterpretation__NoAssignment_4_in_rule__SyntacticalInterpretation__Group__4__Impl7534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SyntacticalInterpretation__Group__5__Impl_in_rule__SyntacticalInterpretation__Group__57565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SyntacticalInterpretation__NaAssignment_5_in_rule__SyntacticalInterpretation__Group__5__Impl7592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Key__Group__0__Impl_in_rule__Key__Group__07635 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Key__Group__1_in_rule__Key__Group__07638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Key__Group__0__Impl7666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Key__Group__1__Impl_in_rule__Key__Group__17697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Key__CidAssignment_1_in_rule__Key__Group__1__Impl7726 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Key__CidAssignment_1_in_rule__Key__Group__1__Impl7738 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__CSVSeparator__Group__0__Impl_in_rule__CSVSeparator__Group__07775 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CSVSeparator__Group__1_in_rule__CSVSeparator__Group__07778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__CSVSeparator__Group__0__Impl7806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSVSeparator__Group__1__Impl_in_rule__CSVSeparator__Group__17837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSVSeparator__SepAssignment_1_in_rule__CSVSeparator__Group__1__Impl7864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSVMultiSeparator__Group__0__Impl_in_rule__CSVMultiSeparator__Group__07898 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__CSVMultiSeparator__Group__1_in_rule__CSVMultiSeparator__Group__07901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__CSVMultiSeparator__Group__0__Impl7929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSVMultiSeparator__Group__1__Impl_in_rule__CSVMultiSeparator__Group__17960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CSVMultiSeparator__SepsAssignment_1_in_rule__CSVMultiSeparator__Group__1__Impl7989 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__CSVMultiSeparator__SepsAssignment_1_in_rule__CSVMultiSeparator__Group__1__Impl8001 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Optional__Group__0__Impl_in_rule__Optional__Group__08038 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Optional__Group__1_in_rule__Optional__Group__08041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Optional__Group__0__Impl8069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group__1__Impl_in_rule__Optional__Group__18100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__ValuesAssignment_1_in_rule__Optional__Group__1__Impl8129 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Optional__ValuesAssignment_1_in_rule__Optional__Group__1__Impl8141 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__0__Impl_in_rule__Mandatory__Group__08178 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__1_in_rule__Mandatory__Group__08181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Mandatory__Group__0__Impl8209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__Group__1__Impl_in_rule__Mandatory__Group__18240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__ValuesAssignment_1_in_rule__Mandatory__Group__1__Impl8269 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Mandatory__ValuesAssignment_1_in_rule__Mandatory__Group__1__Impl8281 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__NotPresent__Group__0__Impl_in_rule__NotPresent__Group__08318 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NotPresent__Group__1_in_rule__NotPresent__Group__08321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__NotPresent__Group__0__Impl8349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotPresent__Group__1__Impl_in_rule__NotPresent__Group__18380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NotPresent__ValuesAssignment_1_in_rule__NotPresent__Group__1__Impl8409 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__NotPresent__ValuesAssignment_1_in_rule__NotPresent__Group__1__Impl8421 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Unknown__Group__0__Impl_in_rule__Unknown__Group__08458 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Unknown__Group__1_in_rule__Unknown__Group__08461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Unknown__Group__0__Impl8489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unknown__Group__1__Impl_in_rule__Unknown__Group__18520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Unknown__ValuesAssignment_1_in_rule__Unknown__Group__1__Impl8549 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Unknown__ValuesAssignment_1_in_rule__Unknown__Group__1__Impl8561 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ScopingView__Group__0__Impl_in_rule__ScopingView__Group__08598 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ScopingView__Group__1_in_rule__ScopingView__Group__08601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__ScopingView__Group__0__Impl8629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScopingView__Group__1__Impl_in_rule__ScopingView__Group__18660 = new BitSet(new long[]{0x05F00208000C0000L});
    public static final BitSet FOLLOW_rule__ScopingView__Group__2_in_rule__ScopingView__Group__18663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScopingView__ViewAssignment_1_in_rule__ScopingView__Group__1__Impl8690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScopingView__Group__2__Impl_in_rule__ScopingView__Group__28720 = new BitSet(new long[]{0x05F00208000C0000L});
    public static final BitSet FOLLOW_rule__ScopingView__Group__3_in_rule__ScopingView__Group__28723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScopingView__ViewnameAssignment_2_in_rule__ScopingView__Group__2__Impl8750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScopingView__Group__3__Impl_in_rule__ScopingView__Group__38781 = new BitSet(new long[]{0x05F00208000C0000L});
    public static final BitSet FOLLOW_rule__ScopingView__Group__4_in_rule__ScopingView__Group__38784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScopingView__SchemaAssignment_3_in_rule__ScopingView__Group__3__Impl8811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScopingView__Group__4__Impl_in_rule__ScopingView__Group__48842 = new BitSet(new long[]{0x05F00208000C0000L});
    public static final BitSet FOLLOW_rule__ScopingView__Group__5_in_rule__ScopingView__Group__48845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScopingView__ConfigAssignment_4_in_rule__ScopingView__Group__4__Impl8872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScopingView__Group__5__Impl_in_rule__ScopingView__Group__58903 = new BitSet(new long[]{0x05F00208000C0000L});
    public static final BitSet FOLLOW_rule__ScopingView__Group__6_in_rule__ScopingView__Group__58906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScopingView__ProductsAssignment_5_in_rule__ScopingView__Group__5__Impl8933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScopingView__Group__6__Impl_in_rule__ScopingView__Group__68964 = new BitSet(new long[]{0x05F00208000C0000L});
    public static final BitSet FOLLOW_rule__ScopingView__Group__7_in_rule__ScopingView__Group__68967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScopingView__FtsAssignment_6_in_rule__ScopingView__Group__6__Impl8994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScopingView__Group__7__Impl_in_rule__ScopingView__Group__79025 = new BitSet(new long[]{0x05F00208000C0000L});
    public static final BitSet FOLLOW_rule__ScopingView__Group__8_in_rule__ScopingView__Group__79028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScopingView__AlignmentAssignment_7_in_rule__ScopingView__Group__7__Impl9055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScopingView__Group__8__Impl_in_rule__ScopingView__Group__89086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ScopingView__InterpretationAssignment_8_in_rule__ScopingView__Group__8__Impl9113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewName__Group__0__Impl_in_rule__ViewName__Group__09162 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ViewName__Group__1_in_rule__ViewName__Group__09165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__ViewName__Group__0__Impl9193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewName__Group__1__Impl_in_rule__ViewName__Group__19224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ViewName__NameAssignment_1_in_rule__ViewName__Group__1__Impl9251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExceptFeature__Group__0__Impl_in_rule__ExceptFeature__Group__09285 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ExceptFeature__Group__1_in_rule__ExceptFeature__Group__09288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__ExceptFeature__Group__0__Impl9316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExceptFeature__Group__1__Impl_in_rule__ExceptFeature__Group__19347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExceptFeature__FtsAssignment_1_in_rule__ExceptFeature__Group__1__Impl9376 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__ExceptFeature__FtsAssignment_1_in_rule__ExceptFeature__Group__1__Impl9388 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__OnlyFeature__Group__0__Impl_in_rule__OnlyFeature__Group__09425 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__OnlyFeature__Group__1_in_rule__OnlyFeature__Group__09428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__OnlyFeature__Group__0__Impl9456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OnlyFeature__Group__1__Impl_in_rule__OnlyFeature__Group__19487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OnlyFeature__FtsAssignment_1_in_rule__OnlyFeature__Group__1__Impl9516 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__OnlyFeature__FtsAssignment_1_in_rule__OnlyFeature__Group__1__Impl9528 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__ExceptProduct__Group__0__Impl_in_rule__ExceptProduct__Group__09565 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ExceptProduct__Group__1_in_rule__ExceptProduct__Group__09568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_rule__ExceptProduct__Group__0__Impl9596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExceptProduct__Group__1__Impl_in_rule__ExceptProduct__Group__19627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExceptProduct__PdsAssignment_1_in_rule__ExceptProduct__Group__1__Impl9656 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__ExceptProduct__PdsAssignment_1_in_rule__ExceptProduct__Group__1__Impl9668 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__OnlyProduct__Group__0__Impl_in_rule__OnlyProduct__Group__09705 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__OnlyProduct__Group__1_in_rule__OnlyProduct__Group__09708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rule__OnlyProduct__Group__0__Impl9736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OnlyProduct__Group__1__Impl_in_rule__OnlyProduct__Group__19767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OnlyProduct__PdsAssignment_1_in_rule__OnlyProduct__Group__1__Impl9796 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__OnlyProduct__PdsAssignment_1_in_rule__OnlyProduct__Group__1__Impl9808 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__Rewriting__Group__0__Impl_in_rule__Rewriting__Group__09845 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Rewriting__Group__1_in_rule__Rewriting__Group__09848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rewriting__Alternatives_0_in_rule__Rewriting__Group__0__Impl9875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rewriting__Group__1__Impl_in_rule__Rewriting__Group__19905 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_rule__Rewriting__Group__2_in_rule__Rewriting__Group__19908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rewriting__OftAssignment_1_in_rule__Rewriting__Group__1__Impl9935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rewriting__Group__2__Impl_in_rule__Rewriting__Group__29965 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Rewriting__Group__3_in_rule__Rewriting__Group__29968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__Rewriting__Group__2__Impl9996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rewriting__Group__3__Impl_in_rule__Rewriting__Group__310027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rewriting__NftAssignment_3_in_rule__Rewriting__Group__3__Impl10054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiValuesInterpretation__Group__0__Impl_in_rule__MultiValuesInterpretation__Group__010092 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__MultiValuesInterpretation__Group__1_in_rule__MultiValuesInterpretation__Group__010095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rule__MultiValuesInterpretation__Group__0__Impl10123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiValuesInterpretation__Group__1__Impl_in_rule__MultiValuesInterpretation__Group__110154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiValuesInterpretation__MultiAssignment_1_in_rule__MultiValuesInterpretation__Group__1__Impl10183 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__MultiValuesInterpretation__MultiAssignment_1_in_rule__MultiValuesInterpretation__Group__1__Impl10195 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_rule__MultiValueInterpretation__Group__0__Impl_in_rule__MultiValueInterpretation__Group__010232 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_rule__MultiValueInterpretation__Group__1_in_rule__MultiValueInterpretation__Group__010235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiValueInterpretation__ValAssignment_0_in_rule__MultiValueInterpretation__Group__0__Impl10262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiValueInterpretation__Group__1__Impl_in_rule__MultiValueInterpretation__Group__110292 = new BitSet(new long[]{0x00000000F8000000L});
    public static final BitSet FOLLOW_rule__MultiValueInterpretation__Group__2_in_rule__MultiValueInterpretation__Group__110295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rule__MultiValueInterpretation__Group__1__Impl10323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiValueInterpretation__Group__2__Impl_in_rule__MultiValueInterpretation__Group__210354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiValueInterpretation__VariabilityAssignment_2_in_rule__MultiValueInterpretation__Group__2__Impl10381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportViews_in_rule__SToFMModel__ImportViewsAssignment_010422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPLName_in_rule__SToFMModel__SplNameAssignment_110453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructuringInformation_in_rule__SToFMModel__SchemaAssignment_210484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefault_in_rule__SToFMModel__DefaultAssignment_310515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScopingView_in_rule__SToFMModel__ScopingAssignment_410546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataView_in_rule__ImportViews__ViewsAssignment_110577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__DataView__FileAssignment_010608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DataView__ViewnameAssignment_1_110639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SPLName__NameAlternatives_1_0_in_rule__SPLName__NameAssignment_110670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemRelation_in_rule__StructuringInformation__RelationsAssignment_210703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemGeneralization_in_rule__StructuringInformation__AbstractAssignment_310734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemMapping_in_rule__StructuringInformation__MpAssignment_410765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemRelation__View1Alternatives_0_0_in_rule__ItemRelation__View1Assignment_010796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKindRelation_in_rule__ItemRelation__RelAssignment_110829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemRelation__View2Alternatives_2_0_in_rule__ItemRelation__View2Assignment_210860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemGeneralization__GeneralizeAlternatives_0_0_in_rule__ItemGeneralization__GeneralizeAssignment_010893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemGeneralization__ViewsAlternatives_2_0_in_rule__ItemGeneralization__ViewsAssignment_210926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemMapping__ItemAlternatives_0_0_in_rule__ItemMapping__ItemAssignment_010959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ItemMapping__ActAlternatives_1_0_in_rule__ItemMapping__ActAssignment_110992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateItem_in_rule__ItemMapping__PftsAssignment_211025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_expr_in_rule__Or_expr__RightAssignment_1_211056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnary_expr_in_rule__And_expr__RightAssignment_1_211087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_expr_in_rule__Neg_expr__ExprAssignment_111118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Primary_expr__NameAlternatives_0_0_in_rule__Primary_expr__NameAssignment_011149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParsingConfiguration_in_rule__Default__ConfigsAssignment_211182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScopingProducts_in_rule__Default__ProductsAssignment_311213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKey_in_rule__ParsingConfiguration__ProductIDAssignment_211244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormatSpecification_in_rule__ParsingConfiguration__FormatAssignment_311275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSyntacticalInterpretation_in_rule__ParsingConfiguration__SinterpretAssignment_411306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSVSeparator_in_rule__ParsingConfiguration__SeparatorAssignment_511337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSVMultiSeparator_in_rule__ParsingConfiguration__MseparatorAssignment_611368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFileFormat_in_rule__FormatSpecification__FileformatAssignment_111399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptional_in_rule__SyntacticalInterpretation__OptAssignment_211430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_rule__SyntacticalInterpretation__YesAssignment_311461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotPresent_in_rule__SyntacticalInterpretation__NoAssignment_411492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnknown_in_rule__SyntacticalInterpretation__NaAssignment_511523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Key__CidAssignment_111554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CSVSeparator__SepAssignment_111585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__CSVMultiSeparator__SepsAssignment_111616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Optional__ValuesAssignment_111647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Mandatory__ValuesAssignment_111678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__NotPresent__ValuesAssignment_111709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Unknown__ValuesAssignment_111740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ScopingView__ViewAssignment_111771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewName_in_rule__ScopingView__ViewnameAssignment_211802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructuringInformation_in_rule__ScopingView__SchemaAssignment_311833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParsingConfiguration_in_rule__ScopingView__ConfigAssignment_411864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScopingProducts_in_rule__ScopingView__ProductsAssignment_511895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScopingFeatures_in_rule__ScopingView__FtsAssignment_611926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRewriting_in_rule__ScopingView__AlignmentAssignment_711957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiValuesInterpretation_in_rule__ScopingView__InterpretationAssignment_811988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__ViewName__NameAssignment_112019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptFeature_in_rule__FeatureInclusionExclusion__ExceptAssignment_012050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnlyFeature_in_rule__FeatureInclusionExclusion__OnlyAssignment_112081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExceptFeature__FtsAlternatives_1_0_in_rule__ExceptFeature__FtsAssignment_112112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OnlyFeature__FtsAlternatives_1_0_in_rule__OnlyFeature__FtsAssignment_112145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptProduct_in_rule__ProductInclusionExclusion__ExceptAssignment_012178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnlyProduct_in_rule__ProductInclusionExclusion__OnlyAssignment_112209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExceptProduct__PdsAlternatives_1_0_in_rule__ExceptProduct__PdsAssignment_112240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OnlyProduct__PdsAlternatives_1_0_in_rule__OnlyProduct__PdsAssignment_112273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rewriting__OftAlternatives_1_0_in_rule__Rewriting__OftAssignment_112306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Rewriting__NftAssignment_312339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiValueInterpretation_in_rule__MultiValuesInterpretation__MultiAssignment_112370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MultiValueInterpretation__ValAlternatives_0_0_in_rule__MultiValueInterpretation__ValAssignment_012401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariabilityInterpretation_in_rule__MultiValueInterpretation__VariabilityAssignment_212434 = new BitSet(new long[]{0x0000000000000002L});

}