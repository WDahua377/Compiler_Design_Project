grammar myInterp;

options {
  language = Java;
}

@header {
  import java.util.HashMap;
  import java.util.Scanner;
}

@members {
  HashMap memory = new HashMap();
}

include
  :( '#' INCLUDE '<' INCLUDE_FILE '>' )* program
  ;

program
  : type MAIN '(' ')' '{' declarations[true] statements[true] '}'
  {}
  ;

declarations [boolean flaginput] //returns [string type, int value]
  : type ID ('=' b = arith_expression[$flaginput])?
  { if($flaginput == true) memory.put($ID.text, $b.value); }
   (declarations2[$flaginput])* ';'
  ;

declarations2 [boolean flaginput] //returns [string type, int value]
  : ','  (type)? a = ID ('=' b = arith_expression[$flaginput])? 
  { if($flaginput == true) memory.put($a.text, Integer.valueOf($b.value)); }
  (declarations[$flaginput])*
  ;

type //returns [string type]
  : INT_TYPE 
  | CHAR_TYPE 
  | VOID_TYPE 
  | FLOAT_TYPE 
  | LONG_TYPE 
  | CONST_TYPE 
  ;

statements[boolean flaginput]
  : statement[$flaginput] (statements[$flaginput])*
  ;

arith_expression[boolean flaginput] returns [int value]
  : a = multExpr[$flaginput] { if($flaginput == true) $value = $a.value; }
  ( '+' b = multExpr[$flaginput] { if($flaginput == true) $value = $a.value + $b.value; }
  | '-' b = multExpr[$flaginput] { if($flaginput == true){ $value =$a.value - $b.value; } })*
  ;

multExpr[boolean flaginput] returns [int value]
  : a = signExpr[$flaginput] { if($flaginput == true)  $value = $a.value; }
  ( '*' b = signExpr[$flaginput] { if($flaginput == true){$value = $a.value * $b.value;} } )*
  ;

signExpr[boolean flaginput] returns [int value]
  : a = primaryExpr[$flaginput]
  { if($flaginput == true) $value = $a.value; }
  | '-' a = primaryExpr[$flaginput]
  { if($flaginput == true) $value = 0 - $a.value; }
  ;

primaryExpr[boolean flaginput] returns [int value]
  : DEC_NUM { $value = Integer.parseInt($DEC_NUM.text); }
  //| FLOAT_NUM {  }
  | ID
  {
    Integer v = (Integer)memory.get($ID.text);
    if(v != null){
      System.out.println("ID.text:" + $ID.text);
      $value = v.intValue();
    }
    else
      System.err.println("undefined car: "+$ID.text);
  }
  |'(' arith_expression[$flaginput] ')' {$value = $arith_expression.value;}
  ;

statement[boolean flaginput]
    : PRINTF '(' (b = STRING )* ( ',' a = ID )? 
    {
      if(flaginput == true){
        String s = $b.text;
        int index = s.indexOf("\%d");

        if(index != -1 ){   //xxxx\%daaa
          Integer v = (Integer)memory.get($ID.text);
          int value;

          if(v != null){  //legal variable
            value = v.intValue();
            String subs = s.substring(1,index); //xxxx\%d
            int newline = subs.indexOf("\\n");

            if(newline != -1 ){  //xx\nxx\%d
              String subss = subs.substring(0,newline);   //xx\n
              System.out.println(subss);
              subss = subs.substring(newline+2, subs.length());   //xx\%d
              System.out.printf(subss + v);
            }

            else{ //xxxx\%d
              System.out.printf(subs + v);
            }

            subs = s.substring(index+2, s.length()-1);  //aaaa
            newline = subs.indexOf("\\n");

            if(newline != -1 ){  //aa\naa
              String subss = subs.substring(0,newline); //aa\n
              System.out.println(subss);
              //subss = subs.substring(newline+2, subs.length()); //aa
              subss = subs.substring(newline+2); //aa
              System.out.printf(subss);
            }

            else
              System.out.printf(subs);  //aaaa
          }

          else  //illegal variable
            System.err.println("undefined car: "+$ID.text);
        }

        else {  //"xxxxx"
          String subs = s.substring(1,s.length()-1);  //xxxxx
          int newline = subs.indexOf("\\n");

          if(newline != -1 ){   //xxx\naaa
            String subss = subs.substring(0,newline); //xxx\n
            System.out.println(subss);
            //subss = subs.substring(newline+2, subs.length()); //aaa
            subss = subs.substring(newline+2); //aaa
            System.out.printf(subss);
          }

          else //xxxaaa
            System.out.printf(subs);
        }
      }
    }
    ')' ';'
  
  | IF '(' f = conditions[$flaginput] ')' if_then_statements[$f.flag]
  | WHILE '(' f = conditions[$flaginput] ')' '{' statements[$f.flag] '}'
  | FOR '(' expression[$flaginput]? ';' f = conditions[$flaginput]? ';' expression[$flaginput] ')' '{' statements[$f.flag] '}'
  | SCANF '(' (b = STRING)+ ( ',' '&' ID)+ ')' ';'
  {
    if(flaginput == true){
      Scanner scanner = new Scanner(System.in);
      String s = $b.text;

      s = s.substring(1, s.length()-1);
      int n = s.indexOf("\%d");
      int c = scanner.nextInt();
      Integer i = Integer.valueOf(c);
      memory.put($ID.text,i);

      if(s.length() > 2)
        s = s.substring(n-2);
    }
  }
  | RETURN y = expression[$flaginput] ';'
  | ID d = operator k = arith_expression[$flaginput] ';'{
    if(flaginput == true){
      Integer v = (Integer)memory.get($ID.text);

      if(v != null){
        int value = v.intValue();
        if($d.index == 0){
          memory.put($ID.text, Integer.valueOf($k.value));
        }
        if($d.index == 1){
          value *= $k.value;
          memory.put($ID.text, Integer.valueOf(value));
        }
        if($d.index == 2){
          if($k.value == 0){
            System.out.println("Divide by Zero.");
          }
          else{
            value /= $k.value;
            memory.put($ID.text, Integer.valueOf(value));
          }
        }
        if($d.index == 3){
          value += $k.value;
          memory.put($ID.text, Integer.valueOf(value));
        }
        if($d.index == 4){
          value -= $k.value;
          memory.put($ID.text, Integer.valueOf(value));
        }
      }
      else
        System.err.println("undefined car: "+$ID.text);
    }
  }
  | BREAK ';'
  | DO '{' statements[$f.flag] '}' WHILE '(' f = conditions[$flaginput] ')' ';'
  | declarations[$flaginput]
  ;

conditions[boolean flaginput] returns [boolean flag]
  : f = expression[$flaginput] ( ('||' | '&&') expression[$flaginput] )*
  { if(flaginput == true) $flag = $f.flag; }
  ;

expression[boolean flaginput]  returns [boolean flag]
  :(type )? a = arith_expression[$flaginput] (d = operator b = arith_expression[$flaginput])* {
    if(flaginput == true){

      if($d.index == 5){
        if($a.value == $b.value)
          $flag = true;
        else
          $flag = false;
        }
      if($d.index == 6){
        if($a.value != $b.value)
          $flag = true;
        else
          $flag = false;
        }
      if($d.index == 7){
        if($a.value < $b.value)
          $flag = true;
        else
          $flag = false;
        }
      if($d.index == 8){
        if($a.value > $b.value)
          $flag = true;
        else
          $flag = false;
        }
      if($d.index == 9){
        if($a.value <= $b.value)
          $flag = true;
        else
          $flag = false;
        }
      if($d.index == 10){
        if($a.value >= $b.value)
          $flag = true;
        else
          $flag = false;
        }
      }
    }
  ;

if_then_statements [boolean flaginput]
  : '{'? statements[$flaginput] '}'? ( ELSE IF? '{'? statements[!$flaginput] '}'?)*
;

operator returns [int index]
  :a = assignment_operator  { $index = $a.index; System.out.println("index:" + $index);}
  |b = compare_operator { $index = $b.index; System.out.println("index:" + $index);}
;

assignment_operator returns [int index]
  : '=' { $index = 0; }
  | '*='  { $index = 1; }
  | '/='  { $index = 2; }
  | '+='  { $index = 3; }
  | '-='  { $index = 4; }
;

compare_operator returns [int index]
  : '==' { $index = 5; }
  | '!='   { $index = 6; }
  | '<'  { $index = 7; }
  | '>'  { $index = 8; }
  | '<='   { $index = 9; }
  | '>='   { $index = 10; }
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
AA_OP : '+=';       //Addition assignment
SA_OP : '-=';       //Subtraction assignment
MA_OP : '*=';       //Multiplication assignment
DA_OP : '/=';       //Division assignment
BN_OP : '~';        //Bitwise NOT
LPAREN : '(';       //Left paren
RPAREN : ')';       //Right paren
LBRACE : '{';       //Left brace
RBRACE : '}';       //Right brace
LBRACKET : '[';     //Left bracket
RBRACKET : ']';     //Right bracket
QUO_OP : '"';       //Quote
SQ_OP : '\'';       //Single quote
COMMA_OP : ',';
SEM_OP : ';';     	//Semicolon
COL_OP : ':';       //Colon
DOT_OP : '.';
POU_OP : '#';       //Pound sign
AS_OP : '=';
ADR_OP : '&';      //Address-of

fragment LETTER : 'a'..'z' | 'A'..'Z' | '_';
fragment DIGIT : '0'..'9';

DEC_NUM : ('0' | ('1'..'9')(DIGIT)*);

ID : (LETTER)(LETTER | DIGIT)*;
INCLUDE_FILE : (LETTER)+'.h';
STRING : '"' (options{greedy=false;}: .)* '"';
// ANTLR Version 4: STRING : '"' .*? '"';

FLOAT_NUM: FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3;
fragment FLOAT_NUM1: (DIGIT)+'.'(DIGIT)*;
fragment FLOAT_NUM2: '.'(DIGIT)+;
fragment FLOAT_NUM3: (DIGIT)+;
 

/* Comments */
COMMENT1 : '//'(.)*'\n'{$channel=HIDDEN;};
COMMENT2 : '/*' (options{greedy=false;}: .)* '*/'{$channel=HIDDEN;};
// ANTLR Version 4: COMMENT2 : '/*' .*? '*/' {$channel = HIDDEN;};

WS  : (' '|'\r'|'\t'|'\n')+ {$channel=HIDDEN;};
