package compiler;
// Generated from RochGrammar.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RochGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__19=1, T__18=2, T__17=3, T__16=4, T__15=5, T__14=6, T__13=7, T__12=8, 
		T__11=9, T__10=10, T__9=11, T__8=12, T__7=13, T__6=14, T__5=15, T__4=16, 
		T__3=17, T__2=18, T__1=19, T__0=20, Character=21, Integer=22, Digit=23, 
		Bool=24, BlankWhiteSpace=25, Comment=26;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'"
	};
	public static final String[] ruleNames = {
		"T__19", "T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", 
		"T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", 
		"T__2", "T__1", "T__0", "Character", "Integer", "Digit", "Bool", "BlankWhiteSpace", 
		"Comment"
	};


	public RochGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "RochGrammar.g4"; }

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\34\u00ce\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\7\27\u009c\n\27"+
		"\f\27\16\27\u009f\13\27\3\27\5\27\u00a2\n\27\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00af\n\31\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\7\33\u00b9\n\33\f\33\16\33\u00bc\13\33\3\33\3\33\3\33"+
		"\3\33\3\33\7\33\u00c3\n\33\f\33\16\33\u00c6\13\33\3\33\3\33\3\33\5\33"+
		"\u00cb\n\33\3\33\3\33\3\u00c4\2\34\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\3\2\7\5\2C\\aac|\3\2\63;\3\2\62;\5\2\13\f\16\17"+
		"\"\"\4\2\f\f\17\17\u00d3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3"+
		"\2\2\2\59\3\2\2\2\7C\3\2\2\2\tF\3\2\2\2\13P\3\2\2\2\rR\3\2\2\2\17V\3\2"+
		"\2\2\21X\3\2\2\2\23]\3\2\2\2\25_\3\2\2\2\27e\3\2\2\2\31k\3\2\2\2\33n\3"+
		"\2\2\2\35t\3\2\2\2\37}\3\2\2\2!\u0086\3\2\2\2#\u008f\3\2\2\2%\u0091\3"+
		"\2\2\2\'\u0093\3\2\2\2)\u0095\3\2\2\2+\u0097\3\2\2\2-\u00a1\3\2\2\2/\u00a3"+
		"\3\2\2\2\61\u00ae\3\2\2\2\63\u00b0\3\2\2\2\65\u00ca\3\2\2\2\678\7\61\2"+
		"\28\4\3\2\2\29:\7v\2\2:;\7g\2\2;<\7t\2\2<=\7o\2\2=>\7k\2\2>?\7p\2\2?@"+
		"\7c\2\2@A\7v\2\2AB\7g\2\2B\6\3\2\2\2CD\7@\2\2DE\7?\2\2E\b\3\2\2\2FG\7"+
		"q\2\2GH\7v\2\2HI\7j\2\2IJ\7g\2\2JK\7t\2\2KL\7y\2\2LM\7k\2\2MN\7u\2\2N"+
		"O\7g\2\2O\n\3\2\2\2PQ\7>\2\2Q\f\3\2\2\2RS\7p\2\2ST\7w\2\2TU\7o\2\2U\16"+
		"\3\2\2\2VW\7?\2\2W\20\3\2\2\2XY\7d\2\2YZ\7q\2\2Z[\7q\2\2[\\\7n\2\2\\\22"+
		"\3\2\2\2]^\7@\2\2^\24\3\2\2\2_`\7w\2\2`a\7p\2\2ab\7v\2\2bc\7k\2\2cd\7"+
		"n\2\2d\26\3\2\2\2ef\7e\2\2fg\7j\2\2gh\7g\2\2hi\7e\2\2ij\7m\2\2j\30\3\2"+
		"\2\2kl\7>\2\2lm\7?\2\2m\32\3\2\2\2no\7u\2\2op\7v\2\2pq\7c\2\2qr\7t\2\2"+
		"rs\7v\2\2s\34\3\2\2\2tu\7w\2\2uv\7p\2\2vw\7v\2\2wx\7k\2\2xy\7n\2\2yz\7"+
		"G\2\2z{\7p\2\2{|\7f\2\2|\36\3\2\2\2}~\7f\2\2~\177\7k\2\2\177\u0080\7u"+
		"\2\2\u0080\u0081\7r\2\2\u0081\u0082\7n\2\2\u0082\u0083\7c\2\2\u0083\u0084"+
		"\7{\2\2\u0084\u0085\7*\2\2\u0085 \3\2\2\2\u0086\u0087\7e\2\2\u0087\u0088"+
		"\7j\2\2\u0088\u0089\7g\2\2\u0089\u008a\7e\2\2\u008a\u008b\7m\2\2\u008b"+
		"\u008c\7G\2\2\u008c\u008d\7p\2\2\u008d\u008e\7f\2\2\u008e\"\3\2\2\2\u008f"+
		"\u0090\7+\2\2\u0090$\3\2\2\2\u0091\u0092\7,\2\2\u0092&\3\2\2\2\u0093\u0094"+
		"\7-\2\2\u0094(\3\2\2\2\u0095\u0096\7/\2\2\u0096*\3\2\2\2\u0097\u0098\t"+
		"\2\2\2\u0098,\3\2\2\2\u0099\u009d\t\3\2\2\u009a\u009c\5/\30\2\u009b\u009a"+
		"\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u00a2\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a2\7\62\2\2\u00a1\u0099\3"+
		"\2\2\2\u00a1\u00a0\3\2\2\2\u00a2.\3\2\2\2\u00a3\u00a4\t\4\2\2\u00a4\60"+
		"\3\2\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7\7t\2\2\u00a7\u00a8\7w\2\2\u00a8"+
		"\u00af\7g\2\2\u00a9\u00aa\7h\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7n\2\2"+
		"\u00ac\u00ad\7u\2\2\u00ad\u00af\7g\2\2\u00ae\u00a5\3\2\2\2\u00ae\u00a9"+
		"\3\2\2\2\u00af\62\3\2\2\2\u00b0\u00b1\t\5\2\2\u00b1\u00b2\3\2\2\2\u00b2"+
		"\u00b3\b\32\2\2\u00b3\64\3\2\2\2\u00b4\u00b5\7#\2\2\u00b5\u00b6\7#\2\2"+
		"\u00b6\u00ba\3\2\2\2\u00b7\u00b9\n\6\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc"+
		"\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00cb\3\2\2\2\u00bc"+
		"\u00ba\3\2\2\2\u00bd\u00be\7#\2\2\u00be\u00bf\7/\2\2\u00bf\u00c0\7/\2"+
		"\2\u00c0\u00c4\3\2\2\2\u00c1\u00c3\13\2\2\2\u00c2\u00c1\3\2\2\2\u00c3"+
		"\u00c6\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c7\3\2"+
		"\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\7/\2\2\u00c8\u00c9\7/\2\2\u00c9\u00cb"+
		"\7#\2\2\u00ca\u00b4\3\2\2\2\u00ca\u00bd\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc"+
		"\u00cd\b\33\2\2\u00cd\66\3\2\2\2\t\2\u009d\u00a1\u00ae\u00ba\u00c4\u00ca"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}