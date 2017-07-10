// Generated from /home/synerzip/source-code/pankaj-repos/antlr_io/grammar/MONGOParser.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MONGOParser}.
 */
public interface MONGOParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MONGOParser#mongo_statements}.
	 * @param ctx the parse tree
	 */
	void enterMongo_statements(MONGOParser.Mongo_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#mongo_statements}.
	 * @param ctx the parse tree
	 */
	void exitMongo_statements(MONGOParser.Mongo_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#mongo_statement}.
	 * @param ctx the parse tree
	 */
	void enterMongo_statement(MONGOParser.Mongo_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#mongo_statement}.
	 * @param ctx the parse tree
	 */
	void exitMongo_statement(MONGOParser.Mongo_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#cursor_methods}.
	 * @param ctx the parse tree
	 */
	void enterCursor_methods(MONGOParser.Cursor_methodsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#cursor_methods}.
	 * @param ctx the parse tree
	 */
	void exitCursor_methods(MONGOParser.Cursor_methodsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#aggregate_statement}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_statement(MONGOParser.Aggregate_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#aggregate_statement}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_statement(MONGOParser.Aggregate_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#intialQuerry}.
	 * @param ctx the parse tree
	 */
	void enterIntialQuerry(MONGOParser.IntialQuerryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#intialQuerry}.
	 * @param ctx the parse tree
	 */
	void exitIntialQuerry(MONGOParser.IntialQuerryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#document}.
	 * @param ctx the parse tree
	 */
	void enterDocument(MONGOParser.DocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#document}.
	 * @param ctx the parse tree
	 */
	void exitDocument(MONGOParser.DocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#document_array}.
	 * @param ctx the parse tree
	 */
	void enterDocument_array(MONGOParser.Document_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#document_array}.
	 * @param ctx the parse tree
	 */
	void exitDocument_array(MONGOParser.Document_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#database_methods}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_methods(MONGOParser.Database_methodsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#database_methods}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_methods(MONGOParser.Database_methodsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#collection_methods}.
	 * @param ctx the parse tree
	 */
	void enterCollection_methods(MONGOParser.Collection_methodsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#collection_methods}.
	 * @param ctx the parse tree
	 */
	void exitCollection_methods(MONGOParser.Collection_methodsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(MONGOParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(MONGOParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(MONGOParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(MONGOParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(MONGOParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(MONGOParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#operations_input_method_input}.
	 * @param ctx the parse tree
	 */
	void enterOperations_input_method_input(MONGOParser.Operations_input_method_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#operations_input_method_input}.
	 * @param ctx the parse tree
	 */
	void exitOperations_input_method_input(MONGOParser.Operations_input_method_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#operations_input_method}.
	 * @param ctx the parse tree
	 */
	void enterOperations_input_method(MONGOParser.Operations_input_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#operations_input_method}.
	 * @param ctx the parse tree
	 */
	void exitOperations_input_method(MONGOParser.Operations_input_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#params_string_or_doc}.
	 * @param ctx the parse tree
	 */
	void enterParams_string_or_doc(MONGOParser.Params_string_or_docContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#params_string_or_doc}.
	 * @param ctx the parse tree
	 */
	void exitParams_string_or_doc(MONGOParser.Params_string_or_docContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#params_string}.
	 * @param ctx the parse tree
	 */
	void enterParams_string(MONGOParser.Params_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#params_string}.
	 * @param ctx the parse tree
	 */
	void exitParams_string(MONGOParser.Params_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#params_string_string_doc}.
	 * @param ctx the parse tree
	 */
	void enterParams_string_string_doc(MONGOParser.Params_string_string_docContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#params_string_string_doc}.
	 * @param ctx the parse tree
	 */
	void exitParams_string_string_doc(MONGOParser.Params_string_string_docContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#params_strings}.
	 * @param ctx the parse tree
	 */
	void enterParams_strings(MONGOParser.Params_stringsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#params_strings}.
	 * @param ctx the parse tree
	 */
	void exitParams_strings(MONGOParser.Params_stringsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#params_strings_array_doc}.
	 * @param ctx the parse tree
	 */
	void enterParams_strings_array_doc(MONGOParser.Params_strings_array_docContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#params_strings_array_doc}.
	 * @param ctx the parse tree
	 */
	void exitParams_strings_array_doc(MONGOParser.Params_strings_array_docContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#params_boolean_or_doc}.
	 * @param ctx the parse tree
	 */
	void enterParams_boolean_or_doc(MONGOParser.Params_boolean_or_docContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#params_boolean_or_doc}.
	 * @param ctx the parse tree
	 */
	void exitParams_boolean_or_doc(MONGOParser.Params_boolean_or_docContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#params_no_arg}.
	 * @param ctx the parse tree
	 */
	void enterParams_no_arg(MONGOParser.Params_no_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#params_no_arg}.
	 * @param ctx the parse tree
	 */
	void exitParams_no_arg(MONGOParser.Params_no_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#params_jsfunction_args}.
	 * @param ctx the parse tree
	 */
	void enterParams_jsfunction_args(MONGOParser.Params_jsfunction_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#params_jsfunction_args}.
	 * @param ctx the parse tree
	 */
	void exitParams_jsfunction_args(MONGOParser.Params_jsfunction_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(MONGOParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(MONGOParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#other_methods}.
	 * @param ctx the parse tree
	 */
	void enterOther_methods(MONGOParser.Other_methodsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#other_methods}.
	 * @param ctx the parse tree
	 */
	void exitOther_methods(MONGOParser.Other_methodsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#db_string_or_doc_input_method}.
	 * @param ctx the parse tree
	 */
	void enterDb_string_or_doc_input_method(MONGOParser.Db_string_or_doc_input_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#db_string_or_doc_input_method}.
	 * @param ctx the parse tree
	 */
	void exitDb_string_or_doc_input_method(MONGOParser.Db_string_or_doc_input_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#db_string_doc_input_method}.
	 * @param ctx the parse tree
	 */
	void enterDb_string_doc_input_method(MONGOParser.Db_string_doc_input_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#db_string_doc_input_method}.
	 * @param ctx the parse tree
	 */
	void exitDb_string_doc_input_method(MONGOParser.Db_string_doc_input_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#db_string_input_method}.
	 * @param ctx the parse tree
	 */
	void enterDb_string_input_method(MONGOParser.Db_string_input_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#db_string_input_method}.
	 * @param ctx the parse tree
	 */
	void exitDb_string_input_method(MONGOParser.Db_string_input_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#db_strings_input_method}.
	 * @param ctx the parse tree
	 */
	void enterDb_strings_input_method(MONGOParser.Db_strings_input_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#db_strings_input_method}.
	 * @param ctx the parse tree
	 */
	void exitDb_strings_input_method(MONGOParser.Db_strings_input_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#db_strings_array_doc_input_method}.
	 * @param ctx the parse tree
	 */
	void enterDb_strings_array_doc_input_method(MONGOParser.Db_strings_array_doc_input_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#db_strings_array_doc_input_method}.
	 * @param ctx the parse tree
	 */
	void exitDb_strings_array_doc_input_method(MONGOParser.Db_strings_array_doc_input_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#db_boolean_or_doc_input_method}.
	 * @param ctx the parse tree
	 */
	void enterDb_boolean_or_doc_input_method(MONGOParser.Db_boolean_or_doc_input_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#db_boolean_or_doc_input_method}.
	 * @param ctx the parse tree
	 */
	void exitDb_boolean_or_doc_input_method(MONGOParser.Db_boolean_or_doc_input_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#db_no_arg_input_method}.
	 * @param ctx the parse tree
	 */
	void enterDb_no_arg_input_method(MONGOParser.Db_no_arg_input_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#db_no_arg_input_method}.
	 * @param ctx the parse tree
	 */
	void exitDb_no_arg_input_method(MONGOParser.Db_no_arg_input_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#db_javascriptfn_args_input_method}.
	 * @param ctx the parse tree
	 */
	void enterDb_javascriptfn_args_input_method(MONGOParser.Db_javascriptfn_args_input_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#db_javascriptfn_args_input_method}.
	 * @param ctx the parse tree
	 */
	void exitDb_javascriptfn_args_input_method(MONGOParser.Db_javascriptfn_args_input_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#single_doc_input_method}.
	 * @param ctx the parse tree
	 */
	void enterSingle_doc_input_method(MONGOParser.Single_doc_input_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#single_doc_input_method}.
	 * @param ctx the parse tree
	 */
	void exitSingle_doc_input_method(MONGOParser.Single_doc_input_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#multiple_doc_input_method}.
	 * @param ctx the parse tree
	 */
	void enterMultiple_doc_input_method(MONGOParser.Multiple_doc_input_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#multiple_doc_input_method}.
	 * @param ctx the parse tree
	 */
	void exitMultiple_doc_input_method(MONGOParser.Multiple_doc_input_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#single_or_multiple_doc_input_method}.
	 * @param ctx the parse tree
	 */
	void enterSingle_or_multiple_doc_input_method(MONGOParser.Single_or_multiple_doc_input_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#single_or_multiple_doc_input_method}.
	 * @param ctx the parse tree
	 */
	void exitSingle_or_multiple_doc_input_method(MONGOParser.Single_or_multiple_doc_input_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#query_statements}.
	 * @param ctx the parse tree
	 */
	void enterQuery_statements(MONGOParser.Query_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#query_statements}.
	 * @param ctx the parse tree
	 */
	void exitQuery_statements(MONGOParser.Query_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#json_input}.
	 * @param ctx the parse tree
	 */
	void enterJson_input(MONGOParser.Json_inputContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#json_input}.
	 * @param ctx the parse tree
	 */
	void exitJson_input(MONGOParser.Json_inputContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#db_name}.
	 * @param ctx the parse tree
	 */
	void enterDb_name(MONGOParser.Db_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#db_name}.
	 * @param ctx the parse tree
	 */
	void exitDb_name(MONGOParser.Db_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#collection_name}.
	 * @param ctx the parse tree
	 */
	void enterCollection_name(MONGOParser.Collection_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#collection_name}.
	 * @param ctx the parse tree
	 */
	void exitCollection_name(MONGOParser.Collection_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#json}.
	 * @param ctx the parse tree
	 */
	void enterJson(MONGOParser.JsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#json}.
	 * @param ctx the parse tree
	 */
	void exitJson(MONGOParser.JsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(MONGOParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(MONGOParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(MONGOParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(MONGOParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(MONGOParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(MONGOParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link MONGOParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(MONGOParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MONGOParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(MONGOParser.ValueContext ctx);
}