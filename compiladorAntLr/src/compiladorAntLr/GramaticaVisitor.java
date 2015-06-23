// Generated from Gramatica.g4 by ANTLR 4.4
package compiladorAntLr;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull GramaticaParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#comm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComm(@NotNull GramaticaParser.CommContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#for_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stat(@NotNull GramaticaParser.For_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(@NotNull GramaticaParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(@NotNull GramaticaParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommands(@NotNull GramaticaParser.CommandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(@NotNull GramaticaParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(@NotNull GramaticaParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#funccall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunccall(@NotNull GramaticaParser.FunccallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull GramaticaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(@NotNull GramaticaParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(@NotNull GramaticaParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(@NotNull GramaticaParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues(@NotNull GramaticaParser.ValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef(@NotNull GramaticaParser.DefContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(@NotNull GramaticaParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(@NotNull GramaticaParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(@NotNull GramaticaParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#while_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stat(@NotNull GramaticaParser.While_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(@NotNull GramaticaParser.If_statContext ctx);
}