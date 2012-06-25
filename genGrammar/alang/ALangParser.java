// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g 2012-06-25 05:44:12


package alang;  
  


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class ALangParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROGRAM", "ID", "RELATIONALOP", "STRING", "INT", "FLOAT", "COMMENT", "WS", "'global:'", "';'", "'coroutine'", "'{'", "'}'", "'main'", "'if'", "'('", "')'", "'else'", "'while'", "'@'", "'yield'", "'='", "'+'", "'-'", "'*'", "'/'", "','"
    };
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


        public ALangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public ALangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return ALangParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g"; }


      private ArrayList<String> errors  = new ArrayList<String>();
      private ArrayList<String> block = new ArrayList<String>();
      private String currentBlock="";
      private int idCurrentBlock=0;
      
      public boolean haveErrors(){
        return !errors.isEmpty();
      }
      
      public ArrayList<String> gerErrors(){
        return errors;
      }


    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:41:1: program : ( globalVariableDeclaration )? coroutineDeclaration main EOF ;
    public final ALangParser.program_return program() throws RecognitionException {
        ALangParser.program_return retval = new ALangParser.program_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF4=null;
        ALangParser.globalVariableDeclaration_return globalVariableDeclaration1 = null;

        ALangParser.coroutineDeclaration_return coroutineDeclaration2 = null;

        ALangParser.main_return main3 = null;


        Object EOF4_tree=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:42:5: ( ( globalVariableDeclaration )? coroutineDeclaration main EOF )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:42:8: ( globalVariableDeclaration )? coroutineDeclaration main EOF
            {
            root_0 = (Object)adaptor.nil();

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:42:8: ( globalVariableDeclaration )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:42:8: globalVariableDeclaration
                    {
                    pushFollow(FOLLOW_globalVariableDeclaration_in_program66);
                    globalVariableDeclaration1=globalVariableDeclaration();

                    state._fsp--;

                    adaptor.addChild(root_0, globalVariableDeclaration1.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_coroutineDeclaration_in_program69);
            coroutineDeclaration2=coroutineDeclaration();

            state._fsp--;

            adaptor.addChild(root_0, coroutineDeclaration2.getTree());
            pushFollow(FOLLOW_main_in_program71);
            main3=main();

            state._fsp--;

            adaptor.addChild(root_0, main3.getTree());
            EOF4=(Token)match(input,EOF,FOLLOW_EOF_in_program73); 
            EOF4_tree = (Object)adaptor.create(EOF4);
            adaptor.addChild(root_0, EOF4_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "program"

    public static class globalVariableDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "globalVariableDeclaration"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:45:1: globalVariableDeclaration : 'global:' variableList ';' ;
    public final ALangParser.globalVariableDeclaration_return globalVariableDeclaration() throws RecognitionException {
        ALangParser.globalVariableDeclaration_return retval = new ALangParser.globalVariableDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal5=null;
        Token char_literal7=null;
        ALangParser.variableList_return variableList6 = null;


        Object string_literal5_tree=null;
        Object char_literal7_tree=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:46:5: ( 'global:' variableList ';' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:46:7: 'global:' variableList ';'
            {
            root_0 = (Object)adaptor.nil();

            string_literal5=(Token)match(input,12,FOLLOW_12_in_globalVariableDeclaration94); 
            string_literal5_tree = (Object)adaptor.create(string_literal5);
            adaptor.addChild(root_0, string_literal5_tree);

            pushFollow(FOLLOW_variableList_in_globalVariableDeclaration96);
            variableList6=variableList();

            state._fsp--;

            adaptor.addChild(root_0, variableList6.getTree());
            char_literal7=(Token)match(input,13,FOLLOW_13_in_globalVariableDeclaration98); 
            char_literal7_tree = (Object)adaptor.create(char_literal7);
            adaptor.addChild(root_0, char_literal7_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "globalVariableDeclaration"

    public static class coroutineDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "coroutineDeclaration"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:49:1: coroutineDeclaration : ( coroutineDeclarator )* ;
    public final ALangParser.coroutineDeclaration_return coroutineDeclaration() throws RecognitionException {
        ALangParser.coroutineDeclaration_return retval = new ALangParser.coroutineDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ALangParser.coroutineDeclarator_return coroutineDeclarator8 = null;



        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:50:5: ( ( coroutineDeclarator )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:50:7: ( coroutineDeclarator )*
            {
            root_0 = (Object)adaptor.nil();

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:50:7: ( coroutineDeclarator )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:50:7: coroutineDeclarator
            	    {
            	    pushFollow(FOLLOW_coroutineDeclarator_in_coroutineDeclaration115);
            	    coroutineDeclarator8=coroutineDeclarator();

            	    state._fsp--;

            	    adaptor.addChild(root_0, coroutineDeclarator8.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "coroutineDeclaration"

    public static class coroutineDeclarator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "coroutineDeclarator"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:54:1: coroutineDeclarator : 'coroutine' ID '{' ( statement )* '}' ;
    public final ALangParser.coroutineDeclarator_return coroutineDeclarator() throws RecognitionException {
        ALangParser.coroutineDeclarator_return retval = new ALangParser.coroutineDeclarator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal9=null;
        Token ID10=null;
        Token char_literal11=null;
        Token char_literal13=null;
        ALangParser.statement_return statement12 = null;


        Object string_literal9_tree=null;
        Object ID10_tree=null;
        Object char_literal11_tree=null;
        Object char_literal13_tree=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:55:5: ( 'coroutine' ID '{' ( statement )* '}' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:55:8: 'coroutine' ID '{' ( statement )* '}'
            {
            root_0 = (Object)adaptor.nil();

            string_literal9=(Token)match(input,14,FOLLOW_14_in_coroutineDeclarator135); 
            string_literal9_tree = (Object)adaptor.create(string_literal9);
            adaptor.addChild(root_0, string_literal9_tree);

            ID10=(Token)match(input,ID,FOLLOW_ID_in_coroutineDeclarator138); 
            ID10_tree = (Object)adaptor.create(ID10);
            adaptor.addChild(root_0, ID10_tree);

            char_literal11=(Token)match(input,15,FOLLOW_15_in_coroutineDeclarator140); 
            char_literal11_tree = (Object)adaptor.create(char_literal11);
            adaptor.addChild(root_0, char_literal11_tree);

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:55:28: ( statement )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==ID||LA3_0==18||(LA3_0>=22 && LA3_0<=24)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:55:28: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_coroutineDeclarator142);
            	    statement12=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement12.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            char_literal13=(Token)match(input,16,FOLLOW_16_in_coroutineDeclarator145); 
            char_literal13_tree = (Object)adaptor.create(char_literal13);
            adaptor.addChild(root_0, char_literal13_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "coroutineDeclarator"

    public static class main_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "main"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:58:1: main : 'main' '{' ( statement )* '}' ;
    public final ALangParser.main_return main() throws RecognitionException {
        ALangParser.main_return retval = new ALangParser.main_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal14=null;
        Token char_literal15=null;
        Token char_literal17=null;
        ALangParser.statement_return statement16 = null;


        Object string_literal14_tree=null;
        Object char_literal15_tree=null;
        Object char_literal17_tree=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:59:5: ( 'main' '{' ( statement )* '}' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:59:7: 'main' '{' ( statement )* '}'
            {
            root_0 = (Object)adaptor.nil();

            string_literal14=(Token)match(input,17,FOLLOW_17_in_main162); 
            string_literal14_tree = (Object)adaptor.create(string_literal14);
            adaptor.addChild(root_0, string_literal14_tree);

            char_literal15=(Token)match(input,15,FOLLOW_15_in_main164); 
            char_literal15_tree = (Object)adaptor.create(char_literal15);
            adaptor.addChild(root_0, char_literal15_tree);

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:59:18: ( statement )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==ID||LA4_0==18||(LA4_0>=22 && LA4_0<=24)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:59:18: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_main166);
            	    statement16=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement16.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            char_literal17=(Token)match(input,16,FOLLOW_16_in_main169); 
            char_literal17_tree = (Object)adaptor.create(char_literal17);
            adaptor.addChild(root_0, char_literal17_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "main"

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:63:1: statement : ( assign_op ';' | yield_op ';' | call_coroutine ';' | if_statement | while_statement );
    public final ALangParser.statement_return statement() throws RecognitionException {
        ALangParser.statement_return retval = new ALangParser.statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal19=null;
        Token char_literal21=null;
        Token char_literal23=null;
        ALangParser.assign_op_return assign_op18 = null;

        ALangParser.yield_op_return yield_op20 = null;

        ALangParser.call_coroutine_return call_coroutine22 = null;

        ALangParser.if_statement_return if_statement24 = null;

        ALangParser.while_statement_return while_statement25 = null;


        Object char_literal19_tree=null;
        Object char_literal21_tree=null;
        Object char_literal23_tree=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:64:5: ( assign_op ';' | yield_op ';' | call_coroutine ';' | if_statement | while_statement )
            int alt5=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt5=1;
                }
                break;
            case 24:
                {
                alt5=2;
                }
                break;
            case 23:
                {
                alt5=3;
                }
                break;
            case 18:
                {
                alt5=4;
                }
                break;
            case 22:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:64:7: assign_op ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assign_op_in_statement187);
                    assign_op18=assign_op();

                    state._fsp--;

                    adaptor.addChild(root_0, assign_op18.getTree());
                    char_literal19=(Token)match(input,13,FOLLOW_13_in_statement189); 
                    char_literal19_tree = (Object)adaptor.create(char_literal19);
                    adaptor.addChild(root_0, char_literal19_tree);


                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:65:7: yield_op ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_yield_op_in_statement197);
                    yield_op20=yield_op();

                    state._fsp--;

                    adaptor.addChild(root_0, yield_op20.getTree());
                    char_literal21=(Token)match(input,13,FOLLOW_13_in_statement199); 
                    char_literal21_tree = (Object)adaptor.create(char_literal21);
                    adaptor.addChild(root_0, char_literal21_tree);


                    }
                    break;
                case 3 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:66:7: call_coroutine ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_call_coroutine_in_statement207);
                    call_coroutine22=call_coroutine();

                    state._fsp--;

                    adaptor.addChild(root_0, call_coroutine22.getTree());
                    char_literal23=(Token)match(input,13,FOLLOW_13_in_statement209); 
                    char_literal23_tree = (Object)adaptor.create(char_literal23);
                    adaptor.addChild(root_0, char_literal23_tree);


                    }
                    break;
                case 4 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:67:7: if_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_if_statement_in_statement217);
                    if_statement24=if_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, if_statement24.getTree());

                    }
                    break;
                case 5 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:68:7: while_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_while_statement_in_statement226);
                    while_statement25=while_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, while_statement25.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class if_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "if_statement"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:71:1: if_statement : 'if' '(' logical_expression ')' '{' ( statement )* '}' ( 'else' '{' ( statement )* '}' )? ;
    public final ALangParser.if_statement_return if_statement() throws RecognitionException {
        ALangParser.if_statement_return retval = new ALangParser.if_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal26=null;
        Token char_literal27=null;
        Token char_literal29=null;
        Token char_literal30=null;
        Token char_literal32=null;
        Token string_literal33=null;
        Token char_literal34=null;
        Token char_literal36=null;
        ALangParser.logical_expression_return logical_expression28 = null;

        ALangParser.statement_return statement31 = null;

        ALangParser.statement_return statement35 = null;


        Object string_literal26_tree=null;
        Object char_literal27_tree=null;
        Object char_literal29_tree=null;
        Object char_literal30_tree=null;
        Object char_literal32_tree=null;
        Object string_literal33_tree=null;
        Object char_literal34_tree=null;
        Object char_literal36_tree=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:72:5: ( 'if' '(' logical_expression ')' '{' ( statement )* '}' ( 'else' '{' ( statement )* '}' )? )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:72:7: 'if' '(' logical_expression ')' '{' ( statement )* '}' ( 'else' '{' ( statement )* '}' )?
            {
            root_0 = (Object)adaptor.nil();

            string_literal26=(Token)match(input,18,FOLLOW_18_in_if_statement244); 
            string_literal26_tree = (Object)adaptor.create(string_literal26);
            adaptor.addChild(root_0, string_literal26_tree);

            char_literal27=(Token)match(input,19,FOLLOW_19_in_if_statement246); 
            char_literal27_tree = (Object)adaptor.create(char_literal27);
            adaptor.addChild(root_0, char_literal27_tree);

            pushFollow(FOLLOW_logical_expression_in_if_statement247);
            logical_expression28=logical_expression();

            state._fsp--;

            adaptor.addChild(root_0, logical_expression28.getTree());
            char_literal29=(Token)match(input,20,FOLLOW_20_in_if_statement248); 
            char_literal29_tree = (Object)adaptor.create(char_literal29);
            adaptor.addChild(root_0, char_literal29_tree);

            char_literal30=(Token)match(input,15,FOLLOW_15_in_if_statement250); 
            char_literal30_tree = (Object)adaptor.create(char_literal30);
            adaptor.addChild(root_0, char_literal30_tree);

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:72:41: ( statement )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==ID||LA6_0==18||(LA6_0>=22 && LA6_0<=24)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:72:41: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_if_statement252);
            	    statement31=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement31.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            char_literal32=(Token)match(input,16,FOLLOW_16_in_if_statement255); 
            char_literal32_tree = (Object)adaptor.create(char_literal32);
            adaptor.addChild(root_0, char_literal32_tree);

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:72:56: ( 'else' '{' ( statement )* '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:72:57: 'else' '{' ( statement )* '}'
                    {
                    string_literal33=(Token)match(input,21,FOLLOW_21_in_if_statement258); 
                    string_literal33_tree = (Object)adaptor.create(string_literal33);
                    adaptor.addChild(root_0, string_literal33_tree);

                    char_literal34=(Token)match(input,15,FOLLOW_15_in_if_statement260); 
                    char_literal34_tree = (Object)adaptor.create(char_literal34);
                    adaptor.addChild(root_0, char_literal34_tree);

                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:72:68: ( statement )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==ID||LA7_0==18||(LA7_0>=22 && LA7_0<=24)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:72:68: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_if_statement262);
                    	    statement35=statement();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, statement35.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    char_literal36=(Token)match(input,16,FOLLOW_16_in_if_statement265); 
                    char_literal36_tree = (Object)adaptor.create(char_literal36);
                    adaptor.addChild(root_0, char_literal36_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "if_statement"

    public static class while_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "while_statement"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:75:1: while_statement : 'while' '(' logical_expression ')' '{' ( statement )* '}' ;
    public final ALangParser.while_statement_return while_statement() throws RecognitionException {
        ALangParser.while_statement_return retval = new ALangParser.while_statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal37=null;
        Token char_literal38=null;
        Token char_literal40=null;
        Token char_literal41=null;
        Token char_literal43=null;
        ALangParser.logical_expression_return logical_expression39 = null;

        ALangParser.statement_return statement42 = null;


        Object string_literal37_tree=null;
        Object char_literal38_tree=null;
        Object char_literal40_tree=null;
        Object char_literal41_tree=null;
        Object char_literal43_tree=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:76:5: ( 'while' '(' logical_expression ')' '{' ( statement )* '}' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:76:7: 'while' '(' logical_expression ')' '{' ( statement )* '}'
            {
            root_0 = (Object)adaptor.nil();

            string_literal37=(Token)match(input,22,FOLLOW_22_in_while_statement284); 
            string_literal37_tree = (Object)adaptor.create(string_literal37);
            adaptor.addChild(root_0, string_literal37_tree);

            char_literal38=(Token)match(input,19,FOLLOW_19_in_while_statement286); 
            char_literal38_tree = (Object)adaptor.create(char_literal38);
            adaptor.addChild(root_0, char_literal38_tree);

            pushFollow(FOLLOW_logical_expression_in_while_statement287);
            logical_expression39=logical_expression();

            state._fsp--;

            adaptor.addChild(root_0, logical_expression39.getTree());
            char_literal40=(Token)match(input,20,FOLLOW_20_in_while_statement288); 
            char_literal40_tree = (Object)adaptor.create(char_literal40);
            adaptor.addChild(root_0, char_literal40_tree);

            char_literal41=(Token)match(input,15,FOLLOW_15_in_while_statement290); 
            char_literal41_tree = (Object)adaptor.create(char_literal41);
            adaptor.addChild(root_0, char_literal41_tree);

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:76:44: ( statement )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==ID||LA9_0==18||(LA9_0>=22 && LA9_0<=24)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:76:44: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_while_statement292);
            	    statement42=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement42.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            char_literal43=(Token)match(input,16,FOLLOW_16_in_while_statement295); 
            char_literal43_tree = (Object)adaptor.create(char_literal43);
            adaptor.addChild(root_0, char_literal43_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "while_statement"

    public static class call_coroutine_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "call_coroutine"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:79:1: call_coroutine : '@' ID ;
    public final ALangParser.call_coroutine_return call_coroutine() throws RecognitionException {
        ALangParser.call_coroutine_return retval = new ALangParser.call_coroutine_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal44=null;
        Token ID45=null;

        Object char_literal44_tree=null;
        Object ID45_tree=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:80:5: ( '@' ID )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:80:7: '@' ID
            {
            root_0 = (Object)adaptor.nil();

            char_literal44=(Token)match(input,23,FOLLOW_23_in_call_coroutine312); 
            char_literal44_tree = (Object)adaptor.create(char_literal44);
            adaptor.addChild(root_0, char_literal44_tree);

            ID45=(Token)match(input,ID,FOLLOW_ID_in_call_coroutine314); 
            ID45_tree = (Object)adaptor.create(ID45);
            adaptor.addChild(root_0, ID45_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "call_coroutine"

    public static class logical_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logical_expression"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:83:1: logical_expression : ID RELATIONALOP ID ;
    public final ALangParser.logical_expression_return logical_expression() throws RecognitionException {
        ALangParser.logical_expression_return retval = new ALangParser.logical_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID46=null;
        Token RELATIONALOP47=null;
        Token ID48=null;

        Object ID46_tree=null;
        Object RELATIONALOP47_tree=null;
        Object ID48_tree=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:84:5: ( ID RELATIONALOP ID )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:84:8: ID RELATIONALOP ID
            {
            root_0 = (Object)adaptor.nil();

            ID46=(Token)match(input,ID,FOLLOW_ID_in_logical_expression332); 
            ID46_tree = (Object)adaptor.create(ID46);
            adaptor.addChild(root_0, ID46_tree);

            RELATIONALOP47=(Token)match(input,RELATIONALOP,FOLLOW_RELATIONALOP_in_logical_expression334); 
            RELATIONALOP47_tree = (Object)adaptor.create(RELATIONALOP47);
            adaptor.addChild(root_0, RELATIONALOP47_tree);

            ID48=(Token)match(input,ID,FOLLOW_ID_in_logical_expression336); 
            ID48_tree = (Object)adaptor.create(ID48);
            adaptor.addChild(root_0, ID48_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "logical_expression"

    public static class yield_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "yield_op"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:89:1: yield_op : 'yield' ID ;
    public final ALangParser.yield_op_return yield_op() throws RecognitionException {
        ALangParser.yield_op_return retval = new ALangParser.yield_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal49=null;
        Token ID50=null;

        Object string_literal49_tree=null;
        Object ID50_tree=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:90:5: ( 'yield' ID )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:90:7: 'yield' ID
            {
            root_0 = (Object)adaptor.nil();

            string_literal49=(Token)match(input,24,FOLLOW_24_in_yield_op355); 
            string_literal49_tree = (Object)adaptor.create(string_literal49);
            adaptor.addChild(root_0, string_literal49_tree);

            ID50=(Token)match(input,ID,FOLLOW_ID_in_yield_op357); 
            ID50_tree = (Object)adaptor.create(ID50);
            adaptor.addChild(root_0, ID50_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "yield_op"

    public static class assign_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assign_op"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:93:1: assign_op : ID '=' expression ;
    public final ALangParser.assign_op_return assign_op() throws RecognitionException {
        ALangParser.assign_op_return retval = new ALangParser.assign_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID51=null;
        Token char_literal52=null;
        ALangParser.expression_return expression53 = null;


        Object ID51_tree=null;
        Object char_literal52_tree=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:94:5: ( ID '=' expression )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:94:7: ID '=' expression
            {
            root_0 = (Object)adaptor.nil();

            ID51=(Token)match(input,ID,FOLLOW_ID_in_assign_op375); 
            ID51_tree = (Object)adaptor.create(ID51);
            adaptor.addChild(root_0, ID51_tree);

            char_literal52=(Token)match(input,25,FOLLOW_25_in_assign_op377); 
            char_literal52_tree = (Object)adaptor.create(char_literal52);
            adaptor.addChild(root_0, char_literal52_tree);

            pushFollow(FOLLOW_expression_in_assign_op379);
            expression53=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression53.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assign_op"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:97:1: expression : mult_expr ( ( '+' | '-' ) mult_expr )* ;
    public final ALangParser.expression_return expression() throws RecognitionException {
        ALangParser.expression_return retval = new ALangParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set55=null;
        ALangParser.mult_expr_return mult_expr54 = null;

        ALangParser.mult_expr_return mult_expr56 = null;


        Object set55_tree=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:98:5: ( mult_expr ( ( '+' | '-' ) mult_expr )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:98:7: mult_expr ( ( '+' | '-' ) mult_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_mult_expr_in_expression400);
            mult_expr54=mult_expr();

            state._fsp--;

            adaptor.addChild(root_0, mult_expr54.getTree());
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:98:17: ( ( '+' | '-' ) mult_expr )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=26 && LA10_0<=27)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:98:18: ( '+' | '-' ) mult_expr
            	    {
            	    set55=(Token)input.LT(1);
            	    if ( (input.LA(1)>=26 && input.LA(1)<=27) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set55));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_mult_expr_in_expression409);
            	    mult_expr56=mult_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mult_expr56.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class mult_expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mult_expr"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:101:1: mult_expr : atom ( ( '*' | '/' ) atom )* ;
    public final ALangParser.mult_expr_return mult_expr() throws RecognitionException {
        ALangParser.mult_expr_return retval = new ALangParser.mult_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set58=null;
        ALangParser.atom_return atom57 = null;

        ALangParser.atom_return atom59 = null;


        Object set58_tree=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:102:5: ( atom ( ( '*' | '/' ) atom )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:102:7: atom ( ( '*' | '/' ) atom )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_atom_in_mult_expr430);
            atom57=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom57.getTree());
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:102:12: ( ( '*' | '/' ) atom )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=28 && LA11_0<=29)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:102:13: ( '*' | '/' ) atom
            	    {
            	    set58=(Token)input.LT(1);
            	    if ( (input.LA(1)>=28 && input.LA(1)<=29) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set58));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_atom_in_mult_expr439);
            	    atom59=atom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, atom59.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mult_expr"

    public static class atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:105:1: atom : ( ID | STRING | signed_atom );
    public final ALangParser.atom_return atom() throws RecognitionException {
        ALangParser.atom_return retval = new ALangParser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID60=null;
        Token STRING61=null;
        ALangParser.signed_atom_return signed_atom62 = null;


        Object ID60_tree=null;
        Object STRING61_tree=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:106:5: ( ID | STRING | signed_atom )
            int alt12=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt12=1;
                }
                break;
            case STRING:
                {
                alt12=2;
                }
                break;
            case INT:
            case FLOAT:
            case 26:
            case 27:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:106:7: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID60=(Token)match(input,ID,FOLLOW_ID_in_atom459); 
                    ID60_tree = (Object)adaptor.create(ID60);
                    adaptor.addChild(root_0, ID60_tree);


                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:107:7: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING61=(Token)match(input,STRING,FOLLOW_STRING_in_atom467); 
                    STRING61_tree = (Object)adaptor.create(STRING61);
                    adaptor.addChild(root_0, STRING61_tree);


                    }
                    break;
                case 3 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:108:7: signed_atom
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_signed_atom_in_atom475);
                    signed_atom62=signed_atom();

                    state._fsp--;

                    adaptor.addChild(root_0, signed_atom62.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atom"

    public static class signed_atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "signed_atom"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:111:1: signed_atom : ( INT | FLOAT | ( '-' | '+' ) signed_atom );
    public final ALangParser.signed_atom_return signed_atom() throws RecognitionException {
        ALangParser.signed_atom_return retval = new ALangParser.signed_atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT63=null;
        Token FLOAT64=null;
        Token set65=null;
        ALangParser.signed_atom_return signed_atom66 = null;


        Object INT63_tree=null;
        Object FLOAT64_tree=null;
        Object set65_tree=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:112:5: ( INT | FLOAT | ( '-' | '+' ) signed_atom )
            int alt13=3;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt13=1;
                }
                break;
            case FLOAT:
                {
                alt13=2;
                }
                break;
            case 26:
            case 27:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:112:7: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    INT63=(Token)match(input,INT,FOLLOW_INT_in_signed_atom496); 
                    INT63_tree = (Object)adaptor.create(INT63);
                    adaptor.addChild(root_0, INT63_tree);


                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:113:7: FLOAT
                    {
                    root_0 = (Object)adaptor.nil();

                    FLOAT64=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_signed_atom504); 
                    FLOAT64_tree = (Object)adaptor.create(FLOAT64);
                    adaptor.addChild(root_0, FLOAT64_tree);


                    }
                    break;
                case 3 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:114:7: ( '-' | '+' ) signed_atom
                    {
                    root_0 = (Object)adaptor.nil();

                    set65=(Token)input.LT(1);
                    if ( (input.LA(1)>=26 && input.LA(1)<=27) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set65));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_signed_atom_in_signed_atom518);
                    signed_atom66=signed_atom();

                    state._fsp--;

                    adaptor.addChild(root_0, signed_atom66.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "signed_atom"

    public static class variableList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableList"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:119:1: variableList : ID ( ',' ID )* ;
    public final ALangParser.variableList_return variableList() throws RecognitionException {
        ALangParser.variableList_return retval = new ALangParser.variableList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID67=null;
        Token char_literal68=null;
        Token ID69=null;

        Object ID67_tree=null;
        Object char_literal68_tree=null;
        Object ID69_tree=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:120:5: ( ID ( ',' ID )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:120:7: ID ( ',' ID )*
            {
            root_0 = (Object)adaptor.nil();

            ID67=(Token)match(input,ID,FOLLOW_ID_in_variableList541); 
            ID67_tree = (Object)adaptor.create(ID67);
            adaptor.addChild(root_0, ID67_tree);

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:120:10: ( ',' ID )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==30) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:120:11: ',' ID
            	    {
            	    char_literal68=(Token)match(input,30,FOLLOW_30_in_variableList544); 
            	    char_literal68_tree = (Object)adaptor.create(char_literal68);
            	    adaptor.addChild(root_0, char_literal68_tree);

            	    ID69=(Token)match(input,ID,FOLLOW_ID_in_variableList546); 
            	    ID69_tree = (Object)adaptor.create(ID69);
            	    adaptor.addChild(root_0, ID69_tree);


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "variableList"

    // Delegated rules


 

    public static final BitSet FOLLOW_globalVariableDeclaration_in_program66 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_coroutineDeclaration_in_program69 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_main_in_program71 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_program73 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_globalVariableDeclaration94 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_variableList_in_globalVariableDeclaration96 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_globalVariableDeclaration98 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_coroutineDeclarator_in_coroutineDeclaration115 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_coroutineDeclarator135 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_coroutineDeclarator138 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_coroutineDeclarator140 = new BitSet(new long[]{0x0000000001C50020L});
    public static final BitSet FOLLOW_statement_in_coroutineDeclarator142 = new BitSet(new long[]{0x0000000001C50020L});
    public static final BitSet FOLLOW_16_in_coroutineDeclarator145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_main162 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_main164 = new BitSet(new long[]{0x0000000001C50020L});
    public static final BitSet FOLLOW_statement_in_main166 = new BitSet(new long[]{0x0000000001C50020L});
    public static final BitSet FOLLOW_16_in_main169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_op_in_statement187 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yield_op_in_statement197 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_coroutine_in_statement207 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_statement_in_statement217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_statement_in_statement226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_if_statement244 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_if_statement246 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_logical_expression_in_if_statement247 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_if_statement248 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_if_statement250 = new BitSet(new long[]{0x0000000001C50020L});
    public static final BitSet FOLLOW_statement_in_if_statement252 = new BitSet(new long[]{0x0000000001C50020L});
    public static final BitSet FOLLOW_16_in_if_statement255 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_if_statement258 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_if_statement260 = new BitSet(new long[]{0x0000000001C50020L});
    public static final BitSet FOLLOW_statement_in_if_statement262 = new BitSet(new long[]{0x0000000001C50020L});
    public static final BitSet FOLLOW_16_in_if_statement265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_while_statement284 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_while_statement286 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_logical_expression_in_while_statement287 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_while_statement288 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_while_statement290 = new BitSet(new long[]{0x0000000001C50020L});
    public static final BitSet FOLLOW_statement_in_while_statement292 = new BitSet(new long[]{0x0000000001C50020L});
    public static final BitSet FOLLOW_16_in_while_statement295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_call_coroutine312 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_call_coroutine314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_logical_expression332 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RELATIONALOP_in_logical_expression334 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_logical_expression336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_yield_op355 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_yield_op357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign_op375 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_assign_op377 = new BitSet(new long[]{0x000000000C0003A0L});
    public static final BitSet FOLLOW_expression_in_assign_op379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mult_expr_in_expression400 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_set_in_expression403 = new BitSet(new long[]{0x000000000C0003A0L});
    public static final BitSet FOLLOW_mult_expr_in_expression409 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_atom_in_mult_expr430 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_set_in_mult_expr433 = new BitSet(new long[]{0x000000000C0003A0L});
    public static final BitSet FOLLOW_atom_in_mult_expr439 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_ID_in_atom459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_atom467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_signed_atom_in_atom475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_signed_atom496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_signed_atom504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_signed_atom512 = new BitSet(new long[]{0x000000000C0003A0L});
    public static final BitSet FOLLOW_signed_atom_in_signed_atom518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variableList541 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_variableList544 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_variableList546 = new BitSet(new long[]{0x0000000040000002L});

}