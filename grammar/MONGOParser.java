// Generated from /home/synerzip/source-code/pankaj-repos/antlr_io/grammar/MONGOParser.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MONGOParser extends Parser {
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
	public static final int
		RULE_mongo_statements = 0, RULE_mongo_statement = 1, RULE_cursor_methods = 2, 
		RULE_aggregate_statement = 3, RULE_intialQuerry = 4, RULE_document = 5, 
		RULE_document_array = 6, RULE_database_methods = 7, RULE_collection_methods = 8, 
		RULE_methodDeclaration = 9, RULE_formalParameters = 10, RULE_formalParameterList = 11, 
		RULE_operations_input_method_input = 12, RULE_operations_input_method = 13, 
		RULE_params_string_or_doc = 14, RULE_params_string = 15, RULE_params_string_string_doc = 16, 
		RULE_params_strings = 17, RULE_params_strings_array_doc = 18, RULE_params_boolean_or_doc = 19, 
		RULE_params_no_arg = 20, RULE_params_jsfunction_args = 21, RULE_parameter = 22, 
		RULE_other_methods = 23, RULE_db_string_or_doc_input_method = 24, RULE_db_string_doc_input_method = 25, 
		RULE_db_string_input_method = 26, RULE_db_strings_input_method = 27, RULE_db_strings_array_doc_input_method = 28, 
		RULE_db_boolean_or_doc_input_method = 29, RULE_db_no_arg_input_method = 30, 
		RULE_db_javascriptfn_args_input_method = 31, RULE_single_doc_input_method = 32, 
		RULE_multiple_doc_input_method = 33, RULE_single_or_multiple_doc_input_method = 34, 
		RULE_query_statements = 35, RULE_json_input = 36, RULE_db_name = 37, RULE_collection_name = 38, 
		RULE_json = 39, RULE_object = 40, RULE_pair = 41, RULE_array = 42, RULE_value = 43;
	public static final String[] ruleNames = {
		"mongo_statements", "mongo_statement", "cursor_methods", "aggregate_statement", 
		"intialQuerry", "document", "document_array", "database_methods", "collection_methods", 
		"methodDeclaration", "formalParameters", "formalParameterList", "operations_input_method_input", 
		"operations_input_method", "params_string_or_doc", "params_string", "params_string_string_doc", 
		"params_strings", "params_strings_array_doc", "params_boolean_or_doc", 
		"params_no_arg", "params_jsfunction_args", "parameter", "other_methods", 
		"db_string_or_doc_input_method", "db_string_doc_input_method", "db_string_input_method", 
		"db_strings_input_method", "db_strings_array_doc_input_method", "db_boolean_or_doc_input_method", 
		"db_no_arg_input_method", "db_javascriptfn_args_input_method", "single_doc_input_method", 
		"multiple_doc_input_method", "single_or_multiple_doc_input_method", "query_statements", 
		"json_input", "db_name", "collection_name", "json", "object", "pair", 
		"array", "value"
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

	@Override
	public String getGrammarFileName() { return "MONGOParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MONGOParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Mongo_statementsContext extends ParserRuleContext {
		public Mongo_statementContext mongo_statement() {
			return getRuleContext(Mongo_statementContext.class,0);
		}
		public Mongo_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mongo_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterMongo_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitMongo_statements(this);
		}
	}

	public final Mongo_statementsContext mongo_statements() throws RecognitionException {
		Mongo_statementsContext _localctx = new Mongo_statementsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mongo_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			mongo_statement();
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

	public static class Mongo_statementContext extends ParserRuleContext {
		public IntialQuerryContext intialQuerry() {
			return getRuleContext(IntialQuerryContext.class,0);
		}
		public List<Collection_methodsContext> collection_methods() {
			return getRuleContexts(Collection_methodsContext.class);
		}
		public Collection_methodsContext collection_methods(int i) {
			return getRuleContext(Collection_methodsContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(MONGOParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(MONGOParser.DOT, i);
		}
		public Db_nameContext db_name() {
			return getRuleContext(Db_nameContext.class,0);
		}
		public Database_methodsContext database_methods() {
			return getRuleContext(Database_methodsContext.class,0);
		}
		public Mongo_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mongo_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterMongo_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitMongo_statement(this);
		}
	}

	public final Mongo_statementContext mongo_statement() throws RecognitionException {
		Mongo_statementContext _localctx = new Mongo_statementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mongo_statement);
		int _la;
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				intialQuerry();
				setState(91);
				collection_methods();
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(92);
					match(DOT);
					setState(93);
					collection_methods();
					}
					}
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				db_name();
				setState(100);
				match(DOT);
				setState(101);
				database_methods();
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

	public static class Cursor_methodsContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(MONGOParser.TEXT, 0); }
		public TerminalNode OPEN_ROUND_BRACKET() { return getToken(MONGOParser.OPEN_ROUND_BRACKET, 0); }
		public TerminalNode CLOSE_ROUND_BRACKET() { return getToken(MONGOParser.CLOSE_ROUND_BRACKET, 0); }
		public Cursor_methodsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursor_methods; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterCursor_methods(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitCursor_methods(this);
		}
	}

	public final Cursor_methodsContext cursor_methods() throws RecognitionException {
		Cursor_methodsContext _localctx = new Cursor_methodsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cursor_methods);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(TEXT);
			setState(106);
			match(OPEN_ROUND_BRACKET);
			setState(107);
			match(CLOSE_ROUND_BRACKET);
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

	public static class Aggregate_statementContext extends ParserRuleContext {
		public TerminalNode AGGREGATE() { return getToken(MONGOParser.AGGREGATE, 0); }
		public Aggregate_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregate_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterAggregate_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitAggregate_statement(this);
		}
	}

	public final Aggregate_statementContext aggregate_statement() throws RecognitionException {
		Aggregate_statementContext _localctx = new Aggregate_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_aggregate_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(AGGREGATE);
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

	public static class IntialQuerryContext extends ParserRuleContext {
		public Db_nameContext db_name() {
			return getRuleContext(Db_nameContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(MONGOParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(MONGOParser.DOT, i);
		}
		public Collection_nameContext collection_name() {
			return getRuleContext(Collection_nameContext.class,0);
		}
		public TerminalNode OPEN_ROUND_BRACKET() { return getToken(MONGOParser.OPEN_ROUND_BRACKET, 0); }
		public TerminalNode STRING() { return getToken(MONGOParser.STRING, 0); }
		public TerminalNode CLOSE_ROUND_BRACKET() { return getToken(MONGOParser.CLOSE_ROUND_BRACKET, 0); }
		public IntialQuerryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intialQuerry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterIntialQuerry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitIntialQuerry(this);
		}
	}

	public final IntialQuerryContext intialQuerry() throws RecognitionException {
		IntialQuerryContext _localctx = new IntialQuerryContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_intialQuerry);
		int _la;
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				db_name();
				setState(112);
				match(DOT);
				setState(113);
				collection_name();
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_ROUND_BRACKET) {
					{
					setState(114);
					match(OPEN_ROUND_BRACKET);
					setState(115);
					match(STRING);
					setState(116);
					match(CLOSE_ROUND_BRACKET);
					}
				}

				setState(119);
				match(DOT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				db_name();
				setState(122);
				match(DOT);
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

	public static class DocumentContext extends ParserRuleContext {
		public TerminalNode OPEN_ROUND_BRACKET() { return getToken(MONGOParser.OPEN_ROUND_BRACKET, 0); }
		public Json_inputContext json_input() {
			return getRuleContext(Json_inputContext.class,0);
		}
		public TerminalNode CLOSE_ROUND_BRACKET() { return getToken(MONGOParser.CLOSE_ROUND_BRACKET, 0); }
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitDocument(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_document);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(OPEN_ROUND_BRACKET);
			setState(127);
			json_input();
			setState(128);
			match(CLOSE_ROUND_BRACKET);
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

	public static class Document_arrayContext extends ParserRuleContext {
		public TerminalNode OPEN_ROUND_BRACKET() { return getToken(MONGOParser.OPEN_ROUND_BRACKET, 0); }
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(MONGOParser.OPEN_SQUARE_BRACKET, 0); }
		public List<Json_inputContext> json_input() {
			return getRuleContexts(Json_inputContext.class);
		}
		public Json_inputContext json_input(int i) {
			return getRuleContext(Json_inputContext.class,i);
		}
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(MONGOParser.CLOSE_SQUARE_BRACKET, 0); }
		public TerminalNode CLOSE_ROUND_BRACKET() { return getToken(MONGOParser.CLOSE_ROUND_BRACKET, 0); }
		public List<TerminalNode> COMMAR_CHAR() { return getTokens(MONGOParser.COMMAR_CHAR); }
		public TerminalNode COMMAR_CHAR(int i) {
			return getToken(MONGOParser.COMMAR_CHAR, i);
		}
		public List<TerminalNode> OPEN_CURLY_BRACKET() { return getTokens(MONGOParser.OPEN_CURLY_BRACKET); }
		public TerminalNode OPEN_CURLY_BRACKET(int i) {
			return getToken(MONGOParser.OPEN_CURLY_BRACKET, i);
		}
		public List<TerminalNode> CLOSE_CURLY_BRACKET() { return getTokens(MONGOParser.CLOSE_CURLY_BRACKET); }
		public TerminalNode CLOSE_CURLY_BRACKET(int i) {
			return getToken(MONGOParser.CLOSE_CURLY_BRACKET, i);
		}
		public Document_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterDocument_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitDocument_array(this);
		}
	}

	public final Document_arrayContext document_array() throws RecognitionException {
		Document_arrayContext _localctx = new Document_arrayContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_document_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(OPEN_ROUND_BRACKET);
			setState(131);
			match(OPEN_SQUARE_BRACKET);
			setState(132);
			json_input();
			setState(133);
			match(CLOSE_SQUARE_BRACKET);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMAR_CHAR) {
				{
				{
				setState(134);
				match(COMMAR_CHAR);
				setState(135);
				match(OPEN_CURLY_BRACKET);
				setState(136);
				json_input();
				setState(137);
				match(CLOSE_CURLY_BRACKET);
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
			match(CLOSE_ROUND_BRACKET);
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

	public static class Database_methodsContext extends ParserRuleContext {
		public Db_string_or_doc_input_methodContext db_string_or_doc_input_method() {
			return getRuleContext(Db_string_or_doc_input_methodContext.class,0);
		}
		public Params_string_or_docContext params_string_or_doc() {
			return getRuleContext(Params_string_or_docContext.class,0);
		}
		public Db_string_doc_input_methodContext db_string_doc_input_method() {
			return getRuleContext(Db_string_doc_input_methodContext.class,0);
		}
		public Params_string_string_docContext params_string_string_doc() {
			return getRuleContext(Params_string_string_docContext.class,0);
		}
		public Db_string_input_methodContext db_string_input_method() {
			return getRuleContext(Db_string_input_methodContext.class,0);
		}
		public Params_stringContext params_string() {
			return getRuleContext(Params_stringContext.class,0);
		}
		public Db_strings_input_methodContext db_strings_input_method() {
			return getRuleContext(Db_strings_input_methodContext.class,0);
		}
		public Params_stringsContext params_strings() {
			return getRuleContext(Params_stringsContext.class,0);
		}
		public Db_strings_array_doc_input_methodContext db_strings_array_doc_input_method() {
			return getRuleContext(Db_strings_array_doc_input_methodContext.class,0);
		}
		public Params_strings_array_docContext params_strings_array_doc() {
			return getRuleContext(Params_strings_array_docContext.class,0);
		}
		public Db_boolean_or_doc_input_methodContext db_boolean_or_doc_input_method() {
			return getRuleContext(Db_boolean_or_doc_input_methodContext.class,0);
		}
		public Params_boolean_or_docContext params_boolean_or_doc() {
			return getRuleContext(Params_boolean_or_docContext.class,0);
		}
		public Db_no_arg_input_methodContext db_no_arg_input_method() {
			return getRuleContext(Db_no_arg_input_methodContext.class,0);
		}
		public Params_no_argContext params_no_arg() {
			return getRuleContext(Params_no_argContext.class,0);
		}
		public Db_javascriptfn_args_input_methodContext db_javascriptfn_args_input_method() {
			return getRuleContext(Db_javascriptfn_args_input_methodContext.class,0);
		}
		public Params_jsfunction_argsContext params_jsfunction_args() {
			return getRuleContext(Params_jsfunction_argsContext.class,0);
		}
		public Database_methodsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_methods; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterDatabase_methods(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitDatabase_methods(this);
		}
	}

	public final Database_methodsContext database_methods() throws RecognitionException {
		Database_methodsContext _localctx = new Database_methodsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_database_methods);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADMINCOMMAND:
				{
				setState(146);
				db_string_or_doc_input_method();
				setState(147);
				params_string_or_doc();
				}
				break;
			case CLONECOLLECTION:
				{
				setState(149);
				db_string_doc_input_method();
				setState(150);
				params_string_string_doc();
				}
				break;
			case CLONEDATABASE:
				{
				setState(152);
				db_string_input_method();
				setState(153);
				params_string();
				}
				break;
			case COPYDATABASE:
				{
				setState(155);
				db_strings_input_method();
				setState(156);
				params_strings();
				}
				break;
			case CREATEVIEW:
				{
				setState(158);
				db_strings_array_doc_input_method();
				setState(159);
				params_strings_array_doc();
				}
				break;
			case CURRENTOP:
				{
				setState(161);
				db_boolean_or_doc_input_method();
				setState(162);
				params_boolean_or_doc();
				}
				break;
			case DROPDATABASE:
				{
				setState(164);
				db_no_arg_input_method();
				setState(165);
				params_no_arg();
				}
				break;
			case EVAL:
				{
				setState(167);
				db_javascriptfn_args_input_method();
				setState(168);
				params_jsfunction_args();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Collection_methodsContext extends ParserRuleContext {
		public Single_doc_input_methodContext single_doc_input_method() {
			return getRuleContext(Single_doc_input_methodContext.class,0);
		}
		public DocumentContext document() {
			return getRuleContext(DocumentContext.class,0);
		}
		public Multiple_doc_input_methodContext multiple_doc_input_method() {
			return getRuleContext(Multiple_doc_input_methodContext.class,0);
		}
		public Document_arrayContext document_array() {
			return getRuleContext(Document_arrayContext.class,0);
		}
		public Single_or_multiple_doc_input_methodContext single_or_multiple_doc_input_method() {
			return getRuleContext(Single_or_multiple_doc_input_methodContext.class,0);
		}
		public Aggregate_statementContext aggregate_statement() {
			return getRuleContext(Aggregate_statementContext.class,0);
		}
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public Query_statementsContext query_statements() {
			return getRuleContext(Query_statementsContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(MONGOParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(MONGOParser.DOT, i);
		}
		public List<Cursor_methodsContext> cursor_methods() {
			return getRuleContexts(Cursor_methodsContext.class);
		}
		public Cursor_methodsContext cursor_methods(int i) {
			return getRuleContext(Cursor_methodsContext.class,i);
		}
		public Operations_input_methodContext operations_input_method() {
			return getRuleContext(Operations_input_methodContext.class,0);
		}
		public Operations_input_method_inputContext operations_input_method_input() {
			return getRuleContext(Operations_input_method_inputContext.class,0);
		}
		public Other_methodsContext other_methods() {
			return getRuleContext(Other_methodsContext.class,0);
		}
		public Collection_methodsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection_methods; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterCollection_methods(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitCollection_methods(this);
		}
	}

	public final Collection_methodsContext collection_methods() throws RecognitionException {
		Collection_methodsContext _localctx = new Collection_methodsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_collection_methods);
		try {
			int _alt;
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case DOT:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case INSERTONE:
			case UPDATEONE:
			case DELETEONE:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				single_doc_input_method();
				setState(174);
				document();
				}
				break;
			case INSERTMANY:
			case UPDATEMANY:
			case DELETEMANY:
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				multiple_doc_input_method();
				setState(177);
				document_array();
				}
				break;
			case INSERT:
			case UPDATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(179);
				single_or_multiple_doc_input_method();
				setState(182);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(180);
					document();
					}
					break;
				case 2:
					{
					setState(181);
					document_array();
					}
					break;
				}
				}
				break;
			case AGGREGATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(184);
				aggregate_statement();
				setState(185);
				parameter();
				}
				break;
			case FIND:
				enterOuterAlt(_localctx, 6);
				{
				setState(187);
				query_statements();
				setState(191);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(188);
					document();
					}
					break;
				case 2:
					{
					setState(189);
					document_array();
					}
					break;
				case 3:
					{
					setState(190);
					parameter();
					}
					break;
				}
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(193);
						match(DOT);
						setState(194);
						cursor_methods();
						}
						} 
					}
					setState(199);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				}
				break;
			case BULKWRITE:
				enterOuterAlt(_localctx, 7);
				{
				setState(200);
				operations_input_method();
				setState(201);
				operations_input_method_input();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 8);
				{
				setState(203);
				other_methods();
				setState(204);
				parameter();
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(MONGOParser.FUNCTION, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode OPEN_CURLY_BRACKET() { return getToken(MONGOParser.OPEN_CURLY_BRACKET, 0); }
		public TerminalNode CLOSE_CURLY_BRACKET() { return getToken(MONGOParser.CLOSE_CURLY_BRACKET, 0); }
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_methodDeclaration);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(FUNCTION);
			setState(209);
			formalParameters();
			{
			setState(210);
			match(OPEN_CURLY_BRACKET);
			setState(214);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(211);
					matchWildcard();
					}
					} 
				}
				setState(216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(217);
			match(CLOSE_CURLY_BRACKET);
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

	public static class FormalParametersContext extends ParserRuleContext {
		public TerminalNode OPEN_ROUND_BRACKET() { return getToken(MONGOParser.OPEN_ROUND_BRACKET, 0); }
		public TerminalNode CLOSE_ROUND_BRACKET() { return getToken(MONGOParser.CLOSE_ROUND_BRACKET, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(OPEN_ROUND_BRACKET);
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALPHA) {
				{
				setState(220);
				formalParameterList();
				}
			}

			setState(223);
			match(CLOSE_ROUND_BRACKET);
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<TerminalNode> ALPHA() { return getTokens(MONGOParser.ALPHA); }
		public TerminalNode ALPHA(int i) {
			return getToken(MONGOParser.ALPHA, i);
		}
		public List<TerminalNode> EQUAL_TO() { return getTokens(MONGOParser.EQUAL_TO); }
		public TerminalNode EQUAL_TO(int i) {
			return getToken(MONGOParser.EQUAL_TO, i);
		}
		public List<TerminalNode> FN_ARG_VAL() { return getTokens(MONGOParser.FN_ARG_VAL); }
		public TerminalNode FN_ARG_VAL(int i) {
			return getToken(MONGOParser.FN_ARG_VAL, i);
		}
		public List<TerminalNode> COMMAR_CHAR() { return getTokens(MONGOParser.COMMAR_CHAR); }
		public TerminalNode COMMAR_CHAR(int i) {
			return getToken(MONGOParser.COMMAR_CHAR, i);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_formalParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(ALPHA);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL_TO) {
				{
				setState(226);
				match(EQUAL_TO);
				setState(227);
				match(FN_ARG_VAL);
				}
			}

			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMAR_CHAR) {
				{
				{
				setState(230);
				match(COMMAR_CHAR);
				setState(231);
				match(ALPHA);
				setState(234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQUAL_TO) {
					{
					setState(232);
					match(EQUAL_TO);
					setState(233);
					match(FN_ARG_VAL);
					}
				}

				}
				}
				setState(240);
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

	public static class Operations_input_method_inputContext extends ParserRuleContext {
		public TerminalNode OPEN_ROUND_BRACKET() { return getToken(MONGOParser.OPEN_ROUND_BRACKET, 0); }
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(MONGOParser.OPEN_SQUARE_BRACKET, 0); }
		public List<TerminalNode> OPEN_CURLY_BRACKET() { return getTokens(MONGOParser.OPEN_CURLY_BRACKET); }
		public TerminalNode OPEN_CURLY_BRACKET(int i) {
			return getToken(MONGOParser.OPEN_CURLY_BRACKET, i);
		}
		public List<TerminalNode> ISTO_CHAR() { return getTokens(MONGOParser.ISTO_CHAR); }
		public TerminalNode ISTO_CHAR(int i) {
			return getToken(MONGOParser.ISTO_CHAR, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> CLOSE_CURLY_BRACKET() { return getTokens(MONGOParser.CLOSE_CURLY_BRACKET); }
		public TerminalNode CLOSE_CURLY_BRACKET(int i) {
			return getToken(MONGOParser.CLOSE_CURLY_BRACKET, i);
		}
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(MONGOParser.CLOSE_SQUARE_BRACKET, 0); }
		public TerminalNode CLOSE_ROUND_BRACKET() { return getToken(MONGOParser.CLOSE_ROUND_BRACKET, 0); }
		public List<TerminalNode> INSERTONE() { return getTokens(MONGOParser.INSERTONE); }
		public TerminalNode INSERTONE(int i) {
			return getToken(MONGOParser.INSERTONE, i);
		}
		public List<TerminalNode> UPDATEONE() { return getTokens(MONGOParser.UPDATEONE); }
		public TerminalNode UPDATEONE(int i) {
			return getToken(MONGOParser.UPDATEONE, i);
		}
		public List<TerminalNode> UPDATEMANY() { return getTokens(MONGOParser.UPDATEMANY); }
		public TerminalNode UPDATEMANY(int i) {
			return getToken(MONGOParser.UPDATEMANY, i);
		}
		public List<TerminalNode> REPLACEONE() { return getTokens(MONGOParser.REPLACEONE); }
		public TerminalNode REPLACEONE(int i) {
			return getToken(MONGOParser.REPLACEONE, i);
		}
		public List<TerminalNode> DELETEONE() { return getTokens(MONGOParser.DELETEONE); }
		public TerminalNode DELETEONE(int i) {
			return getToken(MONGOParser.DELETEONE, i);
		}
		public List<TerminalNode> DELETEMANY() { return getTokens(MONGOParser.DELETEMANY); }
		public TerminalNode DELETEMANY(int i) {
			return getToken(MONGOParser.DELETEMANY, i);
		}
		public List<TerminalNode> COMMAR_CHAR() { return getTokens(MONGOParser.COMMAR_CHAR); }
		public TerminalNode COMMAR_CHAR(int i) {
			return getToken(MONGOParser.COMMAR_CHAR, i);
		}
		public Operations_input_method_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operations_input_method_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterOperations_input_method_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitOperations_input_method_input(this);
		}
	}

	public final Operations_input_method_inputContext operations_input_method_input() throws RecognitionException {
		Operations_input_method_inputContext _localctx = new Operations_input_method_inputContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operations_input_method_input);
		int _la;
		try {
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(OPEN_ROUND_BRACKET);
				setState(242);
				match(OPEN_SQUARE_BRACKET);
				setState(243);
				match(OPEN_CURLY_BRACKET);
				setState(244);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INSERTONE) | (1L << UPDATEMANY) | (1L << UPDATEONE) | (1L << DELETEONE) | (1L << REPLACEONE) | (1L << DELETEMANY))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(245);
				match(ISTO_CHAR);
				setState(246);
				value();
				setState(247);
				match(CLOSE_CURLY_BRACKET);
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMAR_CHAR) {
					{
					{
					setState(248);
					match(COMMAR_CHAR);
					setState(249);
					match(OPEN_CURLY_BRACKET);
					setState(250);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INSERTONE) | (1L << UPDATEMANY) | (1L << UPDATEONE) | (1L << DELETEONE) | (1L << REPLACEONE) | (1L << DELETEMANY))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(251);
					match(ISTO_CHAR);
					setState(252);
					value();
					setState(253);
					match(CLOSE_CURLY_BRACKET);
					}
					}
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(260);
				match(CLOSE_SQUARE_BRACKET);
				setState(261);
				match(CLOSE_ROUND_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				match(OPEN_ROUND_BRACKET);
				{
				setState(264);
				match(OPEN_CURLY_BRACKET);
				setState(265);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INSERTONE) | (1L << UPDATEMANY) | (1L << UPDATEONE) | (1L << DELETEONE) | (1L << REPLACEONE) | (1L << DELETEMANY))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(266);
				match(ISTO_CHAR);
				setState(267);
				value();
				setState(268);
				match(CLOSE_CURLY_BRACKET);
				}
				setState(270);
				match(CLOSE_ROUND_BRACKET);
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

	public static class Operations_input_methodContext extends ParserRuleContext {
		public TerminalNode BULKWRITE() { return getToken(MONGOParser.BULKWRITE, 0); }
		public Operations_input_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operations_input_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterOperations_input_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitOperations_input_method(this);
		}
	}

	public final Operations_input_methodContext operations_input_method() throws RecognitionException {
		Operations_input_methodContext _localctx = new Operations_input_methodContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_operations_input_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(BULKWRITE);
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

	public static class Params_string_or_docContext extends ParserRuleContext {
		public TerminalNode OPEN_ROUND_BRACKET() { return getToken(MONGOParser.OPEN_ROUND_BRACKET, 0); }
		public TerminalNode CLOSE_ROUND_BRACKET() { return getToken(MONGOParser.CLOSE_ROUND_BRACKET, 0); }
		public TerminalNode STRING() { return getToken(MONGOParser.STRING, 0); }
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public Params_string_or_docContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params_string_or_doc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterParams_string_or_doc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitParams_string_or_doc(this);
		}
	}

	public final Params_string_or_docContext params_string_or_doc() throws RecognitionException {
		Params_string_or_docContext _localctx = new Params_string_or_docContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_params_string_or_doc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(OPEN_ROUND_BRACKET);
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(277);
				match(STRING);
				}
				break;
			case OPEN_CURLY_BRACKET:
				{
				setState(278);
				object();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(281);
			match(CLOSE_ROUND_BRACKET);
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

	public static class Params_stringContext extends ParserRuleContext {
		public TerminalNode OPEN_ROUND_BRACKET() { return getToken(MONGOParser.OPEN_ROUND_BRACKET, 0); }
		public TerminalNode CLOSE_ROUND_BRACKET() { return getToken(MONGOParser.CLOSE_ROUND_BRACKET, 0); }
		public TerminalNode STRING() { return getToken(MONGOParser.STRING, 0); }
		public Params_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterParams_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitParams_string(this);
		}
	}

	public final Params_stringContext params_string() throws RecognitionException {
		Params_stringContext _localctx = new Params_stringContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_params_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(OPEN_ROUND_BRACKET);
			{
			setState(284);
			match(STRING);
			}
			setState(285);
			match(CLOSE_ROUND_BRACKET);
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

	public static class Params_string_string_docContext extends ParserRuleContext {
		public TerminalNode OPEN_ROUND_BRACKET() { return getToken(MONGOParser.OPEN_ROUND_BRACKET, 0); }
		public List<TerminalNode> STRING() { return getTokens(MONGOParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MONGOParser.STRING, i);
		}
		public List<TerminalNode> COMMAR_CHAR() { return getTokens(MONGOParser.COMMAR_CHAR); }
		public TerminalNode COMMAR_CHAR(int i) {
			return getToken(MONGOParser.COMMAR_CHAR, i);
		}
		public TerminalNode CLOSE_ROUND_BRACKET() { return getToken(MONGOParser.CLOSE_ROUND_BRACKET, 0); }
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public Params_string_string_docContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params_string_string_doc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterParams_string_string_doc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitParams_string_string_doc(this);
		}
	}

	public final Params_string_string_docContext params_string_string_doc() throws RecognitionException {
		Params_string_string_docContext _localctx = new Params_string_string_docContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_params_string_string_doc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(OPEN_ROUND_BRACKET);
			setState(288);
			match(STRING);
			setState(289);
			match(COMMAR_CHAR);
			setState(290);
			match(STRING);
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMAR_CHAR) {
				{
				setState(291);
				match(COMMAR_CHAR);
				setState(292);
				object();
				}
			}

			setState(295);
			match(CLOSE_ROUND_BRACKET);
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

	public static class Params_stringsContext extends ParserRuleContext {
		public TerminalNode OPEN_ROUND_BRACKET() { return getToken(MONGOParser.OPEN_ROUND_BRACKET, 0); }
		public List<TerminalNode> STRING() { return getTokens(MONGOParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MONGOParser.STRING, i);
		}
		public List<TerminalNode> COMMAR_CHAR() { return getTokens(MONGOParser.COMMAR_CHAR); }
		public TerminalNode COMMAR_CHAR(int i) {
			return getToken(MONGOParser.COMMAR_CHAR, i);
		}
		public TerminalNode CLOSE_ROUND_BRACKET() { return getToken(MONGOParser.CLOSE_ROUND_BRACKET, 0); }
		public Params_stringsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params_strings; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterParams_strings(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitParams_strings(this);
		}
	}

	public final Params_stringsContext params_strings() throws RecognitionException {
		Params_stringsContext _localctx = new Params_stringsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_params_strings);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(OPEN_ROUND_BRACKET);
			setState(298);
			match(STRING);
			setState(299);
			match(COMMAR_CHAR);
			setState(300);
			match(STRING);
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(301);
				match(COMMAR_CHAR);
				setState(302);
				match(STRING);
				}
				break;
			}
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(305);
				match(COMMAR_CHAR);
				setState(306);
				match(STRING);
				}
				break;
			}
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(309);
				match(COMMAR_CHAR);
				setState(310);
				match(STRING);
				}
				break;
			}
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMAR_CHAR) {
				{
				setState(313);
				match(COMMAR_CHAR);
				setState(314);
				match(STRING);
				}
			}

			setState(317);
			match(CLOSE_ROUND_BRACKET);
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

	public static class Params_strings_array_docContext extends ParserRuleContext {
		public TerminalNode OPEN_ROUND_BRACKET() { return getToken(MONGOParser.OPEN_ROUND_BRACKET, 0); }
		public List<TerminalNode> STRING() { return getTokens(MONGOParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MONGOParser.STRING, i);
		}
		public List<TerminalNode> COMMAR_CHAR() { return getTokens(MONGOParser.COMMAR_CHAR); }
		public TerminalNode COMMAR_CHAR(int i) {
			return getToken(MONGOParser.COMMAR_CHAR, i);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode CLOSE_ROUND_BRACKET() { return getToken(MONGOParser.CLOSE_ROUND_BRACKET, 0); }
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public Params_strings_array_docContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params_strings_array_doc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterParams_strings_array_doc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitParams_strings_array_doc(this);
		}
	}

	public final Params_strings_array_docContext params_strings_array_doc() throws RecognitionException {
		Params_strings_array_docContext _localctx = new Params_strings_array_docContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_params_strings_array_doc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(OPEN_ROUND_BRACKET);
			setState(320);
			match(STRING);
			setState(321);
			match(COMMAR_CHAR);
			setState(322);
			match(STRING);
			setState(323);
			array();
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMAR_CHAR) {
				{
				setState(324);
				match(COMMAR_CHAR);
				setState(325);
				object();
				}
			}

			setState(328);
			match(CLOSE_ROUND_BRACKET);
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

	public static class Params_boolean_or_docContext extends ParserRuleContext {
		public TerminalNode OPEN_ROUND_BRACKET() { return getToken(MONGOParser.OPEN_ROUND_BRACKET, 0); }
		public TerminalNode CLOSE_ROUND_BRACKET() { return getToken(MONGOParser.CLOSE_ROUND_BRACKET, 0); }
		public TerminalNode BOOLEAN() { return getToken(MONGOParser.BOOLEAN, 0); }
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public Params_boolean_or_docContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params_boolean_or_doc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterParams_boolean_or_doc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitParams_boolean_or_doc(this);
		}
	}

	public final Params_boolean_or_docContext params_boolean_or_doc() throws RecognitionException {
		Params_boolean_or_docContext _localctx = new Params_boolean_or_docContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_params_boolean_or_doc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(OPEN_ROUND_BRACKET);
			setState(333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
				{
				setState(331);
				match(BOOLEAN);
				}
				break;
			case OPEN_CURLY_BRACKET:
				{
				setState(332);
				object();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(335);
			match(CLOSE_ROUND_BRACKET);
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

	public static class Params_no_argContext extends ParserRuleContext {
		public TerminalNode OPEN_ROUND_BRACKET() { return getToken(MONGOParser.OPEN_ROUND_BRACKET, 0); }
		public TerminalNode CLOSE_ROUND_BRACKET() { return getToken(MONGOParser.CLOSE_ROUND_BRACKET, 0); }
		public Params_no_argContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params_no_arg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterParams_no_arg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitParams_no_arg(this);
		}
	}

	public final Params_no_argContext params_no_arg() throws RecognitionException {
		Params_no_argContext _localctx = new Params_no_argContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_params_no_arg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(OPEN_ROUND_BRACKET);
			setState(338);
			match(CLOSE_ROUND_BRACKET);
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

	public static class Params_jsfunction_argsContext extends ParserRuleContext {
		public TerminalNode OPEN_ROUND_BRACKET() { return getToken(MONGOParser.OPEN_ROUND_BRACKET, 0); }
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public TerminalNode CLOSE_ROUND_BRACKET() { return getToken(MONGOParser.CLOSE_ROUND_BRACKET, 0); }
		public TerminalNode COMMAR_CHAR() { return getToken(MONGOParser.COMMAR_CHAR, 0); }
		public TerminalNode FN_ARG_VAL() { return getToken(MONGOParser.FN_ARG_VAL, 0); }
		public Params_jsfunction_argsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params_jsfunction_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterParams_jsfunction_args(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitParams_jsfunction_args(this);
		}
	}

	public final Params_jsfunction_argsContext params_jsfunction_args() throws RecognitionException {
		Params_jsfunction_argsContext _localctx = new Params_jsfunction_argsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_params_jsfunction_args);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(OPEN_ROUND_BRACKET);
			setState(341);
			methodDeclaration();
			{
			setState(342);
			match(COMMAR_CHAR);
			{
			setState(343);
			match(FN_ARG_VAL);
			}
			}
			setState(345);
			match(CLOSE_ROUND_BRACKET);
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

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode OPEN_ROUND_BRACKET() { return getToken(MONGOParser.OPEN_ROUND_BRACKET, 0); }
		public TerminalNode CLOSE_ROUND_BRACKET() { return getToken(MONGOParser.CLOSE_ROUND_BRACKET, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<Json_inputContext> json_input() {
			return getRuleContexts(Json_inputContext.class);
		}
		public Json_inputContext json_input(int i) {
			return getRuleContext(Json_inputContext.class,i);
		}
		public List<TerminalNode> OPEN_SQUARE_BRACKET() { return getTokens(MONGOParser.OPEN_SQUARE_BRACKET); }
		public TerminalNode OPEN_SQUARE_BRACKET(int i) {
			return getToken(MONGOParser.OPEN_SQUARE_BRACKET, i);
		}
		public List<TerminalNode> CLOSE_SQUARE_BRACKET() { return getTokens(MONGOParser.CLOSE_SQUARE_BRACKET); }
		public TerminalNode CLOSE_SQUARE_BRACKET(int i) {
			return getToken(MONGOParser.CLOSE_SQUARE_BRACKET, i);
		}
		public List<TerminalNode> COMMAR_CHAR() { return getTokens(MONGOParser.COMMAR_CHAR); }
		public TerminalNode COMMAR_CHAR(int i) {
			return getToken(MONGOParser.COMMAR_CHAR, i);
		}
		public List<TerminalNode> OPEN_CURLY_BRACKET() { return getTokens(MONGOParser.OPEN_CURLY_BRACKET); }
		public TerminalNode OPEN_CURLY_BRACKET(int i) {
			return getToken(MONGOParser.OPEN_CURLY_BRACKET, i);
		}
		public List<TerminalNode> CLOSE_CURLY_BRACKET() { return getTokens(MONGOParser.CLOSE_CURLY_BRACKET); }
		public TerminalNode CLOSE_CURLY_BRACKET(int i) {
			return getToken(MONGOParser.CLOSE_CURLY_BRACKET, i);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(OPEN_ROUND_BRACKET);
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TEXT) | (1L << OPEN_SQUARE_BRACKET) | (1L << OPEN_CURLY_BRACKET) | (1L << TRUE) | (1L << FALSE) | (1L << NULL) | (1L << STRING) | (1L << NUMBER) | (1L << DATE))) != 0)) {
				{
				setState(363);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(348);
					value();
					}
					break;
				case 2:
					{
					setState(349);
					json_input();
					}
					break;
				case 3:
					{
					setState(350);
					match(OPEN_SQUARE_BRACKET);
					setState(351);
					json_input();
					setState(352);
					match(CLOSE_SQUARE_BRACKET);
					setState(360);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMAR_CHAR) {
						{
						{
						setState(353);
						match(COMMAR_CHAR);
						setState(354);
						match(OPEN_CURLY_BRACKET);
						setState(355);
						json_input();
						setState(356);
						match(CLOSE_CURLY_BRACKET);
						}
						}
						setState(362);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				}
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(368);
			match(CLOSE_ROUND_BRACKET);
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

	public static class Other_methodsContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(MONGOParser.TEXT, 0); }
		public Other_methodsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other_methods; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterOther_methods(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitOther_methods(this);
		}
	}

	public final Other_methodsContext other_methods() throws RecognitionException {
		Other_methodsContext _localctx = new Other_methodsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_other_methods);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(TEXT);
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

	public static class Db_string_or_doc_input_methodContext extends ParserRuleContext {
		public TerminalNode ADMINCOMMAND() { return getToken(MONGOParser.ADMINCOMMAND, 0); }
		public Db_string_or_doc_input_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_db_string_or_doc_input_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterDb_string_or_doc_input_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitDb_string_or_doc_input_method(this);
		}
	}

	public final Db_string_or_doc_input_methodContext db_string_or_doc_input_method() throws RecognitionException {
		Db_string_or_doc_input_methodContext _localctx = new Db_string_or_doc_input_methodContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_db_string_or_doc_input_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(ADMINCOMMAND);
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

	public static class Db_string_doc_input_methodContext extends ParserRuleContext {
		public TerminalNode CLONECOLLECTION() { return getToken(MONGOParser.CLONECOLLECTION, 0); }
		public Db_string_doc_input_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_db_string_doc_input_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterDb_string_doc_input_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitDb_string_doc_input_method(this);
		}
	}

	public final Db_string_doc_input_methodContext db_string_doc_input_method() throws RecognitionException {
		Db_string_doc_input_methodContext _localctx = new Db_string_doc_input_methodContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_db_string_doc_input_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(CLONECOLLECTION);
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

	public static class Db_string_input_methodContext extends ParserRuleContext {
		public TerminalNode CLONEDATABASE() { return getToken(MONGOParser.CLONEDATABASE, 0); }
		public Db_string_input_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_db_string_input_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterDb_string_input_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitDb_string_input_method(this);
		}
	}

	public final Db_string_input_methodContext db_string_input_method() throws RecognitionException {
		Db_string_input_methodContext _localctx = new Db_string_input_methodContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_db_string_input_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(CLONEDATABASE);
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

	public static class Db_strings_input_methodContext extends ParserRuleContext {
		public TerminalNode COPYDATABASE() { return getToken(MONGOParser.COPYDATABASE, 0); }
		public Db_strings_input_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_db_strings_input_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterDb_strings_input_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitDb_strings_input_method(this);
		}
	}

	public final Db_strings_input_methodContext db_strings_input_method() throws RecognitionException {
		Db_strings_input_methodContext _localctx = new Db_strings_input_methodContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_db_strings_input_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(COPYDATABASE);
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

	public static class Db_strings_array_doc_input_methodContext extends ParserRuleContext {
		public TerminalNode CREATEVIEW() { return getToken(MONGOParser.CREATEVIEW, 0); }
		public Db_strings_array_doc_input_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_db_strings_array_doc_input_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterDb_strings_array_doc_input_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitDb_strings_array_doc_input_method(this);
		}
	}

	public final Db_strings_array_doc_input_methodContext db_strings_array_doc_input_method() throws RecognitionException {
		Db_strings_array_doc_input_methodContext _localctx = new Db_strings_array_doc_input_methodContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_db_strings_array_doc_input_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			match(CREATEVIEW);
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

	public static class Db_boolean_or_doc_input_methodContext extends ParserRuleContext {
		public TerminalNode CURRENTOP() { return getToken(MONGOParser.CURRENTOP, 0); }
		public Db_boolean_or_doc_input_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_db_boolean_or_doc_input_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterDb_boolean_or_doc_input_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitDb_boolean_or_doc_input_method(this);
		}
	}

	public final Db_boolean_or_doc_input_methodContext db_boolean_or_doc_input_method() throws RecognitionException {
		Db_boolean_or_doc_input_methodContext _localctx = new Db_boolean_or_doc_input_methodContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_db_boolean_or_doc_input_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(CURRENTOP);
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

	public static class Db_no_arg_input_methodContext extends ParserRuleContext {
		public TerminalNode DROPDATABASE() { return getToken(MONGOParser.DROPDATABASE, 0); }
		public Db_no_arg_input_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_db_no_arg_input_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterDb_no_arg_input_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitDb_no_arg_input_method(this);
		}
	}

	public final Db_no_arg_input_methodContext db_no_arg_input_method() throws RecognitionException {
		Db_no_arg_input_methodContext _localctx = new Db_no_arg_input_methodContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_db_no_arg_input_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(DROPDATABASE);
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

	public static class Db_javascriptfn_args_input_methodContext extends ParserRuleContext {
		public TerminalNode EVAL() { return getToken(MONGOParser.EVAL, 0); }
		public Db_javascriptfn_args_input_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_db_javascriptfn_args_input_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterDb_javascriptfn_args_input_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitDb_javascriptfn_args_input_method(this);
		}
	}

	public final Db_javascriptfn_args_input_methodContext db_javascriptfn_args_input_method() throws RecognitionException {
		Db_javascriptfn_args_input_methodContext _localctx = new Db_javascriptfn_args_input_methodContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_db_javascriptfn_args_input_method);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(EVAL);
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

	public static class Single_doc_input_methodContext extends ParserRuleContext {
		public TerminalNode INSERTONE() { return getToken(MONGOParser.INSERTONE, 0); }
		public TerminalNode UPDATEONE() { return getToken(MONGOParser.UPDATEONE, 0); }
		public TerminalNode DELETEONE() { return getToken(MONGOParser.DELETEONE, 0); }
		public Single_doc_input_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_doc_input_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterSingle_doc_input_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitSingle_doc_input_method(this);
		}
	}

	public final Single_doc_input_methodContext single_doc_input_method() throws RecognitionException {
		Single_doc_input_methodContext _localctx = new Single_doc_input_methodContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_single_doc_input_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INSERTONE) | (1L << UPDATEONE) | (1L << DELETEONE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Multiple_doc_input_methodContext extends ParserRuleContext {
		public TerminalNode INSERTMANY() { return getToken(MONGOParser.INSERTMANY, 0); }
		public TerminalNode UPDATEMANY() { return getToken(MONGOParser.UPDATEMANY, 0); }
		public TerminalNode DELETEMANY() { return getToken(MONGOParser.DELETEMANY, 0); }
		public Multiple_doc_input_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiple_doc_input_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterMultiple_doc_input_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitMultiple_doc_input_method(this);
		}
	}

	public final Multiple_doc_input_methodContext multiple_doc_input_method() throws RecognitionException {
		Multiple_doc_input_methodContext _localctx = new Multiple_doc_input_methodContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_multiple_doc_input_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INSERTMANY) | (1L << UPDATEMANY) | (1L << DELETEMANY))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Single_or_multiple_doc_input_methodContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(MONGOParser.INSERT, 0); }
		public TerminalNode UPDATE() { return getToken(MONGOParser.UPDATE, 0); }
		public Single_or_multiple_doc_input_methodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_single_or_multiple_doc_input_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterSingle_or_multiple_doc_input_method(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitSingle_or_multiple_doc_input_method(this);
		}
	}

	public final Single_or_multiple_doc_input_methodContext single_or_multiple_doc_input_method() throws RecognitionException {
		Single_or_multiple_doc_input_methodContext _localctx = new Single_or_multiple_doc_input_methodContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_single_or_multiple_doc_input_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			_la = _input.LA(1);
			if ( !(_la==INSERT || _la==UPDATE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Query_statementsContext extends ParserRuleContext {
		public TerminalNode FIND() { return getToken(MONGOParser.FIND, 0); }
		public Query_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterQuery_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitQuery_statements(this);
		}
	}

	public final Query_statementsContext query_statements() throws RecognitionException {
		Query_statementsContext _localctx = new Query_statementsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_query_statements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(FIND);
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

	public static class Json_inputContext extends ParserRuleContext {
		public List<ObjectContext> object() {
			return getRuleContexts(ObjectContext.class);
		}
		public ObjectContext object(int i) {
			return getRuleContext(ObjectContext.class,i);
		}
		public List<TerminalNode> COMMAR_CHAR() { return getTokens(MONGOParser.COMMAR_CHAR); }
		public TerminalNode COMMAR_CHAR(int i) {
			return getToken(MONGOParser.COMMAR_CHAR, i);
		}
		public Json_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterJson_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitJson_input(this);
		}
	}

	public final Json_inputContext json_input() throws RecognitionException {
		Json_inputContext _localctx = new Json_inputContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_json_input);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			object();
			setState(401);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(397);
					match(COMMAR_CHAR);
					setState(398);
					object();
					}
					} 
				}
				setState(403);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class Db_nameContext extends ParserRuleContext {
		public TerminalNode DB() { return getToken(MONGOParser.DB, 0); }
		public Db_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_db_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterDb_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitDb_name(this);
		}
	}

	public final Db_nameContext db_name() throws RecognitionException {
		Db_nameContext _localctx = new Db_nameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_db_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(DB);
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

	public static class Collection_nameContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(MONGOParser.TEXT, 0); }
		public Collection_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collection_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterCollection_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitCollection_name(this);
		}
	}

	public final Collection_nameContext collection_name() throws RecognitionException {
		Collection_nameContext _localctx = new Collection_nameContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_collection_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(TEXT);
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

	public static class JsonContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public JsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterJson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitJson(this);
		}
	}

	public final JsonContext json() throws RecognitionException {
		JsonContext _localctx = new JsonContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			value();
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

	public static class ObjectContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY_BRACKET() { return getToken(MONGOParser.OPEN_CURLY_BRACKET, 0); }
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public TerminalNode CLOSE_CURLY_BRACKET() { return getToken(MONGOParser.CLOSE_CURLY_BRACKET, 0); }
		public List<TerminalNode> COMMAR_CHAR() { return getTokens(MONGOParser.COMMAR_CHAR); }
		public TerminalNode COMMAR_CHAR(int i) {
			return getToken(MONGOParser.COMMAR_CHAR, i);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitObject(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_object);
		int _la;
		try {
			setState(423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(410);
				match(OPEN_CURLY_BRACKET);
				setState(411);
				pair();
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMAR_CHAR) {
					{
					{
					setState(412);
					match(COMMAR_CHAR);
					setState(413);
					pair();
					}
					}
					setState(418);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(419);
				match(CLOSE_CURLY_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(421);
				match(OPEN_CURLY_BRACKET);
				setState(422);
				match(CLOSE_CURLY_BRACKET);
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

	public static class PairContext extends ParserRuleContext {
		public TerminalNode ISTO_CHAR() { return getToken(MONGOParser.ISTO_CHAR, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode STRING() { return getToken(MONGOParser.STRING, 0); }
		public TerminalNode TEXT() { return getToken(MONGOParser.TEXT, 0); }
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitPair(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_pair);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			_la = _input.LA(1);
			if ( !(_la==TEXT || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(426);
			match(ISTO_CHAR);
			setState(427);
			value();
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
		public TerminalNode OPEN_SQUARE_BRACKET() { return getToken(MONGOParser.OPEN_SQUARE_BRACKET, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode CLOSE_SQUARE_BRACKET() { return getToken(MONGOParser.CLOSE_SQUARE_BRACKET, 0); }
		public List<TerminalNode> COMMAR_CHAR() { return getTokens(MONGOParser.COMMAR_CHAR); }
		public TerminalNode COMMAR_CHAR(int i) {
			return getToken(MONGOParser.COMMAR_CHAR, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_array);
		int _la;
		try {
			setState(442);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				match(OPEN_SQUARE_BRACKET);
				setState(430);
				value();
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMAR_CHAR) {
					{
					{
					setState(431);
					match(COMMAR_CHAR);
					setState(432);
					value();
					}
					}
					setState(437);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(438);
				match(CLOSE_SQUARE_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
				match(OPEN_SQUARE_BRACKET);
				setState(441);
				match(CLOSE_SQUARE_BRACKET);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(MONGOParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(MONGOParser.NUMBER, 0); }
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode TRUE() { return getToken(MONGOParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(MONGOParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(MONGOParser.NULL, 0); }
		public TerminalNode TEXT() { return getToken(MONGOParser.TEXT, 0); }
		public TerminalNode DATE() { return getToken(MONGOParser.DATE, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MONGOParserListener ) ((MONGOParserListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_value);
		try {
			setState(453);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(444);
				match(STRING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(445);
				match(NUMBER);
				}
				break;
			case OPEN_CURLY_BRACKET:
				enterOuterAlt(_localctx, 3);
				{
				setState(446);
				object();
				}
				break;
			case OPEN_SQUARE_BRACKET:
				enterOuterAlt(_localctx, 4);
				{
				setState(447);
				array();
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(448);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(449);
				match(FALSE);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 7);
				{
				setState(450);
				match(NULL);
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 8);
				{
				setState(451);
				match(TEXT);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 9);
				{
				setState(452);
				match(DATE);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u01ca\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\3\3\3\3\3\3\3\7\3a\n\3\f\3\16\3d\13\3\3\3\3\3\3\3"+
		"\3\3\5\3j\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6x\n\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6\177\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\7\b\u008e\n\b\f\b\16\b\u0091\13\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u00ad\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u00b9\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00c2\n\n\3\n\3\n\7\n\u00c6"+
		"\n\n\f\n\16\n\u00c9\13\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00d1\n\n\3\13\3"+
		"\13\3\13\3\13\7\13\u00d7\n\13\f\13\16\13\u00da\13\13\3\13\3\13\3\f\3\f"+
		"\5\f\u00e0\n\f\3\f\3\f\3\r\3\r\3\r\5\r\u00e7\n\r\3\r\3\r\3\r\3\r\5\r\u00ed"+
		"\n\r\7\r\u00ef\n\r\f\r\16\r\u00f2\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0102\n\16\f\16\16\16\u0105"+
		"\13\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u0113\n\16\3\17\3\17\3\20\3\20\3\20\5\20\u011a\n\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0128\n\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0132\n\23\3\23\3\23\5\23\u0136\n"+
		"\23\3\23\3\23\5\23\u013a\n\23\3\23\3\23\5\23\u013e\n\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0149\n\24\3\24\3\24\3\25\3\25\3\25"+
		"\5\25\u0150\n\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0169"+
		"\n\30\f\30\16\30\u016c\13\30\7\30\u016e\n\30\f\30\16\30\u0171\13\30\3"+
		"\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3"+
		"\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\7&\u0192\n&\f"+
		"&\16&\u0195\13&\3\'\3\'\3(\3(\3)\3)\3*\3*\3*\3*\7*\u01a1\n*\f*\16*\u01a4"+
		"\13*\3*\3*\3*\3*\5*\u01aa\n*\3+\3+\3+\3+\3,\3,\3,\3,\7,\u01b4\n,\f,\16"+
		",\u01b7\13,\3,\3,\3,\3,\5,\u01bd\n,\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u01c8"+
		"\n-\3-\4\u00d8\u0193\2.\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\62\64\668:<>@BDFHJLNPRTVX\2\7\4\2\b\b\13\17\4\2\b\b\f\r\5\2\t\t"+
		"\13\13\17\17\4\2\7\7\n\n\4\2\34\34,,\2\u01d4\2Z\3\2\2\2\4i\3\2\2\2\6k"+
		"\3\2\2\2\bo\3\2\2\2\n~\3\2\2\2\f\u0080\3\2\2\2\16\u0084\3\2\2\2\20\u00ac"+
		"\3\2\2\2\22\u00d0\3\2\2\2\24\u00d2\3\2\2\2\26\u00dd\3\2\2\2\30\u00e3\3"+
		"\2\2\2\32\u0112\3\2\2\2\34\u0114\3\2\2\2\36\u0116\3\2\2\2 \u011d\3\2\2"+
		"\2\"\u0121\3\2\2\2$\u012b\3\2\2\2&\u0141\3\2\2\2(\u014c\3\2\2\2*\u0153"+
		"\3\2\2\2,\u0156\3\2\2\2.\u015d\3\2\2\2\60\u0174\3\2\2\2\62\u0176\3\2\2"+
		"\2\64\u0178\3\2\2\2\66\u017a\3\2\2\28\u017c\3\2\2\2:\u017e\3\2\2\2<\u0180"+
		"\3\2\2\2>\u0182\3\2\2\2@\u0184\3\2\2\2B\u0186\3\2\2\2D\u0188\3\2\2\2F"+
		"\u018a\3\2\2\2H\u018c\3\2\2\2J\u018e\3\2\2\2L\u0196\3\2\2\2N\u0198\3\2"+
		"\2\2P\u019a\3\2\2\2R\u01a9\3\2\2\2T\u01ab\3\2\2\2V\u01bc\3\2\2\2X\u01c7"+
		"\3\2\2\2Z[\5\4\3\2[\3\3\2\2\2\\]\5\n\6\2]b\5\22\n\2^_\7\36\2\2_a\5\22"+
		"\n\2`^\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2cj\3\2\2\2db\3\2\2\2ef\5L"+
		"\'\2fg\7\36\2\2gh\5\20\t\2hj\3\2\2\2i\\\3\2\2\2ie\3\2\2\2j\5\3\2\2\2k"+
		"l\7\34\2\2lm\7\37\2\2mn\7 \2\2n\7\3\2\2\2op\7\20\2\2p\t\3\2\2\2qr\5L\'"+
		"\2rs\7\36\2\2sw\5N(\2tu\7\37\2\2uv\7,\2\2vx\7 \2\2wt\3\2\2\2wx\3\2\2\2"+
		"xy\3\2\2\2yz\7\36\2\2z\177\3\2\2\2{|\5L\'\2|}\7\36\2\2}\177\3\2\2\2~q"+
		"\3\2\2\2~{\3\2\2\2\177\13\3\2\2\2\u0080\u0081\7\37\2\2\u0081\u0082\5J"+
		"&\2\u0082\u0083\7 \2\2\u0083\r\3\2\2\2\u0084\u0085\7\37\2\2\u0085\u0086"+
		"\7!\2\2\u0086\u0087\5J&\2\u0087\u008f\7\"\2\2\u0088\u0089\7&\2\2\u0089"+
		"\u008a\7#\2\2\u008a\u008b\5J&\2\u008b\u008c\7$\2\2\u008c\u008e\3\2\2\2"+
		"\u008d\u0088\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090"+
		"\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\7 \2\2\u0093"+
		"\17\3\2\2\2\u0094\u0095\5\62\32\2\u0095\u0096\5\36\20\2\u0096\u00ad\3"+
		"\2\2\2\u0097\u0098\5\64\33\2\u0098\u0099\5\"\22\2\u0099\u00ad\3\2\2\2"+
		"\u009a\u009b\5\66\34\2\u009b\u009c\5 \21\2\u009c\u00ad\3\2\2\2\u009d\u009e"+
		"\58\35\2\u009e\u009f\5$\23\2\u009f\u00ad\3\2\2\2\u00a0\u00a1\5:\36\2\u00a1"+
		"\u00a2\5&\24\2\u00a2\u00ad\3\2\2\2\u00a3\u00a4\5<\37\2\u00a4\u00a5\5("+
		"\25\2\u00a5\u00ad\3\2\2\2\u00a6\u00a7\5> \2\u00a7\u00a8\5*\26\2\u00a8"+
		"\u00ad\3\2\2\2\u00a9\u00aa\5@!\2\u00aa\u00ab\5,\27\2\u00ab\u00ad\3\2\2"+
		"\2\u00ac\u0094\3\2\2\2\u00ac\u0097\3\2\2\2\u00ac\u009a\3\2\2\2\u00ac\u009d"+
		"\3\2\2\2\u00ac\u00a0\3\2\2\2\u00ac\u00a3\3\2\2\2\u00ac\u00a6\3\2\2\2\u00ac"+
		"\u00a9\3\2\2\2\u00ad\21\3\2\2\2\u00ae\u00d1\3\2\2\2\u00af\u00b0\5B\"\2"+
		"\u00b0\u00b1\5\f\7\2\u00b1\u00d1\3\2\2\2\u00b2\u00b3\5D#\2\u00b3\u00b4"+
		"\5\16\b\2\u00b4\u00d1\3\2\2\2\u00b5\u00b8\5F$\2\u00b6\u00b9\5\f\7\2\u00b7"+
		"\u00b9\5\16\b\2\u00b8\u00b6\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00d1\3"+
		"\2\2\2\u00ba\u00bb\5\b\5\2\u00bb\u00bc\5.\30\2\u00bc\u00d1\3\2\2\2\u00bd"+
		"\u00c1\5H%\2\u00be\u00c2\5\f\7\2\u00bf\u00c2\5\16\b\2\u00c0\u00c2\5.\30"+
		"\2\u00c1\u00be\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c7"+
		"\3\2\2\2\u00c3\u00c4\7\36\2\2\u00c4\u00c6\5\6\4\2\u00c5\u00c3\3\2\2\2"+
		"\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00d1"+
		"\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\5\34\17\2\u00cb\u00cc\5\32\16"+
		"\2\u00cc\u00d1\3\2\2\2\u00cd\u00ce\5\60\31\2\u00ce\u00cf\5.\30\2\u00cf"+
		"\u00d1\3\2\2\2\u00d0\u00ae\3\2\2\2\u00d0\u00af\3\2\2\2\u00d0\u00b2\3\2"+
		"\2\2\u00d0\u00b5\3\2\2\2\u00d0\u00ba\3\2\2\2\u00d0\u00bd\3\2\2\2\u00d0"+
		"\u00ca\3\2\2\2\u00d0\u00cd\3\2\2\2\u00d1\23\3\2\2\2\u00d2\u00d3\7\4\2"+
		"\2\u00d3\u00d4\5\26\f\2\u00d4\u00d8\7#\2\2\u00d5\u00d7\13\2\2\2\u00d6"+
		"\u00d5\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d8\u00d6\3\2"+
		"\2\2\u00d9\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dc\7$\2\2\u00dc"+
		"\25\3\2\2\2\u00dd\u00df\7\37\2\2\u00de\u00e0\5\30\r\2\u00df\u00de\3\2"+
		"\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\7 \2\2\u00e2"+
		"\27\3\2\2\2\u00e3\u00e6\7\33\2\2\u00e4\u00e5\7\'\2\2\u00e5\u00e7\7\22"+
		"\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00f0\3\2\2\2\u00e8"+
		"\u00e9\7&\2\2\u00e9\u00ec\7\33\2\2\u00ea\u00eb\7\'\2\2\u00eb\u00ed\7\22"+
		"\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee"+
		"\u00e8\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2"+
		"\2\2\u00f1\31\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f4\7\37\2\2\u00f4\u00f5"+
		"\7!\2\2\u00f5\u00f6\7#\2\2\u00f6\u00f7\t\2\2\2\u00f7\u00f8\7%\2\2\u00f8"+
		"\u00f9\5X-\2\u00f9\u0103\7$\2\2\u00fa\u00fb\7&\2\2\u00fb\u00fc\7#\2\2"+
		"\u00fc\u00fd\t\2\2\2\u00fd\u00fe\7%\2\2\u00fe\u00ff\5X-\2\u00ff\u0100"+
		"\7$\2\2\u0100\u0102\3\2\2\2\u0101\u00fa\3\2\2\2\u0102\u0105\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u0103\3\2"+
		"\2\2\u0106\u0107\7\"\2\2\u0107\u0108\7 \2\2\u0108\u0113\3\2\2\2\u0109"+
		"\u010a\7\37\2\2\u010a\u010b\7#\2\2\u010b\u010c\t\2\2\2\u010c\u010d\7%"+
		"\2\2\u010d\u010e\5X-\2\u010e\u010f\7$\2\2\u010f\u0110\3\2\2\2\u0110\u0111"+
		"\7 \2\2\u0111\u0113\3\2\2\2\u0112\u00f3\3\2\2\2\u0112\u0109\3\2\2\2\u0113"+
		"\33\3\2\2\2\u0114\u0115\7\21\2\2\u0115\35\3\2\2\2\u0116\u0119\7\37\2\2"+
		"\u0117\u011a\7,\2\2\u0118\u011a\5R*\2\u0119\u0117\3\2\2\2\u0119\u0118"+
		"\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\7 \2\2\u011c\37\3\2\2\2\u011d"+
		"\u011e\7\37\2\2\u011e\u011f\7,\2\2\u011f\u0120\7 \2\2\u0120!\3\2\2\2\u0121"+
		"\u0122\7\37\2\2\u0122\u0123\7,\2\2\u0123\u0124\7&\2\2\u0124\u0127\7,\2"+
		"\2\u0125\u0126\7&\2\2\u0126\u0128\5R*\2\u0127\u0125\3\2\2\2\u0127\u0128"+
		"\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\7 \2\2\u012a#\3\2\2\2\u012b\u012c"+
		"\7\37\2\2\u012c\u012d\7,\2\2\u012d\u012e\7&\2\2\u012e\u0131\7,\2\2\u012f"+
		"\u0130\7&\2\2\u0130\u0132\7,\2\2\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2"+
		"\2\u0132\u0135\3\2\2\2\u0133\u0134\7&\2\2\u0134\u0136\7,\2\2\u0135\u0133"+
		"\3\2\2\2\u0135\u0136\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0138\7&\2\2\u0138"+
		"\u013a\7,\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013d\3\2"+
		"\2\2\u013b\u013c\7&\2\2\u013c\u013e\7,\2\2\u013d\u013b\3\2\2\2\u013d\u013e"+
		"\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\7 \2\2\u0140%\3\2\2\2\u0141\u0142"+
		"\7\37\2\2\u0142\u0143\7,\2\2\u0143\u0144\7&\2\2\u0144\u0145\7,\2\2\u0145"+
		"\u0148\5V,\2\u0146\u0147\7&\2\2\u0147\u0149\5R*\2\u0148\u0146\3\2\2\2"+
		"\u0148\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\7 \2\2\u014b\'\3"+
		"\2\2\2\u014c\u014f\7\37\2\2\u014d\u0150\7(\2\2\u014e\u0150\5R*\2\u014f"+
		"\u014d\3\2\2\2\u014f\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\7 "+
		"\2\2\u0152)\3\2\2\2\u0153\u0154\7\37\2\2\u0154\u0155\7 \2\2\u0155+\3\2"+
		"\2\2\u0156\u0157\7\37\2\2\u0157\u0158\5\24\13\2\u0158\u0159\7&\2\2\u0159"+
		"\u015a\7\22\2\2\u015a\u015b\3\2\2\2\u015b\u015c\7 \2\2\u015c-\3\2\2\2"+
		"\u015d\u016f\7\37\2\2\u015e\u016e\5X-\2\u015f\u016e\5J&\2\u0160\u0161"+
		"\7!\2\2\u0161\u0162\5J&\2\u0162\u016a\7\"\2\2\u0163\u0164\7&\2\2\u0164"+
		"\u0165\7#\2\2\u0165\u0166\5J&\2\u0166\u0167\7$\2\2\u0167\u0169\3\2\2\2"+
		"\u0168\u0163\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b"+
		"\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u015e\3\2\2\2\u016d"+
		"\u015f\3\2\2\2\u016d\u0160\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u016d\3\2"+
		"\2\2\u016f\u0170\3\2\2\2\u0170\u0172\3\2\2\2\u0171\u016f\3\2\2\2\u0172"+
		"\u0173\7 \2\2\u0173/\3\2\2\2\u0174\u0175\7\34\2\2\u0175\61\3\2\2\2\u0176"+
		"\u0177\7\23\2\2\u0177\63\3\2\2\2\u0178\u0179\7\24\2\2\u0179\65\3\2\2\2"+
		"\u017a\u017b\7\25\2\2\u017b\67\3\2\2\2\u017c\u017d\7\26\2\2\u017d9\3\2"+
		"\2\2\u017e\u017f\7\27\2\2\u017f;\3\2\2\2\u0180\u0181\7\30\2\2\u0181=\3"+
		"\2\2\2\u0182\u0183\7\31\2\2\u0183?\3\2\2\2\u0184\u0185\7\32\2\2\u0185"+
		"A\3\2\2\2\u0186\u0187\t\3\2\2\u0187C\3\2\2\2\u0188\u0189\t\4\2\2\u0189"+
		"E\3\2\2\2\u018a\u018b\t\5\2\2\u018bG\3\2\2\2\u018c\u018d\7\6\2\2\u018d"+
		"I\3\2\2\2\u018e\u0193\5R*\2\u018f\u0190\7&\2\2\u0190\u0192\5R*\2\u0191"+
		"\u018f\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0194\3\2\2\2\u0193\u0191\3\2"+
		"\2\2\u0194K\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0197\7\5\2\2\u0197M\3\2"+
		"\2\2\u0198\u0199\7\34\2\2\u0199O\3\2\2\2\u019a\u019b\5X-\2\u019bQ\3\2"+
		"\2\2\u019c\u019d\7#\2\2\u019d\u01a2\5T+\2\u019e\u019f\7&\2\2\u019f\u01a1"+
		"\5T+\2\u01a0\u019e\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2"+
		"\u01a3\3\2\2\2\u01a3\u01a5\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01a6\7$"+
		"\2\2\u01a6\u01aa\3\2\2\2\u01a7\u01a8\7#\2\2\u01a8\u01aa\7$\2\2\u01a9\u019c"+
		"\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aaS\3\2\2\2\u01ab\u01ac\t\6\2\2\u01ac"+
		"\u01ad\7%\2\2\u01ad\u01ae\5X-\2\u01aeU\3\2\2\2\u01af\u01b0\7!\2\2\u01b0"+
		"\u01b5\5X-\2\u01b1\u01b2\7&\2\2\u01b2\u01b4\5X-\2\u01b3\u01b1\3\2\2\2"+
		"\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b8"+
		"\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01b9\7\"\2\2\u01b9\u01bd\3\2\2\2\u01ba"+
		"\u01bb\7!\2\2\u01bb\u01bd\7\"\2\2\u01bc\u01af\3\2\2\2\u01bc\u01ba\3\2"+
		"\2\2\u01bdW\3\2\2\2\u01be\u01c8\7,\2\2\u01bf\u01c8\7-\2\2\u01c0\u01c8"+
		"\5R*\2\u01c1\u01c8\5V,\2\u01c2\u01c8\7)\2\2\u01c3\u01c8\7*\2\2\u01c4\u01c8"+
		"\7+\2\2\u01c5\u01c8\7\34\2\2\u01c6\u01c8\7/\2\2\u01c7\u01be\3\2\2\2\u01c7"+
		"\u01bf\3\2\2\2\u01c7\u01c0\3\2\2\2\u01c7\u01c1\3\2\2\2\u01c7\u01c2\3\2"+
		"\2\2\u01c7\u01c3\3\2\2\2\u01c7\u01c4\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7"+
		"\u01c6\3\2\2\2\u01c8Y\3\2\2\2$biw~\u008f\u00ac\u00b8\u00c1\u00c7\u00d0"+
		"\u00d8\u00df\u00e6\u00ec\u00f0\u0103\u0112\u0119\u0127\u0131\u0135\u0139"+
		"\u013d\u0148\u014f\u016a\u016d\u016f\u0193\u01a2\u01a9\u01b5\u01bc\u01c7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}