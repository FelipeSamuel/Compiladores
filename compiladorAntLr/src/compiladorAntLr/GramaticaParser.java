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
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, PROGRAM=2, FUNCTION_W=3, WHILE_W=4, IF_W=5, ELSE_W=6, FOR_W=7, 
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
		"<INVALID>", "'println('", "'program'", "'function'", "'while'", "'if'", 
		"'else'", "'for'", "'main'", "'char'", "'int'", "'real'", "'string'", 
		"'bool'", "STRING_ID", "CHAR_ID", "ID", "LETTER", "NUM", "REAL", "BOOL_ID", 
		"';'", "'{'", "'}'", "'('", "')'", "'['", "']'", "','", "'.'", "'''", 
		"'\"'", "'+'", "'='", "'-'", "'/'", "'*'", "'%'", "'<'", "'>'", "'>='", 
		"'<='", "'=='", "'!='", "'!'", "'|'", "'&'", "SINGLELINE_COMMENT", "WHITE_SPACE"
	};
	public static final int
		RULE_prog = 0, RULE_start = 1, RULE_println = 2, RULE_var = 3, RULE_varAtrib = 4, 
		RULE_atrib = 5, RULE_methodAtribs = 6, RULE_type = 7, RULE_main = 8, RULE_function = 9, 
		RULE_params = 10, RULE_comm = 11, RULE_commands = 12, RULE_while_stat = 13, 
		RULE_if_stat = 14, RULE_for_stat = 15, RULE_funccall = 16, RULE_args_func = 17, 
		RULE_expression = 18, RULE_term = 19, RULE_value = 20;
	public static final String[] ruleNames = {
		"prog", "start", "println", "var", "varAtrib", "atrib", "methodAtribs", 
		"type", "main", "function", "params", "comm", "commands", "while_stat", 
		"if_stat", "for_stat", "funccall", "args_func", "expression", "term", 
		"value"
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
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InicioContext extends ProgContext {
		public TerminalNode OPEN_KEY() { return getToken(GramaticaParser.OPEN_KEY, 0); }
		public TerminalNode CLOSE_KEY() { return getToken(GramaticaParser.CLOSE_KEY, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode PROGRAM() { return getToken(GramaticaParser.PROGRAM, 0); }
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public InicioContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitInicio(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TesteContext extends ProgContext {
		public List<PrintlnContext> println() {
			return getRuleContexts(PrintlnContext.class);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(GramaticaParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(GramaticaParser.SEMICOLON, i);
		}
		public PrintlnContext println(int i) {
			return getRuleContext(PrintlnContext.class,i);
		}
		public TesteContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitTeste(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			setState(56);
			switch (_input.LA(1)) {
			case EOF:
			case T__0:
				_localctx = new TesteContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(42); println();
					setState(43); match(SEMICOLON);
					}
					}
					setState(49);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case PROGRAM:
				_localctx = new InicioContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(50); match(PROGRAM);
				setState(51); match(ID);
				setState(52); match(OPEN_KEY);
				setState(53); start();
				setState(54); match(CLOSE_KEY);
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
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
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
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHAR_TYPE) | (1L << INT_TYPE) | (1L << REAL_TYPE) | (1L << STRING_TYPE) | (1L << BOOL_TYPE))) != 0)) {
				{
				{
				setState(58); function();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MAIN) {
				{
				{
				setState(64); main();
				}
				}
				setState(69);
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

	public static class PrintlnContext extends ParserRuleContext {
		public ExpressionContext argumento;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitPrintln(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_println);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); match(T__0);
			setState(71); ((PrintlnContext)_localctx).argumento = expression();
			setState(72); match(CLOSE_PARENT);
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
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	 
		public VarContext() { }
		public void copyFrom(VarContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarDeclaracaoContext extends VarContext {
		public TypeContext tipo;
		public Token nomeVariavel;
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarDeclaracaoContext(VarContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitVarDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var);
		try {
			_localctx = new VarDeclaracaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(74); ((VarDeclaracaoContext)_localctx).tipo = type();
			setState(75); ((VarDeclaracaoContext)_localctx).nomeVariavel = match(ID);
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

	public static class VarAtribContext extends ParserRuleContext {
		public VarAtribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varAtrib; }
	 
		public VarAtribContext() { }
		public void copyFrom(VarAtribContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarDecAtribContext extends VarAtribContext {
		public TypeContext tipo;
		public Token nomeVariavel;
		public Token opIgual;
		public TermContext valor;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(GramaticaParser.EQUALS, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarDecAtribContext(VarAtribContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitVarDecAtrib(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarAtribContext varAtrib() throws RecognitionException {
		VarAtribContext _localctx = new VarAtribContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varAtrib);
		try {
			_localctx = new VarDecAtribContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(77); ((VarDecAtribContext)_localctx).tipo = type();
			setState(78); ((VarDecAtribContext)_localctx).nomeVariavel = match(ID);
			setState(79); ((VarDecAtribContext)_localctx).opIgual = match(EQUALS);
			setState(80); ((VarDecAtribContext)_localctx).valor = term(0);
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

	public static class AtribContext extends ParserRuleContext {
		public AtribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrib; }
	 
		public AtribContext() { }
		public void copyFrom(AtribContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AtribuicaoContext extends AtribContext {
		public Token nomeVariavel;
		public Token opIgual;
		public TermContext valor;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(GramaticaParser.EQUALS, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public AtribuicaoContext(AtribContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribContext atrib() throws RecognitionException {
		AtribContext _localctx = new AtribContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atrib);
		try {
			_localctx = new AtribuicaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(82); ((AtribuicaoContext)_localctx).nomeVariavel = match(ID);
			setState(83); ((AtribuicaoContext)_localctx).opIgual = match(EQUALS);
			setState(84); ((AtribuicaoContext)_localctx).valor = term(0);
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

	public static class MethodAtribsContext extends ParserRuleContext {
		public VarAtribContext varAtrib() {
			return getRuleContext(VarAtribContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GramaticaParser.SEMICOLON, 0); }
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public MethodAtribsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodAtribs; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitMethodAtribs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodAtribsContext methodAtribs() throws RecognitionException {
		MethodAtribsContext _localctx = new MethodAtribsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodAtribs);
		try {
			setState(95);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86); var();
				setState(87); match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89); varAtrib();
				setState(90); match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(92); atrib();
				setState(93); match(SEMICOLON);
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
		enterRule(_localctx, 14, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
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
		enterRule(_localctx, 16, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99); match(MAIN);
			setState(100); match(OPEN_KEY);
			setState(101); comm();
			setState(102); match(CLOSE_KEY);
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
		public TypeContext tipo;
		public Token nomeFuncReservado;
		public Token nomeFuncao;
		public ParamsContext parametros;
		public CommContext comandos;
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode CLOSE_PARENT() { return getToken(GramaticaParser.CLOSE_PARENT, 0); }
		public CommContext comm() {
			return getRuleContext(CommContext.class,0);
		}
		public TerminalNode OPEN_KEY() { return getToken(GramaticaParser.OPEN_KEY, 0); }
		public TerminalNode CLOSE_KEY() { return getToken(GramaticaParser.CLOSE_KEY, 0); }
		public TerminalNode OPEN_PARENT() { return getToken(GramaticaParser.OPEN_PARENT, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode FUNCTION_W() { return getToken(GramaticaParser.FUNCTION_W, 0); }
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
		enterRule(_localctx, 18, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104); ((FunctionContext)_localctx).tipo = type();
			setState(105); ((FunctionContext)_localctx).nomeFuncReservado = match(FUNCTION_W);
			setState(106); ((FunctionContext)_localctx).nomeFuncao = match(ID);
			setState(107); match(OPEN_PARENT);
			setState(108); ((FunctionContext)_localctx).parametros = params();
			setState(109); match(CLOSE_PARENT);
			setState(110); match(OPEN_KEY);
			setState(111); ((FunctionContext)_localctx).comandos = comm();
			setState(112); match(CLOSE_KEY);
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
		public VarContext var;
		public List<VarContext> varDec = new ArrayList<VarContext>();
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GramaticaParser.COMMA); }
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
		enterRule(_localctx, 20, RULE_params);
		int _la;
		try {
			setState(123);
			switch (_input.LA(1)) {
			case CHAR_TYPE:
			case INT_TYPE:
			case REAL_TYPE:
			case STRING_TYPE:
			case BOOL_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(114); ((ParamsContext)_localctx).var = var();
				((ParamsContext)_localctx).varDec.add(((ParamsContext)_localctx).var);
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(115); match(COMMA);
					setState(116); ((ParamsContext)_localctx).var = var();
					((ParamsContext)_localctx).varDec.add(((ParamsContext)_localctx).var);
					}
					}
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case CLOSE_PARENT:
				enterOuterAlt(_localctx, 2);
				{
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
		enterRule(_localctx, 22, RULE_comm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE_W) | (1L << IF_W) | (1L << FOR_W) | (1L << CHAR_TYPE) | (1L << INT_TYPE) | (1L << REAL_TYPE) | (1L << STRING_TYPE) | (1L << BOOL_TYPE) | (1L << ID))) != 0)) {
				{
				{
				setState(125); commands();
				}
				}
				setState(130);
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
		public MethodAtribsContext methodAtribs() {
			return getRuleContext(MethodAtribsContext.class,0);
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
		enterRule(_localctx, 24, RULE_commands);
		try {
			setState(138);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131); while_stat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132); methodAtribs();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(133); if_stat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(134); for_stat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(135); funccall();
				setState(136); match(SEMICOLON);
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
		enterRule(_localctx, 26, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140); match(WHILE_W);
			setState(141); match(OPEN_PARENT);
			setState(142); expression();
			setState(143); match(CLOSE_PARENT);
			setState(144); match(OPEN_KEY);
			setState(145); comm();
			setState(146); match(CLOSE_KEY);
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
		enterRule(_localctx, 28, RULE_if_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148); match(IF_W);
			setState(149); match(OPEN_PARENT);
			setState(150); expression();
			setState(151); match(CLOSE_PARENT);
			setState(152); match(OPEN_KEY);
			setState(153); comm();
			setState(154); match(CLOSE_KEY);
			setState(160);
			_la = _input.LA(1);
			if (_la==ELSE_W) {
				{
				setState(155); match(ELSE_W);
				setState(156); match(OPEN_KEY);
				setState(157); comm();
				setState(158); match(CLOSE_KEY);
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
		public TerminalNode INT_TYPE() { return getToken(GramaticaParser.INT_TYPE, 0); }
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
		public AtribContext atrib(int i) {
			return getRuleContext(AtribContext.class,i);
		}
		public List<AtribContext> atrib() {
			return getRuleContexts(AtribContext.class);
		}
		public TerminalNode OPEN_PARENT() { return getToken(GramaticaParser.OPEN_PARENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 30, RULE_for_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162); match(FOR_W);
			setState(163); match(OPEN_PARENT);
			setState(164); match(INT_TYPE);
			setState(165); atrib();
			setState(166); match(SEMICOLON);
			setState(167); expression();
			setState(168); match(SEMICOLON);
			setState(169); atrib();
			setState(170); match(CLOSE_PARENT);
			setState(171); match(OPEN_KEY);
			setState(172); comm();
			setState(173); match(CLOSE_KEY);
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
		public Token nomeFuncao;
		public Args_funcContext args;
		public TerminalNode CLOSE_PARENT() { return getToken(GramaticaParser.CLOSE_PARENT, 0); }
		public TerminalNode OPEN_PARENT() { return getToken(GramaticaParser.OPEN_PARENT, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public Args_funcContext args_func() {
			return getRuleContext(Args_funcContext.class,0);
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
		enterRule(_localctx, 32, RULE_funccall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175); ((FunccallContext)_localctx).nomeFuncao = match(ID);
			setState(176); match(OPEN_PARENT);
			setState(177); ((FunccallContext)_localctx).args = args_func();
			setState(178); match(CLOSE_PARENT);
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

	public static class Args_funcContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> exp = new ArrayList<ExpressionContext>();
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GramaticaParser.COMMA); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode COMMA(int i) {
			return getToken(GramaticaParser.COMMA, i);
		}
		public Args_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args_func; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitArgs_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Args_funcContext args_func() throws RecognitionException {
		Args_funcContext _localctx = new Args_funcContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_args_func);
		int _la;
		try {
			setState(189);
			switch (_input.LA(1)) {
			case ID:
			case NUM:
			case REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(180); ((Args_funcContext)_localctx).expression = expression();
				((Args_funcContext)_localctx).exp.add(((Args_funcContext)_localctx).expression);
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(181); match(COMMA);
					setState(182); ((Args_funcContext)_localctx).expression = expression();
					((Args_funcContext)_localctx).exp.add(((Args_funcContext)_localctx).expression);
					}
					}
					setState(187);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case CLOSE_PARENT:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MenorContext extends ExpressionContext {
		public TermContext esq;
		public TermContext dir;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TerminalNode BOOL_SMALLER_OP() { return getToken(GramaticaParser.BOOL_SMALLER_OP, 0); }
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public MenorContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitMenor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MaiorContext extends ExpressionContext {
		public TermContext esq;
		public TermContext dir;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TerminalNode BOOL_BIGGER_OP() { return getToken(GramaticaParser.BOOL_BIGGER_OP, 0); }
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public MaiorContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitMaior(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DiferenteContext extends ExpressionContext {
		public TermContext esq;
		public TermContext dir;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TerminalNode BOOL_DIFFERENT_OP() { return getToken(GramaticaParser.BOOL_DIFFERENT_OP, 0); }
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public DiferenteContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDiferente(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IgualContext extends ExpressionContext {
		public TermContext esq;
		public TermContext dir;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TerminalNode BOOL_EQUALS_OP() { return getToken(GramaticaParser.BOOL_EQUALS_OP, 0); }
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public IgualContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitIgual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OpMatematicaContext extends ExpressionContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public OpMatematicaContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitOpMatematica(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncChamadaContext extends ExpressionContext {
		public FunccallContext funccall() {
			return getRuleContext(FunccallContext.class,0);
		}
		public FuncChamadaContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitFuncChamada(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MaiorIgualContext extends ExpressionContext {
		public TermContext esq;
		public TermContext dir;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode BOOL_BIGGER_EQUALS_OP() { return getToken(GramaticaParser.BOOL_BIGGER_EQUALS_OP, 0); }
		public MaiorIgualContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitMaiorIgual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MenorIgualContext extends ExpressionContext {
		public TermContext esq;
		public TermContext dir;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TerminalNode BOOL_SMALLER_EQUALS_OP() { return getToken(GramaticaParser.BOOL_SMALLER_EQUALS_OP, 0); }
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public MenorIgualContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitMenorIgual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expression);
		try {
			setState(217);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new OpMatematicaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(191); term(0);
				}
				break;
			case 2:
				_localctx = new MenorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(192); ((MenorContext)_localctx).esq = term(0);
				setState(193); match(BOOL_SMALLER_OP);
				setState(194); ((MenorContext)_localctx).dir = term(0);
				}
				break;
			case 3:
				_localctx = new MaiorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(196); ((MaiorContext)_localctx).esq = term(0);
				setState(197); match(BOOL_BIGGER_OP);
				setState(198); ((MaiorContext)_localctx).dir = term(0);
				}
				break;
			case 4:
				_localctx = new MenorIgualContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(200); ((MenorIgualContext)_localctx).esq = term(0);
				setState(201); match(BOOL_SMALLER_EQUALS_OP);
				setState(202); ((MenorIgualContext)_localctx).dir = term(0);
				}
				break;
			case 5:
				_localctx = new MaiorIgualContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(204); ((MaiorIgualContext)_localctx).esq = term(0);
				setState(205); match(BOOL_BIGGER_EQUALS_OP);
				setState(206); ((MaiorIgualContext)_localctx).dir = term(0);
				}
				break;
			case 6:
				_localctx = new IgualContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(208); ((IgualContext)_localctx).esq = term(0);
				setState(209); match(BOOL_EQUALS_OP);
				setState(210); ((IgualContext)_localctx).dir = term(0);
				}
				break;
			case 7:
				_localctx = new DiferenteContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(212); ((DiferenteContext)_localctx).esq = term(0);
				setState(213); match(BOOL_DIFFERENT_OP);
				setState(214); ((DiferenteContext)_localctx).dir = term(0);
				}
				break;
			case 8:
				_localctx = new FuncChamadaContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(216); funccall();
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

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DivisaoContext extends TermContext {
		public TermContext esq;
		public TermContext dir;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TerminalNode MATH_DIV_OP() { return getToken(GramaticaParser.MATH_DIV_OP, 0); }
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public DivisaoContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDivisao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MenosContext extends TermContext {
		public TermContext esq;
		public TermContext dir;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TerminalNode MATH_LESS_OP() { return getToken(GramaticaParser.MATH_LESS_OP, 0); }
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public MenosContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitMenos(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValorContext extends TermContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValorContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitValor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MaisContext extends TermContext {
		public TermContext esq;
		public TermContext dir;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode MATH_PLUS_OP() { return getToken(GramaticaParser.MATH_PLUS_OP, 0); }
		public MaisContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitMais(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModuloContext extends TermContext {
		public TermContext esq;
		public TermContext dir;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TerminalNode MATH_MOD_OP() { return getToken(GramaticaParser.MATH_MOD_OP, 0); }
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public ModuloContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitModulo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicacaoContext extends TermContext {
		public TermContext esq;
		public TermContext dir;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TerminalNode MATH_MULT_OP() { return getToken(GramaticaParser.MATH_MULT_OP, 0); }
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public MultiplicacaoContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitMultiplicacao(this);
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ValorContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(220); value();
			}
			_ctx.stop = _input.LT(-1);
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(237);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new DivisaoContext(new TermContext(_parentctx, _parentState));
						((DivisaoContext)_localctx).esq = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(222);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(223); match(MATH_DIV_OP);
						setState(224); ((DivisaoContext)_localctx).dir = term(7);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicacaoContext(new TermContext(_parentctx, _parentState));
						((MultiplicacaoContext)_localctx).esq = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(225);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(226); match(MATH_MULT_OP);
						setState(227); ((MultiplicacaoContext)_localctx).dir = term(6);
						}
						break;
					case 3:
						{
						_localctx = new ModuloContext(new TermContext(_parentctx, _parentState));
						((ModuloContext)_localctx).esq = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(228);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(229); match(MATH_MOD_OP);
						setState(230); ((ModuloContext)_localctx).dir = term(5);
						}
						break;
					case 4:
						{
						_localctx = new MenosContext(new TermContext(_parentctx, _parentState));
						((MenosContext)_localctx).esq = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(231);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(232); match(MATH_LESS_OP);
						setState(233); ((MenosContext)_localctx).dir = term(4);
						}
						break;
					case 5:
						{
						_localctx = new MaisContext(new TermContext(_parentctx, _parentState));
						((MaisContext)_localctx).esq = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(234);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(235); match(MATH_PLUS_OP);
						setState(236); ((MaisContext)_localctx).dir = term(3);
						}
						break;
					}
					} 
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumeroInteiroContext extends ValueContext {
		public Token numero;
		public TerminalNode NUM() { return getToken(GramaticaParser.NUM, 0); }
		public NumeroInteiroContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitNumeroInteiro(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentContext extends ValueContext {
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public IdentContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitIdent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumeroRealContext extends ValueContext {
		public Token numero;
		public TerminalNode REAL() { return getToken(GramaticaParser.REAL, 0); }
		public NumeroRealContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitNumeroReal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_value);
		try {
			setState(245);
			switch (_input.LA(1)) {
			case NUM:
				_localctx = new NumeroInteiroContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(242); ((NumeroInteiroContext)_localctx).numero = match(NUM);
				}
				break;
			case REAL:
				_localctx = new NumeroRealContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(243); ((NumeroRealContext)_localctx).numero = match(REAL);
				}
				break;
			case ID:
				_localctx = new IdentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(244); match(ID);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 19: return term_sempred((TermContext)_localctx, predIndex);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\62\u00fa\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\7\2\60\n\2\f\2\16"+
		"\2\63\13\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2;\n\2\3\3\7\3>\n\3\f\3\16\3A\13"+
		"\3\3\3\7\3D\n\3\f\3\16\3G\13\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bb\n\b"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\7\fx\n\f\f\f\16\f{\13\f\3\f\5\f~\n\f\3\r\7\r\u0081"+
		"\n\r\f\r\16\r\u0084\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u008d"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00a3\n\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\7\23\u00ba\n\23\f\23\16\23\u00bd\13\23\3\23\5\23\u00c0"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u00dc\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u00f0\n\25\f\25\16\25\u00f3\13\25"+
		"\3\26\3\26\3\26\5\26\u00f8\n\26\3\26\2\3(\27\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*\2\3\3\2\13\17\u0102\2:\3\2\2\2\4?\3\2\2\2\6H\3\2\2"+
		"\2\bL\3\2\2\2\nO\3\2\2\2\fT\3\2\2\2\16a\3\2\2\2\20c\3\2\2\2\22e\3\2\2"+
		"\2\24j\3\2\2\2\26}\3\2\2\2\30\u0082\3\2\2\2\32\u008c\3\2\2\2\34\u008e"+
		"\3\2\2\2\36\u0096\3\2\2\2 \u00a4\3\2\2\2\"\u00b1\3\2\2\2$\u00bf\3\2\2"+
		"\2&\u00db\3\2\2\2(\u00dd\3\2\2\2*\u00f7\3\2\2\2,-\5\6\4\2-.\7\27\2\2."+
		"\60\3\2\2\2/,\3\2\2\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62;\3\2"+
		"\2\2\63\61\3\2\2\2\64\65\7\4\2\2\65\66\7\22\2\2\66\67\7\30\2\2\678\5\4"+
		"\3\289\7\31\2\29;\3\2\2\2:\61\3\2\2\2:\64\3\2\2\2;\3\3\2\2\2<>\5\24\13"+
		"\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@E\3\2\2\2A?\3\2\2\2BD\5\22"+
		"\n\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\5\3\2\2\2GE\3\2\2\2HI\7"+
		"\3\2\2IJ\5&\24\2JK\7\33\2\2K\7\3\2\2\2LM\5\20\t\2MN\7\22\2\2N\t\3\2\2"+
		"\2OP\5\20\t\2PQ\7\22\2\2QR\7#\2\2RS\5(\25\2S\13\3\2\2\2TU\7\22\2\2UV\7"+
		"#\2\2VW\5(\25\2W\r\3\2\2\2XY\5\b\5\2YZ\7\27\2\2Zb\3\2\2\2[\\\5\n\6\2\\"+
		"]\7\27\2\2]b\3\2\2\2^_\5\f\7\2_`\7\27\2\2`b\3\2\2\2aX\3\2\2\2a[\3\2\2"+
		"\2a^\3\2\2\2b\17\3\2\2\2cd\t\2\2\2d\21\3\2\2\2ef\7\n\2\2fg\7\30\2\2gh"+
		"\5\30\r\2hi\7\31\2\2i\23\3\2\2\2jk\5\20\t\2kl\7\5\2\2lm\7\22\2\2mn\7\32"+
		"\2\2no\5\26\f\2op\7\33\2\2pq\7\30\2\2qr\5\30\r\2rs\7\31\2\2s\25\3\2\2"+
		"\2ty\5\b\5\2uv\7\36\2\2vx\5\b\5\2wu\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2"+
		"\2\2z~\3\2\2\2{y\3\2\2\2|~\3\2\2\2}t\3\2\2\2}|\3\2\2\2~\27\3\2\2\2\177"+
		"\u0081\5\32\16\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2"+
		"\2\2\u0082\u0083\3\2\2\2\u0083\31\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u008d"+
		"\5\34\17\2\u0086\u008d\5\16\b\2\u0087\u008d\5\36\20\2\u0088\u008d\5 \21"+
		"\2\u0089\u008a\5\"\22\2\u008a\u008b\7\27\2\2\u008b\u008d\3\2\2\2\u008c"+
		"\u0085\3\2\2\2\u008c\u0086\3\2\2\2\u008c\u0087\3\2\2\2\u008c\u0088\3\2"+
		"\2\2\u008c\u0089\3\2\2\2\u008d\33\3\2\2\2\u008e\u008f\7\6\2\2\u008f\u0090"+
		"\7\32\2\2\u0090\u0091\5&\24\2\u0091\u0092\7\33\2\2\u0092\u0093\7\30\2"+
		"\2\u0093\u0094\5\30\r\2\u0094\u0095\7\31\2\2\u0095\35\3\2\2\2\u0096\u0097"+
		"\7\7\2\2\u0097\u0098\7\32\2\2\u0098\u0099\5&\24\2\u0099\u009a\7\33\2\2"+
		"\u009a\u009b\7\30\2\2\u009b\u009c\5\30\r\2\u009c\u00a2\7\31\2\2\u009d"+
		"\u009e\7\b\2\2\u009e\u009f\7\30\2\2\u009f\u00a0\5\30\r\2\u00a0\u00a1\7"+
		"\31\2\2\u00a1\u00a3\3\2\2\2\u00a2\u009d\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\37\3\2\2\2\u00a4\u00a5\7\t\2\2\u00a5\u00a6\7\32\2\2\u00a6\u00a7\7\f\2"+
		"\2\u00a7\u00a8\5\f\7\2\u00a8\u00a9\7\27\2\2\u00a9\u00aa\5&\24\2\u00aa"+
		"\u00ab\7\27\2\2\u00ab\u00ac\5\f\7\2\u00ac\u00ad\7\33\2\2\u00ad\u00ae\7"+
		"\30\2\2\u00ae\u00af\5\30\r\2\u00af\u00b0\7\31\2\2\u00b0!\3\2\2\2\u00b1"+
		"\u00b2\7\22\2\2\u00b2\u00b3\7\32\2\2\u00b3\u00b4\5$\23\2\u00b4\u00b5\7"+
		"\33\2\2\u00b5#\3\2\2\2\u00b6\u00bb\5&\24\2\u00b7\u00b8\7\36\2\2\u00b8"+
		"\u00ba\5&\24\2\u00b9\u00b7\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2"+
		"\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00c0\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be"+
		"\u00c0\3\2\2\2\u00bf\u00b6\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0%\3\2\2\2"+
		"\u00c1\u00dc\5(\25\2\u00c2\u00c3\5(\25\2\u00c3\u00c4\7(\2\2\u00c4\u00c5"+
		"\5(\25\2\u00c5\u00dc\3\2\2\2\u00c6\u00c7\5(\25\2\u00c7\u00c8\7)\2\2\u00c8"+
		"\u00c9\5(\25\2\u00c9\u00dc\3\2\2\2\u00ca\u00cb\5(\25\2\u00cb\u00cc\7+"+
		"\2\2\u00cc\u00cd\5(\25\2\u00cd\u00dc\3\2\2\2\u00ce\u00cf\5(\25\2\u00cf"+
		"\u00d0\7*\2\2\u00d0\u00d1\5(\25\2\u00d1\u00dc\3\2\2\2\u00d2\u00d3\5(\25"+
		"\2\u00d3\u00d4\7,\2\2\u00d4\u00d5\5(\25\2\u00d5\u00dc\3\2\2\2\u00d6\u00d7"+
		"\5(\25\2\u00d7\u00d8\7-\2\2\u00d8\u00d9\5(\25\2\u00d9\u00dc\3\2\2\2\u00da"+
		"\u00dc\5\"\22\2\u00db\u00c1\3\2\2\2\u00db\u00c2\3\2\2\2\u00db\u00c6\3"+
		"\2\2\2\u00db\u00ca\3\2\2\2\u00db\u00ce\3\2\2\2\u00db\u00d2\3\2\2\2\u00db"+
		"\u00d6\3\2\2\2\u00db\u00da\3\2\2\2\u00dc\'\3\2\2\2\u00dd\u00de\b\25\1"+
		"\2\u00de\u00df\5*\26\2\u00df\u00f1\3\2\2\2\u00e0\u00e1\f\b\2\2\u00e1\u00e2"+
		"\7%\2\2\u00e2\u00f0\5(\25\t\u00e3\u00e4\f\7\2\2\u00e4\u00e5\7&\2\2\u00e5"+
		"\u00f0\5(\25\b\u00e6\u00e7\f\6\2\2\u00e7\u00e8\7\'\2\2\u00e8\u00f0\5("+
		"\25\7\u00e9\u00ea\f\5\2\2\u00ea\u00eb\7$\2\2\u00eb\u00f0\5(\25\6\u00ec"+
		"\u00ed\f\4\2\2\u00ed\u00ee\7\"\2\2\u00ee\u00f0\5(\25\5\u00ef\u00e0\3\2"+
		"\2\2\u00ef\u00e3\3\2\2\2\u00ef\u00e6\3\2\2\2\u00ef\u00e9\3\2\2\2\u00ef"+
		"\u00ec\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2"+
		"\2\2\u00f2)\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f8\7\24\2\2\u00f5\u00f8"+
		"\7\25\2\2\u00f6\u00f8\7\22\2\2\u00f7\u00f4\3\2\2\2\u00f7\u00f5\3\2\2\2"+
		"\u00f7\u00f6\3\2\2\2\u00f8+\3\2\2\2\22\61:?Eay}\u0082\u008c\u00a2\u00bb"+
		"\u00bf\u00db\u00ef\u00f1\u00f7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}