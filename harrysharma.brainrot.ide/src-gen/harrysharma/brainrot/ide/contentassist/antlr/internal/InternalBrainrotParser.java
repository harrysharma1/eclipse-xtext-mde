package harrysharma.brainrot.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import harrysharma.brainrot.services.BrainrotGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalBrainrotParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'rizz'", "'{'", "'}'", "'extends'", "':'", "'many'"
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

    	public void setGrammarAccess(BrainrotGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalBrainrot.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalBrainrot.g:54:1: ( ruleModel EOF )
            // InternalBrainrot.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalBrainrot.g:62:1: ruleModel : ( ( rule__Model__ElementsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:66:2: ( ( ( rule__Model__ElementsAssignment )* ) )
            // InternalBrainrot.g:67:2: ( ( rule__Model__ElementsAssignment )* )
            {
            // InternalBrainrot.g:67:2: ( ( rule__Model__ElementsAssignment )* )
            // InternalBrainrot.g:68:3: ( rule__Model__ElementsAssignment )*
            {
             before(grammarAccess.getModelAccess().getElementsAssignment()); 
            // InternalBrainrot.g:69:3: ( rule__Model__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBrainrot.g:69:4: rule__Model__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getElementsAssignment()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSkibidi"
    // InternalBrainrot.g:78:1: entryRuleSkibidi : ruleSkibidi EOF ;
    public final void entryRuleSkibidi() throws RecognitionException {
        try {
            // InternalBrainrot.g:79:1: ( ruleSkibidi EOF )
            // InternalBrainrot.g:80:1: ruleSkibidi EOF
            {
             before(grammarAccess.getSkibidiRule()); 
            pushFollow(FOLLOW_1);
            ruleSkibidi();

            state._fsp--;

             after(grammarAccess.getSkibidiRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSkibidi"


    // $ANTLR start "ruleSkibidi"
    // InternalBrainrot.g:87:1: ruleSkibidi : ( ( rule__Skibidi__Alternatives ) ) ;
    public final void ruleSkibidi() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:91:2: ( ( ( rule__Skibidi__Alternatives ) ) )
            // InternalBrainrot.g:92:2: ( ( rule__Skibidi__Alternatives ) )
            {
            // InternalBrainrot.g:92:2: ( ( rule__Skibidi__Alternatives ) )
            // InternalBrainrot.g:93:3: ( rule__Skibidi__Alternatives )
            {
             before(grammarAccess.getSkibidiAccess().getAlternatives()); 
            // InternalBrainrot.g:94:3: ( rule__Skibidi__Alternatives )
            // InternalBrainrot.g:94:4: rule__Skibidi__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Skibidi__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSkibidiAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSkibidi"


    // $ANTLR start "entryRuleSigma"
    // InternalBrainrot.g:103:1: entryRuleSigma : ruleSigma EOF ;
    public final void entryRuleSigma() throws RecognitionException {
        try {
            // InternalBrainrot.g:104:1: ( ruleSigma EOF )
            // InternalBrainrot.g:105:1: ruleSigma EOF
            {
             before(grammarAccess.getSigmaRule()); 
            pushFollow(FOLLOW_1);
            ruleSigma();

            state._fsp--;

             after(grammarAccess.getSigmaRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSigma"


    // $ANTLR start "ruleSigma"
    // InternalBrainrot.g:112:1: ruleSigma : ( ( rule__Sigma__Group__0 ) ) ;
    public final void ruleSigma() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:116:2: ( ( ( rule__Sigma__Group__0 ) ) )
            // InternalBrainrot.g:117:2: ( ( rule__Sigma__Group__0 ) )
            {
            // InternalBrainrot.g:117:2: ( ( rule__Sigma__Group__0 ) )
            // InternalBrainrot.g:118:3: ( rule__Sigma__Group__0 )
            {
             before(grammarAccess.getSigmaAccess().getGroup()); 
            // InternalBrainrot.g:119:3: ( rule__Sigma__Group__0 )
            // InternalBrainrot.g:119:4: rule__Sigma__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sigma__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSigmaAccess().getGroup()); 

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
    // $ANTLR end "ruleSigma"


    // $ANTLR start "entryRuleRizzler"
    // InternalBrainrot.g:128:1: entryRuleRizzler : ruleRizzler EOF ;
    public final void entryRuleRizzler() throws RecognitionException {
        try {
            // InternalBrainrot.g:129:1: ( ruleRizzler EOF )
            // InternalBrainrot.g:130:1: ruleRizzler EOF
            {
             before(grammarAccess.getRizzlerRule()); 
            pushFollow(FOLLOW_1);
            ruleRizzler();

            state._fsp--;

             after(grammarAccess.getRizzlerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRizzler"


    // $ANTLR start "ruleRizzler"
    // InternalBrainrot.g:137:1: ruleRizzler : ( ( rule__Rizzler__Group__0 ) ) ;
    public final void ruleRizzler() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:141:2: ( ( ( rule__Rizzler__Group__0 ) ) )
            // InternalBrainrot.g:142:2: ( ( rule__Rizzler__Group__0 ) )
            {
            // InternalBrainrot.g:142:2: ( ( rule__Rizzler__Group__0 ) )
            // InternalBrainrot.g:143:3: ( rule__Rizzler__Group__0 )
            {
             before(grammarAccess.getRizzlerAccess().getGroup()); 
            // InternalBrainrot.g:144:3: ( rule__Rizzler__Group__0 )
            // InternalBrainrot.g:144:4: rule__Rizzler__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rizzler__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRizzlerAccess().getGroup()); 

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
    // $ANTLR end "ruleRizzler"


    // $ANTLR start "entryRuleToilet"
    // InternalBrainrot.g:153:1: entryRuleToilet : ruleToilet EOF ;
    public final void entryRuleToilet() throws RecognitionException {
        try {
            // InternalBrainrot.g:154:1: ( ruleToilet EOF )
            // InternalBrainrot.g:155:1: ruleToilet EOF
            {
             before(grammarAccess.getToiletRule()); 
            pushFollow(FOLLOW_1);
            ruleToilet();

            state._fsp--;

             after(grammarAccess.getToiletRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleToilet"


    // $ANTLR start "ruleToilet"
    // InternalBrainrot.g:162:1: ruleToilet : ( ( rule__Toilet__Group__0 ) ) ;
    public final void ruleToilet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:166:2: ( ( ( rule__Toilet__Group__0 ) ) )
            // InternalBrainrot.g:167:2: ( ( rule__Toilet__Group__0 ) )
            {
            // InternalBrainrot.g:167:2: ( ( rule__Toilet__Group__0 ) )
            // InternalBrainrot.g:168:3: ( rule__Toilet__Group__0 )
            {
             before(grammarAccess.getToiletAccess().getGroup()); 
            // InternalBrainrot.g:169:3: ( rule__Toilet__Group__0 )
            // InternalBrainrot.g:169:4: rule__Toilet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Toilet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getToiletAccess().getGroup()); 

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
    // $ANTLR end "ruleToilet"


    // $ANTLR start "rule__Skibidi__Alternatives"
    // InternalBrainrot.g:177:1: rule__Skibidi__Alternatives : ( ( ruleSigma ) | ( ruleRizzler ) );
    public final void rule__Skibidi__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:181:1: ( ( ruleSigma ) | ( ruleRizzler ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_ID) ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2==EOF||LA2_2==11) ) {
                        alt2=1;
                    }
                    else if ( (LA2_2==12||LA2_2==14) ) {
                        alt2=2;
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
                    // InternalBrainrot.g:182:2: ( ruleSigma )
                    {
                    // InternalBrainrot.g:182:2: ( ruleSigma )
                    // InternalBrainrot.g:183:3: ruleSigma
                    {
                     before(grammarAccess.getSkibidiAccess().getSigmaParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSigma();

                    state._fsp--;

                     after(grammarAccess.getSkibidiAccess().getSigmaParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrainrot.g:188:2: ( ruleRizzler )
                    {
                    // InternalBrainrot.g:188:2: ( ruleRizzler )
                    // InternalBrainrot.g:189:3: ruleRizzler
                    {
                     before(grammarAccess.getSkibidiAccess().getRizzlerParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRizzler();

                    state._fsp--;

                     after(grammarAccess.getSkibidiAccess().getRizzlerParserRuleCall_1()); 

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
    // $ANTLR end "rule__Skibidi__Alternatives"


    // $ANTLR start "rule__Sigma__Group__0"
    // InternalBrainrot.g:198:1: rule__Sigma__Group__0 : rule__Sigma__Group__0__Impl rule__Sigma__Group__1 ;
    public final void rule__Sigma__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:202:1: ( rule__Sigma__Group__0__Impl rule__Sigma__Group__1 )
            // InternalBrainrot.g:203:2: rule__Sigma__Group__0__Impl rule__Sigma__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Sigma__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sigma__Group__1();

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
    // $ANTLR end "rule__Sigma__Group__0"


    // $ANTLR start "rule__Sigma__Group__0__Impl"
    // InternalBrainrot.g:210:1: rule__Sigma__Group__0__Impl : ( 'rizz' ) ;
    public final void rule__Sigma__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:214:1: ( ( 'rizz' ) )
            // InternalBrainrot.g:215:1: ( 'rizz' )
            {
            // InternalBrainrot.g:215:1: ( 'rizz' )
            // InternalBrainrot.g:216:2: 'rizz'
            {
             before(grammarAccess.getSigmaAccess().getRizzKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getSigmaAccess().getRizzKeyword_0()); 

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
    // $ANTLR end "rule__Sigma__Group__0__Impl"


    // $ANTLR start "rule__Sigma__Group__1"
    // InternalBrainrot.g:225:1: rule__Sigma__Group__1 : rule__Sigma__Group__1__Impl ;
    public final void rule__Sigma__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:229:1: ( rule__Sigma__Group__1__Impl )
            // InternalBrainrot.g:230:2: rule__Sigma__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sigma__Group__1__Impl();

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
    // $ANTLR end "rule__Sigma__Group__1"


    // $ANTLR start "rule__Sigma__Group__1__Impl"
    // InternalBrainrot.g:236:1: rule__Sigma__Group__1__Impl : ( ( rule__Sigma__NameAssignment_1 ) ) ;
    public final void rule__Sigma__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:240:1: ( ( ( rule__Sigma__NameAssignment_1 ) ) )
            // InternalBrainrot.g:241:1: ( ( rule__Sigma__NameAssignment_1 ) )
            {
            // InternalBrainrot.g:241:1: ( ( rule__Sigma__NameAssignment_1 ) )
            // InternalBrainrot.g:242:2: ( rule__Sigma__NameAssignment_1 )
            {
             before(grammarAccess.getSigmaAccess().getNameAssignment_1()); 
            // InternalBrainrot.g:243:2: ( rule__Sigma__NameAssignment_1 )
            // InternalBrainrot.g:243:3: rule__Sigma__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Sigma__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSigmaAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Sigma__Group__1__Impl"


    // $ANTLR start "rule__Rizzler__Group__0"
    // InternalBrainrot.g:252:1: rule__Rizzler__Group__0 : rule__Rizzler__Group__0__Impl rule__Rizzler__Group__1 ;
    public final void rule__Rizzler__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:256:1: ( rule__Rizzler__Group__0__Impl rule__Rizzler__Group__1 )
            // InternalBrainrot.g:257:2: rule__Rizzler__Group__0__Impl rule__Rizzler__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Rizzler__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rizzler__Group__1();

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
    // $ANTLR end "rule__Rizzler__Group__0"


    // $ANTLR start "rule__Rizzler__Group__0__Impl"
    // InternalBrainrot.g:264:1: rule__Rizzler__Group__0__Impl : ( 'rizz' ) ;
    public final void rule__Rizzler__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:268:1: ( ( 'rizz' ) )
            // InternalBrainrot.g:269:1: ( 'rizz' )
            {
            // InternalBrainrot.g:269:1: ( 'rizz' )
            // InternalBrainrot.g:270:2: 'rizz'
            {
             before(grammarAccess.getRizzlerAccess().getRizzKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getRizzlerAccess().getRizzKeyword_0()); 

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
    // $ANTLR end "rule__Rizzler__Group__0__Impl"


    // $ANTLR start "rule__Rizzler__Group__1"
    // InternalBrainrot.g:279:1: rule__Rizzler__Group__1 : rule__Rizzler__Group__1__Impl rule__Rizzler__Group__2 ;
    public final void rule__Rizzler__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:283:1: ( rule__Rizzler__Group__1__Impl rule__Rizzler__Group__2 )
            // InternalBrainrot.g:284:2: rule__Rizzler__Group__1__Impl rule__Rizzler__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Rizzler__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rizzler__Group__2();

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
    // $ANTLR end "rule__Rizzler__Group__1"


    // $ANTLR start "rule__Rizzler__Group__1__Impl"
    // InternalBrainrot.g:291:1: rule__Rizzler__Group__1__Impl : ( ( rule__Rizzler__NameAssignment_1 ) ) ;
    public final void rule__Rizzler__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:295:1: ( ( ( rule__Rizzler__NameAssignment_1 ) ) )
            // InternalBrainrot.g:296:1: ( ( rule__Rizzler__NameAssignment_1 ) )
            {
            // InternalBrainrot.g:296:1: ( ( rule__Rizzler__NameAssignment_1 ) )
            // InternalBrainrot.g:297:2: ( rule__Rizzler__NameAssignment_1 )
            {
             before(grammarAccess.getRizzlerAccess().getNameAssignment_1()); 
            // InternalBrainrot.g:298:2: ( rule__Rizzler__NameAssignment_1 )
            // InternalBrainrot.g:298:3: rule__Rizzler__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Rizzler__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRizzlerAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Rizzler__Group__1__Impl"


    // $ANTLR start "rule__Rizzler__Group__2"
    // InternalBrainrot.g:306:1: rule__Rizzler__Group__2 : rule__Rizzler__Group__2__Impl rule__Rizzler__Group__3 ;
    public final void rule__Rizzler__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:310:1: ( rule__Rizzler__Group__2__Impl rule__Rizzler__Group__3 )
            // InternalBrainrot.g:311:2: rule__Rizzler__Group__2__Impl rule__Rizzler__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Rizzler__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rizzler__Group__3();

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
    // $ANTLR end "rule__Rizzler__Group__2"


    // $ANTLR start "rule__Rizzler__Group__2__Impl"
    // InternalBrainrot.g:318:1: rule__Rizzler__Group__2__Impl : ( ( rule__Rizzler__Group_2__0 )? ) ;
    public final void rule__Rizzler__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:322:1: ( ( ( rule__Rizzler__Group_2__0 )? ) )
            // InternalBrainrot.g:323:1: ( ( rule__Rizzler__Group_2__0 )? )
            {
            // InternalBrainrot.g:323:1: ( ( rule__Rizzler__Group_2__0 )? )
            // InternalBrainrot.g:324:2: ( rule__Rizzler__Group_2__0 )?
            {
             before(grammarAccess.getRizzlerAccess().getGroup_2()); 
            // InternalBrainrot.g:325:2: ( rule__Rizzler__Group_2__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalBrainrot.g:325:3: rule__Rizzler__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Rizzler__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRizzlerAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Rizzler__Group__2__Impl"


    // $ANTLR start "rule__Rizzler__Group__3"
    // InternalBrainrot.g:333:1: rule__Rizzler__Group__3 : rule__Rizzler__Group__3__Impl rule__Rizzler__Group__4 ;
    public final void rule__Rizzler__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:337:1: ( rule__Rizzler__Group__3__Impl rule__Rizzler__Group__4 )
            // InternalBrainrot.g:338:2: rule__Rizzler__Group__3__Impl rule__Rizzler__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Rizzler__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rizzler__Group__4();

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
    // $ANTLR end "rule__Rizzler__Group__3"


    // $ANTLR start "rule__Rizzler__Group__3__Impl"
    // InternalBrainrot.g:345:1: rule__Rizzler__Group__3__Impl : ( '{' ) ;
    public final void rule__Rizzler__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:349:1: ( ( '{' ) )
            // InternalBrainrot.g:350:1: ( '{' )
            {
            // InternalBrainrot.g:350:1: ( '{' )
            // InternalBrainrot.g:351:2: '{'
            {
             before(grammarAccess.getRizzlerAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRizzlerAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Rizzler__Group__3__Impl"


    // $ANTLR start "rule__Rizzler__Group__4"
    // InternalBrainrot.g:360:1: rule__Rizzler__Group__4 : rule__Rizzler__Group__4__Impl rule__Rizzler__Group__5 ;
    public final void rule__Rizzler__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:364:1: ( rule__Rizzler__Group__4__Impl rule__Rizzler__Group__5 )
            // InternalBrainrot.g:365:2: rule__Rizzler__Group__4__Impl rule__Rizzler__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Rizzler__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rizzler__Group__5();

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
    // $ANTLR end "rule__Rizzler__Group__4"


    // $ANTLR start "rule__Rizzler__Group__4__Impl"
    // InternalBrainrot.g:372:1: rule__Rizzler__Group__4__Impl : ( ( rule__Rizzler__ToiletsAssignment_4 )* ) ;
    public final void rule__Rizzler__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:376:1: ( ( ( rule__Rizzler__ToiletsAssignment_4 )* ) )
            // InternalBrainrot.g:377:1: ( ( rule__Rizzler__ToiletsAssignment_4 )* )
            {
            // InternalBrainrot.g:377:1: ( ( rule__Rizzler__ToiletsAssignment_4 )* )
            // InternalBrainrot.g:378:2: ( rule__Rizzler__ToiletsAssignment_4 )*
            {
             before(grammarAccess.getRizzlerAccess().getToiletsAssignment_4()); 
            // InternalBrainrot.g:379:2: ( rule__Rizzler__ToiletsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalBrainrot.g:379:3: rule__Rizzler__ToiletsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Rizzler__ToiletsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getRizzlerAccess().getToiletsAssignment_4()); 

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
    // $ANTLR end "rule__Rizzler__Group__4__Impl"


    // $ANTLR start "rule__Rizzler__Group__5"
    // InternalBrainrot.g:387:1: rule__Rizzler__Group__5 : rule__Rizzler__Group__5__Impl ;
    public final void rule__Rizzler__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:391:1: ( rule__Rizzler__Group__5__Impl )
            // InternalBrainrot.g:392:2: rule__Rizzler__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rizzler__Group__5__Impl();

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
    // $ANTLR end "rule__Rizzler__Group__5"


    // $ANTLR start "rule__Rizzler__Group__5__Impl"
    // InternalBrainrot.g:398:1: rule__Rizzler__Group__5__Impl : ( '}' ) ;
    public final void rule__Rizzler__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:402:1: ( ( '}' ) )
            // InternalBrainrot.g:403:1: ( '}' )
            {
            // InternalBrainrot.g:403:1: ( '}' )
            // InternalBrainrot.g:404:2: '}'
            {
             before(grammarAccess.getRizzlerAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRizzlerAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Rizzler__Group__5__Impl"


    // $ANTLR start "rule__Rizzler__Group_2__0"
    // InternalBrainrot.g:414:1: rule__Rizzler__Group_2__0 : rule__Rizzler__Group_2__0__Impl rule__Rizzler__Group_2__1 ;
    public final void rule__Rizzler__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:418:1: ( rule__Rizzler__Group_2__0__Impl rule__Rizzler__Group_2__1 )
            // InternalBrainrot.g:419:2: rule__Rizzler__Group_2__0__Impl rule__Rizzler__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Rizzler__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rizzler__Group_2__1();

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
    // $ANTLR end "rule__Rizzler__Group_2__0"


    // $ANTLR start "rule__Rizzler__Group_2__0__Impl"
    // InternalBrainrot.g:426:1: rule__Rizzler__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Rizzler__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:430:1: ( ( 'extends' ) )
            // InternalBrainrot.g:431:1: ( 'extends' )
            {
            // InternalBrainrot.g:431:1: ( 'extends' )
            // InternalBrainrot.g:432:2: 'extends'
            {
             before(grammarAccess.getRizzlerAccess().getExtendsKeyword_2_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRizzlerAccess().getExtendsKeyword_2_0()); 

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
    // $ANTLR end "rule__Rizzler__Group_2__0__Impl"


    // $ANTLR start "rule__Rizzler__Group_2__1"
    // InternalBrainrot.g:441:1: rule__Rizzler__Group_2__1 : rule__Rizzler__Group_2__1__Impl ;
    public final void rule__Rizzler__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:445:1: ( rule__Rizzler__Group_2__1__Impl )
            // InternalBrainrot.g:446:2: rule__Rizzler__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rizzler__Group_2__1__Impl();

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
    // $ANTLR end "rule__Rizzler__Group_2__1"


    // $ANTLR start "rule__Rizzler__Group_2__1__Impl"
    // InternalBrainrot.g:452:1: rule__Rizzler__Group_2__1__Impl : ( ( rule__Rizzler__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__Rizzler__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:456:1: ( ( ( rule__Rizzler__SuperTypeAssignment_2_1 ) ) )
            // InternalBrainrot.g:457:1: ( ( rule__Rizzler__SuperTypeAssignment_2_1 ) )
            {
            // InternalBrainrot.g:457:1: ( ( rule__Rizzler__SuperTypeAssignment_2_1 ) )
            // InternalBrainrot.g:458:2: ( rule__Rizzler__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getRizzlerAccess().getSuperTypeAssignment_2_1()); 
            // InternalBrainrot.g:459:2: ( rule__Rizzler__SuperTypeAssignment_2_1 )
            // InternalBrainrot.g:459:3: rule__Rizzler__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Rizzler__SuperTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getRizzlerAccess().getSuperTypeAssignment_2_1()); 

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
    // $ANTLR end "rule__Rizzler__Group_2__1__Impl"


    // $ANTLR start "rule__Toilet__Group__0"
    // InternalBrainrot.g:468:1: rule__Toilet__Group__0 : rule__Toilet__Group__0__Impl rule__Toilet__Group__1 ;
    public final void rule__Toilet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:472:1: ( rule__Toilet__Group__0__Impl rule__Toilet__Group__1 )
            // InternalBrainrot.g:473:2: rule__Toilet__Group__0__Impl rule__Toilet__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Toilet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Toilet__Group__1();

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
    // $ANTLR end "rule__Toilet__Group__0"


    // $ANTLR start "rule__Toilet__Group__0__Impl"
    // InternalBrainrot.g:480:1: rule__Toilet__Group__0__Impl : ( ( rule__Toilet__ManyAssignment_0 )? ) ;
    public final void rule__Toilet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:484:1: ( ( ( rule__Toilet__ManyAssignment_0 )? ) )
            // InternalBrainrot.g:485:1: ( ( rule__Toilet__ManyAssignment_0 )? )
            {
            // InternalBrainrot.g:485:1: ( ( rule__Toilet__ManyAssignment_0 )? )
            // InternalBrainrot.g:486:2: ( rule__Toilet__ManyAssignment_0 )?
            {
             before(grammarAccess.getToiletAccess().getManyAssignment_0()); 
            // InternalBrainrot.g:487:2: ( rule__Toilet__ManyAssignment_0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalBrainrot.g:487:3: rule__Toilet__ManyAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Toilet__ManyAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getToiletAccess().getManyAssignment_0()); 

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
    // $ANTLR end "rule__Toilet__Group__0__Impl"


    // $ANTLR start "rule__Toilet__Group__1"
    // InternalBrainrot.g:495:1: rule__Toilet__Group__1 : rule__Toilet__Group__1__Impl rule__Toilet__Group__2 ;
    public final void rule__Toilet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:499:1: ( rule__Toilet__Group__1__Impl rule__Toilet__Group__2 )
            // InternalBrainrot.g:500:2: rule__Toilet__Group__1__Impl rule__Toilet__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Toilet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Toilet__Group__2();

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
    // $ANTLR end "rule__Toilet__Group__1"


    // $ANTLR start "rule__Toilet__Group__1__Impl"
    // InternalBrainrot.g:507:1: rule__Toilet__Group__1__Impl : ( ( rule__Toilet__NameAssignment_1 ) ) ;
    public final void rule__Toilet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:511:1: ( ( ( rule__Toilet__NameAssignment_1 ) ) )
            // InternalBrainrot.g:512:1: ( ( rule__Toilet__NameAssignment_1 ) )
            {
            // InternalBrainrot.g:512:1: ( ( rule__Toilet__NameAssignment_1 ) )
            // InternalBrainrot.g:513:2: ( rule__Toilet__NameAssignment_1 )
            {
             before(grammarAccess.getToiletAccess().getNameAssignment_1()); 
            // InternalBrainrot.g:514:2: ( rule__Toilet__NameAssignment_1 )
            // InternalBrainrot.g:514:3: rule__Toilet__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Toilet__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getToiletAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Toilet__Group__1__Impl"


    // $ANTLR start "rule__Toilet__Group__2"
    // InternalBrainrot.g:522:1: rule__Toilet__Group__2 : rule__Toilet__Group__2__Impl rule__Toilet__Group__3 ;
    public final void rule__Toilet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:526:1: ( rule__Toilet__Group__2__Impl rule__Toilet__Group__3 )
            // InternalBrainrot.g:527:2: rule__Toilet__Group__2__Impl rule__Toilet__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Toilet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Toilet__Group__3();

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
    // $ANTLR end "rule__Toilet__Group__2"


    // $ANTLR start "rule__Toilet__Group__2__Impl"
    // InternalBrainrot.g:534:1: rule__Toilet__Group__2__Impl : ( ':' ) ;
    public final void rule__Toilet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:538:1: ( ( ':' ) )
            // InternalBrainrot.g:539:1: ( ':' )
            {
            // InternalBrainrot.g:539:1: ( ':' )
            // InternalBrainrot.g:540:2: ':'
            {
             before(grammarAccess.getToiletAccess().getColonKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getToiletAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Toilet__Group__2__Impl"


    // $ANTLR start "rule__Toilet__Group__3"
    // InternalBrainrot.g:549:1: rule__Toilet__Group__3 : rule__Toilet__Group__3__Impl ;
    public final void rule__Toilet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:553:1: ( rule__Toilet__Group__3__Impl )
            // InternalBrainrot.g:554:2: rule__Toilet__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Toilet__Group__3__Impl();

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
    // $ANTLR end "rule__Toilet__Group__3"


    // $ANTLR start "rule__Toilet__Group__3__Impl"
    // InternalBrainrot.g:560:1: rule__Toilet__Group__3__Impl : ( ( rule__Toilet__TypeAssignment_3 ) ) ;
    public final void rule__Toilet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:564:1: ( ( ( rule__Toilet__TypeAssignment_3 ) ) )
            // InternalBrainrot.g:565:1: ( ( rule__Toilet__TypeAssignment_3 ) )
            {
            // InternalBrainrot.g:565:1: ( ( rule__Toilet__TypeAssignment_3 ) )
            // InternalBrainrot.g:566:2: ( rule__Toilet__TypeAssignment_3 )
            {
             before(grammarAccess.getToiletAccess().getTypeAssignment_3()); 
            // InternalBrainrot.g:567:2: ( rule__Toilet__TypeAssignment_3 )
            // InternalBrainrot.g:567:3: rule__Toilet__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Toilet__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getToiletAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__Toilet__Group__3__Impl"


    // $ANTLR start "rule__Model__ElementsAssignment"
    // InternalBrainrot.g:576:1: rule__Model__ElementsAssignment : ( ruleSkibidi ) ;
    public final void rule__Model__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:580:1: ( ( ruleSkibidi ) )
            // InternalBrainrot.g:581:2: ( ruleSkibidi )
            {
            // InternalBrainrot.g:581:2: ( ruleSkibidi )
            // InternalBrainrot.g:582:3: ruleSkibidi
            {
             before(grammarAccess.getModelAccess().getElementsSkibidiParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleSkibidi();

            state._fsp--;

             after(grammarAccess.getModelAccess().getElementsSkibidiParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__ElementsAssignment"


    // $ANTLR start "rule__Sigma__NameAssignment_1"
    // InternalBrainrot.g:591:1: rule__Sigma__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Sigma__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:595:1: ( ( RULE_ID ) )
            // InternalBrainrot.g:596:2: ( RULE_ID )
            {
            // InternalBrainrot.g:596:2: ( RULE_ID )
            // InternalBrainrot.g:597:3: RULE_ID
            {
             before(grammarAccess.getSigmaAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSigmaAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Sigma__NameAssignment_1"


    // $ANTLR start "rule__Rizzler__NameAssignment_1"
    // InternalBrainrot.g:606:1: rule__Rizzler__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Rizzler__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:610:1: ( ( RULE_ID ) )
            // InternalBrainrot.g:611:2: ( RULE_ID )
            {
            // InternalBrainrot.g:611:2: ( RULE_ID )
            // InternalBrainrot.g:612:3: RULE_ID
            {
             before(grammarAccess.getRizzlerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRizzlerAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Rizzler__NameAssignment_1"


    // $ANTLR start "rule__Rizzler__SuperTypeAssignment_2_1"
    // InternalBrainrot.g:621:1: rule__Rizzler__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Rizzler__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:625:1: ( ( ( RULE_ID ) ) )
            // InternalBrainrot.g:626:2: ( ( RULE_ID ) )
            {
            // InternalBrainrot.g:626:2: ( ( RULE_ID ) )
            // InternalBrainrot.g:627:3: ( RULE_ID )
            {
             before(grammarAccess.getRizzlerAccess().getSuperTypeRizzlerCrossReference_2_1_0()); 
            // InternalBrainrot.g:628:3: ( RULE_ID )
            // InternalBrainrot.g:629:4: RULE_ID
            {
             before(grammarAccess.getRizzlerAccess().getSuperTypeRizzlerIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRizzlerAccess().getSuperTypeRizzlerIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getRizzlerAccess().getSuperTypeRizzlerCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__Rizzler__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__Rizzler__ToiletsAssignment_4"
    // InternalBrainrot.g:640:1: rule__Rizzler__ToiletsAssignment_4 : ( ruleToilet ) ;
    public final void rule__Rizzler__ToiletsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:644:1: ( ( ruleToilet ) )
            // InternalBrainrot.g:645:2: ( ruleToilet )
            {
            // InternalBrainrot.g:645:2: ( ruleToilet )
            // InternalBrainrot.g:646:3: ruleToilet
            {
             before(grammarAccess.getRizzlerAccess().getToiletsToiletParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleToilet();

            state._fsp--;

             after(grammarAccess.getRizzlerAccess().getToiletsToiletParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Rizzler__ToiletsAssignment_4"


    // $ANTLR start "rule__Toilet__ManyAssignment_0"
    // InternalBrainrot.g:655:1: rule__Toilet__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__Toilet__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:659:1: ( ( ( 'many' ) ) )
            // InternalBrainrot.g:660:2: ( ( 'many' ) )
            {
            // InternalBrainrot.g:660:2: ( ( 'many' ) )
            // InternalBrainrot.g:661:3: ( 'many' )
            {
             before(grammarAccess.getToiletAccess().getManyManyKeyword_0_0()); 
            // InternalBrainrot.g:662:3: ( 'many' )
            // InternalBrainrot.g:663:4: 'many'
            {
             before(grammarAccess.getToiletAccess().getManyManyKeyword_0_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getToiletAccess().getManyManyKeyword_0_0()); 

            }

             after(grammarAccess.getToiletAccess().getManyManyKeyword_0_0()); 

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
    // $ANTLR end "rule__Toilet__ManyAssignment_0"


    // $ANTLR start "rule__Toilet__NameAssignment_1"
    // InternalBrainrot.g:674:1: rule__Toilet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Toilet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:678:1: ( ( RULE_ID ) )
            // InternalBrainrot.g:679:2: ( RULE_ID )
            {
            // InternalBrainrot.g:679:2: ( RULE_ID )
            // InternalBrainrot.g:680:3: RULE_ID
            {
             before(grammarAccess.getToiletAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getToiletAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Toilet__NameAssignment_1"


    // $ANTLR start "rule__Toilet__TypeAssignment_3"
    // InternalBrainrot.g:689:1: rule__Toilet__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Toilet__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:693:1: ( ( ( RULE_ID ) ) )
            // InternalBrainrot.g:694:2: ( ( RULE_ID ) )
            {
            // InternalBrainrot.g:694:2: ( ( RULE_ID ) )
            // InternalBrainrot.g:695:3: ( RULE_ID )
            {
             before(grammarAccess.getToiletAccess().getTypeSkibidiCrossReference_3_0()); 
            // InternalBrainrot.g:696:3: ( RULE_ID )
            // InternalBrainrot.g:697:4: RULE_ID
            {
             before(grammarAccess.getToiletAccess().getTypeSkibidiIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getToiletAccess().getTypeSkibidiIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getToiletAccess().getTypeSkibidiCrossReference_3_0()); 

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
    // $ANTLR end "rule__Toilet__TypeAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000012010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});

}