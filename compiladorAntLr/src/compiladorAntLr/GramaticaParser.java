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
		MAIN=8, CHAR_TYPE=9, INT_TYPE=10, REAL_TYPE=11, STRING_TYPE=12, BOOL_TYPE=13, 
		STRING_ID=14, CHAR_ID=15, ID=16, LETTER=17, NUM=18, REAL=19, BOOL_ID=20, 
		SEMICOLON=21, OPEN_KEY=22, CLOSE_KEY=23, OPEN_PARENT=24, CLOSE_PARENT=25, 
		OPEN_BRACKET=26, CLOSE_BRACKET=27, COMMA=28, DOT=29, SIMPLE_Q_MARK=30, 
		DOUBLE_Q_MARK=31, MATH_PLUS_OP=32, EQUALS=33, MATH_LESS_OP=34, MATH_DIV_OP=35, 
		MATH_MULT_OP=36, MATH_MOD_OP=37, BOOL_SMALLER_OP=38, BOOL_BIGGER_OP=39, 
		BOOL_BIGGER_EQUALS_OP=40, BOOL_SMALLER_EQUALS_OP=41, BOOL_EQUALS_OP=42, 
		BOOL_DIFFERENT_OP=43, BOOL_CALC_DIFF_OP=44, BOOL_CALC_OR_OP=45, BOOL_CALC_AND_OP=46, 
		SINGLELINE_COMMENT=47, WHITE_SPACE=48;
	public static final String[] tokenNames = {
		"<INVALID>", "'program'", "'function'", "'while'", "'if'", "'else'", "'for'", 
		"'const'", "'main'", "'char'", "'int'", "'real'", "'string'", "'bool'", 
		"STRING_ID", "CHAR_ID", "ID", "LETTER", "NUM", "REAL", "BOOL_ID", "';'", 
		"'{'", "'}'", "'('", "')'", "'['", "']'", "','", "'.'", "'''", "'\"'", 
		"'+'", "'='", "'-'", "'/'", "'*'", "'%'", "'<'", "'>'", "'>='", "'<='", 
		"'=='", "'!='", "'!'", "'|'", "'&'", "SINGLELINE_COMMENT", "WHITE_SPACE"
	};
	public static final int
		RULE_prog = 0, RULE_start = 1, RULE_def = 2, RULE_var = 3, RULE_type = 4, 
		RULE_values = 5, RULE_value = 6, RULE_number = 7, RULE_term = 8, RULE_main = 9, 
		RULE_function = 10, RULE_params = 11, RULE_comm = 12, RULE_commands = 13, 
		RULE_while_stat = 14, RULE_assign = 15, RULE_if_stat = 16, RULE_for_stat = 17, 
		RULE_funccall = 18, RULE_expression = 19;
	public static final String[] ruleNames = {
		"prog", "start", "def", "var", "type", "values", "value", "number", "term", 
		"main", "function", "params", "comm", "commands", "while_stat", "assign", 
		"if_stat", "for_stat", "funccall", "expression"
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40); match(PROGRAM);
			setState(41); match(ID);
			setState(42); match(OPEN_KEY);
			setState(43); start();
			setState(44); match(CLOSE_KEY);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CONST) {
				{
				{
				setState(46); def();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION_W) {
				{
				{
				setState(52); function();
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MAIN) {
				{
				{
				setState(58); main();
				}
				}
				setState(63);
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
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GramaticaParser.SEMICOLON, 0); }
		public TerminalNode EQUALS() { return getToken(GramaticaParser.EQUALS, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode CONST() { return getToken(GramaticaParser.CONST, 0); }
		public DefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefContext def() throws RecognitionException {
		DefContext _localctx = new DefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_def);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64); match(CONST);
			setState(65); var();
			setState(66); match(EQUALS);
			setState(67); term(0);
			setState(68); match(SEMICOLON);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); type();
			setState(71); match(ID);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
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
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitValues(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesContext values() throws RecognitionException {
		ValuesContext _localctx = new ValuesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_values);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75); term(0);
			setState(76); match(COMMA);
			setState(77); values();
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
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode CHAR_ID() { return getToken(GramaticaParser.CHAR_ID, 0); }
		public TerminalNode STRING_ID() { return getToken(GramaticaParser.STRING_ID, 0); }
		public TerminalNode BOOL_ID() { return getToken(GramaticaParser.BOOL_ID, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_value);
		try {
			setState(84);
			switch (_input.LA(1)) {
			case STRING_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(79); match(STRING_ID);
				}
				break;
			case CHAR_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(80); match(CHAR_ID);
				}
				break;
			case NUM:
			case REAL:
			case MATH_PLUS_OP:
			case MATH_LESS_OP:
				enterOuterAlt(_localctx, 3);
				{
				setState(81); number();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(82); match(ID);
				}
				break;
			case BOOL_ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(83); match(BOOL_ID);
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode MATH_LESS_OP() { return getToken(GramaticaParser.MATH_LESS_OP, 0); }
		public TerminalNode REAL() { return getToken(GramaticaParser.REAL, 0); }
		public TerminalNode MATH_PLUS_OP() { return getToken(GramaticaParser.MATH_PLUS_OP, 0); }
		public TerminalNode NUM() { return getToken(GramaticaParser.NUM, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_la = _input.LA(1);
			if (_la==MATH_PLUS_OP || _la==MATH_LESS_OP) {
				{
				setState(86);
				_la = _input.LA(1);
				if ( !(_la==MATH_PLUS_OP || _la==MATH_LESS_OP) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(89);
			_la = _input.LA(1);
			if ( !(_la==NUM || _la==REAL) ) {
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

	public static class TermContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TerminalNode MATH_MULT_OP() { return getToken(GramaticaParser.MATH_MULT_OP, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode MATH_LESS_OP() { return getToken(GramaticaParser.MATH_LESS_OP, 0); }
		public TerminalNode MATH_DIV_OP() { return getToken(GramaticaParser.MATH_DIV_OP, 0); }
		public TerminalNode MATH_MOD_OP() { return getToken(GramaticaParser.MATH_MOD_OP, 0); }
		public TerminalNode MATH_PLUS_OP() { return getToken(GramaticaParser.MATH_PLUS_OP, 0); }
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(92); value();
			}
			_ctx.stop = _input.LT(-1);
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(109);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(94);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(95); match(MATH_DIV_OP);
						setState(96); term(7);
						}
						break;
					case 2:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(97);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(98); match(MATH_MULT_OP);
						setState(99); term(6);
						}
						break;
					case 3:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(100);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(101); match(MATH_MOD_OP);
						setState(102); term(5);
						}
						break;
					case 4:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(103);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(104); match(MATH_LESS_OP);
						setState(105); term(4);
						}
						break;
					case 5:
						{
						_localctx = new TermContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(106);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(107); match(MATH_PLUS_OP);
						setState(108); term(3);
						}
						break;
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); match(MAIN);
			setState(115); match(OPEN_KEY);
			setState(116); comm();
			setState(117); match(CLOSE_KEY);
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
		public List<ParamsContext> params() {
			return getRuleContexts(ParamsContext.class);
		}
		public TerminalNode CLOSE_PARENT() { return getToken(GramaticaParser.CLOSE_PARENT, 0); }
		public CommContext comm() {
			return getRuleContext(CommContext.class,0);
		}
		public TerminalNode OPEN_KEY() { return getToken(GramaticaParser.OPEN_KEY, 0); }
		public TerminalNode CLOSE_KEY() { return getToken(GramaticaParser.CLOSE_KEY, 0); }
		public TerminalNode OPEN_PARENT() { return getToken(GramaticaParser.OPEN_PARENT, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode FUNCTION_W() { return getToken(GramaticaParser.FUNCTION_W, 0); }
		public ParamsContext params(int i) {
			return getRuleContext(ParamsContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119); match(FUNCTION_W);
			setState(120); match(ID);
			setState(121); match(OPEN_PARENT);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR_TYPE) | (1L << INT_TYPE) | (1L << REAL_TYPE) | (1L << STRING_TYPE) | (1L << BOOL_TYPE) | (1L << ID))) != 0)) {
				{
				{
				setState(122); params();
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128); match(CLOSE_PARENT);
			setState(129); match(OPEN_KEY);
			setState(130); comm();
			setState(131); match(CLOSE_KEY);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_params);
		int _la;
		try {
			setState(149);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133); var();
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(134); match(COMMA);
					setState(135); var();
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141); assign();
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(142); match(COMMA);
					setState(143); assign();
					}
					}
					setState(148);
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
		public CommandsContext commands(int i) {
			return getRuleContext(CommandsContext.class,i);
		}
		public List<CommandsContext> commands() {
			return getRuleContexts(CommandsContext.class);
		}
		public CommContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comm; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitComm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommContext comm() throws RecognitionException {
		CommContext _localctx = new CommContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE_W) | (1L << IF_W) | (1L << FOR_W) | (1L << CHAR_TYPE) | (1L << INT_TYPE) | (1L << REAL_TYPE) | (1L << STRING_TYPE) | (1L << BOOL_TYPE) | (1L << ID))) != 0)) {
				{
				{
				setState(151); commands();
				}
				}
				setState(156);
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

	public static class CommandsContext extends ParserRuleContext {
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
		public CommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commands; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_commands);
		try {
			setState(164);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157); while_stat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158); assign();
				setState(159); match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(161); if_stat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(162); for_stat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(163); funccall();
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
		public TerminalNode WHILE_W() { return getToken(GramaticaParser.WHILE_W, 0); }
		public TerminalNode CLOSE_KEY() { return getToken(GramaticaParser.CLOSE_KEY, 0); }
		public TerminalNode OPEN_PARENT() { return getToken(GramaticaParser.OPEN_PARENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public While_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitWhile_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statContext while_stat() throws RecognitionException {
		While_statContext _localctx = new While_statContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166); match(WHILE_W);
			setState(167); match(OPEN_PARENT);
			setState(168); expression();
			setState(169); match(CLOSE_PARENT);
			setState(170); match(OPEN_KEY);
			setState(171); comm();
			setState(172); match(CLOSE_KEY);
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
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			switch (_input.LA(1)) {
			case CHAR_TYPE:
			case INT_TYPE:
			case REAL_TYPE:
			case STRING_TYPE:
			case BOOL_TYPE:
				{
				setState(174); var();
				}
				break;
			case ID:
				{
				setState(175); match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(180);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(178); match(EQUALS);
				setState(179); term(0);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ELSE_W() { return getToken(GramaticaParser.ELSE_W, 0); }
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitIf_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_if_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182); match(IF_W);
			setState(183); match(OPEN_PARENT);
			setState(184); expression();
			setState(185); match(CLOSE_PARENT);
			setState(186); match(OPEN_KEY);
			setState(187); comm();
			setState(188); match(CLOSE_KEY);
			setState(194);
			_la = _input.LA(1);
			if (_la==ELSE_W) {
				{
				setState(189); match(ELSE_W);
				setState(190); match(OPEN_KEY);
				setState(191); comm();
				setState(192); match(CLOSE_KEY);
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
		public TerminalNode SEMICOLON(int i) {
			return getToken(GramaticaParser.SEMICOLON, i);
		}
		public TerminalNode CLOSE_KEY() { return getToken(GramaticaParser.CLOSE_KEY, 0); }
		public TerminalNode OPEN_PARENT() { return getToken(GramaticaParser.OPEN_PARENT, 0); }
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public For_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitFor_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statContext for_stat() throws RecognitionException {
		For_statContext _localctx = new For_statContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_for_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196); match(FOR_W);
			setState(197); match(OPEN_PARENT);
			setState(198); assign();
			setState(199); match(SEMICOLON);
			setState(200); expression();
			setState(201); match(SEMICOLON);
			setState(202); assign();
			setState(203); match(CLOSE_PARENT);
			setState(204); match(OPEN_KEY);
			setState(205); comm();
			setState(206); match(CLOSE_KEY);
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitFunccall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunccallContext funccall() throws RecognitionException {
		FunccallContext _localctx = new FunccallContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_funccall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208); match(ID);
			setState(209); match(OPEN_PARENT);
			setState(218);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING_ID) | (1L << CHAR_ID) | (1L << ID) | (1L << NUM) | (1L << REAL) | (1L << BOOL_ID) | (1L << MATH_PLUS_OP) | (1L << MATH_LESS_OP))) != 0)) {
				{
				setState(210); value();
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(211); match(COMMA);
					setState(212); value();
					}
					}
					setState(217);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(220); match(CLOSE_PARENT);
			setState(221); match(SEMICOLON);
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TerminalNode BOOL_BIGGER_OP() { return getToken(GramaticaParser.BOOL_BIGGER_OP, 0); }
		public TerminalNode BOOL_EQUALS_OP() { return getToken(GramaticaParser.BOOL_EQUALS_OP, 0); }
		public TerminalNode BOOL_DIFFERENT_OP() { return getToken(GramaticaParser.BOOL_DIFFERENT_OP, 0); }
		public TerminalNode BOOL_SMALLER_EQUALS_OP() { return getToken(GramaticaParser.BOOL_SMALLER_EQUALS_OP, 0); }
		public TerminalNode BOOL_SMALLER_OP() { return getToken(GramaticaParser.BOOL_SMALLER_OP, 0); }
		public TerminalNode BOOL_BIGGER_EQUALS_OP() { return getToken(GramaticaParser.BOOL_BIGGER_EQUALS_OP, 0); }
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expression);
		try {
			setState(248);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223); term(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(224); term(0);
				setState(225); match(BOOL_SMALLER_OP);
				setState(226); term(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(228); term(0);
				setState(229); match(BOOL_BIGGER_OP);
				setState(230); term(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(232); term(0);
				setState(233); match(BOOL_SMALLER_EQUALS_OP);
				setState(234); term(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(236); term(0);
				setState(237); match(BOOL_BIGGER_EQUALS_OP);
				setState(238); term(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(240); term(0);
				setState(241); match(BOOL_EQUALS_OP);
				setState(242); term(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(244); term(0);
				setState(245); match(BOOL_DIFFERENT_OP);
				setState(246); term(0);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 8: return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 6);
		case 1: return precpred(_ctx, 5);
		case 2: return precpred(_ctx, 4);
		case 3: return precpred(_ctx, 3);
		case 4: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\62\u00fd\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\3\7\3\62\n\3"+
		"\f\3\16\3\65\13\3\3\3\7\38\n\3\f\3\16\3;\13\3\3\3\7\3>\n\3\f\3\16\3A\13"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\5\bW\n\b\3\t\5\tZ\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\np\n\n\f\n\16\ns\13\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f~\n\f\f\f\16\f\u0081\13\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\7\r\u008b\n\r\f\r\16\r\u008e\13\r\3\r\3"+
		"\r\3\r\7\r\u0093\n\r\f\r\16\r\u0096\13\r\5\r\u0098\n\r\3\16\7\16\u009b"+
		"\n\16\f\16\16\16\u009e\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00a7"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\5\21\u00b3\n\21"+
		"\3\21\3\21\5\21\u00b7\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u00c5\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\7\24\u00d8\n\24\f\24\16"+
		"\24\u00db\13\24\5\24\u00dd\n\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00fb\n\25\3\25\2\3\22\26\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\5\3\2\13\17\4\2\"\"$$\3\2\24\25"+
		"\u0109\2*\3\2\2\2\4\63\3\2\2\2\6B\3\2\2\2\bH\3\2\2\2\nK\3\2\2\2\fM\3\2"+
		"\2\2\16V\3\2\2\2\20Y\3\2\2\2\22]\3\2\2\2\24t\3\2\2\2\26y\3\2\2\2\30\u0097"+
		"\3\2\2\2\32\u009c\3\2\2\2\34\u00a6\3\2\2\2\36\u00a8\3\2\2\2 \u00b2\3\2"+
		"\2\2\"\u00b8\3\2\2\2$\u00c6\3\2\2\2&\u00d2\3\2\2\2(\u00fa\3\2\2\2*+\7"+
		"\3\2\2+,\7\22\2\2,-\7\30\2\2-.\5\4\3\2./\7\31\2\2/\3\3\2\2\2\60\62\5\6"+
		"\4\2\61\60\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\649\3\2\2"+
		"\2\65\63\3\2\2\2\668\5\26\f\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3"+
		"\2\2\2:?\3\2\2\2;9\3\2\2\2<>\5\24\13\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?"+
		"@\3\2\2\2@\5\3\2\2\2A?\3\2\2\2BC\7\t\2\2CD\5\b\5\2DE\7#\2\2EF\5\22\n\2"+
		"FG\7\27\2\2G\7\3\2\2\2HI\5\n\6\2IJ\7\22\2\2J\t\3\2\2\2KL\t\2\2\2L\13\3"+
		"\2\2\2MN\5\22\n\2NO\7\36\2\2OP\5\f\7\2P\r\3\2\2\2QW\7\20\2\2RW\7\21\2"+
		"\2SW\5\20\t\2TW\7\22\2\2UW\7\26\2\2VQ\3\2\2\2VR\3\2\2\2VS\3\2\2\2VT\3"+
		"\2\2\2VU\3\2\2\2W\17\3\2\2\2XZ\t\3\2\2YX\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2["+
		"\\\t\4\2\2\\\21\3\2\2\2]^\b\n\1\2^_\5\16\b\2_q\3\2\2\2`a\f\b\2\2ab\7%"+
		"\2\2bp\5\22\n\tcd\f\7\2\2de\7&\2\2ep\5\22\n\bfg\f\6\2\2gh\7\'\2\2hp\5"+
		"\22\n\7ij\f\5\2\2jk\7$\2\2kp\5\22\n\6lm\f\4\2\2mn\7\"\2\2np\5\22\n\5o"+
		"`\3\2\2\2oc\3\2\2\2of\3\2\2\2oi\3\2\2\2ol\3\2\2\2ps\3\2\2\2qo\3\2\2\2"+
		"qr\3\2\2\2r\23\3\2\2\2sq\3\2\2\2tu\7\n\2\2uv\7\30\2\2vw\5\32\16\2wx\7"+
		"\31\2\2x\25\3\2\2\2yz\7\4\2\2z{\7\22\2\2{\177\7\32\2\2|~\5\30\r\2}|\3"+
		"\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2"+
		"\2\u0081\177\3\2\2\2\u0082\u0083\7\33\2\2\u0083\u0084\7\30\2\2\u0084\u0085"+
		"\5\32\16\2\u0085\u0086\7\31\2\2\u0086\27\3\2\2\2\u0087\u008c\5\b\5\2\u0088"+
		"\u0089\7\36\2\2\u0089\u008b\5\b\5\2\u008a\u0088\3\2\2\2\u008b\u008e\3"+
		"\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0098\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008f\u0094\5 \21\2\u0090\u0091\7\36\2\2\u0091\u0093\5"+
		" \21\2\u0092\u0090\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0087\3\2"+
		"\2\2\u0097\u008f\3\2\2\2\u0098\31\3\2\2\2\u0099\u009b\5\34\17\2\u009a"+
		"\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2"+
		"\2\2\u009d\33\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a7\5\36\20\2\u00a0"+
		"\u00a1\5 \21\2\u00a1\u00a2\7\27\2\2\u00a2\u00a7\3\2\2\2\u00a3\u00a7\5"+
		"\"\22\2\u00a4\u00a7\5$\23\2\u00a5\u00a7\5&\24\2\u00a6\u009f\3\2\2\2\u00a6"+
		"\u00a0\3\2\2\2\u00a6\u00a3\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2"+
		"\2\2\u00a7\35\3\2\2\2\u00a8\u00a9\7\5\2\2\u00a9\u00aa\7\32\2\2\u00aa\u00ab"+
		"\5(\25\2\u00ab\u00ac\7\33\2\2\u00ac\u00ad\7\30\2\2\u00ad\u00ae\5\32\16"+
		"\2\u00ae\u00af\7\31\2\2\u00af\37\3\2\2\2\u00b0\u00b3\5\b\5\2\u00b1\u00b3"+
		"\7\22\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2"+
		"\u00b4\u00b5\7#\2\2\u00b5\u00b7\5\22\n\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7"+
		"\3\2\2\2\u00b7!\3\2\2\2\u00b8\u00b9\7\6\2\2\u00b9\u00ba\7\32\2\2\u00ba"+
		"\u00bb\5(\25\2\u00bb\u00bc\7\33\2\2\u00bc\u00bd\7\30\2\2\u00bd\u00be\5"+
		"\32\16\2\u00be\u00c4\7\31\2\2\u00bf\u00c0\7\7\2\2\u00c0\u00c1\7\30\2\2"+
		"\u00c1\u00c2\5\32\16\2\u00c2\u00c3\7\31\2\2\u00c3\u00c5\3\2\2\2\u00c4"+
		"\u00bf\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5#\3\2\2\2\u00c6\u00c7\7\b\2\2"+
		"\u00c7\u00c8\7\32\2\2\u00c8\u00c9\5 \21\2\u00c9\u00ca\7\27\2\2\u00ca\u00cb"+
		"\5(\25\2\u00cb\u00cc\7\27\2\2\u00cc\u00cd\5 \21\2\u00cd\u00ce\7\33\2\2"+
		"\u00ce\u00cf\7\30\2\2\u00cf\u00d0\5\32\16\2\u00d0\u00d1\7\31\2\2\u00d1"+
		"%\3\2\2\2\u00d2\u00d3\7\22\2\2\u00d3\u00dc\7\32\2\2\u00d4\u00d9\5\16\b"+
		"\2\u00d5\u00d6\7\36\2\2\u00d6\u00d8\5\16\b\2\u00d7\u00d5\3\2\2\2\u00d8"+
		"\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dd\3\2"+
		"\2\2\u00db\u00d9\3\2\2\2\u00dc\u00d4\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de\u00df\7\33\2\2\u00df\u00e0\7\27\2\2\u00e0\'\3\2\2"+
		"\2\u00e1\u00fb\5\22\n\2\u00e2\u00e3\5\22\n\2\u00e3\u00e4\7(\2\2\u00e4"+
		"\u00e5\5\22\n\2\u00e5\u00fb\3\2\2\2\u00e6\u00e7\5\22\n\2\u00e7\u00e8\7"+
		")\2\2\u00e8\u00e9\5\22\n\2\u00e9\u00fb\3\2\2\2\u00ea\u00eb\5\22\n\2\u00eb"+
		"\u00ec\7+\2\2\u00ec\u00ed\5\22\n\2\u00ed\u00fb\3\2\2\2\u00ee\u00ef\5\22"+
		"\n\2\u00ef\u00f0\7*\2\2\u00f0\u00f1\5\22\n\2\u00f1\u00fb\3\2\2\2\u00f2"+
		"\u00f3\5\22\n\2\u00f3\u00f4\7,\2\2\u00f4\u00f5\5\22\n\2\u00f5\u00fb\3"+
		"\2\2\2\u00f6\u00f7\5\22\n\2\u00f7\u00f8\7-\2\2\u00f8\u00f9\5\22\n\2\u00f9"+
		"\u00fb\3\2\2\2\u00fa\u00e1\3\2\2\2\u00fa\u00e2\3\2\2\2\u00fa\u00e6\3\2"+
		"\2\2\u00fa\u00ea\3\2\2\2\u00fa\u00ee\3\2\2\2\u00fa\u00f2\3\2\2\2\u00fa"+
		"\u00f6\3\2\2\2\u00fb)\3\2\2\2\25\639?VYoq\177\u008c\u0094\u0097\u009c"+
		"\u00a6\u00b2\u00b6\u00c4\u00d9\u00dc\u00fa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}