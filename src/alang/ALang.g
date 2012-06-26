grammar ALang;

options {
  //language = Java;
  output = AST;
}


tokens{
  PROGRAM;
}


@header {

package alang;  
  
}


@lexer::header {
  package alang;
}


@members{
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
}

program
    :  globalVariableDeclaration? coroutineDeclaration  main EOF 
      {
        if(!names.checkCallCoroutine()){
          names.getAllErrors(errors);
        }
      }
    ;
    
globalVariableDeclaration
@init{
  currentBlock = "global";
  blocks.add(currentBlock);
  blocks.add(currentBlock);
}
@after{
  blocks.remove(blocks.size()-1);
  this.currentBlock=blocks.get(blocks.size()-1);
}
    : 'global:' variableDeclarationList ';'
    ;

coroutineDeclaration
    : coroutineDeclarator*
    ;


coroutineDeclarator
@after{
  blocks.remove(blocks.size()-1);
  this.currentBlock=blocks.get(blocks.size()-1);
}
    :  'coroutine'  ID  {this.currentBlock="coroutine_"+$ID.text; blocks.add(currentBlock);} '{' statement* '}'
        {
          if(!names.isExistCoroutine(this.currentBlock)){
            names.addCoroutine(names.new Coroutine(this.currentBlock, $ID.line));
          }
          else{
            errors.add("line "+$ID.line+": duplicated coroutine declaration "+$ID.text);
          }
        }
    ;

main
@init{
  this.currentBlock="main";
  blocks.add(currentBlock);
}
@after{
  blocks.remove(blocks.size()-1);
  this.currentBlock=blocks.get(blocks.size()-1);
}
    : 'main' '{' statement* '}'
    ;


statement
    : assign_op ';'
    | yield_op ';'
    | call_coroutine ';'
    | if_statement 
    | while_statement 
    ;

if_statement
@init{
  idCurrentBlock++; 
  currentBlock = Integer.toString(idCurrentBlock); 
  blocks.add(currentBlock);
}
@after{
  blocks.remove(blocks.size()-1);
  this.currentBlock=blocks.get(blocks.size()-1);
}
    : 'if' '('logical_expression')' '{' statement* '}' ('else' '{' statement* '}')?
    ;

while_statement
@init{
  idCurrentBlock++; 
  currentBlock = Integer.toString(idCurrentBlock); 
  blocks.add(currentBlock);
}
@after{
  blocks.remove(blocks.size()-1);
  this.currentBlock=blocks.get(blocks.size()-1);
}
    : 'while' '('logical_expression')' '{' statement* '}'
    ;

call_coroutine
    : '@' ID
      {
        if(!names.isExistCoroutine("coroutine_"+$ID.text)){
          errors.add("line "+$ID.line+": coroutine "+$ID.text+" doesn't exists");
        }
      }
    ;

logical_expression
    :  a=ID RELATIONALOP b=ID
      {
        if(!names.isExistVariable(blocks,$a.text)){
          errors.add("line "+$a.line+": variable "+$a.text+" have undefined type");
        }
        else{
          String type = names.getVariableType(names.getVariableBlock(blocks,$a.text),$a.text);
          if(type.equals("undef")){
            errors.add("line "+$a.line+": variable "+$a.text+" have undefined type");
          }
        }
        
        if(!names.isExistVariable(blocks,$a.text)){
          errors.add("line "+$b.line+": variable "+$b.text+" have undefined type");
        }
        else{
          String type = names.getVariableType(names.getVariableBlock(blocks,$b.text),$b.text);
          if(type.equals("undef")){
            errors.add("line "+$b.line+": variable "+$b.text+" have undefined type");
          }
        }
        
      }
    ;



yield_op
    : 'yield' ID 
      {
      
        boolean res = false;
        for(String tmp: blocks){
          if(tmp.indexOf("coroutine_")!=-1) {res=true; names.addCallCoroutine($ID.text,$ID.line);}
        }
        if(!res){
           errors.add("line "+$ID.line+": yield statement may be only into coroutine's body");
        }
      }
    ;

assign_op
    : ID '=' expression
      {
          String varBlock=this.currentBlock;
          if(names.isExistVariable(blocks,$ID.text)){
            varBlock = names.getVariableBlock(blocks,$ID.text);
          }
          else{
            names.addVariable(names.new VariableName(this.currentBlock+"."+$ID.text,"undef",$ID.line));
            varBlock=this.currentBlock;
          }
          if(!names.checkAssignOperation(varBlock,$ID.text, $expression.type, $ID.line)){
             errors.add(names.getLastError());
          }
          else{
             //typeChecker.getResultType("+",names.getVariableType(varBlock,$ID.text,$expression.type));
          }
          
      }
    ;
    
expression returns[String type]
scope{
  String lastType;
}
@init{
  $expression::lastType="";
}
@after{ 
  $type = $expression::lastType; 
}
    : a=mult_expr 
          {
              $expression::lastType = $a.type;
          } 
    ((c='+'|c='-') b=mult_expr
          { 
               if(!typeChecker.checkMathExpr($expression::lastType, $b.type)){
                  $expression::lastType="error";
                  errors.add("line "+$b.line+": type mismatch");
               }
               else{
                  $expression::lastType=typeChecker.getResultType($c.text,$b.type, $expression::lastType);
               }
          }
    )*  
    ;

mult_expr returns [String type, int line]
scope{
  String lastType;
}
@init{
  $mult_expr::lastType="";
}
@after{ 
  $type = $mult_expr::lastType; 
  $line = $a.line;
}
    : a=atom
    {
      $mult_expr::lastType = $a.type;
    } 
    ((c='*'|c='/') b=atom
          {
               if(!typeChecker.checkMathExpr($mult_expr::lastType, $b.type)){
                  $mult_expr::lastType="error";
                  errors.add("line "+$b.line+": type mismatch");
               }
               else{
                  $mult_expr::lastType=typeChecker.getResultType($c.text,$b.type, $mult_expr::lastType);
               }
          }
    )*
    ; 

atom returns[String type, int line]
    : ID {$type = names.getVariableType(names.getVariableBlock(blocks,$ID.text),$ID.text);} {$line = $ID.line;}
    | STRING {$type = "string";}   {$line = $STRING.line;}
    | signed_atom {$type = $signed_atom.type;}   {$line = $signed_atom.line;}
    ;
    
signed_atom returns[String type, int line]
    : INT {$type = "int";} {$line = $INT.line;}
    | FLOAT {$type = "float";} {$line = $FLOAT.line;}
    | ('-'|'+') a=signed_atom {$type = $a.type;} {$line = $a.line;}
    
    ;


variableDeclarationList
    : a=ID (',' b=ID {names.addVariable(names.new VariableName(this.currentBlock+"."+$b.text, "undef", $b.line));})*
    {names.addVariable(names.new VariableName(this.currentBlock+"."+$a.text, "undef", $a.line));}    
    ;

RELATIONALOP
    :  '>'
    |  '<' 
    |  '<='
    |  '>='
    |  '!='
    |  '=='
    ;


ID  : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT : '0'..'9'+
    ;

FLOAT
    :   ('0'..'9')+ '.' ('0'..'9')* 
    |   '.' ('0'..'9')+
    |   ('0'..'9')+ 
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '|'\t' |'\r'|'\n') {$channel=HIDDEN;}
    ;

STRING
    :  '"' (~('\\'|'"') )* '"'
    ;
