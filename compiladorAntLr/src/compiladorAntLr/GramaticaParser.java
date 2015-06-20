// Generated from Gramatica.g4 by ANTLR 4.4
package compiladorAntLr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROGRAM=1, FUNCTION_W=2, WHILE_W=3, IF_W=4, ELSE_W=5, FOR_W=6, CONST=7, 
		MAIN=8, ARRAY_TYPE=9, CHAR_TYPE=10, INT_TYPE=11, REAL_TYPE=12, STRING_TYPE=13, 
		BOOL_TYPE=14, STRING_ID=15, CHAR_ID=16, ID=17, LETTER=18, NUM=19, REAL=20, 
		BOOL_ID=21, SEMICOLON=22, OPEN_KEY=23, CLOSE_KEY=24, OPEN_PARENT=25, CLOSE_PARENT=26, 
		OPEN_BRACKET=27, CLOSE_BRACKET=28, COMMA=29, DOT=30, SIMPLE_Q_MARK=31, 
		DOUBLE_Q_MARK=32, MATH_PLUS_OP=33, EQUALS=34, MATH_LESS_OP=35, MATH_DIV_OP=36, 
		MATH_MULT_OP=37, MATH_MOD_OP=38, BOOL_SMALLER_OP=39, BOOL_BIGGER_OP=40, 
		BOOL_BIGGER_EQUALS_OP=41, BOOL_SMALLER_EQUALS_OP=42, BOOL_EQUALS_OP=43, 
		BOOL_DIFFERENT_OP=44, BOOL_CALC_DIFF_OP=45, BOOL_CALC_OR_OP=46, BOOL_CALC_AND_OP=47, 
		WS=48;
	public static final String[] tokenNames = {
		"<INVALID>", "'program'", "'function'", "'while'", "'if'", "'else'", "'for'", 
		"'const'", "'main'", "'array'", "'char'", "'int'", "'real'", "'string'", 
		"'bool'", "STRING_ID", "CHAR_ID", "ID", "LETTER", "NUM", "REAL", "BOOL_ID", 
		"';'", "'{'", "'}'", "'('", "')'", "'['", "']'", "','", "'.'", "'''", 
		"'\"'", "'+'", "'='", "'-'", "'/'", "'*'", "'%'", "'<'", "'>'", "'>='", 
		"'<='", "'=='", "'!='", "'!'", "'|'", "'&'", "WS"
	};
	public static final int
		RULE_prog = 0, RULE_start = 1, RULE_def = 2, RULE_var = 3, RULE_array = 4, 
		RULE_type = 5, RULE_values = 6, RULE_value = 7, RULE_calc_1 = 8, RULE_calc_1l = 9, 
		RULE_calc_2 = 10, RULE_calc_2l = 11, RULE_calc_3 = 12, RULE_calc_3l = 13, 
		RULE_calc_4 = 14, RULE_calc_4l = 15, RULE_calc_5 = 16, RULE_calc_5l = 17, 
		RULE_main = 18, RULE_function = 19, RULE_params = 20, RULE_comm = 21, 
		RULE_while_stat = 22, RULE_assign = 23, RULE_if_stat = 24, RULE_for_stat = 25, 
		RULE_funccall = 26, RULE_bool_calc = 27;
	public static final String[] ruleNames = {
		"prog", "start", "def", "var", "array", "type", "values", "value", "calc_1", 
		"calc_1l", "calc_2", "calc_2l", "calc_3", "calc_3l", "calc_4", "calc_4l", 
		"calc_5", "calc_5l", "main", "function", "params", "comm", "while_stat", 
		"assign", "if_stat", "for_stat", "funccall", "bool_calc"
	};

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode OPEN_KEY() { return getToken(GramaticaParser.OPEN_KEY, 0); }
		public TerminalNode CLOSE_KEY() { return getToken(GramaticaParser.CLOSE_KEY, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode PROGRAM() { return getToken(GramaticaParser.PROGRAM, 0); }
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); match(PROGRAM);
			setState(57); match(ID);
			setState(58); match(OPEN_KEY);
			setState(59); start();
			setState(60); match(CLOSE_KEY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartContext extends ParserRuleContext {
		public MainContext main(int i) {
			return getRuleContext(MainContext.class,i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public List<MainContext> main() {
			return getRuleContexts(MainContext.class);
		}
		public List<DefContext> def() {
			return getRuleContexts(DefContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
		}
		public DefContext def(int i) {
			return getRuleContext(DefContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONST) {
				{
				{
				setState(62); def();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION_W) {
				{
				{
				setState(68); function();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MAIN) {
				{
				{
				setState(74); main();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(GramaticaParser.SEMICOLON, 0); }
		public Calc_1Context calc_1() {
			return getRuleContext(Calc_1Context.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(GramaticaParser.CLOSE_BRACKET, 0); }
		public List<TerminalNode> EQUALS() { return getTokens(GramaticaParser.EQUALS); }
		public TerminalNode OPEN_BRACKET() { return getToken(GramaticaParser.OPEN_BRACKET, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode CONST() { return getToken(GramaticaParser.CONST, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode EQUALS(int i) {
			return getToken(GramaticaParser.EQUALS, i);
		}
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitDef(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); match(CONST);
			setState(81); var();
			{
			setState(82); match(EQUALS);
			setState(88);
			switch (_input.LA(1)) {
			case STRING_ID:
			case CHAR_ID:
			case ID:
			case NUM:
			case REAL:
			case BOOL_ID:
			case MATH_PLUS_OP:
			case MATH_LESS_OP:
				{
				setState(83); calc_1();
				}
				break;
			case OPEN_BRACKET:
				{
				setState(84); match(OPEN_BRACKET);
				setState(85); match(CLOSE_BRACKET);
				setState(86); match(EQUALS);
				setState(87); array();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			setState(90); match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92); type();
			setState(93); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode ARRAY_TYPE() { return getToken(GramaticaParser.ARRAY_TYPE, 0); }
		public TerminalNode OPEN_KEY() { return getToken(GramaticaParser.OPEN_KEY, 0); }
		public TerminalNode CLOSE_KEY() { return getToken(GramaticaParser.CLOSE_KEY, 0); }
		public TerminalNode BOOL_BIGGER_OP() { return getToken(GramaticaParser.BOOL_BIGGER_OP, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public TerminalNode BOOL_SMALLER_OP() { return getToken(GramaticaParser.BOOL_SMALLER_OP, 0); }
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95); match(ARRAY_TYPE);
			setState(96); match(BOOL_SMALLER_OP);
			setState(97); type();
			setState(98); match(BOOL_BIGGER_OP);
			setState(99); match(OPEN_KEY);
			setState(100); values();
			setState(101); match(CLOSE_KEY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(GramaticaParser.INT_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(GramaticaParser.CHAR_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(GramaticaParser.STRING_TYPE, 0); }
		public TerminalNode REAL_TYPE() { return getToken(GramaticaParser.REAL_TYPE, 0); }
		public TerminalNode BOOL_TYPE() { return getToken(GramaticaParser.BOOL_TYPE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR_TYPE) | (1L << INT_TYPE) | (1L << REAL_TYPE) | (1L << STRING_TYPE) | (1L << BOOL_TYPE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValuesContext extends ParserRuleContext {
		public Calc_1Context calc_1() {
			return getRuleContext(Calc_1Context.class,0);
		}
		public TerminalNode COMMA() { return getToken(GramaticaParser.COMMA, 0); }
		public ValuesContext values() {
			return getRuleContext(ValuesContext.class,0);
		}
		public ValuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterValues(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitValues(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_values);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); calc_1();
			setState(106); match(COMMA);
			setState(107); values();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode CLOSE_BRACKET() { return getToken(GramaticaParser.CLOSE_BRACKET, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode CHAR_ID() { return getToken(GramaticaParser.CHAR_ID, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(GramaticaParser.OPEN_BRACKET, 0); }
		public TerminalNode MATH_LESS_OP() { return getToken(GramaticaParser.MATH_LESS_OP, 0); }
		public TerminalNode STRING_ID() { return getToken(GramaticaParser.STRING_ID, 0); }
		public TerminalNode REAL() { return getToken(GramaticaParser.REAL, 0); }
		public TerminalNode BOOL_ID() { return getToken(GramaticaParser.BOOL_ID, 0); }
		public TerminalNode MATH_PLUS_OP() { return getToken(GramaticaParser.MATH_PLUS_OP, 0); }
		public TerminalNode NUM() { return getToken(GramaticaParser.NUM, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_value);
		int _la;
		try {
			setState(122);
			switch (_input.LA(1)) {
			case STRING_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(109); match(STRING_ID);
				}
				break;
			case CHAR_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(110); match(CHAR_ID);
				}
				break;
			case NUM:
			case REAL:
			case MATH_PLUS_OP:
			case MATH_LESS_OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				_la = _input.LA(1);
				if (_la==MATH_PLUS_OP || _la==MATH_LESS_OP) {
					{
					setState(111);
					_la = _input.LA(1);
					if ( !(_la==MATH_PLUS_OP || _la==MATH_LESS_OP) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
				}

				setState(114);
				_la = _input.LA(1);
				if ( !(_la==NUM || _la==REAL) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(115); match(ID);
				setState(119);
				_la = _input.LA(1);
				if (_la==OPEN_BRACKET) {
					{
					setState(116); match(OPEN_BRACKET);
					setState(117); match(NUM);
					setState(118); match(CLOSE_BRACKET);
					}
				}

				}
				break;
			case BOOL_ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(121); match(BOOL_ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Calc_1Context extends ParserRuleContext {
		public Calc_1lContext calc_1l() {
			return getRuleContext(Calc_1lContext.class,0);
		}
		public Calc_2Context calc_2() {
			return getRuleContext(Calc_2Context.class,0);
		}
		public Calc_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calc_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCalc_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCalc_1(this);
		}
	}

	public final Calc_1Context calc_1() throws RecognitionException {
		Calc_1Context _localctx = new Calc_1Context(_ctx, getState());
		enterRule(_localctx, 16, RULE_calc_1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); calc_2();
			setState(125); calc_1l();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Calc_1lContext extends ParserRuleContext {
		public Calc_1lContext calc_1l() {
			return getRuleContext(Calc_1lContext.class,0);
		}
		public Calc_2Context calc_2() {
			return getRuleContext(Calc_2Context.class,0);
		}
		public TerminalNode MATH_PLUS_OP() { return getToken(GramaticaParser.MATH_PLUS_OP, 0); }
		public Calc_1lContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calc_1l; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCalc_1l(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCalc_1l(this);
		}
	}

	public final Calc_1lContext calc_1l() throws RecognitionException {
		Calc_1lContext _localctx = new Calc_1lContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_calc_1l);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127); match(MATH_PLUS_OP);
			setState(128); calc_2();
			setState(129); calc_1l();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Calc_2Context extends ParserRuleContext {
		public Calc_2lContext calc_2l() {
			return getRuleContext(Calc_2lContext.class,0);
		}
		public Calc_3Context calc_3() {
			return getRuleContext(Calc_3Context.class,0);
		}
		public Calc_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calc_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCalc_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCalc_2(this);
		}
	}

	public final Calc_2Context calc_2() throws RecognitionException {
		Calc_2Context _localctx = new Calc_2Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_calc_2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131); calc_3();
			setState(132); calc_2l();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Calc_2lContext extends ParserRuleContext {
		public Calc_2lContext calc_2l() {
			return getRuleContext(Calc_2lContext.class,0);
		}
		public Calc_3Context calc_3() {
			return getRuleContext(Calc_3Context.class,0);
		}
		public TerminalNode MATH_LESS_OP() { return getToken(GramaticaParser.MATH_LESS_OP, 0); }
		public Calc_2lContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calc_2l; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCalc_2l(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCalc_2l(this);
		}
	}

	public final Calc_2lContext calc_2l() throws RecognitionException {
		Calc_2lContext _localctx = new Calc_2lContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_calc_2l);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134); match(MATH_LESS_OP);
			setState(135); calc_3();
			setState(136); calc_2l();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Calc_3Context extends ParserRuleContext {
		public Calc_3lContext calc_3l() {
			return getRuleContext(Calc_3lContext.class,0);
		}
		public Calc_4Context calc_4() {
			return getRuleContext(Calc_4Context.class,0);
		}
		public Calc_3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calc_3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCalc_3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCalc_3(this);
		}
	}

	public final Calc_3Context calc_3() throws RecognitionException {
		Calc_3Context _localctx = new Calc_3Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_calc_3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138); calc_4();
			setState(139); calc_3l();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Calc_3lContext extends ParserRuleContext {
		public Calc_3lContext calc_3l() {
			return getRuleContext(Calc_3lContext.class,0);
		}
		public TerminalNode MATH_MULT_OP() { return getToken(GramaticaParser.MATH_MULT_OP, 0); }
		public Calc_4Context calc_4() {
			return getRuleContext(Calc_4Context.class,0);
		}
		public Calc_3lContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calc_3l; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCalc_3l(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCalc_3l(this);
		}
	}

	public final Calc_3lContext calc_3l() throws RecognitionException {
		Calc_3lContext _localctx = new Calc_3lContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_calc_3l);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); match(MATH_MULT_OP);
			setState(142); calc_4();
			setState(143); calc_3l();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Calc_4Context extends ParserRuleContext {
		public Calc_5Context calc_5() {
			return getRuleContext(Calc_5Context.class,0);
		}
		public Calc_4lContext calc_4l() {
			return getRuleContext(Calc_4lContext.class,0);
		}
		public Calc_4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calc_4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCalc_4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCalc_4(this);
		}
	}

	public final Calc_4Context calc_4() throws RecognitionException {
		Calc_4Context _localctx = new Calc_4Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_calc_4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145); calc_5();
			setState(146); calc_4l();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Calc_4lContext extends ParserRuleContext {
		public Calc_5Context calc_5() {
			return getRuleContext(Calc_5Context.class,0);
		}
		public Calc_4lContext calc_4l() {
			return getRuleContext(Calc_4lContext.class,0);
		}
		public TerminalNode MATH_DIV_OP() { return getToken(GramaticaParser.MATH_DIV_OP, 0); }
		public Calc_4lContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calc_4l; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCalc_4l(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCalc_4l(this);
		}
	}

	public final Calc_4lContext calc_4l() throws RecognitionException {
		Calc_4lContext _localctx = new Calc_4lContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_calc_4l);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148); match(MATH_DIV_OP);
			setState(149); calc_5();
			setState(150); calc_4l();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Calc_5Context extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Calc_5lContext calc_5l() {
			return getRuleContext(Calc_5lContext.class,0);
		}
		public Calc_5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calc_5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCalc_5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCalc_5(this);
		}
	}

	public final Calc_5Context calc_5() throws RecognitionException {
		Calc_5Context _localctx = new Calc_5Context(_ctx, getState());
		enterRule(_localctx, 32, RULE_calc_5);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152); value();
			setState(153); calc_5l();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Calc_5lContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public Calc_5lContext calc_5l() {
			return getRuleContext(Calc_5lContext.class,0);
		}
		public TerminalNode MATH_MOD_OP() { return getToken(GramaticaParser.MATH_MOD_OP, 0); }
		public Calc_5lContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calc_5l; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterCalc_5l(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitCalc_5l(this);
		}
	}

	public final Calc_5lContext calc_5l() throws RecognitionException {
		Calc_5lContext _localctx = new Calc_5lContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_calc_5l);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155); match(MATH_MOD_OP);
			setState(156); value();
			setState(157); calc_5l();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainContext extends ParserRuleContext {
		public CommContext comm() {
			return getRuleContext(CommContext.class,0);
		}
		public TerminalNode OPEN_KEY() { return getToken(GramaticaParser.OPEN_KEY, 0); }
		public TerminalNode CLOSE_KEY() { return getToken(GramaticaParser.CLOSE_KEY, 0); }
		public TerminalNode MAIN() { return getToken(GramaticaParser.MAIN, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159); match(MAIN);
			setState(160); match(OPEN_KEY);
			setState(161); comm();
			setState(162); match(CLOSE_KEY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode CLOSE_PARENT() { return getToken(GramaticaParser.CLOSE_PARENT, 0); }
		public List<CommContext> comm() {
			return getRuleContexts(CommContext.class);
		}
		public TerminalNode OPEN_KEY() { return getToken(GramaticaParser.OPEN_KEY, 0); }
		public TerminalNode CLOSE_KEY() { return getToken(GramaticaParser.CLOSE_KEY, 0); }
		public TerminalNode OPEN_PARENT() { return getToken(GramaticaParser.OPEN_PARENT, 0); }
		public CommContext comm(int i) {
			return getRuleContext(CommContext.class,i);
		}
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode FUNCTION_W() { return getToken(GramaticaParser.FUNCTION_W, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164); match(FUNCTION_W);
			setState(165); match(ID);
			setState(166); match(OPEN_PARENT);
			{
			setState(168);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR_TYPE) | (1L << INT_TYPE) | (1L << REAL_TYPE) | (1L << STRING_TYPE) | (1L << BOOL_TYPE) | (1L << ID))) != 0)) {
				{
				setState(167); params();
				}
			}

			setState(170); match(CLOSE_PARENT);
			setState(171); match(OPEN_KEY);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE_W) | (1L << IF_W) | (1L << FOR_W) | (1L << CHAR_TYPE) | (1L << INT_TYPE) | (1L << REAL_TYPE) | (1L << STRING_TYPE) | (1L << BOOL_TYPE) | (1L << ID))) != 0)) {
				{
				{
				setState(172); comm();
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(178); match(CLOSE_KEY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(GramaticaParser.COMMA); }
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(GramaticaParser.COMMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_params);
		int _la;
		try {
			int _alt;
			setState(203);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180); var();
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(181); match(COMMA);
						setState(182); var();
						}
						} 
					}
					setState(187);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(188); match(COMMA);
					setState(189); assign();
					}
					}
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195); assign();
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(196); match(COMMA);
					setState(197); assign();
					}
					}
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommContext extends ParserRuleContext {
		public For_statContext for_stat() {
			return getRuleContext(For_statContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GramaticaParser.SEMICOLON, 0); }
		public FunccallContext funccall() {
			return getRuleContext(FunccallContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public While_statContext while_stat() {
			return getRuleContext(While_statContext.class,0);
		}
		public CommContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterComm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitComm(this);
		}
	}

	public final CommContext comm() throws RecognitionException {
		CommContext _localctx = new CommContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_comm);
		try {
			setState(212);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205); while_stat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206); assign();
				setState(207); match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(209); if_stat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(210); for_stat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(211); funccall();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_statContext extends ParserRuleContext {
		public TerminalNode CLOSE_PARENT() { return getToken(GramaticaParser.CLOSE_PARENT, 0); }
		public CommContext comm() {
			return getRuleContext(CommContext.class,0);
		}
		public TerminalNode OPEN_KEY() { return getToken(GramaticaParser.OPEN_KEY, 0); }
		public Bool_calcContext bool_calc() {
			return getRuleContext(Bool_calcContext.class,0);
		}
		public TerminalNode WHILE_W() { return getToken(GramaticaParser.WHILE_W, 0); }
		public TerminalNode CLOSE_KEY() { return getToken(GramaticaParser.CLOSE_KEY, 0); }
		public TerminalNode OPEN_PARENT() { return getToken(GramaticaParser.OPEN_PARENT, 0); }
		public While_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterWhile_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitWhile_stat(this);
		}
	}

	public final While_statContext while_stat() throws RecognitionException {
		While_statContext _localctx = new While_statContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214); match(WHILE_W);
			setState(215); match(OPEN_PARENT);
			setState(216); bool_calc();
			setState(217); match(CLOSE_PARENT);
			setState(218); match(OPEN_KEY);
			setState(219); comm();
			setState(220); match(CLOSE_KEY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public Calc_1Context calc_1() {
			return getRuleContext(Calc_1Context.class,0);
		}
		public TerminalNode EQUALS() { return getToken(GramaticaParser.EQUALS, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			switch (_input.LA(1)) {
			case CHAR_TYPE:
			case INT_TYPE:
			case REAL_TYPE:
			case STRING_TYPE:
			case BOOL_TYPE:
				{
				setState(222); var();
				}
				break;
			case ID:
				{
				setState(223); match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(228);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(226); match(EQUALS);
				setState(227); calc_1();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statContext extends ParserRuleContext {
		public TerminalNode CLOSE_PARENT() { return getToken(GramaticaParser.CLOSE_PARENT, 0); }
		public List<CommContext> comm() {
			return getRuleContexts(CommContext.class);
		}
		public List<TerminalNode> OPEN_KEY() { return getTokens(GramaticaParser.OPEN_KEY); }
		public Bool_calcContext bool_calc() {
			return getRuleContext(Bool_calcContext.class,0);
		}
		public TerminalNode IF_W() { return getToken(GramaticaParser.IF_W, 0); }
		public List<TerminalNode> CLOSE_KEY() { return getTokens(GramaticaParser.CLOSE_KEY); }
		public TerminalNode CLOSE_KEY(int i) {
			return getToken(GramaticaParser.CLOSE_KEY, i);
		}
		public TerminalNode OPEN_KEY(int i) {
			return getToken(GramaticaParser.OPEN_KEY, i);
		}
		public TerminalNode OPEN_PARENT() { return getToken(GramaticaParser.OPEN_PARENT, 0); }
		public CommContext comm(int i) {
			return getRuleContext(CommContext.class,i);
		}
		public TerminalNode ELSE_W() { return getToken(GramaticaParser.ELSE_W, 0); }
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterIf_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitIf_stat(this);
		}
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_if_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230); match(IF_W);
			setState(231); match(OPEN_PARENT);
			setState(232); bool_calc();
			setState(233); match(CLOSE_PARENT);
			setState(234); match(OPEN_KEY);
			setState(235); comm();
			setState(236); match(CLOSE_KEY);
			setState(242);
			_la = _input.LA(1);
			if (_la==ELSE_W) {
				{
				setState(237); match(ELSE_W);
				setState(238); match(OPEN_KEY);
				setState(239); comm();
				setState(240); match(CLOSE_KEY);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_statContext extends ParserRuleContext {
		public TerminalNode FOR_W() { return getToken(GramaticaParser.FOR_W, 0); }
		public TerminalNode CLOSE_PARENT() { return getToken(GramaticaParser.CLOSE_PARENT, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(GramaticaParser.SEMICOLON); }
		public CommContext comm() {
			return getRuleContext(CommContext.class,0);
		}
		public TerminalNode OPEN_KEY() { return getToken(GramaticaParser.OPEN_KEY, 0); }
		public Bool_calcContext bool_calc() {
			return getRuleContext(Bool_calcContext.class,0);
		}
		public TerminalNode SEMICOLON(int i) {
			return getToken(GramaticaParser.SEMICOLON, i);
		}
		public TerminalNode CLOSE_KEY() { return getToken(GramaticaParser.CLOSE_KEY, 0); }
		public TerminalNode OPEN_PARENT() { return getToken(GramaticaParser.OPEN_PARENT, 0); }
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public For_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFor_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFor_stat(this);
		}
	}

	public final For_statContext for_stat() throws RecognitionException {
		For_statContext _localctx = new For_statContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_for_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244); match(FOR_W);
			setState(245); match(OPEN_PARENT);
			setState(246); assign();
			setState(247); match(SEMICOLON);
			setState(248); bool_calc();
			setState(249); match(SEMICOLON);
			setState(250); assign();
			setState(251); match(CLOSE_PARENT);
			setState(252); match(OPEN_KEY);
			setState(253); comm();
			setState(254); match(CLOSE_KEY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunccallContext extends ParserRuleContext {
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(GramaticaParser.SEMICOLON, 0); }
		public TerminalNode CLOSE_PARENT() { return getToken(GramaticaParser.CLOSE_PARENT, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public TerminalNode OPEN_PARENT() { return getToken(GramaticaParser.OPEN_PARENT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GramaticaParser.COMMA); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(GramaticaParser.COMMA, i);
		}
		public FunccallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funccall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterFunccall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitFunccall(this);
		}
	}

	public final FunccallContext funccall() throws RecognitionException {
		FunccallContext _localctx = new FunccallContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_funccall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256); match(ID);
			setState(257); match(OPEN_PARENT);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_ID) | (1L << CHAR_ID) | (1L << ID) | (1L << NUM) | (1L << REAL) | (1L << BOOL_ID) | (1L << MATH_PLUS_OP) | (1L << MATH_LESS_OP))) != 0)) {
				{
				{
				setState(258); value();
				{
				setState(259); match(COMMA);
				setState(260); value();
				}
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(267); match(CLOSE_PARENT);
			setState(268); match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_calcContext extends ParserRuleContext {
		public Bool_calcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_calc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).enterBool_calc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GramaticaListener ) ((GramaticaListener)listener).exitBool_calc(this);
		}
	}

	public final Bool_calcContext bool_calc() throws RecognitionException {
		Bool_calcContext _localctx = new Bool_calcContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_bool_calc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\62\u0113\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\2\3\3\7"+
		"\3B\n\3\f\3\16\3E\13\3\3\3\7\3H\n\3\f\3\16\3K\13\3\3\3\7\3N\n\3\f\3\16"+
		"\3Q\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4[\n\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\5"+
		"\ts\n\t\3\t\3\t\3\t\3\t\3\t\5\tz\n\t\3\t\5\t}\n\t\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u00ab\n\25\3\25"+
		"\3\25\3\25\7\25\u00b0\n\25\f\25\16\25\u00b3\13\25\3\25\3\25\3\26\3\26"+
		"\3\26\7\26\u00ba\n\26\f\26\16\26\u00bd\13\26\3\26\3\26\7\26\u00c1\n\26"+
		"\f\26\16\26\u00c4\13\26\3\26\3\26\3\26\7\26\u00c9\n\26\f\26\16\26\u00cc"+
		"\13\26\5\26\u00ce\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00d7\n"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\5\31\u00e3\n\31"+
		"\3\31\3\31\5\31\u00e7\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\5\32\u00f5\n\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u0109\n\34\f\34"+
		"\16\34\u010c\13\34\3\34\3\34\3\34\3\35\3\35\3\35\2\2\36\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\5\3\2\f\20\4\2##%%\3"+
		"\2\25\26\u010e\2:\3\2\2\2\4C\3\2\2\2\6R\3\2\2\2\b^\3\2\2\2\na\3\2\2\2"+
		"\fi\3\2\2\2\16k\3\2\2\2\20|\3\2\2\2\22~\3\2\2\2\24\u0081\3\2\2\2\26\u0085"+
		"\3\2\2\2\30\u0088\3\2\2\2\32\u008c\3\2\2\2\34\u008f\3\2\2\2\36\u0093\3"+
		"\2\2\2 \u0096\3\2\2\2\"\u009a\3\2\2\2$\u009d\3\2\2\2&\u00a1\3\2\2\2(\u00a6"+
		"\3\2\2\2*\u00cd\3\2\2\2,\u00d6\3\2\2\2.\u00d8\3\2\2\2\60\u00e2\3\2\2\2"+
		"\62\u00e8\3\2\2\2\64\u00f6\3\2\2\2\66\u0102\3\2\2\28\u0110\3\2\2\2:;\7"+
		"\3\2\2;<\7\23\2\2<=\7\31\2\2=>\5\4\3\2>?\7\32\2\2?\3\3\2\2\2@B\5\6\4\2"+
		"A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DI\3\2\2\2EC\3\2\2\2FH\5(\25\2"+
		"GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JO\3\2\2\2KI\3\2\2\2LN\5&\24\2"+
		"ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\5\3\2\2\2QO\3\2\2\2RS\7\t\2"+
		"\2ST\5\b\5\2TZ\7$\2\2U[\5\22\n\2VW\7\35\2\2WX\7\36\2\2XY\7$\2\2Y[\5\n"+
		"\6\2ZU\3\2\2\2ZV\3\2\2\2[\\\3\2\2\2\\]\7\30\2\2]\7\3\2\2\2^_\5\f\7\2_"+
		"`\7\23\2\2`\t\3\2\2\2ab\7\13\2\2bc\7)\2\2cd\5\f\7\2de\7*\2\2ef\7\31\2"+
		"\2fg\5\16\b\2gh\7\32\2\2h\13\3\2\2\2ij\t\2\2\2j\r\3\2\2\2kl\5\22\n\2l"+
		"m\7\37\2\2mn\5\16\b\2n\17\3\2\2\2o}\7\21\2\2p}\7\22\2\2qs\t\3\2\2rq\3"+
		"\2\2\2rs\3\2\2\2st\3\2\2\2t}\t\4\2\2uy\7\23\2\2vw\7\35\2\2wx\7\25\2\2"+
		"xz\7\36\2\2yv\3\2\2\2yz\3\2\2\2z}\3\2\2\2{}\7\27\2\2|o\3\2\2\2|p\3\2\2"+
		"\2|r\3\2\2\2|u\3\2\2\2|{\3\2\2\2}\21\3\2\2\2~\177\5\26\f\2\177\u0080\5"+
		"\24\13\2\u0080\23\3\2\2\2\u0081\u0082\7#\2\2\u0082\u0083\5\26\f\2\u0083"+
		"\u0084\5\24\13\2\u0084\25\3\2\2\2\u0085\u0086\5\32\16\2\u0086\u0087\5"+
		"\30\r\2\u0087\27\3\2\2\2\u0088\u0089\7%\2\2\u0089\u008a\5\32\16\2\u008a"+
		"\u008b\5\30\r\2\u008b\31\3\2\2\2\u008c\u008d\5\36\20\2\u008d\u008e\5\34"+
		"\17\2\u008e\33\3\2\2\2\u008f\u0090\7\'\2\2\u0090\u0091\5\36\20\2\u0091"+
		"\u0092\5\34\17\2\u0092\35\3\2\2\2\u0093\u0094\5\"\22\2\u0094\u0095\5 "+
		"\21\2\u0095\37\3\2\2\2\u0096\u0097\7&\2\2\u0097\u0098\5\"\22\2\u0098\u0099"+
		"\5 \21\2\u0099!\3\2\2\2\u009a\u009b\5\20\t\2\u009b\u009c\5$\23\2\u009c"+
		"#\3\2\2\2\u009d\u009e\7(\2\2\u009e\u009f\5\20\t\2\u009f\u00a0\5$\23\2"+
		"\u00a0%\3\2\2\2\u00a1\u00a2\7\n\2\2\u00a2\u00a3\7\31\2\2\u00a3\u00a4\5"+
		",\27\2\u00a4\u00a5\7\32\2\2\u00a5\'\3\2\2\2\u00a6\u00a7\7\4\2\2\u00a7"+
		"\u00a8\7\23\2\2\u00a8\u00aa\7\33\2\2\u00a9\u00ab\5*\26\2\u00aa\u00a9\3"+
		"\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\7\34\2\2\u00ad"+
		"\u00b1\7\31\2\2\u00ae\u00b0\5,\27\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3"+
		"\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3"+
		"\u00b1\3\2\2\2\u00b4\u00b5\7\32\2\2\u00b5)\3\2\2\2\u00b6\u00bb\5\b\5\2"+
		"\u00b7\u00b8\7\37\2\2\u00b8\u00ba\5\b\5\2\u00b9\u00b7\3\2\2\2\u00ba\u00bd"+
		"\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00c2\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00be\u00bf\7\37\2\2\u00bf\u00c1\5\60\31\2\u00c0\u00be"+
		"\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00ce\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00ca\5\60\31\2\u00c6\u00c7\7"+
		"\37\2\2\u00c7\u00c9\5\60\31\2\u00c8\u00c6\3\2\2\2\u00c9\u00cc\3\2\2\2"+
		"\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca"+
		"\3\2\2\2\u00cd\u00b6\3\2\2\2\u00cd\u00c5\3\2\2\2\u00ce+\3\2\2\2\u00cf"+
		"\u00d7\5.\30\2\u00d0\u00d1\5\60\31\2\u00d1\u00d2\7\30\2\2\u00d2\u00d7"+
		"\3\2\2\2\u00d3\u00d7\5\62\32\2\u00d4\u00d7\5\64\33\2\u00d5\u00d7\5\66"+
		"\34\2\u00d6\u00cf\3\2\2\2\u00d6\u00d0\3\2\2\2\u00d6\u00d3\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7-\3\2\2\2\u00d8\u00d9\7\5\2\2"+
		"\u00d9\u00da\7\33\2\2\u00da\u00db\58\35\2\u00db\u00dc\7\34\2\2\u00dc\u00dd"+
		"\7\31\2\2\u00dd\u00de\5,\27\2\u00de\u00df\7\32\2\2\u00df/\3\2\2\2\u00e0"+
		"\u00e3\5\b\5\2\u00e1\u00e3\7\23\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1\3"+
		"\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e5\7$\2\2\u00e5\u00e7\5\22\n\2\u00e6"+
		"\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\61\3\2\2\2\u00e8\u00e9\7\6\2"+
		"\2\u00e9\u00ea\7\33\2\2\u00ea\u00eb\58\35\2\u00eb\u00ec\7\34\2\2\u00ec"+
		"\u00ed\7\31\2\2\u00ed\u00ee\5,\27\2\u00ee\u00f4\7\32\2\2\u00ef\u00f0\7"+
		"\7\2\2\u00f0\u00f1\7\31\2\2\u00f1\u00f2\5,\27\2\u00f2\u00f3\7\32\2\2\u00f3"+
		"\u00f5\3\2\2\2\u00f4\u00ef\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\63\3\2\2"+
		"\2\u00f6\u00f7\7\b\2\2\u00f7\u00f8\7\33\2\2\u00f8\u00f9\5\60\31\2\u00f9"+
		"\u00fa\7\30\2\2\u00fa\u00fb\58\35\2\u00fb\u00fc\7\30\2\2\u00fc\u00fd\5"+
		"\60\31\2\u00fd\u00fe\7\34\2\2\u00fe\u00ff\7\31\2\2\u00ff\u0100\5,\27\2"+
		"\u0100\u0101\7\32\2\2\u0101\65\3\2\2\2\u0102\u0103\7\23\2\2\u0103\u010a"+
		"\7\33\2\2\u0104\u0105\5\20\t\2\u0105\u0106\7\37\2\2\u0106\u0107\5\20\t"+
		"\2\u0107\u0109\3\2\2\2\u0108\u0104\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108"+
		"\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010d\3\2\2\2\u010c\u010a\3\2\2\2\u010d"+
		"\u010e\7\34\2\2\u010e\u010f\7\30\2\2\u010f\67\3\2\2\2\u0110\u0111\3\2"+
		"\2\2\u01119\3\2\2\2\24CIOZry|\u00aa\u00b1\u00bb\u00c2\u00ca\u00cd\u00d6"+
		"\u00e2\u00e6\u00f4\u010a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}