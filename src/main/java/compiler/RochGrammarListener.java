package compiler;
// Generated from RochGrammar.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RochGrammarParser}.
 */
public interface RochGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RochGrammarParser#otherwise}.
	 * @param ctx the parse tree
	 */
	void enterOtherwise(@NotNull RochGrammarParser.OtherwiseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RochGrammarParser#otherwise}.
	 * @param ctx the parse tree
	 */
	void exitOtherwise(@NotNull RochGrammarParser.OtherwiseContext ctx);
	/**
	 * Enter a parse tree produced by {@link RochGrammarParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(@NotNull RochGrammarParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link RochGrammarParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(@NotNull RochGrammarParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link RochGrammarParser#grammarstart}.
	 * @param ctx the parse tree
	 */
	void enterGrammarstart(@NotNull RochGrammarParser.GrammarstartContext ctx);
	/**
	 * Exit a parse tree produced by {@link RochGrammarParser#grammarstart}.
	 * @param ctx the parse tree
	 */
	void exitGrammarstart(@NotNull RochGrammarParser.GrammarstartContext ctx);
	/**
	 * Enter a parse tree produced by {@link RochGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull RochGrammarParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link RochGrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull RochGrammarParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link RochGrammarParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(@NotNull RochGrammarParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RochGrammarParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(@NotNull RochGrammarParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RochGrammarParser#checkCondition}.
	 * @param ctx the parse tree
	 */
	void enterCheckCondition(@NotNull RochGrammarParser.CheckConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RochGrammarParser#checkCondition}.
	 * @param ctx the parse tree
	 */
	void exitCheckCondition(@NotNull RochGrammarParser.CheckConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RochGrammarParser#display}.
	 * @param ctx the parse tree
	 */
	void enterDisplay(@NotNull RochGrammarParser.DisplayContext ctx);
	/**
	 * Exit a parse tree produced by {@link RochGrammarParser#display}.
	 * @param ctx the parse tree
	 */
	void exitDisplay(@NotNull RochGrammarParser.DisplayContext ctx);
	/**
	 * Enter a parse tree produced by {@link RochGrammarParser#checkEnd}.
	 * @param ctx the parse tree
	 */
	void enterCheckEnd(@NotNull RochGrammarParser.CheckEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link RochGrammarParser#checkEnd}.
	 * @param ctx the parse tree
	 */
	void exitCheckEnd(@NotNull RochGrammarParser.CheckEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link RochGrammarParser#check}.
	 * @param ctx the parse tree
	 */
	void enterCheck(@NotNull RochGrammarParser.CheckContext ctx);
	/**
	 * Exit a parse tree produced by {@link RochGrammarParser#check}.
	 * @param ctx the parse tree
	 */
	void exitCheck(@NotNull RochGrammarParser.CheckContext ctx);
	/**
	 * Enter a parse tree produced by {@link RochGrammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(@NotNull RochGrammarParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RochGrammarParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(@NotNull RochGrammarParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RochGrammarParser#arithmeticExp}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExp(@NotNull RochGrammarParser.ArithmeticExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link RochGrammarParser#arithmeticExp}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExp(@NotNull RochGrammarParser.ArithmeticExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link RochGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull RochGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RochGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull RochGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RochGrammarParser#conditionalExp}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExp(@NotNull RochGrammarParser.ConditionalExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link RochGrammarParser#conditionalExp}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExp(@NotNull RochGrammarParser.ConditionalExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link RochGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull RochGrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RochGrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull RochGrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RochGrammarParser#until}.
	 * @param ctx the parse tree
	 */
	void enterUntil(@NotNull RochGrammarParser.UntilContext ctx);
	/**
	 * Exit a parse tree produced by {@link RochGrammarParser#until}.
	 * @param ctx the parse tree
	 */
	void exitUntil(@NotNull RochGrammarParser.UntilContext ctx);
	/**
	 * Enter a parse tree produced by {@link RochGrammarParser#untilLoop}.
	 * @param ctx the parse tree
	 */
	void enterUntilLoop(@NotNull RochGrammarParser.UntilLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link RochGrammarParser#untilLoop}.
	 * @param ctx the parse tree
	 */
	void exitUntilLoop(@NotNull RochGrammarParser.UntilLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link RochGrammarParser#untilEnd}.
	 * @param ctx the parse tree
	 */
	void enterUntilEnd(@NotNull RochGrammarParser.UntilEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link RochGrammarParser#untilEnd}.
	 * @param ctx the parse tree
	 */
	void exitUntilEnd(@NotNull RochGrammarParser.UntilEndContext ctx);
}