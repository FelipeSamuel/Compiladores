package compilador;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import compilador.exceptions.UndeclaredVariableException;
import compilador.exceptions.VariableAlreadyDefinedException;
import compiladorAntLr.GramaticaBaseVisitor;
import compiladorAntLr.GramaticaParser.BoolTypeContext;
import compiladorAntLr.GramaticaParser.CharTypeContext;
import compiladorAntLr.GramaticaParser.DivisaoContext;
import compiladorAntLr.GramaticaParser.FuncaoComRetornoContext;
import compiladorAntLr.GramaticaParser.FuncaoSemRetornoContext;
import compiladorAntLr.GramaticaParser.FunccallContext;
import compiladorAntLr.GramaticaParser.FunctionDefinitionContext;
import compiladorAntLr.GramaticaParser.IntAtribContext;
import compiladorAntLr.GramaticaParser.IntDecAtrContext;
import compiladorAntLr.GramaticaParser.IntDeclContext;
import compiladorAntLr.GramaticaParser.IntTypeContext;
import compiladorAntLr.GramaticaParser.MainStatementContext;
import compiladorAntLr.GramaticaParser.MaisContext;
import compiladorAntLr.GramaticaParser.MenosContext;
import compiladorAntLr.GramaticaParser.ModuloContext;
import compiladorAntLr.GramaticaParser.MultiplicacaoContext;
import compiladorAntLr.GramaticaParser.NumeroInteiroContext;
import compiladorAntLr.GramaticaParser.NumeroRealContext;
import compiladorAntLr.GramaticaParser.PrintlnContext;
import compiladorAntLr.GramaticaParser.ProgContext;
import compiladorAntLr.GramaticaParser.ProgramaContext;
import compiladorAntLr.GramaticaParser.RealTypeContext;
import compiladorAntLr.GramaticaParser.RetornoContext;
import compiladorAntLr.GramaticaParser.StartContext;
import compiladorAntLr.GramaticaParser.StringTypeContext;
import compiladorAntLr.GramaticaParser.TesteContext;
import compiladorAntLr.GramaticaParser.TestesContext;
import compiladorAntLr.GramaticaParser.VarAtribuicaoContext;
import compiladorAntLr.GramaticaParser.VarDeclAtribContext;
import compiladorAntLr.GramaticaParser.VarDeclaracaoContext;
import compiladorAntLr.GramaticaParser.VariavelContext;
import bsh.Variable;

public class MyVisitor extends GramaticaBaseVisitor<String> {

	private Map<String, Integer> variaveis = new HashMap<>();
	private Map<String, String> variaveisETipos = new HashMap<>();
	private Stack<String> pilhaTiposVariaveis = new Stack<>();

	String programName = "";

	@Override
	public String visitPrintln(PrintlnContext ctx) {
		String retorno = "getstatic java/lang/System/out Ljava/io/PrintStream;\n"
				+ visit(ctx.argumento) + "\n";
		if (pilhaTiposVariaveis.peek().equals("int")) {
			retorno += "invokevirtual java/io/PrintStream/println(I)V"
					+ System.lineSeparator();
		} else if (pilhaTiposVariaveis.peek().equals("real")) {
			retorno += "invokevirtual java/io/PrintStream/println(D)V"
					+ System.lineSeparator();
		} else {
			retorno += "invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V"
					+ System.lineSeparator();
		}
		return retorno;

	}

	@Override
	public String visitMais(MaisContext ctx) {

		String retorno = visitChildren(ctx) + System.lineSeparator();
		verificarTiposOperacao(ctx.esq.getText(), ctx.dir.getText());

		if (pilhaTiposVariaveis.peek().equals("int")) {
			retorno += "iadd";
		} else if (pilhaTiposVariaveis.peek().equals("real")) {
			retorno += "dadd";
		}
		return retorno;
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
		return visitChildren(ctx) + System.lineSeparator() + "idiv";
	}

	@Override
	public String visitNumeroInteiro(NumeroInteiroContext ctx) {
		pilhaTiposVariaveis.push("int");
		return "ldc " + ctx.numero.getText();
	}

	@Override
	public String visitNumeroReal(NumeroRealContext ctx) {
		pilhaTiposVariaveis.push("real");
		return "ldc2_w " + ctx.numero.getText();
	}

	@Override
	public String visitVariavel(VariavelContext ctx) {
		int variavelIndex = requireVariableIndex(ctx.nomeVariavel);
		pilhaTiposVariaveis
				.push(variaveisETipos.get(ctx.nomeVariavel.getText()));
		if (pilhaTiposVariaveis.peek().equals("real")) {
			return "dload " + variavelIndex;
		}
		return "iload " + variavelIndex;
	}

	@Override
	public String visitVarDeclaracao(VarDeclaracaoContext ctx) {
		if (variaveis.containsKey(ctx.nomeVariavel.getText())) {
			throw new VariableAlreadyDefinedException(ctx.nomeVariavel);
		}
		variaveis.put(ctx.nomeVariavel.getText(), variaveis.size());
		variaveisETipos.put(ctx.nomeVariavel.getText(), ctx.tipo.getText());
		return "";
	}

	@Override
	public String visitVarAtribuicao(VarAtribuicaoContext ctx) {
		String retorno = visit(ctx.expr) + System.lineSeparator();
		if (pilhaTiposVariaveis.peek().equals("real")) {
			return retorno + "dstore " + requireVariableIndex(ctx.nomeVariavel);
		}
		return retorno + "istore " + requireVariableIndex(ctx.nomeVariavel);
	}

	@Override
	public String visitVarDeclAtrib(VarDeclAtribContext ctx) {
		if (variaveis.containsKey(ctx.nomeVariavel.getText())) {
			throw new VariableAlreadyDefinedException(ctx.nomeVariavel);
		}
		String retornoExpr = "" + visit(ctx.expr);
		String tipoVariavel = pilhaTiposVariaveis.pop();
		if (!ctx.tipo.getText().equals(tipoVariavel)) {
			throw new RuntimeException();
		}
		variaveis.put(ctx.nomeVariavel.getText(), variaveis.size());
		variaveisETipos.put(ctx.nomeVariavel.getText(), ctx.tipo.getText());

		if(ctx.tipo.getText().equals("real")){
			return retornoExpr += System.lineSeparator() + "dstore "
					+ requireVariableIndex(ctx.nomeVariavel);
		}
		return retornoExpr + System.lineSeparator() + "istore "
				+ requireVariableIndex(ctx.nomeVariavel);
	}

	
	private int requireVariableIndex(Token varNameToken) {
		Integer varIndex = variaveis.get(varNameToken.getText());
		if (varIndex == null) {
			throw new UndeclaredVariableException(varNameToken);
		}
		return varIndex;
	}

	@Override
	public String visitFunccall(FunccallContext ctx) {
		return "invokestatic " + programName + "/" + ctx.nomeFuncao.getText()
				+ "()I";
	}

	@Override
	public String visitFuncaoComRetorno(FuncaoComRetornoContext ctx) {
		String retorno = ".method public static " + ctx.nomeFuncao.getText() + "()I"
				+ System.lineSeparator() + "  .limit locals 100"
				+ System.lineSeparator() + "  .limit stack 100";
		
		if(visit(ctx.comandos)!=null){
			retorno += System.lineSeparator() +visit(ctx.comandos);
		}
		
		retorno += System.lineSeparator() +   visit(ctx.valorRetorno)
				+ System.lineSeparator() + "  ireturn" + System.lineSeparator()
				+ ".end method";
		return retorno;
	}
	
	@Override
	public String visitFuncaoSemRetorno(FuncaoSemRetornoContext ctx) {
		//NAO FAZ SENTIDO USAR POIS AINDA NAO CONSEGUIMOS PASSAR PARAMETROS;
		// TODO Auto-generated method stub
		return super.visitFuncaoSemRetorno(ctx);
	}

	@Override
	public String visitTeste(TesteContext ctx) {
		programName = "HelloWorld";
		String mainCode = "";
		String functionsCode = "";
		for (int i = 0; i < ctx.getChildCount(); i++) {
			ParseTree child = ctx.getChild(i);
			String instructions = visit(child);
			if (child instanceof MainStatementContext) {
				mainCode += instructions + System.lineSeparator();
			} else {
				functionsCode += instructions + System.lineSeparator();
			}
		}
		return ".class public " + programName + System.lineSeparator()
				+ ".super java/lang/Object\n" + System.lineSeparator()
				+ functionsCode + System.lineSeparator()
				+ ".method public static main([Ljava/lang/String;)V"
				+ System.lineSeparator() + ".limit stack 100"
				+ System.lineSeparator() + ".limit locals 100"
				+ System.lineSeparator() + mainCode + System.lineSeparator()
				+ "return" + System.lineSeparator() + ".end method";
	}

	@Override
	public String visitPrograma(ProgramaContext ctx) {
		programName = ctx.nomePrograma.getText();
		ParseTree start = ctx.ISTART;
		return ".class public " + programName + System.lineSeparator()
				+ ".super java/lang/Object\n" + System.lineSeparator()
				+ visit(start) + System.lineSeparator() + "return\n"
				+ System.lineSeparator() + ".end method";
	}

	@Override
	public String visitStart(StartContext ctx) {
		String mainCode = "";
		String functionsCode = "";
		for (int i = 1; i < ctx.getChildCount() - 1; i++) {
			ParseTree child = ctx.getChild(i);
			String instructions = visit(child);
			if (child instanceof MainStatementContext) {
				mainCode += instructions + System.lineSeparator();
			} else {
				functionsCode += instructions + System.lineSeparator();
			}
		}
		return functionsCode + System.lineSeparator()
				+ ".method public static main([Ljava/lang/String;)V\n"
				+ ".limit stack 100\n" + ".limit locals 100\n"
				+ System.lineSeparator() + mainCode;
	}

	private String verificarTiposOperacao(String tokenEsquerda,
			String tokenDireita) {
		String direita = pilhaTiposVariaveis.pop();
		String esquerda = pilhaTiposVariaveis.pop();
		if (!esquerda.equals(direita)) {
			// Tipos diferentes, realizar conversao ou mandar excecao??
			throw new RuntimeException();
		}
		pilhaTiposVariaveis.push(direita);
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
