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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STATE", "RULE_INT", "RULE_BOOLEAN_OPERATOR", "RULE_ID", "RULE_IO", "RULE_TYPE", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'when'", "'once'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'delta'", "'.'", "'='", "'pin'", "'map'", "'=>'", "':'", "'rate'", "'smoothing'"
    };
    public static final int RULE_BOOLEAN_OPERATOR=6;
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__19=19;
    public static final int RULE_IO=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_STATE=4;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=7;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__26=26;
    public static final int RULE_TYPE=9;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
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


    // $ANTLR start "entryRuleNUMBER"
    // InternalArduinoDSL.g:303:1: entryRuleNUMBER : ruleNUMBER EOF ;
    public final void entryRuleNUMBER() throws RecognitionException {
        try {
            // InternalArduinoDSL.g:304:1: ( ruleNUMBER EOF )
            // InternalArduinoDSL.g:305:1: ruleNUMBER EOF
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
    // InternalArduinoDSL.g:312:1: ruleNUMBER : ( ( rule__NUMBER__Group__0 ) ) ;
    public final void ruleNUMBER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:316:2: ( ( ( rule__NUMBER__Group__0 ) ) )
            // InternalArduinoDSL.g:317:2: ( ( rule__NUMBER__Group__0 ) )
            {
            // InternalArduinoDSL.g:317:2: ( ( rule__NUMBER__Group__0 ) )
            // InternalArduinoDSL.g:318:3: ( rule__NUMBER__Group__0 )
            {
             before(grammarAccess.getNUMBERAccess().getGroup()); 
            // InternalArduinoDSL.g:319:3: ( rule__NUMBER__Group__0 )
            // InternalArduinoDSL.g:319:4: rule__NUMBER__Group__0
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


    // $ANTLR start "entryRuleRuleBody"
    // InternalArduinoDSL.g:328:1: entryRuleRuleBody : ruleRuleBody EOF ;
    public final void entryRuleRuleBody() throws RecognitionException {
        try {
            // InternalArduinoDSL.g:329:1: ( ruleRuleBody EOF )
            // InternalArduinoDSL.g:330:1: ruleRuleBody EOF
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
    // InternalArduinoDSL.g:337:1: ruleRuleBody : ( ( ( rule__RuleBody__AssignmentAssignment ) ) ( ( rule__RuleBody__AssignmentAssignment )* ) ) ;
    public final void ruleRuleBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:341:2: ( ( ( ( rule__RuleBody__AssignmentAssignment ) ) ( ( rule__RuleBody__AssignmentAssignment )* ) ) )
            // InternalArduinoDSL.g:342:2: ( ( ( rule__RuleBody__AssignmentAssignment ) ) ( ( rule__RuleBody__AssignmentAssignment )* ) )
            {
            // InternalArduinoDSL.g:342:2: ( ( ( rule__RuleBody__AssignmentAssignment ) ) ( ( rule__RuleBody__AssignmentAssignment )* ) )
            // InternalArduinoDSL.g:343:3: ( ( rule__RuleBody__AssignmentAssignment ) ) ( ( rule__RuleBody__AssignmentAssignment )* )
            {
            // InternalArduinoDSL.g:343:3: ( ( rule__RuleBody__AssignmentAssignment ) )
            // InternalArduinoDSL.g:344:4: ( rule__RuleBody__AssignmentAssignment )
            {
             before(grammarAccess.getRuleBodyAccess().getAssignmentAssignment()); 
            // InternalArduinoDSL.g:345:4: ( rule__RuleBody__AssignmentAssignment )
            // InternalArduinoDSL.g:345:5: rule__RuleBody__AssignmentAssignment
            {
            pushFollow(FOLLOW_4);
            rule__RuleBody__AssignmentAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRuleBodyAccess().getAssignmentAssignment()); 

            }

            // InternalArduinoDSL.g:348:3: ( ( rule__RuleBody__AssignmentAssignment )* )
            // InternalArduinoDSL.g:349:4: ( rule__RuleBody__AssignmentAssignment )*
            {
             before(grammarAccess.getRuleBodyAccess().getAssignmentAssignment()); 
            // InternalArduinoDSL.g:350:4: ( rule__RuleBody__AssignmentAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalArduinoDSL.g:350:5: rule__RuleBody__AssignmentAssignment
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
    // InternalArduinoDSL.g:360:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalArduinoDSL.g:361:1: ( ruleAssignment EOF )
            // InternalArduinoDSL.g:362:1: ruleAssignment EOF
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
    // InternalArduinoDSL.g:369:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:373:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // InternalArduinoDSL.g:374:2: ( ( rule__Assignment__Group__0 ) )
            {
            // InternalArduinoDSL.g:374:2: ( ( rule__Assignment__Group__0 ) )
            // InternalArduinoDSL.g:375:3: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // InternalArduinoDSL.g:376:3: ( rule__Assignment__Group__0 )
            // InternalArduinoDSL.g:376:4: rule__Assignment__Group__0
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
    // InternalArduinoDSL.g:385:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // InternalArduinoDSL.g:386:1: ( ruleNode EOF )
            // InternalArduinoDSL.g:387:1: ruleNode EOF
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
    // InternalArduinoDSL.g:394:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:398:2: ( ( ( rule__Node__Group__0 ) ) )
            // InternalArduinoDSL.g:399:2: ( ( rule__Node__Group__0 ) )
            {
            // InternalArduinoDSL.g:399:2: ( ( rule__Node__Group__0 ) )
            // InternalArduinoDSL.g:400:3: ( rule__Node__Group__0 )
            {
             before(grammarAccess.getNodeAccess().getGroup()); 
            // InternalArduinoDSL.g:401:3: ( rule__Node__Group__0 )
            // InternalArduinoDSL.g:401:4: rule__Node__Group__0
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
    // InternalArduinoDSL.g:410:1: entryRuleComponent : ruleComponent EOF ;
    public final void entryRuleComponent() throws RecognitionException {
        try {
            // InternalArduinoDSL.g:411:1: ( ruleComponent EOF )
            // InternalArduinoDSL.g:412:1: ruleComponent EOF
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
    // InternalArduinoDSL.g:419:1: ruleComponent : ( ( rule__Component__Group__0 ) ) ;
    public final void ruleComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:423:2: ( ( ( rule__Component__Group__0 ) ) )
            // InternalArduinoDSL.g:424:2: ( ( rule__Component__Group__0 ) )
            {
            // InternalArduinoDSL.g:424:2: ( ( rule__Component__Group__0 ) )
            // InternalArduinoDSL.g:425:3: ( rule__Component__Group__0 )
            {
             before(grammarAccess.getComponentAccess().getGroup()); 
            // InternalArduinoDSL.g:426:3: ( rule__Component__Group__0 )
            // InternalArduinoDSL.g:426:4: rule__Component__Group__0
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
    // InternalArduinoDSL.g:435:1: entryRuleComponentBody : ruleComponentBody EOF ;
    public final void entryRuleComponentBody() throws RecognitionException {
        try {
            // InternalArduinoDSL.g:436:1: ( ruleComponentBody EOF )
            // InternalArduinoDSL.g:437:1: ruleComponentBody EOF
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
    // InternalArduinoDSL.g:444:1: ruleComponentBody : ( ( rule__ComponentBody__Group__0 ) ) ;
    public final void ruleComponentBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:448:2: ( ( ( rule__ComponentBody__Group__0 ) ) )
            // InternalArduinoDSL.g:449:2: ( ( rule__ComponentBody__Group__0 ) )
            {
            // InternalArduinoDSL.g:449:2: ( ( rule__ComponentBody__Group__0 ) )
            // InternalArduinoDSL.g:450:3: ( rule__ComponentBody__Group__0 )
            {
             before(grammarAccess.getComponentBodyAccess().getGroup()); 
            // InternalArduinoDSL.g:451:3: ( rule__ComponentBody__Group__0 )
            // InternalArduinoDSL.g:451:4: rule__ComponentBody__Group__0
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
    // InternalArduinoDSL.g:460:1: entryRuleMap : ruleMap EOF ;
    public final void entryRuleMap() throws RecognitionException {
        try {
            // InternalArduinoDSL.g:461:1: ( ruleMap EOF )
            // InternalArduinoDSL.g:462:1: ruleMap EOF
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
    // InternalArduinoDSL.g:469:1: ruleMap : ( ( rule__Map__Group__0 ) ) ;
    public final void ruleMap() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:473:2: ( ( ( rule__Map__Group__0 ) ) )
            // InternalArduinoDSL.g:474:2: ( ( rule__Map__Group__0 ) )
            {
            // InternalArduinoDSL.g:474:2: ( ( rule__Map__Group__0 ) )
            // InternalArduinoDSL.g:475:3: ( rule__Map__Group__0 )
            {
             before(grammarAccess.getMapAccess().getGroup()); 
            // InternalArduinoDSL.g:476:3: ( rule__Map__Group__0 )
            // InternalArduinoDSL.g:476:4: rule__Map__Group__0
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
    // InternalArduinoDSL.g:485:1: entryRuleRange : ruleRange EOF ;
    public final void entryRuleRange() throws RecognitionException {
        try {
            // InternalArduinoDSL.g:486:1: ( ruleRange EOF )
            // InternalArduinoDSL.g:487:1: ruleRange EOF
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
    // InternalArduinoDSL.g:494:1: ruleRange : ( ( rule__Range__Group__0 ) ) ;
    public final void ruleRange() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:498:2: ( ( ( rule__Range__Group__0 ) ) )
            // InternalArduinoDSL.g:499:2: ( ( rule__Range__Group__0 ) )
            {
            // InternalArduinoDSL.g:499:2: ( ( rule__Range__Group__0 ) )
            // InternalArduinoDSL.g:500:3: ( rule__Range__Group__0 )
            {
             before(grammarAccess.getRangeAccess().getGroup()); 
            // InternalArduinoDSL.g:501:3: ( rule__Range__Group__0 )
            // InternalArduinoDSL.g:501:4: rule__Range__Group__0
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
    // InternalArduinoDSL.g:510:1: entryRuleRate : ruleRate EOF ;
    public final void entryRuleRate() throws RecognitionException {
        try {
            // InternalArduinoDSL.g:511:1: ( ruleRate EOF )
            // InternalArduinoDSL.g:512:1: ruleRate EOF
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
    // InternalArduinoDSL.g:519:1: ruleRate : ( ( rule__Rate__Group__0 ) ) ;
    public final void ruleRate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:523:2: ( ( ( rule__Rate__Group__0 ) ) )
            // InternalArduinoDSL.g:524:2: ( ( rule__Rate__Group__0 ) )
            {
            // InternalArduinoDSL.g:524:2: ( ( rule__Rate__Group__0 ) )
            // InternalArduinoDSL.g:525:3: ( rule__Rate__Group__0 )
            {
             before(grammarAccess.getRateAccess().getGroup()); 
            // InternalArduinoDSL.g:526:3: ( rule__Rate__Group__0 )
            // InternalArduinoDSL.g:526:4: rule__Rate__Group__0
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
    // InternalArduinoDSL.g:535:1: entryRuleSmoothing : ruleSmoothing EOF ;
    public final void entryRuleSmoothing() throws RecognitionException {
        try {
            // InternalArduinoDSL.g:536:1: ( ruleSmoothing EOF )
            // InternalArduinoDSL.g:537:1: ruleSmoothing EOF
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
    // InternalArduinoDSL.g:544:1: ruleSmoothing : ( ( rule__Smoothing__Group__0 ) ) ;
    public final void ruleSmoothing() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:548:2: ( ( ( rule__Smoothing__Group__0 ) ) )
            // InternalArduinoDSL.g:549:2: ( ( rule__Smoothing__Group__0 ) )
            {
            // InternalArduinoDSL.g:549:2: ( ( rule__Smoothing__Group__0 ) )
            // InternalArduinoDSL.g:550:3: ( rule__Smoothing__Group__0 )
            {
             before(grammarAccess.getSmoothingAccess().getGroup()); 
            // InternalArduinoDSL.g:551:3: ( rule__Smoothing__Group__0 )
            // InternalArduinoDSL.g:551:4: rule__Smoothing__Group__0
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
    // InternalArduinoDSL.g:559:1: rule__Program__ProgramAlternatives_0 : ( ( ruleRule ) | ( ruleNode ) );
    public final void rule__Program__ProgramAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:563:1: ( ( ruleRule ) | ( ruleNode ) )
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
                    // InternalArduinoDSL.g:564:2: ( ruleRule )
                    {
                    // InternalArduinoDSL.g:564:2: ( ruleRule )
                    // InternalArduinoDSL.g:565:3: ruleRule
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
                    // InternalArduinoDSL.g:570:2: ( ruleNode )
                    {
                    // InternalArduinoDSL.g:570:2: ( ruleNode )
                    // InternalArduinoDSL.g:571:3: ruleNode
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
    // InternalArduinoDSL.g:580:1: rule__Rule__TypeAlternatives_0_0 : ( ( 'when' ) | ( 'once' ) );
    public final void rule__Rule__TypeAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:584:1: ( ( 'when' ) | ( 'once' ) )
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
                    // InternalArduinoDSL.g:585:2: ( 'when' )
                    {
                    // InternalArduinoDSL.g:585:2: ( 'when' )
                    // InternalArduinoDSL.g:586:3: 'when'
                    {
                     before(grammarAccess.getRuleAccess().getTypeWhenKeyword_0_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getRuleAccess().getTypeWhenKeyword_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoDSL.g:591:2: ( 'once' )
                    {
                    // InternalArduinoDSL.g:591:2: ( 'once' )
                    // InternalArduinoDSL.g:592:3: 'once'
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
    // InternalArduinoDSL.g:601:1: rule__ExpWeakOp__Alternatives : ( ( ( rule__ExpWeakOp__Group_0__0 ) ) | ( ( rule__ExpWeakOp__Group_1__0 ) ) );
    public final void rule__ExpWeakOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:605:1: ( ( ( rule__ExpWeakOp__Group_0__0 ) ) | ( ( rule__ExpWeakOp__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            else if ( (LA5_0==20) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalArduinoDSL.g:606:2: ( ( rule__ExpWeakOp__Group_0__0 ) )
                    {
                    // InternalArduinoDSL.g:606:2: ( ( rule__ExpWeakOp__Group_0__0 ) )
                    // InternalArduinoDSL.g:607:3: ( rule__ExpWeakOp__Group_0__0 )
                    {
                     before(grammarAccess.getExpWeakOpAccess().getGroup_0()); 
                    // InternalArduinoDSL.g:608:3: ( rule__ExpWeakOp__Group_0__0 )
                    // InternalArduinoDSL.g:608:4: rule__ExpWeakOp__Group_0__0
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
                    // InternalArduinoDSL.g:612:2: ( ( rule__ExpWeakOp__Group_1__0 ) )
                    {
                    // InternalArduinoDSL.g:612:2: ( ( rule__ExpWeakOp__Group_1__0 ) )
                    // InternalArduinoDSL.g:613:3: ( rule__ExpWeakOp__Group_1__0 )
                    {
                     before(grammarAccess.getExpWeakOpAccess().getGroup_1()); 
                    // InternalArduinoDSL.g:614:3: ( rule__ExpWeakOp__Group_1__0 )
                    // InternalArduinoDSL.g:614:4: rule__ExpWeakOp__Group_1__0
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
    // InternalArduinoDSL.g:622:1: rule__ExpStrongOp__Alternatives : ( ( ( rule__ExpStrongOp__Group_0__0 ) ) | ( ( rule__ExpStrongOp__Group_1__0 ) ) );
    public final void rule__ExpStrongOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:626:1: ( ( ( rule__ExpStrongOp__Group_0__0 ) ) | ( ( rule__ExpStrongOp__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            else if ( (LA6_0==22) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalArduinoDSL.g:627:2: ( ( rule__ExpStrongOp__Group_0__0 ) )
                    {
                    // InternalArduinoDSL.g:627:2: ( ( rule__ExpStrongOp__Group_0__0 ) )
                    // InternalArduinoDSL.g:628:3: ( rule__ExpStrongOp__Group_0__0 )
                    {
                     before(grammarAccess.getExpStrongOpAccess().getGroup_0()); 
                    // InternalArduinoDSL.g:629:3: ( rule__ExpStrongOp__Group_0__0 )
                    // InternalArduinoDSL.g:629:4: rule__ExpStrongOp__Group_0__0
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
                    // InternalArduinoDSL.g:633:2: ( ( rule__ExpStrongOp__Group_1__0 ) )
                    {
                    // InternalArduinoDSL.g:633:2: ( ( rule__ExpStrongOp__Group_1__0 ) )
                    // InternalArduinoDSL.g:634:3: ( rule__ExpStrongOp__Group_1__0 )
                    {
                     before(grammarAccess.getExpStrongOpAccess().getGroup_1()); 
                    // InternalArduinoDSL.g:635:3: ( rule__ExpStrongOp__Group_1__0 )
                    // InternalArduinoDSL.g:635:4: rule__ExpStrongOp__Group_1__0
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
    // InternalArduinoDSL.g:643:1: rule__Value__Alternatives : ( ( ( rule__Value__Group_0__0 ) ) | ( ruleAttribute ) | ( ruleDelta ) | ( ( rule__Value__Group_3__0 ) ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:647:1: ( ( ( rule__Value__Group_0__0 ) ) | ( ruleAttribute ) | ( ruleDelta ) | ( ( rule__Value__Group_3__0 ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt7=1;
                }
                break;
            case RULE_ID:
                {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==RULE_ID) ) {
                    int LA7_4 = input.LA(3);

                    if ( (LA7_4==EOF||(LA7_4>=RULE_BOOLEAN_OPERATOR && LA7_4<=RULE_ID)||(LA7_4>=17 && LA7_4<=22)) ) {
                        alt7=2;
                    }
                    else if ( (LA7_4==23) ) {
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
            case RULE_STATE:
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
                    // InternalArduinoDSL.g:648:2: ( ( rule__Value__Group_0__0 ) )
                    {
                    // InternalArduinoDSL.g:648:2: ( ( rule__Value__Group_0__0 ) )
                    // InternalArduinoDSL.g:649:3: ( rule__Value__Group_0__0 )
                    {
                     before(grammarAccess.getValueAccess().getGroup_0()); 
                    // InternalArduinoDSL.g:650:3: ( rule__Value__Group_0__0 )
                    // InternalArduinoDSL.g:650:4: rule__Value__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoDSL.g:654:2: ( ruleAttribute )
                    {
                    // InternalArduinoDSL.g:654:2: ( ruleAttribute )
                    // InternalArduinoDSL.g:655:3: ruleAttribute
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
                    // InternalArduinoDSL.g:660:2: ( ruleDelta )
                    {
                    // InternalArduinoDSL.g:660:2: ( ruleDelta )
                    // InternalArduinoDSL.g:661:3: ruleDelta
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
                    // InternalArduinoDSL.g:666:2: ( ( rule__Value__Group_3__0 ) )
                    {
                    // InternalArduinoDSL.g:666:2: ( ( rule__Value__Group_3__0 ) )
                    // InternalArduinoDSL.g:667:3: ( rule__Value__Group_3__0 )
                    {
                     before(grammarAccess.getValueAccess().getGroup_3()); 
                    // InternalArduinoDSL.g:668:3: ( rule__Value__Group_3__0 )
                    // InternalArduinoDSL.g:668:4: rule__Value__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Value__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getValueAccess().getGroup_3()); 

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


    // $ANTLR start "rule__Rule__Group__0"
    // InternalArduinoDSL.g:676:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:680:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // InternalArduinoDSL.g:681:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
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
    // InternalArduinoDSL.g:688:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__TypeAssignment_0 ) ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:692:1: ( ( ( rule__Rule__TypeAssignment_0 ) ) )
            // InternalArduinoDSL.g:693:1: ( ( rule__Rule__TypeAssignment_0 ) )
            {
            // InternalArduinoDSL.g:693:1: ( ( rule__Rule__TypeAssignment_0 ) )
            // InternalArduinoDSL.g:694:2: ( rule__Rule__TypeAssignment_0 )
            {
             before(grammarAccess.getRuleAccess().getTypeAssignment_0()); 
            // InternalArduinoDSL.g:695:2: ( rule__Rule__TypeAssignment_0 )
            // InternalArduinoDSL.g:695:3: rule__Rule__TypeAssignment_0
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
    // InternalArduinoDSL.g:703:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:707:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // InternalArduinoDSL.g:708:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
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
    // InternalArduinoDSL.g:715:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__ConditionAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:719:1: ( ( ( rule__Rule__ConditionAssignment_1 ) ) )
            // InternalArduinoDSL.g:720:1: ( ( rule__Rule__ConditionAssignment_1 ) )
            {
            // InternalArduinoDSL.g:720:1: ( ( rule__Rule__ConditionAssignment_1 ) )
            // InternalArduinoDSL.g:721:2: ( rule__Rule__ConditionAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getConditionAssignment_1()); 
            // InternalArduinoDSL.g:722:2: ( rule__Rule__ConditionAssignment_1 )
            // InternalArduinoDSL.g:722:3: rule__Rule__ConditionAssignment_1
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
    // InternalArduinoDSL.g:730:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:734:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // InternalArduinoDSL.g:735:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
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
    // InternalArduinoDSL.g:742:1: rule__Rule__Group__2__Impl : ( '{' ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:746:1: ( ( '{' ) )
            // InternalArduinoDSL.g:747:1: ( '{' )
            {
            // InternalArduinoDSL.g:747:1: ( '{' )
            // InternalArduinoDSL.g:748:2: '{'
            {
             before(grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalArduinoDSL.g:757:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:761:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // InternalArduinoDSL.g:762:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
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
    // InternalArduinoDSL.g:769:1: rule__Rule__Group__3__Impl : ( ( rule__Rule__BodyAssignment_3 ) ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:773:1: ( ( ( rule__Rule__BodyAssignment_3 ) ) )
            // InternalArduinoDSL.g:774:1: ( ( rule__Rule__BodyAssignment_3 ) )
            {
            // InternalArduinoDSL.g:774:1: ( ( rule__Rule__BodyAssignment_3 ) )
            // InternalArduinoDSL.g:775:2: ( rule__Rule__BodyAssignment_3 )
            {
             before(grammarAccess.getRuleAccess().getBodyAssignment_3()); 
            // InternalArduinoDSL.g:776:2: ( rule__Rule__BodyAssignment_3 )
            // InternalArduinoDSL.g:776:3: rule__Rule__BodyAssignment_3
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
    // InternalArduinoDSL.g:784:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:788:1: ( rule__Rule__Group__4__Impl )
            // InternalArduinoDSL.g:789:2: rule__Rule__Group__4__Impl
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
    // InternalArduinoDSL.g:795:1: rule__Rule__Group__4__Impl : ( '}' ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:799:1: ( ( '}' ) )
            // InternalArduinoDSL.g:800:1: ( '}' )
            {
            // InternalArduinoDSL.g:800:1: ( '}' )
            // InternalArduinoDSL.g:801:2: '}'
            {
             before(grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
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
    // InternalArduinoDSL.g:811:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:815:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalArduinoDSL.g:816:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
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
    // InternalArduinoDSL.g:823:1: rule__Condition__Group__0__Impl : ( ( rule__Condition__LeftAssignment_0 ) ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:827:1: ( ( ( rule__Condition__LeftAssignment_0 ) ) )
            // InternalArduinoDSL.g:828:1: ( ( rule__Condition__LeftAssignment_0 ) )
            {
            // InternalArduinoDSL.g:828:1: ( ( rule__Condition__LeftAssignment_0 ) )
            // InternalArduinoDSL.g:829:2: ( rule__Condition__LeftAssignment_0 )
            {
             before(grammarAccess.getConditionAccess().getLeftAssignment_0()); 
            // InternalArduinoDSL.g:830:2: ( rule__Condition__LeftAssignment_0 )
            // InternalArduinoDSL.g:830:3: rule__Condition__LeftAssignment_0
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
    // InternalArduinoDSL.g:838:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl rule__Condition__Group__2 ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:842:1: ( rule__Condition__Group__1__Impl rule__Condition__Group__2 )
            // InternalArduinoDSL.g:843:2: rule__Condition__Group__1__Impl rule__Condition__Group__2
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
    // InternalArduinoDSL.g:850:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__OperatorAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:854:1: ( ( ( rule__Condition__OperatorAssignment_1 ) ) )
            // InternalArduinoDSL.g:855:1: ( ( rule__Condition__OperatorAssignment_1 ) )
            {
            // InternalArduinoDSL.g:855:1: ( ( rule__Condition__OperatorAssignment_1 ) )
            // InternalArduinoDSL.g:856:2: ( rule__Condition__OperatorAssignment_1 )
            {
             before(grammarAccess.getConditionAccess().getOperatorAssignment_1()); 
            // InternalArduinoDSL.g:857:2: ( rule__Condition__OperatorAssignment_1 )
            // InternalArduinoDSL.g:857:3: rule__Condition__OperatorAssignment_1
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
    // InternalArduinoDSL.g:865:1: rule__Condition__Group__2 : rule__Condition__Group__2__Impl ;
    public final void rule__Condition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:869:1: ( rule__Condition__Group__2__Impl )
            // InternalArduinoDSL.g:870:2: rule__Condition__Group__2__Impl
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
    // InternalArduinoDSL.g:876:1: rule__Condition__Group__2__Impl : ( ( rule__Condition__RightAssignment_2 ) ) ;
    public final void rule__Condition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:880:1: ( ( ( rule__Condition__RightAssignment_2 ) ) )
            // InternalArduinoDSL.g:881:1: ( ( rule__Condition__RightAssignment_2 ) )
            {
            // InternalArduinoDSL.g:881:1: ( ( rule__Condition__RightAssignment_2 ) )
            // InternalArduinoDSL.g:882:2: ( rule__Condition__RightAssignment_2 )
            {
             before(grammarAccess.getConditionAccess().getRightAssignment_2()); 
            // InternalArduinoDSL.g:883:2: ( rule__Condition__RightAssignment_2 )
            // InternalArduinoDSL.g:883:3: rule__Condition__RightAssignment_2
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
    // InternalArduinoDSL.g:892:1: rule__Exp__Group__0 : rule__Exp__Group__0__Impl rule__Exp__Group__1 ;
    public final void rule__Exp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:896:1: ( rule__Exp__Group__0__Impl rule__Exp__Group__1 )
            // InternalArduinoDSL.g:897:2: rule__Exp__Group__0__Impl rule__Exp__Group__1
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
    // InternalArduinoDSL.g:904:1: rule__Exp__Group__0__Impl : ( ruleFactor ) ;
    public final void rule__Exp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:908:1: ( ( ruleFactor ) )
            // InternalArduinoDSL.g:909:1: ( ruleFactor )
            {
            // InternalArduinoDSL.g:909:1: ( ruleFactor )
            // InternalArduinoDSL.g:910:2: ruleFactor
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
    // InternalArduinoDSL.g:919:1: rule__Exp__Group__1 : rule__Exp__Group__1__Impl ;
    public final void rule__Exp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:923:1: ( rule__Exp__Group__1__Impl )
            // InternalArduinoDSL.g:924:2: rule__Exp__Group__1__Impl
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
    // InternalArduinoDSL.g:930:1: rule__Exp__Group__1__Impl : ( ( rule__Exp__Group_1__0 )* ) ;
    public final void rule__Exp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:934:1: ( ( ( rule__Exp__Group_1__0 )* ) )
            // InternalArduinoDSL.g:935:1: ( ( rule__Exp__Group_1__0 )* )
            {
            // InternalArduinoDSL.g:935:1: ( ( rule__Exp__Group_1__0 )* )
            // InternalArduinoDSL.g:936:2: ( rule__Exp__Group_1__0 )*
            {
             before(grammarAccess.getExpAccess().getGroup_1()); 
            // InternalArduinoDSL.g:937:2: ( rule__Exp__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=19 && LA8_0<=20)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalArduinoDSL.g:937:3: rule__Exp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Exp__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
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
    // InternalArduinoDSL.g:946:1: rule__Exp__Group_1__0 : rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1 ;
    public final void rule__Exp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:950:1: ( rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1 )
            // InternalArduinoDSL.g:951:2: rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1
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
    // InternalArduinoDSL.g:958:1: rule__Exp__Group_1__0__Impl : ( () ) ;
    public final void rule__Exp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:962:1: ( ( () ) )
            // InternalArduinoDSL.g:963:1: ( () )
            {
            // InternalArduinoDSL.g:963:1: ( () )
            // InternalArduinoDSL.g:964:2: ()
            {
             before(grammarAccess.getExpAccess().getExpLeftAction_1_0()); 
            // InternalArduinoDSL.g:965:2: ()
            // InternalArduinoDSL.g:965:3: 
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
    // InternalArduinoDSL.g:973:1: rule__Exp__Group_1__1 : rule__Exp__Group_1__1__Impl rule__Exp__Group_1__2 ;
    public final void rule__Exp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:977:1: ( rule__Exp__Group_1__1__Impl rule__Exp__Group_1__2 )
            // InternalArduinoDSL.g:978:2: rule__Exp__Group_1__1__Impl rule__Exp__Group_1__2
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
    // InternalArduinoDSL.g:985:1: rule__Exp__Group_1__1__Impl : ( ( rule__Exp__OperatorAssignment_1_1 ) ) ;
    public final void rule__Exp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:989:1: ( ( ( rule__Exp__OperatorAssignment_1_1 ) ) )
            // InternalArduinoDSL.g:990:1: ( ( rule__Exp__OperatorAssignment_1_1 ) )
            {
            // InternalArduinoDSL.g:990:1: ( ( rule__Exp__OperatorAssignment_1_1 ) )
            // InternalArduinoDSL.g:991:2: ( rule__Exp__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getExpAccess().getOperatorAssignment_1_1()); 
            // InternalArduinoDSL.g:992:2: ( rule__Exp__OperatorAssignment_1_1 )
            // InternalArduinoDSL.g:992:3: rule__Exp__OperatorAssignment_1_1
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
    // InternalArduinoDSL.g:1000:1: rule__Exp__Group_1__2 : rule__Exp__Group_1__2__Impl ;
    public final void rule__Exp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1004:1: ( rule__Exp__Group_1__2__Impl )
            // InternalArduinoDSL.g:1005:2: rule__Exp__Group_1__2__Impl
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
    // InternalArduinoDSL.g:1011:1: rule__Exp__Group_1__2__Impl : ( ( rule__Exp__RightAssignment_1_2 ) ) ;
    public final void rule__Exp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1015:1: ( ( ( rule__Exp__RightAssignment_1_2 ) ) )
            // InternalArduinoDSL.g:1016:1: ( ( rule__Exp__RightAssignment_1_2 ) )
            {
            // InternalArduinoDSL.g:1016:1: ( ( rule__Exp__RightAssignment_1_2 ) )
            // InternalArduinoDSL.g:1017:2: ( rule__Exp__RightAssignment_1_2 )
            {
             before(grammarAccess.getExpAccess().getRightAssignment_1_2()); 
            // InternalArduinoDSL.g:1018:2: ( rule__Exp__RightAssignment_1_2 )
            // InternalArduinoDSL.g:1018:3: rule__Exp__RightAssignment_1_2
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
    // InternalArduinoDSL.g:1027:1: rule__Factor__Group__0 : rule__Factor__Group__0__Impl rule__Factor__Group__1 ;
    public final void rule__Factor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1031:1: ( rule__Factor__Group__0__Impl rule__Factor__Group__1 )
            // InternalArduinoDSL.g:1032:2: rule__Factor__Group__0__Impl rule__Factor__Group__1
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
    // InternalArduinoDSL.g:1039:1: rule__Factor__Group__0__Impl : ( ruleValue ) ;
    public final void rule__Factor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1043:1: ( ( ruleValue ) )
            // InternalArduinoDSL.g:1044:1: ( ruleValue )
            {
            // InternalArduinoDSL.g:1044:1: ( ruleValue )
            // InternalArduinoDSL.g:1045:2: ruleValue
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
    // InternalArduinoDSL.g:1054:1: rule__Factor__Group__1 : rule__Factor__Group__1__Impl ;
    public final void rule__Factor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1058:1: ( rule__Factor__Group__1__Impl )
            // InternalArduinoDSL.g:1059:2: rule__Factor__Group__1__Impl
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
    // InternalArduinoDSL.g:1065:1: rule__Factor__Group__1__Impl : ( ( rule__Factor__Group_1__0 )* ) ;
    public final void rule__Factor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1069:1: ( ( ( rule__Factor__Group_1__0 )* ) )
            // InternalArduinoDSL.g:1070:1: ( ( rule__Factor__Group_1__0 )* )
            {
            // InternalArduinoDSL.g:1070:1: ( ( rule__Factor__Group_1__0 )* )
            // InternalArduinoDSL.g:1071:2: ( rule__Factor__Group_1__0 )*
            {
             before(grammarAccess.getFactorAccess().getGroup_1()); 
            // InternalArduinoDSL.g:1072:2: ( rule__Factor__Group_1__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=21 && LA9_0<=22)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalArduinoDSL.g:1072:3: rule__Factor__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Factor__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // InternalArduinoDSL.g:1081:1: rule__Factor__Group_1__0 : rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 ;
    public final void rule__Factor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1085:1: ( rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 )
            // InternalArduinoDSL.g:1086:2: rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1
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
    // InternalArduinoDSL.g:1093:1: rule__Factor__Group_1__0__Impl : ( () ) ;
    public final void rule__Factor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1097:1: ( ( () ) )
            // InternalArduinoDSL.g:1098:1: ( () )
            {
            // InternalArduinoDSL.g:1098:1: ( () )
            // InternalArduinoDSL.g:1099:2: ()
            {
             before(grammarAccess.getFactorAccess().getFactorLeftAction_1_0()); 
            // InternalArduinoDSL.g:1100:2: ()
            // InternalArduinoDSL.g:1100:3: 
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
    // InternalArduinoDSL.g:1108:1: rule__Factor__Group_1__1 : rule__Factor__Group_1__1__Impl rule__Factor__Group_1__2 ;
    public final void rule__Factor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1112:1: ( rule__Factor__Group_1__1__Impl rule__Factor__Group_1__2 )
            // InternalArduinoDSL.g:1113:2: rule__Factor__Group_1__1__Impl rule__Factor__Group_1__2
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
    // InternalArduinoDSL.g:1120:1: rule__Factor__Group_1__1__Impl : ( ( rule__Factor__OperatorAssignment_1_1 ) ) ;
    public final void rule__Factor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1124:1: ( ( ( rule__Factor__OperatorAssignment_1_1 ) ) )
            // InternalArduinoDSL.g:1125:1: ( ( rule__Factor__OperatorAssignment_1_1 ) )
            {
            // InternalArduinoDSL.g:1125:1: ( ( rule__Factor__OperatorAssignment_1_1 ) )
            // InternalArduinoDSL.g:1126:2: ( rule__Factor__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getFactorAccess().getOperatorAssignment_1_1()); 
            // InternalArduinoDSL.g:1127:2: ( rule__Factor__OperatorAssignment_1_1 )
            // InternalArduinoDSL.g:1127:3: rule__Factor__OperatorAssignment_1_1
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
    // InternalArduinoDSL.g:1135:1: rule__Factor__Group_1__2 : rule__Factor__Group_1__2__Impl ;
    public final void rule__Factor__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1139:1: ( rule__Factor__Group_1__2__Impl )
            // InternalArduinoDSL.g:1140:2: rule__Factor__Group_1__2__Impl
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
    // InternalArduinoDSL.g:1146:1: rule__Factor__Group_1__2__Impl : ( ( rule__Factor__RightAssignment_1_2 ) ) ;
    public final void rule__Factor__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1150:1: ( ( ( rule__Factor__RightAssignment_1_2 ) ) )
            // InternalArduinoDSL.g:1151:1: ( ( rule__Factor__RightAssignment_1_2 ) )
            {
            // InternalArduinoDSL.g:1151:1: ( ( rule__Factor__RightAssignment_1_2 ) )
            // InternalArduinoDSL.g:1152:2: ( rule__Factor__RightAssignment_1_2 )
            {
             before(grammarAccess.getFactorAccess().getRightAssignment_1_2()); 
            // InternalArduinoDSL.g:1153:2: ( rule__Factor__RightAssignment_1_2 )
            // InternalArduinoDSL.g:1153:3: rule__Factor__RightAssignment_1_2
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
    // InternalArduinoDSL.g:1162:1: rule__ExpWeakOp__Group_0__0 : rule__ExpWeakOp__Group_0__0__Impl rule__ExpWeakOp__Group_0__1 ;
    public final void rule__ExpWeakOp__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1166:1: ( rule__ExpWeakOp__Group_0__0__Impl rule__ExpWeakOp__Group_0__1 )
            // InternalArduinoDSL.g:1167:2: rule__ExpWeakOp__Group_0__0__Impl rule__ExpWeakOp__Group_0__1
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
    // InternalArduinoDSL.g:1174:1: rule__ExpWeakOp__Group_0__0__Impl : ( () ) ;
    public final void rule__ExpWeakOp__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1178:1: ( ( () ) )
            // InternalArduinoDSL.g:1179:1: ( () )
            {
            // InternalArduinoDSL.g:1179:1: ( () )
            // InternalArduinoDSL.g:1180:2: ()
            {
             before(grammarAccess.getExpWeakOpAccess().getPlusAction_0_0()); 
            // InternalArduinoDSL.g:1181:2: ()
            // InternalArduinoDSL.g:1181:3: 
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
    // InternalArduinoDSL.g:1189:1: rule__ExpWeakOp__Group_0__1 : rule__ExpWeakOp__Group_0__1__Impl ;
    public final void rule__ExpWeakOp__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1193:1: ( rule__ExpWeakOp__Group_0__1__Impl )
            // InternalArduinoDSL.g:1194:2: rule__ExpWeakOp__Group_0__1__Impl
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
    // InternalArduinoDSL.g:1200:1: rule__ExpWeakOp__Group_0__1__Impl : ( '+' ) ;
    public final void rule__ExpWeakOp__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1204:1: ( ( '+' ) )
            // InternalArduinoDSL.g:1205:1: ( '+' )
            {
            // InternalArduinoDSL.g:1205:1: ( '+' )
            // InternalArduinoDSL.g:1206:2: '+'
            {
             before(grammarAccess.getExpWeakOpAccess().getPlusSignKeyword_0_1()); 
            match(input,19,FOLLOW_2); 
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
    // InternalArduinoDSL.g:1216:1: rule__ExpWeakOp__Group_1__0 : rule__ExpWeakOp__Group_1__0__Impl rule__ExpWeakOp__Group_1__1 ;
    public final void rule__ExpWeakOp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1220:1: ( rule__ExpWeakOp__Group_1__0__Impl rule__ExpWeakOp__Group_1__1 )
            // InternalArduinoDSL.g:1221:2: rule__ExpWeakOp__Group_1__0__Impl rule__ExpWeakOp__Group_1__1
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
    // InternalArduinoDSL.g:1228:1: rule__ExpWeakOp__Group_1__0__Impl : ( () ) ;
    public final void rule__ExpWeakOp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1232:1: ( ( () ) )
            // InternalArduinoDSL.g:1233:1: ( () )
            {
            // InternalArduinoDSL.g:1233:1: ( () )
            // InternalArduinoDSL.g:1234:2: ()
            {
             before(grammarAccess.getExpWeakOpAccess().getMinusAction_1_0()); 
            // InternalArduinoDSL.g:1235:2: ()
            // InternalArduinoDSL.g:1235:3: 
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
    // InternalArduinoDSL.g:1243:1: rule__ExpWeakOp__Group_1__1 : rule__ExpWeakOp__Group_1__1__Impl ;
    public final void rule__ExpWeakOp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1247:1: ( rule__ExpWeakOp__Group_1__1__Impl )
            // InternalArduinoDSL.g:1248:2: rule__ExpWeakOp__Group_1__1__Impl
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
    // InternalArduinoDSL.g:1254:1: rule__ExpWeakOp__Group_1__1__Impl : ( '-' ) ;
    public final void rule__ExpWeakOp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1258:1: ( ( '-' ) )
            // InternalArduinoDSL.g:1259:1: ( '-' )
            {
            // InternalArduinoDSL.g:1259:1: ( '-' )
            // InternalArduinoDSL.g:1260:2: '-'
            {
             before(grammarAccess.getExpWeakOpAccess().getHyphenMinusKeyword_1_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalArduinoDSL.g:1270:1: rule__ExpStrongOp__Group_0__0 : rule__ExpStrongOp__Group_0__0__Impl rule__ExpStrongOp__Group_0__1 ;
    public final void rule__ExpStrongOp__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1274:1: ( rule__ExpStrongOp__Group_0__0__Impl rule__ExpStrongOp__Group_0__1 )
            // InternalArduinoDSL.g:1275:2: rule__ExpStrongOp__Group_0__0__Impl rule__ExpStrongOp__Group_0__1
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
    // InternalArduinoDSL.g:1282:1: rule__ExpStrongOp__Group_0__0__Impl : ( () ) ;
    public final void rule__ExpStrongOp__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1286:1: ( ( () ) )
            // InternalArduinoDSL.g:1287:1: ( () )
            {
            // InternalArduinoDSL.g:1287:1: ( () )
            // InternalArduinoDSL.g:1288:2: ()
            {
             before(grammarAccess.getExpStrongOpAccess().getMultAction_0_0()); 
            // InternalArduinoDSL.g:1289:2: ()
            // InternalArduinoDSL.g:1289:3: 
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
    // InternalArduinoDSL.g:1297:1: rule__ExpStrongOp__Group_0__1 : rule__ExpStrongOp__Group_0__1__Impl ;
    public final void rule__ExpStrongOp__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1301:1: ( rule__ExpStrongOp__Group_0__1__Impl )
            // InternalArduinoDSL.g:1302:2: rule__ExpStrongOp__Group_0__1__Impl
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
    // InternalArduinoDSL.g:1308:1: rule__ExpStrongOp__Group_0__1__Impl : ( '*' ) ;
    public final void rule__ExpStrongOp__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1312:1: ( ( '*' ) )
            // InternalArduinoDSL.g:1313:1: ( '*' )
            {
            // InternalArduinoDSL.g:1313:1: ( '*' )
            // InternalArduinoDSL.g:1314:2: '*'
            {
             before(grammarAccess.getExpStrongOpAccess().getAsteriskKeyword_0_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalArduinoDSL.g:1324:1: rule__ExpStrongOp__Group_1__0 : rule__ExpStrongOp__Group_1__0__Impl rule__ExpStrongOp__Group_1__1 ;
    public final void rule__ExpStrongOp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1328:1: ( rule__ExpStrongOp__Group_1__0__Impl rule__ExpStrongOp__Group_1__1 )
            // InternalArduinoDSL.g:1329:2: rule__ExpStrongOp__Group_1__0__Impl rule__ExpStrongOp__Group_1__1
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
    // InternalArduinoDSL.g:1336:1: rule__ExpStrongOp__Group_1__0__Impl : ( () ) ;
    public final void rule__ExpStrongOp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1340:1: ( ( () ) )
            // InternalArduinoDSL.g:1341:1: ( () )
            {
            // InternalArduinoDSL.g:1341:1: ( () )
            // InternalArduinoDSL.g:1342:2: ()
            {
             before(grammarAccess.getExpStrongOpAccess().getDivAction_1_0()); 
            // InternalArduinoDSL.g:1343:2: ()
            // InternalArduinoDSL.g:1343:3: 
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
    // InternalArduinoDSL.g:1351:1: rule__ExpStrongOp__Group_1__1 : rule__ExpStrongOp__Group_1__1__Impl ;
    public final void rule__ExpStrongOp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1355:1: ( rule__ExpStrongOp__Group_1__1__Impl )
            // InternalArduinoDSL.g:1356:2: rule__ExpStrongOp__Group_1__1__Impl
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
    // InternalArduinoDSL.g:1362:1: rule__ExpStrongOp__Group_1__1__Impl : ( '/' ) ;
    public final void rule__ExpStrongOp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1366:1: ( ( '/' ) )
            // InternalArduinoDSL.g:1367:1: ( '/' )
            {
            // InternalArduinoDSL.g:1367:1: ( '/' )
            // InternalArduinoDSL.g:1368:2: '/'
            {
             before(grammarAccess.getExpStrongOpAccess().getSolidusKeyword_1_1()); 
            match(input,22,FOLLOW_2); 
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


    // $ANTLR start "rule__Value__Group_0__0"
    // InternalArduinoDSL.g:1378:1: rule__Value__Group_0__0 : rule__Value__Group_0__0__Impl rule__Value__Group_0__1 ;
    public final void rule__Value__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1382:1: ( rule__Value__Group_0__0__Impl rule__Value__Group_0__1 )
            // InternalArduinoDSL.g:1383:2: rule__Value__Group_0__0__Impl rule__Value__Group_0__1
            {
            pushFollow(FOLLOW_16);
            rule__Value__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_0__1();

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
    // $ANTLR end "rule__Value__Group_0__0"


    // $ANTLR start "rule__Value__Group_0__0__Impl"
    // InternalArduinoDSL.g:1390:1: rule__Value__Group_0__0__Impl : ( () ) ;
    public final void rule__Value__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1394:1: ( ( () ) )
            // InternalArduinoDSL.g:1395:1: ( () )
            {
            // InternalArduinoDSL.g:1395:1: ( () )
            // InternalArduinoDSL.g:1396:2: ()
            {
             before(grammarAccess.getValueAccess().getValueAction_0_0()); 
            // InternalArduinoDSL.g:1397:2: ()
            // InternalArduinoDSL.g:1397:3: 
            {
            }

             after(grammarAccess.getValueAccess().getValueAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_0__0__Impl"


    // $ANTLR start "rule__Value__Group_0__1"
    // InternalArduinoDSL.g:1405:1: rule__Value__Group_0__1 : rule__Value__Group_0__1__Impl ;
    public final void rule__Value__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1409:1: ( rule__Value__Group_0__1__Impl )
            // InternalArduinoDSL.g:1410:2: rule__Value__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group_0__1__Impl();

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
    // $ANTLR end "rule__Value__Group_0__1"


    // $ANTLR start "rule__Value__Group_0__1__Impl"
    // InternalArduinoDSL.g:1416:1: rule__Value__Group_0__1__Impl : ( ruleNUMBER ) ;
    public final void rule__Value__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1420:1: ( ( ruleNUMBER ) )
            // InternalArduinoDSL.g:1421:1: ( ruleNUMBER )
            {
            // InternalArduinoDSL.g:1421:1: ( ruleNUMBER )
            // InternalArduinoDSL.g:1422:2: ruleNUMBER
            {
             before(grammarAccess.getValueAccess().getNUMBERParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleNUMBER();

            state._fsp--;

             after(grammarAccess.getValueAccess().getNUMBERParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_0__1__Impl"


    // $ANTLR start "rule__Value__Group_3__0"
    // InternalArduinoDSL.g:1432:1: rule__Value__Group_3__0 : rule__Value__Group_3__0__Impl rule__Value__Group_3__1 ;
    public final void rule__Value__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1436:1: ( rule__Value__Group_3__0__Impl rule__Value__Group_3__1 )
            // InternalArduinoDSL.g:1437:2: rule__Value__Group_3__0__Impl rule__Value__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Value__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Value__Group_3__1();

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
    // $ANTLR end "rule__Value__Group_3__0"


    // $ANTLR start "rule__Value__Group_3__0__Impl"
    // InternalArduinoDSL.g:1444:1: rule__Value__Group_3__0__Impl : ( () ) ;
    public final void rule__Value__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1448:1: ( ( () ) )
            // InternalArduinoDSL.g:1449:1: ( () )
            {
            // InternalArduinoDSL.g:1449:1: ( () )
            // InternalArduinoDSL.g:1450:2: ()
            {
             before(grammarAccess.getValueAccess().getValueAction_3_0()); 
            // InternalArduinoDSL.g:1451:2: ()
            // InternalArduinoDSL.g:1451:3: 
            {
            }

             after(grammarAccess.getValueAccess().getValueAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_3__0__Impl"


    // $ANTLR start "rule__Value__Group_3__1"
    // InternalArduinoDSL.g:1459:1: rule__Value__Group_3__1 : rule__Value__Group_3__1__Impl ;
    public final void rule__Value__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1463:1: ( rule__Value__Group_3__1__Impl )
            // InternalArduinoDSL.g:1464:2: rule__Value__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Value__Group_3__1__Impl();

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
    // $ANTLR end "rule__Value__Group_3__1"


    // $ANTLR start "rule__Value__Group_3__1__Impl"
    // InternalArduinoDSL.g:1470:1: rule__Value__Group_3__1__Impl : ( RULE_STATE ) ;
    public final void rule__Value__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1474:1: ( ( RULE_STATE ) )
            // InternalArduinoDSL.g:1475:1: ( RULE_STATE )
            {
            // InternalArduinoDSL.g:1475:1: ( RULE_STATE )
            // InternalArduinoDSL.g:1476:2: RULE_STATE
            {
             before(grammarAccess.getValueAccess().getSTATETerminalRuleCall_3_1()); 
            match(input,RULE_STATE,FOLLOW_2); 
             after(grammarAccess.getValueAccess().getSTATETerminalRuleCall_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Group_3__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalArduinoDSL.g:1486:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1490:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalArduinoDSL.g:1491:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalArduinoDSL.g:1498:1: rule__Attribute__Group__0__Impl : ( ( rule__Attribute__NameAssignment_0 ) ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1502:1: ( ( ( rule__Attribute__NameAssignment_0 ) ) )
            // InternalArduinoDSL.g:1503:1: ( ( rule__Attribute__NameAssignment_0 ) )
            {
            // InternalArduinoDSL.g:1503:1: ( ( rule__Attribute__NameAssignment_0 ) )
            // InternalArduinoDSL.g:1504:2: ( rule__Attribute__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_0()); 
            // InternalArduinoDSL.g:1505:2: ( rule__Attribute__NameAssignment_0 )
            // InternalArduinoDSL.g:1505:3: rule__Attribute__NameAssignment_0
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
    // InternalArduinoDSL.g:1513:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1517:1: ( rule__Attribute__Group__1__Impl )
            // InternalArduinoDSL.g:1518:2: rule__Attribute__Group__1__Impl
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
    // InternalArduinoDSL.g:1524:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__ComponentAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1528:1: ( ( ( rule__Attribute__ComponentAssignment_1 ) ) )
            // InternalArduinoDSL.g:1529:1: ( ( rule__Attribute__ComponentAssignment_1 ) )
            {
            // InternalArduinoDSL.g:1529:1: ( ( rule__Attribute__ComponentAssignment_1 ) )
            // InternalArduinoDSL.g:1530:2: ( rule__Attribute__ComponentAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getComponentAssignment_1()); 
            // InternalArduinoDSL.g:1531:2: ( rule__Attribute__ComponentAssignment_1 )
            // InternalArduinoDSL.g:1531:3: rule__Attribute__ComponentAssignment_1
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
    // InternalArduinoDSL.g:1540:1: rule__Delta__Group__0 : rule__Delta__Group__0__Impl rule__Delta__Group__1 ;
    public final void rule__Delta__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1544:1: ( rule__Delta__Group__0__Impl rule__Delta__Group__1 )
            // InternalArduinoDSL.g:1545:2: rule__Delta__Group__0__Impl rule__Delta__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalArduinoDSL.g:1552:1: rule__Delta__Group__0__Impl : ( ruleAttribute ) ;
    public final void rule__Delta__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1556:1: ( ( ruleAttribute ) )
            // InternalArduinoDSL.g:1557:1: ( ruleAttribute )
            {
            // InternalArduinoDSL.g:1557:1: ( ruleAttribute )
            // InternalArduinoDSL.g:1558:2: ruleAttribute
            {
             before(grammarAccess.getDeltaAccess().getAttributeParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getDeltaAccess().getAttributeParserRuleCall_0()); 

            }


            }

        }
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
    // InternalArduinoDSL.g:1567:1: rule__Delta__Group__1 : rule__Delta__Group__1__Impl ;
    public final void rule__Delta__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1571:1: ( rule__Delta__Group__1__Impl )
            // InternalArduinoDSL.g:1572:2: rule__Delta__Group__1__Impl
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
    // InternalArduinoDSL.g:1578:1: rule__Delta__Group__1__Impl : ( 'delta' ) ;
    public final void rule__Delta__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1582:1: ( ( 'delta' ) )
            // InternalArduinoDSL.g:1583:1: ( 'delta' )
            {
            // InternalArduinoDSL.g:1583:1: ( 'delta' )
            // InternalArduinoDSL.g:1584:2: 'delta'
            {
             before(grammarAccess.getDeltaAccess().getDeltaKeyword_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalArduinoDSL.g:1594:1: rule__NUMBER__Group__0 : rule__NUMBER__Group__0__Impl rule__NUMBER__Group__1 ;
    public final void rule__NUMBER__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1598:1: ( rule__NUMBER__Group__0__Impl rule__NUMBER__Group__1 )
            // InternalArduinoDSL.g:1599:2: rule__NUMBER__Group__0__Impl rule__NUMBER__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalArduinoDSL.g:1606:1: rule__NUMBER__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__NUMBER__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1610:1: ( ( RULE_INT ) )
            // InternalArduinoDSL.g:1611:1: ( RULE_INT )
            {
            // InternalArduinoDSL.g:1611:1: ( RULE_INT )
            // InternalArduinoDSL.g:1612:2: RULE_INT
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
    // InternalArduinoDSL.g:1621:1: rule__NUMBER__Group__1 : rule__NUMBER__Group__1__Impl ;
    public final void rule__NUMBER__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1625:1: ( rule__NUMBER__Group__1__Impl )
            // InternalArduinoDSL.g:1626:2: rule__NUMBER__Group__1__Impl
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
    // InternalArduinoDSL.g:1632:1: rule__NUMBER__Group__1__Impl : ( ( rule__NUMBER__Group_1__0 )? ) ;
    public final void rule__NUMBER__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1636:1: ( ( ( rule__NUMBER__Group_1__0 )? ) )
            // InternalArduinoDSL.g:1637:1: ( ( rule__NUMBER__Group_1__0 )? )
            {
            // InternalArduinoDSL.g:1637:1: ( ( rule__NUMBER__Group_1__0 )? )
            // InternalArduinoDSL.g:1638:2: ( rule__NUMBER__Group_1__0 )?
            {
             before(grammarAccess.getNUMBERAccess().getGroup_1()); 
            // InternalArduinoDSL.g:1639:2: ( rule__NUMBER__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalArduinoDSL.g:1639:3: rule__NUMBER__Group_1__0
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
    // InternalArduinoDSL.g:1648:1: rule__NUMBER__Group_1__0 : rule__NUMBER__Group_1__0__Impl rule__NUMBER__Group_1__1 ;
    public final void rule__NUMBER__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1652:1: ( rule__NUMBER__Group_1__0__Impl rule__NUMBER__Group_1__1 )
            // InternalArduinoDSL.g:1653:2: rule__NUMBER__Group_1__0__Impl rule__NUMBER__Group_1__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalArduinoDSL.g:1660:1: rule__NUMBER__Group_1__0__Impl : ( '.' ) ;
    public final void rule__NUMBER__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1664:1: ( ( '.' ) )
            // InternalArduinoDSL.g:1665:1: ( '.' )
            {
            // InternalArduinoDSL.g:1665:1: ( '.' )
            // InternalArduinoDSL.g:1666:2: '.'
            {
             before(grammarAccess.getNUMBERAccess().getFullStopKeyword_1_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalArduinoDSL.g:1675:1: rule__NUMBER__Group_1__1 : rule__NUMBER__Group_1__1__Impl ;
    public final void rule__NUMBER__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1679:1: ( rule__NUMBER__Group_1__1__Impl )
            // InternalArduinoDSL.g:1680:2: rule__NUMBER__Group_1__1__Impl
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
    // InternalArduinoDSL.g:1686:1: rule__NUMBER__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__NUMBER__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1690:1: ( ( RULE_INT ) )
            // InternalArduinoDSL.g:1691:1: ( RULE_INT )
            {
            // InternalArduinoDSL.g:1691:1: ( RULE_INT )
            // InternalArduinoDSL.g:1692:2: RULE_INT
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
    // InternalArduinoDSL.g:1702:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1706:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // InternalArduinoDSL.g:1707:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
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
    // InternalArduinoDSL.g:1714:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__AttributeAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1718:1: ( ( ( rule__Assignment__AttributeAssignment_0 ) ) )
            // InternalArduinoDSL.g:1719:1: ( ( rule__Assignment__AttributeAssignment_0 ) )
            {
            // InternalArduinoDSL.g:1719:1: ( ( rule__Assignment__AttributeAssignment_0 ) )
            // InternalArduinoDSL.g:1720:2: ( rule__Assignment__AttributeAssignment_0 )
            {
             before(grammarAccess.getAssignmentAccess().getAttributeAssignment_0()); 
            // InternalArduinoDSL.g:1721:2: ( rule__Assignment__AttributeAssignment_0 )
            // InternalArduinoDSL.g:1721:3: rule__Assignment__AttributeAssignment_0
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
    // InternalArduinoDSL.g:1729:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1733:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // InternalArduinoDSL.g:1734:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
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
    // InternalArduinoDSL.g:1741:1: rule__Assignment__Group__1__Impl : ( '=' ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1745:1: ( ( '=' ) )
            // InternalArduinoDSL.g:1746:1: ( '=' )
            {
            // InternalArduinoDSL.g:1746:1: ( '=' )
            // InternalArduinoDSL.g:1747:2: '='
            {
             before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // InternalArduinoDSL.g:1756:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1760:1: ( rule__Assignment__Group__2__Impl )
            // InternalArduinoDSL.g:1761:2: rule__Assignment__Group__2__Impl
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
    // InternalArduinoDSL.g:1767:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ValueAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1771:1: ( ( ( rule__Assignment__ValueAssignment_2 ) ) )
            // InternalArduinoDSL.g:1772:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            {
            // InternalArduinoDSL.g:1772:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            // InternalArduinoDSL.g:1773:2: ( rule__Assignment__ValueAssignment_2 )
            {
             before(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            // InternalArduinoDSL.g:1774:2: ( rule__Assignment__ValueAssignment_2 )
            // InternalArduinoDSL.g:1774:3: rule__Assignment__ValueAssignment_2
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
    // InternalArduinoDSL.g:1783:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1787:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // InternalArduinoDSL.g:1788:2: rule__Node__Group__0__Impl rule__Node__Group__1
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
    // InternalArduinoDSL.g:1795:1: rule__Node__Group__0__Impl : ( ( rule__Node__NameAssignment_0 ) ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1799:1: ( ( ( rule__Node__NameAssignment_0 ) ) )
            // InternalArduinoDSL.g:1800:1: ( ( rule__Node__NameAssignment_0 ) )
            {
            // InternalArduinoDSL.g:1800:1: ( ( rule__Node__NameAssignment_0 ) )
            // InternalArduinoDSL.g:1801:2: ( rule__Node__NameAssignment_0 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_0()); 
            // InternalArduinoDSL.g:1802:2: ( rule__Node__NameAssignment_0 )
            // InternalArduinoDSL.g:1802:3: rule__Node__NameAssignment_0
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
    // InternalArduinoDSL.g:1810:1: rule__Node__Group__1 : rule__Node__Group__1__Impl rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1814:1: ( rule__Node__Group__1__Impl rule__Node__Group__2 )
            // InternalArduinoDSL.g:1815:2: rule__Node__Group__1__Impl rule__Node__Group__2
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
    // InternalArduinoDSL.g:1822:1: rule__Node__Group__1__Impl : ( '{' ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1826:1: ( ( '{' ) )
            // InternalArduinoDSL.g:1827:1: ( '{' )
            {
            // InternalArduinoDSL.g:1827:1: ( '{' )
            // InternalArduinoDSL.g:1828:2: '{'
            {
             before(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalArduinoDSL.g:1837:1: rule__Node__Group__2 : rule__Node__Group__2__Impl rule__Node__Group__3 ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1841:1: ( rule__Node__Group__2__Impl rule__Node__Group__3 )
            // InternalArduinoDSL.g:1842:2: rule__Node__Group__2__Impl rule__Node__Group__3
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
    // InternalArduinoDSL.g:1849:1: rule__Node__Group__2__Impl : ( ( ( rule__Node__ComponentsAssignment_2 ) ) ( ( rule__Node__ComponentsAssignment_2 )* ) ) ;
    public final void rule__Node__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1853:1: ( ( ( ( rule__Node__ComponentsAssignment_2 ) ) ( ( rule__Node__ComponentsAssignment_2 )* ) ) )
            // InternalArduinoDSL.g:1854:1: ( ( ( rule__Node__ComponentsAssignment_2 ) ) ( ( rule__Node__ComponentsAssignment_2 )* ) )
            {
            // InternalArduinoDSL.g:1854:1: ( ( ( rule__Node__ComponentsAssignment_2 ) ) ( ( rule__Node__ComponentsAssignment_2 )* ) )
            // InternalArduinoDSL.g:1855:2: ( ( rule__Node__ComponentsAssignment_2 ) ) ( ( rule__Node__ComponentsAssignment_2 )* )
            {
            // InternalArduinoDSL.g:1855:2: ( ( rule__Node__ComponentsAssignment_2 ) )
            // InternalArduinoDSL.g:1856:3: ( rule__Node__ComponentsAssignment_2 )
            {
             before(grammarAccess.getNodeAccess().getComponentsAssignment_2()); 
            // InternalArduinoDSL.g:1857:3: ( rule__Node__ComponentsAssignment_2 )
            // InternalArduinoDSL.g:1857:4: rule__Node__ComponentsAssignment_2
            {
            pushFollow(FOLLOW_4);
            rule__Node__ComponentsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNodeAccess().getComponentsAssignment_2()); 

            }

            // InternalArduinoDSL.g:1860:2: ( ( rule__Node__ComponentsAssignment_2 )* )
            // InternalArduinoDSL.g:1861:3: ( rule__Node__ComponentsAssignment_2 )*
            {
             before(grammarAccess.getNodeAccess().getComponentsAssignment_2()); 
            // InternalArduinoDSL.g:1862:3: ( rule__Node__ComponentsAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalArduinoDSL.g:1862:4: rule__Node__ComponentsAssignment_2
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Node__ComponentsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalArduinoDSL.g:1871:1: rule__Node__Group__3 : rule__Node__Group__3__Impl ;
    public final void rule__Node__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1875:1: ( rule__Node__Group__3__Impl )
            // InternalArduinoDSL.g:1876:2: rule__Node__Group__3__Impl
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
    // InternalArduinoDSL.g:1882:1: rule__Node__Group__3__Impl : ( '}' ) ;
    public final void rule__Node__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1886:1: ( ( '}' ) )
            // InternalArduinoDSL.g:1887:1: ( '}' )
            {
            // InternalArduinoDSL.g:1887:1: ( '}' )
            // InternalArduinoDSL.g:1888:2: '}'
            {
             before(grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
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
    // InternalArduinoDSL.g:1898:1: rule__Component__Group__0 : rule__Component__Group__0__Impl rule__Component__Group__1 ;
    public final void rule__Component__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1902:1: ( rule__Component__Group__0__Impl rule__Component__Group__1 )
            // InternalArduinoDSL.g:1903:2: rule__Component__Group__0__Impl rule__Component__Group__1
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
    // InternalArduinoDSL.g:1910:1: rule__Component__Group__0__Impl : ( ( rule__Component__NameAssignment_0 ) ) ;
    public final void rule__Component__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1914:1: ( ( ( rule__Component__NameAssignment_0 ) ) )
            // InternalArduinoDSL.g:1915:1: ( ( rule__Component__NameAssignment_0 ) )
            {
            // InternalArduinoDSL.g:1915:1: ( ( rule__Component__NameAssignment_0 ) )
            // InternalArduinoDSL.g:1916:2: ( rule__Component__NameAssignment_0 )
            {
             before(grammarAccess.getComponentAccess().getNameAssignment_0()); 
            // InternalArduinoDSL.g:1917:2: ( rule__Component__NameAssignment_0 )
            // InternalArduinoDSL.g:1917:3: rule__Component__NameAssignment_0
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
    // InternalArduinoDSL.g:1925:1: rule__Component__Group__1 : rule__Component__Group__1__Impl ;
    public final void rule__Component__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1929:1: ( rule__Component__Group__1__Impl )
            // InternalArduinoDSL.g:1930:2: rule__Component__Group__1__Impl
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
    // InternalArduinoDSL.g:1936:1: rule__Component__Group__1__Impl : ( ( rule__Component__PropertiesAssignment_1 ) ) ;
    public final void rule__Component__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1940:1: ( ( ( rule__Component__PropertiesAssignment_1 ) ) )
            // InternalArduinoDSL.g:1941:1: ( ( rule__Component__PropertiesAssignment_1 ) )
            {
            // InternalArduinoDSL.g:1941:1: ( ( rule__Component__PropertiesAssignment_1 ) )
            // InternalArduinoDSL.g:1942:2: ( rule__Component__PropertiesAssignment_1 )
            {
             before(grammarAccess.getComponentAccess().getPropertiesAssignment_1()); 
            // InternalArduinoDSL.g:1943:2: ( rule__Component__PropertiesAssignment_1 )
            // InternalArduinoDSL.g:1943:3: rule__Component__PropertiesAssignment_1
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
    // InternalArduinoDSL.g:1952:1: rule__ComponentBody__Group__0 : rule__ComponentBody__Group__0__Impl rule__ComponentBody__Group__1 ;
    public final void rule__ComponentBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1956:1: ( rule__ComponentBody__Group__0__Impl rule__ComponentBody__Group__1 )
            // InternalArduinoDSL.g:1957:2: rule__ComponentBody__Group__0__Impl rule__ComponentBody__Group__1
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
    // InternalArduinoDSL.g:1964:1: rule__ComponentBody__Group__0__Impl : ( ( rule__ComponentBody__IoAssignment_0 ) ) ;
    public final void rule__ComponentBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1968:1: ( ( ( rule__ComponentBody__IoAssignment_0 ) ) )
            // InternalArduinoDSL.g:1969:1: ( ( rule__ComponentBody__IoAssignment_0 ) )
            {
            // InternalArduinoDSL.g:1969:1: ( ( rule__ComponentBody__IoAssignment_0 ) )
            // InternalArduinoDSL.g:1970:2: ( rule__ComponentBody__IoAssignment_0 )
            {
             before(grammarAccess.getComponentBodyAccess().getIoAssignment_0()); 
            // InternalArduinoDSL.g:1971:2: ( rule__ComponentBody__IoAssignment_0 )
            // InternalArduinoDSL.g:1971:3: rule__ComponentBody__IoAssignment_0
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
    // InternalArduinoDSL.g:1979:1: rule__ComponentBody__Group__1 : rule__ComponentBody__Group__1__Impl rule__ComponentBody__Group__2 ;
    public final void rule__ComponentBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1983:1: ( rule__ComponentBody__Group__1__Impl rule__ComponentBody__Group__2 )
            // InternalArduinoDSL.g:1984:2: rule__ComponentBody__Group__1__Impl rule__ComponentBody__Group__2
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
    // InternalArduinoDSL.g:1991:1: rule__ComponentBody__Group__1__Impl : ( ( rule__ComponentBody__TypeAssignment_1 ) ) ;
    public final void rule__ComponentBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:1995:1: ( ( ( rule__ComponentBody__TypeAssignment_1 ) ) )
            // InternalArduinoDSL.g:1996:1: ( ( rule__ComponentBody__TypeAssignment_1 ) )
            {
            // InternalArduinoDSL.g:1996:1: ( ( rule__ComponentBody__TypeAssignment_1 ) )
            // InternalArduinoDSL.g:1997:2: ( rule__ComponentBody__TypeAssignment_1 )
            {
             before(grammarAccess.getComponentBodyAccess().getTypeAssignment_1()); 
            // InternalArduinoDSL.g:1998:2: ( rule__ComponentBody__TypeAssignment_1 )
            // InternalArduinoDSL.g:1998:3: rule__ComponentBody__TypeAssignment_1
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
    // InternalArduinoDSL.g:2006:1: rule__ComponentBody__Group__2 : rule__ComponentBody__Group__2__Impl rule__ComponentBody__Group__3 ;
    public final void rule__ComponentBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2010:1: ( rule__ComponentBody__Group__2__Impl rule__ComponentBody__Group__3 )
            // InternalArduinoDSL.g:2011:2: rule__ComponentBody__Group__2__Impl rule__ComponentBody__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalArduinoDSL.g:2018:1: rule__ComponentBody__Group__2__Impl : ( 'pin' ) ;
    public final void rule__ComponentBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2022:1: ( ( 'pin' ) )
            // InternalArduinoDSL.g:2023:1: ( 'pin' )
            {
            // InternalArduinoDSL.g:2023:1: ( 'pin' )
            // InternalArduinoDSL.g:2024:2: 'pin'
            {
             before(grammarAccess.getComponentBodyAccess().getPinKeyword_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalArduinoDSL.g:2033:1: rule__ComponentBody__Group__3 : rule__ComponentBody__Group__3__Impl rule__ComponentBody__Group__4 ;
    public final void rule__ComponentBody__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2037:1: ( rule__ComponentBody__Group__3__Impl rule__ComponentBody__Group__4 )
            // InternalArduinoDSL.g:2038:2: rule__ComponentBody__Group__3__Impl rule__ComponentBody__Group__4
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
    // InternalArduinoDSL.g:2045:1: rule__ComponentBody__Group__3__Impl : ( ( rule__ComponentBody__PinAssignment_3 ) ) ;
    public final void rule__ComponentBody__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2049:1: ( ( ( rule__ComponentBody__PinAssignment_3 ) ) )
            // InternalArduinoDSL.g:2050:1: ( ( rule__ComponentBody__PinAssignment_3 ) )
            {
            // InternalArduinoDSL.g:2050:1: ( ( rule__ComponentBody__PinAssignment_3 ) )
            // InternalArduinoDSL.g:2051:2: ( rule__ComponentBody__PinAssignment_3 )
            {
             before(grammarAccess.getComponentBodyAccess().getPinAssignment_3()); 
            // InternalArduinoDSL.g:2052:2: ( rule__ComponentBody__PinAssignment_3 )
            // InternalArduinoDSL.g:2052:3: rule__ComponentBody__PinAssignment_3
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
    // InternalArduinoDSL.g:2060:1: rule__ComponentBody__Group__4 : rule__ComponentBody__Group__4__Impl rule__ComponentBody__Group__5 ;
    public final void rule__ComponentBody__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2064:1: ( rule__ComponentBody__Group__4__Impl rule__ComponentBody__Group__5 )
            // InternalArduinoDSL.g:2065:2: rule__ComponentBody__Group__4__Impl rule__ComponentBody__Group__5
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
    // InternalArduinoDSL.g:2072:1: rule__ComponentBody__Group__4__Impl : ( ( rule__ComponentBody__MapAssignment_4 )? ) ;
    public final void rule__ComponentBody__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2076:1: ( ( ( rule__ComponentBody__MapAssignment_4 )? ) )
            // InternalArduinoDSL.g:2077:1: ( ( rule__ComponentBody__MapAssignment_4 )? )
            {
            // InternalArduinoDSL.g:2077:1: ( ( rule__ComponentBody__MapAssignment_4 )? )
            // InternalArduinoDSL.g:2078:2: ( rule__ComponentBody__MapAssignment_4 )?
            {
             before(grammarAccess.getComponentBodyAccess().getMapAssignment_4()); 
            // InternalArduinoDSL.g:2079:2: ( rule__ComponentBody__MapAssignment_4 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalArduinoDSL.g:2079:3: rule__ComponentBody__MapAssignment_4
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
    // InternalArduinoDSL.g:2087:1: rule__ComponentBody__Group__5 : rule__ComponentBody__Group__5__Impl rule__ComponentBody__Group__6 ;
    public final void rule__ComponentBody__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2091:1: ( rule__ComponentBody__Group__5__Impl rule__ComponentBody__Group__6 )
            // InternalArduinoDSL.g:2092:2: rule__ComponentBody__Group__5__Impl rule__ComponentBody__Group__6
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
    // InternalArduinoDSL.g:2099:1: rule__ComponentBody__Group__5__Impl : ( ( rule__ComponentBody__RateAssignment_5 )? ) ;
    public final void rule__ComponentBody__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2103:1: ( ( ( rule__ComponentBody__RateAssignment_5 )? ) )
            // InternalArduinoDSL.g:2104:1: ( ( rule__ComponentBody__RateAssignment_5 )? )
            {
            // InternalArduinoDSL.g:2104:1: ( ( rule__ComponentBody__RateAssignment_5 )? )
            // InternalArduinoDSL.g:2105:2: ( rule__ComponentBody__RateAssignment_5 )?
            {
             before(grammarAccess.getComponentBodyAccess().getRateAssignment_5()); 
            // InternalArduinoDSL.g:2106:2: ( rule__ComponentBody__RateAssignment_5 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalArduinoDSL.g:2106:3: rule__ComponentBody__RateAssignment_5
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
    // InternalArduinoDSL.g:2114:1: rule__ComponentBody__Group__6 : rule__ComponentBody__Group__6__Impl ;
    public final void rule__ComponentBody__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2118:1: ( rule__ComponentBody__Group__6__Impl )
            // InternalArduinoDSL.g:2119:2: rule__ComponentBody__Group__6__Impl
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
    // InternalArduinoDSL.g:2125:1: rule__ComponentBody__Group__6__Impl : ( ( rule__ComponentBody__SmoothingAssignment_6 )? ) ;
    public final void rule__ComponentBody__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2129:1: ( ( ( rule__ComponentBody__SmoothingAssignment_6 )? ) )
            // InternalArduinoDSL.g:2130:1: ( ( rule__ComponentBody__SmoothingAssignment_6 )? )
            {
            // InternalArduinoDSL.g:2130:1: ( ( rule__ComponentBody__SmoothingAssignment_6 )? )
            // InternalArduinoDSL.g:2131:2: ( rule__ComponentBody__SmoothingAssignment_6 )?
            {
             before(grammarAccess.getComponentBodyAccess().getSmoothingAssignment_6()); 
            // InternalArduinoDSL.g:2132:2: ( rule__ComponentBody__SmoothingAssignment_6 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==31) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalArduinoDSL.g:2132:3: rule__ComponentBody__SmoothingAssignment_6
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
    // InternalArduinoDSL.g:2141:1: rule__Map__Group__0 : rule__Map__Group__0__Impl rule__Map__Group__1 ;
    public final void rule__Map__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2145:1: ( rule__Map__Group__0__Impl rule__Map__Group__1 )
            // InternalArduinoDSL.g:2146:2: rule__Map__Group__0__Impl rule__Map__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalArduinoDSL.g:2153:1: rule__Map__Group__0__Impl : ( 'map' ) ;
    public final void rule__Map__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2157:1: ( ( 'map' ) )
            // InternalArduinoDSL.g:2158:1: ( 'map' )
            {
            // InternalArduinoDSL.g:2158:1: ( 'map' )
            // InternalArduinoDSL.g:2159:2: 'map'
            {
             before(grammarAccess.getMapAccess().getMapKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalArduinoDSL.g:2168:1: rule__Map__Group__1 : rule__Map__Group__1__Impl rule__Map__Group__2 ;
    public final void rule__Map__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2172:1: ( rule__Map__Group__1__Impl rule__Map__Group__2 )
            // InternalArduinoDSL.g:2173:2: rule__Map__Group__1__Impl rule__Map__Group__2
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
    // InternalArduinoDSL.g:2180:1: rule__Map__Group__1__Impl : ( ( rule__Map__InAssignment_1 ) ) ;
    public final void rule__Map__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2184:1: ( ( ( rule__Map__InAssignment_1 ) ) )
            // InternalArduinoDSL.g:2185:1: ( ( rule__Map__InAssignment_1 ) )
            {
            // InternalArduinoDSL.g:2185:1: ( ( rule__Map__InAssignment_1 ) )
            // InternalArduinoDSL.g:2186:2: ( rule__Map__InAssignment_1 )
            {
             before(grammarAccess.getMapAccess().getInAssignment_1()); 
            // InternalArduinoDSL.g:2187:2: ( rule__Map__InAssignment_1 )
            // InternalArduinoDSL.g:2187:3: rule__Map__InAssignment_1
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
    // InternalArduinoDSL.g:2195:1: rule__Map__Group__2 : rule__Map__Group__2__Impl rule__Map__Group__3 ;
    public final void rule__Map__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2199:1: ( rule__Map__Group__2__Impl rule__Map__Group__3 )
            // InternalArduinoDSL.g:2200:2: rule__Map__Group__2__Impl rule__Map__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalArduinoDSL.g:2207:1: rule__Map__Group__2__Impl : ( '=>' ) ;
    public final void rule__Map__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2211:1: ( ( '=>' ) )
            // InternalArduinoDSL.g:2212:1: ( '=>' )
            {
            // InternalArduinoDSL.g:2212:1: ( '=>' )
            // InternalArduinoDSL.g:2213:2: '=>'
            {
             before(grammarAccess.getMapAccess().getEqualsSignGreaterThanSignKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalArduinoDSL.g:2222:1: rule__Map__Group__3 : rule__Map__Group__3__Impl ;
    public final void rule__Map__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2226:1: ( rule__Map__Group__3__Impl )
            // InternalArduinoDSL.g:2227:2: rule__Map__Group__3__Impl
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
    // InternalArduinoDSL.g:2233:1: rule__Map__Group__3__Impl : ( ( rule__Map__OutAssignment_3 ) ) ;
    public final void rule__Map__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2237:1: ( ( ( rule__Map__OutAssignment_3 ) ) )
            // InternalArduinoDSL.g:2238:1: ( ( rule__Map__OutAssignment_3 ) )
            {
            // InternalArduinoDSL.g:2238:1: ( ( rule__Map__OutAssignment_3 ) )
            // InternalArduinoDSL.g:2239:2: ( rule__Map__OutAssignment_3 )
            {
             before(grammarAccess.getMapAccess().getOutAssignment_3()); 
            // InternalArduinoDSL.g:2240:2: ( rule__Map__OutAssignment_3 )
            // InternalArduinoDSL.g:2240:3: rule__Map__OutAssignment_3
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
    // InternalArduinoDSL.g:2249:1: rule__Range__Group__0 : rule__Range__Group__0__Impl rule__Range__Group__1 ;
    public final void rule__Range__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2253:1: ( rule__Range__Group__0__Impl rule__Range__Group__1 )
            // InternalArduinoDSL.g:2254:2: rule__Range__Group__0__Impl rule__Range__Group__1
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
    // InternalArduinoDSL.g:2261:1: rule__Range__Group__0__Impl : ( ( rule__Range__LowAssignment_0 ) ) ;
    public final void rule__Range__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2265:1: ( ( ( rule__Range__LowAssignment_0 ) ) )
            // InternalArduinoDSL.g:2266:1: ( ( rule__Range__LowAssignment_0 ) )
            {
            // InternalArduinoDSL.g:2266:1: ( ( rule__Range__LowAssignment_0 ) )
            // InternalArduinoDSL.g:2267:2: ( rule__Range__LowAssignment_0 )
            {
             before(grammarAccess.getRangeAccess().getLowAssignment_0()); 
            // InternalArduinoDSL.g:2268:2: ( rule__Range__LowAssignment_0 )
            // InternalArduinoDSL.g:2268:3: rule__Range__LowAssignment_0
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
    // InternalArduinoDSL.g:2276:1: rule__Range__Group__1 : rule__Range__Group__1__Impl rule__Range__Group__2 ;
    public final void rule__Range__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2280:1: ( rule__Range__Group__1__Impl rule__Range__Group__2 )
            // InternalArduinoDSL.g:2281:2: rule__Range__Group__1__Impl rule__Range__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalArduinoDSL.g:2288:1: rule__Range__Group__1__Impl : ( ':' ) ;
    public final void rule__Range__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2292:1: ( ( ':' ) )
            // InternalArduinoDSL.g:2293:1: ( ':' )
            {
            // InternalArduinoDSL.g:2293:1: ( ':' )
            // InternalArduinoDSL.g:2294:2: ':'
            {
             before(grammarAccess.getRangeAccess().getColonKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalArduinoDSL.g:2303:1: rule__Range__Group__2 : rule__Range__Group__2__Impl ;
    public final void rule__Range__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2307:1: ( rule__Range__Group__2__Impl )
            // InternalArduinoDSL.g:2308:2: rule__Range__Group__2__Impl
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
    // InternalArduinoDSL.g:2314:1: rule__Range__Group__2__Impl : ( ( rule__Range__HighAssignment_2 ) ) ;
    public final void rule__Range__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2318:1: ( ( ( rule__Range__HighAssignment_2 ) ) )
            // InternalArduinoDSL.g:2319:1: ( ( rule__Range__HighAssignment_2 ) )
            {
            // InternalArduinoDSL.g:2319:1: ( ( rule__Range__HighAssignment_2 ) )
            // InternalArduinoDSL.g:2320:2: ( rule__Range__HighAssignment_2 )
            {
             before(grammarAccess.getRangeAccess().getHighAssignment_2()); 
            // InternalArduinoDSL.g:2321:2: ( rule__Range__HighAssignment_2 )
            // InternalArduinoDSL.g:2321:3: rule__Range__HighAssignment_2
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
    // InternalArduinoDSL.g:2330:1: rule__Rate__Group__0 : rule__Rate__Group__0__Impl rule__Rate__Group__1 ;
    public final void rule__Rate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2334:1: ( rule__Rate__Group__0__Impl rule__Rate__Group__1 )
            // InternalArduinoDSL.g:2335:2: rule__Rate__Group__0__Impl rule__Rate__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalArduinoDSL.g:2342:1: rule__Rate__Group__0__Impl : ( 'rate' ) ;
    public final void rule__Rate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2346:1: ( ( 'rate' ) )
            // InternalArduinoDSL.g:2347:1: ( 'rate' )
            {
            // InternalArduinoDSL.g:2347:1: ( 'rate' )
            // InternalArduinoDSL.g:2348:2: 'rate'
            {
             before(grammarAccess.getRateAccess().getRateKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalArduinoDSL.g:2357:1: rule__Rate__Group__1 : rule__Rate__Group__1__Impl ;
    public final void rule__Rate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2361:1: ( rule__Rate__Group__1__Impl )
            // InternalArduinoDSL.g:2362:2: rule__Rate__Group__1__Impl
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
    // InternalArduinoDSL.g:2368:1: rule__Rate__Group__1__Impl : ( ( rule__Rate__ValueAssignment_1 ) ) ;
    public final void rule__Rate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2372:1: ( ( ( rule__Rate__ValueAssignment_1 ) ) )
            // InternalArduinoDSL.g:2373:1: ( ( rule__Rate__ValueAssignment_1 ) )
            {
            // InternalArduinoDSL.g:2373:1: ( ( rule__Rate__ValueAssignment_1 ) )
            // InternalArduinoDSL.g:2374:2: ( rule__Rate__ValueAssignment_1 )
            {
             before(grammarAccess.getRateAccess().getValueAssignment_1()); 
            // InternalArduinoDSL.g:2375:2: ( rule__Rate__ValueAssignment_1 )
            // InternalArduinoDSL.g:2375:3: rule__Rate__ValueAssignment_1
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
    // InternalArduinoDSL.g:2384:1: rule__Smoothing__Group__0 : rule__Smoothing__Group__0__Impl rule__Smoothing__Group__1 ;
    public final void rule__Smoothing__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2388:1: ( rule__Smoothing__Group__0__Impl rule__Smoothing__Group__1 )
            // InternalArduinoDSL.g:2389:2: rule__Smoothing__Group__0__Impl rule__Smoothing__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalArduinoDSL.g:2396:1: rule__Smoothing__Group__0__Impl : ( 'smoothing' ) ;
    public final void rule__Smoothing__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2400:1: ( ( 'smoothing' ) )
            // InternalArduinoDSL.g:2401:1: ( 'smoothing' )
            {
            // InternalArduinoDSL.g:2401:1: ( 'smoothing' )
            // InternalArduinoDSL.g:2402:2: 'smoothing'
            {
             before(grammarAccess.getSmoothingAccess().getSmoothingKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalArduinoDSL.g:2411:1: rule__Smoothing__Group__1 : rule__Smoothing__Group__1__Impl ;
    public final void rule__Smoothing__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2415:1: ( rule__Smoothing__Group__1__Impl )
            // InternalArduinoDSL.g:2416:2: rule__Smoothing__Group__1__Impl
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
    // InternalArduinoDSL.g:2422:1: rule__Smoothing__Group__1__Impl : ( ( rule__Smoothing__ValueAssignment_1 ) ) ;
    public final void rule__Smoothing__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2426:1: ( ( ( rule__Smoothing__ValueAssignment_1 ) ) )
            // InternalArduinoDSL.g:2427:1: ( ( rule__Smoothing__ValueAssignment_1 ) )
            {
            // InternalArduinoDSL.g:2427:1: ( ( rule__Smoothing__ValueAssignment_1 ) )
            // InternalArduinoDSL.g:2428:2: ( rule__Smoothing__ValueAssignment_1 )
            {
             before(grammarAccess.getSmoothingAccess().getValueAssignment_1()); 
            // InternalArduinoDSL.g:2429:2: ( rule__Smoothing__ValueAssignment_1 )
            // InternalArduinoDSL.g:2429:3: rule__Smoothing__ValueAssignment_1
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
    // InternalArduinoDSL.g:2438:1: rule__Program__ProgramAssignment : ( ( rule__Program__ProgramAlternatives_0 ) ) ;
    public final void rule__Program__ProgramAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2442:1: ( ( ( rule__Program__ProgramAlternatives_0 ) ) )
            // InternalArduinoDSL.g:2443:2: ( ( rule__Program__ProgramAlternatives_0 ) )
            {
            // InternalArduinoDSL.g:2443:2: ( ( rule__Program__ProgramAlternatives_0 ) )
            // InternalArduinoDSL.g:2444:3: ( rule__Program__ProgramAlternatives_0 )
            {
             before(grammarAccess.getProgramAccess().getProgramAlternatives_0()); 
            // InternalArduinoDSL.g:2445:3: ( rule__Program__ProgramAlternatives_0 )
            // InternalArduinoDSL.g:2445:4: rule__Program__ProgramAlternatives_0
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
    // InternalArduinoDSL.g:2453:1: rule__Rule__TypeAssignment_0 : ( ( rule__Rule__TypeAlternatives_0_0 ) ) ;
    public final void rule__Rule__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2457:1: ( ( ( rule__Rule__TypeAlternatives_0_0 ) ) )
            // InternalArduinoDSL.g:2458:2: ( ( rule__Rule__TypeAlternatives_0_0 ) )
            {
            // InternalArduinoDSL.g:2458:2: ( ( rule__Rule__TypeAlternatives_0_0 ) )
            // InternalArduinoDSL.g:2459:3: ( rule__Rule__TypeAlternatives_0_0 )
            {
             before(grammarAccess.getRuleAccess().getTypeAlternatives_0_0()); 
            // InternalArduinoDSL.g:2460:3: ( rule__Rule__TypeAlternatives_0_0 )
            // InternalArduinoDSL.g:2460:4: rule__Rule__TypeAlternatives_0_0
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
    // InternalArduinoDSL.g:2468:1: rule__Rule__ConditionAssignment_1 : ( ruleCondition ) ;
    public final void rule__Rule__ConditionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2472:1: ( ( ruleCondition ) )
            // InternalArduinoDSL.g:2473:2: ( ruleCondition )
            {
            // InternalArduinoDSL.g:2473:2: ( ruleCondition )
            // InternalArduinoDSL.g:2474:3: ruleCondition
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
    // InternalArduinoDSL.g:2483:1: rule__Rule__BodyAssignment_3 : ( ruleRuleBody ) ;
    public final void rule__Rule__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2487:1: ( ( ruleRuleBody ) )
            // InternalArduinoDSL.g:2488:2: ( ruleRuleBody )
            {
            // InternalArduinoDSL.g:2488:2: ( ruleRuleBody )
            // InternalArduinoDSL.g:2489:3: ruleRuleBody
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
    // InternalArduinoDSL.g:2498:1: rule__Condition__LeftAssignment_0 : ( ruleExp ) ;
    public final void rule__Condition__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2502:1: ( ( ruleExp ) )
            // InternalArduinoDSL.g:2503:2: ( ruleExp )
            {
            // InternalArduinoDSL.g:2503:2: ( ruleExp )
            // InternalArduinoDSL.g:2504:3: ruleExp
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
    // InternalArduinoDSL.g:2513:1: rule__Condition__OperatorAssignment_1 : ( RULE_BOOLEAN_OPERATOR ) ;
    public final void rule__Condition__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2517:1: ( ( RULE_BOOLEAN_OPERATOR ) )
            // InternalArduinoDSL.g:2518:2: ( RULE_BOOLEAN_OPERATOR )
            {
            // InternalArduinoDSL.g:2518:2: ( RULE_BOOLEAN_OPERATOR )
            // InternalArduinoDSL.g:2519:3: RULE_BOOLEAN_OPERATOR
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
    // InternalArduinoDSL.g:2528:1: rule__Condition__RightAssignment_2 : ( ruleExp ) ;
    public final void rule__Condition__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2532:1: ( ( ruleExp ) )
            // InternalArduinoDSL.g:2533:2: ( ruleExp )
            {
            // InternalArduinoDSL.g:2533:2: ( ruleExp )
            // InternalArduinoDSL.g:2534:3: ruleExp
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
    // InternalArduinoDSL.g:2543:1: rule__Exp__OperatorAssignment_1_1 : ( ruleExpWeakOp ) ;
    public final void rule__Exp__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2547:1: ( ( ruleExpWeakOp ) )
            // InternalArduinoDSL.g:2548:2: ( ruleExpWeakOp )
            {
            // InternalArduinoDSL.g:2548:2: ( ruleExpWeakOp )
            // InternalArduinoDSL.g:2549:3: ruleExpWeakOp
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
    // InternalArduinoDSL.g:2558:1: rule__Exp__RightAssignment_1_2 : ( ruleFactor ) ;
    public final void rule__Exp__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2562:1: ( ( ruleFactor ) )
            // InternalArduinoDSL.g:2563:2: ( ruleFactor )
            {
            // InternalArduinoDSL.g:2563:2: ( ruleFactor )
            // InternalArduinoDSL.g:2564:3: ruleFactor
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
    // InternalArduinoDSL.g:2573:1: rule__Factor__OperatorAssignment_1_1 : ( ruleExpStrongOp ) ;
    public final void rule__Factor__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2577:1: ( ( ruleExpStrongOp ) )
            // InternalArduinoDSL.g:2578:2: ( ruleExpStrongOp )
            {
            // InternalArduinoDSL.g:2578:2: ( ruleExpStrongOp )
            // InternalArduinoDSL.g:2579:3: ruleExpStrongOp
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
    // InternalArduinoDSL.g:2588:1: rule__Factor__RightAssignment_1_2 : ( ruleValue ) ;
    public final void rule__Factor__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2592:1: ( ( ruleValue ) )
            // InternalArduinoDSL.g:2593:2: ( ruleValue )
            {
            // InternalArduinoDSL.g:2593:2: ( ruleValue )
            // InternalArduinoDSL.g:2594:3: ruleValue
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
    // InternalArduinoDSL.g:2603:1: rule__Attribute__NameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Attribute__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2607:1: ( ( ( RULE_ID ) ) )
            // InternalArduinoDSL.g:2608:2: ( ( RULE_ID ) )
            {
            // InternalArduinoDSL.g:2608:2: ( ( RULE_ID ) )
            // InternalArduinoDSL.g:2609:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeAccess().getNameNodeCrossReference_0_0()); 
            // InternalArduinoDSL.g:2610:3: ( RULE_ID )
            // InternalArduinoDSL.g:2611:4: RULE_ID
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
    // InternalArduinoDSL.g:2622:1: rule__Attribute__ComponentAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Attribute__ComponentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2626:1: ( ( ( RULE_ID ) ) )
            // InternalArduinoDSL.g:2627:2: ( ( RULE_ID ) )
            {
            // InternalArduinoDSL.g:2627:2: ( ( RULE_ID ) )
            // InternalArduinoDSL.g:2628:3: ( RULE_ID )
            {
             before(grammarAccess.getAttributeAccess().getComponentComponentCrossReference_1_0()); 
            // InternalArduinoDSL.g:2629:3: ( RULE_ID )
            // InternalArduinoDSL.g:2630:4: RULE_ID
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


    // $ANTLR start "rule__RuleBody__AssignmentAssignment"
    // InternalArduinoDSL.g:2641:1: rule__RuleBody__AssignmentAssignment : ( ruleAssignment ) ;
    public final void rule__RuleBody__AssignmentAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2645:1: ( ( ruleAssignment ) )
            // InternalArduinoDSL.g:2646:2: ( ruleAssignment )
            {
            // InternalArduinoDSL.g:2646:2: ( ruleAssignment )
            // InternalArduinoDSL.g:2647:3: ruleAssignment
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
    // InternalArduinoDSL.g:2656:1: rule__Assignment__AttributeAssignment_0 : ( ruleAttribute ) ;
    public final void rule__Assignment__AttributeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2660:1: ( ( ruleAttribute ) )
            // InternalArduinoDSL.g:2661:2: ( ruleAttribute )
            {
            // InternalArduinoDSL.g:2661:2: ( ruleAttribute )
            // InternalArduinoDSL.g:2662:3: ruleAttribute
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
    // InternalArduinoDSL.g:2671:1: rule__Assignment__ValueAssignment_2 : ( ruleExp ) ;
    public final void rule__Assignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2675:1: ( ( ruleExp ) )
            // InternalArduinoDSL.g:2676:2: ( ruleExp )
            {
            // InternalArduinoDSL.g:2676:2: ( ruleExp )
            // InternalArduinoDSL.g:2677:3: ruleExp
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
    // InternalArduinoDSL.g:2686:1: rule__Node__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2690:1: ( ( RULE_ID ) )
            // InternalArduinoDSL.g:2691:2: ( RULE_ID )
            {
            // InternalArduinoDSL.g:2691:2: ( RULE_ID )
            // InternalArduinoDSL.g:2692:3: RULE_ID
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
    // InternalArduinoDSL.g:2701:1: rule__Node__ComponentsAssignment_2 : ( ruleComponent ) ;
    public final void rule__Node__ComponentsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2705:1: ( ( ruleComponent ) )
            // InternalArduinoDSL.g:2706:2: ( ruleComponent )
            {
            // InternalArduinoDSL.g:2706:2: ( ruleComponent )
            // InternalArduinoDSL.g:2707:3: ruleComponent
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
    // InternalArduinoDSL.g:2716:1: rule__Component__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Component__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2720:1: ( ( RULE_ID ) )
            // InternalArduinoDSL.g:2721:2: ( RULE_ID )
            {
            // InternalArduinoDSL.g:2721:2: ( RULE_ID )
            // InternalArduinoDSL.g:2722:3: RULE_ID
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
    // InternalArduinoDSL.g:2731:1: rule__Component__PropertiesAssignment_1 : ( ruleComponentBody ) ;
    public final void rule__Component__PropertiesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2735:1: ( ( ruleComponentBody ) )
            // InternalArduinoDSL.g:2736:2: ( ruleComponentBody )
            {
            // InternalArduinoDSL.g:2736:2: ( ruleComponentBody )
            // InternalArduinoDSL.g:2737:3: ruleComponentBody
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
    // InternalArduinoDSL.g:2746:1: rule__ComponentBody__IoAssignment_0 : ( RULE_IO ) ;
    public final void rule__ComponentBody__IoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2750:1: ( ( RULE_IO ) )
            // InternalArduinoDSL.g:2751:2: ( RULE_IO )
            {
            // InternalArduinoDSL.g:2751:2: ( RULE_IO )
            // InternalArduinoDSL.g:2752:3: RULE_IO
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
    // InternalArduinoDSL.g:2761:1: rule__ComponentBody__TypeAssignment_1 : ( RULE_TYPE ) ;
    public final void rule__ComponentBody__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2765:1: ( ( RULE_TYPE ) )
            // InternalArduinoDSL.g:2766:2: ( RULE_TYPE )
            {
            // InternalArduinoDSL.g:2766:2: ( RULE_TYPE )
            // InternalArduinoDSL.g:2767:3: RULE_TYPE
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
    // InternalArduinoDSL.g:2776:1: rule__ComponentBody__PinAssignment_3 : ( RULE_INT ) ;
    public final void rule__ComponentBody__PinAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2780:1: ( ( RULE_INT ) )
            // InternalArduinoDSL.g:2781:2: ( RULE_INT )
            {
            // InternalArduinoDSL.g:2781:2: ( RULE_INT )
            // InternalArduinoDSL.g:2782:3: RULE_INT
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
    // InternalArduinoDSL.g:2791:1: rule__ComponentBody__MapAssignment_4 : ( ruleMap ) ;
    public final void rule__ComponentBody__MapAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2795:1: ( ( ruleMap ) )
            // InternalArduinoDSL.g:2796:2: ( ruleMap )
            {
            // InternalArduinoDSL.g:2796:2: ( ruleMap )
            // InternalArduinoDSL.g:2797:3: ruleMap
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
    // InternalArduinoDSL.g:2806:1: rule__ComponentBody__RateAssignment_5 : ( ruleRate ) ;
    public final void rule__ComponentBody__RateAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2810:1: ( ( ruleRate ) )
            // InternalArduinoDSL.g:2811:2: ( ruleRate )
            {
            // InternalArduinoDSL.g:2811:2: ( ruleRate )
            // InternalArduinoDSL.g:2812:3: ruleRate
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
    // InternalArduinoDSL.g:2821:1: rule__ComponentBody__SmoothingAssignment_6 : ( ruleSmoothing ) ;
    public final void rule__ComponentBody__SmoothingAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2825:1: ( ( ruleSmoothing ) )
            // InternalArduinoDSL.g:2826:2: ( ruleSmoothing )
            {
            // InternalArduinoDSL.g:2826:2: ( ruleSmoothing )
            // InternalArduinoDSL.g:2827:3: ruleSmoothing
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
    // InternalArduinoDSL.g:2836:1: rule__Map__InAssignment_1 : ( ruleRange ) ;
    public final void rule__Map__InAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2840:1: ( ( ruleRange ) )
            // InternalArduinoDSL.g:2841:2: ( ruleRange )
            {
            // InternalArduinoDSL.g:2841:2: ( ruleRange )
            // InternalArduinoDSL.g:2842:3: ruleRange
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
    // InternalArduinoDSL.g:2851:1: rule__Map__OutAssignment_3 : ( ruleRange ) ;
    public final void rule__Map__OutAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2855:1: ( ( ruleRange ) )
            // InternalArduinoDSL.g:2856:2: ( ruleRange )
            {
            // InternalArduinoDSL.g:2856:2: ( ruleRange )
            // InternalArduinoDSL.g:2857:3: ruleRange
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
    // InternalArduinoDSL.g:2866:1: rule__Range__LowAssignment_0 : ( ruleNUMBER ) ;
    public final void rule__Range__LowAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2870:1: ( ( ruleNUMBER ) )
            // InternalArduinoDSL.g:2871:2: ( ruleNUMBER )
            {
            // InternalArduinoDSL.g:2871:2: ( ruleNUMBER )
            // InternalArduinoDSL.g:2872:3: ruleNUMBER
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
    // InternalArduinoDSL.g:2881:1: rule__Range__HighAssignment_2 : ( ruleNUMBER ) ;
    public final void rule__Range__HighAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2885:1: ( ( ruleNUMBER ) )
            // InternalArduinoDSL.g:2886:2: ( ruleNUMBER )
            {
            // InternalArduinoDSL.g:2886:2: ( ruleNUMBER )
            // InternalArduinoDSL.g:2887:3: ruleNUMBER
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
    // InternalArduinoDSL.g:2896:1: rule__Rate__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__Rate__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2900:1: ( ( RULE_INT ) )
            // InternalArduinoDSL.g:2901:2: ( RULE_INT )
            {
            // InternalArduinoDSL.g:2901:2: ( RULE_INT )
            // InternalArduinoDSL.g:2902:3: RULE_INT
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
    // InternalArduinoDSL.g:2911:1: rule__Smoothing__ValueAssignment_1 : ( ruleNUMBER ) ;
    public final void rule__Smoothing__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalArduinoDSL.g:2915:1: ( ( ruleNUMBER ) )
            // InternalArduinoDSL.g:2916:2: ( ruleNUMBER )
            {
            // InternalArduinoDSL.g:2916:2: ( ruleNUMBER )
            // InternalArduinoDSL.g:2917:3: ruleNUMBER
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000018082L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000082L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000000B0L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000C8000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});

}