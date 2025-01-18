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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Hello'", "'Hi'", "'!'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
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
    // InternalBrainrot.g:62:1: ruleModel : ( ( rule__Model__GreetingsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:66:2: ( ( ( rule__Model__GreetingsAssignment )* ) )
            // InternalBrainrot.g:67:2: ( ( rule__Model__GreetingsAssignment )* )
            {
            // InternalBrainrot.g:67:2: ( ( rule__Model__GreetingsAssignment )* )
            // InternalBrainrot.g:68:3: ( rule__Model__GreetingsAssignment )*
            {
             before(grammarAccess.getModelAccess().getGreetingsAssignment()); 
            // InternalBrainrot.g:69:3: ( rule__Model__GreetingsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalBrainrot.g:69:4: rule__Model__GreetingsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__GreetingsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGreetingsAssignment()); 

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


    // $ANTLR start "entryRuleGreeting"
    // InternalBrainrot.g:78:1: entryRuleGreeting : ruleGreeting EOF ;
    public final void entryRuleGreeting() throws RecognitionException {
        try {
            // InternalBrainrot.g:79:1: ( ruleGreeting EOF )
            // InternalBrainrot.g:80:1: ruleGreeting EOF
            {
             before(grammarAccess.getGreetingRule()); 
            pushFollow(FOLLOW_1);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getGreetingRule()); 
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
    // $ANTLR end "entryRuleGreeting"


    // $ANTLR start "ruleGreeting"
    // InternalBrainrot.g:87:1: ruleGreeting : ( ( rule__Greeting__Group__0 ) ) ;
    public final void ruleGreeting() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:91:2: ( ( ( rule__Greeting__Group__0 ) ) )
            // InternalBrainrot.g:92:2: ( ( rule__Greeting__Group__0 ) )
            {
            // InternalBrainrot.g:92:2: ( ( rule__Greeting__Group__0 ) )
            // InternalBrainrot.g:93:3: ( rule__Greeting__Group__0 )
            {
             before(grammarAccess.getGreetingAccess().getGroup()); 
            // InternalBrainrot.g:94:3: ( rule__Greeting__Group__0 )
            // InternalBrainrot.g:94:4: rule__Greeting__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Greeting__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getGroup()); 

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
    // $ANTLR end "ruleGreeting"


    // $ANTLR start "ruleTypeOfGreeting"
    // InternalBrainrot.g:103:1: ruleTypeOfGreeting : ( ( rule__TypeOfGreeting__Alternatives ) ) ;
    public final void ruleTypeOfGreeting() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:107:1: ( ( ( rule__TypeOfGreeting__Alternatives ) ) )
            // InternalBrainrot.g:108:2: ( ( rule__TypeOfGreeting__Alternatives ) )
            {
            // InternalBrainrot.g:108:2: ( ( rule__TypeOfGreeting__Alternatives ) )
            // InternalBrainrot.g:109:3: ( rule__TypeOfGreeting__Alternatives )
            {
             before(grammarAccess.getTypeOfGreetingAccess().getAlternatives()); 
            // InternalBrainrot.g:110:3: ( rule__TypeOfGreeting__Alternatives )
            // InternalBrainrot.g:110:4: rule__TypeOfGreeting__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TypeOfGreeting__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeOfGreetingAccess().getAlternatives()); 

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
    // $ANTLR end "ruleTypeOfGreeting"


    // $ANTLR start "rule__TypeOfGreeting__Alternatives"
    // InternalBrainrot.g:118:1: rule__TypeOfGreeting__Alternatives : ( ( ( 'Hello' ) ) | ( ( 'Hi' ) ) );
    public final void rule__TypeOfGreeting__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:122:1: ( ( ( 'Hello' ) ) | ( ( 'Hi' ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalBrainrot.g:123:2: ( ( 'Hello' ) )
                    {
                    // InternalBrainrot.g:123:2: ( ( 'Hello' ) )
                    // InternalBrainrot.g:124:3: ( 'Hello' )
                    {
                     before(grammarAccess.getTypeOfGreetingAccess().getHelloEnumLiteralDeclaration_0()); 
                    // InternalBrainrot.g:125:3: ( 'Hello' )
                    // InternalBrainrot.g:125:4: 'Hello'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeOfGreetingAccess().getHelloEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalBrainrot.g:129:2: ( ( 'Hi' ) )
                    {
                    // InternalBrainrot.g:129:2: ( ( 'Hi' ) )
                    // InternalBrainrot.g:130:3: ( 'Hi' )
                    {
                     before(grammarAccess.getTypeOfGreetingAccess().getHiEnumLiteralDeclaration_1()); 
                    // InternalBrainrot.g:131:3: ( 'Hi' )
                    // InternalBrainrot.g:131:4: 'Hi'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeOfGreetingAccess().getHiEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__TypeOfGreeting__Alternatives"


    // $ANTLR start "rule__Greeting__Group__0"
    // InternalBrainrot.g:139:1: rule__Greeting__Group__0 : rule__Greeting__Group__0__Impl rule__Greeting__Group__1 ;
    public final void rule__Greeting__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:143:1: ( rule__Greeting__Group__0__Impl rule__Greeting__Group__1 )
            // InternalBrainrot.g:144:2: rule__Greeting__Group__0__Impl rule__Greeting__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Greeting__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Greeting__Group__1();

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
    // $ANTLR end "rule__Greeting__Group__0"


    // $ANTLR start "rule__Greeting__Group__0__Impl"
    // InternalBrainrot.g:151:1: rule__Greeting__Group__0__Impl : ( ( rule__Greeting__GreetingAssignment_0 ) ) ;
    public final void rule__Greeting__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:155:1: ( ( ( rule__Greeting__GreetingAssignment_0 ) ) )
            // InternalBrainrot.g:156:1: ( ( rule__Greeting__GreetingAssignment_0 ) )
            {
            // InternalBrainrot.g:156:1: ( ( rule__Greeting__GreetingAssignment_0 ) )
            // InternalBrainrot.g:157:2: ( rule__Greeting__GreetingAssignment_0 )
            {
             before(grammarAccess.getGreetingAccess().getGreetingAssignment_0()); 
            // InternalBrainrot.g:158:2: ( rule__Greeting__GreetingAssignment_0 )
            // InternalBrainrot.g:158:3: rule__Greeting__GreetingAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Greeting__GreetingAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getGreetingAssignment_0()); 

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
    // $ANTLR end "rule__Greeting__Group__0__Impl"


    // $ANTLR start "rule__Greeting__Group__1"
    // InternalBrainrot.g:166:1: rule__Greeting__Group__1 : rule__Greeting__Group__1__Impl rule__Greeting__Group__2 ;
    public final void rule__Greeting__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:170:1: ( rule__Greeting__Group__1__Impl rule__Greeting__Group__2 )
            // InternalBrainrot.g:171:2: rule__Greeting__Group__1__Impl rule__Greeting__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Greeting__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Greeting__Group__2();

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
    // $ANTLR end "rule__Greeting__Group__1"


    // $ANTLR start "rule__Greeting__Group__1__Impl"
    // InternalBrainrot.g:178:1: rule__Greeting__Group__1__Impl : ( ( rule__Greeting__NameAssignment_1 ) ) ;
    public final void rule__Greeting__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:182:1: ( ( ( rule__Greeting__NameAssignment_1 ) ) )
            // InternalBrainrot.g:183:1: ( ( rule__Greeting__NameAssignment_1 ) )
            {
            // InternalBrainrot.g:183:1: ( ( rule__Greeting__NameAssignment_1 ) )
            // InternalBrainrot.g:184:2: ( rule__Greeting__NameAssignment_1 )
            {
             before(grammarAccess.getGreetingAccess().getNameAssignment_1()); 
            // InternalBrainrot.g:185:2: ( rule__Greeting__NameAssignment_1 )
            // InternalBrainrot.g:185:3: rule__Greeting__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Greeting__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGreetingAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Greeting__Group__1__Impl"


    // $ANTLR start "rule__Greeting__Group__2"
    // InternalBrainrot.g:193:1: rule__Greeting__Group__2 : rule__Greeting__Group__2__Impl ;
    public final void rule__Greeting__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:197:1: ( rule__Greeting__Group__2__Impl )
            // InternalBrainrot.g:198:2: rule__Greeting__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Greeting__Group__2__Impl();

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
    // $ANTLR end "rule__Greeting__Group__2"


    // $ANTLR start "rule__Greeting__Group__2__Impl"
    // InternalBrainrot.g:204:1: rule__Greeting__Group__2__Impl : ( '!' ) ;
    public final void rule__Greeting__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:208:1: ( ( '!' ) )
            // InternalBrainrot.g:209:1: ( '!' )
            {
            // InternalBrainrot.g:209:1: ( '!' )
            // InternalBrainrot.g:210:2: '!'
            {
             before(grammarAccess.getGreetingAccess().getExclamationMarkKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getGreetingAccess().getExclamationMarkKeyword_2()); 

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
    // $ANTLR end "rule__Greeting__Group__2__Impl"


    // $ANTLR start "rule__Model__GreetingsAssignment"
    // InternalBrainrot.g:220:1: rule__Model__GreetingsAssignment : ( ruleGreeting ) ;
    public final void rule__Model__GreetingsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:224:1: ( ( ruleGreeting ) )
            // InternalBrainrot.g:225:2: ( ruleGreeting )
            {
            // InternalBrainrot.g:225:2: ( ruleGreeting )
            // InternalBrainrot.g:226:3: ruleGreeting
            {
             before(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleGreeting();

            state._fsp--;

             after(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__GreetingsAssignment"


    // $ANTLR start "rule__Greeting__GreetingAssignment_0"
    // InternalBrainrot.g:235:1: rule__Greeting__GreetingAssignment_0 : ( ruleTypeOfGreeting ) ;
    public final void rule__Greeting__GreetingAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:239:1: ( ( ruleTypeOfGreeting ) )
            // InternalBrainrot.g:240:2: ( ruleTypeOfGreeting )
            {
            // InternalBrainrot.g:240:2: ( ruleTypeOfGreeting )
            // InternalBrainrot.g:241:3: ruleTypeOfGreeting
            {
             before(grammarAccess.getGreetingAccess().getGreetingTypeOfGreetingEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeOfGreeting();

            state._fsp--;

             after(grammarAccess.getGreetingAccess().getGreetingTypeOfGreetingEnumRuleCall_0_0()); 

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
    // $ANTLR end "rule__Greeting__GreetingAssignment_0"


    // $ANTLR start "rule__Greeting__NameAssignment_1"
    // InternalBrainrot.g:250:1: rule__Greeting__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Greeting__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalBrainrot.g:254:1: ( ( RULE_ID ) )
            // InternalBrainrot.g:255:2: ( RULE_ID )
            {
            // InternalBrainrot.g:255:2: ( RULE_ID )
            // InternalBrainrot.g:256:3: RULE_ID
            {
             before(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGreetingAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Greeting__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});

}