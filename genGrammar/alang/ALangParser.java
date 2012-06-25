// $ANTLR 3.3 Nov 30, 2010 12:50:56 D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g 2012-06-25 19:11:44


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

            names.printVars();

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:47:1: globalVariableDeclaration : 'global:' variableDeclarationList ';' ;
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
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:57:5: ( 'global:' variableDeclarationList ';' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:57:7: 'global:' variableDeclarationList ';'
            {
            root_0 = (Object)adaptor.nil();

            string_literal5=(Token)match(input,12,FOLLOW_12_in_globalVariableDeclaration105); 
            string_literal5_tree = (Object)adaptor.create(string_literal5);
            adaptor.addChild(root_0, string_literal5_tree);

            pushFollow(FOLLOW_variableDeclarationList_in_globalVariableDeclaration107);
            variableDeclarationList6=variableDeclarationList();

            state._fsp--;

            adaptor.addChild(root_0, variableDeclarationList6.getTree());
            char_literal7=(Token)match(input,13,FOLLOW_13_in_globalVariableDeclaration109); 
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:60:1: coroutineDeclaration : ( coroutineDeclarator )* ;
    public final ALangParser.coroutineDeclaration_return coroutineDeclaration() throws RecognitionException {
        ALangParser.coroutineDeclaration_return retval = new ALangParser.coroutineDeclaration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ALangParser.coroutineDeclarator_return coroutineDeclarator8 = null;



        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:61:5: ( ( coroutineDeclarator )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:61:7: ( coroutineDeclarator )*
            {
            root_0 = (Object)adaptor.nil();

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:61:7: ( coroutineDeclarator )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:61:7: coroutineDeclarator
            	    {
            	    pushFollow(FOLLOW_coroutineDeclarator_in_coroutineDeclaration126);
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:65:1: coroutineDeclarator : 'coroutine' ID '{' ( statement )* '}' ;
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
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:70:5: ( 'coroutine' ID '{' ( statement )* '}' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:70:8: 'coroutine' ID '{' ( statement )* '}'
            {
            root_0 = (Object)adaptor.nil();

            string_literal9=(Token)match(input,14,FOLLOW_14_in_coroutineDeclarator150); 
            string_literal9_tree = (Object)adaptor.create(string_literal9);
            adaptor.addChild(root_0, string_literal9_tree);

            ID10=(Token)match(input,ID,FOLLOW_ID_in_coroutineDeclarator153); 
            ID10_tree = (Object)adaptor.create(ID10);
            adaptor.addChild(root_0, ID10_tree);

            this.currentBlock="coroutine_"+(ID10!=null?ID10.getText():null); blocks.add(currentBlock);
            char_literal11=(Token)match(input,15,FOLLOW_15_in_coroutineDeclarator158); 
            char_literal11_tree = (Object)adaptor.create(char_literal11);
            adaptor.addChild(root_0, char_literal11_tree);

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:70:98: ( statement )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==ID||LA3_0==18||(LA3_0>=22 && LA3_0<=24)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:70:98: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_coroutineDeclarator160);
            	    statement12=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement12.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            char_literal13=(Token)match(input,16,FOLLOW_16_in_coroutineDeclarator163); 
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:81:1: main : 'main' '{' ( statement )* '}' ;
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
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:90:5: ( 'main' '{' ( statement )* '}' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:90:7: 'main' '{' ( statement )* '}'
            {
            root_0 = (Object)adaptor.nil();

            string_literal14=(Token)match(input,17,FOLLOW_17_in_main198); 
            string_literal14_tree = (Object)adaptor.create(string_literal14);
            adaptor.addChild(root_0, string_literal14_tree);

            char_literal15=(Token)match(input,15,FOLLOW_15_in_main200); 
            char_literal15_tree = (Object)adaptor.create(char_literal15);
            adaptor.addChild(root_0, char_literal15_tree);

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:90:18: ( statement )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==ID||LA4_0==18||(LA4_0>=22 && LA4_0<=24)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:90:18: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_main202);
            	    statement16=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement16.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            char_literal17=(Token)match(input,16,FOLLOW_16_in_main205); 
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:94:1: statement : ( assign_op ';' | yield_op ';' | call_coroutine ';' | if_statement | while_statement );
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
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:95:5: ( assign_op ';' | yield_op ';' | call_coroutine ';' | if_statement | while_statement )
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
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:95:7: assign_op ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assign_op_in_statement223);
                    assign_op18=assign_op();

                    state._fsp--;

                    adaptor.addChild(root_0, assign_op18.getTree());
                    char_literal19=(Token)match(input,13,FOLLOW_13_in_statement225); 
                    char_literal19_tree = (Object)adaptor.create(char_literal19);
                    adaptor.addChild(root_0, char_literal19_tree);


                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:96:7: yield_op ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_yield_op_in_statement233);
                    yield_op20=yield_op();

                    state._fsp--;

                    adaptor.addChild(root_0, yield_op20.getTree());
                    char_literal21=(Token)match(input,13,FOLLOW_13_in_statement235); 
                    char_literal21_tree = (Object)adaptor.create(char_literal21);
                    adaptor.addChild(root_0, char_literal21_tree);


                    }
                    break;
                case 3 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:97:7: call_coroutine ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_call_coroutine_in_statement243);
                    call_coroutine22=call_coroutine();

                    state._fsp--;

                    adaptor.addChild(root_0, call_coroutine22.getTree());
                    char_literal23=(Token)match(input,13,FOLLOW_13_in_statement245); 
                    char_literal23_tree = (Object)adaptor.create(char_literal23);
                    adaptor.addChild(root_0, char_literal23_tree);


                    }
                    break;
                case 4 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:98:7: if_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_if_statement_in_statement253);
                    if_statement24=if_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, if_statement24.getTree());

                    }
                    break;
                case 5 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:99:7: while_statement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_while_statement_in_statement262);
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:102:1: if_statement : 'if' '(' logical_expression ')' '{' ( statement )* '}' ( 'else' '{' ( statement )* '}' )? ;
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
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:112:5: ( 'if' '(' logical_expression ')' '{' ( statement )* '}' ( 'else' '{' ( statement )* '}' )? )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:112:7: 'if' '(' logical_expression ')' '{' ( statement )* '}' ( 'else' '{' ( statement )* '}' )?
            {
            root_0 = (Object)adaptor.nil();

            string_literal26=(Token)match(input,18,FOLLOW_18_in_if_statement288); 
            string_literal26_tree = (Object)adaptor.create(string_literal26);
            adaptor.addChild(root_0, string_literal26_tree);

            char_literal27=(Token)match(input,19,FOLLOW_19_in_if_statement290); 
            char_literal27_tree = (Object)adaptor.create(char_literal27);
            adaptor.addChild(root_0, char_literal27_tree);

            pushFollow(FOLLOW_logical_expression_in_if_statement291);
            logical_expression28=logical_expression();

            state._fsp--;

            adaptor.addChild(root_0, logical_expression28.getTree());
            char_literal29=(Token)match(input,20,FOLLOW_20_in_if_statement292); 
            char_literal29_tree = (Object)adaptor.create(char_literal29);
            adaptor.addChild(root_0, char_literal29_tree);

            char_literal30=(Token)match(input,15,FOLLOW_15_in_if_statement294); 
            char_literal30_tree = (Object)adaptor.create(char_literal30);
            adaptor.addChild(root_0, char_literal30_tree);

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:112:41: ( statement )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==ID||LA6_0==18||(LA6_0>=22 && LA6_0<=24)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:112:41: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_if_statement296);
            	    statement31=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement31.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            char_literal32=(Token)match(input,16,FOLLOW_16_in_if_statement299); 
            char_literal32_tree = (Object)adaptor.create(char_literal32);
            adaptor.addChild(root_0, char_literal32_tree);

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:112:56: ( 'else' '{' ( statement )* '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:112:57: 'else' '{' ( statement )* '}'
                    {
                    string_literal33=(Token)match(input,21,FOLLOW_21_in_if_statement302); 
                    string_literal33_tree = (Object)adaptor.create(string_literal33);
                    adaptor.addChild(root_0, string_literal33_tree);

                    char_literal34=(Token)match(input,15,FOLLOW_15_in_if_statement304); 
                    char_literal34_tree = (Object)adaptor.create(char_literal34);
                    adaptor.addChild(root_0, char_literal34_tree);

                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:112:68: ( statement )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==ID||LA7_0==18||(LA7_0>=22 && LA7_0<=24)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:112:68: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_if_statement306);
                    	    statement35=statement();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, statement35.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    char_literal36=(Token)match(input,16,FOLLOW_16_in_if_statement309); 
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:115:1: while_statement : 'while' '(' logical_expression ')' '{' ( statement )* '}' ;
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
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:125:5: ( 'while' '(' logical_expression ')' '{' ( statement )* '}' )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:125:7: 'while' '(' logical_expression ')' '{' ( statement )* '}'
            {
            root_0 = (Object)adaptor.nil();

            string_literal37=(Token)match(input,22,FOLLOW_22_in_while_statement336); 
            string_literal37_tree = (Object)adaptor.create(string_literal37);
            adaptor.addChild(root_0, string_literal37_tree);

            char_literal38=(Token)match(input,19,FOLLOW_19_in_while_statement338); 
            char_literal38_tree = (Object)adaptor.create(char_literal38);
            adaptor.addChild(root_0, char_literal38_tree);

            pushFollow(FOLLOW_logical_expression_in_while_statement339);
            logical_expression39=logical_expression();

            state._fsp--;

            adaptor.addChild(root_0, logical_expression39.getTree());
            char_literal40=(Token)match(input,20,FOLLOW_20_in_while_statement340); 
            char_literal40_tree = (Object)adaptor.create(char_literal40);
            adaptor.addChild(root_0, char_literal40_tree);

            char_literal41=(Token)match(input,15,FOLLOW_15_in_while_statement342); 
            char_literal41_tree = (Object)adaptor.create(char_literal41);
            adaptor.addChild(root_0, char_literal41_tree);

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:125:44: ( statement )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==ID||LA9_0==18||(LA9_0>=22 && LA9_0<=24)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:125:44: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_while_statement344);
            	    statement42=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement42.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            char_literal43=(Token)match(input,16,FOLLOW_16_in_while_statement347); 
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:128:1: call_coroutine : '@' ID ;
    public final ALangParser.call_coroutine_return call_coroutine() throws RecognitionException {
        ALangParser.call_coroutine_return retval = new ALangParser.call_coroutine_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal44=null;
        Token ID45=null;

        Object char_literal44_tree=null;
        Object ID45_tree=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:129:5: ( '@' ID )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:129:7: '@' ID
            {
            root_0 = (Object)adaptor.nil();

            char_literal44=(Token)match(input,23,FOLLOW_23_in_call_coroutine364); 
            char_literal44_tree = (Object)adaptor.create(char_literal44);
            adaptor.addChild(root_0, char_literal44_tree);

            ID45=(Token)match(input,ID,FOLLOW_ID_in_call_coroutine366); 
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:137:1: logical_expression : ID RELATIONALOP ID ;
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
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:138:5: ( ID RELATIONALOP ID )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:138:8: ID RELATIONALOP ID
            {
            root_0 = (Object)adaptor.nil();

            ID46=(Token)match(input,ID,FOLLOW_ID_in_logical_expression392); 
            ID46_tree = (Object)adaptor.create(ID46);
            adaptor.addChild(root_0, ID46_tree);

            RELATIONALOP47=(Token)match(input,RELATIONALOP,FOLLOW_RELATIONALOP_in_logical_expression394); 
            RELATIONALOP47_tree = (Object)adaptor.create(RELATIONALOP47);
            adaptor.addChild(root_0, RELATIONALOP47_tree);

            ID48=(Token)match(input,ID,FOLLOW_ID_in_logical_expression396); 
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:143:1: yield_op : 'yield' ID ;
    public final ALangParser.yield_op_return yield_op() throws RecognitionException {
        ALangParser.yield_op_return retval = new ALangParser.yield_op_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal49=null;
        Token ID50=null;

        Object string_literal49_tree=null;
        Object ID50_tree=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:144:5: ( 'yield' ID )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:144:7: 'yield' ID
            {
            root_0 = (Object)adaptor.nil();

            string_literal49=(Token)match(input,24,FOLLOW_24_in_yield_op415); 
            string_literal49_tree = (Object)adaptor.create(string_literal49);
            adaptor.addChild(root_0, string_literal49_tree);

            ID50=(Token)match(input,ID,FOLLOW_ID_in_yield_op417); 
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:147:1: assign_op : ID '=' expression ;
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
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:148:5: ( ID '=' expression )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:148:7: ID '=' expression
            {
            root_0 = (Object)adaptor.nil();

            ID51=(Token)match(input,ID,FOLLOW_ID_in_assign_op435); 
            ID51_tree = (Object)adaptor.create(ID51);
            adaptor.addChild(root_0, ID51_tree);

            char_literal52=(Token)match(input,25,FOLLOW_25_in_assign_op437); 
            char_literal52_tree = (Object)adaptor.create(char_literal52);
            adaptor.addChild(root_0, char_literal52_tree);

            pushFollow(FOLLOW_expression_in_assign_op439);
            expression53=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression53.getTree());

                      String varBlock=this.currentBlock;
                      if(names.isExistVariable(blocks,(ID51!=null?ID51.getText():null))){
                        varBlock = names.getVariableBlock(blocks,(ID51!=null?ID51.getText():null));
                      }
                      else{
                        names.addVariable(names.new VariableName(this.currentBlock+"."+(ID51!=null?ID51.getText():null),"undef",(ID51!=null?ID51.getLine():0)));
                        varBlock=this.currentBlock;
                      }
                      if(!names.checkAssignOperation(varBlock,(ID51!=null?ID51.getText():null), (expression53!=null?expression53.type:null), (ID51!=null?ID51.getLine():0))){
                         errors.add(names.getLastError());
                      }
                      else{
                         //typeChecker.getResultType("+",names.getVariableType(varBlock,(ID51!=null?ID51.getText():null),(expression53!=null?expression53.type:null)));
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:168:1: expression returns [String type] : a= mult_expr ( (c= '+' | c= '-' ) b= mult_expr )* ;
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
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:178:5: (a= mult_expr ( (c= '+' | c= '-' ) b= mult_expr )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:178:7: a= mult_expr ( (c= '+' | c= '-' ) b= mult_expr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_mult_expr_in_expression484);
            a=mult_expr();

            state._fsp--;

            adaptor.addChild(root_0, a.getTree());

                          ((expression_scope)expression_stack.peek()).lastType = (a!=null?a.type:null);
                      
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:182:5: ( (c= '+' | c= '-' ) b= mult_expr )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=26 && LA11_0<=27)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:182:6: (c= '+' | c= '-' ) b= mult_expr
            	    {
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:182:6: (c= '+' | c= '-' )
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
            	            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:182:7: c= '+'
            	            {
            	            c=(Token)match(input,26,FOLLOW_26_in_expression508); 
            	            c_tree = (Object)adaptor.create(c);
            	            adaptor.addChild(root_0, c_tree);


            	            }
            	            break;
            	        case 2 :
            	            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:182:13: c= '-'
            	            {
            	            c=(Token)match(input,27,FOLLOW_27_in_expression512); 
            	            c_tree = (Object)adaptor.create(c);
            	            adaptor.addChild(root_0, c_tree);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_mult_expr_in_expression517);
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:195:1: mult_expr returns [String type, int line] : a= atom ( (c= '*' | c= '/' ) b= atom )* ;
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
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:206:5: (a= atom ( (c= '*' | c= '/' ) b= atom )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:206:7: a= atom ( (c= '*' | c= '/' ) b= atom )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_atom_in_mult_expr572);
            a=atom();

            state._fsp--;

            adaptor.addChild(root_0, a.getTree());

                  ((mult_expr_scope)mult_expr_stack.peek()).lastType = (a!=null?a.type:null);
                
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:210:5: ( (c= '*' | c= '/' ) b= atom )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=28 && LA13_0<=29)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:210:6: (c= '*' | c= '/' ) b= atom
            	    {
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:210:6: (c= '*' | c= '/' )
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
            	            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:210:7: c= '*'
            	            {
            	            c=(Token)match(input,28,FOLLOW_28_in_mult_expr589); 
            	            c_tree = (Object)adaptor.create(c);
            	            adaptor.addChild(root_0, c_tree);


            	            }
            	            break;
            	        case 2 :
            	            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:210:13: c= '/'
            	            {
            	            c=(Token)match(input,29,FOLLOW_29_in_mult_expr593); 
            	            c_tree = (Object)adaptor.create(c);
            	            adaptor.addChild(root_0, c_tree);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_atom_in_mult_expr598);
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:223:1: atom returns [String type, int line] : ( ID | STRING | signed_atom );
    public final ALangParser.atom_return atom() throws RecognitionException {
        ALangParser.atom_return retval = new ALangParser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID54=null;
        Token STRING55=null;
        ALangParser.signed_atom_return signed_atom56 = null;


        Object ID54_tree=null;
        Object STRING55_tree=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:224:5: ( ID | STRING | signed_atom )
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
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:224:7: ID
                    {
                    root_0 = (Object)adaptor.nil();

                    ID54=(Token)match(input,ID,FOLLOW_ID_in_atom638); 
                    ID54_tree = (Object)adaptor.create(ID54);
                    adaptor.addChild(root_0, ID54_tree);

                    retval.type = names.getVariableType(names.getVariableBlock(blocks,(ID54!=null?ID54.getText():null)),(ID54!=null?ID54.getText():null));
                    retval.line = (ID54!=null?ID54.getLine():0);

                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:225:7: STRING
                    {
                    root_0 = (Object)adaptor.nil();

                    STRING55=(Token)match(input,STRING,FOLLOW_STRING_in_atom650); 
                    STRING55_tree = (Object)adaptor.create(STRING55);
                    adaptor.addChild(root_0, STRING55_tree);

                    retval.type = "string";
                    retval.line = (STRING55!=null?STRING55.getLine():0);

                    }
                    break;
                case 3 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:226:7: signed_atom
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_signed_atom_in_atom664);
                    signed_atom56=signed_atom();

                    state._fsp--;

                    adaptor.addChild(root_0, signed_atom56.getTree());
                    retval.type = (signed_atom56!=null?signed_atom56.type:null);
                    retval.line = (signed_atom56!=null?signed_atom56.line:0);

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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:229:1: signed_atom returns [String type, int line] : ( INT | FLOAT | ( '-' | '+' ) a= signed_atom );
    public final ALangParser.signed_atom_return signed_atom() throws RecognitionException {
        ALangParser.signed_atom_return retval = new ALangParser.signed_atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token INT57=null;
        Token FLOAT58=null;
        Token set59=null;
        ALangParser.signed_atom_return a = null;


        Object INT57_tree=null;
        Object FLOAT58_tree=null;
        Object set59_tree=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:230:5: ( INT | FLOAT | ( '-' | '+' ) a= signed_atom )
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
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:230:7: INT
                    {
                    root_0 = (Object)adaptor.nil();

                    INT57=(Token)match(input,INT,FOLLOW_INT_in_signed_atom694); 
                    INT57_tree = (Object)adaptor.create(INT57);
                    adaptor.addChild(root_0, INT57_tree);

                    retval.type = "int";
                    retval.line = (INT57!=null?INT57.getLine():0);

                    }
                    break;
                case 2 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:231:7: FLOAT
                    {
                    root_0 = (Object)adaptor.nil();

                    FLOAT58=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_signed_atom706); 
                    FLOAT58_tree = (Object)adaptor.create(FLOAT58);
                    adaptor.addChild(root_0, FLOAT58_tree);

                    retval.type = "float";
                    retval.line = (FLOAT58!=null?FLOAT58.getLine():0);

                    }
                    break;
                case 3 :
                    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:232:7: ( '-' | '+' ) a= signed_atom
                    {
                    root_0 = (Object)adaptor.nil();

                    set59=(Token)input.LT(1);
                    if ( (input.LA(1)>=26 && input.LA(1)<=27) ) {
                        input.consume();
                        adaptor.addChild(root_0, (Object)adaptor.create(set59));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_signed_atom_in_signed_atom726);
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
    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:237:1: variableDeclarationList : a= ID ( ',' b= ID )* ;
    public final ALangParser.variableDeclarationList_return variableDeclarationList() throws RecognitionException {
        ALangParser.variableDeclarationList_return retval = new ALangParser.variableDeclarationList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token a=null;
        Token b=null;
        Token char_literal60=null;

        Object a_tree=null;
        Object b_tree=null;
        Object char_literal60_tree=null;

        try {
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:238:5: (a= ID ( ',' b= ID )* )
            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:238:7: a= ID ( ',' b= ID )*
            {
            root_0 = (Object)adaptor.nil();

            a=(Token)match(input,ID,FOLLOW_ID_in_variableDeclarationList755); 
            a_tree = (Object)adaptor.create(a);
            adaptor.addChild(root_0, a_tree);

            // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:238:12: ( ',' b= ID )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==30) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // D:\\Programming\\PROJECTS\\Eclipse\\workspace\\ALang\\src\\alang\\ALang.g:238:13: ',' b= ID
            	    {
            	    char_literal60=(Token)match(input,30,FOLLOW_30_in_variableDeclarationList758); 
            	    char_literal60_tree = (Object)adaptor.create(char_literal60);
            	    adaptor.addChild(root_0, char_literal60_tree);

            	    b=(Token)match(input,ID,FOLLOW_ID_in_variableDeclarationList762); 
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
    public static final BitSet FOLLOW_12_in_globalVariableDeclaration105 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_variableDeclarationList_in_globalVariableDeclaration107 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_globalVariableDeclaration109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_coroutineDeclarator_in_coroutineDeclaration126 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_coroutineDeclarator150 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_coroutineDeclarator153 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_coroutineDeclarator158 = new BitSet(new long[]{0x0000000001C50020L});
    public static final BitSet FOLLOW_statement_in_coroutineDeclarator160 = new BitSet(new long[]{0x0000000001C50020L});
    public static final BitSet FOLLOW_16_in_coroutineDeclarator163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_main198 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_main200 = new BitSet(new long[]{0x0000000001C50020L});
    public static final BitSet FOLLOW_statement_in_main202 = new BitSet(new long[]{0x0000000001C50020L});
    public static final BitSet FOLLOW_16_in_main205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assign_op_in_statement223 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_yield_op_in_statement233 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_call_coroutine_in_statement243 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_statement245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_statement_in_statement253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_while_statement_in_statement262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_if_statement288 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_if_statement290 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_logical_expression_in_if_statement291 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_if_statement292 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_if_statement294 = new BitSet(new long[]{0x0000000001C50020L});
    public static final BitSet FOLLOW_statement_in_if_statement296 = new BitSet(new long[]{0x0000000001C50020L});
    public static final BitSet FOLLOW_16_in_if_statement299 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_if_statement302 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_if_statement304 = new BitSet(new long[]{0x0000000001C50020L});
    public static final BitSet FOLLOW_statement_in_if_statement306 = new BitSet(new long[]{0x0000000001C50020L});
    public static final BitSet FOLLOW_16_in_if_statement309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_while_statement336 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_while_statement338 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_logical_expression_in_while_statement339 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_while_statement340 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_while_statement342 = new BitSet(new long[]{0x0000000001C50020L});
    public static final BitSet FOLLOW_statement_in_while_statement344 = new BitSet(new long[]{0x0000000001C50020L});
    public static final BitSet FOLLOW_16_in_while_statement347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_call_coroutine364 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_call_coroutine366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_logical_expression392 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RELATIONALOP_in_logical_expression394 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_logical_expression396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_yield_op415 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_yield_op417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assign_op435 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_assign_op437 = new BitSet(new long[]{0x000000000C0003A0L});
    public static final BitSet FOLLOW_expression_in_assign_op439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_mult_expr_in_expression484 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_26_in_expression508 = new BitSet(new long[]{0x000000000C0003A0L});
    public static final BitSet FOLLOW_27_in_expression512 = new BitSet(new long[]{0x000000000C0003A0L});
    public static final BitSet FOLLOW_mult_expr_in_expression517 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_atom_in_mult_expr572 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_28_in_mult_expr589 = new BitSet(new long[]{0x000000000C0003A0L});
    public static final BitSet FOLLOW_29_in_mult_expr593 = new BitSet(new long[]{0x000000000C0003A0L});
    public static final BitSet FOLLOW_atom_in_mult_expr598 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_ID_in_atom638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_atom650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_signed_atom_in_atom664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_signed_atom694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_signed_atom706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_signed_atom718 = new BitSet(new long[]{0x000000000C0003A0L});
    public static final BitSet FOLLOW_signed_atom_in_signed_atom726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_variableDeclarationList755 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_variableDeclarationList758 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_variableDeclarationList762 = new BitSet(new long[]{0x0000000040000002L});

}