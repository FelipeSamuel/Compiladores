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
	 * Visit a parse tree produced by the {@code menor}
	 * labeled alternative in {@link GramaticaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenor(@NotNull GramaticaParser.MenorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code menos}
	 * labeled alternative in {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenos(@NotNull GramaticaParser.MenosContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#for_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stat(@NotNull GramaticaParser.For_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code diferente}
	 * labeled alternative in {@link GramaticaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiferente(@NotNull GramaticaParser.DiferenteContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommands(@NotNull GramaticaParser.CommandsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opMatematica}
	 * labeled alternative in {@link GramaticaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpMatematica(@NotNull GramaticaParser.OpMatematicaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code maiorIgual}
	 * labeled alternative in {@link GramaticaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaiorIgual(@NotNull GramaticaParser.MaiorIgualContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull GramaticaParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(@NotNull GramaticaParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atribuicao}
	 * labeled alternative in {@link GramaticaParser#atrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicao(@NotNull GramaticaParser.AtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code maior}
	 * labeled alternative in {@link GramaticaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaior(@NotNull GramaticaParser.MaiorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ident}
	 * labeled alternative in {@link GramaticaParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(@NotNull GramaticaParser.IdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(@NotNull GramaticaParser.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#args_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs_func(@NotNull GramaticaParser.Args_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#methodAtribs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodAtribs(@NotNull GramaticaParser.MethodAtribsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcChamada}
	 * labeled alternative in {@link GramaticaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncChamada(@NotNull GramaticaParser.FuncChamadaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code menorIgual}
	 * labeled alternative in {@link GramaticaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenorIgual(@NotNull GramaticaParser.MenorIgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicacao}
	 * labeled alternative in {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicacao(@NotNull GramaticaParser.MultiplicacaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#comm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComm(@NotNull GramaticaParser.CommContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inicio}
	 * labeled alternative in {@link GramaticaParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicio(@NotNull GramaticaParser.InicioContext ctx);
	/**
	 * Visit a parse tree produced by the {@code teste}
	 * labeled alternative in {@link GramaticaParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTeste(@NotNull GramaticaParser.TesteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mais}
	 * labeled alternative in {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMais(@NotNull GramaticaParser.MaisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numeroReal}
	 * labeled alternative in {@link GramaticaParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeroReal(@NotNull GramaticaParser.NumeroRealContext ctx);
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
	 * Visit a parse tree produced by the {@code varDeclaracao}
	 * labeled alternative in {@link GramaticaParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaracao(@NotNull GramaticaParser.VarDeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(@NotNull GramaticaParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divisao}
	 * labeled alternative in {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivisao(@NotNull GramaticaParser.DivisaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numeroInteiro}
	 * labeled alternative in {@link GramaticaParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeroInteiro(@NotNull GramaticaParser.NumeroInteiroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varDecAtrib}
	 * labeled alternative in {@link GramaticaParser#varAtrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecAtrib(@NotNull GramaticaParser.VarDecAtribContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valor}
	 * labeled alternative in {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(@NotNull GramaticaParser.ValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(@NotNull GramaticaParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code igual}
	 * labeled alternative in {@link GramaticaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgual(@NotNull GramaticaParser.IgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code modulo}
	 * labeled alternative in {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModulo(@NotNull GramaticaParser.ModuloContext ctx);
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