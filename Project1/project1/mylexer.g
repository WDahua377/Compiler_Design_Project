lexer grammar mylexer;

options {
  language = Java;
}

/*----------------------*/
/*   Reserved Keywords  */
/*----------------------*/
INT_TYPE  : 'integer';
CHAR_TYPE : 'char';
VOID_TYPE : 'void';
FLOAT_TYPE: 'float';
LONG_TYPE : 'long';
CONST_TYPE : 'const';
STRUCT_TYPE :'struct';
WHILE     : 'WHILE';
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
PRINTF    : 'prinf';
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
AA_OP : '+=';      //Addition assignment
SA_OP : '-=';      //Subtraction assignment
MA_OP : '*=';      //Multiplication assignment
DA_OP : '/=';      //Division assignment
BN_OP : '~';       //Bitwise NOT
LPAREN : '(';      //Left paren
RPAREN : ')';      //Right paren
LBRACE : '{';      //Left brace
RBRACE : '}';      //Right brace
LBRACKET : '[';    //Left bracket
RBRACKET : ']';    //Right bracket
QUO_OP : '"';      //Quote
SQ_OP : '\'';      //Single quote
COMMA_OP : ',';
SEM_OP : ';';	     //Semicolon
COL_OP : ':';      //Colon
DOT_OP : '.';
POU_OP : '#';      //Pound sign
AS_OP : '=';
ADR_OP : '&';      //Address-of


DEC_NUM : ('0' | ('1'..'9')(DIGIT)*);

ID : (LETTER)(LETTER | DIGIT)*;
INCLUDE_FILE : (LETTER)+'.h';
STING : '"'(options{greedy=false;}: .)* '"';

FLOAT_NUM: FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3;
fragment FLOAT_NUM1: (DIGIT)+'.'(DIGIT)*;
fragment FLOAT_NUM2: '.'(DIGIT)+;
fragment FLOAT_NUM3: (DIGIT)+;
 

/* Comments */
COMMENT1 : '//'(.)*'\n';
COMMENT2 : '/*' (options{greedy=false;}: .)* '*/';



fragment LETTER : 'a'..'z' | 'A'..'Z' | '_';
fragment DIGIT : '0'..'9';


WS  : (' '|'\r'|'\t'|'\n')+ { skip(); };
