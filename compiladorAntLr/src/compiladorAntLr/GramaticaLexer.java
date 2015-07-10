// Generated from Gramatica.g4 by ANTLR 4.5
package compiladorAntLr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "PROGRAM", "FUNCTION_W", "WHILE_W", "IF_W", "ELSE_W", "FOR_W", 
		"RETURN", "MAIN", "CHAR_TYPE", "INT_TYPE", "REAL_TYPE", "STRING_TYPE", 
		"BOOL_TYPE", "VOID_TYPE", "STRING_ID", "CHAR_ID", "ID", "LETTER", "NUM", 
		"REAL", "BOOL_ID", "SEMICOLON", "OPEN_KEY", "CLOSE_KEY", "OPEN_PARENT", 
		"CLOSE_PARENT", "OPEN_BRACKET", "CLOSE_BRACKET", "COMMA", "DOT", "SIMPLE_Q_MARK", 
		"DOUBLE_Q_MARK", "MATH_PLUS_OP", "EQUALS", "MATH_LESS_OP", "MATH_DIV_OP", 
		"MATH_MULT_OP", "MATH_MOD_OP", "BOOL_SMALLER_OP", "BOOL_BIGGER_OP", "BOOL_BIGGER_EQUALS_OP", 
		"BOOL_SMALLER_EQUALS_OP", "BOOL_EQUALS_OP", "BOOL_DIFFERENT_OP", "BOOL_CALC_DIFF_OP", 
		"BOOL_CALC_OR_OP", "BOOL_CALC_AND_OP", "SINGLELINE_COMMENT", "WHITE_SPACE"
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


	public GramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\64\u013b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\20\3\21\3\21\7\21\u00c1\n\21\f\21\16\21\u00c4\13\21\3"+
		"\21\3\21\3\22\3\22\5\22\u00ca\n\22\3\22\3\22\3\23\5\23\u00cf\n\23\3\23"+
		"\6\23\u00d2\n\23\r\23\16\23\u00d3\3\24\3\24\3\24\7\24\u00d9\n\24\f\24"+
		"\16\24\u00dc\13\24\3\25\6\25\u00df\n\25\r\25\16\25\u00e0\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00f0\n\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)"+
		"\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3"+
		"\62\3\62\3\62\3\62\7\62\u012e\n\62\f\62\16\62\u0131\13\62\3\62\3\62\3"+
		"\63\6\63\u0136\n\63\r\63\16\63\u0137\3\63\3\63\2\2\64\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64\3\2\6\4\2C\\c|\3\2\62;\4\2\f\f"+
		"\17\17\5\2\13\f\17\17\"\"\u0144\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2"+
		"\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\3g\3\2\2\2"+
		"\5p\3\2\2\2\7x\3\2\2\2\t\u0081\3\2\2\2\13\u0087\3\2\2\2\r\u008a\3\2\2"+
		"\2\17\u008f\3\2\2\2\21\u0093\3\2\2\2\23\u009a\3\2\2\2\25\u009f\3\2\2\2"+
		"\27\u00a4\3\2\2\2\31\u00a8\3\2\2\2\33\u00ad\3\2\2\2\35\u00b4\3\2\2\2\37"+
		"\u00b9\3\2\2\2!\u00be\3\2\2\2#\u00c7\3\2\2\2%\u00ce\3\2\2\2\'\u00d5\3"+
		"\2\2\2)\u00de\3\2\2\2+\u00e2\3\2\2\2-\u00ef\3\2\2\2/\u00f1\3\2\2\2\61"+
		"\u00f3\3\2\2\2\63\u00f5\3\2\2\2\65\u00f7\3\2\2\2\67\u00f9\3\2\2\29\u00fb"+
		"\3\2\2\2;\u00fd\3\2\2\2=\u00ff\3\2\2\2?\u0101\3\2\2\2A\u0103\3\2\2\2C"+
		"\u0105\3\2\2\2E\u0107\3\2\2\2G\u0109\3\2\2\2I\u010b\3\2\2\2K\u010d\3\2"+
		"\2\2M\u010f\3\2\2\2O\u0111\3\2\2\2Q\u0113\3\2\2\2S\u0115\3\2\2\2U\u0117"+
		"\3\2\2\2W\u011a\3\2\2\2Y\u011d\3\2\2\2[\u0120\3\2\2\2]\u0123\3\2\2\2_"+
		"\u0125\3\2\2\2a\u0127\3\2\2\2c\u0129\3\2\2\2e\u0135\3\2\2\2gh\7r\2\2h"+
		"i\7t\2\2ij\7k\2\2jk\7p\2\2kl\7v\2\2lm\7n\2\2mn\7p\2\2no\7*\2\2o\4\3\2"+
		"\2\2pq\7r\2\2qr\7t\2\2rs\7q\2\2st\7i\2\2tu\7t\2\2uv\7c\2\2vw\7o\2\2w\6"+
		"\3\2\2\2xy\7h\2\2yz\7w\2\2z{\7p\2\2{|\7e\2\2|}\7v\2\2}~\7k\2\2~\177\7"+
		"q\2\2\177\u0080\7p\2\2\u0080\b\3\2\2\2\u0081\u0082\7y\2\2\u0082\u0083"+
		"\7j\2\2\u0083\u0084\7k\2\2\u0084\u0085\7n\2\2\u0085\u0086\7g\2\2\u0086"+
		"\n\3\2\2\2\u0087\u0088\7k\2\2\u0088\u0089\7h\2\2\u0089\f\3\2\2\2\u008a"+
		"\u008b\7g\2\2\u008b\u008c\7n\2\2\u008c\u008d\7u\2\2\u008d\u008e\7g\2\2"+
		"\u008e\16\3\2\2\2\u008f\u0090\7h\2\2\u0090\u0091\7q\2\2\u0091\u0092\7"+
		"t\2\2\u0092\20\3\2\2\2\u0093\u0094\7t\2\2\u0094\u0095\7g\2\2\u0095\u0096"+
		"\7v\2\2\u0096\u0097\7w\2\2\u0097\u0098\7t\2\2\u0098\u0099\7p\2\2\u0099"+
		"\22\3\2\2\2\u009a\u009b\7o\2\2\u009b\u009c\7c\2\2\u009c\u009d\7k\2\2\u009d"+
		"\u009e\7p\2\2\u009e\24\3\2\2\2\u009f\u00a0\7e\2\2\u00a0\u00a1\7j\2\2\u00a1"+
		"\u00a2\7c\2\2\u00a2\u00a3\7t\2\2\u00a3\26\3\2\2\2\u00a4\u00a5\7k\2\2\u00a5"+
		"\u00a6\7p\2\2\u00a6\u00a7\7v\2\2\u00a7\30\3\2\2\2\u00a8\u00a9\7t\2\2\u00a9"+
		"\u00aa\7g\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7n\2\2\u00ac\32\3\2\2\2\u00ad"+
		"\u00ae\7u\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7t\2\2\u00b0\u00b1\7k\2\2"+
		"\u00b1\u00b2\7p\2\2\u00b2\u00b3\7i\2\2\u00b3\34\3\2\2\2\u00b4\u00b5\7"+
		"d\2\2\u00b5\u00b6\7q\2\2\u00b6\u00b7\7q\2\2\u00b7\u00b8\7n\2\2\u00b8\36"+
		"\3\2\2\2\u00b9\u00ba\7x\2\2\u00ba\u00bb\7q\2\2\u00bb\u00bc\7k\2\2\u00bc"+
		"\u00bd\7f\2\2\u00bd \3\2\2\2\u00be\u00c2\5C\"\2\u00bf\u00c1\5\'\24\2\u00c0"+
		"\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\5C\"\2\u00c6"+
		"\"\3\2\2\2\u00c7\u00c9\5A!\2\u00c8\u00ca\5\'\24\2\u00c9\u00c8\3\2\2\2"+
		"\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\5A!\2\u00cc$\3\2"+
		"\2\2\u00cd\u00cf\7a\2\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00d1\3\2\2\2\u00d0\u00d2\5\'\24\2\u00d1\u00d0\3\2\2\2\u00d2\u00d3\3"+
		"\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4&\3\2\2\2\u00d5\u00da"+
		"\t\2\2\2\u00d6\u00d9\t\2\2\2\u00d7\u00d9\5)\25\2\u00d8\u00d6\3\2\2\2\u00d8"+
		"\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2"+
		"\2\2\u00db(\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00df\t\3\2\2\u00de\u00dd"+
		"\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"*\3\2\2\2\u00e2\u00e3\5)\25\2\u00e3\u00e4\5? \2\u00e4\u00e5\5)\25\2\u00e5"+
		",\3\2\2\2\u00e6\u00e7\7v\2\2\u00e7\u00e8\7t\2\2\u00e8\u00e9\7w\2\2\u00e9"+
		"\u00f0\7g\2\2\u00ea\u00eb\7h\2\2\u00eb\u00ec\7c\2\2\u00ec\u00ed\7n\2\2"+
		"\u00ed\u00ee\7u\2\2\u00ee\u00f0\7g\2\2\u00ef\u00e6\3\2\2\2\u00ef\u00ea"+
		"\3\2\2\2\u00f0.\3\2\2\2\u00f1\u00f2\7=\2\2\u00f2\60\3\2\2\2\u00f3\u00f4"+
		"\7}\2\2\u00f4\62\3\2\2\2\u00f5\u00f6\7\177\2\2\u00f6\64\3\2\2\2\u00f7"+
		"\u00f8\7*\2\2\u00f8\66\3\2\2\2\u00f9\u00fa\7+\2\2\u00fa8\3\2\2\2\u00fb"+
		"\u00fc\7]\2\2\u00fc:\3\2\2\2\u00fd\u00fe\7_\2\2\u00fe<\3\2\2\2\u00ff\u0100"+
		"\7.\2\2\u0100>\3\2\2\2\u0101\u0102\7\60\2\2\u0102@\3\2\2\2\u0103\u0104"+
		"\7)\2\2\u0104B\3\2\2\2\u0105\u0106\7$\2\2\u0106D\3\2\2\2\u0107\u0108\7"+
		"-\2\2\u0108F\3\2\2\2\u0109\u010a\7?\2\2\u010aH\3\2\2\2\u010b\u010c\7/"+
		"\2\2\u010cJ\3\2\2\2\u010d\u010e\7\61\2\2\u010eL\3\2\2\2\u010f\u0110\7"+
		",\2\2\u0110N\3\2\2\2\u0111\u0112\7\'\2\2\u0112P\3\2\2\2\u0113\u0114\7"+
		">\2\2\u0114R\3\2\2\2\u0115\u0116\7@\2\2\u0116T\3\2\2\2\u0117\u0118\7@"+
		"\2\2\u0118\u0119\7?\2\2\u0119V\3\2\2\2\u011a\u011b\7>\2\2\u011b\u011c"+
		"\7?\2\2\u011cX\3\2\2\2\u011d\u011e\7?\2\2\u011e\u011f\7?\2\2\u011fZ\3"+
		"\2\2\2\u0120\u0121\7#\2\2\u0121\u0122\7?\2\2\u0122\\\3\2\2\2\u0123\u0124"+
		"\7#\2\2\u0124^\3\2\2\2\u0125\u0126\7~\2\2\u0126`\3\2\2\2\u0127\u0128\7"+
		"(\2\2\u0128b\3\2\2\2\u0129\u012a\7\61\2\2\u012a\u012b\7\61\2\2\u012b\u012f"+
		"\3\2\2\2\u012c\u012e\n\4\2\2\u012d\u012c\3\2\2\2\u012e\u0131\3\2\2\2\u012f"+
		"\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132\3\2\2\2\u0131\u012f\3\2"+
		"\2\2\u0132\u0133\b\62\2\2\u0133d\3\2\2\2\u0134\u0136\t\5\2\2\u0135\u0134"+
		"\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139\u013a\b\63\2\2\u013af\3\2\2\2\r\2\u00c2\u00c9\u00ce"+
		"\u00d3\u00d8\u00da\u00e0\u00ef\u012f\u0137\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}