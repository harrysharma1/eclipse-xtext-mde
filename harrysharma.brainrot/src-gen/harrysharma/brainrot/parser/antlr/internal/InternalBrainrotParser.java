package harrysharma.brainrot.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import harrysharma.brainrot.services.BrainrotGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBrainrotParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'rizz'", "'extends'", "'{'", "'}'", "'many'", "':'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalBrainrotParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalBrainrotParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalBrainrotParser.tokenNames; }
    public String getGrammarFileName() { return "InternalBrainrot.g"; }



     	private BrainrotGrammarAccess grammarAccess;

        public InternalBrainrotParser(TokenStream input, BrainrotGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected BrainrotGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalBrainrot.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalBrainrot.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalBrainrot.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalBrainrot.g:71:1: ruleModel returns [EObject current=null] : ( (lv_elements_0_0= ruleSkibidi ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;



        	enterRule();

        try {
            // InternalBrainrot.g:77:2: ( ( (lv_elements_0_0= ruleSkibidi ) )* )
            // InternalBrainrot.g:78:2: ( (lv_elements_0_0= ruleSkibidi ) )*
            {
            // InternalBrainrot.g:78:2: ( (lv_elements_0_0= ruleSkibidi ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBrainrot.g:79:3: (lv_elements_0_0= ruleSkibidi )
            	    {
            	    // InternalBrainrot.g:79:3: (lv_elements_0_0= ruleSkibidi )
            	    // InternalBrainrot.g:80:4: lv_elements_0_0= ruleSkibidi
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getElementsSkibidiParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleSkibidi();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"elements",
            	    					lv_elements_0_0,
            	    					"harrysharma.brainrot.Brainrot.Skibidi");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSkibidi"
    // InternalBrainrot.g:100:1: entryRuleSkibidi returns [EObject current=null] : iv_ruleSkibidi= ruleSkibidi EOF ;
    public final EObject entryRuleSkibidi() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSkibidi = null;


        try {
            // InternalBrainrot.g:100:48: (iv_ruleSkibidi= ruleSkibidi EOF )
            // InternalBrainrot.g:101:2: iv_ruleSkibidi= ruleSkibidi EOF
            {
             newCompositeNode(grammarAccess.getSkibidiRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSkibidi=ruleSkibidi();

            state._fsp--;

             current =iv_ruleSkibidi; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSkibidi"


    // $ANTLR start "ruleSkibidi"
    // InternalBrainrot.g:107:1: ruleSkibidi returns [EObject current=null] : (this_Sigma_0= ruleSigma | this_Rizzler_1= ruleRizzler ) ;
    public final EObject ruleSkibidi() throws RecognitionException {
        EObject current = null;

        EObject this_Sigma_0 = null;

        EObject this_Rizzler_1 = null;



        	enterRule();

        try {
            // InternalBrainrot.g:113:2: ( (this_Sigma_0= ruleSigma | this_Rizzler_1= ruleRizzler ) )
            // InternalBrainrot.g:114:2: (this_Sigma_0= ruleSigma | this_Rizzler_1= ruleRizzler )
            {
            // InternalBrainrot.g:114:2: (this_Sigma_0= ruleSigma | this_Rizzler_1= ruleRizzler )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_ID) ) {
                    int LA2_2 = input.LA(3);

                    if ( ((LA2_2>=12 && LA2_2<=13)) ) {
                        alt2=2;
                    }
                    else if ( (LA2_2==EOF||LA2_2==11) ) {
                        alt2=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalBrainrot.g:115:3: this_Sigma_0= ruleSigma
                    {

                    			newCompositeNode(grammarAccess.getSkibidiAccess().getSigmaParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sigma_0=ruleSigma();

                    state._fsp--;


                    			current = this_Sigma_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalBrainrot.g:124:3: this_Rizzler_1= ruleRizzler
                    {

                    			newCompositeNode(grammarAccess.getSkibidiAccess().getRizzlerParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rizzler_1=ruleRizzler();

                    state._fsp--;


                    			current = this_Rizzler_1;
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
    // $ANTLR end "ruleSkibidi"


    // $ANTLR start "entryRuleSigma"
    // InternalBrainrot.g:136:1: entryRuleSigma returns [EObject current=null] : iv_ruleSigma= ruleSigma EOF ;
    public final EObject entryRuleSigma() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSigma = null;


        try {
            // InternalBrainrot.g:136:46: (iv_ruleSigma= ruleSigma EOF )
            // InternalBrainrot.g:137:2: iv_ruleSigma= ruleSigma EOF
            {
             newCompositeNode(grammarAccess.getSigmaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSigma=ruleSigma();

            state._fsp--;

             current =iv_ruleSigma; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSigma"


    // $ANTLR start "ruleSigma"
    // InternalBrainrot.g:143:1: ruleSigma returns [EObject current=null] : (otherlv_0= 'rizz' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSigma() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalBrainrot.g:149:2: ( (otherlv_0= 'rizz' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalBrainrot.g:150:2: (otherlv_0= 'rizz' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalBrainrot.g:150:2: (otherlv_0= 'rizz' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalBrainrot.g:151:3: otherlv_0= 'rizz' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getSigmaAccess().getRizzKeyword_0());
            		
            // InternalBrainrot.g:155:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBrainrot.g:156:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBrainrot.g:156:4: (lv_name_1_0= RULE_ID )
            // InternalBrainrot.g:157:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSigmaAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSigmaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

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
    // $ANTLR end "ruleSigma"


    // $ANTLR start "entryRuleRizzler"
    // InternalBrainrot.g:177:1: entryRuleRizzler returns [EObject current=null] : iv_ruleRizzler= ruleRizzler EOF ;
    public final EObject entryRuleRizzler() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRizzler = null;


        try {
            // InternalBrainrot.g:177:48: (iv_ruleRizzler= ruleRizzler EOF )
            // InternalBrainrot.g:178:2: iv_ruleRizzler= ruleRizzler EOF
            {
             newCompositeNode(grammarAccess.getRizzlerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRizzler=ruleRizzler();

            state._fsp--;

             current =iv_ruleRizzler; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRizzler"


    // $ANTLR start "ruleRizzler"
    // InternalBrainrot.g:184:1: ruleRizzler returns [EObject current=null] : (otherlv_0= 'rizz' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_toilets_5_0= ruleToilet ) )* otherlv_6= '}' ) ;
    public final EObject ruleRizzler() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_toilets_5_0 = null;



        	enterRule();

        try {
            // InternalBrainrot.g:190:2: ( (otherlv_0= 'rizz' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_toilets_5_0= ruleToilet ) )* otherlv_6= '}' ) )
            // InternalBrainrot.g:191:2: (otherlv_0= 'rizz' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_toilets_5_0= ruleToilet ) )* otherlv_6= '}' )
            {
            // InternalBrainrot.g:191:2: (otherlv_0= 'rizz' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_toilets_5_0= ruleToilet ) )* otherlv_6= '}' )
            // InternalBrainrot.g:192:3: otherlv_0= 'rizz' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_toilets_5_0= ruleToilet ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getRizzlerAccess().getRizzKeyword_0());
            		
            // InternalBrainrot.g:196:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBrainrot.g:197:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBrainrot.g:197:4: (lv_name_1_0= RULE_ID )
            // InternalBrainrot.g:198:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRizzlerAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRizzlerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalBrainrot.g:214:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalBrainrot.g:215:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getRizzlerAccess().getExtendsKeyword_2_0());
                    			
                    // InternalBrainrot.g:219:4: ( (otherlv_3= RULE_ID ) )
                    // InternalBrainrot.g:220:5: (otherlv_3= RULE_ID )
                    {
                    // InternalBrainrot.g:220:5: (otherlv_3= RULE_ID )
                    // InternalBrainrot.g:221:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRizzlerRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(otherlv_3, grammarAccess.getRizzlerAccess().getSuperTypeRizzlerCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getRizzlerAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalBrainrot.g:237:3: ( (lv_toilets_5_0= ruleToilet ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBrainrot.g:238:4: (lv_toilets_5_0= ruleToilet )
            	    {
            	    // InternalBrainrot.g:238:4: (lv_toilets_5_0= ruleToilet )
            	    // InternalBrainrot.g:239:5: lv_toilets_5_0= ruleToilet
            	    {

            	    					newCompositeNode(grammarAccess.getRizzlerAccess().getToiletsToiletParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_toilets_5_0=ruleToilet();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getRizzlerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"toilets",
            	    						lv_toilets_5_0,
            	    						"harrysharma.brainrot.Brainrot.Toilet");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRizzlerAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleRizzler"


    // $ANTLR start "entryRuleToilet"
    // InternalBrainrot.g:264:1: entryRuleToilet returns [EObject current=null] : iv_ruleToilet= ruleToilet EOF ;
    public final EObject entryRuleToilet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleToilet = null;


        try {
            // InternalBrainrot.g:264:47: (iv_ruleToilet= ruleToilet EOF )
            // InternalBrainrot.g:265:2: iv_ruleToilet= ruleToilet EOF
            {
             newCompositeNode(grammarAccess.getToiletRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleToilet=ruleToilet();

            state._fsp--;

             current =iv_ruleToilet; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleToilet"


    // $ANTLR start "ruleToilet"
    // InternalBrainrot.g:271:1: ruleToilet returns [EObject current=null] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleToilet() throws RecognitionException {
        EObject current = null;

        Token lv_many_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalBrainrot.g:277:2: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) ) )
            // InternalBrainrot.g:278:2: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalBrainrot.g:278:2: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) )
            // InternalBrainrot.g:279:3: ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) )
            {
            // InternalBrainrot.g:279:3: ( (lv_many_0_0= 'many' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalBrainrot.g:280:4: (lv_many_0_0= 'many' )
                    {
                    // InternalBrainrot.g:280:4: (lv_many_0_0= 'many' )
                    // InternalBrainrot.g:281:5: lv_many_0_0= 'many'
                    {
                    lv_many_0_0=(Token)match(input,15,FOLLOW_4); 

                    					newLeafNode(lv_many_0_0, grammarAccess.getToiletAccess().getManyManyKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getToiletRule());
                    					}
                    					setWithLastConsumed(current, "many", lv_many_0_0 != null, "many");
                    				

                    }


                    }
                    break;

            }

            // InternalBrainrot.g:293:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalBrainrot.g:294:4: (lv_name_1_0= RULE_ID )
            {
            // InternalBrainrot.g:294:4: (lv_name_1_0= RULE_ID )
            // InternalBrainrot.g:295:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getToiletAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getToiletRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getToiletAccess().getColonKeyword_2());
            		
            // InternalBrainrot.g:315:3: ( (otherlv_3= RULE_ID ) )
            // InternalBrainrot.g:316:4: (otherlv_3= RULE_ID )
            {
            // InternalBrainrot.g:316:4: (otherlv_3= RULE_ID )
            // InternalBrainrot.g:317:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getToiletRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getToiletAccess().getTypeSkibidiCrossReference_3_0());
            				

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
    // $ANTLR end "ruleToilet"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});

}