// Generated from Gramatica.g4 by ANTLR 4.5
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
		RETURN=8, MAIN=9, CHAR_TYPE=10, INT_TYPE=11, REAL_TYPE=12, STRING_TYPE=13, 
		BOOL_TYPE=14, VOID_TYPE=15, STRING_ID=16, CHAR_ID=17, ID=18, LETTER=19, 
		NUM=20, REAL=21, BOOL_ID=22, SEMICOLON=23, OPEN_KEY=24, CLOSE_KEY=25, 
		OPEN_PARENT=26, CLOSE_PARENT=27, OPEN_BRACKET=28, CLOSE_BRACKET=29, COMMA=30, 
		DOT=31, SIMPLE_Q_MARK=32, DOUBLE_Q_MARK=33, MATH_PLUS_OP=34, EQUALS=35, 
		MATH_LESS_OP=36, MATH_DIV_OP=37, MATH_MULT_OP=38, MATH_MOD_OP=39, BOOL_SMALLER_OP=40, 
		BOOL_BIGGER_OP=41, BOOL_BIGGER_EQUALS_OP=42, BOOL_SMALLER_EQUALS_OP=43, 
		BOOL_EQUALS_OP=44, BOOL_DIFFERENT_OP=45, BOOL_CALC_DIFF_OP=46, BOOL_CALC_OR_OP=47, 
		BOOL_CALC_AND_OP=48, SINGLELINE_COMMENT=49, WHITE_SPACE=50;
	public static final int
		RULE_prog = 0, RULE_start = 1, RULE_testeFuncao = 2, RULE_testes = 3, 
		RULE_println = 4, RULE_intDeclaracao = 5, RULE_intAtribuicao = 6, RULE_intDeclAtri = 7, 
		RULE_methodAtribs = 8, RULE_variavelDeclaracao = 9, RULE_variavelAtribuicaoDeclaracao = 10, 
		RULE_variavelAtribuicao = 11, RULE_type = 12, RULE_main = 13, RULE_functionDefinition = 14, 
		RULE_params = 15, RULE_comm = 16, RULE_retorno = 17, RULE_commands = 18, 
		RULE_while_stat = 19, RULE_if_stat = 20, RULE_for_stat = 21, RULE_funccall = 22, 
		RULE_args_func = 23, RULE_expression = 24, RULE_term = 25, RULE_value = 26;
	public static final String[] ruleNames = {
		"prog", "start", "testeFuncao", "testes", "println", "intDeclaracao", 
		"intAtribuicao", "intDeclAtri", "methodAtribs", "variavelDeclaracao", 
		"variavelAtribuicaoDeclaracao", "variavelAtribuicao", "type", "main", 
		"functionDefinition", "params", "comm", "retorno", "commands", "while_stat", 
		"if_stat", "for_stat", "funccall", "args_func", "expression", "term", 
		"value"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'println('", "'program'", "'function'", "'while'", "'if'", "'else'", 
		"'for'", "'return'", "'main'", "'char'", "'int'", "'real'", "'string'", 
		"'bool'", "'void'", null, null, null, null, null, null, null, "';'", "'{'", 
		"'}'", "'('", "')'", "'['", "']'", "','", "'.'", "'''", "'\"'", "'+'", 
		"'='", "'-'", "'/'", "'*'", "'%'", "'<'", "'>'", "'>='", "'<='", "'=='", 
		"'!='", "'!'", "'|'", "'&'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "PROGRAM", "FUNCTION_W", "WHILE_W", "IF_W", "ELSE_W", "FOR_W", 
		"RETURN", "MAIN", "CHAR_TYPE", "INT_TYPE", "REAL_TYPE", "STRING_TYPE", 
		"BOOL_TYPE", "VOID_TYPE", "STRING_ID", "CHAR_ID", "ID", "LETTER", "NUM", 
		"REAL", "BOOL_ID", "SEMICOLON", "OPEN_KEY", "CLOSE_KEY", "OPEN_PARENT", 
		"CLOSE_PARENT", "OPEN_BRACKET", "CLOSE_BRACKET", "COMMA", "DOT", "SIMPLE_Q_MARK", 
		"DOUBLE_Q_MARK", "MATH_PLUS_OP", "EQUALS", "MATH_LESS_OP", "MATH_DIV_OP", 
		"MATH_MULT_OP", "MATH_MOD_OP", "BOOL_SMALLER_OP", "BOOL_BIGGER_OP", "BOOL_BIGGER_EQUALS_OP", 
		"BOOL_SMALLER_EQUALS_OP", "BOOL_EQUALS_OP", "BOOL_DIFFERENT_OP", "BOOL_CALC_DIFF_OP", 
		"BOOL_CALC_OR_OP", "BOOL_CALC_AND_OP", "SINGLELINE_COMMENT", "WHITE_SPACE"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

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
	public static class ProgramaContext extends ProgContext {
		public Token programaRes;
		public Token nomePrograma;
		public StartContext ISTART;
		public TerminalNode PROGRAM() { return getToken(GramaticaParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public ProgramaContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TesteContext extends ProgContext {
		public List<TesteFuncaoContext> testeFuncao() {
			return getRuleContexts(TesteFuncaoContext.class);
		}
		public TesteFuncaoContext testeFuncao(int i) {
			return getRuleContext(TesteFuncaoContext.class,i);
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
			setState(62);
			switch (_input.LA(1)) {
			case T__0:
			case CHAR_TYPE:
			case INT_TYPE:
			case REAL_TYPE:
			case STRING_TYPE:
			case BOOL_TYPE:
			case VOID_TYPE:
			case ID:
				_localctx = new TesteContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(54);
					testeFuncao();
					}
					}
					setState(57); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << CHAR_TYPE) | (1L << INT_TYPE) | (1L << REAL_TYPE) | (1L << STRING_TYPE) | (1L << BOOL_TYPE) | (1L << VOID_TYPE) | (1L << ID))) != 0) );
				}
				break;
			case PROGRAM:
				_localctx = new ProgramaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				((ProgramaContext)_localctx).programaRes = match(PROGRAM);
				setState(60);
				((ProgramaContext)_localctx).nomePrograma = match(ID);
				setState(61);
				((ProgramaContext)_localctx).ISTART = start();
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
		public TerminalNode OPEN_KEY() { return getToken(GramaticaParser.OPEN_KEY, 0); }
		public TerminalNode CLOSE_KEY() { return getToken(GramaticaParser.CLOSE_KEY, 0); }
		public List<TesteFuncaoContext> testeFuncao() {
			return getRuleContexts(TesteFuncaoContext.class);
		}
		public TesteFuncaoContext testeFuncao(int i) {
			return getRuleContext(TesteFuncaoContext.class,i);
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
			setState(64);
			match(OPEN_KEY);
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65);
				testeFuncao();
				}
				}
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << CHAR_TYPE) | (1L << INT_TYPE) | (1L << REAL_TYPE) | (1L << STRING_TYPE) | (1L << BOOL_TYPE) | (1L << VOID_TYPE) | (1L << ID))) != 0) );
			setState(70);
			match(CLOSE_KEY);
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

	public static class TesteFuncaoContext extends ParserRuleContext {
		public TesteFuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testeFuncao; }
	 
		public TesteFuncaoContext() { }
		public void copyFrom(TesteFuncaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MainStatementContext extends TesteFuncaoContext {
		public TestesContext testes() {
			return getRuleContext(TestesContext.class,0);
		}
		public MainStatementContext(TesteFuncaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitMainStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ProgPartFunctionDefinitionContext extends TesteFuncaoContext {
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public ProgPartFunctionDefinitionContext(TesteFuncaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitProgPartFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TesteFuncaoContext testeFuncao() throws RecognitionException {
		TesteFuncaoContext _localctx = new TesteFuncaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_testeFuncao);
		try {
			setState(74);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new ProgPartFunctionDefinitionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				functionDefinition();
				}
				break;
			case 2:
				_localctx = new MainStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				testes();
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

	public static class TestesContext extends ParserRuleContext {
		public PrintlnContext println() {
			return getRuleContext(PrintlnContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GramaticaParser.SEMICOLON, 0); }
		public MethodAtribsContext methodAtribs() {
			return getRuleContext(MethodAtribsContext.class,0);
		}
		public TestesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testes; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitTestes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TestesContext testes() throws RecognitionException {
		TestesContext _localctx = new TestesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_testes);
		try {
			setState(80);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(76);
				println();
				setState(77);
				match(SEMICOLON);
				}
				}
				break;
			case CHAR_TYPE:
			case INT_TYPE:
			case REAL_TYPE:
			case STRING_TYPE:
			case BOOL_TYPE:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				methodAtribs();
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
		enterRule(_localctx, 8, RULE_println);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__0);
			setState(83);
			((PrintlnContext)_localctx).argumento = expression();
			setState(84);
			match(CLOSE_PARENT);
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

	public static class IntDeclaracaoContext extends ParserRuleContext {
		public IntDeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intDeclaracao; }
	 
		public IntDeclaracaoContext() { }
		public void copyFrom(IntDeclaracaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntDeclContext extends IntDeclaracaoContext {
		public Token nomeVariavel;
		public TerminalNode INT_TYPE() { return getToken(GramaticaParser.INT_TYPE, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public IntDeclContext(IntDeclaracaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitIntDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntDeclaracaoContext intDeclaracao() throws RecognitionException {
		IntDeclaracaoContext _localctx = new IntDeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_intDeclaracao);
		try {
			_localctx = new IntDeclContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(INT_TYPE);
			setState(87);
			((IntDeclContext)_localctx).nomeVariavel = match(ID);
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

	public static class IntAtribuicaoContext extends ParserRuleContext {
		public IntAtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intAtribuicao; }
	 
		public IntAtribuicaoContext() { }
		public void copyFrom(IntAtribuicaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntAtribContext extends IntAtribuicaoContext {
		public Token nomeVariavel;
		public Token opIgual;
		public TermContext expr;
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(GramaticaParser.EQUALS, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public IntAtribContext(IntAtribuicaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitIntAtrib(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntAtribuicaoContext intAtribuicao() throws RecognitionException {
		IntAtribuicaoContext _localctx = new IntAtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_intAtribuicao);
		try {
			_localctx = new IntAtribContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			((IntAtribContext)_localctx).nomeVariavel = match(ID);
			setState(90);
			((IntAtribContext)_localctx).opIgual = match(EQUALS);
			setState(91);
			((IntAtribContext)_localctx).expr = term(0);
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

	public static class IntDeclAtriContext extends ParserRuleContext {
		public IntDeclAtriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intDeclAtri; }
	 
		public IntDeclAtriContext() { }
		public void copyFrom(IntDeclAtriContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntDecAtrContext extends IntDeclAtriContext {
		public Token nomeVariavel;
		public Token opIgual;
		public TermContext expr;
		public TerminalNode INT_TYPE() { return getToken(GramaticaParser.INT_TYPE, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(GramaticaParser.EQUALS, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public IntDecAtrContext(IntDeclAtriContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitIntDecAtr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntDeclAtriContext intDeclAtri() throws RecognitionException {
		IntDeclAtriContext _localctx = new IntDeclAtriContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_intDeclAtri);
		try {
			_localctx = new IntDecAtrContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(INT_TYPE);
			setState(94);
			((IntDecAtrContext)_localctx).nomeVariavel = match(ID);
			setState(95);
			((IntDecAtrContext)_localctx).opIgual = match(EQUALS);
			setState(96);
			((IntDecAtrContext)_localctx).expr = term(0);
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
		public VariavelDeclaracaoContext variavelDeclaracao() {
			return getRuleContext(VariavelDeclaracaoContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GramaticaParser.SEMICOLON, 0); }
		public VariavelAtribuicaoDeclaracaoContext variavelAtribuicaoDeclaracao() {
			return getRuleContext(VariavelAtribuicaoDeclaracaoContext.class,0);
		}
		public VariavelAtribuicaoContext variavelAtribuicao() {
			return getRuleContext(VariavelAtribuicaoContext.class,0);
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
		enterRule(_localctx, 16, RULE_methodAtribs);
		try {
			setState(107);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				variavelDeclaracao();
				setState(99);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				variavelAtribuicaoDeclaracao();
				setState(102);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				variavelAtribuicao();
				setState(105);
				match(SEMICOLON);
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

	public static class VariavelDeclaracaoContext extends ParserRuleContext {
		public VariavelDeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavelDeclaracao; }
	 
		public VariavelDeclaracaoContext() { }
		public void copyFrom(VariavelDeclaracaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarDeclaracaoContext extends VariavelDeclaracaoContext {
		public TypeContext tipo;
		public Token nomeVariavel;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public VarDeclaracaoContext(VariavelDeclaracaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitVarDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariavelDeclaracaoContext variavelDeclaracao() throws RecognitionException {
		VariavelDeclaracaoContext _localctx = new VariavelDeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variavelDeclaracao);
		try {
			_localctx = new VarDeclaracaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			((VarDeclaracaoContext)_localctx).tipo = type();
			setState(110);
			((VarDeclaracaoContext)_localctx).nomeVariavel = match(ID);
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

	public static class VariavelAtribuicaoDeclaracaoContext extends ParserRuleContext {
		public VariavelAtribuicaoDeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavelAtribuicaoDeclaracao; }
	 
		public VariavelAtribuicaoDeclaracaoContext() { }
		public void copyFrom(VariavelAtribuicaoDeclaracaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarDeclAtribContext extends VariavelAtribuicaoDeclaracaoContext {
		public TypeContext tipo;
		public Token nomeVariavel;
		public Token opIgual;
		public TermContext expr;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(GramaticaParser.EQUALS, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public VarDeclAtribContext(VariavelAtribuicaoDeclaracaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitVarDeclAtrib(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariavelAtribuicaoDeclaracaoContext variavelAtribuicaoDeclaracao() throws RecognitionException {
		VariavelAtribuicaoDeclaracaoContext _localctx = new VariavelAtribuicaoDeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variavelAtribuicaoDeclaracao);
		try {
			_localctx = new VarDeclAtribContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			((VarDeclAtribContext)_localctx).tipo = type();
			setState(113);
			((VarDeclAtribContext)_localctx).nomeVariavel = match(ID);
			setState(114);
			((VarDeclAtribContext)_localctx).opIgual = match(EQUALS);
			setState(115);
			((VarDeclAtribContext)_localctx).expr = term(0);
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

	public static class VariavelAtribuicaoContext extends ParserRuleContext {
		public VariavelAtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavelAtribuicao; }
	 
		public VariavelAtribuicaoContext() { }
		public void copyFrom(VariavelAtribuicaoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarAtribuicaoContext extends VariavelAtribuicaoContext {
		public Token nomeVariavel;
		public Token opIgual;
		public ExpressionContext expr;
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(GramaticaParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarAtribuicaoContext(VariavelAtribuicaoContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitVarAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariavelAtribuicaoContext variavelAtribuicao() throws RecognitionException {
		VariavelAtribuicaoContext _localctx = new VariavelAtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variavelAtribuicao);
		try {
			_localctx = new VarAtribuicaoContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			((VarAtribuicaoContext)_localctx).nomeVariavel = match(ID);
			setState(118);
			((VarAtribuicaoContext)_localctx).opIgual = match(EQUALS);
			setState(119);
			((VarAtribuicaoContext)_localctx).expr = expression();
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
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringTypeContext extends TypeContext {
		public TerminalNode STRING_TYPE() { return getToken(GramaticaParser.STRING_TYPE, 0); }
		public StringTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitStringType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolTypeContext extends TypeContext {
		public TerminalNode BOOL_TYPE() { return getToken(GramaticaParser.BOOL_TYPE, 0); }
		public BoolTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitBoolType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharTypeContext extends TypeContext {
		public TerminalNode CHAR_TYPE() { return getToken(GramaticaParser.CHAR_TYPE, 0); }
		public CharTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitCharType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntTypeContext extends TypeContext {
		public TerminalNode INT_TYPE() { return getToken(GramaticaParser.INT_TYPE, 0); }
		public IntTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitIntType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RealTypeContext extends TypeContext {
		public TerminalNode REAL_TYPE() { return getToken(GramaticaParser.REAL_TYPE, 0); }
		public RealTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitRealType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_type);
		try {
			setState(126);
			switch (_input.LA(1)) {
			case CHAR_TYPE:
				_localctx = new CharTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(CHAR_TYPE);
				}
				break;
			case INT_TYPE:
				_localctx = new IntTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(INT_TYPE);
				}
				break;
			case REAL_TYPE:
				_localctx = new RealTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				match(REAL_TYPE);
				}
				break;
			case STRING_TYPE:
				_localctx = new StringTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(124);
				match(STRING_TYPE);
				}
				break;
			case BOOL_TYPE:
				_localctx = new BoolTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(125);
				match(BOOL_TYPE);
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

	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(GramaticaParser.MAIN, 0); }
		public TerminalNode OPEN_KEY() { return getToken(GramaticaParser.OPEN_KEY, 0); }
		public CommContext comm() {
			return getRuleContext(CommContext.class,0);
		}
		public TerminalNode CLOSE_KEY() { return getToken(GramaticaParser.CLOSE_KEY, 0); }
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
		enterRule(_localctx, 26, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(MAIN);
			setState(129);
			match(OPEN_KEY);
			setState(130);
			comm();
			setState(131);
			match(CLOSE_KEY);
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

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
	 
		public FunctionDefinitionContext() { }
		public void copyFrom(FunctionDefinitionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncaoComRetornoContext extends FunctionDefinitionContext {
		public TypeContext tipo;
		public Token nomeFuncReservado;
		public Token nomeFuncao;
		public ParamsContext parametros;
		public CommContext comandos;
		public RetornoContext valorRetorno;
		public TerminalNode OPEN_PARENT() { return getToken(GramaticaParser.OPEN_PARENT, 0); }
		public TerminalNode CLOSE_PARENT() { return getToken(GramaticaParser.CLOSE_PARENT, 0); }
		public TerminalNode OPEN_KEY() { return getToken(GramaticaParser.OPEN_KEY, 0); }
		public TerminalNode CLOSE_KEY() { return getToken(GramaticaParser.CLOSE_KEY, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode FUNCTION_W() { return getToken(GramaticaParser.FUNCTION_W, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public CommContext comm() {
			return getRuleContext(CommContext.class,0);
		}
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public FuncaoComRetornoContext(FunctionDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitFuncaoComRetorno(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncaoSemRetornoContext extends FunctionDefinitionContext {
		public Token tipo;
		public Token nomeFuncReservado;
		public Token nomeFuncao;
		public ParamsContext parametros;
		public CommContext comandos;
		public TerminalNode OPEN_PARENT() { return getToken(GramaticaParser.OPEN_PARENT, 0); }
		public TerminalNode CLOSE_PARENT() { return getToken(GramaticaParser.CLOSE_PARENT, 0); }
		public TerminalNode OPEN_KEY() { return getToken(GramaticaParser.OPEN_KEY, 0); }
		public TerminalNode CLOSE_KEY() { return getToken(GramaticaParser.CLOSE_KEY, 0); }
		public TerminalNode VOID_TYPE() { return getToken(GramaticaParser.VOID_TYPE, 0); }
		public TerminalNode FUNCTION_W() { return getToken(GramaticaParser.FUNCTION_W, 0); }
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public CommContext comm() {
			return getRuleContext(CommContext.class,0);
		}
		public FuncaoSemRetornoContext(FunctionDefinitionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitFuncaoSemRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functionDefinition);
		try {
			setState(154);
			switch (_input.LA(1)) {
			case CHAR_TYPE:
			case INT_TYPE:
			case REAL_TYPE:
			case STRING_TYPE:
			case BOOL_TYPE:
				_localctx = new FuncaoComRetornoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				((FuncaoComRetornoContext)_localctx).tipo = type();
				setState(134);
				((FuncaoComRetornoContext)_localctx).nomeFuncReservado = match(FUNCTION_W);
				setState(135);
				((FuncaoComRetornoContext)_localctx).nomeFuncao = match(ID);
				setState(136);
				match(OPEN_PARENT);
				setState(137);
				((FuncaoComRetornoContext)_localctx).parametros = params();
				setState(138);
				match(CLOSE_PARENT);
				setState(139);
				match(OPEN_KEY);
				setState(140);
				((FuncaoComRetornoContext)_localctx).comandos = comm();
				setState(141);
				((FuncaoComRetornoContext)_localctx).valorRetorno = retorno();
				setState(142);
				match(CLOSE_KEY);
				}
				break;
			case VOID_TYPE:
				_localctx = new FuncaoSemRetornoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				((FuncaoSemRetornoContext)_localctx).tipo = match(VOID_TYPE);
				setState(145);
				((FuncaoSemRetornoContext)_localctx).nomeFuncReservado = match(FUNCTION_W);
				setState(146);
				((FuncaoSemRetornoContext)_localctx).nomeFuncao = match(ID);
				setState(147);
				match(OPEN_PARENT);
				setState(148);
				((FuncaoSemRetornoContext)_localctx).parametros = params();
				setState(149);
				match(CLOSE_PARENT);
				setState(150);
				match(OPEN_KEY);
				setState(151);
				((FuncaoSemRetornoContext)_localctx).comandos = comm();
				setState(152);
				match(CLOSE_KEY);
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

	public static class ParamsContext extends ParserRuleContext {
		public VariavelDeclaracaoContext variavelDeclaracao;
		public List<VariavelDeclaracaoContext> varDec = new ArrayList<VariavelDeclaracaoContext>();
		public List<VariavelDeclaracaoContext> variavelDeclaracao() {
			return getRuleContexts(VariavelDeclaracaoContext.class);
		}
		public VariavelDeclaracaoContext variavelDeclaracao(int i) {
			return getRuleContext(VariavelDeclaracaoContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GramaticaParser.COMMA); }
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
		enterRule(_localctx, 30, RULE_params);
		int _la;
		try {
			setState(165);
			switch (_input.LA(1)) {
			case CHAR_TYPE:
			case INT_TYPE:
			case REAL_TYPE:
			case STRING_TYPE:
			case BOOL_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				((ParamsContext)_localctx).variavelDeclaracao = variavelDeclaracao();
				((ParamsContext)_localctx).varDec.add(((ParamsContext)_localctx).variavelDeclaracao);
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(157);
					match(COMMA);
					setState(158);
					((ParamsContext)_localctx).variavelDeclaracao = variavelDeclaracao();
					((ParamsContext)_localctx).varDec.add(((ParamsContext)_localctx).variavelDeclaracao);
					}
					}
					setState(163);
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
		public List<CommandsContext> commands() {
			return getRuleContexts(CommandsContext.class);
		}
		public CommandsContext commands(int i) {
			return getRuleContext(CommandsContext.class,i);
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
		enterRule(_localctx, 32, RULE_comm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << WHILE_W) | (1L << IF_W) | (1L << FOR_W) | (1L << CHAR_TYPE) | (1L << INT_TYPE) | (1L << REAL_TYPE) | (1L << STRING_TYPE) | (1L << BOOL_TYPE) | (1L << ID))) != 0)) {
				{
				{
				setState(167);
				commands();
				}
				}
				setState(172);
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

	public static class RetornoContext extends ParserRuleContext {
		public ExpressionContext valorRetorno;
		public TerminalNode RETURN() { return getToken(GramaticaParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(GramaticaParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitRetorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_retorno);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(RETURN);
			setState(174);
			((RetornoContext)_localctx).valorRetorno = expression();
			setState(175);
			match(SEMICOLON);
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
		public While_statContext while_stat() {
			return getRuleContext(While_statContext.class,0);
		}
		public MethodAtribsContext methodAtribs() {
			return getRuleContext(MethodAtribsContext.class,0);
		}
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public For_statContext for_stat() {
			return getRuleContext(For_statContext.class,0);
		}
		public FunccallContext funccall() {
			return getRuleContext(FunccallContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(GramaticaParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 36, RULE_commands);
		try {
			setState(184);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				while_stat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				methodAtribs();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				if_stat();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(180);
				for_stat();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(181);
				funccall();
				setState(182);
				match(SEMICOLON);
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
		public TerminalNode WHILE_W() { return getToken(GramaticaParser.WHILE_W, 0); }
		public TerminalNode OPEN_PARENT() { return getToken(GramaticaParser.OPEN_PARENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENT() { return getToken(GramaticaParser.CLOSE_PARENT, 0); }
		public TerminalNode OPEN_KEY() { return getToken(GramaticaParser.OPEN_KEY, 0); }
		public CommContext comm() {
			return getRuleContext(CommContext.class,0);
		}
		public TerminalNode CLOSE_KEY() { return getToken(GramaticaParser.CLOSE_KEY, 0); }
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
		enterRule(_localctx, 38, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(WHILE_W);
			setState(187);
			match(OPEN_PARENT);
			setState(188);
			expression();
			setState(189);
			match(CLOSE_PARENT);
			setState(190);
			match(OPEN_KEY);
			setState(191);
			comm();
			setState(192);
			match(CLOSE_KEY);
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
		public TerminalNode IF_W() { return getToken(GramaticaParser.IF_W, 0); }
		public TerminalNode OPEN_PARENT() { return getToken(GramaticaParser.OPEN_PARENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENT() { return getToken(GramaticaParser.CLOSE_PARENT, 0); }
		public List<TerminalNode> OPEN_KEY() { return getTokens(GramaticaParser.OPEN_KEY); }
		public TerminalNode OPEN_KEY(int i) {
			return getToken(GramaticaParser.OPEN_KEY, i);
		}
		public List<CommContext> comm() {
			return getRuleContexts(CommContext.class);
		}
		public CommContext comm(int i) {
			return getRuleContext(CommContext.class,i);
		}
		public List<TerminalNode> CLOSE_KEY() { return getTokens(GramaticaParser.CLOSE_KEY); }
		public TerminalNode CLOSE_KEY(int i) {
			return getToken(GramaticaParser.CLOSE_KEY, i);
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
		enterRule(_localctx, 40, RULE_if_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(IF_W);
			setState(195);
			match(OPEN_PARENT);
			setState(196);
			expression();
			setState(197);
			match(CLOSE_PARENT);
			setState(198);
			match(OPEN_KEY);
			setState(199);
			comm();
			setState(200);
			match(CLOSE_KEY);
			setState(206);
			_la = _input.LA(1);
			if (_la==ELSE_W) {
				{
				setState(201);
				match(ELSE_W);
				setState(202);
				match(OPEN_KEY);
				setState(203);
				comm();
				setState(204);
				match(CLOSE_KEY);
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
		public TerminalNode OPEN_PARENT() { return getToken(GramaticaParser.OPEN_PARENT, 0); }
		public TerminalNode INT_TYPE() { return getToken(GramaticaParser.INT_TYPE, 0); }
		public List<VariavelAtribuicaoContext> variavelAtribuicao() {
			return getRuleContexts(VariavelAtribuicaoContext.class);
		}
		public VariavelAtribuicaoContext variavelAtribuicao(int i) {
			return getRuleContext(VariavelAtribuicaoContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(GramaticaParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(GramaticaParser.SEMICOLON, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PARENT() { return getToken(GramaticaParser.CLOSE_PARENT, 0); }
		public TerminalNode OPEN_KEY() { return getToken(GramaticaParser.OPEN_KEY, 0); }
		public CommContext comm() {
			return getRuleContext(CommContext.class,0);
		}
		public TerminalNode CLOSE_KEY() { return getToken(GramaticaParser.CLOSE_KEY, 0); }
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
		enterRule(_localctx, 42, RULE_for_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(FOR_W);
			setState(209);
			match(OPEN_PARENT);
			setState(210);
			match(INT_TYPE);
			setState(211);
			variavelAtribuicao();
			setState(212);
			match(SEMICOLON);
			setState(213);
			expression();
			setState(214);
			match(SEMICOLON);
			setState(215);
			variavelAtribuicao();
			setState(216);
			match(CLOSE_PARENT);
			setState(217);
			match(OPEN_KEY);
			setState(218);
			comm();
			setState(219);
			match(CLOSE_KEY);
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
		public TerminalNode OPEN_PARENT() { return getToken(GramaticaParser.OPEN_PARENT, 0); }
		public TerminalNode CLOSE_PARENT() { return getToken(GramaticaParser.CLOSE_PARENT, 0); }
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
		enterRule(_localctx, 44, RULE_funccall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			((FunccallContext)_localctx).nomeFuncao = match(ID);
			setState(222);
			match(OPEN_PARENT);
			setState(223);
			((FunccallContext)_localctx).args = args_func();
			setState(224);
			match(CLOSE_PARENT);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(GramaticaParser.COMMA); }
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
		enterRule(_localctx, 46, RULE_args_func);
		int _la;
		try {
			setState(235);
			switch (_input.LA(1)) {
			case ID:
			case NUM:
			case REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				((Args_funcContext)_localctx).expression = expression();
				((Args_funcContext)_localctx).exp.add(((Args_funcContext)_localctx).expression);
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(227);
					match(COMMA);
					setState(228);
					((Args_funcContext)_localctx).expression = expression();
					((Args_funcContext)_localctx).exp.add(((Args_funcContext)_localctx).expression);
					}
					}
					setState(233);
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
		public Token operacao;
		public TermContext dir;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode BOOL_SMALLER_OP() { return getToken(GramaticaParser.BOOL_SMALLER_OP, 0); }
		public MenorContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitMenor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MaiorContext extends ExpressionContext {
		public TermContext esq;
		public Token operacao;
		public TermContext dir;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode BOOL_BIGGER_OP() { return getToken(GramaticaParser.BOOL_BIGGER_OP, 0); }
		public MaiorContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitMaior(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DiferenteContext extends ExpressionContext {
		public TermContext esq;
		public Token operacao;
		public TermContext dir;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode BOOL_DIFFERENT_OP() { return getToken(GramaticaParser.BOOL_DIFFERENT_OP, 0); }
		public DiferenteContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDiferente(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IgualContext extends ExpressionContext {
		public TermContext esq;
		public Token operacao;
		public TermContext dir;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode BOOL_EQUALS_OP() { return getToken(GramaticaParser.BOOL_EQUALS_OP, 0); }
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
	public static class MaiorIgualContext extends ExpressionContext {
		public TermContext esq;
		public Token operacao;
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
		public Token operacao;
		public TermContext dir;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode BOOL_SMALLER_EQUALS_OP() { return getToken(GramaticaParser.BOOL_SMALLER_EQUALS_OP, 0); }
		public MenorIgualContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitMenorIgual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expression);
		try {
			setState(262);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new OpMatematicaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				term(0);
				}
				break;
			case 2:
				_localctx = new MenorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				((MenorContext)_localctx).esq = term(0);
				setState(239);
				((MenorContext)_localctx).operacao = match(BOOL_SMALLER_OP);
				setState(240);
				((MenorContext)_localctx).dir = term(0);
				}
				break;
			case 3:
				_localctx = new MaiorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				((MaiorContext)_localctx).esq = term(0);
				setState(243);
				((MaiorContext)_localctx).operacao = match(BOOL_BIGGER_OP);
				setState(244);
				((MaiorContext)_localctx).dir = term(0);
				}
				break;
			case 4:
				_localctx = new MenorIgualContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(246);
				((MenorIgualContext)_localctx).esq = term(0);
				setState(247);
				((MenorIgualContext)_localctx).operacao = match(BOOL_SMALLER_EQUALS_OP);
				setState(248);
				((MenorIgualContext)_localctx).dir = term(0);
				}
				break;
			case 5:
				_localctx = new MaiorIgualContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(250);
				((MaiorIgualContext)_localctx).esq = term(0);
				setState(251);
				((MaiorIgualContext)_localctx).operacao = match(BOOL_BIGGER_EQUALS_OP);
				setState(252);
				((MaiorIgualContext)_localctx).dir = term(0);
				}
				break;
			case 6:
				_localctx = new IgualContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(254);
				((IgualContext)_localctx).esq = term(0);
				setState(255);
				((IgualContext)_localctx).operacao = match(BOOL_EQUALS_OP);
				setState(256);
				((IgualContext)_localctx).dir = term(0);
				}
				break;
			case 7:
				_localctx = new DiferenteContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(258);
				((DiferenteContext)_localctx).esq = term(0);
				setState(259);
				((DiferenteContext)_localctx).operacao = match(BOOL_DIFFERENT_OP);
				setState(260);
				((DiferenteContext)_localctx).dir = term(0);
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
		public Token operacao;
		public TermContext dir;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode MATH_DIV_OP() { return getToken(GramaticaParser.MATH_DIV_OP, 0); }
		public DivisaoContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitDivisao(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MenosContext extends TermContext {
		public TermContext esq;
		public Token operacao;
		public TermContext dir;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode MATH_LESS_OP() { return getToken(GramaticaParser.MATH_LESS_OP, 0); }
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
		public Token operacao;
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
		public Token operacao;
		public TermContext dir;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode MATH_MOD_OP() { return getToken(GramaticaParser.MATH_MOD_OP, 0); }
		public ModuloContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitModulo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicacaoContext extends TermContext {
		public TermContext esq;
		public Token operacao;
		public TermContext dir;
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode MATH_MULT_OP() { return getToken(GramaticaParser.MATH_MULT_OP, 0); }
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
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ValorContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(265);
			value();
			}
			_ctx.stop = _input.LT(-1);
			setState(284);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(282);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new DivisaoContext(new TermContext(_parentctx, _parentState));
						((DivisaoContext)_localctx).esq = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(267);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(268);
						((DivisaoContext)_localctx).operacao = match(MATH_DIV_OP);
						setState(269);
						((DivisaoContext)_localctx).dir = term(7);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicacaoContext(new TermContext(_parentctx, _parentState));
						((MultiplicacaoContext)_localctx).esq = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(270);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(271);
						((MultiplicacaoContext)_localctx).operacao = match(MATH_MULT_OP);
						setState(272);
						((MultiplicacaoContext)_localctx).dir = term(6);
						}
						break;
					case 3:
						{
						_localctx = new ModuloContext(new TermContext(_parentctx, _parentState));
						((ModuloContext)_localctx).esq = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(273);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(274);
						((ModuloContext)_localctx).operacao = match(MATH_MOD_OP);
						setState(275);
						((ModuloContext)_localctx).dir = term(5);
						}
						break;
					case 4:
						{
						_localctx = new MenosContext(new TermContext(_parentctx, _parentState));
						((MenosContext)_localctx).esq = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(276);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(277);
						((MenosContext)_localctx).operacao = match(MATH_LESS_OP);
						setState(278);
						((MenosContext)_localctx).dir = term(4);
						}
						break;
					case 5:
						{
						_localctx = new MaisContext(new TermContext(_parentctx, _parentState));
						((MaisContext)_localctx).esq = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_term);
						setState(279);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(280);
						((MaisContext)_localctx).operacao = match(MATH_PLUS_OP);
						setState(281);
						((MaisContext)_localctx).dir = term(3);
						}
						break;
					}
					} 
				}
				setState(286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
	public static class VariavelContext extends ValueContext {
		public Token nomeVariavel;
		public TerminalNode ID() { return getToken(GramaticaParser.ID, 0); }
		public VariavelContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitVariavel(this);
			else return visitor.visitChildren(this);
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
	public static class FuncCallExpressionContext extends ValueContext {
		public FunccallContext funccall() {
			return getRuleContext(FunccallContext.class,0);
		}
		public FuncCallExpressionContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GramaticaVisitor ) return ((GramaticaVisitor<? extends T>)visitor).visitFuncCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_value);
		try {
			setState(291);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new NumeroInteiroContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				((NumeroInteiroContext)_localctx).numero = match(NUM);
				}
				break;
			case 2:
				_localctx = new NumeroRealContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				((NumeroRealContext)_localctx).numero = match(REAL);
				}
				break;
			case 3:
				_localctx = new VariavelContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(289);
				((VariavelContext)_localctx).nomeVariavel = match(ID);
				}
				break;
			case 4:
				_localctx = new FuncCallExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(290);
				funccall();
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
		case 25:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\64\u0128\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\6\2:\n\2\r\2\16\2;\3\2\3\2\3\2\5\2"+
		"A\n\2\3\3\3\3\6\3E\n\3\r\3\16\3F\3\3\3\3\3\4\3\4\5\4M\n\4\3\5\3\5\3\5"+
		"\3\5\5\5S\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nn\n\n\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\5\16\u0081"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u009d\n\20\3\21\3\21\3\21\7\21\u00a2\n\21\f\21\16\21\u00a5\13\21\3\21"+
		"\5\21\u00a8\n\21\3\22\7\22\u00ab\n\22\f\22\16\22\u00ae\13\22\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00bb\n\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u00d1\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\7\31\u00e8\n\31\f\31\16\31\u00eb\13\31\3\31\5\31\u00ee\n\31\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0109\n\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\7\33\u011d\n\33\f\33\16\33\u0120\13\33\3\34\3\34\3\34\3\34"+
		"\5\34\u0126\n\34\3\34\2\3\64\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\66\2\2\u0130\2@\3\2\2\2\4B\3\2\2\2\6L\3\2\2\2\bR\3"+
		"\2\2\2\nT\3\2\2\2\fX\3\2\2\2\16[\3\2\2\2\20_\3\2\2\2\22m\3\2\2\2\24o\3"+
		"\2\2\2\26r\3\2\2\2\30w\3\2\2\2\32\u0080\3\2\2\2\34\u0082\3\2\2\2\36\u009c"+
		"\3\2\2\2 \u00a7\3\2\2\2\"\u00ac\3\2\2\2$\u00af\3\2\2\2&\u00ba\3\2\2\2"+
		"(\u00bc\3\2\2\2*\u00c4\3\2\2\2,\u00d2\3\2\2\2.\u00df\3\2\2\2\60\u00ed"+
		"\3\2\2\2\62\u0108\3\2\2\2\64\u010a\3\2\2\2\66\u0125\3\2\2\28:\5\6\4\2"+
		"98\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<A\3\2\2\2=>\7\4\2\2>?\7\24\2"+
		"\2?A\5\4\3\2@9\3\2\2\2@=\3\2\2\2A\3\3\2\2\2BD\7\32\2\2CE\5\6\4\2DC\3\2"+
		"\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\7\33\2\2I\5\3\2\2\2JM\5"+
		"\36\20\2KM\5\b\5\2LJ\3\2\2\2LK\3\2\2\2M\7\3\2\2\2NO\5\n\6\2OP\7\31\2\2"+
		"PS\3\2\2\2QS\5\22\n\2RN\3\2\2\2RQ\3\2\2\2S\t\3\2\2\2TU\7\3\2\2UV\5\62"+
		"\32\2VW\7\35\2\2W\13\3\2\2\2XY\7\r\2\2YZ\7\24\2\2Z\r\3\2\2\2[\\\7\24\2"+
		"\2\\]\7%\2\2]^\5\64\33\2^\17\3\2\2\2_`\7\r\2\2`a\7\24\2\2ab\7%\2\2bc\5"+
		"\64\33\2c\21\3\2\2\2de\5\24\13\2ef\7\31\2\2fn\3\2\2\2gh\5\26\f\2hi\7\31"+
		"\2\2in\3\2\2\2jk\5\30\r\2kl\7\31\2\2ln\3\2\2\2md\3\2\2\2mg\3\2\2\2mj\3"+
		"\2\2\2n\23\3\2\2\2op\5\32\16\2pq\7\24\2\2q\25\3\2\2\2rs\5\32\16\2st\7"+
		"\24\2\2tu\7%\2\2uv\5\64\33\2v\27\3\2\2\2wx\7\24\2\2xy\7%\2\2yz\5\62\32"+
		"\2z\31\3\2\2\2{\u0081\7\f\2\2|\u0081\7\r\2\2}\u0081\7\16\2\2~\u0081\7"+
		"\17\2\2\177\u0081\7\20\2\2\u0080{\3\2\2\2\u0080|\3\2\2\2\u0080}\3\2\2"+
		"\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\33\3\2\2\2\u0082\u0083\7\13"+
		"\2\2\u0083\u0084\7\32\2\2\u0084\u0085\5\"\22\2\u0085\u0086\7\33\2\2\u0086"+
		"\35\3\2\2\2\u0087\u0088\5\32\16\2\u0088\u0089\7\5\2\2\u0089\u008a\7\24"+
		"\2\2\u008a\u008b\7\34\2\2\u008b\u008c\5 \21\2\u008c\u008d\7\35\2\2\u008d"+
		"\u008e\7\32\2\2\u008e\u008f\5\"\22\2\u008f\u0090\5$\23\2\u0090\u0091\7"+
		"\33\2\2\u0091\u009d\3\2\2\2\u0092\u0093\7\21\2\2\u0093\u0094\7\5\2\2\u0094"+
		"\u0095\7\24\2\2\u0095\u0096\7\34\2\2\u0096\u0097\5 \21\2\u0097\u0098\7"+
		"\35\2\2\u0098\u0099\7\32\2\2\u0099\u009a\5\"\22\2\u009a\u009b\7\33\2\2"+
		"\u009b\u009d\3\2\2\2\u009c\u0087\3\2\2\2\u009c\u0092\3\2\2\2\u009d\37"+
		"\3\2\2\2\u009e\u00a3\5\24\13\2\u009f\u00a0\7 \2\2\u00a0\u00a2\5\24\13"+
		"\2\u00a1\u009f\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4"+
		"\3\2\2\2\u00a4\u00a8\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7"+
		"\u009e\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8!\3\2\2\2\u00a9\u00ab\5&\24\2"+
		"\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad"+
		"\3\2\2\2\u00ad#\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7\n\2\2\u00b0"+
		"\u00b1\5\62\32\2\u00b1\u00b2\7\31\2\2\u00b2%\3\2\2\2\u00b3\u00bb\5(\25"+
		"\2\u00b4\u00bb\5\22\n\2\u00b5\u00bb\5*\26\2\u00b6\u00bb\5,\27\2\u00b7"+
		"\u00b8\5.\30\2\u00b8\u00b9\7\31\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b3\3"+
		"\2\2\2\u00ba\u00b4\3\2\2\2\u00ba\u00b5\3\2\2\2\u00ba\u00b6\3\2\2\2\u00ba"+
		"\u00b7\3\2\2\2\u00bb\'\3\2\2\2\u00bc\u00bd\7\6\2\2\u00bd\u00be\7\34\2"+
		"\2\u00be\u00bf\5\62\32\2\u00bf\u00c0\7\35\2\2\u00c0\u00c1\7\32\2\2\u00c1"+
		"\u00c2\5\"\22\2\u00c2\u00c3\7\33\2\2\u00c3)\3\2\2\2\u00c4\u00c5\7\7\2"+
		"\2\u00c5\u00c6\7\34\2\2\u00c6\u00c7\5\62\32\2\u00c7\u00c8\7\35\2\2\u00c8"+
		"\u00c9\7\32\2\2\u00c9\u00ca\5\"\22\2\u00ca\u00d0\7\33\2\2\u00cb\u00cc"+
		"\7\b\2\2\u00cc\u00cd\7\32\2\2\u00cd\u00ce\5\"\22\2\u00ce\u00cf\7\33\2"+
		"\2\u00cf\u00d1\3\2\2\2\u00d0\u00cb\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1+"+
		"\3\2\2\2\u00d2\u00d3\7\t\2\2\u00d3\u00d4\7\34\2\2\u00d4\u00d5\7\r\2\2"+
		"\u00d5\u00d6\5\30\r\2\u00d6\u00d7\7\31\2\2\u00d7\u00d8\5\62\32\2\u00d8"+
		"\u00d9\7\31\2\2\u00d9\u00da\5\30\r\2\u00da\u00db\7\35\2\2\u00db\u00dc"+
		"\7\32\2\2\u00dc\u00dd\5\"\22\2\u00dd\u00de\7\33\2\2\u00de-\3\2\2\2\u00df"+
		"\u00e0\7\24\2\2\u00e0\u00e1\7\34\2\2\u00e1\u00e2\5\60\31\2\u00e2\u00e3"+
		"\7\35\2\2\u00e3/\3\2\2\2\u00e4\u00e9\5\62\32\2\u00e5\u00e6\7 \2\2\u00e6"+
		"\u00e8\5\62\32\2\u00e7\u00e5\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3"+
		"\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ee\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec"+
		"\u00ee\3\2\2\2\u00ed\u00e4\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee\61\3\2\2"+
		"\2\u00ef\u0109\5\64\33\2\u00f0\u00f1\5\64\33\2\u00f1\u00f2\7*\2\2\u00f2"+
		"\u00f3\5\64\33\2\u00f3\u0109\3\2\2\2\u00f4\u00f5\5\64\33\2\u00f5\u00f6"+
		"\7+\2\2\u00f6\u00f7\5\64\33\2\u00f7\u0109\3\2\2\2\u00f8\u00f9\5\64\33"+
		"\2\u00f9\u00fa\7-\2\2\u00fa\u00fb\5\64\33\2\u00fb\u0109\3\2\2\2\u00fc"+
		"\u00fd\5\64\33\2\u00fd\u00fe\7,\2\2\u00fe\u00ff\5\64\33\2\u00ff\u0109"+
		"\3\2\2\2\u0100\u0101\5\64\33\2\u0101\u0102\7.\2\2\u0102\u0103\5\64\33"+
		"\2\u0103\u0109\3\2\2\2\u0104\u0105\5\64\33\2\u0105\u0106\7/\2\2\u0106"+
		"\u0107\5\64\33\2\u0107\u0109\3\2\2\2\u0108\u00ef\3\2\2\2\u0108\u00f0\3"+
		"\2\2\2\u0108\u00f4\3\2\2\2\u0108\u00f8\3\2\2\2\u0108\u00fc\3\2\2\2\u0108"+
		"\u0100\3\2\2\2\u0108\u0104\3\2\2\2\u0109\63\3\2\2\2\u010a\u010b\b\33\1"+
		"\2\u010b\u010c\5\66\34\2\u010c\u011e\3\2\2\2\u010d\u010e\f\b\2\2\u010e"+
		"\u010f\7\'\2\2\u010f\u011d\5\64\33\t\u0110\u0111\f\7\2\2\u0111\u0112\7"+
		"(\2\2\u0112\u011d\5\64\33\b\u0113\u0114\f\6\2\2\u0114\u0115\7)\2\2\u0115"+
		"\u011d\5\64\33\7\u0116\u0117\f\5\2\2\u0117\u0118\7&\2\2\u0118\u011d\5"+
		"\64\33\6\u0119\u011a\f\4\2\2\u011a\u011b\7$\2\2\u011b\u011d\5\64\33\5"+
		"\u011c\u010d\3\2\2\2\u011c\u0110\3\2\2\2\u011c\u0113\3\2\2\2\u011c\u0116"+
		"\3\2\2\2\u011c\u0119\3\2\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e"+
		"\u011f\3\2\2\2\u011f\65\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0126\7\26\2"+
		"\2\u0122\u0126\7\27\2\2\u0123\u0126\7\24\2\2\u0124\u0126\5.\30\2\u0125"+
		"\u0121\3\2\2\2\u0125\u0122\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0124\3\2"+
		"\2\2\u0126\67\3\2\2\2\25;@FLRm\u0080\u009c\u00a3\u00a7\u00ac\u00ba\u00d0"+
		"\u00e9\u00ed\u0108\u011c\u011e\u0125";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}