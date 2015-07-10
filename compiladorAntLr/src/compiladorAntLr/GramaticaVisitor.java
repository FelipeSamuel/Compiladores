// Generated from Gramatica.g4 by ANTLR 4.5
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
	 * Visit a parse tree produced by the {@code teste}
	 * labeled alternative in {@link GramaticaParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTeste(GramaticaParser.TesteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code programa}
	 * labeled alternative in {@link GramaticaParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(GramaticaParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(GramaticaParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ProgPartFunctionDefinition}
	 * labeled alternative in {@link GramaticaParser#testeFuncao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgPartFunctionDefinition(GramaticaParser.ProgPartFunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MainStatement}
	 * labeled alternative in {@link GramaticaParser#testeFuncao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainStatement(GramaticaParser.MainStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#testes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTestes(GramaticaParser.TestesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(GramaticaParser.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intDecl}
	 * labeled alternative in {@link GramaticaParser#intDeclaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntDecl(GramaticaParser.IntDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intAtrib}
	 * labeled alternative in {@link GramaticaParser#intAtribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntAtrib(GramaticaParser.IntAtribContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intDecAtr}
	 * labeled alternative in {@link GramaticaParser#intDeclAtri}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntDecAtr(GramaticaParser.IntDecAtrContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#methodAtribs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodAtribs(GramaticaParser.MethodAtribsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varDeclaracao}
	 * labeled alternative in {@link GramaticaParser#variavelDeclaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaracao(GramaticaParser.VarDeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varDeclAtrib}
	 * labeled alternative in {@link GramaticaParser#variavelAtribuicaoDeclaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclAtrib(GramaticaParser.VarDeclAtribContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varAtribuicao}
	 * labeled alternative in {@link GramaticaParser#variavelAtribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAtribuicao(GramaticaParser.VarAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charType}
	 * labeled alternative in {@link GramaticaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharType(GramaticaParser.CharTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intType}
	 * labeled alternative in {@link GramaticaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntType(GramaticaParser.IntTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code realType}
	 * labeled alternative in {@link GramaticaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealType(GramaticaParser.RealTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringType}
	 * labeled alternative in {@link GramaticaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringType(GramaticaParser.StringTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolType}
	 * labeled alternative in {@link GramaticaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolType(GramaticaParser.BoolTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(GramaticaParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcaoComRetorno}
	 * labeled alternative in {@link GramaticaParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoComRetorno(GramaticaParser.FuncaoComRetornoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcaoSemRetorno}
	 * labeled alternative in {@link GramaticaParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncaoSemRetorno(GramaticaParser.FuncaoSemRetornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(GramaticaParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#comm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComm(GramaticaParser.CommContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#retorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorno(GramaticaParser.RetornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommands(GramaticaParser.CommandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#while_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stat(GramaticaParser.While_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(GramaticaParser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#for_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stat(GramaticaParser.For_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#funccall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunccall(GramaticaParser.FunccallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramaticaParser#args_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs_func(GramaticaParser.Args_funcContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opMatematica}
	 * labeled alternative in {@link GramaticaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpMatematica(GramaticaParser.OpMatematicaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code menor}
	 * labeled alternative in {@link GramaticaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenor(GramaticaParser.MenorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code maior}
	 * labeled alternative in {@link GramaticaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaior(GramaticaParser.MaiorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code menorIgual}
	 * labeled alternative in {@link GramaticaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenorIgual(GramaticaParser.MenorIgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code maiorIgual}
	 * labeled alternative in {@link GramaticaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaiorIgual(GramaticaParser.MaiorIgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code igual}
	 * labeled alternative in {@link GramaticaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgual(GramaticaParser.IgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code diferente}
	 * labeled alternative in {@link GramaticaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiferente(GramaticaParser.DiferenteContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divisao}
	 * labeled alternative in {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivisao(GramaticaParser.DivisaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code menos}
	 * labeled alternative in {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMenos(GramaticaParser.MenosContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valor}
	 * labeled alternative in {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(GramaticaParser.ValorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mais}
	 * labeled alternative in {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMais(GramaticaParser.MaisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code modulo}
	 * labeled alternative in {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModulo(GramaticaParser.ModuloContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicacao}
	 * labeled alternative in {@link GramaticaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicacao(GramaticaParser.MultiplicacaoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numeroInteiro}
	 * labeled alternative in {@link GramaticaParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeroInteiro(GramaticaParser.NumeroInteiroContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numeroReal}
	 * labeled alternative in {@link GramaticaParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeroReal(GramaticaParser.NumeroRealContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variavel}
	 * labeled alternative in {@link GramaticaParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavel(GramaticaParser.VariavelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcCallExpression}
	 * labeled alternative in {@link GramaticaParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallExpression(GramaticaParser.FuncCallExpressionContext ctx);
}