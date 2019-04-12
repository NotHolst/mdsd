package dk.sdu.mdsd.ide.contentassist.antlr.internal;

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
import dk.sdu.mdsd.services.ArduinoDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalArduinoDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_BOOLEAN_OPERATOR", "RULE_ID", "RULE_DECIMAL", "RULE_IO", "RULE_TYPE", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'when'", "'once'", "'on'", "'off'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'delta'", "'.'", "'='", "'pin'", "'map'", "'=>'", "':'", "'rate'", "'smoothing'"
    };
    public static final int RULE_BOOLEAN_OPERATOR=5;
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__19=19;
    public static final int RULE_IO=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_DECIMAL=7;
    public static final int T__26=26;
    public static final int RULE_TYPE=9;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalArduinoDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalArduinoDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalArduinoDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalArduinoDSL.g"; }


    	private ArduinoDSLGrammarAccess grammarAccess;

    	public void setGrammarAccess(ArduinoDSLGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleProgram"
    // InternalArduinoDSL.g:53:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalArduinoDSL.g:54:1: ( ruleProgram EOF )
            // InternalArduinoDSL.g:55:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalArduinoDSL.g:62:1: ruleProgram : ( ( rule__Program__ProgramAssignment )* ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:66:2: ( ( ( rule__Program__ProgramAssignment )* ) )
            // InternalArduinoDSL.g:67:2: ( ( rule__Program__ProgramAssignment )* )
            {
            // InternalArduinoDSL.g:67:2: ( ( rule__Program__ProgramAssignment )* )
            // InternalArduinoDSL.g:68:3: ( rule__Program__ProgramAssignment )*
            {
             before(grammarAccess.getProgramAccess().getProgramAssignment()); 
            // InternalArduinoDSL.g:69:3: ( rule__Program__ProgramAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=15 && LA1_0<=16)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalArduinoDSL.g:69:4: rule__Program__ProgramAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Program__ProgramAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getProgramAssignment()); 

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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleRule"
    // InternalArduinoDSL.g:78:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // InternalArduinoDSL.g:79:1: ( ruleRule EOF )
            // InternalArduinoDSL.g:80:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalArduinoDSL.g:87:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:91:2: ( ( ( rule__Rule__Group__0 ) ) )
            // InternalArduinoDSL.g:92:2: ( ( rule__Rule__Group__0 ) )
            {
            // InternalArduinoDSL.g:92:2: ( ( rule__Rule__Group__0 ) )
            // InternalArduinoDSL.g:93:3: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // InternalArduinoDSL.g:94:3: ( rule__Rule__Group__0 )
            // InternalArduinoDSL.g:94:4: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleCondition"
    // InternalArduinoDSL.g:103:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalArduinoDSL.g:104:1: ( ruleCondition EOF )
            // InternalArduinoDSL.g:105:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalArduinoDSL.g:112:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:116:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalArduinoDSL.g:117:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalArduinoDSL.g:117:2: ( ( rule__Condition__Group__0 ) )
            // InternalArduinoDSL.g:118:3: ( rule__Condition__Group__0 )
            {
             before(grammarAccess.getConditionAccess().getGroup()); 
            // InternalArduinoDSL.g:119:3: ( rule__Condition__Group__0 )
            // InternalArduinoDSL.g:119:4: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getGroup()); 

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleExp"
    // InternalArduinoDSL.g:128:1: entryRuleExp : ruleExp EOF ;
    public final void entryRuleExp() throws RecognitionException {
        try {
            // InternalArduinoDSL.g:129:1: ( ruleExp EOF )
            // InternalArduinoDSL.g:130:1: ruleExp EOF
            {
             before(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getExpRule()); 
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
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalArduinoDSL.g:137:1: ruleExp : ( ( rule__Exp__Group__0 ) ) ;
    public final void ruleExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:141:2: ( ( ( rule__Exp__Group__0 ) ) )
            // InternalArduinoDSL.g:142:2: ( ( rule__Exp__Group__0 ) )
            {
            // InternalArduinoDSL.g:142:2: ( ( rule__Exp__Group__0 ) )
            // InternalArduinoDSL.g:143:3: ( rule__Exp__Group__0 )
            {
             before(grammarAccess.getExpAccess().getGroup()); 
            // InternalArduinoDSL.g:144:3: ( rule__Exp__Group__0 )
            // InternalArduinoDSL.g:144:4: rule__Exp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getGroup()); 

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
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleFactor"
    // InternalArduinoDSL.g:153:1: entryRuleFactor : ruleFactor EOF ;
    public final void entryRuleFactor() throws RecognitionException {
        try {
            // InternalArduinoDSL.g:154:1: ( ruleFactor EOF )
            // InternalArduinoDSL.g:155:1: ruleFactor EOF
            {
             before(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getFactorRule()); 
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
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalArduinoDSL.g:162:1: ruleFactor : ( ( rule__Factor__Group__0 ) ) ;
    public final void ruleFactor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:166:2: ( ( ( rule__Factor__Group__0 ) ) )
            // InternalArduinoDSL.g:167:2: ( ( rule__Factor__Group__0 ) )
            {
            // InternalArduinoDSL.g:167:2: ( ( rule__Factor__Group__0 ) )
            // InternalArduinoDSL.g:168:3: ( rule__Factor__Group__0 )
            {
             before(grammarAccess.getFactorAccess().getGroup()); 
            // InternalArduinoDSL.g:169:3: ( rule__Factor__Group__0 )
            // InternalArduinoDSL.g:169:4: rule__Factor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getGroup()); 

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
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRuleExpWeakOp"
    // InternalArduinoDSL.g:178:1: entryRuleExpWeakOp : ruleExpWeakOp EOF ;
    public final void entryRuleExpWeakOp() throws RecognitionException {
        try {
            // InternalArduinoDSL.g:179:1: ( ruleExpWeakOp EOF )
            // InternalArduinoDSL.g:180:1: ruleExpWeakOp EOF
            {
             before(grammarAccess.getExpWeakOpRule()); 
            pushFollow(FOLLOW_1);
            ruleExpWeakOp();

            state._fsp--;

             after(grammarAccess.getExpWeakOpRule()); 
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
    // $ANTLR end "entryRuleExpWeakOp"


    // $ANTLR start "ruleExpWeakOp"
    // InternalArduinoDSL.g:187:1: ruleExpWeakOp : ( ( rule__ExpWeakOp__Alternatives ) ) ;
    public final void ruleExpWeakOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:191:2: ( ( ( rule__ExpWeakOp__Alternatives ) ) )
            // InternalArduinoDSL.g:192:2: ( ( rule__ExpWeakOp__Alternatives ) )
            {
            // InternalArduinoDSL.g:192:2: ( ( rule__ExpWeakOp__Alternatives ) )
            // InternalArduinoDSL.g:193:3: ( rule__ExpWeakOp__Alternatives )
            {
             before(grammarAccess.getExpWeakOpAccess().getAlternatives()); 
            // InternalArduinoDSL.g:194:3: ( rule__ExpWeakOp__Alternatives )
            // InternalArduinoDSL.g:194:4: rule__ExpWeakOp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExpWeakOp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpWeakOpAccess().getAlternatives()); 

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
    // $ANTLR end "ruleExpWeakOp"


    // $ANTLR start "entryRuleExpStrongOp"
    // InternalArduinoDSL.g:203:1: entryRuleExpStrongOp : ruleExpStrongOp EOF ;
    public final void entryRuleExpStrongOp() throws RecognitionException {
        try {
            // InternalArduinoDSL.g:204:1: ( ruleExpStrongOp EOF )
            // InternalArduinoDSL.g:205:1: ruleExpStrongOp EOF
            {
             before(grammarAccess.getExpStrongOpRule()); 
            pushFollow(FOLLOW_1);
            ruleExpStrongOp();

            state._fsp--;

             after(grammarAccess.getExpStrongOpRule()); 
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
    // $ANTLR end "entryRuleExpStrongOp"


    // $ANTLR start "ruleExpStrongOp"
    // InternalArduinoDSL.g:212:1: ruleExpStrongOp : ( ( rule__ExpStrongOp__Alternatives ) ) ;
    public final void ruleExpStrongOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:216:2: ( ( ( rule__ExpStrongOp__Alternatives ) ) )
            // InternalArduinoDSL.g:217:2: ( ( rule__ExpStrongOp__Alternatives ) )
            {
            // InternalArduinoDSL.g:217:2: ( ( rule__ExpStrongOp__Alternatives ) )
            // InternalArduinoDSL.g:218:3: ( rule__ExpStrongOp__Alternatives )
            {
             before(grammarAccess.getExpStrongOpAccess().getAlternatives()); 
            // InternalArduinoDSL.g:219:3: ( rule__ExpStrongOp__Alternatives )
            // InternalArduinoDSL.g:219:4: rule__ExpStrongOp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ExpStrongOp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpStrongOpAccess().getAlternatives()); 

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
    // $ANTLR end "ruleExpStrongOp"


    // $ANTLR start "entryRuleValue"
    // InternalArduinoDSL.g:228:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalArduinoDSL.g:229:1: ( ruleValue EOF )
            // InternalArduinoDSL.g:230:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalArduinoDSL.g:237:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:241:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalArduinoDSL.g:242:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalArduinoDSL.g:242:2: ( ( rule__Value__Alternatives ) )
            // InternalArduinoDSL.g:243:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalArduinoDSL.g:244:3: ( rule__Value__Alternatives )
            // InternalArduinoDSL.g:244:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleAttribute"
    // InternalArduinoDSL.g:253:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalArduinoDSL.g:254:1: ( ruleAttribute EOF )
            // InternalArduinoDSL.g:255:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalArduinoDSL.g:262:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:266:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalArduinoDSL.g:267:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalArduinoDSL.g:267:2: ( ( rule__Attribute__Group__0 ) )
            // InternalArduinoDSL.g:268:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalArduinoDSL.g:269:3: ( rule__Attribute__Group__0 )
            // InternalArduinoDSL.g:269:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleDelta"
    // InternalArduinoDSL.g:278:1: entryRuleDelta : ruleDelta EOF ;
    public final void entryRuleDelta() throws RecognitionException {
        try {
            // InternalArduinoDSL.g:279:1: ( ruleDelta EOF )
            // InternalArduinoDSL.g:280:1: ruleDelta EOF
            {
             before(grammarAccess.getDeltaRule()); 
            pushFollow(FOLLOW_1);
            ruleDelta();

            state._fsp--;

             after(grammarAccess.getDeltaRule()); 
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
    // $ANTLR end "entryRuleDelta"


    // $ANTLR start "ruleDelta"
    // InternalArduinoDSL.g:287:1: ruleDelta : ( ( rule__Delta__Group__0 ) ) ;
    public final void ruleDelta() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:291:2: ( ( ( rule__Delta__Group__0 ) ) )
            // InternalArduinoDSL.g:292:2: ( ( rule__Delta__Group__0 ) )
            {
            // InternalArduinoDSL.g:292:2: ( ( rule__Delta__Group__0 ) )
            // InternalArduinoDSL.g:293:3: ( rule__Delta__Group__0 )
            {
             before(grammarAccess.getDeltaAccess().getGroup()); 
            // InternalArduinoDSL.g:294:3: ( rule__Delta__Group__0 )
            // InternalArduinoDSL.g:294:4: rule__Delta__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Delta__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeltaAccess().getGroup()); 

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
    // $ANTLR end "ruleDelta"


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalArduinoDSL.g:303:1: entryRuleNumberLiteral : ruleNumberLiteral EOF ;
    public final void entryRuleNumberLiteral() throws RecognitionException {
        try {
            // InternalArduinoDSL.g:304:1: ( ruleNumberLiteral EOF )
            // InternalArduinoDSL.g:305:1: ruleNumberLiteral EOF
            {
             before(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleNumberLiteral();

            state._fsp--;

             after(grammarAccess.getNumberLiteralRule()); 
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
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // InternalArduinoDSL.g:312:1: ruleNumberLiteral : ( ( rule__NumberLiteral__Alternatives ) ) ;
    public final void ruleNumberLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:316:2: ( ( ( rule__NumberLiteral__Alternatives ) ) )
            // InternalArduinoDSL.g:317:2: ( ( rule__NumberLiteral__Alternatives ) )
            {
            // InternalArduinoDSL.g:317:2: ( ( rule__NumberLiteral__Alternatives ) )
            // InternalArduinoDSL.g:318:3: ( rule__NumberLiteral__Alternatives )
            {
             before(grammarAccess.getNumberLiteralAccess().getAlternatives()); 
            // InternalArduinoDSL.g:319:3: ( rule__NumberLiteral__Alternatives )
            // InternalArduinoDSL.g:319:4: rule__NumberLiteral__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NumberLiteral__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumberLiteralAccess().getAlternatives()); 

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
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleNUMBER"
    // InternalArduinoDSL.g:328:1: entryRuleNUMBER : ruleNUMBER EOF ;
    public final void entryRuleNUMBER() throws RecognitionException {
        try {
            // InternalArduinoDSL.g:329:1: ( ruleNUMBER EOF )
            // InternalArduinoDSL.g:330:1: ruleNUMBER EOF
            {
             before(grammarAccess.getNUMBERRule()); 
            pushFollow(FOLLOW_1);
            ruleNUMBER();

            state._fsp--;

             after(grammarAccess.getNUMBERRule()); 
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
    // $ANTLR end "entryRuleNUMBER"


    // $ANTLR start "ruleNUMBER"
    // InternalArduinoDSL.g:337:1: ruleNUMBER : ( ( rule__NUMBER__Group__0 ) ) ;
    public final void ruleNUMBER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:341:2: ( ( ( rule__NUMBER__Group__0 ) ) )
            // InternalArduinoDSL.g:342:2: ( ( rule__NUMBER__Group__0 ) )
            {
            // InternalArduinoDSL.g:342:2: ( ( rule__NUMBER__Group__0 ) )
            // InternalArduinoDSL.g:343:3: ( rule__NUMBER__Group__0 )
            {
             before(grammarAccess.getNUMBERAccess().getGroup()); 
            // InternalArduinoDSL.g:344:3: ( rule__NUMBER__Group__0 )
            // InternalArduinoDSL.g:344:4: rule__NUMBER__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NUMBER__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNUMBERAccess().getGroup()); 

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
    // $ANTLR end "ruleNUMBER"


    // $ANTLR start "entryRuleState"
    // InternalArduinoDSL.g:353:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalArduinoDSL.g:354:1: ( ruleState EOF )
            // InternalArduinoDSL.g:355:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalArduinoDSL.g:362:1: ruleState : ( ( rule__State__ValueAssignment ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:366:2: ( ( ( rule__State__ValueAssignment ) ) )
            // InternalArduinoDSL.g:367:2: ( ( rule__State__ValueAssignment ) )
            {
            // InternalArduinoDSL.g:367:2: ( ( rule__State__ValueAssignment ) )
            // InternalArduinoDSL.g:368:3: ( rule__State__ValueAssignment )
            {
             before(grammarAccess.getStateAccess().getValueAssignment()); 
            // InternalArduinoDSL.g:369:3: ( rule__State__ValueAssignment )
            // InternalArduinoDSL.g:369:4: rule__State__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__State__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleRuleBody"
    // InternalArduinoDSL.g:378:1: entryRuleRuleBody : ruleRuleBody EOF ;
    public final void entryRuleRuleBody() throws RecognitionException {
        try {
            // InternalArduinoDSL.g:379:1: ( ruleRuleBody EOF )
            // InternalArduinoDSL.g:380:1: ruleRuleBody EOF
            {
             before(grammarAccess.getRuleBodyRule()); 
            pushFollow(FOLLOW_1);
            ruleRuleBody();

            state._fsp--;

             after(grammarAccess.getRuleBodyRule()); 
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
    // $ANTLR end "entryRuleRuleBody"


    // $ANTLR start "ruleRuleBody"
    // InternalArduinoDSL.g:387:1: ruleRuleBody : ( ( ( rule__RuleBody__AssignmentAssignment ) ) ( ( rule__RuleBody__AssignmentAssignment )* ) ) ;
    public final void ruleRuleBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:391:2: ( ( ( ( rule__RuleBody__AssignmentAssignment ) ) ( ( rule__RuleBody__AssignmentAssignment )* ) ) )
            // InternalArduinoDSL.g:392:2: ( ( ( rule__RuleBody__AssignmentAssignment ) ) ( ( rule__RuleBody__AssignmentAssignment )* ) )
            {
            // InternalArduinoDSL.g:392:2: ( ( ( rule__RuleBody__AssignmentAssignment ) ) ( ( rule__RuleBody__AssignmentAssignment )* ) )
            // InternalArduinoDSL.g:393:3: ( ( rule__RuleBody__AssignmentAssignment ) ) ( ( rule__RuleBody__AssignmentAssignment )* )
            {
            // InternalArduinoDSL.g:393:3: ( ( rule__RuleBody__AssignmentAssignment ) )
            // InternalArduinoDSL.g:394:4: ( rule__RuleBody__AssignmentAssignment )
            {
             before(grammarAccess.getRuleBodyAccess().getAssignmentAssignment()); 
            // InternalArduinoDSL.g:395:4: ( rule__RuleBody__AssignmentAssignment )
            // InternalArduinoDSL.g:395:5: rule__RuleBody__AssignmentAssignment
            {
            pushFollow(FOLLOW_4);
            rule__RuleBody__AssignmentAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRuleBodyAccess().getAssignmentAssignment()); 

            }

            // InternalArduinoDSL.g:398:3: ( ( rule__RuleBody__AssignmentAssignment )* )
            // InternalArduinoDSL.g:399:4: ( rule__RuleBody__AssignmentAssignment )*
            {
             before(grammarAccess.getRuleBodyAccess().getAssignmentAssignment()); 
            // InternalArduinoDSL.g:400:4: ( rule__RuleBody__AssignmentAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalArduinoDSL.g:400:5: rule__RuleBody__AssignmentAssignment
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__RuleBody__AssignmentAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getRuleBodyAccess().getAssignmentAssignment()); 

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
    // $ANTLR end "ruleRuleBody"


    // $ANTLR start "entryRuleAssignment"
    // InternalArduinoDSL.g:410:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalArduinoDSL.g:411:1: ( ruleAssignment EOF )
            // InternalArduinoDSL.g:412:1: ruleAssignment EOF
            {
             before(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_1);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getAssignmentRule()); 
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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalArduinoDSL.g:419:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:423:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalArduinoDSL.g:424:2: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalArduinoDSL.g:424:2: ( ( rule__Assignment__Group__0 ) )
            // InternalArduinoDSL.g:425:3: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // InternalArduinoDSL.g:426:3: ( rule__Assignment__Group__0 )
            // InternalArduinoDSL.g:426:4: rule__Assignment__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getGroup()); 

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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleNode"
    // InternalArduinoDSL.g:435:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // InternalArduinoDSL.g:436:1: ( ruleNode EOF )
            // InternalArduinoDSL.g:437:1: ruleNode EOF
            {
             before(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleNode();

            state._fsp--;

             after(grammarAccess.getNodeRule()); 
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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalArduinoDSL.g:444:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:448:2: ( ( ( rule__Node__Group__0 ) ) )
            // InternalArduinoDSL.g:449:2: ( ( rule__Node__Group__0 ) )
            {
            // InternalArduinoDSL.g:449:2: ( ( rule__Node__Group__0 ) )
            // InternalArduinoDSL.g:450:3: ( rule__Node__Group__0 )
            {
             before(grammarAccess.getNodeAccess().getGroup()); 
            // InternalArduinoDSL.g:451:3: ( rule__Node__Group__0 )
            // InternalArduinoDSL.g:451:4: rule__Node__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getGroup()); 

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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleComponent"
    // InternalArduinoDSL.g:460:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalArduinoDSL.g:461:1: ( ruleComponent EOF )
            // InternalArduinoDSL.g:462:1: ruleComponent EOF
            {
             before(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getComponentRule()); 
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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalArduinoDSL.g:469:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:473:2: ( ( ( rule__Component__Group__0 ) ) )
            // InternalArduinoDSL.g:474:2: ( ( rule__Component__Group__0 ) )
            {
            // InternalArduinoDSL.g:474:2: ( ( rule__Component__Group__0 ) )
            // InternalArduinoDSL.g:475:3: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // InternalArduinoDSL.g:476:3: ( rule__Component__Group__0 )
            // InternalArduinoDSL.g:476:4: rule__Component__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getGroup()); 

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleComponentBody"
    // InternalArduinoDSL.g:485:1: entryRuleComponentBody : ruleComponentBody EOF ;
    public final void entryRuleComponentBody() throws RecognitionException {
        try {
            // InternalArduinoDSL.g:486:1: ( ruleComponentBody EOF )
            // InternalArduinoDSL.g:487:1: ruleComponentBody EOF
            {
             before(grammarAccess.getComponentBodyRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentBody();

            state._fsp--;

             after(grammarAccess.getComponentBodyRule()); 
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
    // $ANTLR end "entryRuleComponentBody"


    // $ANTLR start "ruleComponentBody"
    // InternalArduinoDSL.g:494:1: ruleComponentBody : ( ( rule__ComponentBody__Group__0 ) ) ;
    public final void ruleComponentBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:498:2: ( ( ( rule__ComponentBody__Group__0 ) ) )
            // InternalArduinoDSL.g:499:2: ( ( rule__ComponentBody__Group__0 ) )
            {
            // InternalArduinoDSL.g:499:2: ( ( rule__ComponentBody__Group__0 ) )
            // InternalArduinoDSL.g:500:3: ( rule__ComponentBody__Group__0 )
            {
             before(grammarAccess.getComponentBodyAccess().getGroup()); 
            // InternalArduinoDSL.g:501:3: ( rule__ComponentBody__Group__0 )
            // InternalArduinoDSL.g:501:4: rule__ComponentBody__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentBody__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentBodyAccess().getGroup()); 

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
    // $ANTLR end "ruleComponentBody"


    // $ANTLR start "entryRuleMap"
    // InternalArduinoDSL.g:510:1: entryRuleMap : ruleMap EOF ;
    public final void entryRuleMap() throws RecognitionException {
        try {
            // InternalArduinoDSL.g:511:1: ( ruleMap EOF )
            // InternalArduinoDSL.g:512:1: ruleMap EOF
            {
             before(grammarAccess.getMapRule()); 
            pushFollow(FOLLOW_1);
            ruleMap();

            state._fsp--;

             after(grammarAccess.getMapRule()); 
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
    // $ANTLR end "entryRuleMap"


    // $ANTLR start "ruleMap"
    // InternalArduinoDSL.g:519:1: ruleMap : ( ( rule__Map__Group__0 ) ) ;
    public final void ruleMap() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:523:2: ( ( ( rule__Map__Group__0 ) ) )
            // InternalArduinoDSL.g:524:2: ( ( rule__Map__Group__0 ) )
            {
            // InternalArduinoDSL.g:524:2: ( ( rule__Map__Group__0 ) )
            // InternalArduinoDSL.g:525:3: ( rule__Map__Group__0 )
            {
             before(grammarAccess.getMapAccess().getGroup()); 
            // InternalArduinoDSL.g:526:3: ( rule__Map__Group__0 )
            // InternalArduinoDSL.g:526:4: rule__Map__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Map__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMapAccess().getGroup()); 

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
    // $ANTLR end "ruleMap"


    // $ANTLR start "entryRuleRange"
    // InternalArduinoDSL.g:535:1: entryRuleRange : ruleRange EOF ;
    public final void entryRuleRange() throws RecognitionException {
        try {
            // InternalArduinoDSL.g:536:1: ( ruleRange EOF )
            // InternalArduinoDSL.g:537:1: ruleRange EOF
            {
             before(grammarAccess.getRangeRule()); 
            pushFollow(FOLLOW_1);
            ruleRange();

            state._fsp--;

             after(grammarAccess.getRangeRule()); 
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
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // InternalArduinoDSL.g:544:1: ruleRange : ( ( rule__Range__Group__0 ) ) ;
    public final void ruleRange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:548:2: ( ( ( rule__Range__Group__0 ) ) )
            // InternalArduinoDSL.g:549:2: ( ( rule__Range__Group__0 ) )
            {
            // InternalArduinoDSL.g:549:2: ( ( rule__Range__Group__0 ) )
            // InternalArduinoDSL.g:550:3: ( rule__Range__Group__0 )
            {
             before(grammarAccess.getRangeAccess().getGroup()); 
            // InternalArduinoDSL.g:551:3: ( rule__Range__Group__0 )
            // InternalArduinoDSL.g:551:4: rule__Range__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Range__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRangeAccess().getGroup()); 

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
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRuleRate"
    // InternalArduinoDSL.g:560:1: entryRuleRate : ruleRate EOF ;
    public final void entryRuleRate() throws RecognitionException {
        try {
            // InternalArduinoDSL.g:561:1: ( ruleRate EOF )
            // InternalArduinoDSL.g:562:1: ruleRate EOF
            {
             before(grammarAccess.getRateRule()); 
            pushFollow(FOLLOW_1);
            ruleRate();

            state._fsp--;

             after(grammarAccess.getRateRule()); 
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
    // $ANTLR end "entryRuleRate"


    // $ANTLR start "ruleRate"
    // InternalArduinoDSL.g:569:1: ruleRate : ( ( rule__Rate__Group__0 ) ) ;
    public final void ruleRate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:573:2: ( ( ( rule__Rate__Group__0 ) ) )
            // InternalArduinoDSL.g:574:2: ( ( rule__Rate__Group__0 ) )
            {
            // InternalArduinoDSL.g:574:2: ( ( rule__Rate__Group__0 ) )
            // InternalArduinoDSL.g:575:3: ( rule__Rate__Group__0 )
            {
             before(grammarAccess.getRateAccess().getGroup()); 
            // InternalArduinoDSL.g:576:3: ( rule__Rate__Group__0 )
            // InternalArduinoDSL.g:576:4: rule__Rate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Rate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRateAccess().getGroup()); 

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
    // $ANTLR end "ruleRate"


    // $ANTLR start "entryRuleSmoothing"
    // InternalArduinoDSL.g:585:1: entryRuleSmoothing : ruleSmoothing EOF ;
    public final void entryRuleSmoothing() throws RecognitionException {
        try {
            // InternalArduinoDSL.g:586:1: ( ruleSmoothing EOF )
            // InternalArduinoDSL.g:587:1: ruleSmoothing EOF
            {
             before(grammarAccess.getSmoothingRule()); 
            pushFollow(FOLLOW_1);
            ruleSmoothing();

            state._fsp--;

             after(grammarAccess.getSmoothingRule()); 
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
    // $ANTLR end "entryRuleSmoothing"


    // $ANTLR start "ruleSmoothing"
    // InternalArduinoDSL.g:594:1: ruleSmoothing : ( ( rule__Smoothing__Group__0 ) ) ;
    public final void ruleSmoothing() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:598:2: ( ( ( rule__Smoothing__Group__0 ) ) )
            // InternalArduinoDSL.g:599:2: ( ( rule__Smoothing__Group__0 ) )
            {
            // InternalArduinoDSL.g:599:2: ( ( rule__Smoothing__Group__0 ) )
            // InternalArduinoDSL.g:600:3: ( rule__Smoothing__Group__0 )
            {
             before(grammarAccess.getSmoothingAccess().getGroup()); 
            // InternalArduinoDSL.g:601:3: ( rule__Smoothing__Group__0 )
            // InternalArduinoDSL.g:601:4: rule__Smoothing__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Smoothing__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSmoothingAccess().getGroup()); 

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
    // $ANTLR end "ruleSmoothing"


    // $ANTLR start "rule__Program__ProgramAlternatives_0"
    // InternalArduinoDSL.g:609:1: rule__Program__ProgramAlternatives_0 : ( ( ruleRule ) | ( ruleNode ) );
    public final void rule__Program__ProgramAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:613:1: ( ( ruleRule ) | ( ruleNode ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=15 && LA3_0<=16)) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalArduinoDSL.g:614:2: ( ruleRule )
                    {
                    // InternalArduinoDSL.g:614:2: ( ruleRule )
                    // InternalArduinoDSL.g:615:3: ruleRule
                    {
                     before(grammarAccess.getProgramAccess().getProgramRuleParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRule();

                    state._fsp--;

                     after(grammarAccess.getProgramAccess().getProgramRuleParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoDSL.g:620:2: ( ruleNode )
                    {
                    // InternalArduinoDSL.g:620:2: ( ruleNode )
                    // InternalArduinoDSL.g:621:3: ruleNode
                    {
                     before(grammarAccess.getProgramAccess().getProgramNodeParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNode();

                    state._fsp--;

                     after(grammarAccess.getProgramAccess().getProgramNodeParserRuleCall_0_1()); 

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
    // $ANTLR end "rule__Program__ProgramAlternatives_0"


    // $ANTLR start "rule__Rule__TypeAlternatives_0_0"
    // InternalArduinoDSL.g:630:1: rule__Rule__TypeAlternatives_0_0 : ( ( 'when' ) | ( 'once' ) );
    public final void rule__Rule__TypeAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:634:1: ( ( 'when' ) | ( 'once' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            else if ( (LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalArduinoDSL.g:635:2: ( 'when' )
                    {
                    // InternalArduinoDSL.g:635:2: ( 'when' )
                    // InternalArduinoDSL.g:636:3: 'when'
                    {
                     before(grammarAccess.getRuleAccess().getTypeWhenKeyword_0_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getRuleAccess().getTypeWhenKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoDSL.g:641:2: ( 'once' )
                    {
                    // InternalArduinoDSL.g:641:2: ( 'once' )
                    // InternalArduinoDSL.g:642:3: 'once'
                    {
                     before(grammarAccess.getRuleAccess().getTypeOnceKeyword_0_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getRuleAccess().getTypeOnceKeyword_0_0_1()); 

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
    // $ANTLR end "rule__Rule__TypeAlternatives_0_0"


    // $ANTLR start "rule__ExpWeakOp__Alternatives"
    // InternalArduinoDSL.g:651:1: rule__ExpWeakOp__Alternatives : ( ( ( rule__ExpWeakOp__Group_0__0 ) ) | ( ( rule__ExpWeakOp__Group_1__0 ) ) );
    public final void rule__ExpWeakOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:655:1: ( ( ( rule__ExpWeakOp__Group_0__0 ) ) | ( ( rule__ExpWeakOp__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            else if ( (LA5_0==22) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalArduinoDSL.g:656:2: ( ( rule__ExpWeakOp__Group_0__0 ) )
                    {
                    // InternalArduinoDSL.g:656:2: ( ( rule__ExpWeakOp__Group_0__0 ) )
                    // InternalArduinoDSL.g:657:3: ( rule__ExpWeakOp__Group_0__0 )
                    {
                     before(grammarAccess.getExpWeakOpAccess().getGroup_0()); 
                    // InternalArduinoDSL.g:658:3: ( rule__ExpWeakOp__Group_0__0 )
                    // InternalArduinoDSL.g:658:4: rule__ExpWeakOp__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpWeakOp__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpWeakOpAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoDSL.g:662:2: ( ( rule__ExpWeakOp__Group_1__0 ) )
                    {
                    // InternalArduinoDSL.g:662:2: ( ( rule__ExpWeakOp__Group_1__0 ) )
                    // InternalArduinoDSL.g:663:3: ( rule__ExpWeakOp__Group_1__0 )
                    {
                     before(grammarAccess.getExpWeakOpAccess().getGroup_1()); 
                    // InternalArduinoDSL.g:664:3: ( rule__ExpWeakOp__Group_1__0 )
                    // InternalArduinoDSL.g:664:4: rule__ExpWeakOp__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpWeakOp__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpWeakOpAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ExpWeakOp__Alternatives"


    // $ANTLR start "rule__ExpStrongOp__Alternatives"
    // InternalArduinoDSL.g:672:1: rule__ExpStrongOp__Alternatives : ( ( ( rule__ExpStrongOp__Group_0__0 ) ) | ( ( rule__ExpStrongOp__Group_1__0 ) ) );
    public final void rule__ExpStrongOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:676:1: ( ( ( rule__ExpStrongOp__Group_0__0 ) ) | ( ( rule__ExpStrongOp__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            else if ( (LA6_0==24) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalArduinoDSL.g:677:2: ( ( rule__ExpStrongOp__Group_0__0 ) )
                    {
                    // InternalArduinoDSL.g:677:2: ( ( rule__ExpStrongOp__Group_0__0 ) )
                    // InternalArduinoDSL.g:678:3: ( rule__ExpStrongOp__Group_0__0 )
                    {
                     before(grammarAccess.getExpStrongOpAccess().getGroup_0()); 
                    // InternalArduinoDSL.g:679:3: ( rule__ExpStrongOp__Group_0__0 )
                    // InternalArduinoDSL.g:679:4: rule__ExpStrongOp__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpStrongOp__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpStrongOpAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoDSL.g:683:2: ( ( rule__ExpStrongOp__Group_1__0 ) )
                    {
                    // InternalArduinoDSL.g:683:2: ( ( rule__ExpStrongOp__Group_1__0 ) )
                    // InternalArduinoDSL.g:684:3: ( rule__ExpStrongOp__Group_1__0 )
                    {
                     before(grammarAccess.getExpStrongOpAccess().getGroup_1()); 
                    // InternalArduinoDSL.g:685:3: ( rule__ExpStrongOp__Group_1__0 )
                    // InternalArduinoDSL.g:685:4: rule__ExpStrongOp__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExpStrongOp__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpStrongOpAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ExpStrongOp__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalArduinoDSL.g:693:1: rule__Value__Alternatives : ( ( ruleNumberLiteral ) | ( ruleAttribute ) | ( ruleDelta ) | ( ruleState ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:697:1: ( ( ruleNumberLiteral ) | ( ruleAttribute ) | ( ruleDelta ) | ( ruleState ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_DECIMAL:
                {
                alt7=1;
                }
                break;
            case RULE_ID:
                {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==RULE_ID) ) {
                    int LA7_4 = input.LA(3);

                    if ( (LA7_4==EOF||(LA7_4>=RULE_BOOLEAN_OPERATOR && LA7_4<=RULE_ID)||(LA7_4>=19 && LA7_4<=24)) ) {
                        alt7=2;
                    }
                    else if ( (LA7_4==25) ) {
                        alt7=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
                }
                break;
            case 17:
            case 18:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalArduinoDSL.g:698:2: ( ruleNumberLiteral )
                    {
                    // InternalArduinoDSL.g:698:2: ( ruleNumberLiteral )
                    // InternalArduinoDSL.g:699:3: ruleNumberLiteral
                    {
                     before(grammarAccess.getValueAccess().getNumberLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNumberLiteral();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getNumberLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoDSL.g:704:2: ( ruleAttribute )
                    {
                    // InternalArduinoDSL.g:704:2: ( ruleAttribute )
                    // InternalArduinoDSL.g:705:3: ruleAttribute
                    {
                     before(grammarAccess.getValueAccess().getAttributeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAttribute();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getAttributeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalArduinoDSL.g:710:2: ( ruleDelta )
                    {
                    // InternalArduinoDSL.g:710:2: ( ruleDelta )
                    // InternalArduinoDSL.g:711:3: ruleDelta
                    {
                     before(grammarAccess.getValueAccess().getDeltaParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDelta();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getDeltaParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalArduinoDSL.g:716:2: ( ruleState )
                    {
                    // InternalArduinoDSL.g:716:2: ( ruleState )
                    // InternalArduinoDSL.g:717:3: ruleState
                    {
                     before(grammarAccess.getValueAccess().getStateParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleState();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getStateParserRuleCall_3()); 

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
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__NumberLiteral__Alternatives"
    // InternalArduinoDSL.g:726:1: rule__NumberLiteral__Alternatives : ( ( ( rule__NumberLiteral__FloatAssignment_0 ) ) | ( ( rule__NumberLiteral__IntAssignment_1 ) ) );
    public final void rule__NumberLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:730:1: ( ( ( rule__NumberLiteral__FloatAssignment_0 ) ) | ( ( rule__NumberLiteral__IntAssignment_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_DECIMAL) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_INT) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalArduinoDSL.g:731:2: ( ( rule__NumberLiteral__FloatAssignment_0 ) )
                    {
                    // InternalArduinoDSL.g:731:2: ( ( rule__NumberLiteral__FloatAssignment_0 ) )
                    // InternalArduinoDSL.g:732:3: ( rule__NumberLiteral__FloatAssignment_0 )
                    {
                     before(grammarAccess.getNumberLiteralAccess().getFloatAssignment_0()); 
                    // InternalArduinoDSL.g:733:3: ( rule__NumberLiteral__FloatAssignment_0 )
                    // InternalArduinoDSL.g:733:4: rule__NumberLiteral__FloatAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NumberLiteral__FloatAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNumberLiteralAccess().getFloatAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoDSL.g:737:2: ( ( rule__NumberLiteral__IntAssignment_1 ) )
                    {
                    // InternalArduinoDSL.g:737:2: ( ( rule__NumberLiteral__IntAssignment_1 ) )
                    // InternalArduinoDSL.g:738:3: ( rule__NumberLiteral__IntAssignment_1 )
                    {
                     before(grammarAccess.getNumberLiteralAccess().getIntAssignment_1()); 
                    // InternalArduinoDSL.g:739:3: ( rule__NumberLiteral__IntAssignment_1 )
                    // InternalArduinoDSL.g:739:4: rule__NumberLiteral__IntAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__NumberLiteral__IntAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getNumberLiteralAccess().getIntAssignment_1()); 

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
    // $ANTLR end "rule__NumberLiteral__Alternatives"


    // $ANTLR start "rule__State__ValueAlternatives_0"
    // InternalArduinoDSL.g:747:1: rule__State__ValueAlternatives_0 : ( ( 'on' ) | ( 'off' ) );
    public final void rule__State__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:751:1: ( ( 'on' ) | ( 'off' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            else if ( (LA9_0==18) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalArduinoDSL.g:752:2: ( 'on' )
                    {
                    // InternalArduinoDSL.g:752:2: ( 'on' )
                    // InternalArduinoDSL.g:753:3: 'on'
                    {
                     before(grammarAccess.getStateAccess().getValueOnKeyword_0_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getStateAccess().getValueOnKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoDSL.g:758:2: ( 'off' )
                    {
                    // InternalArduinoDSL.g:758:2: ( 'off' )
                    // InternalArduinoDSL.g:759:3: 'off'
                    {
                     before(grammarAccess.getStateAccess().getValueOffKeyword_0_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getStateAccess().getValueOffKeyword_0_1()); 

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
    // $ANTLR end "rule__State__ValueAlternatives_0"


    // $ANTLR start "rule__Rule__Group__0"
    // InternalArduinoDSL.g:768:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:772:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalArduinoDSL.g:773:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__1();

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
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // InternalArduinoDSL.g:780:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__TypeAssignment_0 ) ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:784:1: ( ( ( rule__Rule__TypeAssignment_0 ) ) )
            // InternalArduinoDSL.g:785:1: ( ( rule__Rule__TypeAssignment_0 ) )
            {
            // InternalArduinoDSL.g:785:1: ( ( rule__Rule__TypeAssignment_0 ) )
            // InternalArduinoDSL.g:786:2: ( rule__Rule__TypeAssignment_0 )
            {
             before(grammarAccess.getRuleAccess().getTypeAssignment_0()); 
            // InternalArduinoDSL.g:787:2: ( rule__Rule__TypeAssignment_0 )
            // InternalArduinoDSL.g:787:3: rule__Rule__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getTypeAssignment_0()); 

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
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // InternalArduinoDSL.g:795:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:799:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalArduinoDSL.g:800:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__2();

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
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // InternalArduinoDSL.g:807:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__ConditionAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:811:1: ( ( ( rule__Rule__ConditionAssignment_1 ) ) )
            // InternalArduinoDSL.g:812:1: ( ( rule__Rule__ConditionAssignment_1 ) )
            {
            // InternalArduinoDSL.g:812:1: ( ( rule__Rule__ConditionAssignment_1 ) )
            // InternalArduinoDSL.g:813:2: ( rule__Rule__ConditionAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getConditionAssignment_1()); 
            // InternalArduinoDSL.g:814:2: ( rule__Rule__ConditionAssignment_1 )
            // InternalArduinoDSL.g:814:3: rule__Rule__ConditionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Rule__ConditionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getConditionAssignment_1()); 

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
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // InternalArduinoDSL.g:822:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:826:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalArduinoDSL.g:827:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__3();

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
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // InternalArduinoDSL.g:834:1: rule__Rule__Group__2__Impl : ( '{' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:838:1: ( ( '{' ) )
            // InternalArduinoDSL.g:839:1: ( '{' )
            {
            // InternalArduinoDSL.g:839:1: ( '{' )
            // InternalArduinoDSL.g:840:2: '{'
            {
             before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // InternalArduinoDSL.g:849:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:853:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalArduinoDSL.g:854:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rule__Group__4();

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
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // InternalArduinoDSL.g:861:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__BodyAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:865:1: ( ( ( rule__Rule__BodyAssignment_3 ) ) )
            // InternalArduinoDSL.g:866:1: ( ( rule__Rule__BodyAssignment_3 ) )
            {
            // InternalArduinoDSL.g:866:1: ( ( rule__Rule__BodyAssignment_3 ) )
            // InternalArduinoDSL.g:867:2: ( rule__Rule__BodyAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getBodyAssignment_3()); 
            // InternalArduinoDSL.g:868:2: ( rule__Rule__BodyAssignment_3 )
            // InternalArduinoDSL.g:868:3: rule__Rule__BodyAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Rule__BodyAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getBodyAssignment_3()); 

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
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // InternalArduinoDSL.g:876:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:880:1: ( rule__Rule__Group__4__Impl )
            // InternalArduinoDSL.g:881:2: rule__Rule__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rule__Group__4__Impl();

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
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // InternalArduinoDSL.g:887:1: rule__Rule__Group__4__Impl : ( '}' ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:891:1: ( ( '}' ) )
            // InternalArduinoDSL.g:892:1: ( '}' )
            {
            // InternalArduinoDSL.g:892:1: ( '}' )
            // InternalArduinoDSL.g:893:2: '}'
            {
             before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalArduinoDSL.g:903:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:907:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalArduinoDSL.g:908:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Condition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__1();

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
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // InternalArduinoDSL.g:915:1: rule__Condition__Group__0__Impl : ( ( rule__Condition__LeftAssignment_0 ) ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:919:1: ( ( ( rule__Condition__LeftAssignment_0 ) ) )
            // InternalArduinoDSL.g:920:1: ( ( rule__Condition__LeftAssignment_0 ) )
            {
            // InternalArduinoDSL.g:920:1: ( ( rule__Condition__LeftAssignment_0 ) )
            // InternalArduinoDSL.g:921:2: ( rule__Condition__LeftAssignment_0 )
            {
             before(grammarAccess.getConditionAccess().getLeftAssignment_0()); 
            // InternalArduinoDSL.g:922:2: ( rule__Condition__LeftAssignment_0 )
            // InternalArduinoDSL.g:922:3: rule__Condition__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getLeftAssignment_0()); 

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
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalArduinoDSL.g:930:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:934:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalArduinoDSL.g:935:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Condition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group__2();

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
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // InternalArduinoDSL.g:942:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__OperatorAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:946:1: ( ( ( rule__Condition__OperatorAssignment_1 ) ) )
            // InternalArduinoDSL.g:947:1: ( ( rule__Condition__OperatorAssignment_1 ) )
            {
            // InternalArduinoDSL.g:947:1: ( ( rule__Condition__OperatorAssignment_1 ) )
            // InternalArduinoDSL.g:948:2: ( rule__Condition__OperatorAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getOperatorAssignment_1()); 
            // InternalArduinoDSL.g:949:2: ( rule__Condition__OperatorAssignment_1 )
            // InternalArduinoDSL.g:949:3: rule__Condition__OperatorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Condition__OperatorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getOperatorAssignment_1()); 

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
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__Condition__Group__2"
    // InternalArduinoDSL.g:957:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:961:1: ( rule__Condition__Group__2__Impl )
            // InternalArduinoDSL.g:962:2: rule__Condition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__2__Impl();

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
    // $ANTLR end "rule__Condition__Group__2"


    // $ANTLR start "rule__Condition__Group__2__Impl"
    // InternalArduinoDSL.g:968:1: rule__Condition__Group__2__Impl : ( ( rule__Condition__RightAssignment_2 ) ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:972:1: ( ( ( rule__Condition__RightAssignment_2 ) ) )
            // InternalArduinoDSL.g:973:1: ( ( rule__Condition__RightAssignment_2 ) )
            {
            // InternalArduinoDSL.g:973:1: ( ( rule__Condition__RightAssignment_2 ) )
            // InternalArduinoDSL.g:974:2: ( rule__Condition__RightAssignment_2 )
            {
             before(grammarAccess.getConditionAccess().getRightAssignment_2()); 
            // InternalArduinoDSL.g:975:2: ( rule__Condition__RightAssignment_2 )
            // InternalArduinoDSL.g:975:3: rule__Condition__RightAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Condition__RightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getRightAssignment_2()); 

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
    // $ANTLR end "rule__Condition__Group__2__Impl"


    // $ANTLR start "rule__Exp__Group__0"
    // InternalArduinoDSL.g:984:1: rule__Exp__Group__0 : rule__Exp__Group__0__Impl rule__Exp__Group__1 ;
    public final void rule__Exp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:988:1: ( rule__Exp__Group__0__Impl rule__Exp__Group__1 )
            // InternalArduinoDSL.g:989:2: rule__Exp__Group__0__Impl rule__Exp__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Exp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group__1();

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
    // $ANTLR end "rule__Exp__Group__0"


    // $ANTLR start "rule__Exp__Group__0__Impl"
    // InternalArduinoDSL.g:996:1: rule__Exp__Group__0__Impl : ( ruleFactor ) ;
    public final void rule__Exp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1000:1: ( ( ruleFactor ) )
            // InternalArduinoDSL.g:1001:1: ( ruleFactor )
            {
            // InternalArduinoDSL.g:1001:1: ( ruleFactor )
            // InternalArduinoDSL.g:1002:2: ruleFactor
            {
             before(grammarAccess.getExpAccess().getFactorParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getExpAccess().getFactorParserRuleCall_0()); 

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
    // $ANTLR end "rule__Exp__Group__0__Impl"


    // $ANTLR start "rule__Exp__Group__1"
    // InternalArduinoDSL.g:1011:1: rule__Exp__Group__1 : rule__Exp__Group__1__Impl ;
    public final void rule__Exp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1015:1: ( rule__Exp__Group__1__Impl )
            // InternalArduinoDSL.g:1016:2: rule__Exp__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group__1__Impl();

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
    // $ANTLR end "rule__Exp__Group__1"


    // $ANTLR start "rule__Exp__Group__1__Impl"
    // InternalArduinoDSL.g:1022:1: rule__Exp__Group__1__Impl : ( ( rule__Exp__Group_1__0 )* ) ;
    public final void rule__Exp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1026:1: ( ( ( rule__Exp__Group_1__0 )* ) )
            // InternalArduinoDSL.g:1027:1: ( ( rule__Exp__Group_1__0 )* )
            {
            // InternalArduinoDSL.g:1027:1: ( ( rule__Exp__Group_1__0 )* )
            // InternalArduinoDSL.g:1028:2: ( rule__Exp__Group_1__0 )*
            {
             before(grammarAccess.getExpAccess().getGroup_1()); 
            // InternalArduinoDSL.g:1029:2: ( rule__Exp__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=21 && LA10_0<=22)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalArduinoDSL.g:1029:3: rule__Exp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Exp__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getExpAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Exp__Group__1__Impl"


    // $ANTLR start "rule__Exp__Group_1__0"
    // InternalArduinoDSL.g:1038:1: rule__Exp__Group_1__0 : rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1 ;
    public final void rule__Exp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1042:1: ( rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1 )
            // InternalArduinoDSL.g:1043:2: rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Exp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_1__1();

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
    // $ANTLR end "rule__Exp__Group_1__0"


    // $ANTLR start "rule__Exp__Group_1__0__Impl"
    // InternalArduinoDSL.g:1050:1: rule__Exp__Group_1__0__Impl : ( () ) ;
    public final void rule__Exp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1054:1: ( ( () ) )
            // InternalArduinoDSL.g:1055:1: ( () )
            {
            // InternalArduinoDSL.g:1055:1: ( () )
            // InternalArduinoDSL.g:1056:2: ()
            {
             before(grammarAccess.getExpAccess().getExpLeftAction_1_0()); 
            // InternalArduinoDSL.g:1057:2: ()
            // InternalArduinoDSL.g:1057:3: 
            {
            }

             after(grammarAccess.getExpAccess().getExpLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1__0__Impl"


    // $ANTLR start "rule__Exp__Group_1__1"
    // InternalArduinoDSL.g:1065:1: rule__Exp__Group_1__1 : rule__Exp__Group_1__1__Impl rule__Exp__Group_1__2 ;
    public final void rule__Exp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1069:1: ( rule__Exp__Group_1__1__Impl rule__Exp__Group_1__2 )
            // InternalArduinoDSL.g:1070:2: rule__Exp__Group_1__1__Impl rule__Exp__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__Exp__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_1__2();

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
    // $ANTLR end "rule__Exp__Group_1__1"


    // $ANTLR start "rule__Exp__Group_1__1__Impl"
    // InternalArduinoDSL.g:1077:1: rule__Exp__Group_1__1__Impl : ( ( rule__Exp__OperatorAssignment_1_1 ) ) ;
    public final void rule__Exp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1081:1: ( ( ( rule__Exp__OperatorAssignment_1_1 ) ) )
            // InternalArduinoDSL.g:1082:1: ( ( rule__Exp__OperatorAssignment_1_1 ) )
            {
            // InternalArduinoDSL.g:1082:1: ( ( rule__Exp__OperatorAssignment_1_1 ) )
            // InternalArduinoDSL.g:1083:2: ( rule__Exp__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getExpAccess().getOperatorAssignment_1_1()); 
            // InternalArduinoDSL.g:1084:2: ( rule__Exp__OperatorAssignment_1_1 )
            // InternalArduinoDSL.g:1084:3: rule__Exp__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Exp__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getOperatorAssignment_1_1()); 

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
    // $ANTLR end "rule__Exp__Group_1__1__Impl"


    // $ANTLR start "rule__Exp__Group_1__2"
    // InternalArduinoDSL.g:1092:1: rule__Exp__Group_1__2 : rule__Exp__Group_1__2__Impl ;
    public final void rule__Exp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1096:1: ( rule__Exp__Group_1__2__Impl )
            // InternalArduinoDSL.g:1097:2: rule__Exp__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group_1__2__Impl();

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
    // $ANTLR end "rule__Exp__Group_1__2"


    // $ANTLR start "rule__Exp__Group_1__2__Impl"
    // InternalArduinoDSL.g:1103:1: rule__Exp__Group_1__2__Impl : ( ( rule__Exp__RightAssignment_1_2 ) ) ;
    public final void rule__Exp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1107:1: ( ( ( rule__Exp__RightAssignment_1_2 ) ) )
            // InternalArduinoDSL.g:1108:1: ( ( rule__Exp__RightAssignment_1_2 ) )
            {
            // InternalArduinoDSL.g:1108:1: ( ( rule__Exp__RightAssignment_1_2 ) )
            // InternalArduinoDSL.g:1109:2: ( rule__Exp__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpAccess().getRightAssignment_1_2()); 
            // InternalArduinoDSL.g:1110:2: ( rule__Exp__RightAssignment_1_2 )
            // InternalArduinoDSL.g:1110:3: rule__Exp__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Exp__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__Exp__Group_1__2__Impl"


    // $ANTLR start "rule__Factor__Group__0"
    // InternalArduinoDSL.g:1119:1: rule__Factor__Group__0 : rule__Factor__Group__0__Impl rule__Factor__Group__1 ;
    public final void rule__Factor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1123:1: ( rule__Factor__Group__0__Impl rule__Factor__Group__1 )
            // InternalArduinoDSL.g:1124:2: rule__Factor__Group__0__Impl rule__Factor__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Factor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group__1();

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
    // $ANTLR end "rule__Factor__Group__0"


    // $ANTLR start "rule__Factor__Group__0__Impl"
    // InternalArduinoDSL.g:1131:1: rule__Factor__Group__0__Impl : ( ruleValue ) ;
    public final void rule__Factor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1135:1: ( ( ruleValue ) )
            // InternalArduinoDSL.g:1136:1: ( ruleValue )
            {
            // InternalArduinoDSL.g:1136:1: ( ruleValue )
            // InternalArduinoDSL.g:1137:2: ruleValue
            {
             before(grammarAccess.getFactorAccess().getValueParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getValueParserRuleCall_0()); 

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
    // $ANTLR end "rule__Factor__Group__0__Impl"


    // $ANTLR start "rule__Factor__Group__1"
    // InternalArduinoDSL.g:1146:1: rule__Factor__Group__1 : rule__Factor__Group__1__Impl ;
    public final void rule__Factor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1150:1: ( rule__Factor__Group__1__Impl )
            // InternalArduinoDSL.g:1151:2: rule__Factor__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group__1__Impl();

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
    // $ANTLR end "rule__Factor__Group__1"


    // $ANTLR start "rule__Factor__Group__1__Impl"
    // InternalArduinoDSL.g:1157:1: rule__Factor__Group__1__Impl : ( ( rule__Factor__Group_1__0 )* ) ;
    public final void rule__Factor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1161:1: ( ( ( rule__Factor__Group_1__0 )* ) )
            // InternalArduinoDSL.g:1162:1: ( ( rule__Factor__Group_1__0 )* )
            {
            // InternalArduinoDSL.g:1162:1: ( ( rule__Factor__Group_1__0 )* )
            // InternalArduinoDSL.g:1163:2: ( rule__Factor__Group_1__0 )*
            {
             before(grammarAccess.getFactorAccess().getGroup_1()); 
            // InternalArduinoDSL.g:1164:2: ( rule__Factor__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=23 && LA11_0<=24)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalArduinoDSL.g:1164:3: rule__Factor__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Factor__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getFactorAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Factor__Group__1__Impl"


    // $ANTLR start "rule__Factor__Group_1__0"
    // InternalArduinoDSL.g:1173:1: rule__Factor__Group_1__0 : rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 ;
    public final void rule__Factor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1177:1: ( rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 )
            // InternalArduinoDSL.g:1178:2: rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Factor__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_1__1();

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
    // $ANTLR end "rule__Factor__Group_1__0"


    // $ANTLR start "rule__Factor__Group_1__0__Impl"
    // InternalArduinoDSL.g:1185:1: rule__Factor__Group_1__0__Impl : ( () ) ;
    public final void rule__Factor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1189:1: ( ( () ) )
            // InternalArduinoDSL.g:1190:1: ( () )
            {
            // InternalArduinoDSL.g:1190:1: ( () )
            // InternalArduinoDSL.g:1191:2: ()
            {
             before(grammarAccess.getFactorAccess().getFactorLeftAction_1_0()); 
            // InternalArduinoDSL.g:1192:2: ()
            // InternalArduinoDSL.g:1192:3: 
            {
            }

             after(grammarAccess.getFactorAccess().getFactorLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__0__Impl"


    // $ANTLR start "rule__Factor__Group_1__1"
    // InternalArduinoDSL.g:1200:1: rule__Factor__Group_1__1 : rule__Factor__Group_1__1__Impl rule__Factor__Group_1__2 ;
    public final void rule__Factor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1204:1: ( rule__Factor__Group_1__1__Impl rule__Factor__Group_1__2 )
            // InternalArduinoDSL.g:1205:2: rule__Factor__Group_1__1__Impl rule__Factor__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__Factor__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_1__2();

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
    // $ANTLR end "rule__Factor__Group_1__1"


    // $ANTLR start "rule__Factor__Group_1__1__Impl"
    // InternalArduinoDSL.g:1212:1: rule__Factor__Group_1__1__Impl : ( ( rule__Factor__OperatorAssignment_1_1 ) ) ;
    public final void rule__Factor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1216:1: ( ( ( rule__Factor__OperatorAssignment_1_1 ) ) )
            // InternalArduinoDSL.g:1217:1: ( ( rule__Factor__OperatorAssignment_1_1 ) )
            {
            // InternalArduinoDSL.g:1217:1: ( ( rule__Factor__OperatorAssignment_1_1 ) )
            // InternalArduinoDSL.g:1218:2: ( rule__Factor__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getFactorAccess().getOperatorAssignment_1_1()); 
            // InternalArduinoDSL.g:1219:2: ( rule__Factor__OperatorAssignment_1_1 )
            // InternalArduinoDSL.g:1219:3: rule__Factor__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Factor__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getOperatorAssignment_1_1()); 

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
    // $ANTLR end "rule__Factor__Group_1__1__Impl"


    // $ANTLR start "rule__Factor__Group_1__2"
    // InternalArduinoDSL.g:1227:1: rule__Factor__Group_1__2 : rule__Factor__Group_1__2__Impl ;
    public final void rule__Factor__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1231:1: ( rule__Factor__Group_1__2__Impl )
            // InternalArduinoDSL.g:1232:2: rule__Factor__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group_1__2__Impl();

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
    // $ANTLR end "rule__Factor__Group_1__2"


    // $ANTLR start "rule__Factor__Group_1__2__Impl"
    // InternalArduinoDSL.g:1238:1: rule__Factor__Group_1__2__Impl : ( ( rule__Factor__RightAssignment_1_2 ) ) ;
    public final void rule__Factor__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1242:1: ( ( ( rule__Factor__RightAssignment_1_2 ) ) )
            // InternalArduinoDSL.g:1243:1: ( ( rule__Factor__RightAssignment_1_2 ) )
            {
            // InternalArduinoDSL.g:1243:1: ( ( rule__Factor__RightAssignment_1_2 ) )
            // InternalArduinoDSL.g:1244:2: ( rule__Factor__RightAssignment_1_2 )
            {
             before(grammarAccess.getFactorAccess().getRightAssignment_1_2()); 
            // InternalArduinoDSL.g:1245:2: ( rule__Factor__RightAssignment_1_2 )
            // InternalArduinoDSL.g:1245:3: rule__Factor__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Factor__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getRightAssignment_1_2()); 

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
    // $ANTLR end "rule__Factor__Group_1__2__Impl"


    // $ANTLR start "rule__ExpWeakOp__Group_0__0"
    // InternalArduinoDSL.g:1254:1: rule__ExpWeakOp__Group_0__0 : rule__ExpWeakOp__Group_0__0__Impl rule__ExpWeakOp__Group_0__1 ;
    public final void rule__ExpWeakOp__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1258:1: ( rule__ExpWeakOp__Group_0__0__Impl rule__ExpWeakOp__Group_0__1 )
            // InternalArduinoDSL.g:1259:2: rule__ExpWeakOp__Group_0__0__Impl rule__ExpWeakOp__Group_0__1
            {
            pushFollow(FOLLOW_14);
            rule__ExpWeakOp__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpWeakOp__Group_0__1();

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
    // $ANTLR end "rule__ExpWeakOp__Group_0__0"


    // $ANTLR start "rule__ExpWeakOp__Group_0__0__Impl"
    // InternalArduinoDSL.g:1266:1: rule__ExpWeakOp__Group_0__0__Impl : ( () ) ;
    public final void rule__ExpWeakOp__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1270:1: ( ( () ) )
            // InternalArduinoDSL.g:1271:1: ( () )
            {
            // InternalArduinoDSL.g:1271:1: ( () )
            // InternalArduinoDSL.g:1272:2: ()
            {
             before(grammarAccess.getExpWeakOpAccess().getPlusAction_0_0()); 
            // InternalArduinoDSL.g:1273:2: ()
            // InternalArduinoDSL.g:1273:3: 
            {
            }

             after(grammarAccess.getExpWeakOpAccess().getPlusAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpWeakOp__Group_0__0__Impl"


    // $ANTLR start "rule__ExpWeakOp__Group_0__1"
    // InternalArduinoDSL.g:1281:1: rule__ExpWeakOp__Group_0__1 : rule__ExpWeakOp__Group_0__1__Impl ;
    public final void rule__ExpWeakOp__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1285:1: ( rule__ExpWeakOp__Group_0__1__Impl )
            // InternalArduinoDSL.g:1286:2: rule__ExpWeakOp__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpWeakOp__Group_0__1__Impl();

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
    // $ANTLR end "rule__ExpWeakOp__Group_0__1"


    // $ANTLR start "rule__ExpWeakOp__Group_0__1__Impl"
    // InternalArduinoDSL.g:1292:1: rule__ExpWeakOp__Group_0__1__Impl : ( '+' ) ;
    public final void rule__ExpWeakOp__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1296:1: ( ( '+' ) )
            // InternalArduinoDSL.g:1297:1: ( '+' )
            {
            // InternalArduinoDSL.g:1297:1: ( '+' )
            // InternalArduinoDSL.g:1298:2: '+'
            {
             before(grammarAccess.getExpWeakOpAccess().getPlusSignKeyword_0_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getExpWeakOpAccess().getPlusSignKeyword_0_1()); 

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
    // $ANTLR end "rule__ExpWeakOp__Group_0__1__Impl"


    // $ANTLR start "rule__ExpWeakOp__Group_1__0"
    // InternalArduinoDSL.g:1308:1: rule__ExpWeakOp__Group_1__0 : rule__ExpWeakOp__Group_1__0__Impl rule__ExpWeakOp__Group_1__1 ;
    public final void rule__ExpWeakOp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1312:1: ( rule__ExpWeakOp__Group_1__0__Impl rule__ExpWeakOp__Group_1__1 )
            // InternalArduinoDSL.g:1313:2: rule__ExpWeakOp__Group_1__0__Impl rule__ExpWeakOp__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__ExpWeakOp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpWeakOp__Group_1__1();

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
    // $ANTLR end "rule__ExpWeakOp__Group_1__0"


    // $ANTLR start "rule__ExpWeakOp__Group_1__0__Impl"
    // InternalArduinoDSL.g:1320:1: rule__ExpWeakOp__Group_1__0__Impl : ( () ) ;
    public final void rule__ExpWeakOp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1324:1: ( ( () ) )
            // InternalArduinoDSL.g:1325:1: ( () )
            {
            // InternalArduinoDSL.g:1325:1: ( () )
            // InternalArduinoDSL.g:1326:2: ()
            {
             before(grammarAccess.getExpWeakOpAccess().getMinusAction_1_0()); 
            // InternalArduinoDSL.g:1327:2: ()
            // InternalArduinoDSL.g:1327:3: 
            {
            }

             after(grammarAccess.getExpWeakOpAccess().getMinusAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpWeakOp__Group_1__0__Impl"


    // $ANTLR start "rule__ExpWeakOp__Group_1__1"
    // InternalArduinoDSL.g:1335:1: rule__ExpWeakOp__Group_1__1 : rule__ExpWeakOp__Group_1__1__Impl ;
    public final void rule__ExpWeakOp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1339:1: ( rule__ExpWeakOp__Group_1__1__Impl )
            // InternalArduinoDSL.g:1340:2: rule__ExpWeakOp__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpWeakOp__Group_1__1__Impl();

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
    // $ANTLR end "rule__ExpWeakOp__Group_1__1"


    // $ANTLR start "rule__ExpWeakOp__Group_1__1__Impl"
    // InternalArduinoDSL.g:1346:1: rule__ExpWeakOp__Group_1__1__Impl : ( '-' ) ;
    public final void rule__ExpWeakOp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1350:1: ( ( '-' ) )
            // InternalArduinoDSL.g:1351:1: ( '-' )
            {
            // InternalArduinoDSL.g:1351:1: ( '-' )
            // InternalArduinoDSL.g:1352:2: '-'
            {
             before(grammarAccess.getExpWeakOpAccess().getHyphenMinusKeyword_1_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getExpWeakOpAccess().getHyphenMinusKeyword_1_1()); 

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
    // $ANTLR end "rule__ExpWeakOp__Group_1__1__Impl"


    // $ANTLR start "rule__ExpStrongOp__Group_0__0"
    // InternalArduinoDSL.g:1362:1: rule__ExpStrongOp__Group_0__0 : rule__ExpStrongOp__Group_0__0__Impl rule__ExpStrongOp__Group_0__1 ;
    public final void rule__ExpStrongOp__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1366:1: ( rule__ExpStrongOp__Group_0__0__Impl rule__ExpStrongOp__Group_0__1 )
            // InternalArduinoDSL.g:1367:2: rule__ExpStrongOp__Group_0__0__Impl rule__ExpStrongOp__Group_0__1
            {
            pushFollow(FOLLOW_15);
            rule__ExpStrongOp__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpStrongOp__Group_0__1();

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
    // $ANTLR end "rule__ExpStrongOp__Group_0__0"


    // $ANTLR start "rule__ExpStrongOp__Group_0__0__Impl"
    // InternalArduinoDSL.g:1374:1: rule__ExpStrongOp__Group_0__0__Impl : ( () ) ;
    public final void rule__ExpStrongOp__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1378:1: ( ( () ) )
            // InternalArduinoDSL.g:1379:1: ( () )
            {
            // InternalArduinoDSL.g:1379:1: ( () )
            // InternalArduinoDSL.g:1380:2: ()
            {
             before(grammarAccess.getExpStrongOpAccess().getMultAction_0_0()); 
            // InternalArduinoDSL.g:1381:2: ()
            // InternalArduinoDSL.g:1381:3: 
            {
            }

             after(grammarAccess.getExpStrongOpAccess().getMultAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpStrongOp__Group_0__0__Impl"


    // $ANTLR start "rule__ExpStrongOp__Group_0__1"
    // InternalArduinoDSL.g:1389:1: rule__ExpStrongOp__Group_0__1 : rule__ExpStrongOp__Group_0__1__Impl ;
    public final void rule__ExpStrongOp__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1393:1: ( rule__ExpStrongOp__Group_0__1__Impl )
            // InternalArduinoDSL.g:1394:2: rule__ExpStrongOp__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpStrongOp__Group_0__1__Impl();

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
    // $ANTLR end "rule__ExpStrongOp__Group_0__1"


    // $ANTLR start "rule__ExpStrongOp__Group_0__1__Impl"
    // InternalArduinoDSL.g:1400:1: rule__ExpStrongOp__Group_0__1__Impl : ( '*' ) ;
    public final void rule__ExpStrongOp__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1404:1: ( ( '*' ) )
            // InternalArduinoDSL.g:1405:1: ( '*' )
            {
            // InternalArduinoDSL.g:1405:1: ( '*' )
            // InternalArduinoDSL.g:1406:2: '*'
            {
             before(grammarAccess.getExpStrongOpAccess().getAsteriskKeyword_0_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getExpStrongOpAccess().getAsteriskKeyword_0_1()); 

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
    // $ANTLR end "rule__ExpStrongOp__Group_0__1__Impl"


    // $ANTLR start "rule__ExpStrongOp__Group_1__0"
    // InternalArduinoDSL.g:1416:1: rule__ExpStrongOp__Group_1__0 : rule__ExpStrongOp__Group_1__0__Impl rule__ExpStrongOp__Group_1__1 ;
    public final void rule__ExpStrongOp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1420:1: ( rule__ExpStrongOp__Group_1__0__Impl rule__ExpStrongOp__Group_1__1 )
            // InternalArduinoDSL.g:1421:2: rule__ExpStrongOp__Group_1__0__Impl rule__ExpStrongOp__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__ExpStrongOp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExpStrongOp__Group_1__1();

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
    // $ANTLR end "rule__ExpStrongOp__Group_1__0"


    // $ANTLR start "rule__ExpStrongOp__Group_1__0__Impl"
    // InternalArduinoDSL.g:1428:1: rule__ExpStrongOp__Group_1__0__Impl : ( () ) ;
    public final void rule__ExpStrongOp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1432:1: ( ( () ) )
            // InternalArduinoDSL.g:1433:1: ( () )
            {
            // InternalArduinoDSL.g:1433:1: ( () )
            // InternalArduinoDSL.g:1434:2: ()
            {
             before(grammarAccess.getExpStrongOpAccess().getDivAction_1_0()); 
            // InternalArduinoDSL.g:1435:2: ()
            // InternalArduinoDSL.g:1435:3: 
            {
            }

             after(grammarAccess.getExpStrongOpAccess().getDivAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExpStrongOp__Group_1__0__Impl"


    // $ANTLR start "rule__ExpStrongOp__Group_1__1"
    // InternalArduinoDSL.g:1443:1: rule__ExpStrongOp__Group_1__1 : rule__ExpStrongOp__Group_1__1__Impl ;
    public final void rule__ExpStrongOp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1447:1: ( rule__ExpStrongOp__Group_1__1__Impl )
            // InternalArduinoDSL.g:1448:2: rule__ExpStrongOp__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExpStrongOp__Group_1__1__Impl();

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
    // $ANTLR end "rule__ExpStrongOp__Group_1__1"


    // $ANTLR start "rule__ExpStrongOp__Group_1__1__Impl"
    // InternalArduinoDSL.g:1454:1: rule__ExpStrongOp__Group_1__1__Impl : ( '/' ) ;
    public final void rule__ExpStrongOp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1458:1: ( ( '/' ) )
            // InternalArduinoDSL.g:1459:1: ( '/' )
            {
            // InternalArduinoDSL.g:1459:1: ( '/' )
            // InternalArduinoDSL.g:1460:2: '/'
            {
             before(grammarAccess.getExpStrongOpAccess().getSolidusKeyword_1_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getExpStrongOpAccess().getSolidusKeyword_1_1()); 

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
    // $ANTLR end "rule__ExpStrongOp__Group_1__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalArduinoDSL.g:1470:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1474:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalArduinoDSL.g:1475:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

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
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalArduinoDSL.g:1482:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1486:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // InternalArduinoDSL.g:1487:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // InternalArduinoDSL.g:1487:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // InternalArduinoDSL.g:1488:2: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // InternalArduinoDSL.g:1489:2: ( rule__Attribute__NameAssignment_0 )
            // InternalArduinoDSL.g:1489:3: rule__Attribute__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalArduinoDSL.g:1497:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1501:1: ( rule__Attribute__Group__1__Impl )
            // InternalArduinoDSL.g:1502:2: rule__Attribute__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1__Impl();

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
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalArduinoDSL.g:1508:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__ComponentAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1512:1: ( ( ( rule__Attribute__ComponentAssignment_1 ) ) )
            // InternalArduinoDSL.g:1513:1: ( ( rule__Attribute__ComponentAssignment_1 ) )
            {
            // InternalArduinoDSL.g:1513:1: ( ( rule__Attribute__ComponentAssignment_1 ) )
            // InternalArduinoDSL.g:1514:2: ( rule__Attribute__ComponentAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getComponentAssignment_1()); 
            // InternalArduinoDSL.g:1515:2: ( rule__Attribute__ComponentAssignment_1 )
            // InternalArduinoDSL.g:1515:3: rule__Attribute__ComponentAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__ComponentAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getComponentAssignment_1()); 

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
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Delta__Group__0"
    // InternalArduinoDSL.g:1524:1: rule__Delta__Group__0 : rule__Delta__Group__0__Impl rule__Delta__Group__1 ;
    public final void rule__Delta__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1528:1: ( rule__Delta__Group__0__Impl rule__Delta__Group__1 )
            // InternalArduinoDSL.g:1529:2: rule__Delta__Group__0__Impl rule__Delta__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Delta__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delta__Group__1();

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
    // $ANTLR end "rule__Delta__Group__0"


    // $ANTLR start "rule__Delta__Group__0__Impl"
    // InternalArduinoDSL.g:1536:1: rule__Delta__Group__0__Impl : ( ( rule__Delta__AttrAssignment_0 ) ) ;
    public final void rule__Delta__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1540:1: ( ( ( rule__Delta__AttrAssignment_0 ) ) )
            // InternalArduinoDSL.g:1541:1: ( ( rule__Delta__AttrAssignment_0 ) )
            {
            // InternalArduinoDSL.g:1541:1: ( ( rule__Delta__AttrAssignment_0 ) )
            // InternalArduinoDSL.g:1542:2: ( rule__Delta__AttrAssignment_0 )
            {
             before(grammarAccess.getDeltaAccess().getAttrAssignment_0()); 
            // InternalArduinoDSL.g:1543:2: ( rule__Delta__AttrAssignment_0 )
            // InternalArduinoDSL.g:1543:3: rule__Delta__AttrAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Delta__AttrAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getDeltaAccess().getAttrAssignment_0()); 

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
    // $ANTLR end "rule__Delta__Group__0__Impl"


    // $ANTLR start "rule__Delta__Group__1"
    // InternalArduinoDSL.g:1551:1: rule__Delta__Group__1 : rule__Delta__Group__1__Impl ;
    public final void rule__Delta__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1555:1: ( rule__Delta__Group__1__Impl )
            // InternalArduinoDSL.g:1556:2: rule__Delta__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Delta__Group__1__Impl();

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
    // $ANTLR end "rule__Delta__Group__1"


    // $ANTLR start "rule__Delta__Group__1__Impl"
    // InternalArduinoDSL.g:1562:1: rule__Delta__Group__1__Impl : ( 'delta' ) ;
    public final void rule__Delta__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1566:1: ( ( 'delta' ) )
            // InternalArduinoDSL.g:1567:1: ( 'delta' )
            {
            // InternalArduinoDSL.g:1567:1: ( 'delta' )
            // InternalArduinoDSL.g:1568:2: 'delta'
            {
             before(grammarAccess.getDeltaAccess().getDeltaKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDeltaAccess().getDeltaKeyword_1()); 

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
    // $ANTLR end "rule__Delta__Group__1__Impl"


    // $ANTLR start "rule__NUMBER__Group__0"
    // InternalArduinoDSL.g:1578:1: rule__NUMBER__Group__0 : rule__NUMBER__Group__0__Impl rule__NUMBER__Group__1 ;
    public final void rule__NUMBER__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1582:1: ( rule__NUMBER__Group__0__Impl rule__NUMBER__Group__1 )
            // InternalArduinoDSL.g:1583:2: rule__NUMBER__Group__0__Impl rule__NUMBER__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__NUMBER__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NUMBER__Group__1();

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
    // $ANTLR end "rule__NUMBER__Group__0"


    // $ANTLR start "rule__NUMBER__Group__0__Impl"
    // InternalArduinoDSL.g:1590:1: rule__NUMBER__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__NUMBER__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1594:1: ( ( RULE_INT ) )
            // InternalArduinoDSL.g:1595:1: ( RULE_INT )
            {
            // InternalArduinoDSL.g:1595:1: ( RULE_INT )
            // InternalArduinoDSL.g:1596:2: RULE_INT
            {
             before(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__NUMBER__Group__0__Impl"


    // $ANTLR start "rule__NUMBER__Group__1"
    // InternalArduinoDSL.g:1605:1: rule__NUMBER__Group__1 : rule__NUMBER__Group__1__Impl ;
    public final void rule__NUMBER__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1609:1: ( rule__NUMBER__Group__1__Impl )
            // InternalArduinoDSL.g:1610:2: rule__NUMBER__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NUMBER__Group__1__Impl();

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
    // $ANTLR end "rule__NUMBER__Group__1"


    // $ANTLR start "rule__NUMBER__Group__1__Impl"
    // InternalArduinoDSL.g:1616:1: rule__NUMBER__Group__1__Impl : ( ( rule__NUMBER__Group_1__0 )? ) ;
    public final void rule__NUMBER__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1620:1: ( ( ( rule__NUMBER__Group_1__0 )? ) )
            // InternalArduinoDSL.g:1621:1: ( ( rule__NUMBER__Group_1__0 )? )
            {
            // InternalArduinoDSL.g:1621:1: ( ( rule__NUMBER__Group_1__0 )? )
            // InternalArduinoDSL.g:1622:2: ( rule__NUMBER__Group_1__0 )?
            {
             before(grammarAccess.getNUMBERAccess().getGroup_1()); 
            // InternalArduinoDSL.g:1623:2: ( rule__NUMBER__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalArduinoDSL.g:1623:3: rule__NUMBER__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NUMBER__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNUMBERAccess().getGroup_1()); 

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
    // $ANTLR end "rule__NUMBER__Group__1__Impl"


    // $ANTLR start "rule__NUMBER__Group_1__0"
    // InternalArduinoDSL.g:1632:1: rule__NUMBER__Group_1__0 : rule__NUMBER__Group_1__0__Impl rule__NUMBER__Group_1__1 ;
    public final void rule__NUMBER__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1636:1: ( rule__NUMBER__Group_1__0__Impl rule__NUMBER__Group_1__1 )
            // InternalArduinoDSL.g:1637:2: rule__NUMBER__Group_1__0__Impl rule__NUMBER__Group_1__1
            {
            pushFollow(FOLLOW_18);
            rule__NUMBER__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NUMBER__Group_1__1();

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
    // $ANTLR end "rule__NUMBER__Group_1__0"


    // $ANTLR start "rule__NUMBER__Group_1__0__Impl"
    // InternalArduinoDSL.g:1644:1: rule__NUMBER__Group_1__0__Impl : ( '.' ) ;
    public final void rule__NUMBER__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1648:1: ( ( '.' ) )
            // InternalArduinoDSL.g:1649:1: ( '.' )
            {
            // InternalArduinoDSL.g:1649:1: ( '.' )
            // InternalArduinoDSL.g:1650:2: '.'
            {
             before(grammarAccess.getNUMBERAccess().getFullStopKeyword_1_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getNUMBERAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__NUMBER__Group_1__0__Impl"


    // $ANTLR start "rule__NUMBER__Group_1__1"
    // InternalArduinoDSL.g:1659:1: rule__NUMBER__Group_1__1 : rule__NUMBER__Group_1__1__Impl ;
    public final void rule__NUMBER__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1663:1: ( rule__NUMBER__Group_1__1__Impl )
            // InternalArduinoDSL.g:1664:2: rule__NUMBER__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NUMBER__Group_1__1__Impl();

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
    // $ANTLR end "rule__NUMBER__Group_1__1"


    // $ANTLR start "rule__NUMBER__Group_1__1__Impl"
    // InternalArduinoDSL.g:1670:1: rule__NUMBER__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__NUMBER__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1674:1: ( ( RULE_INT ) )
            // InternalArduinoDSL.g:1675:1: ( RULE_INT )
            {
            // InternalArduinoDSL.g:1675:1: ( RULE_INT )
            // InternalArduinoDSL.g:1676:2: RULE_INT
            {
             before(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__NUMBER__Group_1__1__Impl"


    // $ANTLR start "rule__Assignment__Group__0"
    // InternalArduinoDSL.g:1686:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1690:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalArduinoDSL.g:1691:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Assignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment__Group__1();

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
    // $ANTLR end "rule__Assignment__Group__0"


    // $ANTLR start "rule__Assignment__Group__0__Impl"
    // InternalArduinoDSL.g:1698:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__AttributeAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1702:1: ( ( ( rule__Assignment__AttributeAssignment_0 ) ) )
            // InternalArduinoDSL.g:1703:1: ( ( rule__Assignment__AttributeAssignment_0 ) )
            {
            // InternalArduinoDSL.g:1703:1: ( ( rule__Assignment__AttributeAssignment_0 ) )
            // InternalArduinoDSL.g:1704:2: ( rule__Assignment__AttributeAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getAttributeAssignment_0()); 
            // InternalArduinoDSL.g:1705:2: ( rule__Assignment__AttributeAssignment_0 )
            // InternalArduinoDSL.g:1705:3: rule__Assignment__AttributeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__AttributeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getAttributeAssignment_0()); 

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
    // $ANTLR end "rule__Assignment__Group__0__Impl"


    // $ANTLR start "rule__Assignment__Group__1"
    // InternalArduinoDSL.g:1713:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1717:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalArduinoDSL.g:1718:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Assignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment__Group__2();

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
    // $ANTLR end "rule__Assignment__Group__1"


    // $ANTLR start "rule__Assignment__Group__1__Impl"
    // InternalArduinoDSL.g:1725:1: rule__Assignment__Group__1__Impl : ( '=' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1729:1: ( ( '=' ) )
            // InternalArduinoDSL.g:1730:1: ( '=' )
            {
            // InternalArduinoDSL.g:1730:1: ( '=' )
            // InternalArduinoDSL.g:1731:2: '='
            {
             before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 

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
    // $ANTLR end "rule__Assignment__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group__2"
    // InternalArduinoDSL.g:1740:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1744:1: ( rule__Assignment__Group__2__Impl )
            // InternalArduinoDSL.g:1745:2: rule__Assignment__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group__2__Impl();

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
    // $ANTLR end "rule__Assignment__Group__2"


    // $ANTLR start "rule__Assignment__Group__2__Impl"
    // InternalArduinoDSL.g:1751:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ValueAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1755:1: ( ( ( rule__Assignment__ValueAssignment_2 ) ) )
            // InternalArduinoDSL.g:1756:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            {
            // InternalArduinoDSL.g:1756:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            // InternalArduinoDSL.g:1757:2: ( rule__Assignment__ValueAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            // InternalArduinoDSL.g:1758:2: ( rule__Assignment__ValueAssignment_2 )
            // InternalArduinoDSL.g:1758:3: rule__Assignment__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__Assignment__Group__2__Impl"


    // $ANTLR start "rule__Node__Group__0"
    // InternalArduinoDSL.g:1767:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1771:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // InternalArduinoDSL.g:1772:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Node__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__1();

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
    // $ANTLR end "rule__Node__Group__0"


    // $ANTLR start "rule__Node__Group__0__Impl"
    // InternalArduinoDSL.g:1779:1: rule__Node__Group__0__Impl : ( ( rule__Node__NameAssignment_0 ) ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1783:1: ( ( ( rule__Node__NameAssignment_0 ) ) )
            // InternalArduinoDSL.g:1784:1: ( ( rule__Node__NameAssignment_0 ) )
            {
            // InternalArduinoDSL.g:1784:1: ( ( rule__Node__NameAssignment_0 ) )
            // InternalArduinoDSL.g:1785:2: ( rule__Node__NameAssignment_0 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_0()); 
            // InternalArduinoDSL.g:1786:2: ( rule__Node__NameAssignment_0 )
            // InternalArduinoDSL.g:1786:3: rule__Node__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Node__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Node__Group__0__Impl"


    // $ANTLR start "rule__Node__Group__1"
    // InternalArduinoDSL.g:1794:1: rule__Node__Group__1 : rule__Node__Group__1__Impl rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1798:1: ( rule__Node__Group__1__Impl rule__Node__Group__2 )
            // InternalArduinoDSL.g:1799:2: rule__Node__Group__1__Impl rule__Node__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Node__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__2();

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
    // $ANTLR end "rule__Node__Group__1"


    // $ANTLR start "rule__Node__Group__1__Impl"
    // InternalArduinoDSL.g:1806:1: rule__Node__Group__1__Impl : ( '{' ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1810:1: ( ( '{' ) )
            // InternalArduinoDSL.g:1811:1: ( '{' )
            {
            // InternalArduinoDSL.g:1811:1: ( '{' )
            // InternalArduinoDSL.g:1812:2: '{'
            {
             before(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__Node__Group__1__Impl"


    // $ANTLR start "rule__Node__Group__2"
    // InternalArduinoDSL.g:1821:1: rule__Node__Group__2 : rule__Node__Group__2__Impl rule__Node__Group__3 ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1825:1: ( rule__Node__Group__2__Impl rule__Node__Group__3 )
            // InternalArduinoDSL.g:1826:2: rule__Node__Group__2__Impl rule__Node__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Node__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Node__Group__3();

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
    // $ANTLR end "rule__Node__Group__2"


    // $ANTLR start "rule__Node__Group__2__Impl"
    // InternalArduinoDSL.g:1833:1: rule__Node__Group__2__Impl : ( ( ( rule__Node__ComponentsAssignment_2 ) ) ( ( rule__Node__ComponentsAssignment_2 )* ) ) ;
    public final void rule__Node__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1837:1: ( ( ( ( rule__Node__ComponentsAssignment_2 ) ) ( ( rule__Node__ComponentsAssignment_2 )* ) ) )
            // InternalArduinoDSL.g:1838:1: ( ( ( rule__Node__ComponentsAssignment_2 ) ) ( ( rule__Node__ComponentsAssignment_2 )* ) )
            {
            // InternalArduinoDSL.g:1838:1: ( ( ( rule__Node__ComponentsAssignment_2 ) ) ( ( rule__Node__ComponentsAssignment_2 )* ) )
            // InternalArduinoDSL.g:1839:2: ( ( rule__Node__ComponentsAssignment_2 ) ) ( ( rule__Node__ComponentsAssignment_2 )* )
            {
            // InternalArduinoDSL.g:1839:2: ( ( rule__Node__ComponentsAssignment_2 ) )
            // InternalArduinoDSL.g:1840:3: ( rule__Node__ComponentsAssignment_2 )
            {
             before(grammarAccess.getNodeAccess().getComponentsAssignment_2()); 
            // InternalArduinoDSL.g:1841:3: ( rule__Node__ComponentsAssignment_2 )
            // InternalArduinoDSL.g:1841:4: rule__Node__ComponentsAssignment_2
            {
            pushFollow(FOLLOW_4);
            rule__Node__ComponentsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getComponentsAssignment_2()); 

            }

            // InternalArduinoDSL.g:1844:2: ( ( rule__Node__ComponentsAssignment_2 )* )
            // InternalArduinoDSL.g:1845:3: ( rule__Node__ComponentsAssignment_2 )*
            {
             before(grammarAccess.getNodeAccess().getComponentsAssignment_2()); 
            // InternalArduinoDSL.g:1846:3: ( rule__Node__ComponentsAssignment_2 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalArduinoDSL.g:1846:4: rule__Node__ComponentsAssignment_2
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Node__ComponentsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getNodeAccess().getComponentsAssignment_2()); 

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
    // $ANTLR end "rule__Node__Group__2__Impl"


    // $ANTLR start "rule__Node__Group__3"
    // InternalArduinoDSL.g:1855:1: rule__Node__Group__3 : rule__Node__Group__3__Impl ;
    public final void rule__Node__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1859:1: ( rule__Node__Group__3__Impl )
            // InternalArduinoDSL.g:1860:2: rule__Node__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group__3__Impl();

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
    // $ANTLR end "rule__Node__Group__3"


    // $ANTLR start "rule__Node__Group__3__Impl"
    // InternalArduinoDSL.g:1866:1: rule__Node__Group__3__Impl : ( '}' ) ;
    public final void rule__Node__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1870:1: ( ( '}' ) )
            // InternalArduinoDSL.g:1871:1: ( '}' )
            {
            // InternalArduinoDSL.g:1871:1: ( '}' )
            // InternalArduinoDSL.g:1872:2: '}'
            {
             before(grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Node__Group__3__Impl"


    // $ANTLR start "rule__Component__Group__0"
    // InternalArduinoDSL.g:1882:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1886:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalArduinoDSL.g:1887:2: rule__Component__Group__0__Impl rule__Component__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Component__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Component__Group__1();

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
    // $ANTLR end "rule__Component__Group__0"


    // $ANTLR start "rule__Component__Group__0__Impl"
    // InternalArduinoDSL.g:1894:1: rule__Component__Group__0__Impl : ( ( rule__Component__NameAssignment_0 ) ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1898:1: ( ( ( rule__Component__NameAssignment_0 ) ) )
            // InternalArduinoDSL.g:1899:1: ( ( rule__Component__NameAssignment_0 ) )
            {
            // InternalArduinoDSL.g:1899:1: ( ( rule__Component__NameAssignment_0 ) )
            // InternalArduinoDSL.g:1900:2: ( rule__Component__NameAssignment_0 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_0()); 
            // InternalArduinoDSL.g:1901:2: ( rule__Component__NameAssignment_0 )
            // InternalArduinoDSL.g:1901:3: rule__Component__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Component__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Component__Group__0__Impl"


    // $ANTLR start "rule__Component__Group__1"
    // InternalArduinoDSL.g:1909:1: rule__Component__Group__1 : rule__Component__Group__1__Impl ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1913:1: ( rule__Component__Group__1__Impl )
            // InternalArduinoDSL.g:1914:2: rule__Component__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Component__Group__1__Impl();

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
    // $ANTLR end "rule__Component__Group__1"


    // $ANTLR start "rule__Component__Group__1__Impl"
    // InternalArduinoDSL.g:1920:1: rule__Component__Group__1__Impl : ( ( rule__Component__PropertiesAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1924:1: ( ( ( rule__Component__PropertiesAssignment_1 ) ) )
            // InternalArduinoDSL.g:1925:1: ( ( rule__Component__PropertiesAssignment_1 ) )
            {
            // InternalArduinoDSL.g:1925:1: ( ( rule__Component__PropertiesAssignment_1 ) )
            // InternalArduinoDSL.g:1926:2: ( rule__Component__PropertiesAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getPropertiesAssignment_1()); 
            // InternalArduinoDSL.g:1927:2: ( rule__Component__PropertiesAssignment_1 )
            // InternalArduinoDSL.g:1927:3: rule__Component__PropertiesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Component__PropertiesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentAccess().getPropertiesAssignment_1()); 

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
    // $ANTLR end "rule__Component__Group__1__Impl"


    // $ANTLR start "rule__ComponentBody__Group__0"
    // InternalArduinoDSL.g:1936:1: rule__ComponentBody__Group__0 : rule__ComponentBody__Group__0__Impl rule__ComponentBody__Group__1 ;
    public final void rule__ComponentBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1940:1: ( rule__ComponentBody__Group__0__Impl rule__ComponentBody__Group__1 )
            // InternalArduinoDSL.g:1941:2: rule__ComponentBody__Group__0__Impl rule__ComponentBody__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__ComponentBody__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBody__Group__1();

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
    // $ANTLR end "rule__ComponentBody__Group__0"


    // $ANTLR start "rule__ComponentBody__Group__0__Impl"
    // InternalArduinoDSL.g:1948:1: rule__ComponentBody__Group__0__Impl : ( ( rule__ComponentBody__IoAssignment_0 ) ) ;
    public final void rule__ComponentBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1952:1: ( ( ( rule__ComponentBody__IoAssignment_0 ) ) )
            // InternalArduinoDSL.g:1953:1: ( ( rule__ComponentBody__IoAssignment_0 ) )
            {
            // InternalArduinoDSL.g:1953:1: ( ( rule__ComponentBody__IoAssignment_0 ) )
            // InternalArduinoDSL.g:1954:2: ( rule__ComponentBody__IoAssignment_0 )
            {
             before(grammarAccess.getComponentBodyAccess().getIoAssignment_0()); 
            // InternalArduinoDSL.g:1955:2: ( rule__ComponentBody__IoAssignment_0 )
            // InternalArduinoDSL.g:1955:3: rule__ComponentBody__IoAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentBody__IoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getComponentBodyAccess().getIoAssignment_0()); 

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
    // $ANTLR end "rule__ComponentBody__Group__0__Impl"


    // $ANTLR start "rule__ComponentBody__Group__1"
    // InternalArduinoDSL.g:1963:1: rule__ComponentBody__Group__1 : rule__ComponentBody__Group__1__Impl rule__ComponentBody__Group__2 ;
    public final void rule__ComponentBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1967:1: ( rule__ComponentBody__Group__1__Impl rule__ComponentBody__Group__2 )
            // InternalArduinoDSL.g:1968:2: rule__ComponentBody__Group__1__Impl rule__ComponentBody__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__ComponentBody__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBody__Group__2();

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
    // $ANTLR end "rule__ComponentBody__Group__1"


    // $ANTLR start "rule__ComponentBody__Group__1__Impl"
    // InternalArduinoDSL.g:1975:1: rule__ComponentBody__Group__1__Impl : ( ( rule__ComponentBody__TypeAssignment_1 ) ) ;
    public final void rule__ComponentBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1979:1: ( ( ( rule__ComponentBody__TypeAssignment_1 ) ) )
            // InternalArduinoDSL.g:1980:1: ( ( rule__ComponentBody__TypeAssignment_1 ) )
            {
            // InternalArduinoDSL.g:1980:1: ( ( rule__ComponentBody__TypeAssignment_1 ) )
            // InternalArduinoDSL.g:1981:2: ( rule__ComponentBody__TypeAssignment_1 )
            {
             before(grammarAccess.getComponentBodyAccess().getTypeAssignment_1()); 
            // InternalArduinoDSL.g:1982:2: ( rule__ComponentBody__TypeAssignment_1 )
            // InternalArduinoDSL.g:1982:3: rule__ComponentBody__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentBody__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentBodyAccess().getTypeAssignment_1()); 

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
    // $ANTLR end "rule__ComponentBody__Group__1__Impl"


    // $ANTLR start "rule__ComponentBody__Group__2"
    // InternalArduinoDSL.g:1990:1: rule__ComponentBody__Group__2 : rule__ComponentBody__Group__2__Impl rule__ComponentBody__Group__3 ;
    public final void rule__ComponentBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1994:1: ( rule__ComponentBody__Group__2__Impl rule__ComponentBody__Group__3 )
            // InternalArduinoDSL.g:1995:2: rule__ComponentBody__Group__2__Impl rule__ComponentBody__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__ComponentBody__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBody__Group__3();

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
    // $ANTLR end "rule__ComponentBody__Group__2"


    // $ANTLR start "rule__ComponentBody__Group__2__Impl"
    // InternalArduinoDSL.g:2002:1: rule__ComponentBody__Group__2__Impl : ( 'pin' ) ;
    public final void rule__ComponentBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2006:1: ( ( 'pin' ) )
            // InternalArduinoDSL.g:2007:1: ( 'pin' )
            {
            // InternalArduinoDSL.g:2007:1: ( 'pin' )
            // InternalArduinoDSL.g:2008:2: 'pin'
            {
             before(grammarAccess.getComponentBodyAccess().getPinKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getComponentBodyAccess().getPinKeyword_2()); 

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
    // $ANTLR end "rule__ComponentBody__Group__2__Impl"


    // $ANTLR start "rule__ComponentBody__Group__3"
    // InternalArduinoDSL.g:2017:1: rule__ComponentBody__Group__3 : rule__ComponentBody__Group__3__Impl rule__ComponentBody__Group__4 ;
    public final void rule__ComponentBody__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2021:1: ( rule__ComponentBody__Group__3__Impl rule__ComponentBody__Group__4 )
            // InternalArduinoDSL.g:2022:2: rule__ComponentBody__Group__3__Impl rule__ComponentBody__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__ComponentBody__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBody__Group__4();

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
    // $ANTLR end "rule__ComponentBody__Group__3"


    // $ANTLR start "rule__ComponentBody__Group__3__Impl"
    // InternalArduinoDSL.g:2029:1: rule__ComponentBody__Group__3__Impl : ( ( rule__ComponentBody__PinAssignment_3 ) ) ;
    public final void rule__ComponentBody__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2033:1: ( ( ( rule__ComponentBody__PinAssignment_3 ) ) )
            // InternalArduinoDSL.g:2034:1: ( ( rule__ComponentBody__PinAssignment_3 ) )
            {
            // InternalArduinoDSL.g:2034:1: ( ( rule__ComponentBody__PinAssignment_3 ) )
            // InternalArduinoDSL.g:2035:2: ( rule__ComponentBody__PinAssignment_3 )
            {
             before(grammarAccess.getComponentBodyAccess().getPinAssignment_3()); 
            // InternalArduinoDSL.g:2036:2: ( rule__ComponentBody__PinAssignment_3 )
            // InternalArduinoDSL.g:2036:3: rule__ComponentBody__PinAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ComponentBody__PinAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getComponentBodyAccess().getPinAssignment_3()); 

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
    // $ANTLR end "rule__ComponentBody__Group__3__Impl"


    // $ANTLR start "rule__ComponentBody__Group__4"
    // InternalArduinoDSL.g:2044:1: rule__ComponentBody__Group__4 : rule__ComponentBody__Group__4__Impl rule__ComponentBody__Group__5 ;
    public final void rule__ComponentBody__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2048:1: ( rule__ComponentBody__Group__4__Impl rule__ComponentBody__Group__5 )
            // InternalArduinoDSL.g:2049:2: rule__ComponentBody__Group__4__Impl rule__ComponentBody__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__ComponentBody__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBody__Group__5();

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
    // $ANTLR end "rule__ComponentBody__Group__4"


    // $ANTLR start "rule__ComponentBody__Group__4__Impl"
    // InternalArduinoDSL.g:2056:1: rule__ComponentBody__Group__4__Impl : ( ( rule__ComponentBody__MapAssignment_4 )? ) ;
    public final void rule__ComponentBody__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2060:1: ( ( ( rule__ComponentBody__MapAssignment_4 )? ) )
            // InternalArduinoDSL.g:2061:1: ( ( rule__ComponentBody__MapAssignment_4 )? )
            {
            // InternalArduinoDSL.g:2061:1: ( ( rule__ComponentBody__MapAssignment_4 )? )
            // InternalArduinoDSL.g:2062:2: ( rule__ComponentBody__MapAssignment_4 )?
            {
             before(grammarAccess.getComponentBodyAccess().getMapAssignment_4()); 
            // InternalArduinoDSL.g:2063:2: ( rule__ComponentBody__MapAssignment_4 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalArduinoDSL.g:2063:3: rule__ComponentBody__MapAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentBody__MapAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentBodyAccess().getMapAssignment_4()); 

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
    // $ANTLR end "rule__ComponentBody__Group__4__Impl"


    // $ANTLR start "rule__ComponentBody__Group__5"
    // InternalArduinoDSL.g:2071:1: rule__ComponentBody__Group__5 : rule__ComponentBody__Group__5__Impl rule__ComponentBody__Group__6 ;
    public final void rule__ComponentBody__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2075:1: ( rule__ComponentBody__Group__5__Impl rule__ComponentBody__Group__6 )
            // InternalArduinoDSL.g:2076:2: rule__ComponentBody__Group__5__Impl rule__ComponentBody__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__ComponentBody__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentBody__Group__6();

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
    // $ANTLR end "rule__ComponentBody__Group__5"


    // $ANTLR start "rule__ComponentBody__Group__5__Impl"
    // InternalArduinoDSL.g:2083:1: rule__ComponentBody__Group__5__Impl : ( ( rule__ComponentBody__RateAssignment_5 )? ) ;
    public final void rule__ComponentBody__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2087:1: ( ( ( rule__ComponentBody__RateAssignment_5 )? ) )
            // InternalArduinoDSL.g:2088:1: ( ( rule__ComponentBody__RateAssignment_5 )? )
            {
            // InternalArduinoDSL.g:2088:1: ( ( rule__ComponentBody__RateAssignment_5 )? )
            // InternalArduinoDSL.g:2089:2: ( rule__ComponentBody__RateAssignment_5 )?
            {
             before(grammarAccess.getComponentBodyAccess().getRateAssignment_5()); 
            // InternalArduinoDSL.g:2090:2: ( rule__ComponentBody__RateAssignment_5 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalArduinoDSL.g:2090:3: rule__ComponentBody__RateAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentBody__RateAssignment_5();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentBodyAccess().getRateAssignment_5()); 

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
    // $ANTLR end "rule__ComponentBody__Group__5__Impl"


    // $ANTLR start "rule__ComponentBody__Group__6"
    // InternalArduinoDSL.g:2098:1: rule__ComponentBody__Group__6 : rule__ComponentBody__Group__6__Impl ;
    public final void rule__ComponentBody__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2102:1: ( rule__ComponentBody__Group__6__Impl )
            // InternalArduinoDSL.g:2103:2: rule__ComponentBody__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentBody__Group__6__Impl();

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
    // $ANTLR end "rule__ComponentBody__Group__6"


    // $ANTLR start "rule__ComponentBody__Group__6__Impl"
    // InternalArduinoDSL.g:2109:1: rule__ComponentBody__Group__6__Impl : ( ( rule__ComponentBody__SmoothingAssignment_6 )? ) ;
    public final void rule__ComponentBody__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2113:1: ( ( ( rule__ComponentBody__SmoothingAssignment_6 )? ) )
            // InternalArduinoDSL.g:2114:1: ( ( rule__ComponentBody__SmoothingAssignment_6 )? )
            {
            // InternalArduinoDSL.g:2114:1: ( ( rule__ComponentBody__SmoothingAssignment_6 )? )
            // InternalArduinoDSL.g:2115:2: ( rule__ComponentBody__SmoothingAssignment_6 )?
            {
             before(grammarAccess.getComponentBodyAccess().getSmoothingAssignment_6()); 
            // InternalArduinoDSL.g:2116:2: ( rule__ComponentBody__SmoothingAssignment_6 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalArduinoDSL.g:2116:3: rule__ComponentBody__SmoothingAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentBody__SmoothingAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentBodyAccess().getSmoothingAssignment_6()); 

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
    // $ANTLR end "rule__ComponentBody__Group__6__Impl"


    // $ANTLR start "rule__Map__Group__0"
    // InternalArduinoDSL.g:2125:1: rule__Map__Group__0 : rule__Map__Group__0__Impl rule__Map__Group__1 ;
    public final void rule__Map__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2129:1: ( rule__Map__Group__0__Impl rule__Map__Group__1 )
            // InternalArduinoDSL.g:2130:2: rule__Map__Group__0__Impl rule__Map__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Map__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Map__Group__1();

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
    // $ANTLR end "rule__Map__Group__0"


    // $ANTLR start "rule__Map__Group__0__Impl"
    // InternalArduinoDSL.g:2137:1: rule__Map__Group__0__Impl : ( 'map' ) ;
    public final void rule__Map__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2141:1: ( ( 'map' ) )
            // InternalArduinoDSL.g:2142:1: ( 'map' )
            {
            // InternalArduinoDSL.g:2142:1: ( 'map' )
            // InternalArduinoDSL.g:2143:2: 'map'
            {
             before(grammarAccess.getMapAccess().getMapKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMapAccess().getMapKeyword_0()); 

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
    // $ANTLR end "rule__Map__Group__0__Impl"


    // $ANTLR start "rule__Map__Group__1"
    // InternalArduinoDSL.g:2152:1: rule__Map__Group__1 : rule__Map__Group__1__Impl rule__Map__Group__2 ;
    public final void rule__Map__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2156:1: ( rule__Map__Group__1__Impl rule__Map__Group__2 )
            // InternalArduinoDSL.g:2157:2: rule__Map__Group__1__Impl rule__Map__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Map__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Map__Group__2();

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
    // $ANTLR end "rule__Map__Group__1"


    // $ANTLR start "rule__Map__Group__1__Impl"
    // InternalArduinoDSL.g:2164:1: rule__Map__Group__1__Impl : ( ( rule__Map__InAssignment_1 ) ) ;
    public final void rule__Map__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2168:1: ( ( ( rule__Map__InAssignment_1 ) ) )
            // InternalArduinoDSL.g:2169:1: ( ( rule__Map__InAssignment_1 ) )
            {
            // InternalArduinoDSL.g:2169:1: ( ( rule__Map__InAssignment_1 ) )
            // InternalArduinoDSL.g:2170:2: ( rule__Map__InAssignment_1 )
            {
             before(grammarAccess.getMapAccess().getInAssignment_1()); 
            // InternalArduinoDSL.g:2171:2: ( rule__Map__InAssignment_1 )
            // InternalArduinoDSL.g:2171:3: rule__Map__InAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Map__InAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMapAccess().getInAssignment_1()); 

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
    // $ANTLR end "rule__Map__Group__1__Impl"


    // $ANTLR start "rule__Map__Group__2"
    // InternalArduinoDSL.g:2179:1: rule__Map__Group__2 : rule__Map__Group__2__Impl rule__Map__Group__3 ;
    public final void rule__Map__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2183:1: ( rule__Map__Group__2__Impl rule__Map__Group__3 )
            // InternalArduinoDSL.g:2184:2: rule__Map__Group__2__Impl rule__Map__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Map__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Map__Group__3();

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
    // $ANTLR end "rule__Map__Group__2"


    // $ANTLR start "rule__Map__Group__2__Impl"
    // InternalArduinoDSL.g:2191:1: rule__Map__Group__2__Impl : ( '=>' ) ;
    public final void rule__Map__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2195:1: ( ( '=>' ) )
            // InternalArduinoDSL.g:2196:1: ( '=>' )
            {
            // InternalArduinoDSL.g:2196:1: ( '=>' )
            // InternalArduinoDSL.g:2197:2: '=>'
            {
             before(grammarAccess.getMapAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMapAccess().getEqualsSignGreaterThanSignKeyword_2()); 

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
    // $ANTLR end "rule__Map__Group__2__Impl"


    // $ANTLR start "rule__Map__Group__3"
    // InternalArduinoDSL.g:2206:1: rule__Map__Group__3 : rule__Map__Group__3__Impl ;
    public final void rule__Map__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2210:1: ( rule__Map__Group__3__Impl )
            // InternalArduinoDSL.g:2211:2: rule__Map__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Map__Group__3__Impl();

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
    // $ANTLR end "rule__Map__Group__3"


    // $ANTLR start "rule__Map__Group__3__Impl"
    // InternalArduinoDSL.g:2217:1: rule__Map__Group__3__Impl : ( ( rule__Map__OutAssignment_3 ) ) ;
    public final void rule__Map__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2221:1: ( ( ( rule__Map__OutAssignment_3 ) ) )
            // InternalArduinoDSL.g:2222:1: ( ( rule__Map__OutAssignment_3 ) )
            {
            // InternalArduinoDSL.g:2222:1: ( ( rule__Map__OutAssignment_3 ) )
            // InternalArduinoDSL.g:2223:2: ( rule__Map__OutAssignment_3 )
            {
             before(grammarAccess.getMapAccess().getOutAssignment_3()); 
            // InternalArduinoDSL.g:2224:2: ( rule__Map__OutAssignment_3 )
            // InternalArduinoDSL.g:2224:3: rule__Map__OutAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Map__OutAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMapAccess().getOutAssignment_3()); 

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
    // $ANTLR end "rule__Map__Group__3__Impl"


    // $ANTLR start "rule__Range__Group__0"
    // InternalArduinoDSL.g:2233:1: rule__Range__Group__0 : rule__Range__Group__0__Impl rule__Range__Group__1 ;
    public final void rule__Range__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2237:1: ( rule__Range__Group__0__Impl rule__Range__Group__1 )
            // InternalArduinoDSL.g:2238:2: rule__Range__Group__0__Impl rule__Range__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__Range__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Range__Group__1();

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
    // $ANTLR end "rule__Range__Group__0"


    // $ANTLR start "rule__Range__Group__0__Impl"
    // InternalArduinoDSL.g:2245:1: rule__Range__Group__0__Impl : ( ( rule__Range__LowAssignment_0 ) ) ;
    public final void rule__Range__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2249:1: ( ( ( rule__Range__LowAssignment_0 ) ) )
            // InternalArduinoDSL.g:2250:1: ( ( rule__Range__LowAssignment_0 ) )
            {
            // InternalArduinoDSL.g:2250:1: ( ( rule__Range__LowAssignment_0 ) )
            // InternalArduinoDSL.g:2251:2: ( rule__Range__LowAssignment_0 )
            {
             before(grammarAccess.getRangeAccess().getLowAssignment_0()); 
            // InternalArduinoDSL.g:2252:2: ( rule__Range__LowAssignment_0 )
            // InternalArduinoDSL.g:2252:3: rule__Range__LowAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Range__LowAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRangeAccess().getLowAssignment_0()); 

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
    // $ANTLR end "rule__Range__Group__0__Impl"


    // $ANTLR start "rule__Range__Group__1"
    // InternalArduinoDSL.g:2260:1: rule__Range__Group__1 : rule__Range__Group__1__Impl rule__Range__Group__2 ;
    public final void rule__Range__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2264:1: ( rule__Range__Group__1__Impl rule__Range__Group__2 )
            // InternalArduinoDSL.g:2265:2: rule__Range__Group__1__Impl rule__Range__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Range__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Range__Group__2();

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
    // $ANTLR end "rule__Range__Group__1"


    // $ANTLR start "rule__Range__Group__1__Impl"
    // InternalArduinoDSL.g:2272:1: rule__Range__Group__1__Impl : ( ':' ) ;
    public final void rule__Range__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2276:1: ( ( ':' ) )
            // InternalArduinoDSL.g:2277:1: ( ':' )
            {
            // InternalArduinoDSL.g:2277:1: ( ':' )
            // InternalArduinoDSL.g:2278:2: ':'
            {
             before(grammarAccess.getRangeAccess().getColonKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getRangeAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Range__Group__1__Impl"


    // $ANTLR start "rule__Range__Group__2"
    // InternalArduinoDSL.g:2287:1: rule__Range__Group__2 : rule__Range__Group__2__Impl ;
    public final void rule__Range__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2291:1: ( rule__Range__Group__2__Impl )
            // InternalArduinoDSL.g:2292:2: rule__Range__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Range__Group__2__Impl();

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
    // $ANTLR end "rule__Range__Group__2"


    // $ANTLR start "rule__Range__Group__2__Impl"
    // InternalArduinoDSL.g:2298:1: rule__Range__Group__2__Impl : ( ( rule__Range__HighAssignment_2 ) ) ;
    public final void rule__Range__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2302:1: ( ( ( rule__Range__HighAssignment_2 ) ) )
            // InternalArduinoDSL.g:2303:1: ( ( rule__Range__HighAssignment_2 ) )
            {
            // InternalArduinoDSL.g:2303:1: ( ( rule__Range__HighAssignment_2 ) )
            // InternalArduinoDSL.g:2304:2: ( rule__Range__HighAssignment_2 )
            {
             before(grammarAccess.getRangeAccess().getHighAssignment_2()); 
            // InternalArduinoDSL.g:2305:2: ( rule__Range__HighAssignment_2 )
            // InternalArduinoDSL.g:2305:3: rule__Range__HighAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Range__HighAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRangeAccess().getHighAssignment_2()); 

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
    // $ANTLR end "rule__Range__Group__2__Impl"


    // $ANTLR start "rule__Rate__Group__0"
    // InternalArduinoDSL.g:2314:1: rule__Rate__Group__0 : rule__Rate__Group__0__Impl rule__Rate__Group__1 ;
    public final void rule__Rate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2318:1: ( rule__Rate__Group__0__Impl rule__Rate__Group__1 )
            // InternalArduinoDSL.g:2319:2: rule__Rate__Group__0__Impl rule__Rate__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Rate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Rate__Group__1();

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
    // $ANTLR end "rule__Rate__Group__0"


    // $ANTLR start "rule__Rate__Group__0__Impl"
    // InternalArduinoDSL.g:2326:1: rule__Rate__Group__0__Impl : ( 'rate' ) ;
    public final void rule__Rate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2330:1: ( ( 'rate' ) )
            // InternalArduinoDSL.g:2331:1: ( 'rate' )
            {
            // InternalArduinoDSL.g:2331:1: ( 'rate' )
            // InternalArduinoDSL.g:2332:2: 'rate'
            {
             before(grammarAccess.getRateAccess().getRateKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRateAccess().getRateKeyword_0()); 

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
    // $ANTLR end "rule__Rate__Group__0__Impl"


    // $ANTLR start "rule__Rate__Group__1"
    // InternalArduinoDSL.g:2341:1: rule__Rate__Group__1 : rule__Rate__Group__1__Impl ;
    public final void rule__Rate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2345:1: ( rule__Rate__Group__1__Impl )
            // InternalArduinoDSL.g:2346:2: rule__Rate__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Rate__Group__1__Impl();

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
    // $ANTLR end "rule__Rate__Group__1"


    // $ANTLR start "rule__Rate__Group__1__Impl"
    // InternalArduinoDSL.g:2352:1: rule__Rate__Group__1__Impl : ( ( rule__Rate__ValueAssignment_1 ) ) ;
    public final void rule__Rate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2356:1: ( ( ( rule__Rate__ValueAssignment_1 ) ) )
            // InternalArduinoDSL.g:2357:1: ( ( rule__Rate__ValueAssignment_1 ) )
            {
            // InternalArduinoDSL.g:2357:1: ( ( rule__Rate__ValueAssignment_1 ) )
            // InternalArduinoDSL.g:2358:2: ( rule__Rate__ValueAssignment_1 )
            {
             before(grammarAccess.getRateAccess().getValueAssignment_1()); 
            // InternalArduinoDSL.g:2359:2: ( rule__Rate__ValueAssignment_1 )
            // InternalArduinoDSL.g:2359:3: rule__Rate__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Rate__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRateAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__Rate__Group__1__Impl"


    // $ANTLR start "rule__Smoothing__Group__0"
    // InternalArduinoDSL.g:2368:1: rule__Smoothing__Group__0 : rule__Smoothing__Group__0__Impl rule__Smoothing__Group__1 ;
    public final void rule__Smoothing__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2372:1: ( rule__Smoothing__Group__0__Impl rule__Smoothing__Group__1 )
            // InternalArduinoDSL.g:2373:2: rule__Smoothing__Group__0__Impl rule__Smoothing__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Smoothing__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Smoothing__Group__1();

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
    // $ANTLR end "rule__Smoothing__Group__0"


    // $ANTLR start "rule__Smoothing__Group__0__Impl"
    // InternalArduinoDSL.g:2380:1: rule__Smoothing__Group__0__Impl : ( 'smoothing' ) ;
    public final void rule__Smoothing__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2384:1: ( ( 'smoothing' ) )
            // InternalArduinoDSL.g:2385:1: ( 'smoothing' )
            {
            // InternalArduinoDSL.g:2385:1: ( 'smoothing' )
            // InternalArduinoDSL.g:2386:2: 'smoothing'
            {
             before(grammarAccess.getSmoothingAccess().getSmoothingKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSmoothingAccess().getSmoothingKeyword_0()); 

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
    // $ANTLR end "rule__Smoothing__Group__0__Impl"


    // $ANTLR start "rule__Smoothing__Group__1"
    // InternalArduinoDSL.g:2395:1: rule__Smoothing__Group__1 : rule__Smoothing__Group__1__Impl ;
    public final void rule__Smoothing__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2399:1: ( rule__Smoothing__Group__1__Impl )
            // InternalArduinoDSL.g:2400:2: rule__Smoothing__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Smoothing__Group__1__Impl();

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
    // $ANTLR end "rule__Smoothing__Group__1"


    // $ANTLR start "rule__Smoothing__Group__1__Impl"
    // InternalArduinoDSL.g:2406:1: rule__Smoothing__Group__1__Impl : ( ( rule__Smoothing__ValueAssignment_1 ) ) ;
    public final void rule__Smoothing__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2410:1: ( ( ( rule__Smoothing__ValueAssignment_1 ) ) )
            // InternalArduinoDSL.g:2411:1: ( ( rule__Smoothing__ValueAssignment_1 ) )
            {
            // InternalArduinoDSL.g:2411:1: ( ( rule__Smoothing__ValueAssignment_1 ) )
            // InternalArduinoDSL.g:2412:2: ( rule__Smoothing__ValueAssignment_1 )
            {
             before(grammarAccess.getSmoothingAccess().getValueAssignment_1()); 
            // InternalArduinoDSL.g:2413:2: ( rule__Smoothing__ValueAssignment_1 )
            // InternalArduinoDSL.g:2413:3: rule__Smoothing__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Smoothing__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSmoothingAccess().getValueAssignment_1()); 

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
    // $ANTLR end "rule__Smoothing__Group__1__Impl"


    // $ANTLR start "rule__Program__ProgramAssignment"
    // InternalArduinoDSL.g:2422:1: rule__Program__ProgramAssignment : ( ( rule__Program__ProgramAlternatives_0 ) ) ;
    public final void rule__Program__ProgramAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2426:1: ( ( ( rule__Program__ProgramAlternatives_0 ) ) )
            // InternalArduinoDSL.g:2427:2: ( ( rule__Program__ProgramAlternatives_0 ) )
            {
            // InternalArduinoDSL.g:2427:2: ( ( rule__Program__ProgramAlternatives_0 ) )
            // InternalArduinoDSL.g:2428:3: ( rule__Program__ProgramAlternatives_0 )
            {
             before(grammarAccess.getProgramAccess().getProgramAlternatives_0()); 
            // InternalArduinoDSL.g:2429:3: ( rule__Program__ProgramAlternatives_0 )
            // InternalArduinoDSL.g:2429:4: rule__Program__ProgramAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Program__ProgramAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getProgramAlternatives_0()); 

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
    // $ANTLR end "rule__Program__ProgramAssignment"


    // $ANTLR start "rule__Rule__TypeAssignment_0"
    // InternalArduinoDSL.g:2437:1: rule__Rule__TypeAssignment_0 : ( ( rule__Rule__TypeAlternatives_0_0 ) ) ;
    public final void rule__Rule__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2441:1: ( ( ( rule__Rule__TypeAlternatives_0_0 ) ) )
            // InternalArduinoDSL.g:2442:2: ( ( rule__Rule__TypeAlternatives_0_0 ) )
            {
            // InternalArduinoDSL.g:2442:2: ( ( rule__Rule__TypeAlternatives_0_0 ) )
            // InternalArduinoDSL.g:2443:3: ( rule__Rule__TypeAlternatives_0_0 )
            {
             before(grammarAccess.getRuleAccess().getTypeAlternatives_0_0()); 
            // InternalArduinoDSL.g:2444:3: ( rule__Rule__TypeAlternatives_0_0 )
            // InternalArduinoDSL.g:2444:4: rule__Rule__TypeAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Rule__TypeAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getTypeAlternatives_0_0()); 

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
    // $ANTLR end "rule__Rule__TypeAssignment_0"


    // $ANTLR start "rule__Rule__ConditionAssignment_1"
    // InternalArduinoDSL.g:2452:1: rule__Rule__ConditionAssignment_1 : ( ruleCondition ) ;
    public final void rule__Rule__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2456:1: ( ( ruleCondition ) )
            // InternalArduinoDSL.g:2457:2: ( ruleCondition )
            {
            // InternalArduinoDSL.g:2457:2: ( ruleCondition )
            // InternalArduinoDSL.g:2458:3: ruleCondition
            {
             before(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Rule__ConditionAssignment_1"


    // $ANTLR start "rule__Rule__BodyAssignment_3"
    // InternalArduinoDSL.g:2467:1: rule__Rule__BodyAssignment_3 : ( ruleRuleBody ) ;
    public final void rule__Rule__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2471:1: ( ( ruleRuleBody ) )
            // InternalArduinoDSL.g:2472:2: ( ruleRuleBody )
            {
            // InternalArduinoDSL.g:2472:2: ( ruleRuleBody )
            // InternalArduinoDSL.g:2473:3: ruleRuleBody
            {
             before(grammarAccess.getRuleAccess().getBodyRuleBodyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRuleBody();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getBodyRuleBodyParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Rule__BodyAssignment_3"


    // $ANTLR start "rule__Condition__LeftAssignment_0"
    // InternalArduinoDSL.g:2482:1: rule__Condition__LeftAssignment_0 : ( ruleExp ) ;
    public final void rule__Condition__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2486:1: ( ( ruleExp ) )
            // InternalArduinoDSL.g:2487:2: ( ruleExp )
            {
            // InternalArduinoDSL.g:2487:2: ( ruleExp )
            // InternalArduinoDSL.g:2488:3: ruleExp
            {
             before(grammarAccess.getConditionAccess().getLeftExpParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getLeftExpParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Condition__LeftAssignment_0"


    // $ANTLR start "rule__Condition__OperatorAssignment_1"
    // InternalArduinoDSL.g:2497:1: rule__Condition__OperatorAssignment_1 : ( RULE_BOOLEAN_OPERATOR ) ;
    public final void rule__Condition__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2501:1: ( ( RULE_BOOLEAN_OPERATOR ) )
            // InternalArduinoDSL.g:2502:2: ( RULE_BOOLEAN_OPERATOR )
            {
            // InternalArduinoDSL.g:2502:2: ( RULE_BOOLEAN_OPERATOR )
            // InternalArduinoDSL.g:2503:3: RULE_BOOLEAN_OPERATOR
            {
             before(grammarAccess.getConditionAccess().getOperatorBOOLEAN_OPERATORTerminalRuleCall_1_0()); 
            match(input,RULE_BOOLEAN_OPERATOR,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getOperatorBOOLEAN_OPERATORTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Condition__OperatorAssignment_1"


    // $ANTLR start "rule__Condition__RightAssignment_2"
    // InternalArduinoDSL.g:2512:1: rule__Condition__RightAssignment_2 : ( ruleExp ) ;
    public final void rule__Condition__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2516:1: ( ( ruleExp ) )
            // InternalArduinoDSL.g:2517:2: ( ruleExp )
            {
            // InternalArduinoDSL.g:2517:2: ( ruleExp )
            // InternalArduinoDSL.g:2518:3: ruleExp
            {
             before(grammarAccess.getConditionAccess().getRightExpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getRightExpParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Condition__RightAssignment_2"


    // $ANTLR start "rule__Exp__OperatorAssignment_1_1"
    // InternalArduinoDSL.g:2527:1: rule__Exp__OperatorAssignment_1_1 : ( ruleExpWeakOp ) ;
    public final void rule__Exp__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2531:1: ( ( ruleExpWeakOp ) )
            // InternalArduinoDSL.g:2532:2: ( ruleExpWeakOp )
            {
            // InternalArduinoDSL.g:2532:2: ( ruleExpWeakOp )
            // InternalArduinoDSL.g:2533:3: ruleExpWeakOp
            {
             before(grammarAccess.getExpAccess().getOperatorExpWeakOpParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpWeakOp();

            state._fsp--;

             after(grammarAccess.getExpAccess().getOperatorExpWeakOpParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Exp__OperatorAssignment_1_1"


    // $ANTLR start "rule__Exp__RightAssignment_1_2"
    // InternalArduinoDSL.g:2542:1: rule__Exp__RightAssignment_1_2 : ( ruleFactor ) ;
    public final void rule__Exp__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2546:1: ( ( ruleFactor ) )
            // InternalArduinoDSL.g:2547:2: ( ruleFactor )
            {
            // InternalArduinoDSL.g:2547:2: ( ruleFactor )
            // InternalArduinoDSL.g:2548:3: ruleFactor
            {
             before(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Exp__RightAssignment_1_2"


    // $ANTLR start "rule__Factor__OperatorAssignment_1_1"
    // InternalArduinoDSL.g:2557:1: rule__Factor__OperatorAssignment_1_1 : ( ruleExpStrongOp ) ;
    public final void rule__Factor__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2561:1: ( ( ruleExpStrongOp ) )
            // InternalArduinoDSL.g:2562:2: ( ruleExpStrongOp )
            {
            // InternalArduinoDSL.g:2562:2: ( ruleExpStrongOp )
            // InternalArduinoDSL.g:2563:3: ruleExpStrongOp
            {
             before(grammarAccess.getFactorAccess().getOperatorExpStrongOpParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpStrongOp();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getOperatorExpStrongOpParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Factor__OperatorAssignment_1_1"


    // $ANTLR start "rule__Factor__RightAssignment_1_2"
    // InternalArduinoDSL.g:2572:1: rule__Factor__RightAssignment_1_2 : ( ruleValue ) ;
    public final void rule__Factor__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2576:1: ( ( ruleValue ) )
            // InternalArduinoDSL.g:2577:2: ( ruleValue )
            {
            // InternalArduinoDSL.g:2577:2: ( ruleValue )
            // InternalArduinoDSL.g:2578:3: ruleValue
            {
             before(grammarAccess.getFactorAccess().getRightValueParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getRightValueParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Factor__RightAssignment_1_2"


    // $ANTLR start "rule__Attribute__NameAssignment_0"
    // InternalArduinoDSL.g:2587:1: rule__Attribute__NameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2591:1: ( ( ( RULE_ID ) ) )
            // InternalArduinoDSL.g:2592:2: ( ( RULE_ID ) )
            {
            // InternalArduinoDSL.g:2592:2: ( ( RULE_ID ) )
            // InternalArduinoDSL.g:2593:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeAccess().getNameNodeCrossReference_0_0()); 
            // InternalArduinoDSL.g:2594:3: ( RULE_ID )
            // InternalArduinoDSL.g:2595:4: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getNameNodeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameNodeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAttributeAccess().getNameNodeCrossReference_0_0()); 

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
    // $ANTLR end "rule__Attribute__NameAssignment_0"


    // $ANTLR start "rule__Attribute__ComponentAssignment_1"
    // InternalArduinoDSL.g:2606:1: rule__Attribute__ComponentAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Attribute__ComponentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2610:1: ( ( ( RULE_ID ) ) )
            // InternalArduinoDSL.g:2611:2: ( ( RULE_ID ) )
            {
            // InternalArduinoDSL.g:2611:2: ( ( RULE_ID ) )
            // InternalArduinoDSL.g:2612:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeAccess().getComponentComponentCrossReference_1_0()); 
            // InternalArduinoDSL.g:2613:3: ( RULE_ID )
            // InternalArduinoDSL.g:2614:4: RULE_ID
            {
             before(grammarAccess.getAttributeAccess().getComponentComponentIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getComponentComponentIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getAttributeAccess().getComponentComponentCrossReference_1_0()); 

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
    // $ANTLR end "rule__Attribute__ComponentAssignment_1"


    // $ANTLR start "rule__Delta__AttrAssignment_0"
    // InternalArduinoDSL.g:2625:1: rule__Delta__AttrAssignment_0 : ( ruleAttribute ) ;
    public final void rule__Delta__AttrAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2629:1: ( ( ruleAttribute ) )
            // InternalArduinoDSL.g:2630:2: ( ruleAttribute )
            {
            // InternalArduinoDSL.g:2630:2: ( ruleAttribute )
            // InternalArduinoDSL.g:2631:3: ruleAttribute
            {
             before(grammarAccess.getDeltaAccess().getAttrAttributeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getDeltaAccess().getAttrAttributeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Delta__AttrAssignment_0"


    // $ANTLR start "rule__NumberLiteral__FloatAssignment_0"
    // InternalArduinoDSL.g:2640:1: rule__NumberLiteral__FloatAssignment_0 : ( RULE_DECIMAL ) ;
    public final void rule__NumberLiteral__FloatAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2644:1: ( ( RULE_DECIMAL ) )
            // InternalArduinoDSL.g:2645:2: ( RULE_DECIMAL )
            {
            // InternalArduinoDSL.g:2645:2: ( RULE_DECIMAL )
            // InternalArduinoDSL.g:2646:3: RULE_DECIMAL
            {
             before(grammarAccess.getNumberLiteralAccess().getFloatDECIMALTerminalRuleCall_0_0()); 
            match(input,RULE_DECIMAL,FOLLOW_2); 
             after(grammarAccess.getNumberLiteralAccess().getFloatDECIMALTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__NumberLiteral__FloatAssignment_0"


    // $ANTLR start "rule__NumberLiteral__IntAssignment_1"
    // InternalArduinoDSL.g:2655:1: rule__NumberLiteral__IntAssignment_1 : ( RULE_INT ) ;
    public final void rule__NumberLiteral__IntAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2659:1: ( ( RULE_INT ) )
            // InternalArduinoDSL.g:2660:2: ( RULE_INT )
            {
            // InternalArduinoDSL.g:2660:2: ( RULE_INT )
            // InternalArduinoDSL.g:2661:3: RULE_INT
            {
             before(grammarAccess.getNumberLiteralAccess().getIntINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberLiteralAccess().getIntINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__NumberLiteral__IntAssignment_1"


    // $ANTLR start "rule__State__ValueAssignment"
    // InternalArduinoDSL.g:2670:1: rule__State__ValueAssignment : ( ( rule__State__ValueAlternatives_0 ) ) ;
    public final void rule__State__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2674:1: ( ( ( rule__State__ValueAlternatives_0 ) ) )
            // InternalArduinoDSL.g:2675:2: ( ( rule__State__ValueAlternatives_0 ) )
            {
            // InternalArduinoDSL.g:2675:2: ( ( rule__State__ValueAlternatives_0 ) )
            // InternalArduinoDSL.g:2676:3: ( rule__State__ValueAlternatives_0 )
            {
             before(grammarAccess.getStateAccess().getValueAlternatives_0()); 
            // InternalArduinoDSL.g:2677:3: ( rule__State__ValueAlternatives_0 )
            // InternalArduinoDSL.g:2677:4: rule__State__ValueAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__State__ValueAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getValueAlternatives_0()); 

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
    // $ANTLR end "rule__State__ValueAssignment"


    // $ANTLR start "rule__RuleBody__AssignmentAssignment"
    // InternalArduinoDSL.g:2685:1: rule__RuleBody__AssignmentAssignment : ( ruleAssignment ) ;
    public final void rule__RuleBody__AssignmentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2689:1: ( ( ruleAssignment ) )
            // InternalArduinoDSL.g:2690:2: ( ruleAssignment )
            {
            // InternalArduinoDSL.g:2690:2: ( ruleAssignment )
            // InternalArduinoDSL.g:2691:3: ruleAssignment
            {
             before(grammarAccess.getRuleBodyAccess().getAssignmentAssignmentParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getRuleBodyAccess().getAssignmentAssignmentParserRuleCall_0()); 

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
    // $ANTLR end "rule__RuleBody__AssignmentAssignment"


    // $ANTLR start "rule__Assignment__AttributeAssignment_0"
    // InternalArduinoDSL.g:2700:1: rule__Assignment__AttributeAssignment_0 : ( ruleAttribute ) ;
    public final void rule__Assignment__AttributeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2704:1: ( ( ruleAttribute ) )
            // InternalArduinoDSL.g:2705:2: ( ruleAttribute )
            {
            // InternalArduinoDSL.g:2705:2: ( ruleAttribute )
            // InternalArduinoDSL.g:2706:3: ruleAttribute
            {
             before(grammarAccess.getAssignmentAccess().getAttributeAttributeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getAttributeAttributeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Assignment__AttributeAssignment_0"


    // $ANTLR start "rule__Assignment__ValueAssignment_2"
    // InternalArduinoDSL.g:2715:1: rule__Assignment__ValueAssignment_2 : ( ruleExp ) ;
    public final void rule__Assignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2719:1: ( ( ruleExp ) )
            // InternalArduinoDSL.g:2720:2: ( ruleExp )
            {
            // InternalArduinoDSL.g:2720:2: ( ruleExp )
            // InternalArduinoDSL.g:2721:3: ruleExp
            {
             before(grammarAccess.getAssignmentAccess().getValueExpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getValueExpParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Assignment__ValueAssignment_2"


    // $ANTLR start "rule__Node__NameAssignment_0"
    // InternalArduinoDSL.g:2730:1: rule__Node__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2734:1: ( ( RULE_ID ) )
            // InternalArduinoDSL.g:2735:2: ( RULE_ID )
            {
            // InternalArduinoDSL.g:2735:2: ( RULE_ID )
            // InternalArduinoDSL.g:2736:3: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Node__NameAssignment_0"


    // $ANTLR start "rule__Node__ComponentsAssignment_2"
    // InternalArduinoDSL.g:2745:1: rule__Node__ComponentsAssignment_2 : ( ruleComponent ) ;
    public final void rule__Node__ComponentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2749:1: ( ( ruleComponent ) )
            // InternalArduinoDSL.g:2750:2: ( ruleComponent )
            {
            // InternalArduinoDSL.g:2750:2: ( ruleComponent )
            // InternalArduinoDSL.g:2751:3: ruleComponent
            {
             before(grammarAccess.getNodeAccess().getComponentsComponentParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComponent();

            state._fsp--;

             after(grammarAccess.getNodeAccess().getComponentsComponentParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Node__ComponentsAssignment_2"


    // $ANTLR start "rule__Component__NameAssignment_0"
    // InternalArduinoDSL.g:2760:1: rule__Component__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2764:1: ( ( RULE_ID ) )
            // InternalArduinoDSL.g:2765:2: ( RULE_ID )
            {
            // InternalArduinoDSL.g:2765:2: ( RULE_ID )
            // InternalArduinoDSL.g:2766:3: RULE_ID
            {
             before(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Component__NameAssignment_0"


    // $ANTLR start "rule__Component__PropertiesAssignment_1"
    // InternalArduinoDSL.g:2775:1: rule__Component__PropertiesAssignment_1 : ( ruleComponentBody ) ;
    public final void rule__Component__PropertiesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2779:1: ( ( ruleComponentBody ) )
            // InternalArduinoDSL.g:2780:2: ( ruleComponentBody )
            {
            // InternalArduinoDSL.g:2780:2: ( ruleComponentBody )
            // InternalArduinoDSL.g:2781:3: ruleComponentBody
            {
             before(grammarAccess.getComponentAccess().getPropertiesComponentBodyParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentBody();

            state._fsp--;

             after(grammarAccess.getComponentAccess().getPropertiesComponentBodyParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Component__PropertiesAssignment_1"


    // $ANTLR start "rule__ComponentBody__IoAssignment_0"
    // InternalArduinoDSL.g:2790:1: rule__ComponentBody__IoAssignment_0 : ( RULE_IO ) ;
    public final void rule__ComponentBody__IoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2794:1: ( ( RULE_IO ) )
            // InternalArduinoDSL.g:2795:2: ( RULE_IO )
            {
            // InternalArduinoDSL.g:2795:2: ( RULE_IO )
            // InternalArduinoDSL.g:2796:3: RULE_IO
            {
             before(grammarAccess.getComponentBodyAccess().getIoIOTerminalRuleCall_0_0()); 
            match(input,RULE_IO,FOLLOW_2); 
             after(grammarAccess.getComponentBodyAccess().getIoIOTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__ComponentBody__IoAssignment_0"


    // $ANTLR start "rule__ComponentBody__TypeAssignment_1"
    // InternalArduinoDSL.g:2805:1: rule__ComponentBody__TypeAssignment_1 : ( RULE_TYPE ) ;
    public final void rule__ComponentBody__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2809:1: ( ( RULE_TYPE ) )
            // InternalArduinoDSL.g:2810:2: ( RULE_TYPE )
            {
            // InternalArduinoDSL.g:2810:2: ( RULE_TYPE )
            // InternalArduinoDSL.g:2811:3: RULE_TYPE
            {
             before(grammarAccess.getComponentBodyAccess().getTypeTYPETerminalRuleCall_1_0()); 
            match(input,RULE_TYPE,FOLLOW_2); 
             after(grammarAccess.getComponentBodyAccess().getTypeTYPETerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ComponentBody__TypeAssignment_1"


    // $ANTLR start "rule__ComponentBody__PinAssignment_3"
    // InternalArduinoDSL.g:2820:1: rule__ComponentBody__PinAssignment_3 : ( RULE_INT ) ;
    public final void rule__ComponentBody__PinAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2824:1: ( ( RULE_INT ) )
            // InternalArduinoDSL.g:2825:2: ( RULE_INT )
            {
            // InternalArduinoDSL.g:2825:2: ( RULE_INT )
            // InternalArduinoDSL.g:2826:3: RULE_INT
            {
             before(grammarAccess.getComponentBodyAccess().getPinINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getComponentBodyAccess().getPinINTTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__ComponentBody__PinAssignment_3"


    // $ANTLR start "rule__ComponentBody__MapAssignment_4"
    // InternalArduinoDSL.g:2835:1: rule__ComponentBody__MapAssignment_4 : ( ruleMap ) ;
    public final void rule__ComponentBody__MapAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2839:1: ( ( ruleMap ) )
            // InternalArduinoDSL.g:2840:2: ( ruleMap )
            {
            // InternalArduinoDSL.g:2840:2: ( ruleMap )
            // InternalArduinoDSL.g:2841:3: ruleMap
            {
             before(grammarAccess.getComponentBodyAccess().getMapMapParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMap();

            state._fsp--;

             after(grammarAccess.getComponentBodyAccess().getMapMapParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__ComponentBody__MapAssignment_4"


    // $ANTLR start "rule__ComponentBody__RateAssignment_5"
    // InternalArduinoDSL.g:2850:1: rule__ComponentBody__RateAssignment_5 : ( ruleRate ) ;
    public final void rule__ComponentBody__RateAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2854:1: ( ( ruleRate ) )
            // InternalArduinoDSL.g:2855:2: ( ruleRate )
            {
            // InternalArduinoDSL.g:2855:2: ( ruleRate )
            // InternalArduinoDSL.g:2856:3: ruleRate
            {
             before(grammarAccess.getComponentBodyAccess().getRateRateParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleRate();

            state._fsp--;

             after(grammarAccess.getComponentBodyAccess().getRateRateParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__ComponentBody__RateAssignment_5"


    // $ANTLR start "rule__ComponentBody__SmoothingAssignment_6"
    // InternalArduinoDSL.g:2865:1: rule__ComponentBody__SmoothingAssignment_6 : ( ruleSmoothing ) ;
    public final void rule__ComponentBody__SmoothingAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2869:1: ( ( ruleSmoothing ) )
            // InternalArduinoDSL.g:2870:2: ( ruleSmoothing )
            {
            // InternalArduinoDSL.g:2870:2: ( ruleSmoothing )
            // InternalArduinoDSL.g:2871:3: ruleSmoothing
            {
             before(grammarAccess.getComponentBodyAccess().getSmoothingSmoothingParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleSmoothing();

            state._fsp--;

             after(grammarAccess.getComponentBodyAccess().getSmoothingSmoothingParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__ComponentBody__SmoothingAssignment_6"


    // $ANTLR start "rule__Map__InAssignment_1"
    // InternalArduinoDSL.g:2880:1: rule__Map__InAssignment_1 : ( ruleRange ) ;
    public final void rule__Map__InAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2884:1: ( ( ruleRange ) )
            // InternalArduinoDSL.g:2885:2: ( ruleRange )
            {
            // InternalArduinoDSL.g:2885:2: ( ruleRange )
            // InternalArduinoDSL.g:2886:3: ruleRange
            {
             before(grammarAccess.getMapAccess().getInRangeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRange();

            state._fsp--;

             after(grammarAccess.getMapAccess().getInRangeParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Map__InAssignment_1"


    // $ANTLR start "rule__Map__OutAssignment_3"
    // InternalArduinoDSL.g:2895:1: rule__Map__OutAssignment_3 : ( ruleRange ) ;
    public final void rule__Map__OutAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2899:1: ( ( ruleRange ) )
            // InternalArduinoDSL.g:2900:2: ( ruleRange )
            {
            // InternalArduinoDSL.g:2900:2: ( ruleRange )
            // InternalArduinoDSL.g:2901:3: ruleRange
            {
             before(grammarAccess.getMapAccess().getOutRangeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRange();

            state._fsp--;

             after(grammarAccess.getMapAccess().getOutRangeParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Map__OutAssignment_3"


    // $ANTLR start "rule__Range__LowAssignment_0"
    // InternalArduinoDSL.g:2910:1: rule__Range__LowAssignment_0 : ( ruleNUMBER ) ;
    public final void rule__Range__LowAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2914:1: ( ( ruleNUMBER ) )
            // InternalArduinoDSL.g:2915:2: ( ruleNUMBER )
            {
            // InternalArduinoDSL.g:2915:2: ( ruleNUMBER )
            // InternalArduinoDSL.g:2916:3: ruleNUMBER
            {
             before(grammarAccess.getRangeAccess().getLowNUMBERParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleNUMBER();

            state._fsp--;

             after(grammarAccess.getRangeAccess().getLowNUMBERParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Range__LowAssignment_0"


    // $ANTLR start "rule__Range__HighAssignment_2"
    // InternalArduinoDSL.g:2925:1: rule__Range__HighAssignment_2 : ( ruleNUMBER ) ;
    public final void rule__Range__HighAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2929:1: ( ( ruleNUMBER ) )
            // InternalArduinoDSL.g:2930:2: ( ruleNUMBER )
            {
            // InternalArduinoDSL.g:2930:2: ( ruleNUMBER )
            // InternalArduinoDSL.g:2931:3: ruleNUMBER
            {
             before(grammarAccess.getRangeAccess().getHighNUMBERParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNUMBER();

            state._fsp--;

             after(grammarAccess.getRangeAccess().getHighNUMBERParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Range__HighAssignment_2"


    // $ANTLR start "rule__Rate__ValueAssignment_1"
    // InternalArduinoDSL.g:2940:1: rule__Rate__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__Rate__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2944:1: ( ( RULE_INT ) )
            // InternalArduinoDSL.g:2945:2: ( RULE_INT )
            {
            // InternalArduinoDSL.g:2945:2: ( RULE_INT )
            // InternalArduinoDSL.g:2946:3: RULE_INT
            {
             before(grammarAccess.getRateAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getRateAccess().getValueINTTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Rate__ValueAssignment_1"


    // $ANTLR start "rule__Smoothing__ValueAssignment_1"
    // InternalArduinoDSL.g:2955:1: rule__Smoothing__ValueAssignment_1 : ( ruleNUMBER ) ;
    public final void rule__Smoothing__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2959:1: ( ( ruleNUMBER ) )
            // InternalArduinoDSL.g:2960:2: ( ruleNUMBER )
            {
            // InternalArduinoDSL.g:2960:2: ( ruleNUMBER )
            // InternalArduinoDSL.g:2961:3: ruleNUMBER
            {
             before(grammarAccess.getSmoothingAccess().getValueNUMBERParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNUMBER();

            state._fsp--;

             after(grammarAccess.getSmoothingAccess().getValueNUMBERParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Smoothing__ValueAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000018042L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000600D0L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000320000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});

}