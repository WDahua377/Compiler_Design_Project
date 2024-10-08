// $ANTLR 3.5.2 mylexer.g 2024-10-07 21:11:36

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class mylexer extends Lexer {
	public static final int EOF=-1;
	public static final int AA_OP=4;
	public static final int ADD_OP=5;
	public static final int ADR_OP=6;
	public static final int AND_OP=7;
	public static final int AS_OP=8;
	public static final int BN_OP=9;
	public static final int BREAK=10;
	public static final int CASE=11;
	public static final int CHAR_TYPE=12;
	public static final int COL_OP=13;
	public static final int COMMA_OP=14;
	public static final int COMMENT1=15;
	public static final int COMMENT2=16;
	public static final int CONST_TYPE=17;
	public static final int CONTINUE=18;
	public static final int DA_OP=19;
	public static final int DEC_NUM=20;
	public static final int DEFAULT=21;
	public static final int DIGIT=22;
	public static final int DIV_OP=23;
	public static final int DO=24;
	public static final int DOT_OP=25;
	public static final int ELSE=26;
	public static final int EQ_OP=27;
	public static final int FLOAT_NUM=28;
	public static final int FLOAT_NUM1=29;
	public static final int FLOAT_NUM2=30;
	public static final int FLOAT_NUM3=31;
	public static final int FLOAT_TYPE=32;
	public static final int FOR=33;
	public static final int GE_OP=34;
	public static final int GT_OP=35;
	public static final int ID=36;
	public static final int IF=37;
	public static final int INCLUDE=38;
	public static final int INCLUDE_FILE=39;
	public static final int INT_TYPE=40;
	public static final int LBRACE=41;
	public static final int LBRACKET=42;
	public static final int LETTER=43;
	public static final int LE_OP=44;
	public static final int LONG_TYPE=45;
	public static final int LPAREN=46;
	public static final int LSHIFT_OP=47;
	public static final int LT_OP=48;
	public static final int MAIN=49;
	public static final int MA_OP=50;
	public static final int MM_OP=51;
	public static final int MOD_OP=52;
	public static final int MUL_OP=53;
	public static final int NE_OP=54;
	public static final int NOT_OP=55;
	public static final int NULL=56;
	public static final int OR_OP=57;
	public static final int POU_OP=58;
	public static final int PP_OP=59;
	public static final int PRINTF=60;
	public static final int QUO_OP=61;
	public static final int RBRACE=62;
	public static final int RBRACKET=63;
	public static final int RETURN=64;
	public static final int RPAREN=65;
	public static final int RSHIFT_OP=66;
	public static final int SA_OP=67;
	public static final int SCANF=68;
	public static final int SEM_OP=69;
	public static final int SQ_OP=70;
	public static final int STING=71;
	public static final int STRUCT_TYPE=72;
	public static final int SUB_OP=73;
	public static final int SWITCH=74;
	public static final int VOID_TYPE=75;
	public static final int WHILE=76;
	public static final int WS=77;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public mylexer() {} 
	public mylexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public mylexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "mylexer.g"; }

	// $ANTLR start "INT_TYPE"
	public final void mINT_TYPE() throws RecognitionException {
		try {
			int _type = INT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:10:11: ( 'integer' )
			// mylexer.g:10:13: 'integer'
			{
			match("integer"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_TYPE"

	// $ANTLR start "CHAR_TYPE"
	public final void mCHAR_TYPE() throws RecognitionException {
		try {
			int _type = CHAR_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:11:11: ( 'char' )
			// mylexer.g:11:13: 'char'
			{
			match("char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR_TYPE"

	// $ANTLR start "VOID_TYPE"
	public final void mVOID_TYPE() throws RecognitionException {
		try {
			int _type = VOID_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:12:11: ( 'void' )
			// mylexer.g:12:13: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOID_TYPE"

	// $ANTLR start "FLOAT_TYPE"
	public final void mFLOAT_TYPE() throws RecognitionException {
		try {
			int _type = FLOAT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:13:11: ( 'float' )
			// mylexer.g:13:13: 'float'
			{
			match("float"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_TYPE"

	// $ANTLR start "LONG_TYPE"
	public final void mLONG_TYPE() throws RecognitionException {
		try {
			int _type = LONG_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:14:11: ( 'long' )
			// mylexer.g:14:13: 'long'
			{
			match("long"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LONG_TYPE"

	// $ANTLR start "CONST_TYPE"
	public final void mCONST_TYPE() throws RecognitionException {
		try {
			int _type = CONST_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:15:12: ( 'const' )
			// mylexer.g:15:14: 'const'
			{
			match("const"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONST_TYPE"

	// $ANTLR start "STRUCT_TYPE"
	public final void mSTRUCT_TYPE() throws RecognitionException {
		try {
			int _type = STRUCT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:16:13: ( 'struct' )
			// mylexer.g:16:14: 'struct'
			{
			match("struct"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRUCT_TYPE"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:17:11: ( 'WHILE' )
			// mylexer.g:17:13: 'WHILE'
			{
			match("WHILE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:18:11: ( 'if' )
			// mylexer.g:18:13: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:19:11: ( 'else' )
			// mylexer.g:19:13: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "BREAK"
	public final void mBREAK() throws RecognitionException {
		try {
			int _type = BREAK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:20:11: ( 'break' )
			// mylexer.g:20:13: 'break'
			{
			match("break"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BREAK"

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:21:11: ( 'do' )
			// mylexer.g:21:13: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO"

	// $ANTLR start "SWITCH"
	public final void mSWITCH() throws RecognitionException {
		try {
			int _type = SWITCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:22:11: ( 'switch' )
			// mylexer.g:22:13: 'switch'
			{
			match("switch"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SWITCH"

	// $ANTLR start "CASE"
	public final void mCASE() throws RecognitionException {
		try {
			int _type = CASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:23:11: ( 'case' )
			// mylexer.g:23:13: 'case'
			{
			match("case"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CASE"

	// $ANTLR start "CONTINUE"
	public final void mCONTINUE() throws RecognitionException {
		try {
			int _type = CONTINUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:24:11: ( 'contnue' )
			// mylexer.g:24:13: 'contnue'
			{
			match("contnue"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONTINUE"

	// $ANTLR start "RETURN"
	public final void mRETURN() throws RecognitionException {
		try {
			int _type = RETURN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:25:11: ( 'return' )
			// mylexer.g:25:13: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RETURN"

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:26:11: ( 'for' )
			// mylexer.g:26:13: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR"

	// $ANTLR start "MAIN"
	public final void mMAIN() throws RecognitionException {
		try {
			int _type = MAIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:27:11: ( 'main' )
			// mylexer.g:27:13: 'main'
			{
			match("main"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAIN"

	// $ANTLR start "NULL"
	public final void mNULL() throws RecognitionException {
		try {
			int _type = NULL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:28:11: ( 'null' )
			// mylexer.g:28:13: 'null'
			{
			match("null"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NULL"

	// $ANTLR start "DEFAULT"
	public final void mDEFAULT() throws RecognitionException {
		try {
			int _type = DEFAULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:29:11: ( 'defalut' )
			// mylexer.g:29:13: 'defalut'
			{
			match("defalut"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEFAULT"

	// $ANTLR start "INCLUDE"
	public final void mINCLUDE() throws RecognitionException {
		try {
			int _type = INCLUDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:30:11: ( 'include' )
			// mylexer.g:30:13: 'include'
			{
			match("include"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INCLUDE"

	// $ANTLR start "PRINTF"
	public final void mPRINTF() throws RecognitionException {
		try {
			int _type = PRINTF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:31:11: ( 'prinf' )
			// mylexer.g:31:13: 'prinf'
			{
			match("prinf"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRINTF"

	// $ANTLR start "SCANF"
	public final void mSCANF() throws RecognitionException {
		try {
			int _type = SCANF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:32:11: ( 'scanf' )
			// mylexer.g:32:13: 'scanf'
			{
			match("scanf"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SCANF"

	// $ANTLR start "EQ_OP"
	public final void mEQ_OP() throws RecognitionException {
		try {
			int _type = EQ_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:39:7: ( '==' )
			// mylexer.g:39:9: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ_OP"

	// $ANTLR start "LE_OP"
	public final void mLE_OP() throws RecognitionException {
		try {
			int _type = LE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:40:7: ( '<=' )
			// mylexer.g:40:9: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LE_OP"

	// $ANTLR start "GE_OP"
	public final void mGE_OP() throws RecognitionException {
		try {
			int _type = GE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:41:7: ( '>=' )
			// mylexer.g:41:9: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GE_OP"

	// $ANTLR start "NE_OP"
	public final void mNE_OP() throws RecognitionException {
		try {
			int _type = NE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:42:7: ( '!=' )
			// mylexer.g:42:9: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NE_OP"

	// $ANTLR start "PP_OP"
	public final void mPP_OP() throws RecognitionException {
		try {
			int _type = PP_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:43:7: ( '++' )
			// mylexer.g:43:9: '++'
			{
			match("++"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PP_OP"

	// $ANTLR start "MM_OP"
	public final void mMM_OP() throws RecognitionException {
		try {
			int _type = MM_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:44:7: ( '--' )
			// mylexer.g:44:9: '--'
			{
			match("--"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MM_OP"

	// $ANTLR start "RSHIFT_OP"
	public final void mRSHIFT_OP() throws RecognitionException {
		try {
			int _type = RSHIFT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:45:11: ( '<<' )
			// mylexer.g:45:13: '<<'
			{
			match("<<"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RSHIFT_OP"

	// $ANTLR start "LSHIFT_OP"
	public final void mLSHIFT_OP() throws RecognitionException {
		try {
			int _type = LSHIFT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:46:11: ( '>>' )
			// mylexer.g:46:13: '>>'
			{
			match(">>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LSHIFT_OP"

	// $ANTLR start "AND_OP"
	public final void mAND_OP() throws RecognitionException {
		try {
			int _type = AND_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:47:8: ( '&&' )
			// mylexer.g:47:10: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND_OP"

	// $ANTLR start "OR_OP"
	public final void mOR_OP() throws RecognitionException {
		try {
			int _type = OR_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:48:7: ( '||' )
			// mylexer.g:48:9: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR_OP"

	// $ANTLR start "GT_OP"
	public final void mGT_OP() throws RecognitionException {
		try {
			int _type = GT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:49:7: ( '>' )
			// mylexer.g:49:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GT_OP"

	// $ANTLR start "LT_OP"
	public final void mLT_OP() throws RecognitionException {
		try {
			int _type = LT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:50:7: ( '<' )
			// mylexer.g:50:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT_OP"

	// $ANTLR start "NOT_OP"
	public final void mNOT_OP() throws RecognitionException {
		try {
			int _type = NOT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:51:8: ( '!' )
			// mylexer.g:51:10: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT_OP"

	// $ANTLR start "MOD_OP"
	public final void mMOD_OP() throws RecognitionException {
		try {
			int _type = MOD_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:52:8: ( '%' )
			// mylexer.g:52:10: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOD_OP"

	// $ANTLR start "DIV_OP"
	public final void mDIV_OP() throws RecognitionException {
		try {
			int _type = DIV_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:53:8: ( '/' )
			// mylexer.g:53:10: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV_OP"

	// $ANTLR start "MUL_OP"
	public final void mMUL_OP() throws RecognitionException {
		try {
			int _type = MUL_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:54:8: ( '*' )
			// mylexer.g:54:10: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MUL_OP"

	// $ANTLR start "ADD_OP"
	public final void mADD_OP() throws RecognitionException {
		try {
			int _type = ADD_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:55:8: ( '+' )
			// mylexer.g:55:10: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADD_OP"

	// $ANTLR start "SUB_OP"
	public final void mSUB_OP() throws RecognitionException {
		try {
			int _type = SUB_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:56:8: ( '-' )
			// mylexer.g:56:10: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUB_OP"

	// $ANTLR start "AA_OP"
	public final void mAA_OP() throws RecognitionException {
		try {
			int _type = AA_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:57:7: ( '+=' )
			// mylexer.g:57:9: '+='
			{
			match("+="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AA_OP"

	// $ANTLR start "SA_OP"
	public final void mSA_OP() throws RecognitionException {
		try {
			int _type = SA_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:58:7: ( '-=' )
			// mylexer.g:58:9: '-='
			{
			match("-="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SA_OP"

	// $ANTLR start "MA_OP"
	public final void mMA_OP() throws RecognitionException {
		try {
			int _type = MA_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:59:7: ( '*=' )
			// mylexer.g:59:9: '*='
			{
			match("*="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MA_OP"

	// $ANTLR start "DA_OP"
	public final void mDA_OP() throws RecognitionException {
		try {
			int _type = DA_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:60:7: ( '/=' )
			// mylexer.g:60:9: '/='
			{
			match("/="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DA_OP"

	// $ANTLR start "BN_OP"
	public final void mBN_OP() throws RecognitionException {
		try {
			int _type = BN_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:61:7: ( '~' )
			// mylexer.g:61:9: '~'
			{
			match('~'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BN_OP"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:62:8: ( '(' )
			// mylexer.g:62:10: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAREN"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:63:8: ( ')' )
			// mylexer.g:63:10: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAREN"

	// $ANTLR start "LBRACE"
	public final void mLBRACE() throws RecognitionException {
		try {
			int _type = LBRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:64:8: ( '{' )
			// mylexer.g:64:10: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LBRACE"

	// $ANTLR start "RBRACE"
	public final void mRBRACE() throws RecognitionException {
		try {
			int _type = RBRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:65:8: ( '}' )
			// mylexer.g:65:10: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RBRACE"

	// $ANTLR start "LBRACKET"
	public final void mLBRACKET() throws RecognitionException {
		try {
			int _type = LBRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:66:10: ( '[' )
			// mylexer.g:66:12: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LBRACKET"

	// $ANTLR start "RBRACKET"
	public final void mRBRACKET() throws RecognitionException {
		try {
			int _type = RBRACKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:67:10: ( ']' )
			// mylexer.g:67:12: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RBRACKET"

	// $ANTLR start "QUO_OP"
	public final void mQUO_OP() throws RecognitionException {
		try {
			int _type = QUO_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:68:8: ( '\"' )
			// mylexer.g:68:10: '\"'
			{
			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUO_OP"

	// $ANTLR start "SQ_OP"
	public final void mSQ_OP() throws RecognitionException {
		try {
			int _type = SQ_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:69:7: ( '\\'' )
			// mylexer.g:69:9: '\\''
			{
			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQ_OP"

	// $ANTLR start "COMMA_OP"
	public final void mCOMMA_OP() throws RecognitionException {
		try {
			int _type = COMMA_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:70:10: ( ',' )
			// mylexer.g:70:12: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA_OP"

	// $ANTLR start "SEM_OP"
	public final void mSEM_OP() throws RecognitionException {
		try {
			int _type = SEM_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:71:8: ( ';' )
			// mylexer.g:71:10: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEM_OP"

	// $ANTLR start "COL_OP"
	public final void mCOL_OP() throws RecognitionException {
		try {
			int _type = COL_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:72:8: ( ':' )
			// mylexer.g:72:10: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COL_OP"

	// $ANTLR start "DOT_OP"
	public final void mDOT_OP() throws RecognitionException {
		try {
			int _type = DOT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:73:8: ( '.' )
			// mylexer.g:73:10: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOT_OP"

	// $ANTLR start "POU_OP"
	public final void mPOU_OP() throws RecognitionException {
		try {
			int _type = POU_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:74:8: ( '#' )
			// mylexer.g:74:10: '#'
			{
			match('#'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POU_OP"

	// $ANTLR start "AS_OP"
	public final void mAS_OP() throws RecognitionException {
		try {
			int _type = AS_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:75:7: ( '=' )
			// mylexer.g:75:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AS_OP"

	// $ANTLR start "ADR_OP"
	public final void mADR_OP() throws RecognitionException {
		try {
			int _type = ADR_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:76:8: ( '&' )
			// mylexer.g:76:10: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADR_OP"

	// $ANTLR start "DEC_NUM"
	public final void mDEC_NUM() throws RecognitionException {
		try {
			int _type = DEC_NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:79:9: ( ( '0' | ( '1' .. '9' ) ( DIGIT )* ) )
			// mylexer.g:79:11: ( '0' | ( '1' .. '9' ) ( DIGIT )* )
			{
			// mylexer.g:79:11: ( '0' | ( '1' .. '9' ) ( DIGIT )* )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='0') ) {
				alt2=1;
			}
			else if ( ((LA2_0 >= '1' && LA2_0 <= '9')) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// mylexer.g:79:12: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// mylexer.g:79:18: ( '1' .. '9' ) ( DIGIT )*
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// mylexer.g:79:28: ( DIGIT )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// mylexer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop1;
						}
					}

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEC_NUM"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:81:4: ( ( LETTER ) ( LETTER | DIGIT )* )
			// mylexer.g:81:6: ( LETTER ) ( LETTER | DIGIT )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// mylexer.g:81:14: ( LETTER | DIGIT )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// mylexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop3;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INCLUDE_FILE"
	public final void mINCLUDE_FILE() throws RecognitionException {
		try {
			int _type = INCLUDE_FILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:82:14: ( ( LETTER )+ '.h' )
			// mylexer.g:82:16: ( LETTER )+ '.h'
			{
			// mylexer.g:82:16: ( LETTER )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= 'A' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// mylexer.g:
					{
					if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			match(".h"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INCLUDE_FILE"

	// $ANTLR start "STING"
	public final void mSTING() throws RecognitionException {
		try {
			int _type = STING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:83:7: ( '\"' ( options {greedy=false; } : . )* '\"' )
			// mylexer.g:83:9: '\"' ( options {greedy=false; } : . )* '\"'
			{
			match('\"'); 
			// mylexer.g:83:12: ( options {greedy=false; } : . )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0=='\"') ) {
					alt5=2;
				}
				else if ( ((LA5_0 >= '\u0000' && LA5_0 <= '!')||(LA5_0 >= '#' && LA5_0 <= '\uFFFF')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// mylexer.g:83:37: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop5;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STING"

	// $ANTLR start "FLOAT_NUM"
	public final void mFLOAT_NUM() throws RecognitionException {
		try {
			int _type = FLOAT_NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:85:10: ( FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3 )
			int alt6=3;
			alt6 = dfa6.predict(input);
			switch (alt6) {
				case 1 :
					// mylexer.g:85:12: FLOAT_NUM1
					{
					mFLOAT_NUM1(); 

					}
					break;
				case 2 :
					// mylexer.g:85:25: FLOAT_NUM2
					{
					mFLOAT_NUM2(); 

					}
					break;
				case 3 :
					// mylexer.g:85:38: FLOAT_NUM3
					{
					mFLOAT_NUM3(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM"

	// $ANTLR start "FLOAT_NUM1"
	public final void mFLOAT_NUM1() throws RecognitionException {
		try {
			// mylexer.g:86:20: ( ( DIGIT )+ '.' ( DIGIT )* )
			// mylexer.g:86:22: ( DIGIT )+ '.' ( DIGIT )*
			{
			// mylexer.g:86:22: ( DIGIT )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// mylexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			match('.'); 
			// mylexer.g:86:33: ( DIGIT )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// mylexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop8;
				}
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM1"

	// $ANTLR start "FLOAT_NUM2"
	public final void mFLOAT_NUM2() throws RecognitionException {
		try {
			// mylexer.g:87:20: ( '.' ( DIGIT )+ )
			// mylexer.g:87:22: '.' ( DIGIT )+
			{
			match('.'); 
			// mylexer.g:87:25: ( DIGIT )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// mylexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt9 >= 1 ) break loop9;
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM2"

	// $ANTLR start "FLOAT_NUM3"
	public final void mFLOAT_NUM3() throws RecognitionException {
		try {
			// mylexer.g:88:20: ( ( DIGIT )+ )
			// mylexer.g:88:22: ( DIGIT )+
			{
			// mylexer.g:88:22: ( DIGIT )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// mylexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt10 >= 1 ) break loop10;
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM3"

	// $ANTLR start "COMMENT1"
	public final void mCOMMENT1() throws RecognitionException {
		try {
			int _type = COMMENT1;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:92:10: ( '//' ( . )* '\\n' )
			// mylexer.g:92:12: '//' ( . )* '\\n'
			{
			match("//"); 

			// mylexer.g:92:16: ( . )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( (LA11_0=='\n') ) {
					alt11=2;
				}
				else if ( ((LA11_0 >= '\u0000' && LA11_0 <= '\t')||(LA11_0 >= '\u000B' && LA11_0 <= '\uFFFF')) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// mylexer.g:92:17: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop11;
				}
			}

			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT1"

	// $ANTLR start "COMMENT2"
	public final void mCOMMENT2() throws RecognitionException {
		try {
			int _type = COMMENT2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:93:10: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// mylexer.g:93:12: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 

			// mylexer.g:93:17: ( options {greedy=false; } : . )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0=='*') ) {
					int LA12_1 = input.LA(2);
					if ( (LA12_1=='/') ) {
						alt12=2;
					}
					else if ( ((LA12_1 >= '\u0000' && LA12_1 <= '.')||(LA12_1 >= '0' && LA12_1 <= '\uFFFF')) ) {
						alt12=1;
					}

				}
				else if ( ((LA12_0 >= '\u0000' && LA12_0 <= ')')||(LA12_0 >= '+' && LA12_0 <= '\uFFFF')) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// mylexer.g:93:42: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop12;
				}
			}

			match("*/"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT2"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// mylexer.g:97:17: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
			// mylexer.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// mylexer.g:98:16: ( '0' .. '9' )
			// mylexer.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// mylexer.g:101:5: ( ( ' ' | '\\r' | '\\t' | '\\n' )+ )
			// mylexer.g:101:7: ( ' ' | '\\r' | '\\t' | '\\n' )+
			{
			// mylexer.g:101:7: ( ' ' | '\\r' | '\\t' | '\\n' )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( ((LA13_0 >= '\t' && LA13_0 <= '\n')||LA13_0=='\r'||LA13_0==' ') ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// mylexer.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt13 >= 1 ) break loop13;
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
			}

			 skip(); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// mylexer.g:1:8: ( INT_TYPE | CHAR_TYPE | VOID_TYPE | FLOAT_TYPE | LONG_TYPE | CONST_TYPE | STRUCT_TYPE | WHILE | IF | ELSE | BREAK | DO | SWITCH | CASE | CONTINUE | RETURN | FOR | MAIN | NULL | DEFAULT | INCLUDE | PRINTF | SCANF | EQ_OP | LE_OP | GE_OP | NE_OP | PP_OP | MM_OP | RSHIFT_OP | LSHIFT_OP | AND_OP | OR_OP | GT_OP | LT_OP | NOT_OP | MOD_OP | DIV_OP | MUL_OP | ADD_OP | SUB_OP | AA_OP | SA_OP | MA_OP | DA_OP | BN_OP | LPAREN | RPAREN | LBRACE | RBRACE | LBRACKET | RBRACKET | QUO_OP | SQ_OP | COMMA_OP | SEM_OP | COL_OP | DOT_OP | POU_OP | AS_OP | ADR_OP | DEC_NUM | ID | INCLUDE_FILE | STING | FLOAT_NUM | COMMENT1 | COMMENT2 | WS )
		int alt14=69;
		alt14 = dfa14.predict(input);
		switch (alt14) {
			case 1 :
				// mylexer.g:1:10: INT_TYPE
				{
				mINT_TYPE(); 

				}
				break;
			case 2 :
				// mylexer.g:1:19: CHAR_TYPE
				{
				mCHAR_TYPE(); 

				}
				break;
			case 3 :
				// mylexer.g:1:29: VOID_TYPE
				{
				mVOID_TYPE(); 

				}
				break;
			case 4 :
				// mylexer.g:1:39: FLOAT_TYPE
				{
				mFLOAT_TYPE(); 

				}
				break;
			case 5 :
				// mylexer.g:1:50: LONG_TYPE
				{
				mLONG_TYPE(); 

				}
				break;
			case 6 :
				// mylexer.g:1:60: CONST_TYPE
				{
				mCONST_TYPE(); 

				}
				break;
			case 7 :
				// mylexer.g:1:71: STRUCT_TYPE
				{
				mSTRUCT_TYPE(); 

				}
				break;
			case 8 :
				// mylexer.g:1:83: WHILE
				{
				mWHILE(); 

				}
				break;
			case 9 :
				// mylexer.g:1:89: IF
				{
				mIF(); 

				}
				break;
			case 10 :
				// mylexer.g:1:92: ELSE
				{
				mELSE(); 

				}
				break;
			case 11 :
				// mylexer.g:1:97: BREAK
				{
				mBREAK(); 

				}
				break;
			case 12 :
				// mylexer.g:1:103: DO
				{
				mDO(); 

				}
				break;
			case 13 :
				// mylexer.g:1:106: SWITCH
				{
				mSWITCH(); 

				}
				break;
			case 14 :
				// mylexer.g:1:113: CASE
				{
				mCASE(); 

				}
				break;
			case 15 :
				// mylexer.g:1:118: CONTINUE
				{
				mCONTINUE(); 

				}
				break;
			case 16 :
				// mylexer.g:1:127: RETURN
				{
				mRETURN(); 

				}
				break;
			case 17 :
				// mylexer.g:1:134: FOR
				{
				mFOR(); 

				}
				break;
			case 18 :
				// mylexer.g:1:138: MAIN
				{
				mMAIN(); 

				}
				break;
			case 19 :
				// mylexer.g:1:143: NULL
				{
				mNULL(); 

				}
				break;
			case 20 :
				// mylexer.g:1:148: DEFAULT
				{
				mDEFAULT(); 

				}
				break;
			case 21 :
				// mylexer.g:1:156: INCLUDE
				{
				mINCLUDE(); 

				}
				break;
			case 22 :
				// mylexer.g:1:164: PRINTF
				{
				mPRINTF(); 

				}
				break;
			case 23 :
				// mylexer.g:1:171: SCANF
				{
				mSCANF(); 

				}
				break;
			case 24 :
				// mylexer.g:1:177: EQ_OP
				{
				mEQ_OP(); 

				}
				break;
			case 25 :
				// mylexer.g:1:183: LE_OP
				{
				mLE_OP(); 

				}
				break;
			case 26 :
				// mylexer.g:1:189: GE_OP
				{
				mGE_OP(); 

				}
				break;
			case 27 :
				// mylexer.g:1:195: NE_OP
				{
				mNE_OP(); 

				}
				break;
			case 28 :
				// mylexer.g:1:201: PP_OP
				{
				mPP_OP(); 

				}
				break;
			case 29 :
				// mylexer.g:1:207: MM_OP
				{
				mMM_OP(); 

				}
				break;
			case 30 :
				// mylexer.g:1:213: RSHIFT_OP
				{
				mRSHIFT_OP(); 

				}
				break;
			case 31 :
				// mylexer.g:1:223: LSHIFT_OP
				{
				mLSHIFT_OP(); 

				}
				break;
			case 32 :
				// mylexer.g:1:233: AND_OP
				{
				mAND_OP(); 

				}
				break;
			case 33 :
				// mylexer.g:1:240: OR_OP
				{
				mOR_OP(); 

				}
				break;
			case 34 :
				// mylexer.g:1:246: GT_OP
				{
				mGT_OP(); 

				}
				break;
			case 35 :
				// mylexer.g:1:252: LT_OP
				{
				mLT_OP(); 

				}
				break;
			case 36 :
				// mylexer.g:1:258: NOT_OP
				{
				mNOT_OP(); 

				}
				break;
			case 37 :
				// mylexer.g:1:265: MOD_OP
				{
				mMOD_OP(); 

				}
				break;
			case 38 :
				// mylexer.g:1:272: DIV_OP
				{
				mDIV_OP(); 

				}
				break;
			case 39 :
				// mylexer.g:1:279: MUL_OP
				{
				mMUL_OP(); 

				}
				break;
			case 40 :
				// mylexer.g:1:286: ADD_OP
				{
				mADD_OP(); 

				}
				break;
			case 41 :
				// mylexer.g:1:293: SUB_OP
				{
				mSUB_OP(); 

				}
				break;
			case 42 :
				// mylexer.g:1:300: AA_OP
				{
				mAA_OP(); 

				}
				break;
			case 43 :
				// mylexer.g:1:306: SA_OP
				{
				mSA_OP(); 

				}
				break;
			case 44 :
				// mylexer.g:1:312: MA_OP
				{
				mMA_OP(); 

				}
				break;
			case 45 :
				// mylexer.g:1:318: DA_OP
				{
				mDA_OP(); 

				}
				break;
			case 46 :
				// mylexer.g:1:324: BN_OP
				{
				mBN_OP(); 

				}
				break;
			case 47 :
				// mylexer.g:1:330: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 48 :
				// mylexer.g:1:337: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 49 :
				// mylexer.g:1:344: LBRACE
				{
				mLBRACE(); 

				}
				break;
			case 50 :
				// mylexer.g:1:351: RBRACE
				{
				mRBRACE(); 

				}
				break;
			case 51 :
				// mylexer.g:1:358: LBRACKET
				{
				mLBRACKET(); 

				}
				break;
			case 52 :
				// mylexer.g:1:367: RBRACKET
				{
				mRBRACKET(); 

				}
				break;
			case 53 :
				// mylexer.g:1:376: QUO_OP
				{
				mQUO_OP(); 

				}
				break;
			case 54 :
				// mylexer.g:1:383: SQ_OP
				{
				mSQ_OP(); 

				}
				break;
			case 55 :
				// mylexer.g:1:389: COMMA_OP
				{
				mCOMMA_OP(); 

				}
				break;
			case 56 :
				// mylexer.g:1:398: SEM_OP
				{
				mSEM_OP(); 

				}
				break;
			case 57 :
				// mylexer.g:1:405: COL_OP
				{
				mCOL_OP(); 

				}
				break;
			case 58 :
				// mylexer.g:1:412: DOT_OP
				{
				mDOT_OP(); 

				}
				break;
			case 59 :
				// mylexer.g:1:419: POU_OP
				{
				mPOU_OP(); 

				}
				break;
			case 60 :
				// mylexer.g:1:426: AS_OP
				{
				mAS_OP(); 

				}
				break;
			case 61 :
				// mylexer.g:1:432: ADR_OP
				{
				mADR_OP(); 

				}
				break;
			case 62 :
				// mylexer.g:1:439: DEC_NUM
				{
				mDEC_NUM(); 

				}
				break;
			case 63 :
				// mylexer.g:1:447: ID
				{
				mID(); 

				}
				break;
			case 64 :
				// mylexer.g:1:450: INCLUDE_FILE
				{
				mINCLUDE_FILE(); 

				}
				break;
			case 65 :
				// mylexer.g:1:463: STING
				{
				mSTING(); 

				}
				break;
			case 66 :
				// mylexer.g:1:469: FLOAT_NUM
				{
				mFLOAT_NUM(); 

				}
				break;
			case 67 :
				// mylexer.g:1:479: COMMENT1
				{
				mCOMMENT1(); 

				}
				break;
			case 68 :
				// mylexer.g:1:488: COMMENT2
				{
				mCOMMENT2(); 

				}
				break;
			case 69 :
				// mylexer.g:1:497: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA6 dfa6 = new DFA6(this);
	protected DFA14 dfa14 = new DFA14(this);
	static final String DFA6_eotS =
		"\1\uffff\1\4\3\uffff";
	static final String DFA6_eofS =
		"\5\uffff";
	static final String DFA6_minS =
		"\2\56\3\uffff";
	static final String DFA6_maxS =
		"\2\71\3\uffff";
	static final String DFA6_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA6_specialS =
		"\5\uffff}>";
	static final String[] DFA6_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1",
			"",
			"",
			""
	};

	static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
	static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
	static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
	static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
	static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
	static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
	static final short[][] DFA6_transition;

	static {
		int numStates = DFA6_transitionS.length;
		DFA6_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
		}
	}

	protected class DFA6 extends DFA {

		public DFA6(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 6;
			this.eot = DFA6_eot;
			this.eof = DFA6_eof;
			this.min = DFA6_min;
			this.max = DFA6_max;
			this.accept = DFA6_accept;
			this.special = DFA6_special;
			this.transition = DFA6_transition;
		}
		@Override
		public String getDescription() {
			return "85:1: FLOAT_NUM : ( FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3 );";
		}
	}

	static final String DFA14_eotS =
		"\1\uffff\16\57\1\105\1\110\1\113\1\115\1\120\1\123\1\125\2\uffff\1\131"+
		"\1\133\7\uffff\1\134\4\uffff\1\136\1\uffff\2\140\1\57\1\uffff\1\57\1\144"+
		"\1\57\2\uffff\15\57\1\162\5\57\35\uffff\1\140\2\57\1\uffff\5\57\1\u0080"+
		"\7\57\1\uffff\7\57\1\u008f\2\57\1\u0092\1\u0093\1\57\1\uffff\1\u0095\4"+
		"\57\1\u009a\3\57\1\u009e\1\u009f\3\57\1\uffff\1\u00a3\1\57\2\uffff\1\u00a5"+
		"\1\uffff\2\57\1\u00a8\1\u00a9\1\uffff\1\u00aa\2\57\2\uffff\1\u00ad\2\57"+
		"\1\uffff\1\57\1\uffff\1\u00b1\1\u00b2\3\uffff\1\57\1\u00b4\1\uffff\1\u00b5"+
		"\1\u00b6\1\u00b7\2\uffff\1\u00b8\5\uffff";
	static final String DFA14_eofS =
		"\u00b9\uffff";
	static final String DFA14_minS =
		"\1\11\16\56\1\75\1\74\2\75\1\53\1\55\1\46\2\uffff\1\52\1\75\7\uffff\1"+
		"\0\4\uffff\1\60\1\uffff\3\56\1\uffff\3\56\2\uffff\23\56\35\uffff\3\56"+
		"\1\uffff\15\56\1\uffff\15\56\1\uffff\16\56\1\uffff\2\56\2\uffff\1\56\1"+
		"\uffff\4\56\1\uffff\3\56\2\uffff\3\56\1\uffff\1\56\1\uffff\2\56\3\uffff"+
		"\2\56\1\uffff\3\56\2\uffff\1\56\5\uffff";
	static final String DFA14_maxS =
		"\1\176\16\172\2\75\1\76\3\75\1\46\2\uffff\2\75\7\uffff\1\uffff\4\uffff"+
		"\1\71\1\uffff\2\71\1\172\1\uffff\3\172\2\uffff\23\172\35\uffff\1\71\2"+
		"\172\1\uffff\15\172\1\uffff\15\172\1\uffff\16\172\1\uffff\2\172\2\uffff"+
		"\1\172\1\uffff\4\172\1\uffff\3\172\2\uffff\3\172\1\uffff\1\172\1\uffff"+
		"\2\172\3\uffff\2\172\1\uffff\3\172\2\uffff\1\172\5\uffff";
	static final String DFA14_acceptS =
		"\26\uffff\1\41\1\45\2\uffff\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1\uffff"+
		"\1\66\1\67\1\70\1\71\1\uffff\1\73\3\uffff\1\105\3\uffff\1\77\1\100\23"+
		"\uffff\1\30\1\74\1\31\1\36\1\43\1\32\1\37\1\42\1\33\1\44\1\34\1\52\1\50"+
		"\1\35\1\53\1\51\1\40\1\75\1\55\1\103\1\104\1\46\1\54\1\47\1\65\1\101\1"+
		"\72\1\102\1\76\3\uffff\1\11\15\uffff\1\14\15\uffff\1\21\16\uffff\1\2\2"+
		"\uffff\1\16\1\3\1\uffff\1\5\4\uffff\1\12\3\uffff\1\22\1\23\3\uffff\1\6"+
		"\1\uffff\1\4\2\uffff\1\27\1\10\1\13\2\uffff\1\26\3\uffff\1\7\1\15\1\uffff"+
		"\1\20\1\1\1\25\1\17\1\24";
	static final String DFA14_specialS =
		"\41\uffff\1\0\u0097\uffff}>";
	static final String[] DFA14_transitionS = {
			"\2\53\2\uffff\1\53\22\uffff\1\53\1\22\1\41\1\47\1\uffff\1\27\1\25\1\42"+
			"\1\33\1\34\1\31\1\23\1\43\1\24\1\46\1\30\1\50\11\51\1\45\1\44\1\20\1"+
			"\17\1\21\2\uffff\26\52\1\7\3\52\1\37\1\uffff\1\40\1\uffff\1\52\1\uffff"+
			"\1\52\1\11\1\2\1\12\1\10\1\4\2\52\1\1\2\52\1\5\1\14\1\15\1\52\1\16\1"+
			"\52\1\13\1\6\2\52\1\3\4\52\1\35\1\26\1\36\1\32",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\5\56\1\55\7\56\1\54\14\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\1\63\6\56\1\61\6\56\1\62\13"+
			"\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\64\13\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\65\2\56\1\66\13\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\67\13\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\72\20\56\1\70\2\56"+
			"\1\71\3\56",
			"\1\60\22\uffff\7\56\1\73\22\56\4\uffff\1\56\1\uffff\32\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\74\16\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\75\10\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\77\11\56\1\76\13\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\100\25\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\1\101\31\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\102\5\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\103\10\56",
			"\1\104",
			"\1\107\1\106",
			"\1\111\1\112",
			"\1\114",
			"\1\116\21\uffff\1\117",
			"\1\121\17\uffff\1\122",
			"\1\124",
			"",
			"",
			"\1\130\4\uffff\1\127\15\uffff\1\126",
			"\1\132",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\0\135",
			"",
			"",
			"",
			"",
			"\12\137",
			"",
			"\1\137\1\uffff\12\137",
			"\1\137\1\uffff\12\141",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\143\20\56\1\142\6\56",
			"\1\60\1\uffff\12\57\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"",
			"",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\1\145\31\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\146\14\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\147\7\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\150\21\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\16\56\1\151\13\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\152\10\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\153\14\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\154\10\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\155\21\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\1\156\31\56",
			"\1\60\22\uffff\10\56\1\157\21\56\4\uffff\1\56\1\uffff\32\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\160\7\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\161\25\56",
			"\1\60\1\uffff\12\57\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\5\56\1\163\24\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\164\6\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\165\21\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\166\16\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\167\21\56",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\137\1\uffff\12\141",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\170\25\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\171\16\56",
			"",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\172\10\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\22\56\1\173\1\174\6\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\175\25\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\3\56\1\176\26\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\1\177\31\56",
			"\1\60\1\uffff\12\57\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\6\56\1\u0081\23\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u0082\5\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u0083\6\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u0084\14\56",
			"\1\60\22\uffff\13\56\1\u0085\16\56\4\uffff\1\56\1\uffff\32\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u0086\25\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\1\u0087\31\56",
			"",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\1\u0088\31\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u0089\5\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u008a\14\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u008b\16\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u008c\14\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\6\56\1\u008d\23\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u008e\5\56",
			"\1\60\1\uffff\12\57\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u0090\6\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u0091\14\56",
			"\1\60\1\uffff\12\57\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\60\1\uffff\12\57\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u0094\6\56",
			"",
			"\1\60\1\uffff\12\57\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u0096\27\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\2\56\1\u0097\27\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\5\56\1\u0098\24\56",
			"\1\60\22\uffff\4\56\1\u0099\25\56\4\uffff\1\56\1\uffff\32\56",
			"\1\60\1\uffff\12\57\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\12\56\1\u009b\17\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\13\56\1\u009c\16\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u009d\10\56",
			"\1\60\1\uffff\12\57\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\60\1\uffff\12\57\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\5\56\1\u00a0\24\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00a1\25\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\3\56\1\u00a2\26\56",
			"",
			"\1\60\1\uffff\12\57\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u00a4\5\56",
			"",
			"",
			"\1\60\1\uffff\12\57\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u00a6\6\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\7\56\1\u00a7\22\56",
			"\1\60\1\uffff\12\57\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\60\1\uffff\12\57\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"",
			"\1\60\1\uffff\12\57\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\24\56\1\u00ab\5\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\15\56\1\u00ac\14\56",
			"",
			"",
			"\1\60\1\uffff\12\57\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\21\56\1\u00ae\10\56",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00af\25\56",
			"",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\4\56\1\u00b0\25\56",
			"",
			"\1\60\1\uffff\12\57\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\60\1\uffff\12\57\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"",
			"",
			"",
			"\1\60\22\uffff\32\56\4\uffff\1\56\1\uffff\23\56\1\u00b3\6\56",
			"\1\60\1\uffff\12\57\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"",
			"\1\60\1\uffff\12\57\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\60\1\uffff\12\57\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"\1\60\1\uffff\12\57\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"",
			"",
			"\1\60\1\uffff\12\57\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
			"",
			"",
			"",
			"",
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

	protected class DFA14 extends DFA {

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
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( INT_TYPE | CHAR_TYPE | VOID_TYPE | FLOAT_TYPE | LONG_TYPE | CONST_TYPE | STRUCT_TYPE | WHILE | IF | ELSE | BREAK | DO | SWITCH | CASE | CONTINUE | RETURN | FOR | MAIN | NULL | DEFAULT | INCLUDE | PRINTF | SCANF | EQ_OP | LE_OP | GE_OP | NE_OP | PP_OP | MM_OP | RSHIFT_OP | LSHIFT_OP | AND_OP | OR_OP | GT_OP | LT_OP | NOT_OP | MOD_OP | DIV_OP | MUL_OP | ADD_OP | SUB_OP | AA_OP | SA_OP | MA_OP | DA_OP | BN_OP | LPAREN | RPAREN | LBRACE | RBRACE | LBRACKET | RBRACKET | QUO_OP | SQ_OP | COMMA_OP | SEM_OP | COL_OP | DOT_OP | POU_OP | AS_OP | ADR_OP | DEC_NUM | ID | INCLUDE_FILE | STING | FLOAT_NUM | COMMENT1 | COMMENT2 | WS );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA14_33 = input.LA(1);
						s = -1;
						if ( ((LA14_33 >= '\u0000' && LA14_33 <= '\uFFFF')) ) {s = 93;}
						else s = 92;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 14, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
