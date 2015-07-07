package compilador;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.Token;

import compilador.exceptions.UndeclaredVariableException;
import compilador.exceptions.VariableAlreadyDefinedException;
import compiladorAntLr.GramaticaBaseVisitor;
import compiladorAntLr.GramaticaParser.AtribuicaoContext;
import compiladorAntLr.GramaticaParser.DivisaoContext;
import compiladorAntLr.GramaticaParser.IntAtribContext;
import compiladorAntLr.GramaticaParser.IntDecAtrContext;
import compiladorAntLr.GramaticaParser.IntDeclContext;
import compiladorAntLr.GramaticaParser.MaisContext;
import compiladorAntLr.GramaticaParser.MenosContext;
import compiladorAntLr.GramaticaParser.ModuloContext;
import compiladorAntLr.GramaticaParser.MultiplicacaoContext;
import compiladorAntLr.GramaticaParser.NumeroInteiroContext;
import compiladorAntLr.GramaticaParser.NumeroRealContext;
import compiladorAntLr.GramaticaParser.PrintlnContext;
import compiladorAntLr.GramaticaParser.VarDeclaracaoContext;
import compiladorAntLr.GramaticaParser.VariavelContext;
import bsh.Variable;

public class MyVisitor extends GramaticaBaseVisitor<String> {

	private Map<String, Integer> variaveis = new HashMap<>();

	@Override
	public String visitPrintln(PrintlnContext ctx) {
		return "getstatic java/lang/System/out Ljava/io/PrintStream;\n"
				+ visit(ctx.argumento) + "\n"
				+ "invokevirtual java/io/PrintStream/println(I)V\n";
	}

	@Override
	public String visitMais(MaisContext ctx) {
		return visitChildren(ctx) + "\n" + "iadd";
	}

	@Override
	public String visitMenos(MenosContext ctx) {
		return visitChildren(ctx) + "\n" + "isub";
	}

	@Override
	public String visitModulo(ModuloContext ctx) {
		return visitChildren(ctx) + "\n" + "irem";
	}

	@Override
	public String visitMultiplicacao(MultiplicacaoContext ctx) {
		return visitChildren(ctx) + "\n" + "imul";
	}

	@Override
	public String visitDivisao(DivisaoContext ctx) {
		return visitChildren(ctx) + "\n" + "idiv";
	}

	@Override
	public String visitNumeroInteiro(NumeroInteiroContext ctx) {
		return "ldc " + ctx.numero.getText();
	}

	@Override
	public String visitNumeroReal(NumeroRealContext ctx) {
		return "ldc_w " + ctx.numero.getText();
	}
	
	@Override
	public String visitVariavel(VariavelContext ctx) {
		return "iload " + requireVariableIndex(ctx.nomeVariavel);
	}

	@Override
	public String visitIntDecl(IntDeclContext ctx) {
		if(variaveis.containsKey(ctx.nomeVariavel.getText())){
			throw new VariableAlreadyDefinedException(ctx.nomeVariavel);
		}
		variaveis.put(ctx.nomeVariavel.getText(), variaveis.size());
		return "";
	}

	@Override
	public String visitIntAtrib(IntAtribContext ctx) {
		return visit(ctx.expr) + "\n" + "istore "
				+ requireVariableIndex(ctx.nomeVariavel);
	}
	
	private int requireVariableIndex(Token varNameToken){
		Integer varIndex = variaveis.get(varNameToken.getText());
		if(varIndex == null){
			throw new UndeclaredVariableException(varNameToken);
		}
		return varIndex;
	}
	@Override
	public String visitIntDecAtr(IntDecAtrContext ctx) {
		return "";
	}

	@Override
	protected String aggregateResult(String aggregate, String nextResult) {
		if (aggregate == null) {
			return nextResult;
		}
		if (nextResult == null) {
			return aggregate;
		}
		return aggregate + "\n" + nextResult;
	}
}
