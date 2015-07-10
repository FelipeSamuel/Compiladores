package compilador;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import compilador.exceptions.UndeclaredVariableException;
import compilador.exceptions.UndefinedFunction;
import compilador.exceptions.VariableAlreadyDefinedException;
import compilador.exceptions.VariableAndValueOfDifferentTypesException;
import compiladorAntLr.GramaticaBaseVisitor;
import compiladorAntLr.GramaticaParser.DivisaoContext;
import compiladorAntLr.GramaticaParser.FuncaoComRetornoContext;
import compiladorAntLr.GramaticaParser.FuncaoSemRetornoContext;
import compiladorAntLr.GramaticaParser.FunccallContext;
import compiladorAntLr.GramaticaParser.MainStatementContext;
import compiladorAntLr.GramaticaParser.MaisContext;
import compiladorAntLr.GramaticaParser.MenosContext;
import compiladorAntLr.GramaticaParser.ModuloContext;
import compiladorAntLr.GramaticaParser.MultiplicacaoContext;
import compiladorAntLr.GramaticaParser.NumeroInteiroContext;
import compiladorAntLr.GramaticaParser.NumeroRealContext;
import compiladorAntLr.GramaticaParser.PrintlnContext;
import compiladorAntLr.GramaticaParser.ProgramaContext;
import compiladorAntLr.GramaticaParser.StartContext;
import compiladorAntLr.GramaticaParser.TesteContext;
import compiladorAntLr.GramaticaParser.VarAtribuicaoContext;
import compiladorAntLr.GramaticaParser.VarDeclAtribContext;
import compiladorAntLr.GramaticaParser.VarDeclaracaoContext;
import compiladorAntLr.GramaticaParser.VariavelContext;
import bsh.Variable;

public class MyVisitor extends GramaticaBaseVisitor<String> {

	private Map<String, Integer> variaveis = new HashMap<>();
	private Map<String, String> variaveisETipos = new HashMap<>();
	private Map<String, String> possibleOperations;
	private Map<String, String> returnType = new HashMap<>();
	private Stack<String> pilhaTiposVariaveis = new Stack<>();
	private Map<String,String> declaredMethods = new HashMap<>();
	

	public MyVisitor() {
		possibleOperations = new HashMap<>();
		possibleOperations.put("int+int", "int");
		possibleOperations.put("int-int", "int");
		possibleOperations.put("int*int", "int");
		possibleOperations.put("int/int", "int");

		possibleOperations.put("real+real", "real");
		possibleOperations.put("real-real", "real");
		possibleOperations.put("real*real", "real");
		possibleOperations.put("real/real", "real");

		possibleOperations.put("real+int", "real");
		possibleOperations.put("real-int", "real");
		possibleOperations.put("real*int", "real");
		possibleOperations.put("real/int", "real");

		possibleOperations.put("int+real", "real");
		possibleOperations.put("int-real", "real");
		possibleOperations.put("int*real", "real");
		possibleOperations.put("int/real", "real");
		
		returnType.put("int", "I");
		returnType.put("real", "F");
		returnType.put("void","V");
	}

	String programName = "";

	@Override
	public String visitPrintln(PrintlnContext ctx) {
		String retorno = "getstatic java/lang/System/out Ljava/io/PrintStream;\n"
				+ visit(ctx.argumento) + "\n";
		if (pilhaTiposVariaveis.peek().equals("int")) {
			retorno += "invokevirtual java/io/PrintStream/println(I)V"
					+ System.lineSeparator();
		} else if (pilhaTiposVariaveis.peek().equals("real")) {
			retorno += "invokevirtual java/io/PrintStream/println(F)V"
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
		retorno += verificarTiposOperacao(ctx.esq.getText(), ctx.dir.getText(),
				ctx.operacao);

		if (pilhaTiposVariaveis.peek().equals("int")) {
			retorno += "iadd";
		} else if (pilhaTiposVariaveis.peek().equals("real")) {
			retorno += "fadd";
		}
		return retorno;
	}

	@Override
	public String visitMenos(MenosContext ctx) {
		String retorno = visitChildren(ctx) + System.lineSeparator();
		retorno += verificarTiposOperacao(ctx.esq.getText(), ctx.dir.getText(),
				ctx.operacao);

		if (pilhaTiposVariaveis.peek().equals("int")) {
			retorno += "isub";
		} else if (pilhaTiposVariaveis.peek().equals("real")) {
			retorno += "fsub";
		}
		return retorno;
	}

	@Override
	public String visitModulo(ModuloContext ctx) {
		String retorno = visitChildren(ctx) + System.lineSeparator();
		retorno += verificarTiposOperacao(ctx.esq.getText(), ctx.dir.getText(),
				ctx.operacao);

		if (pilhaTiposVariaveis.peek().equals("int")) {
			retorno += "irem";
		} else if (pilhaTiposVariaveis.peek().equals("real")) {
			retorno += "frem";
		}
		return retorno;
	}

	@Override
	public String visitMultiplicacao(MultiplicacaoContext ctx) {
		String retorno = visitChildren(ctx) + System.lineSeparator();
		retorno += verificarTiposOperacao(ctx.esq.getText(), ctx.dir.getText(),
				ctx.operacao);

		if (pilhaTiposVariaveis.peek().equals("int")) {
			retorno += "imul";
		} else if (pilhaTiposVariaveis.peek().equals("real")) {
			retorno += "fmul";
		}
		return retorno;
	}

	@Override
	public String visitDivisao(DivisaoContext ctx) {
		String retorno = visitChildren(ctx) + System.lineSeparator();
		retorno += verificarTiposOperacao(ctx.esq.getText(), ctx.dir.getText(),
				ctx.operacao);

		if (pilhaTiposVariaveis.peek().equals("int")) {
			retorno += "idiv";
		} else if (pilhaTiposVariaveis.peek().equals("real")) {
			retorno += "fdiv";
		}
		return retorno;
	}

	@Override
	public String visitNumeroInteiro(NumeroInteiroContext ctx) {
		pilhaTiposVariaveis.push("int");
		return "ldc " + ctx.numero.getText();
	}

	@Override
	public String visitNumeroReal(NumeroRealContext ctx) {
		pilhaTiposVariaveis.push("real");
		return "ldc " + ctx.numero.getText();
	}

	@Override
	public String visitVariavel(VariavelContext ctx) {
		int variavelIndex = requireVariableIndex(ctx.nomeVariavel);
		pilhaTiposVariaveis
				.push(variaveisETipos.get(ctx.nomeVariavel.getText()));
		if (pilhaTiposVariaveis.peek().equals("real")) {
			return "fload " + variavelIndex;
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
			return retorno + "fstore " + requireVariableIndex(ctx.nomeVariavel);
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
			throw new VariableAndValueOfDifferentTypesException(
					ctx.nomeVariavel, ctx.tipo, tipoVariavel);
		}
		variaveis.put(ctx.nomeVariavel.getText(), variaveis.size());
		variaveisETipos.put(ctx.nomeVariavel.getText(), ctx.tipo.getText());

		if (ctx.tipo.getText().equals("real")) {
			return retornoExpr += System.lineSeparator() + "fstore "
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
		String returnType = declaredMethods.get(ctx.nomeFuncao.getText());
		return "invokestatic " + programName + "/" + ctx.nomeFuncao.getText()
				+ "()"+returnType;
	}

	@Override
	public String visitFuncaoComRetorno(FuncaoComRetornoContext ctx) {
		String tipoRetorno = returnType.get(ctx.tipo.getText());
		String retorno = ".method public static " + ctx.nomeFuncao.getText()
				+ "()"+tipoRetorno + System.lineSeparator() + "  .limit locals 100"
				+ System.lineSeparator() + "  .limit stack 100";
		String comandos = visit(ctx.comandos);
		if (comandos != null) {
			retorno += System.lineSeparator() + comandos;
		}

		retorno += System.lineSeparator() + visit(ctx.valorRetorno)
				+ System.lineSeparator() + tipoRetorno.toLowerCase()+"return" + System.lineSeparator()
				+ ".end method";
		declaredMethods.put(ctx.nomeFuncao.getText(), returnType.get(ctx.tipo.getText()));
		return retorno;
	}

	@Override
	public String visitFuncaoSemRetorno(FuncaoSemRetornoContext ctx) {
		String tipoRetorno = returnType.get(ctx.tipo.getText());
		String retorno = ".method public static " + ctx.nomeFuncao.getText()
				+ "()"+tipoRetorno + System.lineSeparator() + "  .limit locals 100"
				+ System.lineSeparator() + "  .limit stack 100";
		String comandos = visit(ctx.comandos);
		if (comandos != null) {
			retorno += System.lineSeparator() + comandos;
		}

		retorno += System.lineSeparator()
				+ ".end method";
		declaredMethods.put(ctx.nomeFuncao.getText(), returnType.get(ctx.tipo.getText()));
		return retorno;
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
			String tokenDireita, Token tokenOperacao) {
		String direita = pilhaTiposVariaveis.pop();
		String esquerda = pilhaTiposVariaveis.pop();
		String opReturnType = possibleOperations.get(esquerda
				+ tokenOperacao.getText() + direita);
		if (opReturnType == null) {
			throw new UndefinedFunction(tokenOperacao);
		}
		String retorno= "";
		if (!esquerda.equals(direita)) {
			if (esquerda.equals(opReturnType)) {
				if (direita.equals("int")) {
					retorno += "i2f" + System.lineSeparator();
				} else if (direita.equals("real")) {
					retorno += "f2i" + System.lineSeparator();
				}
			} else if (direita.equals(opReturnType)) {
				if (esquerda.equals("int")) {
					retorno += "dup_x1" + System.lineSeparator()
							+ "pop" + System.lineSeparator()
							+ "i2f"+System.lineSeparator();
				}
				if (esquerda.equals("real")) {
					retorno += "dup_x1" + System.lineSeparator()
							+ "pop" +System.lineSeparator()
							+ "f2i" +System.lineSeparator();
				}
			}
		}
		pilhaTiposVariaveis.push(opReturnType);
		return retorno;
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
