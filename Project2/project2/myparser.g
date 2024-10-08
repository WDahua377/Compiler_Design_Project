grammar myparser;

options {
  language = Java;
}

@header {
  //inport packages here.
}

@members {
  boolean TRACEON = true;
}

include
  :( '#' INCLUDE '<' INCLUDE INCLUDE_FILE '>' )* program
  { if (TRACEON) System.out.println("include:( '#' INCLUDE '<' INCLUDE INCLUDE_FILE '>' )* program"); }
  ;

program
  : type MAIN '(' ')' '{' declarations statements '}'
  { if (TRACEON) System.out.println("program:type MAIN ( ) { declarations statements }"); }
  ;

//declarations:type ID ';' declarations
declarations
  : type ID ('=' primaryExpr)? (','  type ID ('=' primaryExpr)?)* ';' (declarations)*
  { if (TRACEON) System.out.println("declarations:type ID (','  type ID)* ';'"); }
  | STRUCT_TYPE ID '{' (declarations)*  '}' ID ';'
  { if (TRACEON) System.out.println("declarations:STRUCT_TYPE ID '{' (declarations)*  '}' ID ';'"); }
  ;

type
  : INT_TYPE { if (TRACEON) System.out.println("type:INT_TYPE"); }
  | CHAR_TYPE { if (TRACEON) System.out.println("type:CHAR_TYPE"); }
  | VOID_TYPE { if (TRACEON) System.out.println("type:VOID_TYPE"); }
  | FLOAT_TYPE { if (TRACEON) System.out.println("type:FLOAT_TYPE"); }
  | LONG_TYPE { if (TRACEON) System.out.println("type:LONG_TYPE"); }
  | CONST_TYPE { if (TRACEON) System.out.println("type:CONST_TYPE"); };

    //|STRUCT_TYPE { if (TRACEON) System.out.println("type:STRUCT_TYPE"); };

statements
  : statement (statements)*
  { if (TRACEON) System.out.println("statements:statements statements"); };

arith_expression
  : multExpr ( '+' multExpr | '-' multExpr)*
  { if (TRACEON) System.out.println("arith_expression:multExpr( + multExpr | - multExpr)*"); };

multExpr
  : signExpr ( '*' signExpr | '/' signExpr)*
  { if (TRACEON) System.out.println("multExpr:signExpr ( * signExpr | / signExpr)*"); };

signExpr
  : primaryExpr
  { if (TRACEON) System.out.println("signExpr:primaryExpr"); }
  | '-' primaryExpr
  { if (TRACEON) System.out.println("signExpr:- primaryExpr"); };

primaryExpr
  : DEC_NUM
  { if (TRACEON) System.out.println("primaryExpr:DEC_NUM"); }
  | FLOAT_NUM
  { if (TRACEON) System.out.println("primaryExpr:FLOAT_NUM"); }
  | ID
  { if (TRACEON) System.out.println("primaryExpr:ID"); }
  |'(' arith_expression ')'
  { if (TRACEON) System.out.println("primaryExpr:( arith expression )"); }
  ;

statement
  : PRINTF '(' STRING ( ',' ID)* ')' ';'
  { if (TRACEON) System.out.println("statement:PRINTF ( STRING ( , ID)* ) ;"); }
  | IF '(' conditions ')' if_then_statements
  { if (TRACEON) System.out.println("statement:IF ( conditions ) if_then_statements"); }
  | WHILE '(' conditions ')' '{' statements '}'
  { if (TRACEON) System.out.println("statement:WHILE ( conditions ) { statements }"); }
  | FOR '(' expression? ';' conditions? ';' expression ')' '{' statements '}'
  { if (TRACEON) System.out.println("statement:FOR ( expression? ; conditions? ; expression ) { statements }"); }
  | SCANF '(' STRING ( ',' '&' ID)+ ')' ';'
  { if (TRACEON) System.out.println("statement:SCANF ( STRING ( , & ID)+ ) ;"); }
  | RETURN expression ';'
  { if (TRACEON) System.out.println("statement:RETURN expression ;"); }
  | (operator)? ID operator (arith_expression)? ';'
  { if (TRACEON) System.out.println("statement:(operator)? ID operator (arith_expression)? ;"); }
  | BREAK ';'
  { if (TRACEON) System.out.println("statement:BREAK ';'"); }
  | DO '{' statements '}' WHILE '(' conditions ')' ';'
  { if (TRACEON) System.out.println("statement:DO { statements } WHILE ( conditions ) ;"); }
  | declarations
  { if (TRACEON) System.out.println("statement:declarations"); }
  ;

conditions
  : expression ( ('||' | '&&') expression )*
  { if (TRACEON) System.out.println("conditions:expression ( (|| | &&) expression )*"); }
  ;

expression
  :(type )? arith_expression (operator arith_expression)* 
  { if (TRACEON) System.out.println("expression:(type )? arith_expression (operator arith_expression)* "); }
  ;

if_then_statements
  : '{'? statements '}'? ( ELSE IF? '{'? statements '}'?)*
  { if (TRACEON) System.out.println("if_then_statements:{? statements }? ( ELSE IF? { statements })*"); }
;

operator
  :assignment_operator 
  { if (TRACEON) System.out.println("operator:assignment_operator "); }
  |compare_operator
  { if (TRACEON) System.out.println("operator:compare_operator"); }
  | '++'{ if (TRACEON) System.out.println("operator:++"); }
  | '--'{ if (TRACEON) System.out.println("operator:--"); }
;

assignment_operator
  : '='{ if (TRACEON) System.out.println("assignment_operator:="); }
  | '*='{ if (TRACEON) System.out.println("assignment_operator:*="); }
  | '/='{ if (TRACEON) System.out.println("assignment_operator:/="); }
  | '+='{ if (TRACEON) System.out.println("assignment_operator:+="); }
  | '-='{ if (TRACEON) System.out.println("assignment_operator:-="); }
;

compare_operator
  : '=='{ if (TRACEON) System.out.println("compare_operator:=="); }
  | '!='{ if (TRACEON) System.out.println("compare_operator:!="); }
  | '<'{ if (TRACEON) System.out.println("compare_operator:<"); }
  | '>'{ if (TRACEON) System.out.println("compare_operator:>"); }
  | '<='{ if (TRACEON) System.out.println("compare_operator:<="); }
  | '>='{ if (TRACEON) System.out.println("compare_operator:>="); }
;

//terminal
/*----------------------*/
/*   Reserved Keywords  */
/*----------------------*/
INT_TYPE  : 'int';
CHAR_TYPE : 'char';
VOID_TYPE : 'void';
FLOAT_TYPE: 'float';
LONG_TYPE : 'long';
CONST_TYPE : 'const';
STRUCT_TYPE :'struct';
WHILE     : 'while';
IF        : 'if';
ELSE      : 'else';
BREAK     : 'break';
DO        : 'do';
SWITCH    : 'switch';
CASE      : 'case';
CONTINUE  : 'contnue';
RETURN    : 'return';
FOR       : 'for';
MAIN      : 'main';
NULL      : 'null';
DEFAULT   : 'defalut';
INCLUDE   : 'include';
PRINTF    : 'printf';
SCANF     : 'scanf';


/*----------------------*/
/*  Compound Operators  */
/*----------------------*/

EQ_OP : '==';
LE_OP : '<=';
GE_OP : '>=';
NE_OP : '!=';
PP_OP : '++';
MM_OP : '--'; 
RSHIFT_OP : '<<';
LSHIFT_OP : '>>';
AND_OP : '&&';
OR_OP : '||';
GT_OP : '>';
LT_OP : '<';
NOT_OP : '!';
MOD_OP : '%';
DIV_OP : '/';
MUL_OP : '*';
ADD_OP : '+';
SUB_OP : '-';
AA_OP : '+=';   //Addition assignment
SA_OP : '-=';   //Subtraction assignment
MA_OP : '*=';   //Multiplication assignment
DA_OP : '/=';   //Division assignment
BN_OP : '~';    //Bitwise NOT
LPAREN : '(';   //Left paren
RPAREN : ')';   //Right paren
LBRACE : '{';   //Left brace
RBRACE : '}';   //Right brace
LBRACKET : '[';    //Left bracket
RBRACKET : ']';    //Right bracket
QUO_OP : '"';   //Quote
SQ_OP : '\'';   //Single quote
COMMA_OP : ',';
SEM_OP : ';';	//Semicolon
COL_OP : ':';   //Colon
DOT_OP : '.';
POU_OP : '#';   //Pound sign
AS_OP : '=';
ADR_OP : '&';   //Address-of

fragment LETTER : 'a'..'z' | 'A'..'Z' | '_';
fragment DIGIT : '0'..'9';

DEC_NUM : ('0' | ('1'..'9')(DIGIT)*);

ID : (LETTER)(LETTER | DIGIT)*;
INCLUDE_FILE : (LETTER)+'.h';
STRING : '"' ( options {greedy=false; }: .)* '"';

FLOAT_NUM: FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3;
fragment FLOAT_NUM1: (DIGIT)+'.'(DIGIT)*;
fragment FLOAT_NUM2: '.'(DIGIT)+;
fragment FLOAT_NUM3: (DIGIT)+;
 

/* Comments */
COMMENT1 : '//'(.)*'\n'{$channel=HIDDEN;};
COMMENT2 : '/*' (options{greedy=false;}: .)* '*/'{$channel=HIDDEN;};

WS  : (' '|'\r'|'\t'|'\n')+ {$channel=HIDDEN;};
