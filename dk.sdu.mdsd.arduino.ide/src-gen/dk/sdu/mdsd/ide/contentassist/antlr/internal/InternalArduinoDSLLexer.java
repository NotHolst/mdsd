package dk.sdu.mdsd.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalArduinoDSLLexer extends Lexer {
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

    public InternalArduinoDSLLexer() {;} 
    public InternalArduinoDSLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalArduinoDSLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalArduinoDSL.g"; }

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoDSL.g:11:7: ( 'when' )
            // InternalArduinoDSL.g:11:9: 'when'
            {
            match("when"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoDSL.g:12:7: ( 'once' )
            // InternalArduinoDSL.g:12:9: 'once'
            {
            match("once"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoDSL.g:13:7: ( 'on' )
            // InternalArduinoDSL.g:13:9: 'on'
            {
            match("on"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoDSL.g:14:7: ( 'off' )
            // InternalArduinoDSL.g:14:9: 'off'
            {
            match("off"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoDSL.g:15:7: ( '{' )
            // InternalArduinoDSL.g:15:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoDSL.g:16:7: ( '}' )
            // InternalArduinoDSL.g:16:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoDSL.g:17:7: ( '+' )
            // InternalArduinoDSL.g:17:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoDSL.g:18:7: ( '-' )
            // InternalArduinoDSL.g:18:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoDSL.g:19:7: ( '*' )
            // InternalArduinoDSL.g:19:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoDSL.g:20:7: ( '/' )
            // InternalArduinoDSL.g:20:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoDSL.g:21:7: ( 'delta' )
            // InternalArduinoDSL.g:21:9: 'delta'
            {
            match("delta"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoDSL.g:22:7: ( '.' )
            // InternalArduinoDSL.g:22:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoDSL.g:23:7: ( '=' )
            // InternalArduinoDSL.g:23:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoDSL.g:24:7: ( 'pin' )
            // InternalArduinoDSL.g:24:9: 'pin'
            {
            match("pin"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoDSL.g:25:7: ( 'map' )
            // InternalArduinoDSL.g:25:9: 'map'
            {
            match("map"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoDSL.g:26:7: ( '=>' )
            // InternalArduinoDSL.g:26:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoDSL.g:27:7: ( ':' )
            // InternalArduinoDSL.g:27:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoDSL.g:28:7: ( 'rate' )
            // InternalArduinoDSL.g:28:9: 'rate'
            {
            match("rate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoDSL.g:29:7: ( 'smoothing' )
            // InternalArduinoDSL.g:29:9: 'smoothing'
            {
            match("smoothing"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "RULE_BOOLEAN_OPERATOR"
    public final void mRULE_BOOLEAN_OPERATOR() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoDSL.g:2970:23: ( ( '<' | '>' | '>=' | '<=' | '==' | '!=' ) )
            // InternalArduinoDSL.g:2970:25: ( '<' | '>' | '>=' | '<=' | '==' | '!=' )
            {
            // InternalArduinoDSL.g:2970:25: ( '<' | '>' | '>=' | '<=' | '==' | '!=' )
            int alt1=6;
            switch ( input.LA(1) ) {
            case '<':
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='=') ) {
                    alt1=4;
                }
                else {
                    alt1=1;}
                }
                break;
            case '>':
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2=='=') ) {
                    alt1=3;
                }
                else {
                    alt1=2;}
                }
                break;
            case '=':
                {
                alt1=5;
                }
                break;
            case '!':
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalArduinoDSL.g:2970:26: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 2 :
                    // InternalArduinoDSL.g:2970:30: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 3 :
                    // InternalArduinoDSL.g:2970:34: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 4 :
                    // InternalArduinoDSL.g:2970:39: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 5 :
                    // InternalArduinoDSL.g:2970:44: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 6 :
                    // InternalArduinoDSL.g:2970:49: '!='
                    {
                    match("!="); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_BOOLEAN_OPERATOR"

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoDSL.g:2972:14: ( RULE_INT '.' RULE_INT )
            // InternalArduinoDSL.g:2972:16: RULE_INT '.' RULE_INT
            {
            mRULE_INT(); 
            match('.'); 
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "RULE_IO"
    public final void mRULE_IO() throws RecognitionException {
        try {
            int _type = RULE_IO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoDSL.g:2974:9: ( ( 'input' | 'output' ) )
            // InternalArduinoDSL.g:2974:11: ( 'input' | 'output' )
            {
            // InternalArduinoDSL.g:2974:11: ( 'input' | 'output' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='i') ) {
                alt2=1;
            }
            else if ( (LA2_0=='o') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalArduinoDSL.g:2974:12: 'input'
                    {
                    match("input"); 


                    }
                    break;
                case 2 :
                    // InternalArduinoDSL.g:2974:20: 'output'
                    {
                    match("output"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_IO"

    // $ANTLR start "RULE_TYPE"
    public final void mRULE_TYPE() throws RecognitionException {
        try {
            int _type = RULE_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoDSL.g:2976:11: ( ( 'analog' | 'digital' ) )
            // InternalArduinoDSL.g:2976:13: ( 'analog' | 'digital' )
            {
            // InternalArduinoDSL.g:2976:13: ( 'analog' | 'digital' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='a') ) {
                alt3=1;
            }
            else if ( (LA3_0=='d') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalArduinoDSL.g:2976:14: 'analog'
                    {
                    match("analog"); 


                    }
                    break;
                case 2 :
                    // InternalArduinoDSL.g:2976:23: 'digital'
                    {
                    match("digital"); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TYPE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoDSL.g:2978:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalArduinoDSL.g:2978:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalArduinoDSL.g:2978:11: ( '^' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='^') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalArduinoDSL.g:2978:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalArduinoDSL.g:2978:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||LA5_0=='_'||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalArduinoDSL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoDSL.g:2980:10: ( ( '0' .. '9' )+ )
            // InternalArduinoDSL.g:2980:12: ( '0' .. '9' )+
            {
            // InternalArduinoDSL.g:2980:12: ( '0' .. '9' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalArduinoDSL.g:2980:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoDSL.g:2982:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalArduinoDSL.g:2982:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalArduinoDSL.g:2982:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='\"') ) {
                alt9=1;
            }
            else if ( (LA9_0=='\'') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalArduinoDSL.g:2982:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalArduinoDSL.g:2982:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalArduinoDSL.g:2982:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalArduinoDSL.g:2982:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalArduinoDSL.g:2982:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalArduinoDSL.g:2982:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='&')||(LA8_0>='(' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalArduinoDSL.g:2982:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalArduinoDSL.g:2982:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoDSL.g:2984:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalArduinoDSL.g:2984:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalArduinoDSL.g:2984:24: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalArduinoDSL.g:2984:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoDSL.g:2986:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalArduinoDSL.g:2986:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalArduinoDSL.g:2986:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\f')||(LA11_0>='\u000E' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalArduinoDSL.g:2986:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalArduinoDSL.g:2986:40: ( ( '\\r' )? '\\n' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\n'||LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalArduinoDSL.g:2986:41: ( '\\r' )? '\\n'
                    {
                    // InternalArduinoDSL.g:2986:41: ( '\\r' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='\r') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalArduinoDSL.g:2986:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoDSL.g:2988:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalArduinoDSL.g:2988:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalArduinoDSL.g:2988:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalArduinoDSL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoDSL.g:2990:16: ( . )
            // InternalArduinoDSL.g:2990:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalArduinoDSL.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | RULE_BOOLEAN_OPERATOR | RULE_DECIMAL | RULE_IO | RULE_TYPE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt15=30;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // InternalArduinoDSL.g:1:10: T__15
                {
                mT__15(); 

                }
                break;
            case 2 :
                // InternalArduinoDSL.g:1:16: T__16
                {
                mT__16(); 

                }
                break;
            case 3 :
                // InternalArduinoDSL.g:1:22: T__17
                {
                mT__17(); 

                }
                break;
            case 4 :
                // InternalArduinoDSL.g:1:28: T__18
                {
                mT__18(); 

                }
                break;
            case 5 :
                // InternalArduinoDSL.g:1:34: T__19
                {
                mT__19(); 

                }
                break;
            case 6 :
                // InternalArduinoDSL.g:1:40: T__20
                {
                mT__20(); 

                }
                break;
            case 7 :
                // InternalArduinoDSL.g:1:46: T__21
                {
                mT__21(); 

                }
                break;
            case 8 :
                // InternalArduinoDSL.g:1:52: T__22
                {
                mT__22(); 

                }
                break;
            case 9 :
                // InternalArduinoDSL.g:1:58: T__23
                {
                mT__23(); 

                }
                break;
            case 10 :
                // InternalArduinoDSL.g:1:64: T__24
                {
                mT__24(); 

                }
                break;
            case 11 :
                // InternalArduinoDSL.g:1:70: T__25
                {
                mT__25(); 

                }
                break;
            case 12 :
                // InternalArduinoDSL.g:1:76: T__26
                {
                mT__26(); 

                }
                break;
            case 13 :
                // InternalArduinoDSL.g:1:82: T__27
                {
                mT__27(); 

                }
                break;
            case 14 :
                // InternalArduinoDSL.g:1:88: T__28
                {
                mT__28(); 

                }
                break;
            case 15 :
                // InternalArduinoDSL.g:1:94: T__29
                {
                mT__29(); 

                }
                break;
            case 16 :
                // InternalArduinoDSL.g:1:100: T__30
                {
                mT__30(); 

                }
                break;
            case 17 :
                // InternalArduinoDSL.g:1:106: T__31
                {
                mT__31(); 

                }
                break;
            case 18 :
                // InternalArduinoDSL.g:1:112: T__32
                {
                mT__32(); 

                }
                break;
            case 19 :
                // InternalArduinoDSL.g:1:118: T__33
                {
                mT__33(); 

                }
                break;
            case 20 :
                // InternalArduinoDSL.g:1:124: RULE_BOOLEAN_OPERATOR
                {
                mRULE_BOOLEAN_OPERATOR(); 

                }
                break;
            case 21 :
                // InternalArduinoDSL.g:1:146: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 22 :
                // InternalArduinoDSL.g:1:159: RULE_IO
                {
                mRULE_IO(); 

                }
                break;
            case 23 :
                // InternalArduinoDSL.g:1:167: RULE_TYPE
                {
                mRULE_TYPE(); 

                }
                break;
            case 24 :
                // InternalArduinoDSL.g:1:177: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 25 :
                // InternalArduinoDSL.g:1:185: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 26 :
                // InternalArduinoDSL.g:1:194: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 27 :
                // InternalArduinoDSL.g:1:206: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 28 :
                // InternalArduinoDSL.g:1:222: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 29 :
                // InternalArduinoDSL.g:1:238: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 30 :
                // InternalArduinoDSL.g:1:246: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\1\uffff\2\36\5\uffff\1\51\1\36\1\uffff\1\57\2\36\1\uffff\2\36\2\uffff\1\34\1\65\2\36\1\34\1\uffff\2\34\2\uffff\1\36\1\uffff\1\76\2\36\10\uffff\2\36\4\uffff\2\36\1\uffff\2\36\2\uffff\1\65\2\36\2\uffff\2\36\1\uffff\1\113\3\36\1\117\1\120\4\36\1\125\1\126\1\uffff\3\36\2\uffff\1\132\3\36\2\uffff\1\36\1\137\1\36\1\uffff\1\36\1\142\1\36\1\142\1\uffff\2\36\1\uffff\2\146\1\36\1\uffff\1\36\1\151\1\uffff";
    static final String DFA15_eofS =
        "\152\uffff";
    static final String DFA15_minS =
        "\1\0\1\150\1\146\5\uffff\1\52\1\145\1\uffff\1\75\1\151\1\141\1\uffff\1\141\1\155\2\uffff\1\75\1\56\2\156\1\101\1\uffff\2\0\2\uffff\1\145\1\uffff\1\60\1\146\1\164\10\uffff\1\154\1\147\4\uffff\1\156\1\160\1\uffff\1\164\1\157\2\uffff\1\56\1\160\1\141\2\uffff\1\156\1\145\1\uffff\1\60\1\160\1\164\1\151\2\60\1\145\1\157\1\165\1\154\2\60\1\uffff\1\165\1\141\1\164\2\uffff\1\60\2\164\1\157\2\uffff\1\164\1\60\1\141\1\uffff\1\150\1\60\1\147\1\60\1\uffff\1\154\1\151\1\uffff\2\60\1\156\1\uffff\1\147\1\60\1\uffff";
    static final String DFA15_maxS =
        "\1\uffff\1\150\1\165\5\uffff\1\57\1\151\1\uffff\1\76\1\151\1\141\1\uffff\1\141\1\155\2\uffff\1\75\1\71\2\156\1\172\1\uffff\2\uffff\2\uffff\1\145\1\uffff\1\172\1\146\1\164\10\uffff\1\154\1\147\4\uffff\1\156\1\160\1\uffff\1\164\1\157\2\uffff\1\71\1\160\1\141\2\uffff\1\156\1\145\1\uffff\1\172\1\160\1\164\1\151\2\172\1\145\1\157\1\165\1\154\2\172\1\uffff\1\165\1\141\1\164\2\uffff\1\172\2\164\1\157\2\uffff\1\164\1\172\1\141\1\uffff\1\150\1\172\1\147\1\172\1\uffff\1\154\1\151\1\uffff\2\172\1\156\1\uffff\1\147\1\172\1\uffff";
    static final String DFA15_acceptS =
        "\3\uffff\1\5\1\6\1\7\1\10\1\11\2\uffff\1\14\3\uffff\1\21\2\uffff\2\24\5\uffff\1\30\2\uffff\1\35\1\36\1\uffff\1\30\3\uffff\1\5\1\6\1\7\1\10\1\11\1\33\1\34\1\12\2\uffff\1\14\1\20\1\24\1\15\2\uffff\1\21\2\uffff\1\31\1\25\3\uffff\1\32\1\35\2\uffff\1\3\14\uffff\1\4\3\uffff\1\16\1\17\4\uffff\1\1\1\2\3\uffff\1\22\4\uffff\1\13\2\uffff\1\26\3\uffff\1\27\2\uffff\1\23";
    static final String DFA15_specialS =
        "\1\0\30\uffff\1\2\1\1\117\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\34\2\33\2\34\1\33\22\34\1\33\1\23\1\31\4\34\1\32\2\34\1\7\1\5\1\34\1\6\1\12\1\10\12\24\1\16\1\34\1\21\1\13\1\22\2\34\32\30\3\34\1\27\1\30\1\34\1\26\2\30\1\11\4\30\1\25\3\30\1\15\1\30\1\2\1\14\1\30\1\17\1\20\3\30\1\1\3\30\1\3\1\34\1\4\uff82\34",
            "\1\35",
            "\1\40\7\uffff\1\37\6\uffff\1\41",
            "",
            "",
            "",
            "",
            "",
            "\1\47\4\uffff\1\50",
            "\1\52\3\uffff\1\53",
            "",
            "\1\56\1\55",
            "\1\60",
            "\1\61",
            "",
            "\1\63",
            "\1\64",
            "",
            "",
            "\1\56",
            "\1\66\1\uffff\12\67",
            "\1\70",
            "\1\71",
            "\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\0\72",
            "\0\72",
            "",
            "",
            "\1\74",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\2\36\1\75\27\36",
            "\1\77",
            "\1\100",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\101",
            "\1\102",
            "",
            "",
            "",
            "",
            "\1\103",
            "\1\104",
            "",
            "\1\105",
            "\1\106",
            "",
            "",
            "\1\66\1\uffff\12\67",
            "\1\107",
            "\1\110",
            "",
            "",
            "\1\111",
            "\1\112",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\114",
            "\1\115",
            "\1\116",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\127",
            "\1\130",
            "\1\131",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\133",
            "\1\134",
            "\1\135",
            "",
            "",
            "\1\136",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\140",
            "",
            "\1\141",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\143",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\144",
            "\1\145",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\147",
            "",
            "\1\150",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | RULE_BOOLEAN_OPERATOR | RULE_DECIMAL | RULE_IO | RULE_TYPE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='w') ) {s = 1;}

                        else if ( (LA15_0=='o') ) {s = 2;}

                        else if ( (LA15_0=='{') ) {s = 3;}

                        else if ( (LA15_0=='}') ) {s = 4;}

                        else if ( (LA15_0=='+') ) {s = 5;}

                        else if ( (LA15_0=='-') ) {s = 6;}

                        else if ( (LA15_0=='*') ) {s = 7;}

                        else if ( (LA15_0=='/') ) {s = 8;}

                        else if ( (LA15_0=='d') ) {s = 9;}

                        else if ( (LA15_0=='.') ) {s = 10;}

                        else if ( (LA15_0=='=') ) {s = 11;}

                        else if ( (LA15_0=='p') ) {s = 12;}

                        else if ( (LA15_0=='m') ) {s = 13;}

                        else if ( (LA15_0==':') ) {s = 14;}

                        else if ( (LA15_0=='r') ) {s = 15;}

                        else if ( (LA15_0=='s') ) {s = 16;}

                        else if ( (LA15_0=='<') ) {s = 17;}

                        else if ( (LA15_0=='>') ) {s = 18;}

                        else if ( (LA15_0=='!') ) {s = 19;}

                        else if ( ((LA15_0>='0' && LA15_0<='9')) ) {s = 20;}

                        else if ( (LA15_0=='i') ) {s = 21;}

                        else if ( (LA15_0=='a') ) {s = 22;}

                        else if ( (LA15_0=='^') ) {s = 23;}

                        else if ( ((LA15_0>='A' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='b' && LA15_0<='c')||(LA15_0>='e' && LA15_0<='h')||(LA15_0>='j' && LA15_0<='l')||LA15_0=='n'||LA15_0=='q'||(LA15_0>='t' && LA15_0<='v')||(LA15_0>='x' && LA15_0<='z')) ) {s = 24;}

                        else if ( (LA15_0=='\"') ) {s = 25;}

                        else if ( (LA15_0=='\'') ) {s = 26;}

                        else if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {s = 27;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\u001F')||(LA15_0>='#' && LA15_0<='&')||(LA15_0>='(' && LA15_0<=')')||LA15_0==','||LA15_0==';'||(LA15_0>='?' && LA15_0<='@')||(LA15_0>='[' && LA15_0<=']')||LA15_0=='`'||LA15_0=='|'||(LA15_0>='~' && LA15_0<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_26 = input.LA(1);

                        s = -1;
                        if ( ((LA15_26>='\u0000' && LA15_26<='\uFFFF')) ) {s = 58;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA15_25 = input.LA(1);

                        s = -1;
                        if ( ((LA15_25>='\u0000' && LA15_25<='\uFFFF')) ) {s = 58;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}