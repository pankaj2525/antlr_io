// Generated from /home/synerzip/source-code/pankaj-repos/antlr_io/grammar/MONGOLexer.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MONGOLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, FUNCTION=2, DB=3, FIND=4, INSERT=5, INSERTONE=6, INSERTMANY=7, 
		UPDATE=8, UPDATEMANY=9, UPDATEONE=10, DELETEONE=11, REPLACEONE=12, DELETEMANY=13, 
		AGGREGATE=14, BULKWRITE=15, FN_ARG_VAL=16, ADMINCOMMAND=17, CLONECOLLECTION=18, 
		CLONEDATABASE=19, COPYDATABASE=20, CREATEVIEW=21, CURRENTOP=22, DROPDATABASE=23, 
		EVAL=24, ALPHA=25, TEXT=26, UNDERSCORE=27, DOT=28, OPEN_ROUND_BRACKET=29, 
		CLOSE_ROUND_BRACKET=30, OPEN_SQUARE_BRACKET=31, CLOSE_SQUARE_BRACKET=32, 
		OPEN_CURLY_BRACKET=33, CLOSE_CURLY_BRACKET=34, ISTO_CHAR=35, COMMAR_CHAR=36, 
		EQUAL_TO=37, BOOLEAN=38, TRUE=39, FALSE=40, NULL=41, STRING=42, NUMBER=43, 
		KEYWORDS=44, DATE=45, DATETYPE=46, CustomDate=47, MILLISEC=48, YYYY=49, 
		MM=50, DD=51, HH=52, MIN=53, SEC=54;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SPACE", "FUNCTION", "DB", "FIND", "INSERT", "INSERTONE", "INSERTMANY", 
		"UPDATE", "UPDATEMANY", "UPDATEONE", "DELETEONE", "REPLACEONE", "DELETEMANY", 
		"AGGREGATE", "BULKWRITE", "FN_ARG_VAL", "ADMINCOMMAND", "CLONECOLLECTION", 
		"CLONEDATABASE", "COPYDATABASE", "CREATEVIEW", "CURRENTOP", "DROPDATABASE", 
		"EVAL", "ALPHA", "TEXT", "UNDERSCORE", "DOT", "OPEN_ROUND_BRACKET", "CLOSE_ROUND_BRACKET", 
		"OPEN_SQUARE_BRACKET", "CLOSE_SQUARE_BRACKET", "OPEN_CURLY_BRACKET", "CLOSE_CURLY_BRACKET", 
		"ISTO_CHAR", "COMMAR_CHAR", "EQUAL_TO", "BOOLEAN", "TRUE", "FALSE", "NULL", 
		"STRING", "NUMBER", "KEYWORDS", "DATE", "DATETYPE", "CustomDate", "MILLISEC", 
		"YYYY", "MM", "DD", "HH", "MIN", "SEC", "ID_LITERAL", "ALPHA_LITERAL", 
		"ALPHABETS", "HEX_DIGIT", "A", "B", "C", "D", "E", "F", "G", "H", "I", 
		"J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", 
		"X", "Y", "Z", "ESC", "UNICODE", "HEX", "INT_NO", "EXP", "K_FUNCTION"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "'find'", "'insert'", "'insertOne'", "'insertMany'", 
		"'update'", "'updateMany'", "'updateOne'", "'deleteOne'", "'replaceOne'", 
		"'deleteMany'", "'aggregate'", "'bulkWrite'", null, "'adminCommand'", 
		"'cloneCollection'", "'cloneDatabase'", "'copyDatabase'", "'createView'", 
		"'currentOp'", "'dropDatabase'", "'eval'", null, null, "'_'", "'.'", "'('", 
		"')'", "'['", "']'", "'{'", "'}'", "':'", "','", "'='", null, "'true'", 
		"'false'", "'null'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SPACE", "FUNCTION", "DB", "FIND", "INSERT", "INSERTONE", "INSERTMANY", 
		"UPDATE", "UPDATEMANY", "UPDATEONE", "DELETEONE", "REPLACEONE", "DELETEMANY", 
		"AGGREGATE", "BULKWRITE", "FN_ARG_VAL", "ADMINCOMMAND", "CLONECOLLECTION", 
		"CLONEDATABASE", "COPYDATABASE", "CREATEVIEW", "CURRENTOP", "DROPDATABASE", 
		"EVAL", "ALPHA", "TEXT", "UNDERSCORE", "DOT", "OPEN_ROUND_BRACKET", "CLOSE_ROUND_BRACKET", 
		"OPEN_SQUARE_BRACKET", "CLOSE_SQUARE_BRACKET", "OPEN_CURLY_BRACKET", "CLOSE_CURLY_BRACKET", 
		"ISTO_CHAR", "COMMAR_CHAR", "EQUAL_TO", "BOOLEAN", "TRUE", "FALSE", "NULL", 
		"STRING", "NUMBER", "KEYWORDS", "DATE", "DATETYPE", "CustomDate", "MILLISEC", 
		"YYYY", "MM", "DD", "HH", "MIN", "SEC"
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


	public MONGOLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MONGOLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\28\u02ae\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\3\2\6\2\u00b9\n\2\r\2\16\2"+
		"\u00ba\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\5\21\u0138\n\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3"+
		"#\3$\3$\3%\3%\3&\3&\3\'\3\'\5\'\u01b5\n\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3"+
		")\3)\3*\3*\3*\3*\3*\3+\3+\3+\7+\u01ca\n+\f+\16+\u01cd\13+\3+\3+\3,\5,"+
		"\u01d2\n,\3,\3,\3,\6,\u01d7\n,\r,\16,\u01d8\3,\5,\u01dc\n,\3,\5,\u01df"+
		"\n,\3,\3,\3,\3,\5,\u01e5\n,\3,\5,\u01e8\n,\3-\5-\u01eb\n-\3-\3-\7-\u01ef"+
		"\n-\f-\16-\u01f2\13-\3.\3.\3.\5.\u01f7\n.\3.\3.\3/\3/\3/\3/\5/\u01ff\n"+
		"/\3/\3/\3/\5/\u0204\n/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\5"+
		"\61\u021f\n\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64"+
		"\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3\67\3\67\38\78\u0236\n8\f8\168\u0239"+
		"\138\38\68\u023c\n8\r8\168\u023d\38\78\u0241\n8\f8\168\u0244\138\39\5"+
		"9\u0247\n9\39\69\u024a\n9\r9\169\u024b\3:\6:\u024f\n:\r:\16:\u0250\3;"+
		"\3;\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F"+
		"\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R"+
		"\3R\3S\3S\3T\3T\3U\3U\3V\3V\3V\5V\u028c\nV\3W\3W\3W\3W\3W\3W\3X\3X\3Y"+
		"\3Y\3Y\7Y\u0299\nY\fY\16Y\u029c\13Y\5Y\u029e\nY\3Z\3Z\5Z\u02a2\nZ\3Z\3"+
		"Z\3[\3[\3[\3[\3[\3[\3[\3[\3[\4\u0237\u023d\2\\\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o\2q\2s\2u\2w\2y\2{\2}"+
		"\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b\2\u008d\2\u008f"+
		"\2\u0091\2\u0093\2\u0095\2\u0097\2\u0099\2\u009b\2\u009d\2\u009f\2\u00a1"+
		"\2\u00a3\2\u00a5\2\u00a7\2\u00a9\2\u00ab\2\u00ad\2\u00af\2\u00b1\2\u00b3"+
		"\2\u00b5\2\3\2(\5\2\13\f\17\17\"\"\4\2$$^^\3\2\62;\4\2&&aa\4\2C\\c|\7"+
		"\2&&\62;C\\aac|\6\2&&C\\aac|\6\2\62;C\\aac|\5\2\62;CHch\4\2CCcc\4\2DD"+
		"dd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2"+
		"MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4"+
		"\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\n\2$$\61\61^"+
		"^ddhhppttvv\3\2\63;\4\2--//\2\u02a6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2"+
		"\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\3\u00b8\3\2\2\2\5\u00be\3\2\2\2"+
		"\7\u00c0\3\2\2\2\t\u00c3\3\2\2\2\13\u00c8\3\2\2\2\r\u00cf\3\2\2\2\17\u00d9"+
		"\3\2\2\2\21\u00e4\3\2\2\2\23\u00eb\3\2\2\2\25\u00f6\3\2\2\2\27\u0100\3"+
		"\2\2\2\31\u010a\3\2\2\2\33\u0115\3\2\2\2\35\u0120\3\2\2\2\37\u012a\3\2"+
		"\2\2!\u0137\3\2\2\2#\u0139\3\2\2\2%\u0146\3\2\2\2\'\u0156\3\2\2\2)\u0164"+
		"\3\2\2\2+\u0171\3\2\2\2-\u017c\3\2\2\2/\u0186\3\2\2\2\61\u0193\3\2\2\2"+
		"\63\u0198\3\2\2\2\65\u019a\3\2\2\2\67\u019c\3\2\2\29\u019e\3\2\2\2;\u01a0"+
		"\3\2\2\2=\u01a2\3\2\2\2?\u01a4\3\2\2\2A\u01a6\3\2\2\2C\u01a8\3\2\2\2E"+
		"\u01aa\3\2\2\2G\u01ac\3\2\2\2I\u01ae\3\2\2\2K\u01b0\3\2\2\2M\u01b4\3\2"+
		"\2\2O\u01b6\3\2\2\2Q\u01bb\3\2\2\2S\u01c1\3\2\2\2U\u01c6\3\2\2\2W\u01e7"+
		"\3\2\2\2Y\u01ea\3\2\2\2[\u01f3\3\2\2\2]\u01fe\3\2\2\2_\u020a\3\2\2\2a"+
		"\u021e\3\2\2\2c\u0220\3\2\2\2e\u0225\3\2\2\2g\u0228\3\2\2\2i\u022b\3\2"+
		"\2\2k\u022e\3\2\2\2m\u0231\3\2\2\2o\u0237\3\2\2\2q\u0246\3\2\2\2s\u024e"+
		"\3\2\2\2u\u0252\3\2\2\2w\u0254\3\2\2\2y\u0256\3\2\2\2{\u0258\3\2\2\2}"+
		"\u025a\3\2\2\2\177\u025c\3\2\2\2\u0081\u025e\3\2\2\2\u0083\u0260\3\2\2"+
		"\2\u0085\u0262\3\2\2\2\u0087\u0264\3\2\2\2\u0089\u0266\3\2\2\2\u008b\u0268"+
		"\3\2\2\2\u008d\u026a\3\2\2\2\u008f\u026c\3\2\2\2\u0091\u026e\3\2\2\2\u0093"+
		"\u0270\3\2\2\2\u0095\u0272\3\2\2\2\u0097\u0274\3\2\2\2\u0099\u0276\3\2"+
		"\2\2\u009b\u0278\3\2\2\2\u009d\u027a\3\2\2\2\u009f\u027c\3\2\2\2\u00a1"+
		"\u027e\3\2\2\2\u00a3\u0280\3\2\2\2\u00a5\u0282\3\2\2\2\u00a7\u0284\3\2"+
		"\2\2\u00a9\u0286\3\2\2\2\u00ab\u0288\3\2\2\2\u00ad\u028d\3\2\2\2\u00af"+
		"\u0293\3\2\2\2\u00b1\u029d\3\2\2\2\u00b3\u029f\3\2\2\2\u00b5\u02a5\3\2"+
		"\2\2\u00b7\u00b9\t\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\b\2"+
		"\2\2\u00bd\4\3\2\2\2\u00be\u00bf\5\u00b5[\2\u00bf\6\3\2\2\2\u00c0\u00c1"+
		"\5}?\2\u00c1\u00c2\5y=\2\u00c2\b\3\2\2\2\u00c3\u00c4\7h\2\2\u00c4\u00c5"+
		"\7k\2\2\u00c5\u00c6\7p\2\2\u00c6\u00c7\7f\2\2\u00c7\n\3\2\2\2\u00c8\u00c9"+
		"\7k\2\2\u00c9\u00ca\7p\2\2\u00ca\u00cb\7u\2\2\u00cb\u00cc\7g\2\2\u00cc"+
		"\u00cd\7t\2\2\u00cd\u00ce\7v\2\2\u00ce\f\3\2\2\2\u00cf\u00d0\7k\2\2\u00d0"+
		"\u00d1\7p\2\2\u00d1\u00d2\7u\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4\7t\2\2"+
		"\u00d4\u00d5\7v\2\2\u00d5\u00d6\7Q\2\2\u00d6\u00d7\7p\2\2\u00d7\u00d8"+
		"\7g\2\2\u00d8\16\3\2\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7p\2\2\u00db\u00dc"+
		"\7u\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de\7t\2\2\u00de\u00df\7v\2\2\u00df"+
		"\u00e0\7O\2\2\u00e0\u00e1\7c\2\2\u00e1\u00e2\7p\2\2\u00e2\u00e3\7{\2\2"+
		"\u00e3\20\3\2\2\2\u00e4\u00e5\7w\2\2\u00e5\u00e6\7r\2\2\u00e6\u00e7\7"+
		"f\2\2\u00e7\u00e8\7c\2\2\u00e8\u00e9\7v\2\2\u00e9\u00ea\7g\2\2\u00ea\22"+
		"\3\2\2\2\u00eb\u00ec\7w\2\2\u00ec\u00ed\7r\2\2\u00ed\u00ee\7f\2\2\u00ee"+
		"\u00ef\7c\2\2\u00ef\u00f0\7v\2\2\u00f0\u00f1\7g\2\2\u00f1\u00f2\7O\2\2"+
		"\u00f2\u00f3\7c\2\2\u00f3\u00f4\7p\2\2\u00f4\u00f5\7{\2\2\u00f5\24\3\2"+
		"\2\2\u00f6\u00f7\7w\2\2\u00f7\u00f8\7r\2\2\u00f8\u00f9\7f\2\2\u00f9\u00fa"+
		"\7c\2\2\u00fa\u00fb\7v\2\2\u00fb\u00fc\7g\2\2\u00fc\u00fd\7Q\2\2\u00fd"+
		"\u00fe\7p\2\2\u00fe\u00ff\7g\2\2\u00ff\26\3\2\2\2\u0100\u0101\7f\2\2\u0101"+
		"\u0102\7g\2\2\u0102\u0103\7n\2\2\u0103\u0104\7g\2\2\u0104\u0105\7v\2\2"+
		"\u0105\u0106\7g\2\2\u0106\u0107\7Q\2\2\u0107\u0108\7p\2\2\u0108\u0109"+
		"\7g\2\2\u0109\30\3\2\2\2\u010a\u010b\7t\2\2\u010b\u010c\7g\2\2\u010c\u010d"+
		"\7r\2\2\u010d\u010e\7n\2\2\u010e\u010f\7c\2\2\u010f\u0110\7e\2\2\u0110"+
		"\u0111\7g\2\2\u0111\u0112\7Q\2\2\u0112\u0113\7p\2\2\u0113\u0114\7g\2\2"+
		"\u0114\32\3\2\2\2\u0115\u0116\7f\2\2\u0116\u0117\7g\2\2\u0117\u0118\7"+
		"n\2\2\u0118\u0119\7g\2\2\u0119\u011a\7v\2\2\u011a\u011b\7g\2\2\u011b\u011c"+
		"\7O\2\2\u011c\u011d\7c\2\2\u011d\u011e\7p\2\2\u011e\u011f\7{\2\2\u011f"+
		"\34\3\2\2\2\u0120\u0121\7c\2\2\u0121\u0122\7i\2\2\u0122\u0123\7i\2\2\u0123"+
		"\u0124\7t\2\2\u0124\u0125\7g\2\2\u0125\u0126\7i\2\2\u0126\u0127\7c\2\2"+
		"\u0127\u0128\7v\2\2\u0128\u0129\7g\2\2\u0129\36\3\2\2\2\u012a\u012b\7"+
		"d\2\2\u012b\u012c\7w\2\2\u012c\u012d\7n\2\2\u012d\u012e\7m\2\2\u012e\u012f"+
		"\7Y\2\2\u012f\u0130\7t\2\2\u0130\u0131\7k\2\2\u0131\u0132\7v\2\2\u0132"+
		"\u0133\7g\2\2\u0133 \3\2\2\2\u0134\u0138\5W,\2\u0135\u0138\5M\'\2\u0136"+
		"\u0138\5U+\2\u0137\u0134\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0136\3\2\2"+
		"\2\u0138\"\3\2\2\2\u0139\u013a\7c\2\2\u013a\u013b\7f\2\2\u013b\u013c\7"+
		"o\2\2\u013c\u013d\7k\2\2\u013d\u013e\7p\2\2\u013e\u013f\7E\2\2\u013f\u0140"+
		"\7q\2\2\u0140\u0141\7o\2\2\u0141\u0142\7o\2\2\u0142\u0143\7c\2\2\u0143"+
		"\u0144\7p\2\2\u0144\u0145\7f\2\2\u0145$\3\2\2\2\u0146\u0147\7e\2\2\u0147"+
		"\u0148\7n\2\2\u0148\u0149\7q\2\2\u0149\u014a\7p\2\2\u014a\u014b\7g\2\2"+
		"\u014b\u014c\7E\2\2\u014c\u014d\7q\2\2\u014d\u014e\7n\2\2\u014e\u014f"+
		"\7n\2\2\u014f\u0150\7g\2\2\u0150\u0151\7e\2\2\u0151\u0152\7v\2\2\u0152"+
		"\u0153\7k\2\2\u0153\u0154\7q\2\2\u0154\u0155\7p\2\2\u0155&\3\2\2\2\u0156"+
		"\u0157\7e\2\2\u0157\u0158\7n\2\2\u0158\u0159\7q\2\2\u0159\u015a\7p\2\2"+
		"\u015a\u015b\7g\2\2\u015b\u015c\7F\2\2\u015c\u015d\7c\2\2\u015d\u015e"+
		"\7v\2\2\u015e\u015f\7c\2\2\u015f\u0160\7d\2\2\u0160\u0161\7c\2\2\u0161"+
		"\u0162\7u\2\2\u0162\u0163\7g\2\2\u0163(\3\2\2\2\u0164\u0165\7e\2\2\u0165"+
		"\u0166\7q\2\2\u0166\u0167\7r\2\2\u0167\u0168\7{\2\2\u0168\u0169\7F\2\2"+
		"\u0169\u016a\7c\2\2\u016a\u016b\7v\2\2\u016b\u016c\7c\2\2\u016c\u016d"+
		"\7d\2\2\u016d\u016e\7c\2\2\u016e\u016f\7u\2\2\u016f\u0170\7g\2\2\u0170"+
		"*\3\2\2\2\u0171\u0172\7e\2\2\u0172\u0173\7t\2\2\u0173\u0174\7g\2\2\u0174"+
		"\u0175\7c\2\2\u0175\u0176\7v\2\2\u0176\u0177\7g\2\2\u0177\u0178\7X\2\2"+
		"\u0178\u0179\7k\2\2\u0179\u017a\7g\2\2\u017a\u017b\7y\2\2\u017b,\3\2\2"+
		"\2\u017c\u017d\7e\2\2\u017d\u017e\7w\2\2\u017e\u017f\7t\2\2\u017f\u0180"+
		"\7t\2\2\u0180\u0181\7g\2\2\u0181\u0182\7p\2\2\u0182\u0183\7v\2\2\u0183"+
		"\u0184\7Q\2\2\u0184\u0185\7r\2\2\u0185.\3\2\2\2\u0186\u0187\7f\2\2\u0187"+
		"\u0188\7t\2\2\u0188\u0189\7q\2\2\u0189\u018a\7r\2\2\u018a\u018b\7F\2\2"+
		"\u018b\u018c\7c\2\2\u018c\u018d\7v\2\2\u018d\u018e\7c\2\2\u018e\u018f"+
		"\7d\2\2\u018f\u0190\7c\2\2\u0190\u0191\7u\2\2\u0191\u0192\7g\2\2\u0192"+
		"\60\3\2\2\2\u0193\u0194\7g\2\2\u0194\u0195\7x\2\2\u0195\u0196\7c\2\2\u0196"+
		"\u0197\7n\2\2\u0197\62\3\2\2\2\u0198\u0199\5s:\2\u0199\64\3\2\2\2\u019a"+
		"\u019b\5q9\2\u019b\66\3\2\2\2\u019c\u019d\7a\2\2\u019d8\3\2\2\2\u019e"+
		"\u019f\7\60\2\2\u019f:\3\2\2\2\u01a0\u01a1\7*\2\2\u01a1<\3\2\2\2\u01a2"+
		"\u01a3\7+\2\2\u01a3>\3\2\2\2\u01a4\u01a5\7]\2\2\u01a5@\3\2\2\2\u01a6\u01a7"+
		"\7_\2\2\u01a7B\3\2\2\2\u01a8\u01a9\7}\2\2\u01a9D\3\2\2\2\u01aa\u01ab\7"+
		"\177\2\2\u01abF\3\2\2\2\u01ac\u01ad\7<\2\2\u01adH\3\2\2\2\u01ae\u01af"+
		"\7.\2\2\u01afJ\3\2\2\2\u01b0\u01b1\7?\2\2\u01b1L\3\2\2\2\u01b2\u01b5\5"+
		"O(\2\u01b3\u01b5\5Q)\2\u01b4\u01b2\3\2\2\2\u01b4\u01b3\3\2\2\2\u01b5N"+
		"\3\2\2\2\u01b6\u01b7\7v\2\2\u01b7\u01b8\7t\2\2\u01b8\u01b9\7w\2\2\u01b9"+
		"\u01ba\7g\2\2\u01baP\3\2\2\2\u01bb\u01bc\7h\2\2\u01bc\u01bd\7c\2\2\u01bd"+
		"\u01be\7n\2\2\u01be\u01bf\7u\2\2\u01bf\u01c0\7g\2\2\u01c0R\3\2\2\2\u01c1"+
		"\u01c2\7p\2\2\u01c2\u01c3\7w\2\2\u01c3\u01c4\7n\2\2\u01c4\u01c5\7n\2\2"+
		"\u01c5T\3\2\2\2\u01c6\u01cb\7$\2\2\u01c7\u01ca\5\u00abV\2\u01c8\u01ca"+
		"\n\3\2\2\u01c9\u01c7\3\2\2\2\u01c9\u01c8\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb"+
		"\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01ce\3\2\2\2\u01cd\u01cb\3\2"+
		"\2\2\u01ce\u01cf\7$\2\2\u01cfV\3\2\2\2\u01d0\u01d2\7/\2\2\u01d1\u01d0"+
		"\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\5\u00b1Y"+
		"\2\u01d4\u01d6\7\60\2\2\u01d5\u01d7\t\4\2\2\u01d6\u01d5\3\2\2\2\u01d7"+
		"\u01d8\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\u01db\3\2"+
		"\2\2\u01da\u01dc\5\u00b3Z\2\u01db\u01da\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc"+
		"\u01e8\3\2\2\2\u01dd\u01df\7/\2\2\u01de\u01dd\3\2\2\2\u01de\u01df\3\2"+
		"\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e1\5\u00b1Y\2\u01e1\u01e2\5\u00b3Z\2"+
		"\u01e2\u01e8\3\2\2\2\u01e3\u01e5\7/\2\2\u01e4\u01e3\3\2\2\2\u01e4\u01e5"+
		"\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e8\5\u00b1Y\2\u01e7\u01d1\3\2\2"+
		"\2\u01e7\u01de\3\2\2\2\u01e7\u01e4\3\2\2\2\u01e8X\3\2\2\2\u01e9\u01eb"+
		"\t\5\2\2\u01ea\u01e9\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec"+
		"\u01f0\t\6\2\2\u01ed\u01ef\t\6\2\2\u01ee\u01ed\3\2\2\2\u01ef\u01f2\3\2"+
		"\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1Z\3\2\2\2\u01f2\u01f0"+
		"\3\2\2\2\u01f3\u01f4\5]/\2\u01f4\u01f6\7*\2\2\u01f5\u01f7\5_\60\2\u01f6"+
		"\u01f5\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\u01f9\7+"+
		"\2\2\u01f9\\\3\2\2\2\u01fa\u01fb\7p\2\2\u01fb\u01fc\7g\2\2\u01fc\u01fd"+
		"\7y\2\2\u01fd\u01ff\7\"\2\2\u01fe\u01fa\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff"+
		"\u0203\3\2\2\2\u0200\u0201\7K\2\2\u0201\u0202\7U\2\2\u0202\u0204\7Q\2"+
		"\2\u0203\u0200\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0206"+
		"\7F\2\2\u0206\u0207\7c\2\2\u0207\u0208\7v\2\2\u0208\u0209\7g\2\2\u0209"+
		"^\3\2\2\2\u020a\u020b\7$\2\2\u020b\u020c\5c\62\2\u020c\u020d\7/\2\2\u020d"+
		"\u020e\5e\63\2\u020e\u020f\7/\2\2\u020f\u0210\5g\64\2\u0210\u0211\5\u009d"+
		"O\2\u0211\u0212\5i\65\2\u0212\u0213\7<\2\2\u0213\u0214\5k\66\2\u0214\u0215"+
		"\7<\2\2\u0215\u0216\5m\67\2\u0216\u0217\5a\61\2\u0217\u0218\5\u00a9U\2"+
		"\u0218\u0219\7$\2\2\u0219`\3\2\2\2\u021a\u021b\7\60\2\2\u021b\u021c\t"+
		"\4\2\2\u021c\u021d\t\4\2\2\u021d\u021f\t\4\2\2\u021e\u021a\3\2\2\2\u021e"+
		"\u021f\3\2\2\2\u021fb\3\2\2\2\u0220\u0221\t\4\2\2\u0221\u0222\t\4\2\2"+
		"\u0222\u0223\t\4\2\2\u0223\u0224\t\4\2\2\u0224d\3\2\2\2\u0225\u0226\t"+
		"\4\2\2\u0226\u0227\t\4\2\2\u0227f\3\2\2\2\u0228\u0229\t\4\2\2\u0229\u022a"+
		"\t\4\2\2\u022ah\3\2\2\2\u022b\u022c\t\4\2\2\u022c\u022d\t\4\2\2\u022d"+
		"j\3\2\2\2\u022e\u022f\t\4\2\2\u022f\u0230\t\4\2\2\u0230l\3\2\2\2\u0231"+
		"\u0232\t\4\2\2\u0232\u0233\t\4\2\2\u0233n\3\2\2\2\u0234\u0236\t\7\2\2"+
		"\u0235\u0234\3\2\2\2\u0236\u0239\3\2\2\2\u0237\u0238\3\2\2\2\u0237\u0235"+
		"\3\2\2\2\u0238\u023b\3\2\2\2\u0239\u0237\3\2\2\2\u023a\u023c\t\b\2\2\u023b"+
		"\u023a\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023e\3\2\2\2\u023d\u023b\3\2"+
		"\2\2\u023e\u0242\3\2\2\2\u023f\u0241\t\7\2\2\u0240\u023f\3\2\2\2\u0241"+
		"\u0244\3\2\2\2\u0242\u0240\3\2\2\2\u0242\u0243\3\2\2\2\u0243p\3\2\2\2"+
		"\u0244\u0242\3\2\2\2\u0245\u0247\t\5\2\2\u0246\u0245\3\2\2\2\u0246\u0247"+
		"\3\2\2\2\u0247\u0249\3\2\2\2\u0248\u024a\t\t\2\2\u0249\u0248\3\2\2\2\u024a"+
		"\u024b\3\2\2\2\u024b\u0249\3\2\2\2\u024b\u024c\3\2\2\2\u024cr\3\2\2\2"+
		"\u024d\u024f\t\6\2\2\u024e\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250\u024e"+
		"\3\2\2\2\u0250\u0251\3\2\2\2\u0251t\3\2\2\2\u0252\u0253\t\n\2\2\u0253"+
		"v\3\2\2\2\u0254\u0255\t\13\2\2\u0255x\3\2\2\2\u0256\u0257\t\f\2\2\u0257"+
		"z\3\2\2\2\u0258\u0259\t\r\2\2\u0259|\3\2\2\2\u025a\u025b\t\16\2\2\u025b"+
		"~\3\2\2\2\u025c\u025d\t\17\2\2\u025d\u0080\3\2\2\2\u025e\u025f\t\20\2"+
		"\2\u025f\u0082\3\2\2\2\u0260\u0261\t\21\2\2\u0261\u0084\3\2\2\2\u0262"+
		"\u0263\t\22\2\2\u0263\u0086\3\2\2\2\u0264\u0265\t\23\2\2\u0265\u0088\3"+
		"\2\2\2\u0266\u0267\t\24\2\2\u0267\u008a\3\2\2\2\u0268\u0269\t\25\2\2\u0269"+
		"\u008c\3\2\2\2\u026a\u026b\t\26\2\2\u026b\u008e\3\2\2\2\u026c\u026d\t"+
		"\27\2\2\u026d\u0090\3\2\2\2\u026e\u026f\t\30\2\2\u026f\u0092\3\2\2\2\u0270"+
		"\u0271\t\31\2\2\u0271\u0094\3\2\2\2\u0272\u0273\t\32\2\2\u0273\u0096\3"+
		"\2\2\2\u0274\u0275\t\33\2\2\u0275\u0098\3\2\2\2\u0276\u0277\t\34\2\2\u0277"+
		"\u009a\3\2\2\2\u0278\u0279\t\35\2\2\u0279\u009c\3\2\2\2\u027a\u027b\t"+
		"\36\2\2\u027b\u009e\3\2\2\2\u027c\u027d\t\37\2\2\u027d\u00a0\3\2\2\2\u027e"+
		"\u027f\t \2\2\u027f\u00a2\3\2\2\2\u0280\u0281\t!\2\2\u0281\u00a4\3\2\2"+
		"\2\u0282\u0283\t\"\2\2\u0283\u00a6\3\2\2\2\u0284\u0285\t#\2\2\u0285\u00a8"+
		"\3\2\2\2\u0286\u0287\t$\2\2\u0287\u00aa\3\2\2\2\u0288\u028b\7^\2\2\u0289"+
		"\u028c\t%\2\2\u028a\u028c\5\u00adW\2\u028b\u0289\3\2\2\2\u028b\u028a\3"+
		"\2\2\2\u028c\u00ac\3\2\2\2\u028d\u028e\7w\2\2\u028e\u028f\5\u00afX\2\u028f"+
		"\u0290\5\u00afX\2\u0290\u0291\5\u00afX\2\u0291\u0292\5\u00afX\2\u0292"+
		"\u00ae\3\2\2\2\u0293\u0294\t\n\2\2\u0294\u00b0\3\2\2\2\u0295\u029e\7\62"+
		"\2\2\u0296\u029a\t&\2\2\u0297\u0299\t\4\2\2\u0298\u0297\3\2\2\2\u0299"+
		"\u029c\3\2\2\2\u029a\u0298\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u029e\3\2"+
		"\2\2\u029c\u029a\3\2\2\2\u029d\u0295\3\2\2\2\u029d\u0296\3\2\2\2\u029e"+
		"\u00b2\3\2\2\2\u029f\u02a1\t\17\2\2\u02a0\u02a2\t\'\2\2\u02a1\u02a0\3"+
		"\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a4\5\u00b1Y\2"+
		"\u02a4\u00b4\3\2\2\2\u02a5\u02a6\7h\2\2\u02a6\u02a7\7w\2\2\u02a7\u02a8"+
		"\7p\2\2\u02a8\u02a9\7e\2\2\u02a9\u02aa\7v\2\2\u02aa\u02ab\7k\2\2\u02ab"+
		"\u02ac\7q\2\2\u02ac\u02ad\7p\2\2\u02ad\u00b6\3\2\2\2\36\2\u00ba\u0137"+
		"\u01b4\u01c9\u01cb\u01d1\u01d8\u01db\u01de\u01e4\u01e7\u01ea\u01f0\u01f6"+
		"\u01fe\u0203\u021e\u0237\u023d\u0242\u0246\u024b\u0250\u028b\u029a\u029d"+
		"\u02a1\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}