// Generated from Gramatica.g4 by ANTLR 4.4
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
		MAIN=8, CHAR_TYPE=9, INT_TYPE=10, REAL_TYPE=11, STRING_TYPE=12, BOOL_TYPE=13, 
		STRING_ID=14, CHAR_ID=15, ID=16, LETTER=17, NUM=18, REAL=19, BOOL_ID=20, 
		SEMICOLON=21, OPEN_KEY=22, CLOSE_KEY=23, OPEN_PARENT=24, CLOSE_PARENT=25, 
		OPEN_BRACKET=26, CLOSE_BRACKET=27, COMMA=28, DOT=29, SIMPLE_Q_MARK=30, 
		DOUBLE_Q_MARK=31, MATH_PLUS_OP=32, EQUALS=33, MATH_LESS_OP=34, MATH_DIV_OP=35, 
		MATH_MULT_OP=36, MATH_MOD_OP=37, BOOL_SMALLER_OP=38, BOOL_BIGGER_OP=39, 
		BOOL_BIGGER_EQUALS_OP=40, BOOL_SMALLER_EQUALS_OP=41, BOOL_EQUALS_OP=42, 
		BOOL_DIFFERENT_OP=43, BOOL_CALC_DIFF_OP=44, BOOL_CALC_OR_OP=45, BOOL_CALC_AND_OP=46, 
		SINGLELINE_COMMENT=47, WHITE_SPACE=48;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "'0'"
	};
	public static final String[] ruleNames = {
		"T__0", "PROGRAM", "FUNCTION_W", "WHILE_W", "IF_W", "ELSE_W", "FOR_W", 
		"MAIN", "CHAR_TYPE", "INT_TYPE", "REAL_TYPE", "STRING_TYPE", "BOOL_TYPE", 
		"STRING_ID", "CHAR_ID", "ID", "LETTER", "NUM", "REAL", "BOOL_ID", "SEMICOLON", 
		"OPEN_KEY", "CLOSE_KEY", "OPEN_PARENT", "CLOSE_PARENT", "OPEN_BRACKET", 
		"CLOSE_BRACKET", "COMMA", "DOT", "SIMPLE_Q_MARK", "DOUBLE_Q_MARK", "MATH_PLUS_OP", 
		"EQUALS", "MATH_LESS_OP", "MATH_DIV_OP", "MATH_MULT_OP", "MATH_MOD_OP", 
		"BOOL_SMALLER_OP", "BOOL_BIGGER_OP", "BOOL_BIGGER_EQUALS_OP", "BOOL_SMALLER_EQUALS_OP", 
		"BOOL_EQUALS_OP", "BOOL_DIFFERENT_OP", "BOOL_CALC_DIFF_OP", "BOOL_CALC_OR_OP", 
		"BOOL_CALC_AND_OP", "SINGLELINE_COMMENT", "WHITE_SPACE"
	};


	public GramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\62\u012b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\7\17\u00b1\n\17\f\17\16\17\u00b4\13\17\3\17\3\17\3\20"+
		"\3\20\5\20\u00ba\n\20\3\20\3\20\3\21\5\21\u00bf\n\21\3\21\6\21\u00c2\n"+
		"\21\r\21\16\21\u00c3\3\22\3\22\3\22\7\22\u00c9\n\22\f\22\16\22\u00cc\13"+
		"\22\3\23\6\23\u00cf\n\23\r\23\16\23\u00d0\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00e0\n\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3"+
		")\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\60\3"+
		"\60\7\60\u011e\n\60\f\60\16\60\u0121\13\60\3\60\3\60\3\61\6\61\u0126\n"+
		"\61\r\61\16\61\u0127\3\61\3\61\2\2\62\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.["+
		"/]\60_\61a\62\3\2\6\4\2C\\c|\3\2\62;\4\2\f\f\17\17\5\2\13\f\17\17\"\""+
		"\u0134\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2"+
		"\2\2a\3\2\2\2\3c\3\2\2\2\5l\3\2\2\2\7t\3\2\2\2\t}\3\2\2\2\13\u0083\3\2"+
		"\2\2\r\u0086\3\2\2\2\17\u008b\3\2\2\2\21\u008f\3\2\2\2\23\u0094\3\2\2"+
		"\2\25\u0099\3\2\2\2\27\u009d\3\2\2\2\31\u00a2\3\2\2\2\33\u00a9\3\2\2\2"+
		"\35\u00ae\3\2\2\2\37\u00b7\3\2\2\2!\u00be\3\2\2\2#\u00c5\3\2\2\2%\u00ce"+
		"\3\2\2\2\'\u00d2\3\2\2\2)\u00df\3\2\2\2+\u00e1\3\2\2\2-\u00e3\3\2\2\2"+
		"/\u00e5\3\2\2\2\61\u00e7\3\2\2\2\63\u00e9\3\2\2\2\65\u00eb\3\2\2\2\67"+
		"\u00ed\3\2\2\29\u00ef\3\2\2\2;\u00f1\3\2\2\2=\u00f3\3\2\2\2?\u00f5\3\2"+
		"\2\2A\u00f7\3\2\2\2C\u00f9\3\2\2\2E\u00fb\3\2\2\2G\u00fd\3\2\2\2I\u00ff"+
		"\3\2\2\2K\u0101\3\2\2\2M\u0103\3\2\2\2O\u0105\3\2\2\2Q\u0107\3\2\2\2S"+
		"\u010a\3\2\2\2U\u010d\3\2\2\2W\u0110\3\2\2\2Y\u0113\3\2\2\2[\u0115\3\2"+
		"\2\2]\u0117\3\2\2\2_\u0119\3\2\2\2a\u0125\3\2\2\2cd\7r\2\2de\7t\2\2ef"+
		"\7k\2\2fg\7p\2\2gh\7v\2\2hi\7n\2\2ij\7p\2\2jk\7*\2\2k\4\3\2\2\2lm\7r\2"+
		"\2mn\7t\2\2no\7q\2\2op\7i\2\2pq\7t\2\2qr\7c\2\2rs\7o\2\2s\6\3\2\2\2tu"+
		"\7h\2\2uv\7w\2\2vw\7p\2\2wx\7e\2\2xy\7v\2\2yz\7k\2\2z{\7q\2\2{|\7p\2\2"+
		"|\b\3\2\2\2}~\7y\2\2~\177\7j\2\2\177\u0080\7k\2\2\u0080\u0081\7n\2\2\u0081"+
		"\u0082\7g\2\2\u0082\n\3\2\2\2\u0083\u0084\7k\2\2\u0084\u0085\7h\2\2\u0085"+
		"\f\3\2\2\2\u0086\u0087\7g\2\2\u0087\u0088\7n\2\2\u0088\u0089\7u\2\2\u0089"+
		"\u008a\7g\2\2\u008a\16\3\2\2\2\u008b\u008c\7h\2\2\u008c\u008d\7q\2\2\u008d"+
		"\u008e\7t\2\2\u008e\20\3\2\2\2\u008f\u0090\7o\2\2\u0090\u0091\7c\2\2\u0091"+
		"\u0092\7k\2\2\u0092\u0093\7p\2\2\u0093\22\3\2\2\2\u0094\u0095\7e\2\2\u0095"+
		"\u0096\7j\2\2\u0096\u0097\7c\2\2\u0097\u0098\7t\2\2\u0098\24\3\2\2\2\u0099"+
		"\u009a\7k\2\2\u009a\u009b\7p\2\2\u009b\u009c\7v\2\2\u009c\26\3\2\2\2\u009d"+
		"\u009e\7t\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7c\2\2\u00a0\u00a1\7n\2\2"+
		"\u00a1\30\3\2\2\2\u00a2\u00a3\7u\2\2\u00a3\u00a4\7v\2\2\u00a4\u00a5\7"+
		"t\2\2\u00a5\u00a6\7k\2\2\u00a6\u00a7\7p\2\2\u00a7\u00a8\7i\2\2\u00a8\32"+
		"\3\2\2\2\u00a9\u00aa\7d\2\2\u00aa\u00ab\7q\2\2\u00ab\u00ac\7q\2\2\u00ac"+
		"\u00ad\7n\2\2\u00ad\34\3\2\2\2\u00ae\u00b2\5? \2\u00af\u00b1\5#\22\2\u00b0"+
		"\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2"+
		"\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\5? \2\u00b6\36"+
		"\3\2\2\2\u00b7\u00b9\5=\37\2\u00b8\u00ba\5#\22\2\u00b9\u00b8\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\5=\37\2\u00bc \3\2\2\2"+
		"\u00bd\u00bf\7a\2\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1"+
		"\3\2\2\2\u00c0\u00c2\5#\22\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\"\3\2\2\2\u00c5\u00ca\t\2\2\2"+
		"\u00c6\u00c9\t\2\2\2\u00c7\u00c9\5%\23\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7"+
		"\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"$\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00cf\t\3\2\2\u00ce\u00cd\3\2\2\2"+
		"\u00cf\u00d0\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1&\3"+
		"\2\2\2\u00d2\u00d3\5%\23\2\u00d3\u00d4\5;\36\2\u00d4\u00d5\5%\23\2\u00d5"+
		"(\3\2\2\2\u00d6\u00d7\7v\2\2\u00d7\u00d8\7t\2\2\u00d8\u00d9\7w\2\2\u00d9"+
		"\u00e0\7g\2\2\u00da\u00db\7h\2\2\u00db\u00dc\7c\2\2\u00dc\u00dd\7n\2\2"+
		"\u00dd\u00de\7u\2\2\u00de\u00e0\7g\2\2\u00df\u00d6\3\2\2\2\u00df\u00da"+
		"\3\2\2\2\u00e0*\3\2\2\2\u00e1\u00e2\7=\2\2\u00e2,\3\2\2\2\u00e3\u00e4"+
		"\7}\2\2\u00e4.\3\2\2\2\u00e5\u00e6\7\177\2\2\u00e6\60\3\2\2\2\u00e7\u00e8"+
		"\7*\2\2\u00e8\62\3\2\2\2\u00e9\u00ea\7+\2\2\u00ea\64\3\2\2\2\u00eb\u00ec"+
		"\7]\2\2\u00ec\66\3\2\2\2\u00ed\u00ee\7_\2\2\u00ee8\3\2\2\2\u00ef\u00f0"+
		"\7.\2\2\u00f0:\3\2\2\2\u00f1\u00f2\7\60\2\2\u00f2<\3\2\2\2\u00f3\u00f4"+
		"\7)\2\2\u00f4>\3\2\2\2\u00f5\u00f6\7$\2\2\u00f6@\3\2\2\2\u00f7\u00f8\7"+
		"-\2\2\u00f8B\3\2\2\2\u00f9\u00fa\7?\2\2\u00faD\3\2\2\2\u00fb\u00fc\7/"+
		"\2\2\u00fcF\3\2\2\2\u00fd\u00fe\7\61\2\2\u00feH\3\2\2\2\u00ff\u0100\7"+
		",\2\2\u0100J\3\2\2\2\u0101\u0102\7\'\2\2\u0102L\3\2\2\2\u0103\u0104\7"+
		">\2\2\u0104N\3\2\2\2\u0105\u0106\7@\2\2\u0106P\3\2\2\2\u0107\u0108\7@"+
		"\2\2\u0108\u0109\7?\2\2\u0109R\3\2\2\2\u010a\u010b\7>\2\2\u010b\u010c"+
		"\7?\2\2\u010cT\3\2\2\2\u010d\u010e\7?\2\2\u010e\u010f\7?\2\2\u010fV\3"+
		"\2\2\2\u0110\u0111\7#\2\2\u0111\u0112\7?\2\2\u0112X\3\2\2\2\u0113\u0114"+
		"\7#\2\2\u0114Z\3\2\2\2\u0115\u0116\7~\2\2\u0116\\\3\2\2\2\u0117\u0118"+
		"\7(\2\2\u0118^\3\2\2\2\u0119\u011a\7\61\2\2\u011a\u011b\7\61\2\2\u011b"+
		"\u011f\3\2\2\2\u011c\u011e\n\4\2\2\u011d\u011c\3\2\2\2\u011e\u0121\3\2"+
		"\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0122\3\2\2\2\u0121"+
		"\u011f\3\2\2\2\u0122\u0123\b\60\2\2\u0123`\3\2\2\2\u0124\u0126\t\5\2\2"+
		"\u0125\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128"+
		"\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\b\61\2\2\u012ab\3\2\2\2\r\2\u00b2"+
		"\u00b9\u00be\u00c3\u00c8\u00ca\u00d0\u00df\u011f\u0127\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}