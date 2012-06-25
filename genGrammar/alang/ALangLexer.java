// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g 2012-06-25 05:44:12

  package alang;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ALangLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int PROGRAM=4;
    public static final int ID=5;
    public static final int RELATIONALOP=6;
    public static final int STRING=7;
    public static final int INT=8;
    public static final int FLOAT=9;
    public static final int COMMENT=10;
    public static final int WS=11;

    // delegates
    // delegators

    public ALangLexer() {;} 
    public ALangLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ALangLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:7:7: ( 'global:' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:7:9: 'global:'
            {
            match("global:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:8:7: ( ';' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:8:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:9:7: ( 'coroutine' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:9:9: 'coroutine'
            {
            match("coroutine"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:10:7: ( '{' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:10:9: '{'
            {
            match('{'); 

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
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:11:7: ( '}' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:11:9: '}'
            {
            match('}'); 

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
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:12:7: ( 'main' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:12:9: 'main'
            {
            match("main"); 


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
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:13:7: ( 'if' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:13:9: 'if'
            {
            match("if"); 


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
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:14:7: ( '(' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:14:9: '('
            {
            match('('); 

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
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:15:7: ( ')' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:15:9: ')'
            {
            match(')'); 

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
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:16:7: ( 'else' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:16:9: 'else'
            {
            match("else"); 


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
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:17:7: ( 'while' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:17:9: 'while'
            {
            match("while"); 


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
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:18:7: ( '@' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:18:9: '@'
            {
            match('@'); 

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
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:19:7: ( 'yield' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:19:9: 'yield'
            {
            match("yield"); 


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
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:20:7: ( '=' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:20:9: '='
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
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:21:7: ( '+' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:21:9: '+'
            {
            match('+'); 

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
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:22:7: ( '-' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:22:9: '-'
            {
            match('-'); 

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
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:23:7: ( '*' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:23:9: '*'
            {
            match('*'); 

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
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:24:7: ( '/' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:24:9: '/'
            {
            match('/'); 

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
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:25:7: ( ',' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:25:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "RELATIONALOP"
    public final void mRELATIONALOP() throws RecognitionException {
        try {
            int _type = RELATIONALOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:124:5: ( '>' | '<' | '<=' | '>=' | '!=' | '==' )
            int alt1=6;
            switch ( input.LA(1) ) {
            case '>':
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='=') ) {
                    alt1=4;
                }
                else {
                    alt1=1;}
                }
                break;
            case '<':
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2=='=') ) {
                    alt1=3;
                }
                else {
                    alt1=2;}
                }
                break;
            case '!':
                {
                alt1=5;
                }
                break;
            case '=':
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
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:124:8: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:125:8: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 3 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:126:8: '<='
                    {
                    match("<="); 


                    }
                    break;
                case 4 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:127:8: '>='
                    {
                    match(">="); 


                    }
                    break;
                case 5 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:128:8: '!='
                    {
                    match("!="); 


                    }
                    break;
                case 6 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:129:8: '=='
                    {
                    match("=="); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RELATIONALOP"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:133:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:133:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:133:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:
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
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:136:5: ( ( '0' .. '9' )+ )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:136:7: ( '0' .. '9' )+
            {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:136:7: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:136:7: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:140:5: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ | ( '0' .. '9' )+ )
            int alt8=3;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:140:9: ( '0' .. '9' )+ '.' ( '0' .. '9' )*
                    {
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:140:9: ( '0' .. '9' )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:140:10: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

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

                    match('.'); 
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:140:25: ( '0' .. '9' )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:140:26: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:141:9: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:141:13: ( '0' .. '9' )+
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
                    	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:141:14: '0' .. '9'
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
                    break;
                case 3 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:142:9: ( '0' .. '9' )+
                    {
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:142:9: ( '0' .. '9' )+
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
                    	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:142:10: '0' .. '9'
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
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:146:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='/') ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1=='/') ) {
                    alt12=1;
                }
                else if ( (LA12_1=='*') ) {
                    alt12=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:146:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 

                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:146:14: (~ ( '\\n' | '\\r' ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='\u0000' && LA9_0<='\t')||(LA9_0>='\u000B' && LA9_0<='\f')||(LA9_0>='\u000E' && LA9_0<='\uFFFF')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:146:14: ~ ( '\\n' | '\\r' )
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
                    	    break loop9;
                        }
                    } while (true);

                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:146:28: ( '\\r' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='\r') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:146:28: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 
                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:147:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 

                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:147:14: ( options {greedy=false; } : . )*
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
                    	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:147:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match("*/"); 

                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:150:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:150:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:154:5: ( '\"' (~ ( '\\\\' | '\"' ) )* '\"' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:154:8: '\"' (~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:154:12: (~ ( '\\\\' | '\"' ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='!')||(LA13_0>='#' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:154:13: ~ ( '\\\\' | '\"' )
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
            	    break loop13;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    public void mTokens() throws RecognitionException {
        // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | RELATIONALOP | ID | INT | FLOAT | COMMENT | WS | STRING )
        int alt14=26;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:1:124: RELATIONALOP
                {
                mRELATIONALOP(); 

                }
                break;
            case 21 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:1:137: ID
                {
                mID(); 

                }
                break;
            case 22 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:1:140: INT
                {
                mINT(); 

                }
                break;
            case 23 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:1:144: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 24 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:1:150: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 25 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:1:158: WS
                {
                mWS(); 

                }
                break;
            case 26 :
                // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:1:161: STRING
                {
                mSTRING(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA8_eotS =
        "\1\uffff\1\4\3\uffff";
    static final String DFA8_eofS =
        "\5\uffff";
    static final String DFA8_minS =
        "\2\56\3\uffff";
    static final String DFA8_maxS =
        "\2\71\3\uffff";
    static final String DFA8_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA8_specialS =
        "\5\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\3\1\uffff\12\1",
            "",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "139:1: FLOAT : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* | '.' ( '0' .. '9' )+ | ( '0' .. '9' )+ );";
        }
    }
    static final String DFA14_eotS =
        "\1\uffff\1\25\1\uffff\1\25\2\uffff\2\25\2\uffff\2\25\1\uffff\1"+
        "\25\1\41\3\uffff\1\43\3\uffff\1\44\3\uffff\3\25\1\50\3\25\4\uffff"+
        "\3\25\1\uffff\5\25\1\64\1\65\4\25\2\uffff\1\72\1\73\2\25\3\uffff"+
        "\2\25\1\100\1\uffff";
    static final String DFA14_eofS =
        "\101\uffff";
    static final String DFA14_minS =
        "\1\11\1\154\1\uffff\1\157\2\uffff\1\141\1\146\2\uffff\1\154\1\150"+
        "\1\uffff\1\151\1\75\3\uffff\1\52\3\uffff\1\56\3\uffff\1\157\1\162"+
        "\1\151\1\60\1\163\1\151\1\145\4\uffff\1\142\1\157\1\156\1\uffff"+
        "\1\145\2\154\1\141\1\165\2\60\1\145\1\144\1\154\1\164\2\uffff\2"+
        "\60\1\72\1\151\3\uffff\1\156\1\145\1\60\1\uffff";
    static final String DFA14_maxS =
        "\1\175\1\154\1\uffff\1\157\2\uffff\1\141\1\146\2\uffff\1\154\1"+
        "\150\1\uffff\1\151\1\75\3\uffff\1\57\3\uffff\1\71\3\uffff\1\157"+
        "\1\162\1\151\1\172\1\163\1\151\1\145\4\uffff\1\142\1\157\1\156\1"+
        "\uffff\1\145\2\154\1\141\1\165\2\172\1\145\1\144\1\154\1\164\2\uffff"+
        "\2\172\1\72\1\151\3\uffff\1\156\1\145\1\172\1\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\1\5\2\uffff\1\10\1\11\2\uffff\1\14\2\uffff"+
        "\1\17\1\20\1\21\1\uffff\1\23\1\24\1\25\1\uffff\1\27\1\31\1\32\7"+
        "\uffff\1\16\1\30\1\22\1\26\3\uffff\1\7\13\uffff\1\6\1\12\4\uffff"+
        "\1\13\1\15\1\1\3\uffff\1\3";
    static final String DFA14_specialS =
        "\101\uffff}>";
    static final String[] DFA14_transitionS = {
            "\2\30\2\uffff\1\30\22\uffff\1\30\1\24\1\31\5\uffff\1\10\1\11"+
            "\1\21\1\17\1\23\1\20\1\27\1\22\12\26\1\uffff\1\2\1\24\1\16\1"+
            "\24\1\uffff\1\14\32\25\4\uffff\1\25\1\uffff\2\25\1\3\1\25\1"+
            "\12\1\25\1\1\1\25\1\7\3\25\1\6\11\25\1\13\1\25\1\15\1\25\1\4"+
            "\1\uffff\1\5",
            "\1\32",
            "",
            "\1\33",
            "",
            "",
            "\1\34",
            "\1\35",
            "",
            "",
            "\1\36",
            "\1\37",
            "",
            "\1\40",
            "\1\24",
            "",
            "",
            "",
            "\1\42\4\uffff\1\42",
            "",
            "",
            "",
            "\1\27\1\uffff\12\26",
            "",
            "",
            "",
            "\1\45",
            "\1\46",
            "\1\47",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\51",
            "\1\52",
            "\1\53",
            "",
            "",
            "",
            "",
            "\1\54",
            "\1\55",
            "\1\56",
            "",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\74",
            "\1\75",
            "",
            "",
            "",
            "\1\76",
            "\1\77",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | RELATIONALOP | ID | INT | FLOAT | COMMENT | WS | STRING );";
        }
    }
 

}