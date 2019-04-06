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
            // InternalArduinoDSL.g:13:7: ( '{' )
            // InternalArduinoDSL.g:13:9: '{'
            {
            match('{'); 

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
            // InternalArduinoDSL.g:14:7: ( '}' )
            // InternalArduinoDSL.g:14:9: '}'
            {
            match('}'); 

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
            // InternalArduinoDSL.g:15:7: ( '+' )
            // InternalArduinoDSL.g:15:9: '+'
            {
            match('+'); 

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
            // InternalArduinoDSL.g:16:7: ( '-' )
            // InternalArduinoDSL.g:16:9: '-'
            {
            match('-'); 

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
            // InternalArduinoDSL.g:17:7: ( '*' )
            // InternalArduinoDSL.g:17:9: '*'
            {
            match('*'); 

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
            // InternalArduinoDSL.g:18:7: ( '/' )
            // InternalArduinoDSL.g:18:9: '/'
            {
            match('/'); 

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
            // InternalArduinoDSL.g:19:7: ( 'delta' )
            // InternalArduinoDSL.g:19:9: 'delta'
            {
            match("delta"); 


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
            // InternalArduinoDSL.g:20:7: ( '.' )
            // InternalArduinoDSL.g:20:9: '.'
            {
            match('.'); 

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
            // InternalArduinoDSL.g:21:7: ( '=' )
            // InternalArduinoDSL.g:21:9: '='
            {
            match('='); 

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
            // InternalArduinoDSL.g:22:7: ( 'pin' )
            // InternalArduinoDSL.g:22:9: 'pin'
            {
            match("pin"); 


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
            // InternalArduinoDSL.g:23:7: ( 'map' )
            // InternalArduinoDSL.g:23:9: 'map'
            {
            match("map"); 


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
            // InternalArduinoDSL.g:24:7: ( '=>' )
            // InternalArduinoDSL.g:24:9: '=>'
            {
            match("=>"); 


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
            // InternalArduinoDSL.g:25:7: ( ':' )
            // InternalArduinoDSL.g:25:9: ':'
            {
            match(':'); 

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
            // InternalArduinoDSL.g:26:7: ( 'rate' )
            // InternalArduinoDSL.g:26:9: 'rate'
            {
            match("rate"); 


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
            // InternalArduinoDSL.g:27:7: ( 'smoothing' )
            // InternalArduinoDSL.g:27:9: 'smoothing'
            {
            match("smoothing"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "RULE_BOOLEAN_OPERATOR"
    public final void mRULE_BOOLEAN_OPERATOR() throws RecognitionException {
        try {
            int _type = RULE_BOOLEAN_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoDSL.g:2926:23: ( ( '<' | '>' | '>=' | '<=' | '==' | '!=' ) )
            // InternalArduinoDSL.g:2926:25: ( '<' | '>' | '>=' | '<=' | '==' | '!=' )
            {
            // InternalArduinoDSL.g:2926:25: ( '<' | '>' | '>=' | '<=' | '==' | '!=' )
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
                    // InternalArduinoDSL.g:2926:26: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 2 :
                    // InternalArduinoDSL.g:2926:30: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 3 :
                    // InternalArduinoDSL.g:2926:34: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 4 :
                    // InternalArduinoDSL.g:2926:39: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 5 :
                    // InternalArduinoDSL.g:2926:44: '=='
                    {
                    match("=="); 


                    }
                    break;
                case 6 :
                    // InternalArduinoDSL.g:2926:49: '!='
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

    // $ANTLR start "RULE_STATE"
    public final void mRULE_STATE() throws RecognitionException {
        try {
            int _type = RULE_STATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoDSL.g:2928:12: ( ( 'on' | 'off' ) )
            // InternalArduinoDSL.g:2928:14: ( 'on' | 'off' )
            {
            // InternalArduinoDSL.g:2928:14: ( 'on' | 'off' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='o') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='n') ) {
                    alt2=1;
                }
                else if ( (LA2_1=='f') ) {
                    alt2=2;
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
                    // InternalArduinoDSL.g:2928:15: 'on'
                    {
                    match("on"); 


                    }
                    break;
                case 2 :
                    // InternalArduinoDSL.g:2928:20: 'off'
                    {
                    match("off"); 


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
    // $ANTLR end "RULE_STATE"

    // $ANTLR start "RULE_IO"
    public final void mRULE_IO() throws RecognitionException {
        try {
            int _type = RULE_IO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalArduinoDSL.g:2930:9: ( ( 'input' | 'output' ) )
            // InternalArduinoDSL.g:2930:11: ( 'input' | 'output' )
            {
            // InternalArduinoDSL.g:2930:11: ( 'input' | 'output' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='i') ) {
                alt3=1;
            }
            else if ( (LA3_0=='o') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalArduinoDSL.g:2930:12: 'input'
                    {
                    match("input"); 


                    }
                    break;
                case 2 :
                    // InternalArduinoDSL.g:2930:20: 'output'
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
            // InternalArduinoDSL.g:2932:11: ( ( 'analog' | 'digital' ) )
            // InternalArduinoDSL.g:2932:13: ( 'analog' | 'digital' )
            {
            // InternalArduinoDSL.g:2932:13: ( 'analog' | 'digital' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='a') ) {
                alt4=1;
            }
            else if ( (LA4_0=='d') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalArduinoDSL.g:2932:14: 'analog'
                    {
                    match("analog"); 


                    }
                    break;
                case 2 :
                    // InternalArduinoDSL.g:2932:23: 'digital'
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
            // InternalArduinoDSL.g:2934:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalArduinoDSL.g:2934:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalArduinoDSL.g:2934:11: ( '^' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='^') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalArduinoDSL.g:2934:11: '^'
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

            // InternalArduinoDSL.g:2934:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='z')) ) {
                    alt6=1;
                }


                switch (alt6) {
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
            	    break loop6;
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
            // InternalArduinoDSL.g:2936:10: ( ( '0' .. '9' )+ )
            // InternalArduinoDSL.g:2936:12: ( '0' .. '9' )+
            {
            // InternalArduinoDSL.g:2936:12: ( '0' .. '9' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalArduinoDSL.g:2936:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
            // InternalArduinoDSL.g:2938:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalArduinoDSL.g:2938:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalArduinoDSL.g:2938:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\"') ) {
                alt10=1;
            }
            else if ( (LA10_0=='\'') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalArduinoDSL.g:2938:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalArduinoDSL.g:2938:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop8:
                    do {
                        int alt8=3;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='\\') ) {
                            alt8=1;
                        }
                        else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                            alt8=2;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalArduinoDSL.g:2938:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalArduinoDSL.g:2938:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop8;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalArduinoDSL.g:2938:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalArduinoDSL.g:2938:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop9:
                    do {
                        int alt9=3;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='\\') ) {
                            alt9=1;
                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                            alt9=2;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalArduinoDSL.g:2938:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalArduinoDSL.g:2938:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop9;
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
            // InternalArduinoDSL.g:2940:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalArduinoDSL.g:2940:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalArduinoDSL.g:2940:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalArduinoDSL.g:2940:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
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
            // InternalArduinoDSL.g:2942:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalArduinoDSL.g:2942:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalArduinoDSL.g:2942:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalArduinoDSL.g:2942:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop12;
                }
            } while (true);

            // InternalArduinoDSL.g:2942:40: ( ( '\\r' )? '\\n' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalArduinoDSL.g:2942:41: ( '\\r' )? '\\n'
                    {
                    // InternalArduinoDSL.g:2942:41: ( '\\r' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0=='\r') ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalArduinoDSL.g:2942:41: '\\r'
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
            // InternalArduinoDSL.g:2944:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalArduinoDSL.g:2944:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalArduinoDSL.g:2944:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||LA15_0=='\r'||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
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
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
            // InternalArduinoDSL.g:2946:16: ( . )
            // InternalArduinoDSL.g:2946:18: .
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
        // InternalArduinoDSL.g:1:8: ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | RULE_BOOLEAN_OPERATOR | RULE_STATE | RULE_IO | RULE_TYPE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt16=28;
        alt16 = dfa16.predict(input);
        switch (alt16) {
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
                // InternalArduinoDSL.g:1:112: RULE_BOOLEAN_OPERATOR
                {
                mRULE_BOOLEAN_OPERATOR(); 

                }
                break;
            case 19 :
                // InternalArduinoDSL.g:1:134: RULE_STATE
                {
                mRULE_STATE(); 

                }
                break;
            case 20 :
                // InternalArduinoDSL.g:1:145: RULE_IO
                {
                mRULE_IO(); 

                }
                break;
            case 21 :
                // InternalArduinoDSL.g:1:153: RULE_TYPE
                {
                mRULE_TYPE(); 

                }
                break;
            case 22 :
                // InternalArduinoDSL.g:1:163: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 23 :
                // InternalArduinoDSL.g:1:171: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 24 :
                // InternalArduinoDSL.g:1:180: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 25 :
                // InternalArduinoDSL.g:1:192: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 26 :
                // InternalArduinoDSL.g:1:208: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 27 :
                // InternalArduinoDSL.g:1:224: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 28 :
                // InternalArduinoDSL.g:1:232: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\1\uffff\2\36\5\uffff\1\51\1\36\1\uffff\1\57\2\36\1\uffff\2\36\2\uffff\1\34\2\36\1\34\2\uffff\2\34\2\uffff\1\36\1\uffff\1\74\2\36\10\uffff\2\36\4\uffff\2\36\1\uffff\4\36\3\uffff\2\36\1\uffff\1\74\3\36\1\114\1\115\4\36\1\122\1\123\3\36\2\uffff\1\127\3\36\2\uffff\1\36\1\134\1\36\1\uffff\1\36\1\137\1\36\1\137\1\uffff\2\36\1\uffff\2\143\1\36\1\uffff\1\36\1\146\1\uffff";
    static final String DFA16_eofS =
        "\147\uffff";
    static final String DFA16_minS =
        "\1\0\1\150\1\146\5\uffff\1\52\1\145\1\uffff\1\75\1\151\1\141\1\uffff\1\141\1\155\2\uffff\1\75\2\156\1\101\2\uffff\2\0\2\uffff\1\145\1\uffff\1\60\1\146\1\164\10\uffff\1\154\1\147\4\uffff\1\156\1\160\1\uffff\1\164\1\157\1\160\1\141\3\uffff\1\156\1\145\1\uffff\1\60\1\160\1\164\1\151\2\60\1\145\1\157\1\165\1\154\2\60\1\165\1\141\1\164\2\uffff\1\60\2\164\1\157\2\uffff\1\164\1\60\1\141\1\uffff\1\150\1\60\1\147\1\60\1\uffff\1\154\1\151\1\uffff\2\60\1\156\1\uffff\1\147\1\60\1\uffff";
    static final String DFA16_maxS =
        "\1\uffff\1\150\1\165\5\uffff\1\57\1\151\1\uffff\1\76\1\151\1\141\1\uffff\1\141\1\155\2\uffff\1\75\2\156\1\172\2\uffff\2\uffff\2\uffff\1\145\1\uffff\1\172\1\146\1\164\10\uffff\1\154\1\147\4\uffff\1\156\1\160\1\uffff\1\164\1\157\1\160\1\141\3\uffff\1\156\1\145\1\uffff\1\172\1\160\1\164\1\151\2\172\1\145\1\157\1\165\1\154\2\172\1\165\1\141\1\164\2\uffff\1\172\2\164\1\157\2\uffff\1\164\1\172\1\141\1\uffff\1\150\1\172\1\147\1\172\1\uffff\1\154\1\151\1\uffff\2\172\1\156\1\uffff\1\147\1\172\1\uffff";
    static final String DFA16_acceptS =
        "\3\uffff\1\3\1\4\1\5\1\6\1\7\2\uffff\1\12\3\uffff\1\17\2\uffff\2\22\4\uffff\1\26\1\27\2\uffff\1\33\1\34\1\uffff\1\26\3\uffff\1\3\1\4\1\5\1\6\1\7\1\31\1\32\1\10\2\uffff\1\12\1\16\1\22\1\13\2\uffff\1\17\4\uffff\1\27\1\30\1\33\2\uffff\1\23\17\uffff\1\14\1\15\4\uffff\1\1\1\2\3\uffff\1\20\4\uffff\1\11\2\uffff\1\24\3\uffff\1\25\2\uffff\1\21";
    static final String DFA16_specialS =
        "\1\2\30\uffff\1\0\1\1\114\uffff}>";
    static final String[] DFA16_transitionS = {
            "\11\34\2\33\2\34\1\33\22\34\1\33\1\23\1\31\4\34\1\32\2\34\1\7\1\5\1\34\1\6\1\12\1\10\12\30\1\16\1\34\1\21\1\13\1\22\2\34\32\27\3\34\1\26\1\27\1\34\1\25\2\27\1\11\4\27\1\24\3\27\1\15\1\27\1\2\1\14\1\27\1\17\1\20\3\27\1\1\3\27\1\3\1\34\1\4\uff82\34",
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
            "\1\65",
            "\1\66",
            "\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "",
            "\0\70",
            "\0\70",
            "",
            "",
            "\1\72",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\2\36\1\73\27\36",
            "\1\75",
            "\1\76",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\77",
            "\1\100",
            "",
            "",
            "",
            "",
            "\1\101",
            "\1\102",
            "",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "",
            "",
            "",
            "\1\107",
            "\1\110",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\111",
            "\1\112",
            "\1\113",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\124",
            "\1\125",
            "\1\126",
            "",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\130",
            "\1\131",
            "\1\132",
            "",
            "",
            "\1\133",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\135",
            "",
            "\1\136",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\140",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\1\141",
            "\1\142",
            "",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\144",
            "",
            "\1\145",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | RULE_BOOLEAN_OPERATOR | RULE_STATE | RULE_IO | RULE_TYPE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_25 = input.LA(1);

                        s = -1;
                        if ( ((LA16_25>='\u0000' && LA16_25<='\uFFFF')) ) {s = 56;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_26 = input.LA(1);

                        s = -1;
                        if ( ((LA16_26>='\u0000' && LA16_26<='\uFFFF')) ) {s = 56;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA16_0 = input.LA(1);

                        s = -1;
                        if ( (LA16_0=='w') ) {s = 1;}

                        else if ( (LA16_0=='o') ) {s = 2;}

                        else if ( (LA16_0=='{') ) {s = 3;}

                        else if ( (LA16_0=='}') ) {s = 4;}

                        else if ( (LA16_0=='+') ) {s = 5;}

                        else if ( (LA16_0=='-') ) {s = 6;}

                        else if ( (LA16_0=='*') ) {s = 7;}

                        else if ( (LA16_0=='/') ) {s = 8;}

                        else if ( (LA16_0=='d') ) {s = 9;}

                        else if ( (LA16_0=='.') ) {s = 10;}

                        else if ( (LA16_0=='=') ) {s = 11;}

                        else if ( (LA16_0=='p') ) {s = 12;}

                        else if ( (LA16_0=='m') ) {s = 13;}

                        else if ( (LA16_0==':') ) {s = 14;}

                        else if ( (LA16_0=='r') ) {s = 15;}

                        else if ( (LA16_0=='s') ) {s = 16;}

                        else if ( (LA16_0=='<') ) {s = 17;}

                        else if ( (LA16_0=='>') ) {s = 18;}

                        else if ( (LA16_0=='!') ) {s = 19;}

                        else if ( (LA16_0=='i') ) {s = 20;}

                        else if ( (LA16_0=='a') ) {s = 21;}

                        else if ( (LA16_0=='^') ) {s = 22;}

                        else if ( ((LA16_0>='A' && LA16_0<='Z')||LA16_0=='_'||(LA16_0>='b' && LA16_0<='c')||(LA16_0>='e' && LA16_0<='h')||(LA16_0>='j' && LA16_0<='l')||LA16_0=='n'||LA16_0=='q'||(LA16_0>='t' && LA16_0<='v')||(LA16_0>='x' && LA16_0<='z')) ) {s = 23;}

                        else if ( ((LA16_0>='0' && LA16_0<='9')) ) {s = 24;}

                        else if ( (LA16_0=='\"') ) {s = 25;}

                        else if ( (LA16_0=='\'') ) {s = 26;}

                        else if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {s = 27;}

                        else if ( ((LA16_0>='\u0000' && LA16_0<='\b')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\u001F')||(LA16_0>='#' && LA16_0<='&')||(LA16_0>='(' && LA16_0<=')')||LA16_0==','||LA16_0==';'||(LA16_0>='?' && LA16_0<='@')||(LA16_0>='[' && LA16_0<=']')||LA16_0=='`'||LA16_0=='|'||(LA16_0>='~' && LA16_0<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}