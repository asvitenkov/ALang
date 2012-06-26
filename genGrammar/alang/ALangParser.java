// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g 2012-06-25 20:14:12


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


      private NamesTable names = new NamesTable();
      private ArrayList<String> errors  = new ArrayList<String>();
      private ArrayList<String> blocks = new ArrayList<String>();
      private String currentBlock="";
      private int idCurrentBlock=0;
      private TypeChecker typeChecker = new TypeChecker();
      
      public boolean haveErrors(){
        return !errors.isEmpty();
      }
      
      public ArrayList<String> getErrors(){
        return errors;
      }


    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "program"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:43:1: program : ( globalVariableDeclaration )? coroutineDeclaration main EOF ;
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
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:44:5: ( ( globalVariableDeclaration )? coroutineDeclaration main EOF )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:44:8: ( globalVariableDeclaration )? coroutineDeclaration main EOF
            {
            root_0 = (Object)adaptor.nil();

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:44:8: ( globalVariableDeclaration )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:44:8: globalVariableDeclaration
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
            pushFollow(FOLLOW_main_in_program72);
            main3=main();

            state._fsp--;

            adaptor.addChild(root_0, main3.getTree());
            EOF4=(Token)match(input,EOF,FOLLOW_EOF_in_program74); 
            EOF4_tree = (Object)adaptor.create(EOF4);
            adaptor.addChild(root_0, EOF4_tree);


                    if(!names.checkCallCoroutine()){
                      names.getAllErrors(errors);
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
    // $ANTLR end "program"

    public static class globalVariableDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "globalVariableDeclaration"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:52:1: globalVariableDeclaration : 'global:' variableDeclarationList ';' ;
    public final ALangParser.globalVariableDeclaration_return globalVariableDeclaration() throws RecognitionException {
        ALangParser.globalVariableDeclaration_return retval = new ALangParser.globalVariableDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal5=null;
        Token char_literal7=null;
        ALangParser.variableDeclarationList_return variableDeclarationList6 = null;


        Object string_literal5_tree=null;
        Object char_literal7_tree=null;


          currentBlock = "global";
          blocks.add(currentBlock);
          blocks.add(currentBlock);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:62:5: ( 'global:' variableDeclarationList ';' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:62:7: 'global:' variableDeclarationList ';'
            {
            root_0 = (Object)adaptor.nil();

            string_literal5=(Token)match(input,12,FOLLOW_12_in_globalVariableDeclaration112); 
            string_literal5_tree = (Object)adaptor.create(string_literal5);
            adaptor.addChild(root_0, string_literal5_tree);

            pushFollow(FOLLOW_variableDeclarationList_in_globalVariableDeclaration114);
            variableDeclarationList6=variableDeclarationList();

            state._fsp--;

            adaptor.addChild(root_0, variableDeclarationList6.getTree());
            char_literal7=(Token)match(input,13,FOLLOW_13_in_globalVariableDeclaration116); 
            char_literal7_tree = (Object)adaptor.create(char_literal7);
            adaptor.addChild(root_0, char_literal7_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);


              blocks.remove(blocks.size()-1);
              this.currentBlock=blocks.get(blocks.size()-1);

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:65:1: coroutineDeclaration : ( coroutineDeclarator )* ;
    public final ALangParser.coroutineDeclaration_return coroutineDeclaration() throws RecognitionException {
        ALangParser.coroutineDeclaration_return retval = new ALangParser.coroutineDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ALangParser.coroutineDeclarator_return coroutineDeclarator8 = null;



        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:66:5: ( ( coroutineDeclarator )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:66:7: ( coroutineDeclarator )*
            {
            root_0 = (Object)adaptor.nil();

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:66:7: ( coroutineDeclarator )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:66:7: coroutineDeclarator
            	    {
            	    pushFollow(FOLLOW_coroutineDeclarator_in_coroutineDeclaration133);
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:70:1: coroutineDeclarator : 'coroutine' ID '{' ( statement )* '}' ;
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
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:75:5: ( 'coroutine' ID '{' ( statement )* '}' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:75:8: 'coroutine' ID '{' ( statement )* '}'
            {
            root_0 = (Object)adaptor.nil();

            string_literal9=(Token)match(input,14,FOLLOW_14_in_coroutineDeclarator157); 
            string_literal9_tree = (Object)adaptor.create(string_literal9);
            adaptor.addChild(root_0, string_literal9_tree);

            ID10=(Token)match(input,ID,FOLLOW_ID_in_coroutineDeclarator160); 
            ID10_tree = (Object)adaptor.create(ID10);
            adaptor.addChild(root_0, ID10_tree);

            this.currentBlock="coroutine_"+(ID10!=null?ID10.getText():null); blocks.add(currentBlock);
            char_literal11=(Token)match(input,15,FOLLOW_15_in_coroutineDeclarator165); 
            char_literal11_tree = (Object)adaptor.create(char_literal11);
            adaptor.addChild(root_0, char_literal11_tree);

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:75:98: ( statement )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==ID||LA3_0==18||(LA3_0>=22 && LA3_0<=24)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:75:98: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_coroutineDeclarator167);
            	    statement12=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement12.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            char_literal13=(Token)match(input,16,FOLLOW_16_in_coroutineDeclarator170); 
            char_literal13_tree = (Object)adaptor.create(char_literal13);
            adaptor.addChild(root_0, char_literal13_tree);


                      if(!names.isExistCoroutine(this.currentBlock)){
                        names.addCoroutine(names.new Coroutine(this.currentBlock, (ID10!=null?ID10.getLine():0)));
                      }
                      else{
                        errors.add("line "+(ID10!=null?ID10.getLine():0)+": duplicated coroutine declaration "+(ID10!=null?ID10.getText():null));
                      }
                    

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);


              blocks.remove(blocks.size()-1);
              this.currentBlock=blocks.get(blocks.size()-1);

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:86:1: main : 'main' '{' ( statement )* '}' ;
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


          this.currentBlock="main";
          blocks.add(currentBlock);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:95:5: ( 'main' '{' ( statement )* '}' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:95:7: 'main' '{' ( statement )* '}'
            {
            root_0 = (Object)adaptor.nil();

            string_literal14=(Token)match(input,17,FOLLOW_17_in_main205); 
            string_literal14_tree = (Object)adaptor.create(string_literal14);
            adaptor.addChild(root_0, string_literal14_tree);

            char_literal15=(Token)match(input,15,FOLLOW_15_in_main207); 
            char_literal15_tree = (Object)adaptor.create(char_literal15);
            adaptor.addChild(root_0, char_literal15_tree);

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:95:18: ( statement )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==ID||LA4_0==18||(LA4_0>=22 && LA4_0<=24)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:95:18: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_main209);
            	    statement16=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement16.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            char_literal17=(Token)match(input,16,FOLLOW_16_in_main212); 
            char_literal17_tree = (Object)adaptor.create(char_literal17);
            adaptor.addChild(root_0, char_literal17_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);


              blocks.remove(blocks.size()-1);
              this.currentBlock=blocks.get(blocks.size()-1);

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:99:1: statement : ( assign_op ';' | yield_op ';' | call_coroutine ';' | if_statement | while_statement );
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
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:100:5: ( assign_op ';' | yield_op ';' | call_coroutine ';' | if_statement | while_statement )
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
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:100:7: assign_op ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assign_op_in_statement230);
                    assign_op18=assign_op();

                    state._fsp--;

                    adaptor.addChild(root_0, assign_op18.getTree());
                    char_literal19=(Token)match(input,13,FOLLOW_13_in_statement232); 
                    char_literal19_tree = (Object)adaptor.create(char_literal19);
                    adaptor.addChild(root_0, char_literal19_tree);


                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:101:7: yield_op ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_yield_op_in_statement240);
                    yield_op20=yield_op();

                    state._fsp--;

                    adaptor.addChild(root_0, yield_op20.getTree());
                    char_literal21=(Token)match(input,13,FOLLOW_13_in_statement242); 
                    char_literal21_tree = (Object)adaptor.create(char_literal21);
                    adaptor.addChild(root_0, char_literal21_tree);


                    }
                    break;
                case 3 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:102:7: call_coroutine ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_call_coroutine_in_statement250);
                    call_coroutine22=call_coroutine();

                    state._fsp--;

                    adaptor.addChild(root_0, call_coroutine22.getTree());
                    char_literal23=(Token)match(input,13,FOLLOW_13_in_statement252); 
                    char_literal23_tree = (Object)adaptor.create(char_literal23);
                    adaptor.addChild(root_0, char_literal23_tree);


                    }
                    break;
                case 4 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:103:7: if_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_if_statement_in_statement260);
                    if_statement24=if_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, if_statement24.getTree());

                    }
                    break;
                case 5 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:104:7: while_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_while_statement_in_statement269);
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:107:1: if_statement : 'if' '(' logical_expression ')' '{' ( statement )* '}' ( 'else' '{' ( statement )* '}' )? ;
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


          idCurrentBlock++; 
          currentBlock = Integer.toString(idCurrentBlock); 
          blocks.add(currentBlock);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:117:5: ( 'if' '(' logical_expression ')' '{' ( statement )* '}' ( 'else' '{' ( statement )* '}' )? )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:117:7: 'if' '(' logical_expression ')' '{' ( statement )* '}' ( 'else' '{' ( statement )* '}' )?
            {
            root_0 = (Object)adaptor.nil();

            string_literal26=(Token)match(input,18,FOLLOW_18_in_if_statement295); 
            string_literal26_tree = (Object)adaptor.create(string_literal26);
            adaptor.addChild(root_0, string_literal26_tree);

            char_literal27=(Token)match(input,19,FOLLOW_19_in_if_statement297); 
            char_literal27_tree = (Object)adaptor.create(char_literal27);
            adaptor.addChild(root_0, char_literal27_tree);

            pushFollow(FOLLOW_logical_expression_in_if_statement298);
            logical_expression28=logical_expression();

            state._fsp--;

            adaptor.addChild(root_0, logical_expression28.getTree());
            char_literal29=(Token)match(input,20,FOLLOW_20_in_if_statement299); 
            char_literal29_tree = (Object)adaptor.create(char_literal29);
            adaptor.addChild(root_0, char_literal29_tree);

            char_literal30=(Token)match(input,15,FOLLOW_15_in_if_statement301); 
            char_literal30_tree = (Object)adaptor.create(char_literal30);
            adaptor.addChild(root_0, char_literal30_tree);

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:117:41: ( statement )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==ID||LA6_0==18||(LA6_0>=22 && LA6_0<=24)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:117:41: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_if_statement303);
            	    statement31=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement31.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            char_literal32=(Token)match(input,16,FOLLOW_16_in_if_statement306); 
            char_literal32_tree = (Object)adaptor.create(char_literal32);
            adaptor.addChild(root_0, char_literal32_tree);

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:117:56: ( 'else' '{' ( statement )* '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:117:57: 'else' '{' ( statement )* '}'
                    {
                    string_literal33=(Token)match(input,21,FOLLOW_21_in_if_statement309); 
                    string_literal33_tree = (Object)adaptor.create(string_literal33);
                    adaptor.addChild(root_0, string_literal33_tree);

                    char_literal34=(Token)match(input,15,FOLLOW_15_in_if_statement311); 
                    char_literal34_tree = (Object)adaptor.create(char_literal34);
                    adaptor.addChild(root_0, char_literal34_tree);

                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:117:68: ( statement )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==ID||LA7_0==18||(LA7_0>=22 && LA7_0<=24)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:117:68: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_if_statement313);
                    	    statement35=statement();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, statement35.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    char_literal36=(Token)match(input,16,FOLLOW_16_in_if_statement316); 
                    char_literal36_tree = (Object)adaptor.create(char_literal36);
                    adaptor.addChild(root_0, char_literal36_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);


              blocks.remove(blocks.size()-1);
              this.currentBlock=blocks.get(blocks.size()-1);

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:120:1: while_statement : 'while' '(' logical_expression ')' '{' ( statement )* '}' ;
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


          idCurrentBlock++; 
          currentBlock = Integer.toString(idCurrentBlock); 
          blocks.add(currentBlock);

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:130:5: ( 'while' '(' logical_expression ')' '{' ( statement )* '}' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:130:7: 'while' '(' logical_expression ')' '{' ( statement )* '}'
            {
            root_0 = (Object)adaptor.nil();

            string_literal37=(Token)match(input,22,FOLLOW_22_in_while_statement343); 
            string_literal37_tree = (Object)adaptor.create(string_literal37);
            adaptor.addChild(root_0, string_literal37_tree);

            char_literal38=(Token)match(input,19,FOLLOW_19_in_while_statement345); 
            char_literal38_tree = (Object)adaptor.create(char_literal38);
            adaptor.addChild(root_0, char_literal38_tree);

            pushFollow(FOLLOW_logical_expression_in_while_statement346);
            logical_expression39=logical_expression();

            state._fsp--;

            adaptor.addChild(root_0, logical_expression39.getTree());
            char_literal40=(Token)match(input,20,FOLLOW_20_in_while_statement347); 
            char_literal40_tree = (Object)adaptor.create(char_literal40);
            adaptor.addChild(root_0, char_literal40_tree);

            char_literal41=(Token)match(input,15,FOLLOW_15_in_while_statement349); 
            char_literal41_tree = (Object)adaptor.create(char_literal41);
            adaptor.addChild(root_0, char_literal41_tree);

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:130:44: ( statement )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==ID||LA9_0==18||(LA9_0>=22 && LA9_0<=24)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:130:44: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_while_statement351);
            	    statement42=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement42.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            char_literal43=(Token)match(input,16,FOLLOW_16_in_while_statement354); 
            char_literal43_tree = (Object)adaptor.create(char_literal43);
            adaptor.addChild(root_0, char_literal43_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);


              blocks.remove(blocks.size()-1);
              this.currentBlock=blocks.get(blocks.size()-1);

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:133:1: call_coroutine : '@' ID ;
    public final ALangParser.call_coroutine_return call_coroutine() throws RecognitionException {
        ALangParser.call_coroutine_return retval = new ALangParser.call_coroutine_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal44=null;
        Token ID45=null;

        Object char_literal44_tree=null;
        Object ID45_tree=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:134:5: ( '@' ID )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:134:7: '@' ID
            {
            root_0 = (Object)adaptor.nil();

            char_literal44=(Token)match(input,23,FOLLOW_23_in_call_coroutine371); 
            char_literal44_tree = (Object)adaptor.create(char_literal44);
            adaptor.addChild(root_0, char_literal44_tree);

            ID45=(Token)match(input,ID,FOLLOW_ID_in_call_coroutine373); 
            ID45_tree = (Object)adaptor.create(ID45);
            adaptor.addChild(root_0, ID45_tree);


                    if(!names.isExistCoroutine("coroutine_"+(ID45!=null?ID45.getText():null))){
                      errors.add("line "+(ID45!=null?ID45.getLine():0)+": coroutine "+(ID45!=null?ID45.getText():null)+" doesn't exists");
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
    // $ANTLR end "call_coroutine"

    public static class logical_expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logical_expression"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:142:1: logical_expression : a= ID RELATIONALOP b= ID ;
    public final ALangParser.logical_expression_return logical_expression() throws RecognitionException {
        ALangParser.logical_expression_return retval = new ALangParser.logical_expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token a=null;
        Token b=null;
        Token RELATIONALOP46=null;

        Object a_tree=null;
        Object b_tree=null;
        Object RELATIONALOP46_tree=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:143:5: (a= ID RELATIONALOP b= ID )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:143:8: a= ID RELATIONALOP b= ID
            {
            root_0 = (Object)adaptor.nil();

            a=(Token)match(input,ID,FOLLOW_ID_in_logical_expression401); 
            a_tree = (Object)adaptor.create(a);
            adaptor.addChild(root_0, a_tree);

            RELATIONALOP46=(Token)match(input,RELATIONALOP,FOLLOW_RELATIONALOP_in_logical_expression403); 
            RELATIONALOP46_tree = (Object)adaptor.create(RELATIONALOP46);
            adaptor.addChild(root_0, RELATIONALOP46_tree);

            b=(Token)match(input,ID,FOLLOW_ID_in_logical_expression407); 
            b_tree = (Object)adaptor.create(b);
            adaptor.addChild(root_0, b_tree);


                    if(!names.isExistVariable(blocks,(a!=null?a.getText():null))){
                      errors.add("line "+(a!=null?a.getLine():0)+": variable "+(a!=null?a.getText():null)+" have undefined type");
                    }
                    else{
                      String type = names.getVariableType(names.getVariableBlock(blocks,(a!=null?a.getText():null)),(a!=null?a.getText():null));
                      if(type.equals("undef")){
                        errors.add("line "+(a!=null?a.getLine():0)+": variable "+(a!=null?a.getText():null)+" have undefined type");
                      }
                    }
                    
                    if(!names.isExistVariable(blocks,(a!=null?a.getText():null))){
                      errors.add("line "+(b!=null?b.getLine():0)+": variable "+(b!=null?b.getText():null)+" have undefined type");
                    }
                    else{
                      String type = names.getVariableType(names.getVariableBlock(blocks,(b!=null?b.getText():null)),(b!=null?b.getText():null));
                      if(type.equals("undef")){
                        errors.add("line "+(b!=null?b.getLine():0)+": variable "+(b!=null?b.getText():null)+" have undefined type");
                      }
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
    // $ANTLR end "logical_expression"

    public static class yield_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "yield_op"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:170:1: yield_op : 'yield' ID ;
    public final ALangParser.yield_op_return yield_op() throws RecognitionException {
        ALangParser.yield_op_return retval = new ALangParser.yield_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal47=null;
        Token ID48=null;

        Object string_literal47_tree=null;
        Object ID48_tree=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:171:5: ( 'yield' ID )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:171:7: 'yield' ID
            {
            root_0 = (Object)adaptor.nil();

            string_literal47=(Token)match(input,24,FOLLOW_24_in_yield_op434); 
            string_literal47_tree = (Object)adaptor.create(string_literal47);
            adaptor.addChild(root_0, string_literal47_tree);

            ID48=(Token)match(input,ID,FOLLOW_ID_in_yield_op436); 
            ID48_tree = (Object)adaptor.create(ID48);
            adaptor.addChild(root_0, ID48_tree);


                  
                    boolean res = false;
                    for(String tmp: blocks){
                      if(tmp.indexOf("coroutine_")!=-1) {res=true; names.addCallCoroutine((ID48!=null?ID48.getText():null),(ID48!=null?ID48.getLine():0));}
                    }
                    if(!res){
                       errors.add("line "+(ID48!=null?ID48.getLine():0)+": yield statement may be only into coroutine's body");
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
    // $ANTLR end "yield_op"

    public static class assign_op_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assign_op"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:184:1: assign_op : ID '=' expression ;
    public final ALangParser.assign_op_return assign_op() throws RecognitionException {
        ALangParser.assign_op_return retval = new ALangParser.assign_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID49=null;
        Token char_literal50=null;
        ALangParser.expression_return expression51 = null;


        Object ID49_tree=null;
        Object char_literal50_tree=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:185:5: ( ID '=' expression )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:185:7: ID '=' expression
            {
            root_0 = (Object)adaptor.nil();

            ID49=(Token)match(input,ID,FOLLOW_ID_in_assign_op462); 
            ID49_tree = (Object)adaptor.create(ID49);
            adaptor.addChild(root_0, ID49_tree);

            char_literal50=(Token)match(input,25,FOLLOW_25_in_assign_op464); 
            char_literal50_tree = (Object)adaptor.create(char_literal50);
            adaptor.addChild(root_0, char_literal50_tree);

            pushFollow(FOLLOW_expression_in_assign_op466);
            expression51=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression51.getTree());

                      String varBlock=this.currentBlock;
                      if(names.isExistVariable(blocks,(ID49!=null?ID49.getText():null))){
                        varBlock = names.getVariableBlock(blocks,(ID49!=null?ID49.getText():null));
                      }
                      else{
                        names.addVariable(names.new VariableName(this.currentBlock+"."+(ID49!=null?ID49.getText():null),"undef",(ID49!=null?ID49.getLine():0)));
                        varBlock=this.currentBlock;
                      }
                      if(!names.checkAssignOperation(varBlock,(ID49!=null?ID49.getText():null), (expression51!=null?expression51.type:null), (ID49!=null?ID49.getLine():0))){
                         errors.add(names.getLastError());
                      }
                      else{
                         //typeChecker.getResultType("+",names.getVariableType(varBlock,(ID49!=null?ID49.getText():null),(expression51!=null?expression51.type:null)));
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
    // $ANTLR end "assign_op"

    protected static class expression_scope {
        String lastType;
    }
    protected Stack expression_stack = new Stack();

    public static class expression_return extends ParserRuleReturnScope {
        public String type;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:205:1: expression returns [String type] : a= mult_expr ( (c= '+' | c= '-' ) b= mult_expr )* ;
    public final ALangParser.expression_return expression() throws RecognitionException {
        expression_stack.push(new expression_scope());
        ALangParser.expression_return retval = new ALangParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token c=null;
        ALangParser.mult_expr_return a = null;

        ALangParser.mult_expr_return b = null;


        Object c_tree=null;


          ((expression_scope)expression_stack.peek()).lastType ="";

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:215:5: (a= mult_expr ( (c= '+' | c= '-' ) b= mult_expr )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:215:7: a= mult_expr ( (c= '+' | c= '-' ) b= mult_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_mult_expr_in_expression511);
            a=mult_expr();

            state._fsp--;

            adaptor.addChild(root_0, a.getTree());

                          ((expression_scope)expression_stack.peek()).lastType = (a!=null?a.type:null);
                      
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:219:5: ( (c= '+' | c= '-' ) b= mult_expr )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=26 && LA11_0<=27)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:219:6: (c= '+' | c= '-' ) b= mult_expr
            	    {
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:219:6: (c= '+' | c= '-' )
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==26) ) {
            	        alt10=1;
            	    }
            	    else if ( (LA10_0==27) ) {
            	        alt10=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:219:7: c= '+'
            	            {
            	            c=(Token)match(input,26,FOLLOW_26_in_expression535); 
            	            c_tree = (Object)adaptor.create(c);
            	            adaptor.addChild(root_0, c_tree);


            	            }
            	            break;
            	        case 2 :
            	            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:219:13: c= '-'
            	            {
            	            c=(Token)match(input,27,FOLLOW_27_in_expression539); 
            	            c_tree = (Object)adaptor.create(c);
            	            adaptor.addChild(root_0, c_tree);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_mult_expr_in_expression544);
            	    b=mult_expr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, b.getTree());
            	     
            	                   if(!typeChecker.checkMathExpr(((expression_scope)expression_stack.peek()).lastType, (b!=null?b.type:null))){
            	                      ((expression_scope)expression_stack.peek()).lastType ="error";
            	                      errors.add("line "+(b!=null?b.line:0)+": type mismatch");
            	                   }
            	                   else{
            	                      ((expression_scope)expression_stack.peek()).lastType =typeChecker.getResultType((c!=null?c.getText():null),(b!=null?b.type:null), ((expression_scope)expression_stack.peek()).lastType);
            	                   }
            	              

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

             
              retval.type = ((expression_scope)expression_stack.peek()).lastType; 

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            expression_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "expression"

    protected static class mult_expr_scope {
        String lastType;
    }
    protected Stack mult_expr_stack = new Stack();

    public static class mult_expr_return extends ParserRuleReturnScope {
        public String type;
        public int line;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mult_expr"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:232:1: mult_expr returns [String type, int line] : a= atom ( (c= '*' | c= '/' ) b= atom )* ;
    public final ALangParser.mult_expr_return mult_expr() throws RecognitionException {
        mult_expr_stack.push(new mult_expr_scope());
        ALangParser.mult_expr_return retval = new ALangParser.mult_expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token c=null;
        ALangParser.atom_return a = null;

        ALangParser.atom_return b = null;


        Object c_tree=null;


          ((mult_expr_scope)mult_expr_stack.peek()).lastType ="";

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:243:5: (a= atom ( (c= '*' | c= '/' ) b= atom )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:243:7: a= atom ( (c= '*' | c= '/' ) b= atom )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_atom_in_mult_expr599);
            a=atom();

            state._fsp--;

            adaptor.addChild(root_0, a.getTree());

                  ((mult_expr_scope)mult_expr_stack.peek()).lastType = (a!=null?a.type:null);
                
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:247:5: ( (c= '*' | c= '/' ) b= atom )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=28 && LA13_0<=29)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:247:6: (c= '*' | c= '/' ) b= atom
            	    {
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:247:6: (c= '*' | c= '/' )
            	    int alt12=2;
            	    int LA12_0 = input.LA(1);

            	    if ( (LA12_0==28) ) {
            	        alt12=1;
            	    }
            	    else if ( (LA12_0==29) ) {
            	        alt12=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt12) {
            	        case 1 :
            	            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:247:7: c= '*'
            	            {
            	            c=(Token)match(input,28,FOLLOW_28_in_mult_expr616); 
            	            c_tree = (Object)adaptor.create(c);
            	            adaptor.addChild(root_0, c_tree);


            	            }
            	            break;
            	        case 2 :
            	            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:247:13: c= '/'
            	            {
            	            c=(Token)match(input,29,FOLLOW_29_in_mult_expr620); 
            	            c_tree = (Object)adaptor.create(c);
            	            adaptor.addChild(root_0, c_tree);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_atom_in_mult_expr625);
            	    b=atom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, b.getTree());

            	                   if(!typeChecker.checkMathExpr(((mult_expr_scope)mult_expr_stack.peek()).lastType, (b!=null?b.type:null))){
            	                      ((mult_expr_scope)mult_expr_stack.peek()).lastType ="error";
            	                      errors.add("line "+(b!=null?b.line:0)+": type mismatch");
            	                   }
            	                   else{
            	                      ((mult_expr_scope)mult_expr_stack.peek()).lastType =typeChecker.getResultType((c!=null?c.getText():null),(b!=null?b.type:null), ((mult_expr_scope)mult_expr_stack.peek()).lastType);
            	                   }
            	              

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             
              retval.type = ((mult_expr_scope)mult_expr_stack.peek()).lastType; 
              retval.line = (a!=null?a.line:0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
            mult_expr_stack.pop();
        }
        return retval;
    }
    // $ANTLR end "mult_expr"

    public static class atom_return extends ParserRuleReturnScope {
        public String type;
        public int line;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:260:1: atom returns [String type, int line] : ( ID | STRING | signed_atom );
    public final ALangParser.atom_return atom() throws RecognitionException {
        ALangParser.atom_return retval = new ALangParser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID52=null;
        Token STRING53=null;
        ALangParser.signed_atom_return signed_atom54 = null;


        Object ID52_tree=null;
        Object STRING53_tree=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:261:5: ( ID | STRING | signed_atom )
            int alt14=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt14=1;
                }
                break;
            case STRING:
                {
                alt14=2;
                }
                break;
            case INT:
            case FLOAT:
            case 26:
            case 27:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:261:7: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID52=(Token)match(input,ID,FOLLOW_ID_in_atom665); 
                    ID52_tree = (Object)adaptor.create(ID52);
                    adaptor.addChild(root_0, ID52_tree);

                    retval.type = names.getVariableType(names.getVariableBlock(blocks,(ID52!=null?ID52.getText():null)),(ID52!=null?ID52.getText():null));
                    retval.line = (ID52!=null?ID52.getLine():0);

                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:262:7: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING53=(Token)match(input,STRING,FOLLOW_STRING_in_atom677); 
                    STRING53_tree = (Object)adaptor.create(STRING53);
                    adaptor.addChild(root_0, STRING53_tree);

                    retval.type = "string";
                    retval.line = (STRING53!=null?STRING53.getLine():0);

                    }
                    break;
                case 3 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:263:7: signed_atom
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_signed_atom_in_atom691);
                    signed_atom54=signed_atom();

                    state._fsp--;

                    adaptor.addChild(root_0, signed_atom54.getTree());
                    retval.type = (signed_atom54!=null?signed_atom54.type:null);
                    retval.line = (signed_atom54!=null?signed_atom54.line:0);

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
        public String type;
        public int line;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "signed_atom"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:266:1: signed_atom returns [String type, int line] : ( INT | FLOAT | ( '-' | '+' ) a= signed_atom );
    public final ALangParser.signed_atom_return signed_atom() throws RecognitionException {
        ALangParser.signed_atom_return retval = new ALangParser.signed_atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT55=null;
        Token FLOAT56=null;
        Token set57=null;
        ALangParser.signed_atom_return a = null;


        Object INT55_tree=null;
        Object FLOAT56_tree=null;
        Object set57_tree=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:267:5: ( INT | FLOAT | ( '-' | '+' ) a= signed_atom )
            int alt15=3;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt15=1;
                }
                break;
            case FLOAT:
                {
                alt15=2;
                }
                break;
            case 26:
            case 27:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:267:7: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    INT55=(Token)match(input,INT,FOLLOW_INT_in_signed_atom721); 
                    INT55_tree = (Object)adaptor.create(INT55);
                    adaptor.addChild(root_0, INT55_tree);

                    retval.type = "int";
                    retval.line = (INT55!=null?INT55.getLine():0);

                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:268:7: FLOAT
                    {
                    root_0 = (Object)adaptor.nil();

                    FLOAT56=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_signed_atom733); 
                    FLOAT56_tree = (Object)adaptor.create(FLOAT56);
                    adaptor.addChild(root_0, FLOAT56_tree);

                    retval.type = "float";
                    retval.line = (FLOAT56!=null?FLOAT56.getLine():0);

                    }
                    break;
                case 3 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:269:7: ( '-' | '+' ) a= signed_atom
                    {
                    root_0 = (Object)adaptor.nil();

                    set57=(Token)input.LT(1);
                    if ( (input.LA(1)>=26 && input.LA(1)<=27) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set57));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_signed_atom_in_signed_atom753);
                    a=signed_atom();

                    state._fsp--;

                    adaptor.addChild(root_0, a.getTree());
                    retval.type = (a!=null?a.type:null);
                    retval.line = (a!=null?a.line:0);

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

    public static class variableDeclarationList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "variableDeclarationList"
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:274:1: variableDeclarationList : a= ID ( ',' b= ID )* ;
    public final ALangParser.variableDeclarationList_return variableDeclarationList() throws RecognitionException {
        ALangParser.variableDeclarationList_return retval = new ALangParser.variableDeclarationList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token a=null;
        Token b=null;
        Token char_literal58=null;

        Object a_tree=null;
        Object b_tree=null;
        Object char_literal58_tree=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:275:5: (a= ID ( ',' b= ID )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:275:7: a= ID ( ',' b= ID )*
            {
            root_0 = (Object)adaptor.nil();

            a=(Token)match(input,ID,FOLLOW_ID_in_variableDeclarationList782); 
            a_tree = (Object)adaptor.create(a);
            adaptor.addChild(root_0, a_tree);

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:275:12: ( ',' b= ID )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==30) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:275:13: ',' b= ID
            	    {
            	    char_literal58=(Token)match(input,30,FOLLOW_30_in_variableDeclarationList785); 
            	    char_literal58_tree = (Object)adaptor.create(char_literal58);
            	    adaptor.addChild(root_0, char_literal58_tree);

            	    b=(Token)match(input,ID,FOLLOW_ID_in_variableDeclarationList789); 
            	    b_tree = (Object)adaptor.create(b);
            	    adaptor.addChild(root_0, b_tree);

            	    names.addVariable(names.new VariableName(this.currentBlock+"."+(b!=null?b.getText():null), "undef", (b!=null?b.getLine():0)));

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            names.addVariable(names.new VariableName(this.currentBlock+"."+(a!=null?a.getText():null), "undef", (a!=null?a.getLine():0)));

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
    // $ANTLR end "variableDeclarationList"

    // Delegated rules


 

    public static final BitSet FOLLOW_globalVariableDeclaration_in_program66 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_coroutineDeclaration_in_program69 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_main_in_program72 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_program74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_globalVariableDeclaration112 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_variableDeclarationList_in_globalVariableDeclaration114 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_globalVariableDeclaration116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_coroutineDeclarator_in_coroutineDeclaration133 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_coroutineDeclarator157 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_coroutineDeclarator160 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_coroutineDeclarator165 = new BitSet(new long[]{0x0000000001C50020L});
    public static final BitSet FOLLOW_statement_in_coroutineDeclarator167 = new BitSet(new long[]{0x0000000001C50020L});
    public static final BitSet FOLLOW_16_in_coroutineDeclarator170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_main205 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_main207 = new BitSet(new long[]{0x0000000001C50020L});
    public static final BitSet FOLLOW_statement_in_main209 = new BitSet(new long[]{0x0000000001C50020L});
    public static final BitSet FOLLOW_16_in_main212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_op_in_statement230 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yield_op_in_statement240 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_coroutine_in_statement250 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_statement_in_statement260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_statement_in_statement269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_if_statement295 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_if_statement297 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_logical_expression_in_if_statement298 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_if_statement299 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_if_statement301 = new BitSet(new long[]{0x0000000001C50020L});
    public static final BitSet FOLLOW_statement_in_if_statement303 = new BitSet(new long[]{0x0000000001C50020L});
    public static final BitSet FOLLOW_16_in_if_statement306 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_if_statement309 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_if_statement311 = new BitSet(new long[]{0x0000000001C50020L});
    public static final BitSet FOLLOW_statement_in_if_statement313 = new BitSet(new long[]{0x0000000001C50020L});
    public static final BitSet FOLLOW_16_in_if_statement316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_while_statement343 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_while_statement345 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_logical_expression_in_while_statement346 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_while_statement347 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_while_statement349 = new BitSet(new long[]{0x0000000001C50020L});
    public static final BitSet FOLLOW_statement_in_while_statement351 = new BitSet(new long[]{0x0000000001C50020L});
    public static final BitSet FOLLOW_16_in_while_statement354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_call_coroutine371 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_call_coroutine373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_logical_expression401 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RELATIONALOP_in_logical_expression403 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_logical_expression407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_yield_op434 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_yield_op436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign_op462 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_assign_op464 = new BitSet(new long[]{0x000000000C0003A0L});
    public static final BitSet FOLLOW_expression_in_assign_op466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mult_expr_in_expression511 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_26_in_expression535 = new BitSet(new long[]{0x000000000C0003A0L});
    public static final BitSet FOLLOW_27_in_expression539 = new BitSet(new long[]{0x000000000C0003A0L});
    public static final BitSet FOLLOW_mult_expr_in_expression544 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_atom_in_mult_expr599 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_28_in_mult_expr616 = new BitSet(new long[]{0x000000000C0003A0L});
    public static final BitSet FOLLOW_29_in_mult_expr620 = new BitSet(new long[]{0x000000000C0003A0L});
    public static final BitSet FOLLOW_atom_in_mult_expr625 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_ID_in_atom665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_atom677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_signed_atom_in_atom691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_signed_atom721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_signed_atom733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_signed_atom745 = new BitSet(new long[]{0x000000000C0003A0L});
    public static final BitSet FOLLOW_signed_atom_in_signed_atom753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variableDeclarationList782 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_variableDeclarationList785 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_variableDeclarationList789 = new BitSet(new long[]{0x0000000040000002L});

}