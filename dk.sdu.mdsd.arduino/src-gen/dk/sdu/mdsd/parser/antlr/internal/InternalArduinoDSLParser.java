package dk.sdu.mdsd.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.sdu.mdsd.services.ArduinoDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalArduinoDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BOOLEAN_OPERATOR", "RULE_ID", "RULE_DECIMAL", "RULE_INT", "RULE_IO", "RULE_TYPE", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'when'", "'once'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'delta'", "'.'", "'on'", "'off'", "'='", "'pin'", "'map'", "'=>'", "':'", "'rate'", "'smoothing'"
    };
    public static final int RULE_BOOLEAN_OPERATOR=4;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=13;
    public static final int RULE_ANY_OTHER=14;
    public static final int RULE_DECIMAL=6;
    public static final int T__26=26;
    public static final int RULE_TYPE=9;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
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

        public InternalArduinoDSLParser(TokenStream input, ArduinoDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected ArduinoDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalArduinoDSL.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalArduinoDSL.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalArduinoDSL.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalArduinoDSL.g:71:1: ruleProgram returns [EObject current=null] : ( ( (lv_program_0_1= ruleRule | lv_program_0_2= ruleNode ) ) )* ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_program_0_1 = null;

        EObject lv_program_0_2 = null;



        	enterRule();

        try {
            // InternalArduinoDSL.g:77:2: ( ( ( (lv_program_0_1= ruleRule | lv_program_0_2= ruleNode ) ) )* )
            // InternalArduinoDSL.g:78:2: ( ( (lv_program_0_1= ruleRule | lv_program_0_2= ruleNode ) ) )*
            {
            // InternalArduinoDSL.g:78:2: ( ( (lv_program_0_1= ruleRule | lv_program_0_2= ruleNode ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID||(LA2_0>=15 && LA2_0<=16)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalArduinoDSL.g:79:3: ( (lv_program_0_1= ruleRule | lv_program_0_2= ruleNode ) )
            	    {
            	    // InternalArduinoDSL.g:79:3: ( (lv_program_0_1= ruleRule | lv_program_0_2= ruleNode ) )
            	    // InternalArduinoDSL.g:80:4: (lv_program_0_1= ruleRule | lv_program_0_2= ruleNode )
            	    {
            	    // InternalArduinoDSL.g:80:4: (lv_program_0_1= ruleRule | lv_program_0_2= ruleNode )
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( ((LA1_0>=15 && LA1_0<=16)) ) {
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
            	            // InternalArduinoDSL.g:81:5: lv_program_0_1= ruleRule
            	            {

            	            					newCompositeNode(grammarAccess.getProgramAccess().getProgramRuleParserRuleCall_0_0());
            	            				
            	            pushFollow(FOLLOW_3);
            	            lv_program_0_1=ruleRule();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getProgramRule());
            	            					}
            	            					add(
            	            						current,
            	            						"program",
            	            						lv_program_0_1,
            	            						"dk.sdu.mdsd.ArduinoDSL.Rule");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalArduinoDSL.g:97:5: lv_program_0_2= ruleNode
            	            {

            	            					newCompositeNode(grammarAccess.getProgramAccess().getProgramNodeParserRuleCall_0_1());
            	            				
            	            pushFollow(FOLLOW_3);
            	            lv_program_0_2=ruleNode();

            	            state._fsp--;


            	            					if (current==null) {
            	            						current = createModelElementForParent(grammarAccess.getProgramRule());
            	            					}
            	            					add(
            	            						current,
            	            						"program",
            	            						lv_program_0_2,
            	            						"dk.sdu.mdsd.ArduinoDSL.Node");
            	            					afterParserOrEnumRuleCall();
            	            				

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleRule"
    // InternalArduinoDSL.g:118:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalArduinoDSL.g:118:45: (iv_ruleRule= ruleRule EOF )
            // InternalArduinoDSL.g:119:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalArduinoDSL.g:125:1: ruleRule returns [EObject current=null] : ( ( ( (lv_type_0_1= 'when' | lv_type_0_2= 'once' ) ) ) ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= '{' ( (lv_body_3_0= ruleRuleBody ) ) otherlv_4= '}' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_condition_1_0 = null;

        EObject lv_body_3_0 = null;



        	enterRule();

        try {
            // InternalArduinoDSL.g:131:2: ( ( ( ( (lv_type_0_1= 'when' | lv_type_0_2= 'once' ) ) ) ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= '{' ( (lv_body_3_0= ruleRuleBody ) ) otherlv_4= '}' ) )
            // InternalArduinoDSL.g:132:2: ( ( ( (lv_type_0_1= 'when' | lv_type_0_2= 'once' ) ) ) ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= '{' ( (lv_body_3_0= ruleRuleBody ) ) otherlv_4= '}' )
            {
            // InternalArduinoDSL.g:132:2: ( ( ( (lv_type_0_1= 'when' | lv_type_0_2= 'once' ) ) ) ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= '{' ( (lv_body_3_0= ruleRuleBody ) ) otherlv_4= '}' )
            // InternalArduinoDSL.g:133:3: ( ( (lv_type_0_1= 'when' | lv_type_0_2= 'once' ) ) ) ( (lv_condition_1_0= ruleCondition ) ) otherlv_2= '{' ( (lv_body_3_0= ruleRuleBody ) ) otherlv_4= '}'
            {
            // InternalArduinoDSL.g:133:3: ( ( (lv_type_0_1= 'when' | lv_type_0_2= 'once' ) ) )
            // InternalArduinoDSL.g:134:4: ( (lv_type_0_1= 'when' | lv_type_0_2= 'once' ) )
            {
            // InternalArduinoDSL.g:134:4: ( (lv_type_0_1= 'when' | lv_type_0_2= 'once' ) )
            // InternalArduinoDSL.g:135:5: (lv_type_0_1= 'when' | lv_type_0_2= 'once' )
            {
            // InternalArduinoDSL.g:135:5: (lv_type_0_1= 'when' | lv_type_0_2= 'once' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalArduinoDSL.g:136:6: lv_type_0_1= 'when'
                    {
                    lv_type_0_1=(Token)match(input,15,FOLLOW_4); 

                    						newLeafNode(lv_type_0_1, grammarAccess.getRuleAccess().getTypeWhenKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRuleRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_0_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalArduinoDSL.g:147:6: lv_type_0_2= 'once'
                    {
                    lv_type_0_2=(Token)match(input,16,FOLLOW_4); 

                    						newLeafNode(lv_type_0_2, grammarAccess.getRuleAccess().getTypeOnceKeyword_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRuleRule());
                    						}
                    						setWithLastConsumed(current, "type", lv_type_0_2, null);
                    					

                    }
                    break;

            }


            }


            }

            // InternalArduinoDSL.g:160:3: ( (lv_condition_1_0= ruleCondition ) )
            // InternalArduinoDSL.g:161:4: (lv_condition_1_0= ruleCondition )
            {
            // InternalArduinoDSL.g:161:4: (lv_condition_1_0= ruleCondition )
            // InternalArduinoDSL.g:162:5: lv_condition_1_0= ruleCondition
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getConditionConditionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_5);
            lv_condition_1_0=ruleCondition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_1_0,
            						"dk.sdu.mdsd.ArduinoDSL.Condition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalArduinoDSL.g:183:3: ( (lv_body_3_0= ruleRuleBody ) )
            // InternalArduinoDSL.g:184:4: (lv_body_3_0= ruleRuleBody )
            {
            // InternalArduinoDSL.g:184:4: (lv_body_3_0= ruleRuleBody )
            // InternalArduinoDSL.g:185:5: lv_body_3_0= ruleRuleBody
            {

            					newCompositeNode(grammarAccess.getRuleAccess().getBodyRuleBodyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_body_3_0=ruleRuleBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRuleRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_3_0,
            						"dk.sdu.mdsd.ArduinoDSL.RuleBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getRuleAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleCondition"
    // InternalArduinoDSL.g:210:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalArduinoDSL.g:210:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalArduinoDSL.g:211:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalArduinoDSL.g:217:1: ruleCondition returns [EObject current=null] : ( ( (lv_left_0_0= ruleExp ) ) ( (lv_operator_1_0= RULE_BOOLEAN_OPERATOR ) ) ( (lv_right_2_0= ruleExp ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token lv_operator_1_0=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;



        	enterRule();

        try {
            // InternalArduinoDSL.g:223:2: ( ( ( (lv_left_0_0= ruleExp ) ) ( (lv_operator_1_0= RULE_BOOLEAN_OPERATOR ) ) ( (lv_right_2_0= ruleExp ) ) ) )
            // InternalArduinoDSL.g:224:2: ( ( (lv_left_0_0= ruleExp ) ) ( (lv_operator_1_0= RULE_BOOLEAN_OPERATOR ) ) ( (lv_right_2_0= ruleExp ) ) )
            {
            // InternalArduinoDSL.g:224:2: ( ( (lv_left_0_0= ruleExp ) ) ( (lv_operator_1_0= RULE_BOOLEAN_OPERATOR ) ) ( (lv_right_2_0= ruleExp ) ) )
            // InternalArduinoDSL.g:225:3: ( (lv_left_0_0= ruleExp ) ) ( (lv_operator_1_0= RULE_BOOLEAN_OPERATOR ) ) ( (lv_right_2_0= ruleExp ) )
            {
            // InternalArduinoDSL.g:225:3: ( (lv_left_0_0= ruleExp ) )
            // InternalArduinoDSL.g:226:4: (lv_left_0_0= ruleExp )
            {
            // InternalArduinoDSL.g:226:4: (lv_left_0_0= ruleExp )
            // InternalArduinoDSL.g:227:5: lv_left_0_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getLeftExpParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_8);
            lv_left_0_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"dk.sdu.mdsd.ArduinoDSL.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalArduinoDSL.g:244:3: ( (lv_operator_1_0= RULE_BOOLEAN_OPERATOR ) )
            // InternalArduinoDSL.g:245:4: (lv_operator_1_0= RULE_BOOLEAN_OPERATOR )
            {
            // InternalArduinoDSL.g:245:4: (lv_operator_1_0= RULE_BOOLEAN_OPERATOR )
            // InternalArduinoDSL.g:246:5: lv_operator_1_0= RULE_BOOLEAN_OPERATOR
            {
            lv_operator_1_0=(Token)match(input,RULE_BOOLEAN_OPERATOR,FOLLOW_4); 

            					newLeafNode(lv_operator_1_0, grammarAccess.getConditionAccess().getOperatorBOOLEAN_OPERATORTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getConditionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"operator",
            						lv_operator_1_0,
            						"dk.sdu.mdsd.ArduinoDSL.BOOLEAN_OPERATOR");
            				

            }


            }

            // InternalArduinoDSL.g:262:3: ( (lv_right_2_0= ruleExp ) )
            // InternalArduinoDSL.g:263:4: (lv_right_2_0= ruleExp )
            {
            // InternalArduinoDSL.g:263:4: (lv_right_2_0= ruleExp )
            // InternalArduinoDSL.g:264:5: lv_right_2_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getRightExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_right_2_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_2_0,
            						"dk.sdu.mdsd.ArduinoDSL.Exp");
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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleExp"
    // InternalArduinoDSL.g:285:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalArduinoDSL.g:285:44: (iv_ruleExp= ruleExp EOF )
            // InternalArduinoDSL.g:286:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
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
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalArduinoDSL.g:292:1: ruleExp returns [EObject current=null] : (this_Factor_0= ruleFactor ( () ( (lv_operator_2_0= ruleExpWeakOp ) ) ( (lv_right_3_0= ruleFactor ) ) )* ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        EObject this_Factor_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalArduinoDSL.g:298:2: ( (this_Factor_0= ruleFactor ( () ( (lv_operator_2_0= ruleExpWeakOp ) ) ( (lv_right_3_0= ruleFactor ) ) )* ) )
            // InternalArduinoDSL.g:299:2: (this_Factor_0= ruleFactor ( () ( (lv_operator_2_0= ruleExpWeakOp ) ) ( (lv_right_3_0= ruleFactor ) ) )* )
            {
            // InternalArduinoDSL.g:299:2: (this_Factor_0= ruleFactor ( () ( (lv_operator_2_0= ruleExpWeakOp ) ) ( (lv_right_3_0= ruleFactor ) ) )* )
            // InternalArduinoDSL.g:300:3: this_Factor_0= ruleFactor ( () ( (lv_operator_2_0= ruleExpWeakOp ) ) ( (lv_right_3_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalArduinoDSL.g:308:3: ( () ( (lv_operator_2_0= ruleExpWeakOp ) ) ( (lv_right_3_0= ruleFactor ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=19 && LA4_0<=20)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalArduinoDSL.g:309:4: () ( (lv_operator_2_0= ruleExpWeakOp ) ) ( (lv_right_3_0= ruleFactor ) )
            	    {
            	    // InternalArduinoDSL.g:309:4: ()
            	    // InternalArduinoDSL.g:310:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getExpAccess().getExpLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalArduinoDSL.g:316:4: ( (lv_operator_2_0= ruleExpWeakOp ) )
            	    // InternalArduinoDSL.g:317:5: (lv_operator_2_0= ruleExpWeakOp )
            	    {
            	    // InternalArduinoDSL.g:317:5: (lv_operator_2_0= ruleExpWeakOp )
            	    // InternalArduinoDSL.g:318:6: lv_operator_2_0= ruleExpWeakOp
            	    {

            	    						newCompositeNode(grammarAccess.getExpAccess().getOperatorExpWeakOpParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_operator_2_0=ruleExpWeakOp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"dk.sdu.mdsd.ArduinoDSL.ExpWeakOp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalArduinoDSL.g:335:4: ( (lv_right_3_0= ruleFactor ) )
            	    // InternalArduinoDSL.g:336:5: (lv_right_3_0= ruleFactor )
            	    {
            	    // InternalArduinoDSL.g:336:5: (lv_right_3_0= ruleFactor )
            	    // InternalArduinoDSL.g:337:6: lv_right_3_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_right_3_0=ruleFactor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"dk.sdu.mdsd.ArduinoDSL.Factor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleFactor"
    // InternalArduinoDSL.g:359:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalArduinoDSL.g:359:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalArduinoDSL.g:360:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
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
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalArduinoDSL.g:366:1: ruleFactor returns [EObject current=null] : (this_Value_0= ruleValue ( () ( (lv_operator_2_0= ruleExpStrongOp ) ) ( (lv_right_3_0= ruleValue ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        EObject this_Value_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalArduinoDSL.g:372:2: ( (this_Value_0= ruleValue ( () ( (lv_operator_2_0= ruleExpStrongOp ) ) ( (lv_right_3_0= ruleValue ) ) )* ) )
            // InternalArduinoDSL.g:373:2: (this_Value_0= ruleValue ( () ( (lv_operator_2_0= ruleExpStrongOp ) ) ( (lv_right_3_0= ruleValue ) ) )* )
            {
            // InternalArduinoDSL.g:373:2: (this_Value_0= ruleValue ( () ( (lv_operator_2_0= ruleExpStrongOp ) ) ( (lv_right_3_0= ruleValue ) ) )* )
            // InternalArduinoDSL.g:374:3: this_Value_0= ruleValue ( () ( (lv_operator_2_0= ruleExpStrongOp ) ) ( (lv_right_3_0= ruleValue ) ) )*
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getValueParserRuleCall_0());
            		
            pushFollow(FOLLOW_10);
            this_Value_0=ruleValue();

            state._fsp--;


            			current = this_Value_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalArduinoDSL.g:382:3: ( () ( (lv_operator_2_0= ruleExpStrongOp ) ) ( (lv_right_3_0= ruleValue ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=21 && LA5_0<=22)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalArduinoDSL.g:383:4: () ( (lv_operator_2_0= ruleExpStrongOp ) ) ( (lv_right_3_0= ruleValue ) )
            	    {
            	    // InternalArduinoDSL.g:383:4: ()
            	    // InternalArduinoDSL.g:384:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getFactorAccess().getFactorLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalArduinoDSL.g:390:4: ( (lv_operator_2_0= ruleExpStrongOp ) )
            	    // InternalArduinoDSL.g:391:5: (lv_operator_2_0= ruleExpStrongOp )
            	    {
            	    // InternalArduinoDSL.g:391:5: (lv_operator_2_0= ruleExpStrongOp )
            	    // InternalArduinoDSL.g:392:6: lv_operator_2_0= ruleExpStrongOp
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getOperatorExpStrongOpParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_operator_2_0=ruleExpStrongOp();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFactorRule());
            	    						}
            	    						set(
            	    							current,
            	    							"operator",
            	    							lv_operator_2_0,
            	    							"dk.sdu.mdsd.ArduinoDSL.ExpStrongOp");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalArduinoDSL.g:409:4: ( (lv_right_3_0= ruleValue ) )
            	    // InternalArduinoDSL.g:410:5: (lv_right_3_0= ruleValue )
            	    {
            	    // InternalArduinoDSL.g:410:5: (lv_right_3_0= ruleValue )
            	    // InternalArduinoDSL.g:411:6: lv_right_3_0= ruleValue
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getRightValueParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_right_3_0=ruleValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFactorRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"dk.sdu.mdsd.ArduinoDSL.Value");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRuleExpWeakOp"
    // InternalArduinoDSL.g:433:1: entryRuleExpWeakOp returns [EObject current=null] : iv_ruleExpWeakOp= ruleExpWeakOp EOF ;
    public final EObject entryRuleExpWeakOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpWeakOp = null;


        try {
            // InternalArduinoDSL.g:433:50: (iv_ruleExpWeakOp= ruleExpWeakOp EOF )
            // InternalArduinoDSL.g:434:2: iv_ruleExpWeakOp= ruleExpWeakOp EOF
            {
             newCompositeNode(grammarAccess.getExpWeakOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpWeakOp=ruleExpWeakOp();

            state._fsp--;

             current =iv_ruleExpWeakOp; 
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
    // $ANTLR end "entryRuleExpWeakOp"


    // $ANTLR start "ruleExpWeakOp"
    // InternalArduinoDSL.g:440:1: ruleExpWeakOp returns [EObject current=null] : ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) ) ;
    public final EObject ruleExpWeakOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalArduinoDSL.g:446:2: ( ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) ) )
            // InternalArduinoDSL.g:447:2: ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) )
            {
            // InternalArduinoDSL.g:447:2: ( ( () otherlv_1= '+' ) | ( () otherlv_3= '-' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            else if ( (LA6_0==20) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalArduinoDSL.g:448:3: ( () otherlv_1= '+' )
                    {
                    // InternalArduinoDSL.g:448:3: ( () otherlv_1= '+' )
                    // InternalArduinoDSL.g:449:4: () otherlv_1= '+'
                    {
                    // InternalArduinoDSL.g:449:4: ()
                    // InternalArduinoDSL.g:450:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpWeakOpAccess().getPlusAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getExpWeakOpAccess().getPlusSignKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoDSL.g:462:3: ( () otherlv_3= '-' )
                    {
                    // InternalArduinoDSL.g:462:3: ( () otherlv_3= '-' )
                    // InternalArduinoDSL.g:463:4: () otherlv_3= '-'
                    {
                    // InternalArduinoDSL.g:463:4: ()
                    // InternalArduinoDSL.g:464:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpWeakOpAccess().getMinusAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getExpWeakOpAccess().getHyphenMinusKeyword_1_1());
                    			

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
    // $ANTLR end "ruleExpWeakOp"


    // $ANTLR start "entryRuleExpStrongOp"
    // InternalArduinoDSL.g:479:1: entryRuleExpStrongOp returns [EObject current=null] : iv_ruleExpStrongOp= ruleExpStrongOp EOF ;
    public final EObject entryRuleExpStrongOp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpStrongOp = null;


        try {
            // InternalArduinoDSL.g:479:52: (iv_ruleExpStrongOp= ruleExpStrongOp EOF )
            // InternalArduinoDSL.g:480:2: iv_ruleExpStrongOp= ruleExpStrongOp EOF
            {
             newCompositeNode(grammarAccess.getExpStrongOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpStrongOp=ruleExpStrongOp();

            state._fsp--;

             current =iv_ruleExpStrongOp; 
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
    // $ANTLR end "entryRuleExpStrongOp"


    // $ANTLR start "ruleExpStrongOp"
    // InternalArduinoDSL.g:486:1: ruleExpStrongOp returns [EObject current=null] : ( ( () otherlv_1= '*' ) | ( () otherlv_3= '/' ) ) ;
    public final EObject ruleExpStrongOp() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalArduinoDSL.g:492:2: ( ( ( () otherlv_1= '*' ) | ( () otherlv_3= '/' ) ) )
            // InternalArduinoDSL.g:493:2: ( ( () otherlv_1= '*' ) | ( () otherlv_3= '/' ) )
            {
            // InternalArduinoDSL.g:493:2: ( ( () otherlv_1= '*' ) | ( () otherlv_3= '/' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            else if ( (LA7_0==22) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalArduinoDSL.g:494:3: ( () otherlv_1= '*' )
                    {
                    // InternalArduinoDSL.g:494:3: ( () otherlv_1= '*' )
                    // InternalArduinoDSL.g:495:4: () otherlv_1= '*'
                    {
                    // InternalArduinoDSL.g:495:4: ()
                    // InternalArduinoDSL.g:496:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpStrongOpAccess().getMultAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,21,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getExpStrongOpAccess().getAsteriskKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoDSL.g:508:3: ( () otherlv_3= '/' )
                    {
                    // InternalArduinoDSL.g:508:3: ( () otherlv_3= '/' )
                    // InternalArduinoDSL.g:509:4: () otherlv_3= '/'
                    {
                    // InternalArduinoDSL.g:509:4: ()
                    // InternalArduinoDSL.g:510:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getExpStrongOpAccess().getDivAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getExpStrongOpAccess().getSolidusKeyword_1_1());
                    			

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
    // $ANTLR end "ruleExpStrongOp"


    // $ANTLR start "entryRuleValue"
    // InternalArduinoDSL.g:525:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalArduinoDSL.g:525:46: (iv_ruleValue= ruleValue EOF )
            // InternalArduinoDSL.g:526:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalArduinoDSL.g:532:1: ruleValue returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_Attribute_1= ruleAttribute | this_Delta_2= ruleDelta | this_State_3= ruleState ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteral_0 = null;

        EObject this_Attribute_1 = null;

        EObject this_Delta_2 = null;

        EObject this_State_3 = null;



        	enterRule();

        try {
            // InternalArduinoDSL.g:538:2: ( (this_NumberLiteral_0= ruleNumberLiteral | this_Attribute_1= ruleAttribute | this_Delta_2= ruleDelta | this_State_3= ruleState ) )
            // InternalArduinoDSL.g:539:2: (this_NumberLiteral_0= ruleNumberLiteral | this_Attribute_1= ruleAttribute | this_Delta_2= ruleDelta | this_State_3= ruleState )
            {
            // InternalArduinoDSL.g:539:2: (this_NumberLiteral_0= ruleNumberLiteral | this_Attribute_1= ruleAttribute | this_Delta_2= ruleDelta | this_State_3= ruleState )
            int alt8=4;
            switch ( input.LA(1) ) {
            case RULE_DECIMAL:
            case RULE_INT:
                {
                alt8=1;
                }
                break;
            case RULE_ID:
                {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==RULE_ID) ) {
                    int LA8_4 = input.LA(3);

                    if ( (LA8_4==EOF||(LA8_4>=RULE_BOOLEAN_OPERATOR && LA8_4<=RULE_ID)||(LA8_4>=17 && LA8_4<=22)) ) {
                        alt8=2;
                    }
                    else if ( (LA8_4==23) ) {
                        alt8=3;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 4, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }
                }
                break;
            case 25:
            case 26:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalArduinoDSL.g:540:3: this_NumberLiteral_0= ruleNumberLiteral
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getNumberLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumberLiteral_0=ruleNumberLiteral();

                    state._fsp--;


                    			current = this_NumberLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalArduinoDSL.g:549:3: this_Attribute_1= ruleAttribute
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getAttributeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Attribute_1=ruleAttribute();

                    state._fsp--;


                    			current = this_Attribute_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalArduinoDSL.g:558:3: this_Delta_2= ruleDelta
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getDeltaParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Delta_2=ruleDelta();

                    state._fsp--;


                    			current = this_Delta_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalArduinoDSL.g:567:3: this_State_3= ruleState
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getStateParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_State_3=ruleState();

                    state._fsp--;


                    			current = this_State_3;
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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleAttribute"
    // InternalArduinoDSL.g:579:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalArduinoDSL.g:579:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalArduinoDSL.g:580:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalArduinoDSL.g:586:1: ruleAttribute returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalArduinoDSL.g:592:2: ( ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) ) )
            // InternalArduinoDSL.g:593:2: ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalArduinoDSL.g:593:2: ( ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) ) )
            // InternalArduinoDSL.g:594:3: ( (otherlv_0= RULE_ID ) ) ( (otherlv_1= RULE_ID ) )
            {
            // InternalArduinoDSL.g:594:3: ( (otherlv_0= RULE_ID ) )
            // InternalArduinoDSL.g:595:4: (otherlv_0= RULE_ID )
            {
            // InternalArduinoDSL.g:595:4: (otherlv_0= RULE_ID )
            // InternalArduinoDSL.g:596:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getNameNodeCrossReference_0_0());
            				

            }


            }

            // InternalArduinoDSL.g:607:3: ( (otherlv_1= RULE_ID ) )
            // InternalArduinoDSL.g:608:4: (otherlv_1= RULE_ID )
            {
            // InternalArduinoDSL.g:608:4: (otherlv_1= RULE_ID )
            // InternalArduinoDSL.g:609:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getComponentComponentCrossReference_1_0());
            				

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleDelta"
    // InternalArduinoDSL.g:624:1: entryRuleDelta returns [EObject current=null] : iv_ruleDelta= ruleDelta EOF ;
    public final EObject entryRuleDelta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelta = null;


        try {
            // InternalArduinoDSL.g:624:46: (iv_ruleDelta= ruleDelta EOF )
            // InternalArduinoDSL.g:625:2: iv_ruleDelta= ruleDelta EOF
            {
             newCompositeNode(grammarAccess.getDeltaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDelta=ruleDelta();

            state._fsp--;

             current =iv_ruleDelta; 
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
    // $ANTLR end "entryRuleDelta"


    // $ANTLR start "ruleDelta"
    // InternalArduinoDSL.g:631:1: ruleDelta returns [EObject current=null] : ( ( (lv_attr_0_0= ruleAttribute ) ) otherlv_1= 'delta' ) ;
    public final EObject ruleDelta() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_attr_0_0 = null;



        	enterRule();

        try {
            // InternalArduinoDSL.g:637:2: ( ( ( (lv_attr_0_0= ruleAttribute ) ) otherlv_1= 'delta' ) )
            // InternalArduinoDSL.g:638:2: ( ( (lv_attr_0_0= ruleAttribute ) ) otherlv_1= 'delta' )
            {
            // InternalArduinoDSL.g:638:2: ( ( (lv_attr_0_0= ruleAttribute ) ) otherlv_1= 'delta' )
            // InternalArduinoDSL.g:639:3: ( (lv_attr_0_0= ruleAttribute ) ) otherlv_1= 'delta'
            {
            // InternalArduinoDSL.g:639:3: ( (lv_attr_0_0= ruleAttribute ) )
            // InternalArduinoDSL.g:640:4: (lv_attr_0_0= ruleAttribute )
            {
            // InternalArduinoDSL.g:640:4: (lv_attr_0_0= ruleAttribute )
            // InternalArduinoDSL.g:641:5: lv_attr_0_0= ruleAttribute
            {

            					newCompositeNode(grammarAccess.getDeltaAccess().getAttrAttributeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_attr_0_0=ruleAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeltaRule());
            					}
            					set(
            						current,
            						"attr",
            						lv_attr_0_0,
            						"dk.sdu.mdsd.ArduinoDSL.Attribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getDeltaAccess().getDeltaKeyword_1());
            		

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
    // $ANTLR end "ruleDelta"


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalArduinoDSL.g:666:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // InternalArduinoDSL.g:666:54: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // InternalArduinoDSL.g:667:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;

             current =iv_ruleNumberLiteral; 
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
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // InternalArduinoDSL.g:673:1: ruleNumberLiteral returns [EObject current=null] : ( ( (lv_float_0_0= RULE_DECIMAL ) ) | ( (lv_int_1_0= RULE_INT ) ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_float_0_0=null;
        Token lv_int_1_0=null;


        	enterRule();

        try {
            // InternalArduinoDSL.g:679:2: ( ( ( (lv_float_0_0= RULE_DECIMAL ) ) | ( (lv_int_1_0= RULE_INT ) ) ) )
            // InternalArduinoDSL.g:680:2: ( ( (lv_float_0_0= RULE_DECIMAL ) ) | ( (lv_int_1_0= RULE_INT ) ) )
            {
            // InternalArduinoDSL.g:680:2: ( ( (lv_float_0_0= RULE_DECIMAL ) ) | ( (lv_int_1_0= RULE_INT ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_DECIMAL) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_INT) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalArduinoDSL.g:681:3: ( (lv_float_0_0= RULE_DECIMAL ) )
                    {
                    // InternalArduinoDSL.g:681:3: ( (lv_float_0_0= RULE_DECIMAL ) )
                    // InternalArduinoDSL.g:682:4: (lv_float_0_0= RULE_DECIMAL )
                    {
                    // InternalArduinoDSL.g:682:4: (lv_float_0_0= RULE_DECIMAL )
                    // InternalArduinoDSL.g:683:5: lv_float_0_0= RULE_DECIMAL
                    {
                    lv_float_0_0=(Token)match(input,RULE_DECIMAL,FOLLOW_2); 

                    					newLeafNode(lv_float_0_0, grammarAccess.getNumberLiteralAccess().getFloatDECIMALTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNumberLiteralRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"float",
                    						lv_float_0_0,
                    						"dk.sdu.mdsd.ArduinoDSL.DECIMAL");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalArduinoDSL.g:700:3: ( (lv_int_1_0= RULE_INT ) )
                    {
                    // InternalArduinoDSL.g:700:3: ( (lv_int_1_0= RULE_INT ) )
                    // InternalArduinoDSL.g:701:4: (lv_int_1_0= RULE_INT )
                    {
                    // InternalArduinoDSL.g:701:4: (lv_int_1_0= RULE_INT )
                    // InternalArduinoDSL.g:702:5: lv_int_1_0= RULE_INT
                    {
                    lv_int_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    					newLeafNode(lv_int_1_0, grammarAccess.getNumberLiteralAccess().getIntINTTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getNumberLiteralRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"int",
                    						lv_int_1_0,
                    						"org.eclipse.xtext.common.Terminals.INT");
                    				

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
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleNUMBER"
    // InternalArduinoDSL.g:722:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;


        try {
            // InternalArduinoDSL.g:722:46: (iv_ruleNUMBER= ruleNUMBER EOF )
            // InternalArduinoDSL.g:723:2: iv_ruleNUMBER= ruleNUMBER EOF
            {
             newCompositeNode(grammarAccess.getNUMBERRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNUMBER=ruleNUMBER();

            state._fsp--;

             current =iv_ruleNUMBER.getText(); 
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
    // $ANTLR end "entryRuleNUMBER"


    // $ANTLR start "ruleNUMBER"
    // InternalArduinoDSL.g:729:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalArduinoDSL.g:735:2: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // InternalArduinoDSL.g:736:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // InternalArduinoDSL.g:736:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // InternalArduinoDSL.g:737:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0());
            		
            // InternalArduinoDSL.g:744:3: (kw= '.' this_INT_2= RULE_INT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalArduinoDSL.g:745:4: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,24,FOLLOW_13); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getNUMBERAccess().getFullStopKeyword_1_0());
                    			
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_2);
                    			

                    				newLeafNode(this_INT_2, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_1());
                    			

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
    // $ANTLR end "ruleNUMBER"


    // $ANTLR start "entryRuleState"
    // InternalArduinoDSL.g:762:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalArduinoDSL.g:762:46: (iv_ruleState= ruleState EOF )
            // InternalArduinoDSL.g:763:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalArduinoDSL.g:769:1: ruleState returns [EObject current=null] : ( ( (lv_value_0_1= 'on' | lv_value_0_2= 'off' ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;


        	enterRule();

        try {
            // InternalArduinoDSL.g:775:2: ( ( ( (lv_value_0_1= 'on' | lv_value_0_2= 'off' ) ) ) )
            // InternalArduinoDSL.g:776:2: ( ( (lv_value_0_1= 'on' | lv_value_0_2= 'off' ) ) )
            {
            // InternalArduinoDSL.g:776:2: ( ( (lv_value_0_1= 'on' | lv_value_0_2= 'off' ) ) )
            // InternalArduinoDSL.g:777:3: ( (lv_value_0_1= 'on' | lv_value_0_2= 'off' ) )
            {
            // InternalArduinoDSL.g:777:3: ( (lv_value_0_1= 'on' | lv_value_0_2= 'off' ) )
            // InternalArduinoDSL.g:778:4: (lv_value_0_1= 'on' | lv_value_0_2= 'off' )
            {
            // InternalArduinoDSL.g:778:4: (lv_value_0_1= 'on' | lv_value_0_2= 'off' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            else if ( (LA11_0==26) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalArduinoDSL.g:779:5: lv_value_0_1= 'on'
                    {
                    lv_value_0_1=(Token)match(input,25,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getStateAccess().getValueOnKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStateRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalArduinoDSL.g:790:5: lv_value_0_2= 'off'
                    {
                    lv_value_0_2=(Token)match(input,26,FOLLOW_2); 

                    					newLeafNode(lv_value_0_2, grammarAccess.getStateAccess().getValueOffKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStateRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_2, null);
                    				

                    }
                    break;

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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleRuleBody"
    // InternalArduinoDSL.g:806:1: entryRuleRuleBody returns [EObject current=null] : iv_ruleRuleBody= ruleRuleBody EOF ;
    public final EObject entryRuleRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleBody = null;


        try {
            // InternalArduinoDSL.g:806:49: (iv_ruleRuleBody= ruleRuleBody EOF )
            // InternalArduinoDSL.g:807:2: iv_ruleRuleBody= ruleRuleBody EOF
            {
             newCompositeNode(grammarAccess.getRuleBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRuleBody=ruleRuleBody();

            state._fsp--;

             current =iv_ruleRuleBody; 
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
    // $ANTLR end "entryRuleRuleBody"


    // $ANTLR start "ruleRuleBody"
    // InternalArduinoDSL.g:813:1: ruleRuleBody returns [EObject current=null] : ( (lv_assignment_0_0= ruleAssignment ) )+ ;
    public final EObject ruleRuleBody() throws RecognitionException {
        EObject current = null;

        EObject lv_assignment_0_0 = null;



        	enterRule();

        try {
            // InternalArduinoDSL.g:819:2: ( ( (lv_assignment_0_0= ruleAssignment ) )+ )
            // InternalArduinoDSL.g:820:2: ( (lv_assignment_0_0= ruleAssignment ) )+
            {
            // InternalArduinoDSL.g:820:2: ( (lv_assignment_0_0= ruleAssignment ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalArduinoDSL.g:821:3: (lv_assignment_0_0= ruleAssignment )
            	    {
            	    // InternalArduinoDSL.g:821:3: (lv_assignment_0_0= ruleAssignment )
            	    // InternalArduinoDSL.g:822:4: lv_assignment_0_0= ruleAssignment
            	    {

            	    				newCompositeNode(grammarAccess.getRuleBodyAccess().getAssignmentAssignmentParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_14);
            	    lv_assignment_0_0=ruleAssignment();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getRuleBodyRule());
            	    				}
            	    				add(
            	    					current,
            	    					"assignment",
            	    					lv_assignment_0_0,
            	    					"dk.sdu.mdsd.ArduinoDSL.Assignment");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
    // $ANTLR end "ruleRuleBody"


    // $ANTLR start "entryRuleAssignment"
    // InternalArduinoDSL.g:842:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalArduinoDSL.g:842:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalArduinoDSL.g:843:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalArduinoDSL.g:849:1: ruleAssignment returns [EObject current=null] : ( ( (lv_attribute_0_0= ruleAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExp ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_attribute_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalArduinoDSL.g:855:2: ( ( ( (lv_attribute_0_0= ruleAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExp ) ) ) )
            // InternalArduinoDSL.g:856:2: ( ( (lv_attribute_0_0= ruleAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExp ) ) )
            {
            // InternalArduinoDSL.g:856:2: ( ( (lv_attribute_0_0= ruleAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExp ) ) )
            // InternalArduinoDSL.g:857:3: ( (lv_attribute_0_0= ruleAttribute ) ) otherlv_1= '=' ( (lv_value_2_0= ruleExp ) )
            {
            // InternalArduinoDSL.g:857:3: ( (lv_attribute_0_0= ruleAttribute ) )
            // InternalArduinoDSL.g:858:4: (lv_attribute_0_0= ruleAttribute )
            {
            // InternalArduinoDSL.g:858:4: (lv_attribute_0_0= ruleAttribute )
            // InternalArduinoDSL.g:859:5: lv_attribute_0_0= ruleAttribute
            {

            					newCompositeNode(grammarAccess.getAssignmentAccess().getAttributeAttributeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_attribute_0_0=ruleAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignmentRule());
            					}
            					set(
            						current,
            						"attribute",
            						lv_attribute_0_0,
            						"dk.sdu.mdsd.ArduinoDSL.Attribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1());
            		
            // InternalArduinoDSL.g:880:3: ( (lv_value_2_0= ruleExp ) )
            // InternalArduinoDSL.g:881:4: (lv_value_2_0= ruleExp )
            {
            // InternalArduinoDSL.g:881:4: (lv_value_2_0= ruleExp )
            // InternalArduinoDSL.g:882:5: lv_value_2_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getAssignmentAccess().getValueExpParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssignmentRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"dk.sdu.mdsd.ArduinoDSL.Exp");
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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleNode"
    // InternalArduinoDSL.g:903:1: entryRuleNode returns [EObject current=null] : iv_ruleNode= ruleNode EOF ;
    public final EObject entryRuleNode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNode = null;


        try {
            // InternalArduinoDSL.g:903:45: (iv_ruleNode= ruleNode EOF )
            // InternalArduinoDSL.g:904:2: iv_ruleNode= ruleNode EOF
            {
             newCompositeNode(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNode=ruleNode();

            state._fsp--;

             current =iv_ruleNode; 
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
    // $ANTLR end "entryRuleNode"


    // $ANTLR start "ruleNode"
    // InternalArduinoDSL.g:910:1: ruleNode returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_components_2_0= ruleComponent ) )+ otherlv_3= '}' ) ;
    public final EObject ruleNode() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_components_2_0 = null;



        	enterRule();

        try {
            // InternalArduinoDSL.g:916:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_components_2_0= ruleComponent ) )+ otherlv_3= '}' ) )
            // InternalArduinoDSL.g:917:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_components_2_0= ruleComponent ) )+ otherlv_3= '}' )
            {
            // InternalArduinoDSL.g:917:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_components_2_0= ruleComponent ) )+ otherlv_3= '}' )
            // InternalArduinoDSL.g:918:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( (lv_components_2_0= ruleComponent ) )+ otherlv_3= '}'
            {
            // InternalArduinoDSL.g:918:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalArduinoDSL.g:919:4: (lv_name_0_0= RULE_ID )
            {
            // InternalArduinoDSL.g:919:4: (lv_name_0_0= RULE_ID )
            // InternalArduinoDSL.g:920:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_0_0, grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalArduinoDSL.g:940:3: ( (lv_components_2_0= ruleComponent ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalArduinoDSL.g:941:4: (lv_components_2_0= ruleComponent )
            	    {
            	    // InternalArduinoDSL.g:941:4: (lv_components_2_0= ruleComponent )
            	    // InternalArduinoDSL.g:942:5: lv_components_2_0= ruleComponent
            	    {

            	    					newCompositeNode(grammarAccess.getNodeAccess().getComponentsComponentParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_components_2_0=ruleComponent();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getNodeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"components",
            	    						lv_components_2_0,
            	    						"dk.sdu.mdsd.ArduinoDSL.Component");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            otherlv_3=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleNode"


    // $ANTLR start "entryRuleComponent"
    // InternalArduinoDSL.g:967:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalArduinoDSL.g:967:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalArduinoDSL.g:968:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalArduinoDSL.g:974:1: ruleComponent returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_properties_1_0= ruleComponentBody ) ) ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        EObject lv_properties_1_0 = null;



        	enterRule();

        try {
            // InternalArduinoDSL.g:980:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_properties_1_0= ruleComponentBody ) ) ) )
            // InternalArduinoDSL.g:981:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_properties_1_0= ruleComponentBody ) ) )
            {
            // InternalArduinoDSL.g:981:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_properties_1_0= ruleComponentBody ) ) )
            // InternalArduinoDSL.g:982:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_properties_1_0= ruleComponentBody ) )
            {
            // InternalArduinoDSL.g:982:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalArduinoDSL.g:983:4: (lv_name_0_0= RULE_ID )
            {
            // InternalArduinoDSL.g:983:4: (lv_name_0_0= RULE_ID )
            // InternalArduinoDSL.g:984:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_0_0, grammarAccess.getComponentAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalArduinoDSL.g:1000:3: ( (lv_properties_1_0= ruleComponentBody ) )
            // InternalArduinoDSL.g:1001:4: (lv_properties_1_0= ruleComponentBody )
            {
            // InternalArduinoDSL.g:1001:4: (lv_properties_1_0= ruleComponentBody )
            // InternalArduinoDSL.g:1002:5: lv_properties_1_0= ruleComponentBody
            {

            					newCompositeNode(grammarAccess.getComponentAccess().getPropertiesComponentBodyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_properties_1_0=ruleComponentBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentRule());
            					}
            					set(
            						current,
            						"properties",
            						lv_properties_1_0,
            						"dk.sdu.mdsd.ArduinoDSL.ComponentBody");
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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleComponentBody"
    // InternalArduinoDSL.g:1023:1: entryRuleComponentBody returns [EObject current=null] : iv_ruleComponentBody= ruleComponentBody EOF ;
    public final EObject entryRuleComponentBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentBody = null;


        try {
            // InternalArduinoDSL.g:1023:54: (iv_ruleComponentBody= ruleComponentBody EOF )
            // InternalArduinoDSL.g:1024:2: iv_ruleComponentBody= ruleComponentBody EOF
            {
             newCompositeNode(grammarAccess.getComponentBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentBody=ruleComponentBody();

            state._fsp--;

             current =iv_ruleComponentBody; 
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
    // $ANTLR end "entryRuleComponentBody"


    // $ANTLR start "ruleComponentBody"
    // InternalArduinoDSL.g:1030:1: ruleComponentBody returns [EObject current=null] : ( ( (lv_io_0_0= RULE_IO ) ) ( (lv_type_1_0= RULE_TYPE ) ) otherlv_2= 'pin' ( (lv_pin_3_0= RULE_INT ) ) ( (lv_map_4_0= ruleMap ) )? ( (lv_rate_5_0= ruleRate ) )? ( (lv_smoothing_6_0= ruleSmoothing ) )? ) ;
    public final EObject ruleComponentBody() throws RecognitionException {
        EObject current = null;

        Token lv_io_0_0=null;
        Token lv_type_1_0=null;
        Token otherlv_2=null;
        Token lv_pin_3_0=null;
        EObject lv_map_4_0 = null;

        EObject lv_rate_5_0 = null;

        EObject lv_smoothing_6_0 = null;



        	enterRule();

        try {
            // InternalArduinoDSL.g:1036:2: ( ( ( (lv_io_0_0= RULE_IO ) ) ( (lv_type_1_0= RULE_TYPE ) ) otherlv_2= 'pin' ( (lv_pin_3_0= RULE_INT ) ) ( (lv_map_4_0= ruleMap ) )? ( (lv_rate_5_0= ruleRate ) )? ( (lv_smoothing_6_0= ruleSmoothing ) )? ) )
            // InternalArduinoDSL.g:1037:2: ( ( (lv_io_0_0= RULE_IO ) ) ( (lv_type_1_0= RULE_TYPE ) ) otherlv_2= 'pin' ( (lv_pin_3_0= RULE_INT ) ) ( (lv_map_4_0= ruleMap ) )? ( (lv_rate_5_0= ruleRate ) )? ( (lv_smoothing_6_0= ruleSmoothing ) )? )
            {
            // InternalArduinoDSL.g:1037:2: ( ( (lv_io_0_0= RULE_IO ) ) ( (lv_type_1_0= RULE_TYPE ) ) otherlv_2= 'pin' ( (lv_pin_3_0= RULE_INT ) ) ( (lv_map_4_0= ruleMap ) )? ( (lv_rate_5_0= ruleRate ) )? ( (lv_smoothing_6_0= ruleSmoothing ) )? )
            // InternalArduinoDSL.g:1038:3: ( (lv_io_0_0= RULE_IO ) ) ( (lv_type_1_0= RULE_TYPE ) ) otherlv_2= 'pin' ( (lv_pin_3_0= RULE_INT ) ) ( (lv_map_4_0= ruleMap ) )? ( (lv_rate_5_0= ruleRate ) )? ( (lv_smoothing_6_0= ruleSmoothing ) )?
            {
            // InternalArduinoDSL.g:1038:3: ( (lv_io_0_0= RULE_IO ) )
            // InternalArduinoDSL.g:1039:4: (lv_io_0_0= RULE_IO )
            {
            // InternalArduinoDSL.g:1039:4: (lv_io_0_0= RULE_IO )
            // InternalArduinoDSL.g:1040:5: lv_io_0_0= RULE_IO
            {
            lv_io_0_0=(Token)match(input,RULE_IO,FOLLOW_18); 

            					newLeafNode(lv_io_0_0, grammarAccess.getComponentBodyAccess().getIoIOTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentBodyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"io",
            						lv_io_0_0,
            						"dk.sdu.mdsd.ArduinoDSL.IO");
            				

            }


            }

            // InternalArduinoDSL.g:1056:3: ( (lv_type_1_0= RULE_TYPE ) )
            // InternalArduinoDSL.g:1057:4: (lv_type_1_0= RULE_TYPE )
            {
            // InternalArduinoDSL.g:1057:4: (lv_type_1_0= RULE_TYPE )
            // InternalArduinoDSL.g:1058:5: lv_type_1_0= RULE_TYPE
            {
            lv_type_1_0=(Token)match(input,RULE_TYPE,FOLLOW_19); 

            					newLeafNode(lv_type_1_0, grammarAccess.getComponentBodyAccess().getTypeTYPETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentBodyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_1_0,
            						"dk.sdu.mdsd.ArduinoDSL.TYPE");
            				

            }


            }

            otherlv_2=(Token)match(input,28,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getComponentBodyAccess().getPinKeyword_2());
            		
            // InternalArduinoDSL.g:1078:3: ( (lv_pin_3_0= RULE_INT ) )
            // InternalArduinoDSL.g:1079:4: (lv_pin_3_0= RULE_INT )
            {
            // InternalArduinoDSL.g:1079:4: (lv_pin_3_0= RULE_INT )
            // InternalArduinoDSL.g:1080:5: lv_pin_3_0= RULE_INT
            {
            lv_pin_3_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            					newLeafNode(lv_pin_3_0, grammarAccess.getComponentBodyAccess().getPinINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentBodyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"pin",
            						lv_pin_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalArduinoDSL.g:1096:3: ( (lv_map_4_0= ruleMap ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalArduinoDSL.g:1097:4: (lv_map_4_0= ruleMap )
                    {
                    // InternalArduinoDSL.g:1097:4: (lv_map_4_0= ruleMap )
                    // InternalArduinoDSL.g:1098:5: lv_map_4_0= ruleMap
                    {

                    					newCompositeNode(grammarAccess.getComponentBodyAccess().getMapMapParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_21);
                    lv_map_4_0=ruleMap();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getComponentBodyRule());
                    					}
                    					set(
                    						current,
                    						"map",
                    						lv_map_4_0,
                    						"dk.sdu.mdsd.ArduinoDSL.Map");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalArduinoDSL.g:1115:3: ( (lv_rate_5_0= ruleRate ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalArduinoDSL.g:1116:4: (lv_rate_5_0= ruleRate )
                    {
                    // InternalArduinoDSL.g:1116:4: (lv_rate_5_0= ruleRate )
                    // InternalArduinoDSL.g:1117:5: lv_rate_5_0= ruleRate
                    {

                    					newCompositeNode(grammarAccess.getComponentBodyAccess().getRateRateParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_22);
                    lv_rate_5_0=ruleRate();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getComponentBodyRule());
                    					}
                    					set(
                    						current,
                    						"rate",
                    						lv_rate_5_0,
                    						"dk.sdu.mdsd.ArduinoDSL.Rate");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalArduinoDSL.g:1134:3: ( (lv_smoothing_6_0= ruleSmoothing ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalArduinoDSL.g:1135:4: (lv_smoothing_6_0= ruleSmoothing )
                    {
                    // InternalArduinoDSL.g:1135:4: (lv_smoothing_6_0= ruleSmoothing )
                    // InternalArduinoDSL.g:1136:5: lv_smoothing_6_0= ruleSmoothing
                    {

                    					newCompositeNode(grammarAccess.getComponentBodyAccess().getSmoothingSmoothingParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_smoothing_6_0=ruleSmoothing();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getComponentBodyRule());
                    					}
                    					set(
                    						current,
                    						"smoothing",
                    						lv_smoothing_6_0,
                    						"dk.sdu.mdsd.ArduinoDSL.Smoothing");
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
    // $ANTLR end "ruleComponentBody"


    // $ANTLR start "entryRuleMap"
    // InternalArduinoDSL.g:1157:1: entryRuleMap returns [EObject current=null] : iv_ruleMap= ruleMap EOF ;
    public final EObject entryRuleMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMap = null;


        try {
            // InternalArduinoDSL.g:1157:44: (iv_ruleMap= ruleMap EOF )
            // InternalArduinoDSL.g:1158:2: iv_ruleMap= ruleMap EOF
            {
             newCompositeNode(grammarAccess.getMapRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMap=ruleMap();

            state._fsp--;

             current =iv_ruleMap; 
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
    // $ANTLR end "entryRuleMap"


    // $ANTLR start "ruleMap"
    // InternalArduinoDSL.g:1164:1: ruleMap returns [EObject current=null] : (otherlv_0= 'map' ( (lv_in_1_0= ruleRange ) ) otherlv_2= '=>' ( (lv_out_3_0= ruleRange ) ) ) ;
    public final EObject ruleMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_in_1_0 = null;

        EObject lv_out_3_0 = null;



        	enterRule();

        try {
            // InternalArduinoDSL.g:1170:2: ( (otherlv_0= 'map' ( (lv_in_1_0= ruleRange ) ) otherlv_2= '=>' ( (lv_out_3_0= ruleRange ) ) ) )
            // InternalArduinoDSL.g:1171:2: (otherlv_0= 'map' ( (lv_in_1_0= ruleRange ) ) otherlv_2= '=>' ( (lv_out_3_0= ruleRange ) ) )
            {
            // InternalArduinoDSL.g:1171:2: (otherlv_0= 'map' ( (lv_in_1_0= ruleRange ) ) otherlv_2= '=>' ( (lv_out_3_0= ruleRange ) ) )
            // InternalArduinoDSL.g:1172:3: otherlv_0= 'map' ( (lv_in_1_0= ruleRange ) ) otherlv_2= '=>' ( (lv_out_3_0= ruleRange ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getMapAccess().getMapKeyword_0());
            		
            // InternalArduinoDSL.g:1176:3: ( (lv_in_1_0= ruleRange ) )
            // InternalArduinoDSL.g:1177:4: (lv_in_1_0= ruleRange )
            {
            // InternalArduinoDSL.g:1177:4: (lv_in_1_0= ruleRange )
            // InternalArduinoDSL.g:1178:5: lv_in_1_0= ruleRange
            {

            					newCompositeNode(grammarAccess.getMapAccess().getInRangeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_23);
            lv_in_1_0=ruleRange();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMapRule());
            					}
            					set(
            						current,
            						"in",
            						lv_in_1_0,
            						"dk.sdu.mdsd.ArduinoDSL.Range");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getMapAccess().getEqualsSignGreaterThanSignKeyword_2());
            		
            // InternalArduinoDSL.g:1199:3: ( (lv_out_3_0= ruleRange ) )
            // InternalArduinoDSL.g:1200:4: (lv_out_3_0= ruleRange )
            {
            // InternalArduinoDSL.g:1200:4: (lv_out_3_0= ruleRange )
            // InternalArduinoDSL.g:1201:5: lv_out_3_0= ruleRange
            {

            					newCompositeNode(grammarAccess.getMapAccess().getOutRangeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_out_3_0=ruleRange();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMapRule());
            					}
            					set(
            						current,
            						"out",
            						lv_out_3_0,
            						"dk.sdu.mdsd.ArduinoDSL.Range");
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
    // $ANTLR end "ruleMap"


    // $ANTLR start "entryRuleRange"
    // InternalArduinoDSL.g:1222:1: entryRuleRange returns [EObject current=null] : iv_ruleRange= ruleRange EOF ;
    public final EObject entryRuleRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRange = null;


        try {
            // InternalArduinoDSL.g:1222:46: (iv_ruleRange= ruleRange EOF )
            // InternalArduinoDSL.g:1223:2: iv_ruleRange= ruleRange EOF
            {
             newCompositeNode(grammarAccess.getRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRange=ruleRange();

            state._fsp--;

             current =iv_ruleRange; 
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
    // $ANTLR end "entryRuleRange"


    // $ANTLR start "ruleRange"
    // InternalArduinoDSL.g:1229:1: ruleRange returns [EObject current=null] : ( ( (lv_low_0_0= ruleNUMBER ) ) otherlv_1= ':' ( (lv_high_2_0= ruleNUMBER ) ) ) ;
    public final EObject ruleRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_low_0_0 = null;

        AntlrDatatypeRuleToken lv_high_2_0 = null;



        	enterRule();

        try {
            // InternalArduinoDSL.g:1235:2: ( ( ( (lv_low_0_0= ruleNUMBER ) ) otherlv_1= ':' ( (lv_high_2_0= ruleNUMBER ) ) ) )
            // InternalArduinoDSL.g:1236:2: ( ( (lv_low_0_0= ruleNUMBER ) ) otherlv_1= ':' ( (lv_high_2_0= ruleNUMBER ) ) )
            {
            // InternalArduinoDSL.g:1236:2: ( ( (lv_low_0_0= ruleNUMBER ) ) otherlv_1= ':' ( (lv_high_2_0= ruleNUMBER ) ) )
            // InternalArduinoDSL.g:1237:3: ( (lv_low_0_0= ruleNUMBER ) ) otherlv_1= ':' ( (lv_high_2_0= ruleNUMBER ) )
            {
            // InternalArduinoDSL.g:1237:3: ( (lv_low_0_0= ruleNUMBER ) )
            // InternalArduinoDSL.g:1238:4: (lv_low_0_0= ruleNUMBER )
            {
            // InternalArduinoDSL.g:1238:4: (lv_low_0_0= ruleNUMBER )
            // InternalArduinoDSL.g:1239:5: lv_low_0_0= ruleNUMBER
            {

            					newCompositeNode(grammarAccess.getRangeAccess().getLowNUMBERParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_24);
            lv_low_0_0=ruleNUMBER();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRangeRule());
            					}
            					set(
            						current,
            						"low",
            						lv_low_0_0,
            						"dk.sdu.mdsd.ArduinoDSL.NUMBER");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getRangeAccess().getColonKeyword_1());
            		
            // InternalArduinoDSL.g:1260:3: ( (lv_high_2_0= ruleNUMBER ) )
            // InternalArduinoDSL.g:1261:4: (lv_high_2_0= ruleNUMBER )
            {
            // InternalArduinoDSL.g:1261:4: (lv_high_2_0= ruleNUMBER )
            // InternalArduinoDSL.g:1262:5: lv_high_2_0= ruleNUMBER
            {

            					newCompositeNode(grammarAccess.getRangeAccess().getHighNUMBERParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_high_2_0=ruleNUMBER();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRangeRule());
            					}
            					set(
            						current,
            						"high",
            						lv_high_2_0,
            						"dk.sdu.mdsd.ArduinoDSL.NUMBER");
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
    // $ANTLR end "ruleRange"


    // $ANTLR start "entryRuleRate"
    // InternalArduinoDSL.g:1283:1: entryRuleRate returns [EObject current=null] : iv_ruleRate= ruleRate EOF ;
    public final EObject entryRuleRate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRate = null;


        try {
            // InternalArduinoDSL.g:1283:45: (iv_ruleRate= ruleRate EOF )
            // InternalArduinoDSL.g:1284:2: iv_ruleRate= ruleRate EOF
            {
             newCompositeNode(grammarAccess.getRateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRate=ruleRate();

            state._fsp--;

             current =iv_ruleRate; 
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
    // $ANTLR end "entryRuleRate"


    // $ANTLR start "ruleRate"
    // InternalArduinoDSL.g:1290:1: ruleRate returns [EObject current=null] : (otherlv_0= 'rate' ( (lv_value_1_0= RULE_INT ) ) ) ;
    public final EObject ruleRate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_0=null;


        	enterRule();

        try {
            // InternalArduinoDSL.g:1296:2: ( (otherlv_0= 'rate' ( (lv_value_1_0= RULE_INT ) ) ) )
            // InternalArduinoDSL.g:1297:2: (otherlv_0= 'rate' ( (lv_value_1_0= RULE_INT ) ) )
            {
            // InternalArduinoDSL.g:1297:2: (otherlv_0= 'rate' ( (lv_value_1_0= RULE_INT ) ) )
            // InternalArduinoDSL.g:1298:3: otherlv_0= 'rate' ( (lv_value_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getRateAccess().getRateKeyword_0());
            		
            // InternalArduinoDSL.g:1302:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalArduinoDSL.g:1303:4: (lv_value_1_0= RULE_INT )
            {
            // InternalArduinoDSL.g:1303:4: (lv_value_1_0= RULE_INT )
            // InternalArduinoDSL.g:1304:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_1_0, grammarAccess.getRateAccess().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleRate"


    // $ANTLR start "entryRuleSmoothing"
    // InternalArduinoDSL.g:1324:1: entryRuleSmoothing returns [EObject current=null] : iv_ruleSmoothing= ruleSmoothing EOF ;
    public final EObject entryRuleSmoothing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSmoothing = null;


        try {
            // InternalArduinoDSL.g:1324:50: (iv_ruleSmoothing= ruleSmoothing EOF )
            // InternalArduinoDSL.g:1325:2: iv_ruleSmoothing= ruleSmoothing EOF
            {
             newCompositeNode(grammarAccess.getSmoothingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSmoothing=ruleSmoothing();

            state._fsp--;

             current =iv_ruleSmoothing; 
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
    // $ANTLR end "entryRuleSmoothing"


    // $ANTLR start "ruleSmoothing"
    // InternalArduinoDSL.g:1331:1: ruleSmoothing returns [EObject current=null] : (otherlv_0= 'smoothing' ( (lv_value_1_0= ruleNUMBER ) ) ) ;
    public final EObject ruleSmoothing() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalArduinoDSL.g:1337:2: ( (otherlv_0= 'smoothing' ( (lv_value_1_0= ruleNUMBER ) ) ) )
            // InternalArduinoDSL.g:1338:2: (otherlv_0= 'smoothing' ( (lv_value_1_0= ruleNUMBER ) ) )
            {
            // InternalArduinoDSL.g:1338:2: (otherlv_0= 'smoothing' ( (lv_value_1_0= ruleNUMBER ) ) )
            // InternalArduinoDSL.g:1339:3: otherlv_0= 'smoothing' ( (lv_value_1_0= ruleNUMBER ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getSmoothingAccess().getSmoothingKeyword_0());
            		
            // InternalArduinoDSL.g:1343:3: ( (lv_value_1_0= ruleNUMBER ) )
            // InternalArduinoDSL.g:1344:4: (lv_value_1_0= ruleNUMBER )
            {
            // InternalArduinoDSL.g:1344:4: (lv_value_1_0= ruleNUMBER )
            // InternalArduinoDSL.g:1345:5: lv_value_1_0= ruleNUMBER
            {

            					newCompositeNode(grammarAccess.getSmoothingAccess().getValueNUMBERParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_1_0=ruleNUMBER();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSmoothingRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_1_0,
            						"dk.sdu.mdsd.ArduinoDSL.NUMBER");
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
    // $ANTLR end "ruleSmoothing"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000018022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000060000E0L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000600002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000320000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});

}