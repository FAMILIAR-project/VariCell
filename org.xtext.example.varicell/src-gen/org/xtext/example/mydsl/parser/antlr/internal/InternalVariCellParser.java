package org.xtext.example.mydsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.VariCellGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVariCellParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'import:'", "'as'", "'name:'", "'structure:'", "'generalize'", "'abstract'", "'replace'", "'correspondsTo'", "'or'", "'and'", "'not'", "'('", "')'", "'default:'", "'allviews:'", "'all:'", "'parsing:'", "'format:'", "'variability:'", "'key:'", "'separator:'", "'multivalued_separator:'", "'optional:'", "'mandatory:'", "'notpresent:'", "'unknown:'", "'view:'", "'rootname:'", "'except_features:'", "'only_features:'", "'except_products:'", "'only_products:'", "'rewriting:'", "'renaming:'", "'=>'", "'multivalues:'", "'below'", "'above'", "'moveIn'", "'copyIn'", "'CSV'", "'RDF'", "'XML'", "'Alternatives'", "'OR-Alternatives'", "'Optional'", "'Mandatory'", "'Concat'"
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
    public String getGrammarFileName() { return "../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g"; }



     	private VariCellGrammarAccess grammarAccess;
     	
        public InternalVariCellParser(TokenStream input, VariCellGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "SToFMModel";	
       	}
       	
       	@Override
       	protected VariCellGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleSToFMModel"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:68:1: entryRuleSToFMModel returns [EObject current=null] : iv_ruleSToFMModel= ruleSToFMModel EOF ;
    public final EObject entryRuleSToFMModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSToFMModel = null;


        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:69:2: (iv_ruleSToFMModel= ruleSToFMModel EOF )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:70:2: iv_ruleSToFMModel= ruleSToFMModel EOF
            {
             newCompositeNode(grammarAccess.getSToFMModelRule()); 
            pushFollow(FOLLOW_ruleSToFMModel_in_entryRuleSToFMModel75);
            iv_ruleSToFMModel=ruleSToFMModel();

            state._fsp--;

             current =iv_ruleSToFMModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSToFMModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSToFMModel"


    // $ANTLR start "ruleSToFMModel"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:77:1: ruleSToFMModel returns [EObject current=null] : ( ( (lv_importViews_0_0= ruleImportViews ) ) ( (lv_splName_1_0= ruleSPLName ) ) ( (lv_schema_2_0= ruleStructuringInformation ) )? ( (lv_default_3_0= ruleDefault ) )? ( (lv_scoping_4_0= ruleScopingView ) )* ) ;
    public final EObject ruleSToFMModel() throws RecognitionException {
        EObject current = null;

        EObject lv_importViews_0_0 = null;

        EObject lv_splName_1_0 = null;

        EObject lv_schema_2_0 = null;

        EObject lv_default_3_0 = null;

        EObject lv_scoping_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:80:28: ( ( ( (lv_importViews_0_0= ruleImportViews ) ) ( (lv_splName_1_0= ruleSPLName ) ) ( (lv_schema_2_0= ruleStructuringInformation ) )? ( (lv_default_3_0= ruleDefault ) )? ( (lv_scoping_4_0= ruleScopingView ) )* ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:81:1: ( ( (lv_importViews_0_0= ruleImportViews ) ) ( (lv_splName_1_0= ruleSPLName ) ) ( (lv_schema_2_0= ruleStructuringInformation ) )? ( (lv_default_3_0= ruleDefault ) )? ( (lv_scoping_4_0= ruleScopingView ) )* )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:81:1: ( ( (lv_importViews_0_0= ruleImportViews ) ) ( (lv_splName_1_0= ruleSPLName ) ) ( (lv_schema_2_0= ruleStructuringInformation ) )? ( (lv_default_3_0= ruleDefault ) )? ( (lv_scoping_4_0= ruleScopingView ) )* )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:81:2: ( (lv_importViews_0_0= ruleImportViews ) ) ( (lv_splName_1_0= ruleSPLName ) ) ( (lv_schema_2_0= ruleStructuringInformation ) )? ( (lv_default_3_0= ruleDefault ) )? ( (lv_scoping_4_0= ruleScopingView ) )*
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:81:2: ( (lv_importViews_0_0= ruleImportViews ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:82:1: (lv_importViews_0_0= ruleImportViews )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:82:1: (lv_importViews_0_0= ruleImportViews )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:83:3: lv_importViews_0_0= ruleImportViews
            {
             
            	        newCompositeNode(grammarAccess.getSToFMModelAccess().getImportViewsImportViewsParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleImportViews_in_ruleSToFMModel131);
            lv_importViews_0_0=ruleImportViews();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSToFMModelRule());
            	        }
                   		set(
                   			current, 
                   			"importViews",
                    		lv_importViews_0_0, 
                    		"ImportViews");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:99:2: ( (lv_splName_1_0= ruleSPLName ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:100:1: (lv_splName_1_0= ruleSPLName )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:100:1: (lv_splName_1_0= ruleSPLName )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:101:3: lv_splName_1_0= ruleSPLName
            {
             
            	        newCompositeNode(grammarAccess.getSToFMModelAccess().getSplNameSPLNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSPLName_in_ruleSToFMModel152);
            lv_splName_1_0=ruleSPLName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSToFMModelRule());
            	        }
                   		set(
                   			current, 
                   			"splName",
                    		lv_splName_1_0, 
                    		"SPLName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:117:2: ( (lv_schema_2_0= ruleStructuringInformation ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:118:1: (lv_schema_2_0= ruleStructuringInformation )
                    {
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:118:1: (lv_schema_2_0= ruleStructuringInformation )
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:119:3: lv_schema_2_0= ruleStructuringInformation
                    {
                     
                    	        newCompositeNode(grammarAccess.getSToFMModelAccess().getSchemaStructuringInformationParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStructuringInformation_in_ruleSToFMModel173);
                    lv_schema_2_0=ruleStructuringInformation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSToFMModelRule());
                    	        }
                           		set(
                           			current, 
                           			"schema",
                            		lv_schema_2_0, 
                            		"StructuringInformation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:135:3: ( (lv_default_3_0= ruleDefault ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=24 && LA2_0<=26)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:136:1: (lv_default_3_0= ruleDefault )
                    {
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:136:1: (lv_default_3_0= ruleDefault )
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:137:3: lv_default_3_0= ruleDefault
                    {
                     
                    	        newCompositeNode(grammarAccess.getSToFMModelAccess().getDefaultDefaultParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDefault_in_ruleSToFMModel195);
                    lv_default_3_0=ruleDefault();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSToFMModelRule());
                    	        }
                           		set(
                           			current, 
                           			"default",
                            		lv_default_3_0, 
                            		"Default");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:153:3: ( (lv_scoping_4_0= ruleScopingView ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==37) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:154:1: (lv_scoping_4_0= ruleScopingView )
            	    {
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:154:1: (lv_scoping_4_0= ruleScopingView )
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:155:3: lv_scoping_4_0= ruleScopingView
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSToFMModelAccess().getScopingScopingViewParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleScopingView_in_ruleSToFMModel217);
            	    lv_scoping_4_0=ruleScopingView();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSToFMModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"scoping",
            	            		lv_scoping_4_0, 
            	            		"ScopingView");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSToFMModel"


    // $ANTLR start "entryRuleImportViews"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:179:1: entryRuleImportViews returns [EObject current=null] : iv_ruleImportViews= ruleImportViews EOF ;
    public final EObject entryRuleImportViews() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportViews = null;


        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:180:2: (iv_ruleImportViews= ruleImportViews EOF )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:181:2: iv_ruleImportViews= ruleImportViews EOF
            {
             newCompositeNode(grammarAccess.getImportViewsRule()); 
            pushFollow(FOLLOW_ruleImportViews_in_entryRuleImportViews254);
            iv_ruleImportViews=ruleImportViews();

            state._fsp--;

             current =iv_ruleImportViews; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportViews264); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImportViews"


    // $ANTLR start "ruleImportViews"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:188:1: ruleImportViews returns [EObject current=null] : (otherlv_0= 'import:' ( (lv_views_1_0= ruleDataView ) )+ ) ;
    public final EObject ruleImportViews() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_views_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:191:28: ( (otherlv_0= 'import:' ( (lv_views_1_0= ruleDataView ) )+ ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:192:1: (otherlv_0= 'import:' ( (lv_views_1_0= ruleDataView ) )+ )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:192:1: (otherlv_0= 'import:' ( (lv_views_1_0= ruleDataView ) )+ )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:192:3: otherlv_0= 'import:' ( (lv_views_1_0= ruleDataView ) )+
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleImportViews301); 

                	newLeafNode(otherlv_0, grammarAccess.getImportViewsAccess().getImportKeyword_0());
                
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:196:1: ( (lv_views_1_0= ruleDataView ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_STRING) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:197:1: (lv_views_1_0= ruleDataView )
            	    {
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:197:1: (lv_views_1_0= ruleDataView )
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:198:3: lv_views_1_0= ruleDataView
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getImportViewsAccess().getViewsDataViewParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDataView_in_ruleImportViews322);
            	    lv_views_1_0=ruleDataView();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getImportViewsRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"views",
            	            		lv_views_1_0, 
            	            		"DataView");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImportViews"


    // $ANTLR start "entryRuleDataView"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:222:1: entryRuleDataView returns [EObject current=null] : iv_ruleDataView= ruleDataView EOF ;
    public final EObject entryRuleDataView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataView = null;


        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:223:2: (iv_ruleDataView= ruleDataView EOF )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:224:2: iv_ruleDataView= ruleDataView EOF
            {
             newCompositeNode(grammarAccess.getDataViewRule()); 
            pushFollow(FOLLOW_ruleDataView_in_entryRuleDataView359);
            iv_ruleDataView=ruleDataView();

            state._fsp--;

             current =iv_ruleDataView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataView369); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataView"


    // $ANTLR start "ruleDataView"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:231:1: ruleDataView returns [EObject current=null] : ( ( (lv_file_0_0= RULE_STRING ) ) (otherlv_1= 'as' ( (lv_viewname_2_0= RULE_ID ) ) )? ) ;
    public final EObject ruleDataView() throws RecognitionException {
        EObject current = null;

        Token lv_file_0_0=null;
        Token otherlv_1=null;
        Token lv_viewname_2_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:234:28: ( ( ( (lv_file_0_0= RULE_STRING ) ) (otherlv_1= 'as' ( (lv_viewname_2_0= RULE_ID ) ) )? ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:235:1: ( ( (lv_file_0_0= RULE_STRING ) ) (otherlv_1= 'as' ( (lv_viewname_2_0= RULE_ID ) ) )? )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:235:1: ( ( (lv_file_0_0= RULE_STRING ) ) (otherlv_1= 'as' ( (lv_viewname_2_0= RULE_ID ) ) )? )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:235:2: ( (lv_file_0_0= RULE_STRING ) ) (otherlv_1= 'as' ( (lv_viewname_2_0= RULE_ID ) ) )?
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:235:2: ( (lv_file_0_0= RULE_STRING ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:236:1: (lv_file_0_0= RULE_STRING )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:236:1: (lv_file_0_0= RULE_STRING )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:237:3: lv_file_0_0= RULE_STRING
            {
            lv_file_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDataView411); 

            			newLeafNode(lv_file_0_0, grammarAccess.getDataViewAccess().getFileSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDataViewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"file",
                    		lv_file_0_0, 
                    		"STRING");
            	    

            }


            }

            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:253:2: (otherlv_1= 'as' ( (lv_viewname_2_0= RULE_ID ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:253:4: otherlv_1= 'as' ( (lv_viewname_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleDataView429); 

                        	newLeafNode(otherlv_1, grammarAccess.getDataViewAccess().getAsKeyword_1_0());
                        
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:257:1: ( (lv_viewname_2_0= RULE_ID ) )
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:258:1: (lv_viewname_2_0= RULE_ID )
                    {
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:258:1: (lv_viewname_2_0= RULE_ID )
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:259:3: lv_viewname_2_0= RULE_ID
                    {
                    lv_viewname_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDataView446); 

                    			newLeafNode(lv_viewname_2_0, grammarAccess.getDataViewAccess().getViewnameIDTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDataViewRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"viewname",
                            		lv_viewname_2_0, 
                            		"ID");
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataView"


    // $ANTLR start "entryRuleSPLName"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:283:1: entryRuleSPLName returns [EObject current=null] : iv_ruleSPLName= ruleSPLName EOF ;
    public final EObject entryRuleSPLName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSPLName = null;


        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:284:2: (iv_ruleSPLName= ruleSPLName EOF )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:285:2: iv_ruleSPLName= ruleSPLName EOF
            {
             newCompositeNode(grammarAccess.getSPLNameRule()); 
            pushFollow(FOLLOW_ruleSPLName_in_entryRuleSPLName489);
            iv_ruleSPLName=ruleSPLName();

            state._fsp--;

             current =iv_ruleSPLName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSPLName499); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSPLName"


    // $ANTLR start "ruleSPLName"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:292:1: ruleSPLName returns [EObject current=null] : (otherlv_0= 'name:' ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID ) ) ) ) ;
    public final EObject ruleSPLName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_1=null;
        Token lv_name_1_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:295:28: ( (otherlv_0= 'name:' ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID ) ) ) ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:296:1: (otherlv_0= 'name:' ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID ) ) ) )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:296:1: (otherlv_0= 'name:' ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID ) ) ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:296:3: otherlv_0= 'name:' ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleSPLName536); 

                	newLeafNode(otherlv_0, grammarAccess.getSPLNameAccess().getNameKeyword_0());
                
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:300:1: ( ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID ) ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:301:1: ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID ) )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:301:1: ( (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:302:1: (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:302:1: (lv_name_1_1= RULE_STRING | lv_name_1_2= RULE_ID )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:303:3: lv_name_1_1= RULE_STRING
                    {
                    lv_name_1_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSPLName555); 

                    			newLeafNode(lv_name_1_1, grammarAccess.getSPLNameAccess().getNameSTRINGTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSPLNameRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_1, 
                            		"STRING");
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:318:8: lv_name_1_2= RULE_ID
                    {
                    lv_name_1_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSPLName575); 

                    			newLeafNode(lv_name_1_2, grammarAccess.getSPLNameAccess().getNameIDTerminalRuleCall_1_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getSPLNameRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_2, 
                            		"ID");
                    	    

                    }
                    break;

            }


            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSPLName"


    // $ANTLR start "entryRuleStructuringInformation"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:344:1: entryRuleStructuringInformation returns [EObject current=null] : iv_ruleStructuringInformation= ruleStructuringInformation EOF ;
    public final EObject entryRuleStructuringInformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructuringInformation = null;


        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:345:2: (iv_ruleStructuringInformation= ruleStructuringInformation EOF )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:346:2: iv_ruleStructuringInformation= ruleStructuringInformation EOF
            {
             newCompositeNode(grammarAccess.getStructuringInformationRule()); 
            pushFollow(FOLLOW_ruleStructuringInformation_in_entryRuleStructuringInformation619);
            iv_ruleStructuringInformation=ruleStructuringInformation();

            state._fsp--;

             current =iv_ruleStructuringInformation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructuringInformation629); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStructuringInformation"


    // $ANTLR start "ruleStructuringInformation"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:353:1: ruleStructuringInformation returns [EObject current=null] : ( () otherlv_1= 'structure:' ( (lv_relations_2_0= ruleItemRelation ) )* ( (lv_abstract_3_0= ruleItemGeneralization ) )* ( (lv_mp_4_0= ruleItemMapping ) )* ) ;
    public final EObject ruleStructuringInformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_relations_2_0 = null;

        EObject lv_abstract_3_0 = null;

        EObject lv_mp_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:356:28: ( ( () otherlv_1= 'structure:' ( (lv_relations_2_0= ruleItemRelation ) )* ( (lv_abstract_3_0= ruleItemGeneralization ) )* ( (lv_mp_4_0= ruleItemMapping ) )* ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:357:1: ( () otherlv_1= 'structure:' ( (lv_relations_2_0= ruleItemRelation ) )* ( (lv_abstract_3_0= ruleItemGeneralization ) )* ( (lv_mp_4_0= ruleItemMapping ) )* )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:357:1: ( () otherlv_1= 'structure:' ( (lv_relations_2_0= ruleItemRelation ) )* ( (lv_abstract_3_0= ruleItemGeneralization ) )* ( (lv_mp_4_0= ruleItemMapping ) )* )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:357:2: () otherlv_1= 'structure:' ( (lv_relations_2_0= ruleItemRelation ) )* ( (lv_abstract_3_0= ruleItemGeneralization ) )* ( (lv_mp_4_0= ruleItemMapping ) )*
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:357:2: ()
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:358:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStructuringInformationAccess().getStructuringInformationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleStructuringInformation675); 

                	newLeafNode(otherlv_1, grammarAccess.getStructuringInformationAccess().getStructureKeyword_1());
                
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:367:1: ( (lv_relations_2_0= ruleItemRelation ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    int LA7_1 = input.LA(2);

                    if ( ((LA7_1>=47 && LA7_1<=50)) ) {
                        alt7=1;
                    }


                }
                else if ( (LA7_0==RULE_STRING) ) {
                    int LA7_2 = input.LA(2);

                    if ( ((LA7_2>=47 && LA7_2<=50)) ) {
                        alt7=1;
                    }


                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:368:1: (lv_relations_2_0= ruleItemRelation )
            	    {
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:368:1: (lv_relations_2_0= ruleItemRelation )
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:369:3: lv_relations_2_0= ruleItemRelation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStructuringInformationAccess().getRelationsItemRelationParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleItemRelation_in_ruleStructuringInformation696);
            	    lv_relations_2_0=ruleItemRelation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStructuringInformationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"relations",
            	            		lv_relations_2_0, 
            	            		"ItemRelation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:385:3: ( (lv_abstract_3_0= ruleItemGeneralization ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    int LA8_1 = input.LA(2);

                    if ( ((LA8_1>=15 && LA8_1<=16)) ) {
                        alt8=1;
                    }


                }
                else if ( (LA8_0==RULE_STRING) ) {
                    int LA8_2 = input.LA(2);

                    if ( ((LA8_2>=15 && LA8_2<=16)) ) {
                        alt8=1;
                    }


                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:386:1: (lv_abstract_3_0= ruleItemGeneralization )
            	    {
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:386:1: (lv_abstract_3_0= ruleItemGeneralization )
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:387:3: lv_abstract_3_0= ruleItemGeneralization
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStructuringInformationAccess().getAbstractItemGeneralizationParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleItemGeneralization_in_ruleStructuringInformation718);
            	    lv_abstract_3_0=ruleItemGeneralization();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStructuringInformationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"abstract",
            	            		lv_abstract_3_0, 
            	            		"ItemGeneralization");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:403:3: ( (lv_mp_4_0= ruleItemMapping ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=RULE_STRING && LA9_0<=RULE_ID)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:404:1: (lv_mp_4_0= ruleItemMapping )
            	    {
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:404:1: (lv_mp_4_0= ruleItemMapping )
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:405:3: lv_mp_4_0= ruleItemMapping
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStructuringInformationAccess().getMpItemMappingParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleItemMapping_in_ruleStructuringInformation740);
            	    lv_mp_4_0=ruleItemMapping();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStructuringInformationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"mp",
            	            		lv_mp_4_0, 
            	            		"ItemMapping");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStructuringInformation"


    // $ANTLR start "entryRuleItemRelation"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:429:1: entryRuleItemRelation returns [EObject current=null] : iv_ruleItemRelation= ruleItemRelation EOF ;
    public final EObject entryRuleItemRelation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemRelation = null;


        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:430:2: (iv_ruleItemRelation= ruleItemRelation EOF )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:431:2: iv_ruleItemRelation= ruleItemRelation EOF
            {
             newCompositeNode(grammarAccess.getItemRelationRule()); 
            pushFollow(FOLLOW_ruleItemRelation_in_entryRuleItemRelation777);
            iv_ruleItemRelation=ruleItemRelation();

            state._fsp--;

             current =iv_ruleItemRelation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItemRelation787); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleItemRelation"


    // $ANTLR start "ruleItemRelation"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:438:1: ruleItemRelation returns [EObject current=null] : ( ( ( (lv_view1_0_1= RULE_ID | lv_view1_0_2= RULE_STRING ) ) ) ( (lv_rel_1_0= ruleKindRelation ) ) ( ( (lv_view2_2_1= RULE_ID | lv_view2_2_2= RULE_STRING ) ) ) ) ;
    public final EObject ruleItemRelation() throws RecognitionException {
        EObject current = null;

        Token lv_view1_0_1=null;
        Token lv_view1_0_2=null;
        Token lv_view2_2_1=null;
        Token lv_view2_2_2=null;
        Enumerator lv_rel_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:441:28: ( ( ( ( (lv_view1_0_1= RULE_ID | lv_view1_0_2= RULE_STRING ) ) ) ( (lv_rel_1_0= ruleKindRelation ) ) ( ( (lv_view2_2_1= RULE_ID | lv_view2_2_2= RULE_STRING ) ) ) ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:442:1: ( ( ( (lv_view1_0_1= RULE_ID | lv_view1_0_2= RULE_STRING ) ) ) ( (lv_rel_1_0= ruleKindRelation ) ) ( ( (lv_view2_2_1= RULE_ID | lv_view2_2_2= RULE_STRING ) ) ) )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:442:1: ( ( ( (lv_view1_0_1= RULE_ID | lv_view1_0_2= RULE_STRING ) ) ) ( (lv_rel_1_0= ruleKindRelation ) ) ( ( (lv_view2_2_1= RULE_ID | lv_view2_2_2= RULE_STRING ) ) ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:442:2: ( ( (lv_view1_0_1= RULE_ID | lv_view1_0_2= RULE_STRING ) ) ) ( (lv_rel_1_0= ruleKindRelation ) ) ( ( (lv_view2_2_1= RULE_ID | lv_view2_2_2= RULE_STRING ) ) )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:442:2: ( ( (lv_view1_0_1= RULE_ID | lv_view1_0_2= RULE_STRING ) ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:443:1: ( (lv_view1_0_1= RULE_ID | lv_view1_0_2= RULE_STRING ) )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:443:1: ( (lv_view1_0_1= RULE_ID | lv_view1_0_2= RULE_STRING ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:444:1: (lv_view1_0_1= RULE_ID | lv_view1_0_2= RULE_STRING )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:444:1: (lv_view1_0_1= RULE_ID | lv_view1_0_2= RULE_STRING )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_STRING) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:445:3: lv_view1_0_1= RULE_ID
                    {
                    lv_view1_0_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleItemRelation831); 

                    			newLeafNode(lv_view1_0_1, grammarAccess.getItemRelationAccess().getView1IDTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getItemRelationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"view1",
                            		lv_view1_0_1, 
                            		"ID");
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:460:8: lv_view1_0_2= RULE_STRING
                    {
                    lv_view1_0_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleItemRelation851); 

                    			newLeafNode(lv_view1_0_2, grammarAccess.getItemRelationAccess().getView1STRINGTerminalRuleCall_0_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getItemRelationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"view1",
                            		lv_view1_0_2, 
                            		"STRING");
                    	    

                    }
                    break;

            }


            }


            }

            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:478:2: ( (lv_rel_1_0= ruleKindRelation ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:479:1: (lv_rel_1_0= ruleKindRelation )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:479:1: (lv_rel_1_0= ruleKindRelation )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:480:3: lv_rel_1_0= ruleKindRelation
            {
             
            	        newCompositeNode(grammarAccess.getItemRelationAccess().getRelKindRelationEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleKindRelation_in_ruleItemRelation880);
            lv_rel_1_0=ruleKindRelation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getItemRelationRule());
            	        }
                   		set(
                   			current, 
                   			"rel",
                    		lv_rel_1_0, 
                    		"KindRelation");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:496:2: ( ( (lv_view2_2_1= RULE_ID | lv_view2_2_2= RULE_STRING ) ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:497:1: ( (lv_view2_2_1= RULE_ID | lv_view2_2_2= RULE_STRING ) )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:497:1: ( (lv_view2_2_1= RULE_ID | lv_view2_2_2= RULE_STRING ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:498:1: (lv_view2_2_1= RULE_ID | lv_view2_2_2= RULE_STRING )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:498:1: (lv_view2_2_1= RULE_ID | lv_view2_2_2= RULE_STRING )
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
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:499:3: lv_view2_2_1= RULE_ID
                    {
                    lv_view2_2_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleItemRelation899); 

                    			newLeafNode(lv_view2_2_1, grammarAccess.getItemRelationAccess().getView2IDTerminalRuleCall_2_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getItemRelationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"view2",
                            		lv_view2_2_1, 
                            		"ID");
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:514:8: lv_view2_2_2= RULE_STRING
                    {
                    lv_view2_2_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleItemRelation919); 

                    			newLeafNode(lv_view2_2_2, grammarAccess.getItemRelationAccess().getView2STRINGTerminalRuleCall_2_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getItemRelationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"view2",
                            		lv_view2_2_2, 
                            		"STRING");
                    	    

                    }
                    break;

            }


            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleItemRelation"


    // $ANTLR start "entryRuleItemGeneralization"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:540:1: entryRuleItemGeneralization returns [EObject current=null] : iv_ruleItemGeneralization= ruleItemGeneralization EOF ;
    public final EObject entryRuleItemGeneralization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemGeneralization = null;


        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:541:2: (iv_ruleItemGeneralization= ruleItemGeneralization EOF )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:542:2: iv_ruleItemGeneralization= ruleItemGeneralization EOF
            {
             newCompositeNode(grammarAccess.getItemGeneralizationRule()); 
            pushFollow(FOLLOW_ruleItemGeneralization_in_entryRuleItemGeneralization963);
            iv_ruleItemGeneralization=ruleItemGeneralization();

            state._fsp--;

             current =iv_ruleItemGeneralization; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItemGeneralization973); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleItemGeneralization"


    // $ANTLR start "ruleItemGeneralization"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:549:1: ruleItemGeneralization returns [EObject current=null] : ( ( ( (lv_generalize_0_1= RULE_ID | lv_generalize_0_2= RULE_STRING ) ) ) (otherlv_1= 'generalize' | otherlv_2= 'abstract' ) ( ( (lv_views_3_1= RULE_ID | lv_views_3_2= RULE_STRING ) ) )+ ) ;
    public final EObject ruleItemGeneralization() throws RecognitionException {
        EObject current = null;

        Token lv_generalize_0_1=null;
        Token lv_generalize_0_2=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_views_3_1=null;
        Token lv_views_3_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:552:28: ( ( ( ( (lv_generalize_0_1= RULE_ID | lv_generalize_0_2= RULE_STRING ) ) ) (otherlv_1= 'generalize' | otherlv_2= 'abstract' ) ( ( (lv_views_3_1= RULE_ID | lv_views_3_2= RULE_STRING ) ) )+ ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:553:1: ( ( ( (lv_generalize_0_1= RULE_ID | lv_generalize_0_2= RULE_STRING ) ) ) (otherlv_1= 'generalize' | otherlv_2= 'abstract' ) ( ( (lv_views_3_1= RULE_ID | lv_views_3_2= RULE_STRING ) ) )+ )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:553:1: ( ( ( (lv_generalize_0_1= RULE_ID | lv_generalize_0_2= RULE_STRING ) ) ) (otherlv_1= 'generalize' | otherlv_2= 'abstract' ) ( ( (lv_views_3_1= RULE_ID | lv_views_3_2= RULE_STRING ) ) )+ )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:553:2: ( ( (lv_generalize_0_1= RULE_ID | lv_generalize_0_2= RULE_STRING ) ) ) (otherlv_1= 'generalize' | otherlv_2= 'abstract' ) ( ( (lv_views_3_1= RULE_ID | lv_views_3_2= RULE_STRING ) ) )+
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:553:2: ( ( (lv_generalize_0_1= RULE_ID | lv_generalize_0_2= RULE_STRING ) ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:554:1: ( (lv_generalize_0_1= RULE_ID | lv_generalize_0_2= RULE_STRING ) )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:554:1: ( (lv_generalize_0_1= RULE_ID | lv_generalize_0_2= RULE_STRING ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:555:1: (lv_generalize_0_1= RULE_ID | lv_generalize_0_2= RULE_STRING )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:555:1: (lv_generalize_0_1= RULE_ID | lv_generalize_0_2= RULE_STRING )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_STRING) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:556:3: lv_generalize_0_1= RULE_ID
                    {
                    lv_generalize_0_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleItemGeneralization1017); 

                    			newLeafNode(lv_generalize_0_1, grammarAccess.getItemGeneralizationAccess().getGeneralizeIDTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getItemGeneralizationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"generalize",
                            		lv_generalize_0_1, 
                            		"ID");
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:571:8: lv_generalize_0_2= RULE_STRING
                    {
                    lv_generalize_0_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleItemGeneralization1037); 

                    			newLeafNode(lv_generalize_0_2, grammarAccess.getItemGeneralizationAccess().getGeneralizeSTRINGTerminalRuleCall_0_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getItemGeneralizationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"generalize",
                            		lv_generalize_0_2, 
                            		"STRING");
                    	    

                    }
                    break;

            }


            }


            }

            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:589:2: (otherlv_1= 'generalize' | otherlv_2= 'abstract' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                alt13=1;
            }
            else if ( (LA13_0==16) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:589:4: otherlv_1= 'generalize'
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleItemGeneralization1058); 

                        	newLeafNode(otherlv_1, grammarAccess.getItemGeneralizationAccess().getGeneralizeKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:594:7: otherlv_2= 'abstract'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleItemGeneralization1076); 

                        	newLeafNode(otherlv_2, grammarAccess.getItemGeneralizationAccess().getAbstractKeyword_1_1());
                        

                    }
                    break;

            }

            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:598:2: ( ( (lv_views_3_1= RULE_ID | lv_views_3_2= RULE_STRING ) ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1==EOF||(LA15_1>=RULE_STRING && LA15_1<=RULE_ID)||(LA15_1>=24 && LA15_1<=27)||LA15_1==37||(LA15_1>=39 && LA15_1<=44)||LA15_1==46) ) {
                        alt15=1;
                    }


                }
                else if ( (LA15_0==RULE_STRING) ) {
                    int LA15_2 = input.LA(2);

                    if ( (LA15_2==EOF||(LA15_2>=RULE_STRING && LA15_2<=RULE_ID)||(LA15_2>=24 && LA15_2<=27)||LA15_2==37||(LA15_2>=39 && LA15_2<=44)||LA15_2==46) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:599:1: ( (lv_views_3_1= RULE_ID | lv_views_3_2= RULE_STRING ) )
            	    {
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:599:1: ( (lv_views_3_1= RULE_ID | lv_views_3_2= RULE_STRING ) )
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:600:1: (lv_views_3_1= RULE_ID | lv_views_3_2= RULE_STRING )
            	    {
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:600:1: (lv_views_3_1= RULE_ID | lv_views_3_2= RULE_STRING )
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
            	            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:601:3: lv_views_3_1= RULE_ID
            	            {
            	            lv_views_3_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleItemGeneralization1096); 

            	            			newLeafNode(lv_views_3_1, grammarAccess.getItemGeneralizationAccess().getViewsIDTerminalRuleCall_2_0_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getItemGeneralizationRule());
            	            	        }
            	                   		addWithLastConsumed(
            	                   			current, 
            	                   			"views",
            	                    		lv_views_3_1, 
            	                    		"ID");
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:616:8: lv_views_3_2= RULE_STRING
            	            {
            	            lv_views_3_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleItemGeneralization1116); 

            	            			newLeafNode(lv_views_3_2, grammarAccess.getItemGeneralizationAccess().getViewsSTRINGTerminalRuleCall_2_0_1()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getItemGeneralizationRule());
            	            	        }
            	                   		addWithLastConsumed(
            	                   			current, 
            	                   			"views",
            	                    		lv_views_3_2, 
            	                    		"STRING");
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleItemGeneralization"


    // $ANTLR start "entryRuleItemMapping"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:642:1: entryRuleItemMapping returns [EObject current=null] : iv_ruleItemMapping= ruleItemMapping EOF ;
    public final EObject entryRuleItemMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItemMapping = null;


        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:643:2: (iv_ruleItemMapping= ruleItemMapping EOF )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:644:2: iv_ruleItemMapping= ruleItemMapping EOF
            {
             newCompositeNode(grammarAccess.getItemMappingRule()); 
            pushFollow(FOLLOW_ruleItemMapping_in_entryRuleItemMapping1161);
            iv_ruleItemMapping=ruleItemMapping();

            state._fsp--;

             current =iv_ruleItemMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleItemMapping1171); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleItemMapping"


    // $ANTLR start "ruleItemMapping"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:651:1: ruleItemMapping returns [EObject current=null] : ( ( ( (lv_item_0_1= RULE_ID | lv_item_0_2= RULE_STRING ) ) ) ( ( (lv_act_1_1= 'replace' | lv_act_1_2= 'correspondsTo' ) ) ) ( (lv_pfts_2_0= rulePredicateItem ) ) ) ;
    public final EObject ruleItemMapping() throws RecognitionException {
        EObject current = null;

        Token lv_item_0_1=null;
        Token lv_item_0_2=null;
        Token lv_act_1_1=null;
        Token lv_act_1_2=null;
        EObject lv_pfts_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:654:28: ( ( ( ( (lv_item_0_1= RULE_ID | lv_item_0_2= RULE_STRING ) ) ) ( ( (lv_act_1_1= 'replace' | lv_act_1_2= 'correspondsTo' ) ) ) ( (lv_pfts_2_0= rulePredicateItem ) ) ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:655:1: ( ( ( (lv_item_0_1= RULE_ID | lv_item_0_2= RULE_STRING ) ) ) ( ( (lv_act_1_1= 'replace' | lv_act_1_2= 'correspondsTo' ) ) ) ( (lv_pfts_2_0= rulePredicateItem ) ) )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:655:1: ( ( ( (lv_item_0_1= RULE_ID | lv_item_0_2= RULE_STRING ) ) ) ( ( (lv_act_1_1= 'replace' | lv_act_1_2= 'correspondsTo' ) ) ) ( (lv_pfts_2_0= rulePredicateItem ) ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:655:2: ( ( (lv_item_0_1= RULE_ID | lv_item_0_2= RULE_STRING ) ) ) ( ( (lv_act_1_1= 'replace' | lv_act_1_2= 'correspondsTo' ) ) ) ( (lv_pfts_2_0= rulePredicateItem ) )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:655:2: ( ( (lv_item_0_1= RULE_ID | lv_item_0_2= RULE_STRING ) ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:656:1: ( (lv_item_0_1= RULE_ID | lv_item_0_2= RULE_STRING ) )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:656:1: ( (lv_item_0_1= RULE_ID | lv_item_0_2= RULE_STRING ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:657:1: (lv_item_0_1= RULE_ID | lv_item_0_2= RULE_STRING )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:657:1: (lv_item_0_1= RULE_ID | lv_item_0_2= RULE_STRING )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_STRING) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:658:3: lv_item_0_1= RULE_ID
                    {
                    lv_item_0_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleItemMapping1215); 

                    			newLeafNode(lv_item_0_1, grammarAccess.getItemMappingAccess().getItemIDTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getItemMappingRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"item",
                            		lv_item_0_1, 
                            		"ID");
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:673:8: lv_item_0_2= RULE_STRING
                    {
                    lv_item_0_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleItemMapping1235); 

                    			newLeafNode(lv_item_0_2, grammarAccess.getItemMappingAccess().getItemSTRINGTerminalRuleCall_0_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getItemMappingRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"item",
                            		lv_item_0_2, 
                            		"STRING");
                    	    

                    }
                    break;

            }


            }


            }

            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:691:2: ( ( (lv_act_1_1= 'replace' | lv_act_1_2= 'correspondsTo' ) ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:692:1: ( (lv_act_1_1= 'replace' | lv_act_1_2= 'correspondsTo' ) )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:692:1: ( (lv_act_1_1= 'replace' | lv_act_1_2= 'correspondsTo' ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:693:1: (lv_act_1_1= 'replace' | lv_act_1_2= 'correspondsTo' )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:693:1: (lv_act_1_1= 'replace' | lv_act_1_2= 'correspondsTo' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==17) ) {
                alt17=1;
            }
            else if ( (LA17_0==18) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:694:3: lv_act_1_1= 'replace'
                    {
                    lv_act_1_1=(Token)match(input,17,FOLLOW_17_in_ruleItemMapping1263); 

                            newLeafNode(lv_act_1_1, grammarAccess.getItemMappingAccess().getActReplaceKeyword_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getItemMappingRule());
                    	        }
                           		setWithLastConsumed(current, "act", lv_act_1_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:706:8: lv_act_1_2= 'correspondsTo'
                    {
                    lv_act_1_2=(Token)match(input,18,FOLLOW_18_in_ruleItemMapping1292); 

                            newLeafNode(lv_act_1_2, grammarAccess.getItemMappingAccess().getActCorrespondsToKeyword_1_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getItemMappingRule());
                    	        }
                           		setWithLastConsumed(current, "act", lv_act_1_2, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:721:2: ( (lv_pfts_2_0= rulePredicateItem ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:722:1: (lv_pfts_2_0= rulePredicateItem )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:722:1: (lv_pfts_2_0= rulePredicateItem )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:723:3: lv_pfts_2_0= rulePredicateItem
            {
             
            	        newCompositeNode(grammarAccess.getItemMappingAccess().getPftsPredicateItemParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_rulePredicateItem_in_ruleItemMapping1329);
            lv_pfts_2_0=rulePredicateItem();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getItemMappingRule());
            	        }
                   		set(
                   			current, 
                   			"pfts",
                    		lv_pfts_2_0, 
                    		"PredicateItem");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleItemMapping"


    // $ANTLR start "entryRulePredicateItem"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:747:1: entryRulePredicateItem returns [EObject current=null] : iv_rulePredicateItem= rulePredicateItem EOF ;
    public final EObject entryRulePredicateItem() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicateItem = null;


        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:748:2: (iv_rulePredicateItem= rulePredicateItem EOF )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:749:2: iv_rulePredicateItem= rulePredicateItem EOF
            {
             newCompositeNode(grammarAccess.getPredicateItemRule()); 
            pushFollow(FOLLOW_rulePredicateItem_in_entryRulePredicateItem1365);
            iv_rulePredicateItem=rulePredicateItem();

            state._fsp--;

             current =iv_rulePredicateItem; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredicateItem1375); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePredicateItem"


    // $ANTLR start "rulePredicateItem"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:756:1: rulePredicateItem returns [EObject current=null] : this_Or_expr_0= ruleOr_expr ;
    public final EObject rulePredicateItem() throws RecognitionException {
        EObject current = null;

        EObject this_Or_expr_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:759:28: (this_Or_expr_0= ruleOr_expr )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:761:5: this_Or_expr_0= ruleOr_expr
            {
             
                    newCompositeNode(grammarAccess.getPredicateItemAccess().getOr_exprParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleOr_expr_in_rulePredicateItem1421);
            this_Or_expr_0=ruleOr_expr();

            state._fsp--;

             
                    current = this_Or_expr_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredicateItem"


    // $ANTLR start "entryRuleOr_expr"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:777:1: entryRuleOr_expr returns [EObject current=null] : iv_ruleOr_expr= ruleOr_expr EOF ;
    public final EObject entryRuleOr_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr_expr = null;


        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:778:2: (iv_ruleOr_expr= ruleOr_expr EOF )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:779:2: iv_ruleOr_expr= ruleOr_expr EOF
            {
             newCompositeNode(grammarAccess.getOr_exprRule()); 
            pushFollow(FOLLOW_ruleOr_expr_in_entryRuleOr_expr1455);
            iv_ruleOr_expr=ruleOr_expr();

            state._fsp--;

             current =iv_ruleOr_expr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr_expr1465); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOr_expr"


    // $ANTLR start "ruleOr_expr"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:786:1: ruleOr_expr returns [EObject current=null] : (this_And_expr_0= ruleAnd_expr ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd_expr ) ) )* ) ;
    public final EObject ruleOr_expr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_expr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:789:28: ( (this_And_expr_0= ruleAnd_expr ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd_expr ) ) )* ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:790:1: (this_And_expr_0= ruleAnd_expr ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd_expr ) ) )* )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:790:1: (this_And_expr_0= ruleAnd_expr ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd_expr ) ) )* )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:791:5: this_And_expr_0= ruleAnd_expr ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd_expr ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getOr_exprAccess().getAnd_exprParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleAnd_expr_in_ruleOr_expr1512);
            this_And_expr_0=ruleAnd_expr();

            state._fsp--;

             
                    current = this_And_expr_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:799:1: ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd_expr ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==19) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:799:2: () otherlv_2= 'or' ( (lv_right_3_0= ruleAnd_expr ) )
            	    {
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:799:2: ()
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:800:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getOr_exprAccess().getOr_exprLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleOr_expr1533); 

            	        	newLeafNode(otherlv_2, grammarAccess.getOr_exprAccess().getOrKeyword_1_1());
            	        
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:809:1: ( (lv_right_3_0= ruleAnd_expr ) )
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:810:1: (lv_right_3_0= ruleAnd_expr )
            	    {
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:810:1: (lv_right_3_0= ruleAnd_expr )
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:811:3: lv_right_3_0= ruleAnd_expr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOr_exprAccess().getRightAnd_exprParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAnd_expr_in_ruleOr_expr1554);
            	    lv_right_3_0=ruleAnd_expr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOr_exprRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"And_expr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOr_expr"


    // $ANTLR start "entryRuleAnd_expr"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:835:1: entryRuleAnd_expr returns [EObject current=null] : iv_ruleAnd_expr= ruleAnd_expr EOF ;
    public final EObject entryRuleAnd_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd_expr = null;


        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:836:2: (iv_ruleAnd_expr= ruleAnd_expr EOF )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:837:2: iv_ruleAnd_expr= ruleAnd_expr EOF
            {
             newCompositeNode(grammarAccess.getAnd_exprRule()); 
            pushFollow(FOLLOW_ruleAnd_expr_in_entryRuleAnd_expr1592);
            iv_ruleAnd_expr=ruleAnd_expr();

            state._fsp--;

             current =iv_ruleAnd_expr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd_expr1602); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnd_expr"


    // $ANTLR start "ruleAnd_expr"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:844:1: ruleAnd_expr returns [EObject current=null] : (this_Unary_expr_0= ruleUnary_expr ( () otherlv_2= 'and' ( (lv_right_3_0= ruleUnary_expr ) ) )* ) ;
    public final EObject ruleAnd_expr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Unary_expr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:847:28: ( (this_Unary_expr_0= ruleUnary_expr ( () otherlv_2= 'and' ( (lv_right_3_0= ruleUnary_expr ) ) )* ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:848:1: (this_Unary_expr_0= ruleUnary_expr ( () otherlv_2= 'and' ( (lv_right_3_0= ruleUnary_expr ) ) )* )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:848:1: (this_Unary_expr_0= ruleUnary_expr ( () otherlv_2= 'and' ( (lv_right_3_0= ruleUnary_expr ) ) )* )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:849:5: this_Unary_expr_0= ruleUnary_expr ( () otherlv_2= 'and' ( (lv_right_3_0= ruleUnary_expr ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getAnd_exprAccess().getUnary_exprParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleUnary_expr_in_ruleAnd_expr1649);
            this_Unary_expr_0=ruleUnary_expr();

            state._fsp--;

             
                    current = this_Unary_expr_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:857:1: ( () otherlv_2= 'and' ( (lv_right_3_0= ruleUnary_expr ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==20) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:857:2: () otherlv_2= 'and' ( (lv_right_3_0= ruleUnary_expr ) )
            	    {
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:857:2: ()
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:858:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getAnd_exprAccess().getAnd_exprLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleAnd_expr1670); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAnd_exprAccess().getAndKeyword_1_1());
            	        
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:867:1: ( (lv_right_3_0= ruleUnary_expr ) )
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:868:1: (lv_right_3_0= ruleUnary_expr )
            	    {
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:868:1: (lv_right_3_0= ruleUnary_expr )
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:869:3: lv_right_3_0= ruleUnary_expr
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAnd_exprAccess().getRightUnary_exprParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUnary_expr_in_ruleAnd_expr1691);
            	    lv_right_3_0=ruleUnary_expr();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAnd_exprRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"Unary_expr");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnd_expr"


    // $ANTLR start "entryRuleUnary_expr"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:893:1: entryRuleUnary_expr returns [EObject current=null] : iv_ruleUnary_expr= ruleUnary_expr EOF ;
    public final EObject entryRuleUnary_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnary_expr = null;


        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:894:2: (iv_ruleUnary_expr= ruleUnary_expr EOF )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:895:2: iv_ruleUnary_expr= ruleUnary_expr EOF
            {
             newCompositeNode(grammarAccess.getUnary_exprRule()); 
            pushFollow(FOLLOW_ruleUnary_expr_in_entryRuleUnary_expr1729);
            iv_ruleUnary_expr=ruleUnary_expr();

            state._fsp--;

             current =iv_ruleUnary_expr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnary_expr1739); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnary_expr"


    // $ANTLR start "ruleUnary_expr"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:902:1: ruleUnary_expr returns [EObject current=null] : (this_Neg_expr_0= ruleNeg_expr | this_Primary_expr_1= rulePrimary_expr ) ;
    public final EObject ruleUnary_expr() throws RecognitionException {
        EObject current = null;

        EObject this_Neg_expr_0 = null;

        EObject this_Primary_expr_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:905:28: ( (this_Neg_expr_0= ruleNeg_expr | this_Primary_expr_1= rulePrimary_expr ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:906:1: (this_Neg_expr_0= ruleNeg_expr | this_Primary_expr_1= rulePrimary_expr )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:906:1: (this_Neg_expr_0= ruleNeg_expr | this_Primary_expr_1= rulePrimary_expr )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==21) ) {
                alt20=1;
            }
            else if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_ID)||LA20_0==22) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:907:5: this_Neg_expr_0= ruleNeg_expr
                    {
                     
                            newCompositeNode(grammarAccess.getUnary_exprAccess().getNeg_exprParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNeg_expr_in_ruleUnary_expr1786);
                    this_Neg_expr_0=ruleNeg_expr();

                    state._fsp--;

                     
                            current = this_Neg_expr_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:917:5: this_Primary_expr_1= rulePrimary_expr
                    {
                     
                            newCompositeNode(grammarAccess.getUnary_exprAccess().getPrimary_exprParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePrimary_expr_in_ruleUnary_expr1813);
                    this_Primary_expr_1=rulePrimary_expr();

                    state._fsp--;

                     
                            current = this_Primary_expr_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnary_expr"


    // $ANTLR start "entryRuleNeg_expr"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:933:1: entryRuleNeg_expr returns [EObject current=null] : iv_ruleNeg_expr= ruleNeg_expr EOF ;
    public final EObject entryRuleNeg_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNeg_expr = null;


        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:934:2: (iv_ruleNeg_expr= ruleNeg_expr EOF )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:935:2: iv_ruleNeg_expr= ruleNeg_expr EOF
            {
             newCompositeNode(grammarAccess.getNeg_exprRule()); 
            pushFollow(FOLLOW_ruleNeg_expr_in_entryRuleNeg_expr1848);
            iv_ruleNeg_expr=ruleNeg_expr();

            state._fsp--;

             current =iv_ruleNeg_expr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNeg_expr1858); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNeg_expr"


    // $ANTLR start "ruleNeg_expr"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:942:1: ruleNeg_expr returns [EObject current=null] : (otherlv_0= 'not' ( (lv_expr_1_0= rulePrimary_expr ) ) ) ;
    public final EObject ruleNeg_expr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:945:28: ( (otherlv_0= 'not' ( (lv_expr_1_0= rulePrimary_expr ) ) ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:946:1: (otherlv_0= 'not' ( (lv_expr_1_0= rulePrimary_expr ) ) )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:946:1: (otherlv_0= 'not' ( (lv_expr_1_0= rulePrimary_expr ) ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:946:3: otherlv_0= 'not' ( (lv_expr_1_0= rulePrimary_expr ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleNeg_expr1895); 

                	newLeafNode(otherlv_0, grammarAccess.getNeg_exprAccess().getNotKeyword_0());
                
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:950:1: ( (lv_expr_1_0= rulePrimary_expr ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:951:1: (lv_expr_1_0= rulePrimary_expr )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:951:1: (lv_expr_1_0= rulePrimary_expr )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:952:3: lv_expr_1_0= rulePrimary_expr
            {
             
            	        newCompositeNode(grammarAccess.getNeg_exprAccess().getExprPrimary_exprParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_rulePrimary_expr_in_ruleNeg_expr1916);
            lv_expr_1_0=rulePrimary_expr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNeg_exprRule());
            	        }
                   		set(
                   			current, 
                   			"expr",
                    		lv_expr_1_0, 
                    		"Primary_expr");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNeg_expr"


    // $ANTLR start "entryRulePrimary_expr"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:976:1: entryRulePrimary_expr returns [EObject current=null] : iv_rulePrimary_expr= rulePrimary_expr EOF ;
    public final EObject entryRulePrimary_expr() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary_expr = null;


        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:977:2: (iv_rulePrimary_expr= rulePrimary_expr EOF )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:978:2: iv_rulePrimary_expr= rulePrimary_expr EOF
            {
             newCompositeNode(grammarAccess.getPrimary_exprRule()); 
            pushFollow(FOLLOW_rulePrimary_expr_in_entryRulePrimary_expr1952);
            iv_rulePrimary_expr=rulePrimary_expr();

            state._fsp--;

             current =iv_rulePrimary_expr; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary_expr1962); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary_expr"


    // $ANTLR start "rulePrimary_expr"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:985:1: rulePrimary_expr returns [EObject current=null] : ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) | (otherlv_1= '(' this_Or_expr_2= ruleOr_expr otherlv_3= ')' ) ) ;
    public final EObject rulePrimary_expr() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_1=null;
        Token lv_name_0_2=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_Or_expr_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:988:28: ( ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) | (otherlv_1= '(' this_Or_expr_2= ruleOr_expr otherlv_3= ')' ) ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:989:1: ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) | (otherlv_1= '(' this_Or_expr_2= ruleOr_expr otherlv_3= ')' ) )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:989:1: ( ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) ) | (otherlv_1= '(' this_Or_expr_2= ruleOr_expr otherlv_3= ')' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_STRING && LA22_0<=RULE_ID)) ) {
                alt22=1;
            }
            else if ( (LA22_0==22) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:989:2: ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) )
                    {
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:989:2: ( ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) ) )
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:990:1: ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) )
                    {
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:990:1: ( (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING ) )
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:991:1: (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING )
                    {
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:991:1: (lv_name_0_1= RULE_ID | lv_name_0_2= RULE_STRING )
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
                            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:992:3: lv_name_0_1= RULE_ID
                            {
                            lv_name_0_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePrimary_expr2006); 

                            			newLeafNode(lv_name_0_1, grammarAccess.getPrimary_exprAccess().getNameIDTerminalRuleCall_0_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPrimary_exprRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"name",
                                    		lv_name_0_1, 
                                    		"ID");
                            	    

                            }
                            break;
                        case 2 :
                            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1007:8: lv_name_0_2= RULE_STRING
                            {
                            lv_name_0_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePrimary_expr2026); 

                            			newLeafNode(lv_name_0_2, grammarAccess.getPrimary_exprAccess().getNameSTRINGTerminalRuleCall_0_0_1()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getPrimary_exprRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"name",
                                    		lv_name_0_2, 
                                    		"STRING");
                            	    

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1026:6: (otherlv_1= '(' this_Or_expr_2= ruleOr_expr otherlv_3= ')' )
                    {
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1026:6: (otherlv_1= '(' this_Or_expr_2= ruleOr_expr otherlv_3= ')' )
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1026:8: otherlv_1= '(' this_Or_expr_2= ruleOr_expr otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,22,FOLLOW_22_in_rulePrimary_expr2053); 

                        	newLeafNode(otherlv_1, grammarAccess.getPrimary_exprAccess().getLeftParenthesisKeyword_1_0());
                        
                     
                            newCompositeNode(grammarAccess.getPrimary_exprAccess().getOr_exprParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleOr_expr_in_rulePrimary_expr2075);
                    this_Or_expr_2=ruleOr_expr();

                    state._fsp--;

                     
                            current = this_Or_expr_2; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_3=(Token)match(input,23,FOLLOW_23_in_rulePrimary_expr2086); 

                        	newLeafNode(otherlv_3, grammarAccess.getPrimary_exprAccess().getRightParenthesisKeyword_1_2());
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary_expr"


    // $ANTLR start "entryRuleDefault"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1051:1: entryRuleDefault returns [EObject current=null] : iv_ruleDefault= ruleDefault EOF ;
    public final EObject entryRuleDefault() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefault = null;


        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1052:2: (iv_ruleDefault= ruleDefault EOF )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1053:2: iv_ruleDefault= ruleDefault EOF
            {
             newCompositeNode(grammarAccess.getDefaultRule()); 
            pushFollow(FOLLOW_ruleDefault_in_entryRuleDefault2123);
            iv_ruleDefault=ruleDefault();

            state._fsp--;

             current =iv_ruleDefault; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefault2133); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefault"


    // $ANTLR start "ruleDefault"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1060:1: ruleDefault returns [EObject current=null] : ( () (otherlv_1= 'default:' | otherlv_2= 'allviews:' | otherlv_3= 'all:' ) ( (lv_configs_4_0= ruleParsingConfiguration ) )? ( (lv_products_5_0= ruleScopingProducts ) )? ) ;
    public final EObject ruleDefault() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_configs_4_0 = null;

        EObject lv_products_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1063:28: ( ( () (otherlv_1= 'default:' | otherlv_2= 'allviews:' | otherlv_3= 'all:' ) ( (lv_configs_4_0= ruleParsingConfiguration ) )? ( (lv_products_5_0= ruleScopingProducts ) )? ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1064:1: ( () (otherlv_1= 'default:' | otherlv_2= 'allviews:' | otherlv_3= 'all:' ) ( (lv_configs_4_0= ruleParsingConfiguration ) )? ( (lv_products_5_0= ruleScopingProducts ) )? )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1064:1: ( () (otherlv_1= 'default:' | otherlv_2= 'allviews:' | otherlv_3= 'all:' ) ( (lv_configs_4_0= ruleParsingConfiguration ) )? ( (lv_products_5_0= ruleScopingProducts ) )? )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1064:2: () (otherlv_1= 'default:' | otherlv_2= 'allviews:' | otherlv_3= 'all:' ) ( (lv_configs_4_0= ruleParsingConfiguration ) )? ( (lv_products_5_0= ruleScopingProducts ) )?
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1064:2: ()
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1065:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDefaultAccess().getDefaultAction_0(),
                        current);
                

            }

            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1070:2: (otherlv_1= 'default:' | otherlv_2= 'allviews:' | otherlv_3= 'all:' )
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
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1070:4: otherlv_1= 'default:'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleDefault2180); 

                        	newLeafNode(otherlv_1, grammarAccess.getDefaultAccess().getDefaultKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1075:7: otherlv_2= 'allviews:'
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleDefault2198); 

                        	newLeafNode(otherlv_2, grammarAccess.getDefaultAccess().getAllviewsKeyword_1_1());
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1080:7: otherlv_3= 'all:'
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleDefault2216); 

                        	newLeafNode(otherlv_3, grammarAccess.getDefaultAccess().getAllKeyword_1_2());
                        

                    }
                    break;

            }

            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1084:2: ( (lv_configs_4_0= ruleParsingConfiguration ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==27) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1085:1: (lv_configs_4_0= ruleParsingConfiguration )
                    {
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1085:1: (lv_configs_4_0= ruleParsingConfiguration )
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1086:3: lv_configs_4_0= ruleParsingConfiguration
                    {
                     
                    	        newCompositeNode(grammarAccess.getDefaultAccess().getConfigsParsingConfigurationParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParsingConfiguration_in_ruleDefault2238);
                    lv_configs_4_0=ruleParsingConfiguration();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDefaultRule());
                    	        }
                           		set(
                           			current, 
                           			"configs",
                            		lv_configs_4_0, 
                            		"ParsingConfiguration");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1102:3: ( (lv_products_5_0= ruleScopingProducts ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=41 && LA25_0<=42)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1103:1: (lv_products_5_0= ruleScopingProducts )
                    {
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1103:1: (lv_products_5_0= ruleScopingProducts )
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1104:3: lv_products_5_0= ruleScopingProducts
                    {
                     
                    	        newCompositeNode(grammarAccess.getDefaultAccess().getProductsScopingProductsParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleScopingProducts_in_ruleDefault2260);
                    lv_products_5_0=ruleScopingProducts();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDefaultRule());
                    	        }
                           		set(
                           			current, 
                           			"products",
                            		lv_products_5_0, 
                            		"ScopingProducts");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefault"


    // $ANTLR start "entryRuleParsingConfiguration"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1128:1: entryRuleParsingConfiguration returns [EObject current=null] : iv_ruleParsingConfiguration= ruleParsingConfiguration EOF ;
    public final EObject entryRuleParsingConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParsingConfiguration = null;


        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1129:2: (iv_ruleParsingConfiguration= ruleParsingConfiguration EOF )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1130:2: iv_ruleParsingConfiguration= ruleParsingConfiguration EOF
            {
             newCompositeNode(grammarAccess.getParsingConfigurationRule()); 
            pushFollow(FOLLOW_ruleParsingConfiguration_in_entryRuleParsingConfiguration2297);
            iv_ruleParsingConfiguration=ruleParsingConfiguration();

            state._fsp--;

             current =iv_ruleParsingConfiguration; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParsingConfiguration2307); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParsingConfiguration"


    // $ANTLR start "ruleParsingConfiguration"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1137:1: ruleParsingConfiguration returns [EObject current=null] : ( () otherlv_1= 'parsing:' ( (lv_productID_2_0= ruleKey ) )? ( (lv_format_3_0= ruleFormatSpecification ) )? ( (lv_sinterpret_4_0= ruleSyntacticalInterpretation ) )? ( (lv_separator_5_0= ruleCSVSeparator ) )? ( (lv_mseparator_6_0= ruleCSVMultiSeparator ) )? ) ;
    public final EObject ruleParsingConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_productID_2_0 = null;

        EObject lv_format_3_0 = null;

        EObject lv_sinterpret_4_0 = null;

        EObject lv_separator_5_0 = null;

        EObject lv_mseparator_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1140:28: ( ( () otherlv_1= 'parsing:' ( (lv_productID_2_0= ruleKey ) )? ( (lv_format_3_0= ruleFormatSpecification ) )? ( (lv_sinterpret_4_0= ruleSyntacticalInterpretation ) )? ( (lv_separator_5_0= ruleCSVSeparator ) )? ( (lv_mseparator_6_0= ruleCSVMultiSeparator ) )? ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1141:1: ( () otherlv_1= 'parsing:' ( (lv_productID_2_0= ruleKey ) )? ( (lv_format_3_0= ruleFormatSpecification ) )? ( (lv_sinterpret_4_0= ruleSyntacticalInterpretation ) )? ( (lv_separator_5_0= ruleCSVSeparator ) )? ( (lv_mseparator_6_0= ruleCSVMultiSeparator ) )? )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1141:1: ( () otherlv_1= 'parsing:' ( (lv_productID_2_0= ruleKey ) )? ( (lv_format_3_0= ruleFormatSpecification ) )? ( (lv_sinterpret_4_0= ruleSyntacticalInterpretation ) )? ( (lv_separator_5_0= ruleCSVSeparator ) )? ( (lv_mseparator_6_0= ruleCSVMultiSeparator ) )? )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1141:2: () otherlv_1= 'parsing:' ( (lv_productID_2_0= ruleKey ) )? ( (lv_format_3_0= ruleFormatSpecification ) )? ( (lv_sinterpret_4_0= ruleSyntacticalInterpretation ) )? ( (lv_separator_5_0= ruleCSVSeparator ) )? ( (lv_mseparator_6_0= ruleCSVMultiSeparator ) )?
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1141:2: ()
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1142:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParsingConfigurationAccess().getParsingConfigurationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleParsingConfiguration2353); 

                	newLeafNode(otherlv_1, grammarAccess.getParsingConfigurationAccess().getParsingKeyword_1());
                
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1151:1: ( (lv_productID_2_0= ruleKey ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==30) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1152:1: (lv_productID_2_0= ruleKey )
                    {
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1152:1: (lv_productID_2_0= ruleKey )
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1153:3: lv_productID_2_0= ruleKey
                    {
                     
                    	        newCompositeNode(grammarAccess.getParsingConfigurationAccess().getProductIDKeyParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleKey_in_ruleParsingConfiguration2374);
                    lv_productID_2_0=ruleKey();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParsingConfigurationRule());
                    	        }
                           		set(
                           			current, 
                           			"productID",
                            		lv_productID_2_0, 
                            		"Key");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1169:3: ( (lv_format_3_0= ruleFormatSpecification ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==28) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1170:1: (lv_format_3_0= ruleFormatSpecification )
                    {
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1170:1: (lv_format_3_0= ruleFormatSpecification )
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1171:3: lv_format_3_0= ruleFormatSpecification
                    {
                     
                    	        newCompositeNode(grammarAccess.getParsingConfigurationAccess().getFormatFormatSpecificationParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFormatSpecification_in_ruleParsingConfiguration2396);
                    lv_format_3_0=ruleFormatSpecification();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParsingConfigurationRule());
                    	        }
                           		set(
                           			current, 
                           			"format",
                            		lv_format_3_0, 
                            		"FormatSpecification");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1187:3: ( (lv_sinterpret_4_0= ruleSyntacticalInterpretation ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==29) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1188:1: (lv_sinterpret_4_0= ruleSyntacticalInterpretation )
                    {
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1188:1: (lv_sinterpret_4_0= ruleSyntacticalInterpretation )
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1189:3: lv_sinterpret_4_0= ruleSyntacticalInterpretation
                    {
                     
                    	        newCompositeNode(grammarAccess.getParsingConfigurationAccess().getSinterpretSyntacticalInterpretationParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSyntacticalInterpretation_in_ruleParsingConfiguration2418);
                    lv_sinterpret_4_0=ruleSyntacticalInterpretation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParsingConfigurationRule());
                    	        }
                           		set(
                           			current, 
                           			"sinterpret",
                            		lv_sinterpret_4_0, 
                            		"SyntacticalInterpretation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1205:3: ( (lv_separator_5_0= ruleCSVSeparator ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==31) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1206:1: (lv_separator_5_0= ruleCSVSeparator )
                    {
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1206:1: (lv_separator_5_0= ruleCSVSeparator )
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1207:3: lv_separator_5_0= ruleCSVSeparator
                    {
                     
                    	        newCompositeNode(grammarAccess.getParsingConfigurationAccess().getSeparatorCSVSeparatorParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCSVSeparator_in_ruleParsingConfiguration2440);
                    lv_separator_5_0=ruleCSVSeparator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParsingConfigurationRule());
                    	        }
                           		set(
                           			current, 
                           			"separator",
                            		lv_separator_5_0, 
                            		"CSVSeparator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1223:3: ( (lv_mseparator_6_0= ruleCSVMultiSeparator ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==32) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1224:1: (lv_mseparator_6_0= ruleCSVMultiSeparator )
                    {
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1224:1: (lv_mseparator_6_0= ruleCSVMultiSeparator )
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1225:3: lv_mseparator_6_0= ruleCSVMultiSeparator
                    {
                     
                    	        newCompositeNode(grammarAccess.getParsingConfigurationAccess().getMseparatorCSVMultiSeparatorParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCSVMultiSeparator_in_ruleParsingConfiguration2462);
                    lv_mseparator_6_0=ruleCSVMultiSeparator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParsingConfigurationRule());
                    	        }
                           		set(
                           			current, 
                           			"mseparator",
                            		lv_mseparator_6_0, 
                            		"CSVMultiSeparator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParsingConfiguration"


    // $ANTLR start "entryRuleFormatSpecification"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1249:1: entryRuleFormatSpecification returns [EObject current=null] : iv_ruleFormatSpecification= ruleFormatSpecification EOF ;
    public final EObject entryRuleFormatSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormatSpecification = null;


        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1250:2: (iv_ruleFormatSpecification= ruleFormatSpecification EOF )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1251:2: iv_ruleFormatSpecification= ruleFormatSpecification EOF
            {
             newCompositeNode(grammarAccess.getFormatSpecificationRule()); 
            pushFollow(FOLLOW_ruleFormatSpecification_in_entryRuleFormatSpecification2499);
            iv_ruleFormatSpecification=ruleFormatSpecification();

            state._fsp--;

             current =iv_ruleFormatSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFormatSpecification2509); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFormatSpecification"


    // $ANTLR start "ruleFormatSpecification"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1258:1: ruleFormatSpecification returns [EObject current=null] : (otherlv_0= 'format:' ( (lv_fileformat_1_0= ruleFileFormat ) ) ) ;
    public final EObject ruleFormatSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Enumerator lv_fileformat_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1261:28: ( (otherlv_0= 'format:' ( (lv_fileformat_1_0= ruleFileFormat ) ) ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1262:1: (otherlv_0= 'format:' ( (lv_fileformat_1_0= ruleFileFormat ) ) )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1262:1: (otherlv_0= 'format:' ( (lv_fileformat_1_0= ruleFileFormat ) ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1262:3: otherlv_0= 'format:' ( (lv_fileformat_1_0= ruleFileFormat ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleFormatSpecification2546); 

                	newLeafNode(otherlv_0, grammarAccess.getFormatSpecificationAccess().getFormatKeyword_0());
                
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1266:1: ( (lv_fileformat_1_0= ruleFileFormat ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1267:1: (lv_fileformat_1_0= ruleFileFormat )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1267:1: (lv_fileformat_1_0= ruleFileFormat )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1268:3: lv_fileformat_1_0= ruleFileFormat
            {
             
            	        newCompositeNode(grammarAccess.getFormatSpecificationAccess().getFileformatFileFormatEnumRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleFileFormat_in_ruleFormatSpecification2567);
            lv_fileformat_1_0=ruleFileFormat();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFormatSpecificationRule());
            	        }
                   		set(
                   			current, 
                   			"fileformat",
                    		lv_fileformat_1_0, 
                    		"FileFormat");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormatSpecification"


    // $ANTLR start "entryRuleSyntacticalInterpretation"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1292:1: entryRuleSyntacticalInterpretation returns [EObject current=null] : iv_ruleSyntacticalInterpretation= ruleSyntacticalInterpretation EOF ;
    public final EObject entryRuleSyntacticalInterpretation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSyntacticalInterpretation = null;


        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1293:2: (iv_ruleSyntacticalInterpretation= ruleSyntacticalInterpretation EOF )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1294:2: iv_ruleSyntacticalInterpretation= ruleSyntacticalInterpretation EOF
            {
             newCompositeNode(grammarAccess.getSyntacticalInterpretationRule()); 
            pushFollow(FOLLOW_ruleSyntacticalInterpretation_in_entryRuleSyntacticalInterpretation2603);
            iv_ruleSyntacticalInterpretation=ruleSyntacticalInterpretation();

            state._fsp--;

             current =iv_ruleSyntacticalInterpretation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSyntacticalInterpretation2613); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSyntacticalInterpretation"


    // $ANTLR start "ruleSyntacticalInterpretation"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1301:1: ruleSyntacticalInterpretation returns [EObject current=null] : ( () otherlv_1= 'variability:' ( (lv_opt_2_0= ruleOptional ) )? ( (lv_yes_3_0= ruleMandatory ) )? ( (lv_no_4_0= ruleNotPresent ) )? ( (lv_na_5_0= ruleUnknown ) )? ) ;
    public final EObject ruleSyntacticalInterpretation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_opt_2_0 = null;

        EObject lv_yes_3_0 = null;

        EObject lv_no_4_0 = null;

        EObject lv_na_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1304:28: ( ( () otherlv_1= 'variability:' ( (lv_opt_2_0= ruleOptional ) )? ( (lv_yes_3_0= ruleMandatory ) )? ( (lv_no_4_0= ruleNotPresent ) )? ( (lv_na_5_0= ruleUnknown ) )? ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1305:1: ( () otherlv_1= 'variability:' ( (lv_opt_2_0= ruleOptional ) )? ( (lv_yes_3_0= ruleMandatory ) )? ( (lv_no_4_0= ruleNotPresent ) )? ( (lv_na_5_0= ruleUnknown ) )? )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1305:1: ( () otherlv_1= 'variability:' ( (lv_opt_2_0= ruleOptional ) )? ( (lv_yes_3_0= ruleMandatory ) )? ( (lv_no_4_0= ruleNotPresent ) )? ( (lv_na_5_0= ruleUnknown ) )? )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1305:2: () otherlv_1= 'variability:' ( (lv_opt_2_0= ruleOptional ) )? ( (lv_yes_3_0= ruleMandatory ) )? ( (lv_no_4_0= ruleNotPresent ) )? ( (lv_na_5_0= ruleUnknown ) )?
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1305:2: ()
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1306:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getSyntacticalInterpretationAccess().getSyntacticalInterpretationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleSyntacticalInterpretation2659); 

                	newLeafNode(otherlv_1, grammarAccess.getSyntacticalInterpretationAccess().getVariabilityKeyword_1());
                
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1315:1: ( (lv_opt_2_0= ruleOptional ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==33) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1316:1: (lv_opt_2_0= ruleOptional )
                    {
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1316:1: (lv_opt_2_0= ruleOptional )
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1317:3: lv_opt_2_0= ruleOptional
                    {
                     
                    	        newCompositeNode(grammarAccess.getSyntacticalInterpretationAccess().getOptOptionalParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOptional_in_ruleSyntacticalInterpretation2680);
                    lv_opt_2_0=ruleOptional();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSyntacticalInterpretationRule());
                    	        }
                           		set(
                           			current, 
                           			"opt",
                            		lv_opt_2_0, 
                            		"Optional");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1333:3: ( (lv_yes_3_0= ruleMandatory ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==34) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1334:1: (lv_yes_3_0= ruleMandatory )
                    {
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1334:1: (lv_yes_3_0= ruleMandatory )
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1335:3: lv_yes_3_0= ruleMandatory
                    {
                     
                    	        newCompositeNode(grammarAccess.getSyntacticalInterpretationAccess().getYesMandatoryParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMandatory_in_ruleSyntacticalInterpretation2702);
                    lv_yes_3_0=ruleMandatory();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSyntacticalInterpretationRule());
                    	        }
                           		set(
                           			current, 
                           			"yes",
                            		lv_yes_3_0, 
                            		"Mandatory");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1351:3: ( (lv_no_4_0= ruleNotPresent ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==35) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1352:1: (lv_no_4_0= ruleNotPresent )
                    {
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1352:1: (lv_no_4_0= ruleNotPresent )
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1353:3: lv_no_4_0= ruleNotPresent
                    {
                     
                    	        newCompositeNode(grammarAccess.getSyntacticalInterpretationAccess().getNoNotPresentParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNotPresent_in_ruleSyntacticalInterpretation2724);
                    lv_no_4_0=ruleNotPresent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSyntacticalInterpretationRule());
                    	        }
                           		set(
                           			current, 
                           			"no",
                            		lv_no_4_0, 
                            		"NotPresent");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1369:3: ( (lv_na_5_0= ruleUnknown ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==36) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1370:1: (lv_na_5_0= ruleUnknown )
                    {
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1370:1: (lv_na_5_0= ruleUnknown )
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1371:3: lv_na_5_0= ruleUnknown
                    {
                     
                    	        newCompositeNode(grammarAccess.getSyntacticalInterpretationAccess().getNaUnknownParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleUnknown_in_ruleSyntacticalInterpretation2746);
                    lv_na_5_0=ruleUnknown();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSyntacticalInterpretationRule());
                    	        }
                           		set(
                           			current, 
                           			"na",
                            		lv_na_5_0, 
                            		"Unknown");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSyntacticalInterpretation"


    // $ANTLR start "entryRuleKey"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1395:1: entryRuleKey returns [EObject current=null] : iv_ruleKey= ruleKey EOF ;
    public final EObject entryRuleKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKey = null;


        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1396:2: (iv_ruleKey= ruleKey EOF )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1397:2: iv_ruleKey= ruleKey EOF
            {
             newCompositeNode(grammarAccess.getKeyRule()); 
            pushFollow(FOLLOW_ruleKey_in_entryRuleKey2783);
            iv_ruleKey=ruleKey();

            state._fsp--;

             current =iv_ruleKey; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKey2793); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKey"


    // $ANTLR start "ruleKey"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1404:1: ruleKey returns [EObject current=null] : (otherlv_0= 'key:' ( (lv_cid_1_0= RULE_STRING ) )+ ) ;
    public final EObject ruleKey() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_cid_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1407:28: ( (otherlv_0= 'key:' ( (lv_cid_1_0= RULE_STRING ) )+ ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1408:1: (otherlv_0= 'key:' ( (lv_cid_1_0= RULE_STRING ) )+ )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1408:1: (otherlv_0= 'key:' ( (lv_cid_1_0= RULE_STRING ) )+ )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1408:3: otherlv_0= 'key:' ( (lv_cid_1_0= RULE_STRING ) )+
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleKey2830); 

                	newLeafNode(otherlv_0, grammarAccess.getKeyAccess().getKeyKeyword_0());
                
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1412:1: ( (lv_cid_1_0= RULE_STRING ) )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_STRING) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1413:1: (lv_cid_1_0= RULE_STRING )
            	    {
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1413:1: (lv_cid_1_0= RULE_STRING )
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1414:3: lv_cid_1_0= RULE_STRING
            	    {
            	    lv_cid_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleKey2847); 

            	    			newLeafNode(lv_cid_1_0, grammarAccess.getKeyAccess().getCidSTRINGTerminalRuleCall_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getKeyRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"cid",
            	            		lv_cid_1_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKey"


    // $ANTLR start "entryRuleCSVSeparator"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1438:1: entryRuleCSVSeparator returns [EObject current=null] : iv_ruleCSVSeparator= ruleCSVSeparator EOF ;
    public final EObject entryRuleCSVSeparator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSVSeparator = null;


        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1439:2: (iv_ruleCSVSeparator= ruleCSVSeparator EOF )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1440:2: iv_ruleCSVSeparator= ruleCSVSeparator EOF
            {
             newCompositeNode(grammarAccess.getCSVSeparatorRule()); 
            pushFollow(FOLLOW_ruleCSVSeparator_in_entryRuleCSVSeparator2889);
            iv_ruleCSVSeparator=ruleCSVSeparator();

            state._fsp--;

             current =iv_ruleCSVSeparator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSVSeparator2899); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCSVSeparator"


    // $ANTLR start "ruleCSVSeparator"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1447:1: ruleCSVSeparator returns [EObject current=null] : (otherlv_0= 'separator:' ( (lv_sep_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleCSVSeparator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_sep_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1450:28: ( (otherlv_0= 'separator:' ( (lv_sep_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1451:1: (otherlv_0= 'separator:' ( (lv_sep_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1451:1: (otherlv_0= 'separator:' ( (lv_sep_1_0= RULE_STRING ) ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1451:3: otherlv_0= 'separator:' ( (lv_sep_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleCSVSeparator2936); 

                	newLeafNode(otherlv_0, grammarAccess.getCSVSeparatorAccess().getSeparatorKeyword_0());
                
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1455:1: ( (lv_sep_1_0= RULE_STRING ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1456:1: (lv_sep_1_0= RULE_STRING )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1456:1: (lv_sep_1_0= RULE_STRING )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1457:3: lv_sep_1_0= RULE_STRING
            {
            lv_sep_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCSVSeparator2953); 

            			newLeafNode(lv_sep_1_0, grammarAccess.getCSVSeparatorAccess().getSepSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCSVSeparatorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"sep",
                    		lv_sep_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCSVSeparator"


    // $ANTLR start "entryRuleCSVMultiSeparator"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1481:1: entryRuleCSVMultiSeparator returns [EObject current=null] : iv_ruleCSVMultiSeparator= ruleCSVMultiSeparator EOF ;
    public final EObject entryRuleCSVMultiSeparator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCSVMultiSeparator = null;


        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1482:2: (iv_ruleCSVMultiSeparator= ruleCSVMultiSeparator EOF )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1483:2: iv_ruleCSVMultiSeparator= ruleCSVMultiSeparator EOF
            {
             newCompositeNode(grammarAccess.getCSVMultiSeparatorRule()); 
            pushFollow(FOLLOW_ruleCSVMultiSeparator_in_entryRuleCSVMultiSeparator2994);
            iv_ruleCSVMultiSeparator=ruleCSVMultiSeparator();

            state._fsp--;

             current =iv_ruleCSVMultiSeparator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCSVMultiSeparator3004); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCSVMultiSeparator"


    // $ANTLR start "ruleCSVMultiSeparator"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1490:1: ruleCSVMultiSeparator returns [EObject current=null] : (otherlv_0= 'multivalued_separator:' ( (lv_seps_1_0= RULE_STRING ) )+ ) ;
    public final EObject ruleCSVMultiSeparator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_seps_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1493:28: ( (otherlv_0= 'multivalued_separator:' ( (lv_seps_1_0= RULE_STRING ) )+ ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1494:1: (otherlv_0= 'multivalued_separator:' ( (lv_seps_1_0= RULE_STRING ) )+ )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1494:1: (otherlv_0= 'multivalued_separator:' ( (lv_seps_1_0= RULE_STRING ) )+ )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1494:3: otherlv_0= 'multivalued_separator:' ( (lv_seps_1_0= RULE_STRING ) )+
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleCSVMultiSeparator3041); 

                	newLeafNode(otherlv_0, grammarAccess.getCSVMultiSeparatorAccess().getMultivalued_separatorKeyword_0());
                
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1498:1: ( (lv_seps_1_0= RULE_STRING ) )+
            int cnt36=0;
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_STRING) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1499:1: (lv_seps_1_0= RULE_STRING )
            	    {
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1499:1: (lv_seps_1_0= RULE_STRING )
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1500:3: lv_seps_1_0= RULE_STRING
            	    {
            	    lv_seps_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCSVMultiSeparator3058); 

            	    			newLeafNode(lv_seps_1_0, grammarAccess.getCSVMultiSeparatorAccess().getSepsSTRINGTerminalRuleCall_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getCSVMultiSeparatorRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"seps",
            	            		lv_seps_1_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt36 >= 1 ) break loop36;
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCSVMultiSeparator"


    // $ANTLR start "entryRuleOptional"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1524:1: entryRuleOptional returns [EObject current=null] : iv_ruleOptional= ruleOptional EOF ;
    public final EObject entryRuleOptional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptional = null;


        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1525:2: (iv_ruleOptional= ruleOptional EOF )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1526:2: iv_ruleOptional= ruleOptional EOF
            {
             newCompositeNode(grammarAccess.getOptionalRule()); 
            pushFollow(FOLLOW_ruleOptional_in_entryRuleOptional3100);
            iv_ruleOptional=ruleOptional();

            state._fsp--;

             current =iv_ruleOptional; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptional3110); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOptional"


    // $ANTLR start "ruleOptional"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1533:1: ruleOptional returns [EObject current=null] : (otherlv_0= 'optional:' ( (lv_values_1_0= RULE_STRING ) )+ ) ;
    public final EObject ruleOptional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_values_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1536:28: ( (otherlv_0= 'optional:' ( (lv_values_1_0= RULE_STRING ) )+ ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1537:1: (otherlv_0= 'optional:' ( (lv_values_1_0= RULE_STRING ) )+ )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1537:1: (otherlv_0= 'optional:' ( (lv_values_1_0= RULE_STRING ) )+ )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1537:3: otherlv_0= 'optional:' ( (lv_values_1_0= RULE_STRING ) )+
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleOptional3147); 

                	newLeafNode(otherlv_0, grammarAccess.getOptionalAccess().getOptionalKeyword_0());
                
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1541:1: ( (lv_values_1_0= RULE_STRING ) )+
            int cnt37=0;
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_STRING) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1542:1: (lv_values_1_0= RULE_STRING )
            	    {
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1542:1: (lv_values_1_0= RULE_STRING )
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1543:3: lv_values_1_0= RULE_STRING
            	    {
            	    lv_values_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOptional3164); 

            	    			newLeafNode(lv_values_1_0, grammarAccess.getOptionalAccess().getValuesSTRINGTerminalRuleCall_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getOptionalRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"values",
            	            		lv_values_1_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptional"


    // $ANTLR start "entryRuleMandatory"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1567:1: entryRuleMandatory returns [EObject current=null] : iv_ruleMandatory= ruleMandatory EOF ;
    public final EObject entryRuleMandatory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMandatory = null;


        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1568:2: (iv_ruleMandatory= ruleMandatory EOF )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1569:2: iv_ruleMandatory= ruleMandatory EOF
            {
             newCompositeNode(grammarAccess.getMandatoryRule()); 
            pushFollow(FOLLOW_ruleMandatory_in_entryRuleMandatory3206);
            iv_ruleMandatory=ruleMandatory();

            state._fsp--;

             current =iv_ruleMandatory; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMandatory3216); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMandatory"


    // $ANTLR start "ruleMandatory"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1576:1: ruleMandatory returns [EObject current=null] : (otherlv_0= 'mandatory:' ( (lv_values_1_0= RULE_STRING ) )+ ) ;
    public final EObject ruleMandatory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_values_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1579:28: ( (otherlv_0= 'mandatory:' ( (lv_values_1_0= RULE_STRING ) )+ ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1580:1: (otherlv_0= 'mandatory:' ( (lv_values_1_0= RULE_STRING ) )+ )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1580:1: (otherlv_0= 'mandatory:' ( (lv_values_1_0= RULE_STRING ) )+ )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1580:3: otherlv_0= 'mandatory:' ( (lv_values_1_0= RULE_STRING ) )+
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleMandatory3253); 

                	newLeafNode(otherlv_0, grammarAccess.getMandatoryAccess().getMandatoryKeyword_0());
                
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1584:1: ( (lv_values_1_0= RULE_STRING ) )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_STRING) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1585:1: (lv_values_1_0= RULE_STRING )
            	    {
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1585:1: (lv_values_1_0= RULE_STRING )
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1586:3: lv_values_1_0= RULE_STRING
            	    {
            	    lv_values_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMandatory3270); 

            	    			newLeafNode(lv_values_1_0, grammarAccess.getMandatoryAccess().getValuesSTRINGTerminalRuleCall_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getMandatoryRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"values",
            	            		lv_values_1_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMandatory"


    // $ANTLR start "entryRuleNotPresent"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1610:1: entryRuleNotPresent returns [EObject current=null] : iv_ruleNotPresent= ruleNotPresent EOF ;
    public final EObject entryRuleNotPresent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotPresent = null;


        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1611:2: (iv_ruleNotPresent= ruleNotPresent EOF )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1612:2: iv_ruleNotPresent= ruleNotPresent EOF
            {
             newCompositeNode(grammarAccess.getNotPresentRule()); 
            pushFollow(FOLLOW_ruleNotPresent_in_entryRuleNotPresent3312);
            iv_ruleNotPresent=ruleNotPresent();

            state._fsp--;

             current =iv_ruleNotPresent; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotPresent3322); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNotPresent"


    // $ANTLR start "ruleNotPresent"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1619:1: ruleNotPresent returns [EObject current=null] : (otherlv_0= 'notpresent:' ( (lv_values_1_0= RULE_STRING ) )+ ) ;
    public final EObject ruleNotPresent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_values_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1622:28: ( (otherlv_0= 'notpresent:' ( (lv_values_1_0= RULE_STRING ) )+ ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1623:1: (otherlv_0= 'notpresent:' ( (lv_values_1_0= RULE_STRING ) )+ )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1623:1: (otherlv_0= 'notpresent:' ( (lv_values_1_0= RULE_STRING ) )+ )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1623:3: otherlv_0= 'notpresent:' ( (lv_values_1_0= RULE_STRING ) )+
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleNotPresent3359); 

                	newLeafNode(otherlv_0, grammarAccess.getNotPresentAccess().getNotpresentKeyword_0());
                
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1627:1: ( (lv_values_1_0= RULE_STRING ) )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==RULE_STRING) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1628:1: (lv_values_1_0= RULE_STRING )
            	    {
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1628:1: (lv_values_1_0= RULE_STRING )
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1629:3: lv_values_1_0= RULE_STRING
            	    {
            	    lv_values_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNotPresent3376); 

            	    			newLeafNode(lv_values_1_0, grammarAccess.getNotPresentAccess().getValuesSTRINGTerminalRuleCall_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getNotPresentRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"values",
            	            		lv_values_1_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNotPresent"


    // $ANTLR start "entryRuleUnknown"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1653:1: entryRuleUnknown returns [EObject current=null] : iv_ruleUnknown= ruleUnknown EOF ;
    public final EObject entryRuleUnknown() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnknown = null;


        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1654:2: (iv_ruleUnknown= ruleUnknown EOF )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1655:2: iv_ruleUnknown= ruleUnknown EOF
            {
             newCompositeNode(grammarAccess.getUnknownRule()); 
            pushFollow(FOLLOW_ruleUnknown_in_entryRuleUnknown3418);
            iv_ruleUnknown=ruleUnknown();

            state._fsp--;

             current =iv_ruleUnknown; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnknown3428); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnknown"


    // $ANTLR start "ruleUnknown"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1662:1: ruleUnknown returns [EObject current=null] : (otherlv_0= 'unknown:' ( (lv_values_1_0= RULE_STRING ) )+ ) ;
    public final EObject ruleUnknown() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_values_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1665:28: ( (otherlv_0= 'unknown:' ( (lv_values_1_0= RULE_STRING ) )+ ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1666:1: (otherlv_0= 'unknown:' ( (lv_values_1_0= RULE_STRING ) )+ )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1666:1: (otherlv_0= 'unknown:' ( (lv_values_1_0= RULE_STRING ) )+ )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1666:3: otherlv_0= 'unknown:' ( (lv_values_1_0= RULE_STRING ) )+
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleUnknown3465); 

                	newLeafNode(otherlv_0, grammarAccess.getUnknownAccess().getUnknownKeyword_0());
                
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1670:1: ( (lv_values_1_0= RULE_STRING ) )+
            int cnt40=0;
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_STRING) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1671:1: (lv_values_1_0= RULE_STRING )
            	    {
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1671:1: (lv_values_1_0= RULE_STRING )
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1672:3: lv_values_1_0= RULE_STRING
            	    {
            	    lv_values_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleUnknown3482); 

            	    			newLeafNode(lv_values_1_0, grammarAccess.getUnknownAccess().getValuesSTRINGTerminalRuleCall_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getUnknownRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"values",
            	            		lv_values_1_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt40 >= 1 ) break loop40;
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnknown"


    // $ANTLR start "entryRuleScopingView"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1696:1: entryRuleScopingView returns [EObject current=null] : iv_ruleScopingView= ruleScopingView EOF ;
    public final EObject entryRuleScopingView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScopingView = null;


        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1697:2: (iv_ruleScopingView= ruleScopingView EOF )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1698:2: iv_ruleScopingView= ruleScopingView EOF
            {
             newCompositeNode(grammarAccess.getScopingViewRule()); 
            pushFollow(FOLLOW_ruleScopingView_in_entryRuleScopingView3524);
            iv_ruleScopingView=ruleScopingView();

            state._fsp--;

             current =iv_ruleScopingView; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScopingView3534); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScopingView"


    // $ANTLR start "ruleScopingView"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1705:1: ruleScopingView returns [EObject current=null] : (otherlv_0= 'view:' ( (lv_view_1_0= RULE_ID ) ) ( (lv_viewname_2_0= ruleViewName ) )? ( (lv_schema_3_0= ruleStructuringInformation ) )? ( (lv_config_4_0= ruleParsingConfiguration ) )? ( (lv_products_5_0= ruleScopingProducts ) )? ( (lv_fts_6_0= ruleScopingFeatures ) )? ( (lv_alignment_7_0= ruleRewriting ) )? ( (lv_interpretation_8_0= ruleMultiValuesInterpretation ) )? ) ;
    public final EObject ruleScopingView() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_view_1_0=null;
        EObject lv_viewname_2_0 = null;

        EObject lv_schema_3_0 = null;

        EObject lv_config_4_0 = null;

        EObject lv_products_5_0 = null;

        EObject lv_fts_6_0 = null;

        EObject lv_alignment_7_0 = null;

        EObject lv_interpretation_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1708:28: ( (otherlv_0= 'view:' ( (lv_view_1_0= RULE_ID ) ) ( (lv_viewname_2_0= ruleViewName ) )? ( (lv_schema_3_0= ruleStructuringInformation ) )? ( (lv_config_4_0= ruleParsingConfiguration ) )? ( (lv_products_5_0= ruleScopingProducts ) )? ( (lv_fts_6_0= ruleScopingFeatures ) )? ( (lv_alignment_7_0= ruleRewriting ) )? ( (lv_interpretation_8_0= ruleMultiValuesInterpretation ) )? ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1709:1: (otherlv_0= 'view:' ( (lv_view_1_0= RULE_ID ) ) ( (lv_viewname_2_0= ruleViewName ) )? ( (lv_schema_3_0= ruleStructuringInformation ) )? ( (lv_config_4_0= ruleParsingConfiguration ) )? ( (lv_products_5_0= ruleScopingProducts ) )? ( (lv_fts_6_0= ruleScopingFeatures ) )? ( (lv_alignment_7_0= ruleRewriting ) )? ( (lv_interpretation_8_0= ruleMultiValuesInterpretation ) )? )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1709:1: (otherlv_0= 'view:' ( (lv_view_1_0= RULE_ID ) ) ( (lv_viewname_2_0= ruleViewName ) )? ( (lv_schema_3_0= ruleStructuringInformation ) )? ( (lv_config_4_0= ruleParsingConfiguration ) )? ( (lv_products_5_0= ruleScopingProducts ) )? ( (lv_fts_6_0= ruleScopingFeatures ) )? ( (lv_alignment_7_0= ruleRewriting ) )? ( (lv_interpretation_8_0= ruleMultiValuesInterpretation ) )? )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1709:3: otherlv_0= 'view:' ( (lv_view_1_0= RULE_ID ) ) ( (lv_viewname_2_0= ruleViewName ) )? ( (lv_schema_3_0= ruleStructuringInformation ) )? ( (lv_config_4_0= ruleParsingConfiguration ) )? ( (lv_products_5_0= ruleScopingProducts ) )? ( (lv_fts_6_0= ruleScopingFeatures ) )? ( (lv_alignment_7_0= ruleRewriting ) )? ( (lv_interpretation_8_0= ruleMultiValuesInterpretation ) )?
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleScopingView3571); 

                	newLeafNode(otherlv_0, grammarAccess.getScopingViewAccess().getViewKeyword_0());
                
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1713:1: ( (lv_view_1_0= RULE_ID ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1714:1: (lv_view_1_0= RULE_ID )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1714:1: (lv_view_1_0= RULE_ID )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1715:3: lv_view_1_0= RULE_ID
            {
            lv_view_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleScopingView3588); 

            			newLeafNode(lv_view_1_0, grammarAccess.getScopingViewAccess().getViewIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getScopingViewRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"view",
                    		lv_view_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1731:2: ( (lv_viewname_2_0= ruleViewName ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==38) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1732:1: (lv_viewname_2_0= ruleViewName )
                    {
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1732:1: (lv_viewname_2_0= ruleViewName )
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1733:3: lv_viewname_2_0= ruleViewName
                    {
                     
                    	        newCompositeNode(grammarAccess.getScopingViewAccess().getViewnameViewNameParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleViewName_in_ruleScopingView3614);
                    lv_viewname_2_0=ruleViewName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getScopingViewRule());
                    	        }
                           		set(
                           			current, 
                           			"viewname",
                            		lv_viewname_2_0, 
                            		"ViewName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1749:3: ( (lv_schema_3_0= ruleStructuringInformation ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==14) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1750:1: (lv_schema_3_0= ruleStructuringInformation )
                    {
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1750:1: (lv_schema_3_0= ruleStructuringInformation )
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1751:3: lv_schema_3_0= ruleStructuringInformation
                    {
                     
                    	        newCompositeNode(grammarAccess.getScopingViewAccess().getSchemaStructuringInformationParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStructuringInformation_in_ruleScopingView3636);
                    lv_schema_3_0=ruleStructuringInformation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getScopingViewRule());
                    	        }
                           		set(
                           			current, 
                           			"schema",
                            		lv_schema_3_0, 
                            		"StructuringInformation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1767:3: ( (lv_config_4_0= ruleParsingConfiguration ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==27) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1768:1: (lv_config_4_0= ruleParsingConfiguration )
                    {
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1768:1: (lv_config_4_0= ruleParsingConfiguration )
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1769:3: lv_config_4_0= ruleParsingConfiguration
                    {
                     
                    	        newCompositeNode(grammarAccess.getScopingViewAccess().getConfigParsingConfigurationParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParsingConfiguration_in_ruleScopingView3658);
                    lv_config_4_0=ruleParsingConfiguration();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getScopingViewRule());
                    	        }
                           		set(
                           			current, 
                           			"config",
                            		lv_config_4_0, 
                            		"ParsingConfiguration");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1785:3: ( (lv_products_5_0= ruleScopingProducts ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=41 && LA44_0<=42)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1786:1: (lv_products_5_0= ruleScopingProducts )
                    {
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1786:1: (lv_products_5_0= ruleScopingProducts )
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1787:3: lv_products_5_0= ruleScopingProducts
                    {
                     
                    	        newCompositeNode(grammarAccess.getScopingViewAccess().getProductsScopingProductsParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleScopingProducts_in_ruleScopingView3680);
                    lv_products_5_0=ruleScopingProducts();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getScopingViewRule());
                    	        }
                           		set(
                           			current, 
                           			"products",
                            		lv_products_5_0, 
                            		"ScopingProducts");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1803:3: ( (lv_fts_6_0= ruleScopingFeatures ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=39 && LA45_0<=40)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1804:1: (lv_fts_6_0= ruleScopingFeatures )
                    {
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1804:1: (lv_fts_6_0= ruleScopingFeatures )
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1805:3: lv_fts_6_0= ruleScopingFeatures
                    {
                     
                    	        newCompositeNode(grammarAccess.getScopingViewAccess().getFtsScopingFeaturesParserRuleCall_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleScopingFeatures_in_ruleScopingView3702);
                    lv_fts_6_0=ruleScopingFeatures();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getScopingViewRule());
                    	        }
                           		set(
                           			current, 
                           			"fts",
                            		lv_fts_6_0, 
                            		"ScopingFeatures");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1821:3: ( (lv_alignment_7_0= ruleRewriting ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=43 && LA46_0<=44)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1822:1: (lv_alignment_7_0= ruleRewriting )
                    {
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1822:1: (lv_alignment_7_0= ruleRewriting )
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1823:3: lv_alignment_7_0= ruleRewriting
                    {
                     
                    	        newCompositeNode(grammarAccess.getScopingViewAccess().getAlignmentRewritingParserRuleCall_7_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRewriting_in_ruleScopingView3724);
                    lv_alignment_7_0=ruleRewriting();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getScopingViewRule());
                    	        }
                           		set(
                           			current, 
                           			"alignment",
                            		lv_alignment_7_0, 
                            		"Rewriting");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1839:3: ( (lv_interpretation_8_0= ruleMultiValuesInterpretation ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==46) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1840:1: (lv_interpretation_8_0= ruleMultiValuesInterpretation )
                    {
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1840:1: (lv_interpretation_8_0= ruleMultiValuesInterpretation )
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1841:3: lv_interpretation_8_0= ruleMultiValuesInterpretation
                    {
                     
                    	        newCompositeNode(grammarAccess.getScopingViewAccess().getInterpretationMultiValuesInterpretationParserRuleCall_8_0()); 
                    	    
                    pushFollow(FOLLOW_ruleMultiValuesInterpretation_in_ruleScopingView3746);
                    lv_interpretation_8_0=ruleMultiValuesInterpretation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getScopingViewRule());
                    	        }
                           		set(
                           			current, 
                           			"interpretation",
                            		lv_interpretation_8_0, 
                            		"MultiValuesInterpretation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScopingView"


    // $ANTLR start "entryRuleViewName"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1865:1: entryRuleViewName returns [EObject current=null] : iv_ruleViewName= ruleViewName EOF ;
    public final EObject entryRuleViewName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleViewName = null;


        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1866:2: (iv_ruleViewName= ruleViewName EOF )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1867:2: iv_ruleViewName= ruleViewName EOF
            {
             newCompositeNode(grammarAccess.getViewNameRule()); 
            pushFollow(FOLLOW_ruleViewName_in_entryRuleViewName3783);
            iv_ruleViewName=ruleViewName();

            state._fsp--;

             current =iv_ruleViewName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleViewName3793); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleViewName"


    // $ANTLR start "ruleViewName"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1874:1: ruleViewName returns [EObject current=null] : (otherlv_0= 'rootname:' ( (lv_name_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleViewName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1877:28: ( (otherlv_0= 'rootname:' ( (lv_name_1_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1878:1: (otherlv_0= 'rootname:' ( (lv_name_1_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1878:1: (otherlv_0= 'rootname:' ( (lv_name_1_0= RULE_STRING ) ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1878:3: otherlv_0= 'rootname:' ( (lv_name_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleViewName3830); 

                	newLeafNode(otherlv_0, grammarAccess.getViewNameAccess().getRootnameKeyword_0());
                
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1882:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1883:1: (lv_name_1_0= RULE_STRING )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1883:1: (lv_name_1_0= RULE_STRING )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1884:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleViewName3847); 

            			newLeafNode(lv_name_1_0, grammarAccess.getViewNameAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getViewNameRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleViewName"


    // $ANTLR start "entryRuleScopingProducts"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1908:1: entryRuleScopingProducts returns [EObject current=null] : iv_ruleScopingProducts= ruleScopingProducts EOF ;
    public final EObject entryRuleScopingProducts() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScopingProducts = null;


        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1909:2: (iv_ruleScopingProducts= ruleScopingProducts EOF )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1910:2: iv_ruleScopingProducts= ruleScopingProducts EOF
            {
             newCompositeNode(grammarAccess.getScopingProductsRule()); 
            pushFollow(FOLLOW_ruleScopingProducts_in_entryRuleScopingProducts3888);
            iv_ruleScopingProducts=ruleScopingProducts();

            state._fsp--;

             current =iv_ruleScopingProducts; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScopingProducts3898); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScopingProducts"


    // $ANTLR start "ruleScopingProducts"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1917:1: ruleScopingProducts returns [EObject current=null] : this_ProductInclusionExclusion_0= ruleProductInclusionExclusion ;
    public final EObject ruleScopingProducts() throws RecognitionException {
        EObject current = null;

        EObject this_ProductInclusionExclusion_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1920:28: (this_ProductInclusionExclusion_0= ruleProductInclusionExclusion )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1922:5: this_ProductInclusionExclusion_0= ruleProductInclusionExclusion
            {
             
                    newCompositeNode(grammarAccess.getScopingProductsAccess().getProductInclusionExclusionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleProductInclusionExclusion_in_ruleScopingProducts3944);
            this_ProductInclusionExclusion_0=ruleProductInclusionExclusion();

            state._fsp--;

             
                    current = this_ProductInclusionExclusion_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScopingProducts"


    // $ANTLR start "entryRuleScopingFeatures"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1938:1: entryRuleScopingFeatures returns [EObject current=null] : iv_ruleScopingFeatures= ruleScopingFeatures EOF ;
    public final EObject entryRuleScopingFeatures() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScopingFeatures = null;


        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1939:2: (iv_ruleScopingFeatures= ruleScopingFeatures EOF )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1940:2: iv_ruleScopingFeatures= ruleScopingFeatures EOF
            {
             newCompositeNode(grammarAccess.getScopingFeaturesRule()); 
            pushFollow(FOLLOW_ruleScopingFeatures_in_entryRuleScopingFeatures3978);
            iv_ruleScopingFeatures=ruleScopingFeatures();

            state._fsp--;

             current =iv_ruleScopingFeatures; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScopingFeatures3988); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScopingFeatures"


    // $ANTLR start "ruleScopingFeatures"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1947:1: ruleScopingFeatures returns [EObject current=null] : this_FeatureInclusionExclusion_0= ruleFeatureInclusionExclusion ;
    public final EObject ruleScopingFeatures() throws RecognitionException {
        EObject current = null;

        EObject this_FeatureInclusionExclusion_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1950:28: (this_FeatureInclusionExclusion_0= ruleFeatureInclusionExclusion )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1952:5: this_FeatureInclusionExclusion_0= ruleFeatureInclusionExclusion
            {
             
                    newCompositeNode(grammarAccess.getScopingFeaturesAccess().getFeatureInclusionExclusionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleFeatureInclusionExclusion_in_ruleScopingFeatures4034);
            this_FeatureInclusionExclusion_0=ruleFeatureInclusionExclusion();

            state._fsp--;

             
                    current = this_FeatureInclusionExclusion_0; 
                    afterParserOrEnumRuleCall();
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScopingFeatures"


    // $ANTLR start "entryRuleFeatureInclusionExclusion"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1968:1: entryRuleFeatureInclusionExclusion returns [EObject current=null] : iv_ruleFeatureInclusionExclusion= ruleFeatureInclusionExclusion EOF ;
    public final EObject entryRuleFeatureInclusionExclusion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureInclusionExclusion = null;


        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1969:2: (iv_ruleFeatureInclusionExclusion= ruleFeatureInclusionExclusion EOF )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1970:2: iv_ruleFeatureInclusionExclusion= ruleFeatureInclusionExclusion EOF
            {
             newCompositeNode(grammarAccess.getFeatureInclusionExclusionRule()); 
            pushFollow(FOLLOW_ruleFeatureInclusionExclusion_in_entryRuleFeatureInclusionExclusion4068);
            iv_ruleFeatureInclusionExclusion=ruleFeatureInclusionExclusion();

            state._fsp--;

             current =iv_ruleFeatureInclusionExclusion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFeatureInclusionExclusion4078); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureInclusionExclusion"


    // $ANTLR start "ruleFeatureInclusionExclusion"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1977:1: ruleFeatureInclusionExclusion returns [EObject current=null] : ( ( (lv_except_0_0= ruleExceptFeature ) ) | ( (lv_only_1_0= ruleOnlyFeature ) ) ) ;
    public final EObject ruleFeatureInclusionExclusion() throws RecognitionException {
        EObject current = null;

        EObject lv_except_0_0 = null;

        EObject lv_only_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1980:28: ( ( ( (lv_except_0_0= ruleExceptFeature ) ) | ( (lv_only_1_0= ruleOnlyFeature ) ) ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1981:1: ( ( (lv_except_0_0= ruleExceptFeature ) ) | ( (lv_only_1_0= ruleOnlyFeature ) ) )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1981:1: ( ( (lv_except_0_0= ruleExceptFeature ) ) | ( (lv_only_1_0= ruleOnlyFeature ) ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==39) ) {
                alt48=1;
            }
            else if ( (LA48_0==40) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1981:2: ( (lv_except_0_0= ruleExceptFeature ) )
                    {
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1981:2: ( (lv_except_0_0= ruleExceptFeature ) )
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1982:1: (lv_except_0_0= ruleExceptFeature )
                    {
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1982:1: (lv_except_0_0= ruleExceptFeature )
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:1983:3: lv_except_0_0= ruleExceptFeature
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureInclusionExclusionAccess().getExceptExceptFeatureParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExceptFeature_in_ruleFeatureInclusionExclusion4124);
                    lv_except_0_0=ruleExceptFeature();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeatureInclusionExclusionRule());
                    	        }
                           		set(
                           			current, 
                           			"except",
                            		lv_except_0_0, 
                            		"ExceptFeature");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2000:6: ( (lv_only_1_0= ruleOnlyFeature ) )
                    {
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2000:6: ( (lv_only_1_0= ruleOnlyFeature ) )
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2001:1: (lv_only_1_0= ruleOnlyFeature )
                    {
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2001:1: (lv_only_1_0= ruleOnlyFeature )
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2002:3: lv_only_1_0= ruleOnlyFeature
                    {
                     
                    	        newCompositeNode(grammarAccess.getFeatureInclusionExclusionAccess().getOnlyOnlyFeatureParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOnlyFeature_in_ruleFeatureInclusionExclusion4151);
                    lv_only_1_0=ruleOnlyFeature();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFeatureInclusionExclusionRule());
                    	        }
                           		set(
                           			current, 
                           			"only",
                            		lv_only_1_0, 
                            		"OnlyFeature");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatureInclusionExclusion"


    // $ANTLR start "entryRuleExceptFeature"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2026:1: entryRuleExceptFeature returns [EObject current=null] : iv_ruleExceptFeature= ruleExceptFeature EOF ;
    public final EObject entryRuleExceptFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExceptFeature = null;


        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2027:2: (iv_ruleExceptFeature= ruleExceptFeature EOF )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2028:2: iv_ruleExceptFeature= ruleExceptFeature EOF
            {
             newCompositeNode(grammarAccess.getExceptFeatureRule()); 
            pushFollow(FOLLOW_ruleExceptFeature_in_entryRuleExceptFeature4187);
            iv_ruleExceptFeature=ruleExceptFeature();

            state._fsp--;

             current =iv_ruleExceptFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExceptFeature4197); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExceptFeature"


    // $ANTLR start "ruleExceptFeature"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2035:1: ruleExceptFeature returns [EObject current=null] : (otherlv_0= 'except_features:' ( ( (lv_fts_1_1= RULE_ID | lv_fts_1_2= RULE_STRING ) ) )+ ) ;
    public final EObject ruleExceptFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_fts_1_1=null;
        Token lv_fts_1_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2038:28: ( (otherlv_0= 'except_features:' ( ( (lv_fts_1_1= RULE_ID | lv_fts_1_2= RULE_STRING ) ) )+ ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2039:1: (otherlv_0= 'except_features:' ( ( (lv_fts_1_1= RULE_ID | lv_fts_1_2= RULE_STRING ) ) )+ )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2039:1: (otherlv_0= 'except_features:' ( ( (lv_fts_1_1= RULE_ID | lv_fts_1_2= RULE_STRING ) ) )+ )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2039:3: otherlv_0= 'except_features:' ( ( (lv_fts_1_1= RULE_ID | lv_fts_1_2= RULE_STRING ) ) )+
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleExceptFeature4234); 

                	newLeafNode(otherlv_0, grammarAccess.getExceptFeatureAccess().getExcept_featuresKeyword_0());
                
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2043:1: ( ( (lv_fts_1_1= RULE_ID | lv_fts_1_2= RULE_STRING ) ) )+
            int cnt50=0;
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=RULE_STRING && LA50_0<=RULE_ID)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2044:1: ( (lv_fts_1_1= RULE_ID | lv_fts_1_2= RULE_STRING ) )
            	    {
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2044:1: ( (lv_fts_1_1= RULE_ID | lv_fts_1_2= RULE_STRING ) )
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2045:1: (lv_fts_1_1= RULE_ID | lv_fts_1_2= RULE_STRING )
            	    {
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2045:1: (lv_fts_1_1= RULE_ID | lv_fts_1_2= RULE_STRING )
            	    int alt49=2;
            	    int LA49_0 = input.LA(1);

            	    if ( (LA49_0==RULE_ID) ) {
            	        alt49=1;
            	    }
            	    else if ( (LA49_0==RULE_STRING) ) {
            	        alt49=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 49, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt49) {
            	        case 1 :
            	            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2046:3: lv_fts_1_1= RULE_ID
            	            {
            	            lv_fts_1_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExceptFeature4253); 

            	            			newLeafNode(lv_fts_1_1, grammarAccess.getExceptFeatureAccess().getFtsIDTerminalRuleCall_1_0_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExceptFeatureRule());
            	            	        }
            	                   		addWithLastConsumed(
            	                   			current, 
            	                   			"fts",
            	                    		lv_fts_1_1, 
            	                    		"ID");
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2061:8: lv_fts_1_2= RULE_STRING
            	            {
            	            lv_fts_1_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleExceptFeature4273); 

            	            			newLeafNode(lv_fts_1_2, grammarAccess.getExceptFeatureAccess().getFtsSTRINGTerminalRuleCall_1_0_1()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExceptFeatureRule());
            	            	        }
            	                   		addWithLastConsumed(
            	                   			current, 
            	                   			"fts",
            	                    		lv_fts_1_2, 
            	                    		"STRING");
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt50 >= 1 ) break loop50;
                        EarlyExitException eee =
                            new EarlyExitException(50, input);
                        throw eee;
                }
                cnt50++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExceptFeature"


    // $ANTLR start "entryRuleOnlyFeature"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2087:1: entryRuleOnlyFeature returns [EObject current=null] : iv_ruleOnlyFeature= ruleOnlyFeature EOF ;
    public final EObject entryRuleOnlyFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnlyFeature = null;


        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2088:2: (iv_ruleOnlyFeature= ruleOnlyFeature EOF )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2089:2: iv_ruleOnlyFeature= ruleOnlyFeature EOF
            {
             newCompositeNode(grammarAccess.getOnlyFeatureRule()); 
            pushFollow(FOLLOW_ruleOnlyFeature_in_entryRuleOnlyFeature4318);
            iv_ruleOnlyFeature=ruleOnlyFeature();

            state._fsp--;

             current =iv_ruleOnlyFeature; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOnlyFeature4328); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOnlyFeature"


    // $ANTLR start "ruleOnlyFeature"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2096:1: ruleOnlyFeature returns [EObject current=null] : (otherlv_0= 'only_features:' ( ( (lv_fts_1_1= RULE_ID | lv_fts_1_2= RULE_STRING ) ) )+ ) ;
    public final EObject ruleOnlyFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_fts_1_1=null;
        Token lv_fts_1_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2099:28: ( (otherlv_0= 'only_features:' ( ( (lv_fts_1_1= RULE_ID | lv_fts_1_2= RULE_STRING ) ) )+ ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2100:1: (otherlv_0= 'only_features:' ( ( (lv_fts_1_1= RULE_ID | lv_fts_1_2= RULE_STRING ) ) )+ )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2100:1: (otherlv_0= 'only_features:' ( ( (lv_fts_1_1= RULE_ID | lv_fts_1_2= RULE_STRING ) ) )+ )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2100:3: otherlv_0= 'only_features:' ( ( (lv_fts_1_1= RULE_ID | lv_fts_1_2= RULE_STRING ) ) )+
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleOnlyFeature4365); 

                	newLeafNode(otherlv_0, grammarAccess.getOnlyFeatureAccess().getOnly_featuresKeyword_0());
                
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2104:1: ( ( (lv_fts_1_1= RULE_ID | lv_fts_1_2= RULE_STRING ) ) )+
            int cnt52=0;
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( ((LA52_0>=RULE_STRING && LA52_0<=RULE_ID)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2105:1: ( (lv_fts_1_1= RULE_ID | lv_fts_1_2= RULE_STRING ) )
            	    {
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2105:1: ( (lv_fts_1_1= RULE_ID | lv_fts_1_2= RULE_STRING ) )
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2106:1: (lv_fts_1_1= RULE_ID | lv_fts_1_2= RULE_STRING )
            	    {
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2106:1: (lv_fts_1_1= RULE_ID | lv_fts_1_2= RULE_STRING )
            	    int alt51=2;
            	    int LA51_0 = input.LA(1);

            	    if ( (LA51_0==RULE_ID) ) {
            	        alt51=1;
            	    }
            	    else if ( (LA51_0==RULE_STRING) ) {
            	        alt51=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 51, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt51) {
            	        case 1 :
            	            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2107:3: lv_fts_1_1= RULE_ID
            	            {
            	            lv_fts_1_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOnlyFeature4384); 

            	            			newLeafNode(lv_fts_1_1, grammarAccess.getOnlyFeatureAccess().getFtsIDTerminalRuleCall_1_0_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getOnlyFeatureRule());
            	            	        }
            	                   		addWithLastConsumed(
            	                   			current, 
            	                   			"fts",
            	                    		lv_fts_1_1, 
            	                    		"ID");
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2122:8: lv_fts_1_2= RULE_STRING
            	            {
            	            lv_fts_1_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOnlyFeature4404); 

            	            			newLeafNode(lv_fts_1_2, grammarAccess.getOnlyFeatureAccess().getFtsSTRINGTerminalRuleCall_1_0_1()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getOnlyFeatureRule());
            	            	        }
            	                   		addWithLastConsumed(
            	                   			current, 
            	                   			"fts",
            	                    		lv_fts_1_2, 
            	                    		"STRING");
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt52 >= 1 ) break loop52;
                        EarlyExitException eee =
                            new EarlyExitException(52, input);
                        throw eee;
                }
                cnt52++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOnlyFeature"


    // $ANTLR start "entryRuleProductInclusionExclusion"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2148:1: entryRuleProductInclusionExclusion returns [EObject current=null] : iv_ruleProductInclusionExclusion= ruleProductInclusionExclusion EOF ;
    public final EObject entryRuleProductInclusionExclusion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProductInclusionExclusion = null;


        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2149:2: (iv_ruleProductInclusionExclusion= ruleProductInclusionExclusion EOF )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2150:2: iv_ruleProductInclusionExclusion= ruleProductInclusionExclusion EOF
            {
             newCompositeNode(grammarAccess.getProductInclusionExclusionRule()); 
            pushFollow(FOLLOW_ruleProductInclusionExclusion_in_entryRuleProductInclusionExclusion4449);
            iv_ruleProductInclusionExclusion=ruleProductInclusionExclusion();

            state._fsp--;

             current =iv_ruleProductInclusionExclusion; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProductInclusionExclusion4459); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProductInclusionExclusion"


    // $ANTLR start "ruleProductInclusionExclusion"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2157:1: ruleProductInclusionExclusion returns [EObject current=null] : ( ( (lv_except_0_0= ruleExceptProduct ) ) | ( (lv_only_1_0= ruleOnlyProduct ) ) ) ;
    public final EObject ruleProductInclusionExclusion() throws RecognitionException {
        EObject current = null;

        EObject lv_except_0_0 = null;

        EObject lv_only_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2160:28: ( ( ( (lv_except_0_0= ruleExceptProduct ) ) | ( (lv_only_1_0= ruleOnlyProduct ) ) ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2161:1: ( ( (lv_except_0_0= ruleExceptProduct ) ) | ( (lv_only_1_0= ruleOnlyProduct ) ) )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2161:1: ( ( (lv_except_0_0= ruleExceptProduct ) ) | ( (lv_only_1_0= ruleOnlyProduct ) ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==41) ) {
                alt53=1;
            }
            else if ( (LA53_0==42) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2161:2: ( (lv_except_0_0= ruleExceptProduct ) )
                    {
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2161:2: ( (lv_except_0_0= ruleExceptProduct ) )
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2162:1: (lv_except_0_0= ruleExceptProduct )
                    {
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2162:1: (lv_except_0_0= ruleExceptProduct )
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2163:3: lv_except_0_0= ruleExceptProduct
                    {
                     
                    	        newCompositeNode(grammarAccess.getProductInclusionExclusionAccess().getExceptExceptProductParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleExceptProduct_in_ruleProductInclusionExclusion4505);
                    lv_except_0_0=ruleExceptProduct();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProductInclusionExclusionRule());
                    	        }
                           		set(
                           			current, 
                           			"except",
                            		lv_except_0_0, 
                            		"ExceptProduct");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2180:6: ( (lv_only_1_0= ruleOnlyProduct ) )
                    {
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2180:6: ( (lv_only_1_0= ruleOnlyProduct ) )
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2181:1: (lv_only_1_0= ruleOnlyProduct )
                    {
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2181:1: (lv_only_1_0= ruleOnlyProduct )
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2182:3: lv_only_1_0= ruleOnlyProduct
                    {
                     
                    	        newCompositeNode(grammarAccess.getProductInclusionExclusionAccess().getOnlyOnlyProductParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleOnlyProduct_in_ruleProductInclusionExclusion4532);
                    lv_only_1_0=ruleOnlyProduct();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProductInclusionExclusionRule());
                    	        }
                           		set(
                           			current, 
                           			"only",
                            		lv_only_1_0, 
                            		"OnlyProduct");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProductInclusionExclusion"


    // $ANTLR start "entryRuleExceptProduct"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2206:1: entryRuleExceptProduct returns [EObject current=null] : iv_ruleExceptProduct= ruleExceptProduct EOF ;
    public final EObject entryRuleExceptProduct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExceptProduct = null;


        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2207:2: (iv_ruleExceptProduct= ruleExceptProduct EOF )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2208:2: iv_ruleExceptProduct= ruleExceptProduct EOF
            {
             newCompositeNode(grammarAccess.getExceptProductRule()); 
            pushFollow(FOLLOW_ruleExceptProduct_in_entryRuleExceptProduct4568);
            iv_ruleExceptProduct=ruleExceptProduct();

            state._fsp--;

             current =iv_ruleExceptProduct; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExceptProduct4578); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExceptProduct"


    // $ANTLR start "ruleExceptProduct"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2215:1: ruleExceptProduct returns [EObject current=null] : (otherlv_0= 'except_products:' ( ( (lv_pds_1_1= RULE_ID | lv_pds_1_2= RULE_STRING ) ) )+ ) ;
    public final EObject ruleExceptProduct() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_pds_1_1=null;
        Token lv_pds_1_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2218:28: ( (otherlv_0= 'except_products:' ( ( (lv_pds_1_1= RULE_ID | lv_pds_1_2= RULE_STRING ) ) )+ ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2219:1: (otherlv_0= 'except_products:' ( ( (lv_pds_1_1= RULE_ID | lv_pds_1_2= RULE_STRING ) ) )+ )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2219:1: (otherlv_0= 'except_products:' ( ( (lv_pds_1_1= RULE_ID | lv_pds_1_2= RULE_STRING ) ) )+ )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2219:3: otherlv_0= 'except_products:' ( ( (lv_pds_1_1= RULE_ID | lv_pds_1_2= RULE_STRING ) ) )+
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleExceptProduct4615); 

                	newLeafNode(otherlv_0, grammarAccess.getExceptProductAccess().getExcept_productsKeyword_0());
                
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2223:1: ( ( (lv_pds_1_1= RULE_ID | lv_pds_1_2= RULE_STRING ) ) )+
            int cnt55=0;
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( ((LA55_0>=RULE_STRING && LA55_0<=RULE_ID)) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2224:1: ( (lv_pds_1_1= RULE_ID | lv_pds_1_2= RULE_STRING ) )
            	    {
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2224:1: ( (lv_pds_1_1= RULE_ID | lv_pds_1_2= RULE_STRING ) )
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2225:1: (lv_pds_1_1= RULE_ID | lv_pds_1_2= RULE_STRING )
            	    {
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2225:1: (lv_pds_1_1= RULE_ID | lv_pds_1_2= RULE_STRING )
            	    int alt54=2;
            	    int LA54_0 = input.LA(1);

            	    if ( (LA54_0==RULE_ID) ) {
            	        alt54=1;
            	    }
            	    else if ( (LA54_0==RULE_STRING) ) {
            	        alt54=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 54, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt54) {
            	        case 1 :
            	            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2226:3: lv_pds_1_1= RULE_ID
            	            {
            	            lv_pds_1_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExceptProduct4634); 

            	            			newLeafNode(lv_pds_1_1, grammarAccess.getExceptProductAccess().getPdsIDTerminalRuleCall_1_0_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExceptProductRule());
            	            	        }
            	                   		addWithLastConsumed(
            	                   			current, 
            	                   			"pds",
            	                    		lv_pds_1_1, 
            	                    		"ID");
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2241:8: lv_pds_1_2= RULE_STRING
            	            {
            	            lv_pds_1_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleExceptProduct4654); 

            	            			newLeafNode(lv_pds_1_2, grammarAccess.getExceptProductAccess().getPdsSTRINGTerminalRuleCall_1_0_1()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getExceptProductRule());
            	            	        }
            	                   		addWithLastConsumed(
            	                   			current, 
            	                   			"pds",
            	                    		lv_pds_1_2, 
            	                    		"STRING");
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt55 >= 1 ) break loop55;
                        EarlyExitException eee =
                            new EarlyExitException(55, input);
                        throw eee;
                }
                cnt55++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExceptProduct"


    // $ANTLR start "entryRuleOnlyProduct"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2267:1: entryRuleOnlyProduct returns [EObject current=null] : iv_ruleOnlyProduct= ruleOnlyProduct EOF ;
    public final EObject entryRuleOnlyProduct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOnlyProduct = null;


        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2268:2: (iv_ruleOnlyProduct= ruleOnlyProduct EOF )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2269:2: iv_ruleOnlyProduct= ruleOnlyProduct EOF
            {
             newCompositeNode(grammarAccess.getOnlyProductRule()); 
            pushFollow(FOLLOW_ruleOnlyProduct_in_entryRuleOnlyProduct4699);
            iv_ruleOnlyProduct=ruleOnlyProduct();

            state._fsp--;

             current =iv_ruleOnlyProduct; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOnlyProduct4709); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOnlyProduct"


    // $ANTLR start "ruleOnlyProduct"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2276:1: ruleOnlyProduct returns [EObject current=null] : (otherlv_0= 'only_products:' ( ( (lv_pds_1_1= RULE_ID | lv_pds_1_2= RULE_STRING ) ) )+ ) ;
    public final EObject ruleOnlyProduct() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_pds_1_1=null;
        Token lv_pds_1_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2279:28: ( (otherlv_0= 'only_products:' ( ( (lv_pds_1_1= RULE_ID | lv_pds_1_2= RULE_STRING ) ) )+ ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2280:1: (otherlv_0= 'only_products:' ( ( (lv_pds_1_1= RULE_ID | lv_pds_1_2= RULE_STRING ) ) )+ )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2280:1: (otherlv_0= 'only_products:' ( ( (lv_pds_1_1= RULE_ID | lv_pds_1_2= RULE_STRING ) ) )+ )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2280:3: otherlv_0= 'only_products:' ( ( (lv_pds_1_1= RULE_ID | lv_pds_1_2= RULE_STRING ) ) )+
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleOnlyProduct4746); 

                	newLeafNode(otherlv_0, grammarAccess.getOnlyProductAccess().getOnly_productsKeyword_0());
                
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2284:1: ( ( (lv_pds_1_1= RULE_ID | lv_pds_1_2= RULE_STRING ) ) )+
            int cnt57=0;
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( ((LA57_0>=RULE_STRING && LA57_0<=RULE_ID)) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2285:1: ( (lv_pds_1_1= RULE_ID | lv_pds_1_2= RULE_STRING ) )
            	    {
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2285:1: ( (lv_pds_1_1= RULE_ID | lv_pds_1_2= RULE_STRING ) )
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2286:1: (lv_pds_1_1= RULE_ID | lv_pds_1_2= RULE_STRING )
            	    {
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2286:1: (lv_pds_1_1= RULE_ID | lv_pds_1_2= RULE_STRING )
            	    int alt56=2;
            	    int LA56_0 = input.LA(1);

            	    if ( (LA56_0==RULE_ID) ) {
            	        alt56=1;
            	    }
            	    else if ( (LA56_0==RULE_STRING) ) {
            	        alt56=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 56, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt56) {
            	        case 1 :
            	            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2287:3: lv_pds_1_1= RULE_ID
            	            {
            	            lv_pds_1_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOnlyProduct4765); 

            	            			newLeafNode(lv_pds_1_1, grammarAccess.getOnlyProductAccess().getPdsIDTerminalRuleCall_1_0_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getOnlyProductRule());
            	            	        }
            	                   		addWithLastConsumed(
            	                   			current, 
            	                   			"pds",
            	                    		lv_pds_1_1, 
            	                    		"ID");
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2302:8: lv_pds_1_2= RULE_STRING
            	            {
            	            lv_pds_1_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleOnlyProduct4785); 

            	            			newLeafNode(lv_pds_1_2, grammarAccess.getOnlyProductAccess().getPdsSTRINGTerminalRuleCall_1_0_1()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getOnlyProductRule());
            	            	        }
            	                   		addWithLastConsumed(
            	                   			current, 
            	                   			"pds",
            	                    		lv_pds_1_2, 
            	                    		"STRING");
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt57 >= 1 ) break loop57;
                        EarlyExitException eee =
                            new EarlyExitException(57, input);
                        throw eee;
                }
                cnt57++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOnlyProduct"


    // $ANTLR start "entryRuleRewriting"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2328:1: entryRuleRewriting returns [EObject current=null] : iv_ruleRewriting= ruleRewriting EOF ;
    public final EObject entryRuleRewriting() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRewriting = null;


        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2329:2: (iv_ruleRewriting= ruleRewriting EOF )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2330:2: iv_ruleRewriting= ruleRewriting EOF
            {
             newCompositeNode(grammarAccess.getRewritingRule()); 
            pushFollow(FOLLOW_ruleRewriting_in_entryRuleRewriting4830);
            iv_ruleRewriting=ruleRewriting();

            state._fsp--;

             current =iv_ruleRewriting; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRewriting4840); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRewriting"


    // $ANTLR start "ruleRewriting"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2337:1: ruleRewriting returns [EObject current=null] : ( (otherlv_0= 'rewriting:' | otherlv_1= 'renaming:' ) ( ( (lv_oft_2_1= RULE_ID | lv_oft_2_2= RULE_STRING ) ) ) otherlv_3= '=>' ( (lv_nft_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleRewriting() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_oft_2_1=null;
        Token lv_oft_2_2=null;
        Token otherlv_3=null;
        Token lv_nft_4_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2340:28: ( ( (otherlv_0= 'rewriting:' | otherlv_1= 'renaming:' ) ( ( (lv_oft_2_1= RULE_ID | lv_oft_2_2= RULE_STRING ) ) ) otherlv_3= '=>' ( (lv_nft_4_0= RULE_STRING ) ) ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2341:1: ( (otherlv_0= 'rewriting:' | otherlv_1= 'renaming:' ) ( ( (lv_oft_2_1= RULE_ID | lv_oft_2_2= RULE_STRING ) ) ) otherlv_3= '=>' ( (lv_nft_4_0= RULE_STRING ) ) )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2341:1: ( (otherlv_0= 'rewriting:' | otherlv_1= 'renaming:' ) ( ( (lv_oft_2_1= RULE_ID | lv_oft_2_2= RULE_STRING ) ) ) otherlv_3= '=>' ( (lv_nft_4_0= RULE_STRING ) ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2341:2: (otherlv_0= 'rewriting:' | otherlv_1= 'renaming:' ) ( ( (lv_oft_2_1= RULE_ID | lv_oft_2_2= RULE_STRING ) ) ) otherlv_3= '=>' ( (lv_nft_4_0= RULE_STRING ) )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2341:2: (otherlv_0= 'rewriting:' | otherlv_1= 'renaming:' )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==43) ) {
                alt58=1;
            }
            else if ( (LA58_0==44) ) {
                alt58=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2341:4: otherlv_0= 'rewriting:'
                    {
                    otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleRewriting4878); 

                        	newLeafNode(otherlv_0, grammarAccess.getRewritingAccess().getRewritingKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2346:7: otherlv_1= 'renaming:'
                    {
                    otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleRewriting4896); 

                        	newLeafNode(otherlv_1, grammarAccess.getRewritingAccess().getRenamingKeyword_0_1());
                        

                    }
                    break;

            }

            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2350:2: ( ( (lv_oft_2_1= RULE_ID | lv_oft_2_2= RULE_STRING ) ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2351:1: ( (lv_oft_2_1= RULE_ID | lv_oft_2_2= RULE_STRING ) )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2351:1: ( (lv_oft_2_1= RULE_ID | lv_oft_2_2= RULE_STRING ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2352:1: (lv_oft_2_1= RULE_ID | lv_oft_2_2= RULE_STRING )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2352:1: (lv_oft_2_1= RULE_ID | lv_oft_2_2= RULE_STRING )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_ID) ) {
                alt59=1;
            }
            else if ( (LA59_0==RULE_STRING) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2353:3: lv_oft_2_1= RULE_ID
                    {
                    lv_oft_2_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRewriting4916); 

                    			newLeafNode(lv_oft_2_1, grammarAccess.getRewritingAccess().getOftIDTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRewritingRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"oft",
                            		lv_oft_2_1, 
                            		"ID");
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2368:8: lv_oft_2_2= RULE_STRING
                    {
                    lv_oft_2_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRewriting4936); 

                    			newLeafNode(lv_oft_2_2, grammarAccess.getRewritingAccess().getOftSTRINGTerminalRuleCall_1_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRewritingRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"oft",
                            		lv_oft_2_2, 
                            		"STRING");
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleRewriting4956); 

                	newLeafNode(otherlv_3, grammarAccess.getRewritingAccess().getEqualsSignGreaterThanSignKeyword_2());
                
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2390:1: ( (lv_nft_4_0= RULE_STRING ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2391:1: (lv_nft_4_0= RULE_STRING )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2391:1: (lv_nft_4_0= RULE_STRING )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2392:3: lv_nft_4_0= RULE_STRING
            {
            lv_nft_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleRewriting4973); 

            			newLeafNode(lv_nft_4_0, grammarAccess.getRewritingAccess().getNftSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRewritingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"nft",
                    		lv_nft_4_0, 
                    		"STRING");
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRewriting"


    // $ANTLR start "entryRuleMultiValuesInterpretation"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2416:1: entryRuleMultiValuesInterpretation returns [EObject current=null] : iv_ruleMultiValuesInterpretation= ruleMultiValuesInterpretation EOF ;
    public final EObject entryRuleMultiValuesInterpretation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiValuesInterpretation = null;


        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2417:2: (iv_ruleMultiValuesInterpretation= ruleMultiValuesInterpretation EOF )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2418:2: iv_ruleMultiValuesInterpretation= ruleMultiValuesInterpretation EOF
            {
             newCompositeNode(grammarAccess.getMultiValuesInterpretationRule()); 
            pushFollow(FOLLOW_ruleMultiValuesInterpretation_in_entryRuleMultiValuesInterpretation5014);
            iv_ruleMultiValuesInterpretation=ruleMultiValuesInterpretation();

            state._fsp--;

             current =iv_ruleMultiValuesInterpretation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiValuesInterpretation5024); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiValuesInterpretation"


    // $ANTLR start "ruleMultiValuesInterpretation"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2425:1: ruleMultiValuesInterpretation returns [EObject current=null] : (otherlv_0= 'multivalues:' ( (lv_multi_1_0= ruleMultiValueInterpretation ) )+ ) ;
    public final EObject ruleMultiValuesInterpretation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_multi_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2428:28: ( (otherlv_0= 'multivalues:' ( (lv_multi_1_0= ruleMultiValueInterpretation ) )+ ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2429:1: (otherlv_0= 'multivalues:' ( (lv_multi_1_0= ruleMultiValueInterpretation ) )+ )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2429:1: (otherlv_0= 'multivalues:' ( (lv_multi_1_0= ruleMultiValueInterpretation ) )+ )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2429:3: otherlv_0= 'multivalues:' ( (lv_multi_1_0= ruleMultiValueInterpretation ) )+
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleMultiValuesInterpretation5061); 

                	newLeafNode(otherlv_0, grammarAccess.getMultiValuesInterpretationAccess().getMultivaluesKeyword_0());
                
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2433:1: ( (lv_multi_1_0= ruleMultiValueInterpretation ) )+
            int cnt60=0;
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( ((LA60_0>=RULE_STRING && LA60_0<=RULE_ID)) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2434:1: (lv_multi_1_0= ruleMultiValueInterpretation )
            	    {
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2434:1: (lv_multi_1_0= ruleMultiValueInterpretation )
            	    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2435:3: lv_multi_1_0= ruleMultiValueInterpretation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMultiValuesInterpretationAccess().getMultiMultiValueInterpretationParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMultiValueInterpretation_in_ruleMultiValuesInterpretation5082);
            	    lv_multi_1_0=ruleMultiValueInterpretation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMultiValuesInterpretationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"multi",
            	            		lv_multi_1_0, 
            	            		"MultiValueInterpretation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt60 >= 1 ) break loop60;
                        EarlyExitException eee =
                            new EarlyExitException(60, input);
                        throw eee;
                }
                cnt60++;
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiValuesInterpretation"


    // $ANTLR start "entryRuleMultiValueInterpretation"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2459:1: entryRuleMultiValueInterpretation returns [EObject current=null] : iv_ruleMultiValueInterpretation= ruleMultiValueInterpretation EOF ;
    public final EObject entryRuleMultiValueInterpretation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiValueInterpretation = null;


        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2460:2: (iv_ruleMultiValueInterpretation= ruleMultiValueInterpretation EOF )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2461:2: iv_ruleMultiValueInterpretation= ruleMultiValueInterpretation EOF
            {
             newCompositeNode(grammarAccess.getMultiValueInterpretationRule()); 
            pushFollow(FOLLOW_ruleMultiValueInterpretation_in_entryRuleMultiValueInterpretation5119);
            iv_ruleMultiValueInterpretation=ruleMultiValueInterpretation();

            state._fsp--;

             current =iv_ruleMultiValueInterpretation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiValueInterpretation5129); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiValueInterpretation"


    // $ANTLR start "ruleMultiValueInterpretation"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2468:1: ruleMultiValueInterpretation returns [EObject current=null] : ( ( ( (lv_val_0_1= RULE_ID | lv_val_0_2= RULE_STRING ) ) ) otherlv_1= '=>' ( (lv_variability_2_0= ruleVariabilityInterpretation ) ) ) ;
    public final EObject ruleMultiValueInterpretation() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_1=null;
        Token lv_val_0_2=null;
        Token otherlv_1=null;
        Enumerator lv_variability_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2471:28: ( ( ( ( (lv_val_0_1= RULE_ID | lv_val_0_2= RULE_STRING ) ) ) otherlv_1= '=>' ( (lv_variability_2_0= ruleVariabilityInterpretation ) ) ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2472:1: ( ( ( (lv_val_0_1= RULE_ID | lv_val_0_2= RULE_STRING ) ) ) otherlv_1= '=>' ( (lv_variability_2_0= ruleVariabilityInterpretation ) ) )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2472:1: ( ( ( (lv_val_0_1= RULE_ID | lv_val_0_2= RULE_STRING ) ) ) otherlv_1= '=>' ( (lv_variability_2_0= ruleVariabilityInterpretation ) ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2472:2: ( ( (lv_val_0_1= RULE_ID | lv_val_0_2= RULE_STRING ) ) ) otherlv_1= '=>' ( (lv_variability_2_0= ruleVariabilityInterpretation ) )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2472:2: ( ( (lv_val_0_1= RULE_ID | lv_val_0_2= RULE_STRING ) ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2473:1: ( (lv_val_0_1= RULE_ID | lv_val_0_2= RULE_STRING ) )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2473:1: ( (lv_val_0_1= RULE_ID | lv_val_0_2= RULE_STRING ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2474:1: (lv_val_0_1= RULE_ID | lv_val_0_2= RULE_STRING )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2474:1: (lv_val_0_1= RULE_ID | lv_val_0_2= RULE_STRING )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_ID) ) {
                alt61=1;
            }
            else if ( (LA61_0==RULE_STRING) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2475:3: lv_val_0_1= RULE_ID
                    {
                    lv_val_0_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMultiValueInterpretation5173); 

                    			newLeafNode(lv_val_0_1, grammarAccess.getMultiValueInterpretationAccess().getValIDTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiValueInterpretationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"val",
                            		lv_val_0_1, 
                            		"ID");
                    	    

                    }
                    break;
                case 2 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2490:8: lv_val_0_2= RULE_STRING
                    {
                    lv_val_0_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMultiValueInterpretation5193); 

                    			newLeafNode(lv_val_0_2, grammarAccess.getMultiValueInterpretationAccess().getValSTRINGTerminalRuleCall_0_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMultiValueInterpretationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"val",
                            		lv_val_0_2, 
                            		"STRING");
                    	    

                    }
                    break;

            }


            }


            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleMultiValueInterpretation5213); 

                	newLeafNode(otherlv_1, grammarAccess.getMultiValueInterpretationAccess().getEqualsSignGreaterThanSignKeyword_1());
                
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2512:1: ( (lv_variability_2_0= ruleVariabilityInterpretation ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2513:1: (lv_variability_2_0= ruleVariabilityInterpretation )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2513:1: (lv_variability_2_0= ruleVariabilityInterpretation )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2514:3: lv_variability_2_0= ruleVariabilityInterpretation
            {
             
            	        newCompositeNode(grammarAccess.getMultiValueInterpretationAccess().getVariabilityVariabilityInterpretationEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleVariabilityInterpretation_in_ruleMultiValueInterpretation5234);
            lv_variability_2_0=ruleVariabilityInterpretation();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMultiValueInterpretationRule());
            	        }
                   		set(
                   			current, 
                   			"variability",
                    		lv_variability_2_0, 
                    		"VariabilityInterpretation");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiValueInterpretation"


    // $ANTLR start "ruleKindRelation"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2538:1: ruleKindRelation returns [Enumerator current=null] : ( (enumLiteral_0= 'below' ) | (enumLiteral_1= 'above' ) | (enumLiteral_2= 'moveIn' ) | (enumLiteral_3= 'copyIn' ) ) ;
    public final Enumerator ruleKindRelation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2540:28: ( ( (enumLiteral_0= 'below' ) | (enumLiteral_1= 'above' ) | (enumLiteral_2= 'moveIn' ) | (enumLiteral_3= 'copyIn' ) ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2541:1: ( (enumLiteral_0= 'below' ) | (enumLiteral_1= 'above' ) | (enumLiteral_2= 'moveIn' ) | (enumLiteral_3= 'copyIn' ) )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2541:1: ( (enumLiteral_0= 'below' ) | (enumLiteral_1= 'above' ) | (enumLiteral_2= 'moveIn' ) | (enumLiteral_3= 'copyIn' ) )
            int alt62=4;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt62=1;
                }
                break;
            case 48:
                {
                alt62=2;
                }
                break;
            case 49:
                {
                alt62=3;
                }
                break;
            case 50:
                {
                alt62=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2541:2: (enumLiteral_0= 'below' )
                    {
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2541:2: (enumLiteral_0= 'below' )
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2541:4: enumLiteral_0= 'below'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_47_in_ruleKindRelation5284); 

                            current = grammarAccess.getKindRelationAccess().getBELOWEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getKindRelationAccess().getBELOWEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2547:6: (enumLiteral_1= 'above' )
                    {
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2547:6: (enumLiteral_1= 'above' )
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2547:8: enumLiteral_1= 'above'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_48_in_ruleKindRelation5301); 

                            current = grammarAccess.getKindRelationAccess().getABOVEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getKindRelationAccess().getABOVEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2553:6: (enumLiteral_2= 'moveIn' )
                    {
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2553:6: (enumLiteral_2= 'moveIn' )
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2553:8: enumLiteral_2= 'moveIn'
                    {
                    enumLiteral_2=(Token)match(input,49,FOLLOW_49_in_ruleKindRelation5318); 

                            current = grammarAccess.getKindRelationAccess().getMOVEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getKindRelationAccess().getMOVEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2559:6: (enumLiteral_3= 'copyIn' )
                    {
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2559:6: (enumLiteral_3= 'copyIn' )
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2559:8: enumLiteral_3= 'copyIn'
                    {
                    enumLiteral_3=(Token)match(input,50,FOLLOW_50_in_ruleKindRelation5335); 

                            current = grammarAccess.getKindRelationAccess().getCOPYEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getKindRelationAccess().getCOPYEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKindRelation"


    // $ANTLR start "ruleFileFormat"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2569:1: ruleFileFormat returns [Enumerator current=null] : ( (enumLiteral_0= 'CSV' ) | (enumLiteral_1= 'RDF' ) | (enumLiteral_2= 'XML' ) ) ;
    public final Enumerator ruleFileFormat() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2571:28: ( ( (enumLiteral_0= 'CSV' ) | (enumLiteral_1= 'RDF' ) | (enumLiteral_2= 'XML' ) ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2572:1: ( (enumLiteral_0= 'CSV' ) | (enumLiteral_1= 'RDF' ) | (enumLiteral_2= 'XML' ) )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2572:1: ( (enumLiteral_0= 'CSV' ) | (enumLiteral_1= 'RDF' ) | (enumLiteral_2= 'XML' ) )
            int alt63=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt63=1;
                }
                break;
            case 52:
                {
                alt63=2;
                }
                break;
            case 53:
                {
                alt63=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2572:2: (enumLiteral_0= 'CSV' )
                    {
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2572:2: (enumLiteral_0= 'CSV' )
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2572:4: enumLiteral_0= 'CSV'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_51_in_ruleFileFormat5380); 

                            current = grammarAccess.getFileFormatAccess().getCSVEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getFileFormatAccess().getCSVEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2578:6: (enumLiteral_1= 'RDF' )
                    {
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2578:6: (enumLiteral_1= 'RDF' )
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2578:8: enumLiteral_1= 'RDF'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_52_in_ruleFileFormat5397); 

                            current = grammarAccess.getFileFormatAccess().getRDFEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getFileFormatAccess().getRDFEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2584:6: (enumLiteral_2= 'XML' )
                    {
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2584:6: (enumLiteral_2= 'XML' )
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2584:8: enumLiteral_2= 'XML'
                    {
                    enumLiteral_2=(Token)match(input,53,FOLLOW_53_in_ruleFileFormat5414); 

                            current = grammarAccess.getFileFormatAccess().getXMLEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getFileFormatAccess().getXMLEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFileFormat"


    // $ANTLR start "ruleVariabilityInterpretation"
    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2594:1: ruleVariabilityInterpretation returns [Enumerator current=null] : ( (enumLiteral_0= 'Alternatives' ) | (enumLiteral_1= 'OR-Alternatives' ) | (enumLiteral_2= 'Optional' ) | (enumLiteral_3= 'Mandatory' ) | (enumLiteral_4= 'Concat' ) ) ;
    public final Enumerator ruleVariabilityInterpretation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2596:28: ( ( (enumLiteral_0= 'Alternatives' ) | (enumLiteral_1= 'OR-Alternatives' ) | (enumLiteral_2= 'Optional' ) | (enumLiteral_3= 'Mandatory' ) | (enumLiteral_4= 'Concat' ) ) )
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2597:1: ( (enumLiteral_0= 'Alternatives' ) | (enumLiteral_1= 'OR-Alternatives' ) | (enumLiteral_2= 'Optional' ) | (enumLiteral_3= 'Mandatory' ) | (enumLiteral_4= 'Concat' ) )
            {
            // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2597:1: ( (enumLiteral_0= 'Alternatives' ) | (enumLiteral_1= 'OR-Alternatives' ) | (enumLiteral_2= 'Optional' ) | (enumLiteral_3= 'Mandatory' ) | (enumLiteral_4= 'Concat' ) )
            int alt64=5;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt64=1;
                }
                break;
            case 55:
                {
                alt64=2;
                }
                break;
            case 56:
                {
                alt64=3;
                }
                break;
            case 57:
                {
                alt64=4;
                }
                break;
            case 58:
                {
                alt64=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2597:2: (enumLiteral_0= 'Alternatives' )
                    {
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2597:2: (enumLiteral_0= 'Alternatives' )
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2597:4: enumLiteral_0= 'Alternatives'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_54_in_ruleVariabilityInterpretation5459); 

                            current = grammarAccess.getVariabilityInterpretationAccess().getXOREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getVariabilityInterpretationAccess().getXOREnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2603:6: (enumLiteral_1= 'OR-Alternatives' )
                    {
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2603:6: (enumLiteral_1= 'OR-Alternatives' )
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2603:8: enumLiteral_1= 'OR-Alternatives'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_55_in_ruleVariabilityInterpretation5476); 

                            current = grammarAccess.getVariabilityInterpretationAccess().getOREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getVariabilityInterpretationAccess().getOREnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2609:6: (enumLiteral_2= 'Optional' )
                    {
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2609:6: (enumLiteral_2= 'Optional' )
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2609:8: enumLiteral_2= 'Optional'
                    {
                    enumLiteral_2=(Token)match(input,56,FOLLOW_56_in_ruleVariabilityInterpretation5493); 

                            current = grammarAccess.getVariabilityInterpretationAccess().getOPTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getVariabilityInterpretationAccess().getOPTEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2615:6: (enumLiteral_3= 'Mandatory' )
                    {
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2615:6: (enumLiteral_3= 'Mandatory' )
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2615:8: enumLiteral_3= 'Mandatory'
                    {
                    enumLiteral_3=(Token)match(input,57,FOLLOW_57_in_ruleVariabilityInterpretation5510); 

                            current = grammarAccess.getVariabilityInterpretationAccess().getMANDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getVariabilityInterpretationAccess().getMANDEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2621:6: (enumLiteral_4= 'Concat' )
                    {
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2621:6: (enumLiteral_4= 'Concat' )
                    // ../org.xtext.example.varicell/src-gen/org/xtext/example/mydsl/parser/antlr/internal/InternalVariCell.g:2621:8: enumLiteral_4= 'Concat'
                    {
                    enumLiteral_4=(Token)match(input,58,FOLLOW_58_in_ruleVariabilityInterpretation5527); 

                            current = grammarAccess.getVariabilityInterpretationAccess().getCONCATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getVariabilityInterpretationAccess().getCONCATEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariabilityInterpretation"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleSToFMModel_in_entryRuleSToFMModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSToFMModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportViews_in_ruleSToFMModel131 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleSPLName_in_ruleSToFMModel152 = new BitSet(new long[]{0x0000002007004002L});
    public static final BitSet FOLLOW_ruleStructuringInformation_in_ruleSToFMModel173 = new BitSet(new long[]{0x0000002007000002L});
    public static final BitSet FOLLOW_ruleDefault_in_ruleSToFMModel195 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_ruleScopingView_in_ruleSToFMModel217 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_ruleImportViews_in_entryRuleImportViews254 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportViews264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleImportViews301 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDataView_in_ruleImportViews322 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleDataView_in_entryRuleDataView359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataView369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDataView411 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleDataView429 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDataView446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSPLName_in_entryRuleSPLName489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSPLName499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleSPLName536 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSPLName555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSPLName575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructuringInformation_in_entryRuleStructuringInformation619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructuringInformation629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleStructuringInformation675 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_ruleItemRelation_in_ruleStructuringInformation696 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_ruleItemGeneralization_in_ruleStructuringInformation718 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_ruleItemMapping_in_ruleStructuringInformation740 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_ruleItemRelation_in_entryRuleItemRelation777 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItemRelation787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleItemRelation831 = new BitSet(new long[]{0x0007800000000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleItemRelation851 = new BitSet(new long[]{0x0007800000000000L});
    public static final BitSet FOLLOW_ruleKindRelation_in_ruleItemRelation880 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleItemRelation899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleItemRelation919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleItemGeneralization_in_entryRuleItemGeneralization963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItemGeneralization973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleItemGeneralization1017 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleItemGeneralization1037 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleItemGeneralization1058 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_16_in_ruleItemGeneralization1076 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleItemGeneralization1096 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleItemGeneralization1116 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_ruleItemMapping_in_entryRuleItemMapping1161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleItemMapping1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleItemMapping1215 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleItemMapping1235 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_17_in_ruleItemMapping1263 = new BitSet(new long[]{0x0000000000600030L});
    public static final BitSet FOLLOW_18_in_ruleItemMapping1292 = new BitSet(new long[]{0x0000000000600030L});
    public static final BitSet FOLLOW_rulePredicateItem_in_ruleItemMapping1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredicateItem_in_entryRulePredicateItem1365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredicateItem1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_expr_in_rulePredicateItem1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_expr_in_entryRuleOr_expr1455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr_expr1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_expr_in_ruleOr_expr1512 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_19_in_ruleOr_expr1533 = new BitSet(new long[]{0x0000000000600030L});
    public static final BitSet FOLLOW_ruleAnd_expr_in_ruleOr_expr1554 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_ruleAnd_expr_in_entryRuleAnd_expr1592 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd_expr1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnary_expr_in_ruleAnd_expr1649 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleAnd_expr1670 = new BitSet(new long[]{0x0000000000600030L});
    public static final BitSet FOLLOW_ruleUnary_expr_in_ruleAnd_expr1691 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleUnary_expr_in_entryRuleUnary_expr1729 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnary_expr1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNeg_expr_in_ruleUnary_expr1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_expr_in_ruleUnary_expr1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNeg_expr_in_entryRuleNeg_expr1848 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNeg_expr1858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleNeg_expr1895 = new BitSet(new long[]{0x0000000000600030L});
    public static final BitSet FOLLOW_rulePrimary_expr_in_ruleNeg_expr1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_expr_in_entryRulePrimary_expr1952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary_expr1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePrimary_expr2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePrimary_expr2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulePrimary_expr2053 = new BitSet(new long[]{0x0000000000600030L});
    public static final BitSet FOLLOW_ruleOr_expr_in_rulePrimary_expr2075 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePrimary_expr2086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefault_in_entryRuleDefault2123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefault2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleDefault2180 = new BitSet(new long[]{0x0000060008000002L});
    public static final BitSet FOLLOW_25_in_ruleDefault2198 = new BitSet(new long[]{0x0000060008000002L});
    public static final BitSet FOLLOW_26_in_ruleDefault2216 = new BitSet(new long[]{0x0000060008000002L});
    public static final BitSet FOLLOW_ruleParsingConfiguration_in_ruleDefault2238 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_ruleScopingProducts_in_ruleDefault2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParsingConfiguration_in_entryRuleParsingConfiguration2297 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParsingConfiguration2307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleParsingConfiguration2353 = new BitSet(new long[]{0x00000001F0000002L});
    public static final BitSet FOLLOW_ruleKey_in_ruleParsingConfiguration2374 = new BitSet(new long[]{0x00000001B0000002L});
    public static final BitSet FOLLOW_ruleFormatSpecification_in_ruleParsingConfiguration2396 = new BitSet(new long[]{0x00000001A0000002L});
    public static final BitSet FOLLOW_ruleSyntacticalInterpretation_in_ruleParsingConfiguration2418 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_ruleCSVSeparator_in_ruleParsingConfiguration2440 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleCSVMultiSeparator_in_ruleParsingConfiguration2462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFormatSpecification_in_entryRuleFormatSpecification2499 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFormatSpecification2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleFormatSpecification2546 = new BitSet(new long[]{0x0038000000000000L});
    public static final BitSet FOLLOW_ruleFileFormat_in_ruleFormatSpecification2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSyntacticalInterpretation_in_entryRuleSyntacticalInterpretation2603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSyntacticalInterpretation2613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleSyntacticalInterpretation2659 = new BitSet(new long[]{0x0000001E00000002L});
    public static final BitSet FOLLOW_ruleOptional_in_ruleSyntacticalInterpretation2680 = new BitSet(new long[]{0x0000001C00000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_ruleSyntacticalInterpretation2702 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_ruleNotPresent_in_ruleSyntacticalInterpretation2724 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_ruleUnknown_in_ruleSyntacticalInterpretation2746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKey_in_entryRuleKey2783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKey2793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleKey2830 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleKey2847 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleCSVSeparator_in_entryRuleCSVSeparator2889 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSVSeparator2899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleCSVSeparator2936 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCSVSeparator2953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCSVMultiSeparator_in_entryRuleCSVMultiSeparator2994 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCSVMultiSeparator3004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleCSVMultiSeparator3041 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCSVMultiSeparator3058 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleOptional_in_entryRuleOptional3100 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptional3110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOptional3147 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOptional3164 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleMandatory_in_entryRuleMandatory3206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMandatory3216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleMandatory3253 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMandatory3270 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleNotPresent_in_entryRuleNotPresent3312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotPresent3322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleNotPresent3359 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNotPresent3376 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleUnknown_in_entryRuleUnknown3418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnknown3428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleUnknown3465 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleUnknown3482 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleScopingView_in_entryRuleScopingView3524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScopingView3534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleScopingView3571 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleScopingView3588 = new BitSet(new long[]{0x00005FC008004002L});
    public static final BitSet FOLLOW_ruleViewName_in_ruleScopingView3614 = new BitSet(new long[]{0x00005F8008004002L});
    public static final BitSet FOLLOW_ruleStructuringInformation_in_ruleScopingView3636 = new BitSet(new long[]{0x00005F8008000002L});
    public static final BitSet FOLLOW_ruleParsingConfiguration_in_ruleScopingView3658 = new BitSet(new long[]{0x00005F8000000002L});
    public static final BitSet FOLLOW_ruleScopingProducts_in_ruleScopingView3680 = new BitSet(new long[]{0x0000598000000002L});
    public static final BitSet FOLLOW_ruleScopingFeatures_in_ruleScopingView3702 = new BitSet(new long[]{0x0000580000000002L});
    public static final BitSet FOLLOW_ruleRewriting_in_ruleScopingView3724 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_ruleMultiValuesInterpretation_in_ruleScopingView3746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleViewName_in_entryRuleViewName3783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleViewName3793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleViewName3830 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleViewName3847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScopingProducts_in_entryRuleScopingProducts3888 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScopingProducts3898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProductInclusionExclusion_in_ruleScopingProducts3944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScopingFeatures_in_entryRuleScopingFeatures3978 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScopingFeatures3988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureInclusionExclusion_in_ruleScopingFeatures4034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureInclusionExclusion_in_entryRuleFeatureInclusionExclusion4068 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFeatureInclusionExclusion4078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptFeature_in_ruleFeatureInclusionExclusion4124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnlyFeature_in_ruleFeatureInclusionExclusion4151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptFeature_in_entryRuleExceptFeature4187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExceptFeature4197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleExceptFeature4234 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExceptFeature4253 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleExceptFeature4273 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_ruleOnlyFeature_in_entryRuleOnlyFeature4318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOnlyFeature4328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleOnlyFeature4365 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOnlyFeature4384 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOnlyFeature4404 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_ruleProductInclusionExclusion_in_entryRuleProductInclusionExclusion4449 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProductInclusionExclusion4459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptProduct_in_ruleProductInclusionExclusion4505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOnlyProduct_in_ruleProductInclusionExclusion4532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExceptProduct_in_entryRuleExceptProduct4568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExceptProduct4578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleExceptProduct4615 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExceptProduct4634 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleExceptProduct4654 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_ruleOnlyProduct_in_entryRuleOnlyProduct4699 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOnlyProduct4709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleOnlyProduct4746 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOnlyProduct4765 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleOnlyProduct4785 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_ruleRewriting_in_entryRuleRewriting4830 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRewriting4840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleRewriting4878 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_44_in_ruleRewriting4896 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRewriting4916 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRewriting4936 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleRewriting4956 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleRewriting4973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiValuesInterpretation_in_entryRuleMultiValuesInterpretation5014 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiValuesInterpretation5024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleMultiValuesInterpretation5061 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleMultiValueInterpretation_in_ruleMultiValuesInterpretation5082 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_ruleMultiValueInterpretation_in_entryRuleMultiValueInterpretation5119 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiValueInterpretation5129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMultiValueInterpretation5173 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMultiValueInterpretation5193 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleMultiValueInterpretation5213 = new BitSet(new long[]{0x07C0000000000000L});
    public static final BitSet FOLLOW_ruleVariabilityInterpretation_in_ruleMultiValueInterpretation5234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleKindRelation5284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleKindRelation5301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleKindRelation5318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleKindRelation5335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleFileFormat5380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleFileFormat5397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleFileFormat5414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleVariabilityInterpretation5459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleVariabilityInterpretation5476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleVariabilityInterpretation5493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleVariabilityInterpretation5510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleVariabilityInterpretation5527 = new BitSet(new long[]{0x0000000000000002L});

}