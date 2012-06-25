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
}

program
    :  globalVariableDeclaration? coroutineDeclaration main EOF
    ;
    
globalVariableDeclaration
    : 'global:' variableList ';'
    ;

coroutineDeclaration
    : coroutineDeclarator*
    ;


coroutineDeclarator
    :  'coroutine'  ID '{' statement* '}'
    ;

main
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
    : 'if' '('logical_expression')' '{' statement* '}' ('else' '{' statement* '}')?
    ;

while_statement
    : 'while' '('logical_expression')' '{' statement* '}'
    ;

call_coroutine
    : '@' ID
    ;

logical_expression
    :  ID RELATIONALOP ID
    ;



yield_op
    : 'yield' ID 
    ;

assign_op
    : ID '=' expression
    ;
    
expression
    : mult_expr (('+'|'-') mult_expr)*  
    ;

mult_expr
    : atom (('*'|'/') atom)*
    ; 

atom
    : ID
    | STRING
    | signed_atom
    ;
    
signed_atom
    : INT
    | FLOAT
    | ('-'|'+') signed_atom
    
    ;


variableList
    : ID (',' ID)*
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
