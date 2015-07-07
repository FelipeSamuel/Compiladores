package compilador;

import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import compilador.exceptions.UndeclaredVariableException;
import compilador.exceptions.VariableAlreadyDefinedException;
import compiladorAntLr.GramaticaBaseVisitor;
import compiladorAntLr.GramaticaParser.AtribuicaoContext;
import compiladorAntLr.GramaticaParser.DivisaoContext;
import compiladorAntLr.GramaticaParser.FunccallContext;
import compiladorAntLr.GramaticaParser.FunctionDefinitionContext;
import compiladorAntLr.GramaticaParser.IntAtribContext;
import compiladorAntLr.GramaticaParser.IntDecAtrContext;
import compiladorAntLr.GramaticaParser.IntDeclContext;
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
import compiladorAntLr.GramaticaParser.RetornoContext;
import compiladorAntLr.GramaticaParser.StartContext;
import compiladorAntLr.GramaticaParser.TesteContext;
import compiladorAntLr.GramaticaParser.TestesContext;
import compiladorAntLr.GramaticaParser.VarDeclaracaoContext;
import compiladorAntLr.GramaticaParser.VariavelContext;
import bsh.Variable;

public class MyVisitor extends GramaticaBaseVisitor<String> {

	private Map<String, Integer> variaveis = new HashMap<>();
	
	String programName = "";

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
		return visitChildren(ctx) + System.lineSeparator() + "idiv";
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
		return visit(ctx.expr) + System.lineSeparator() + "istore "
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
		String aux;
		if(variaveis.containsKey(ctx.nomeVariavel.getText())){
			throw new VariableAlreadyDefinedException(ctx.nomeVariavel);
		}
		aux = visit(ctx.expr);
		
		variaveis.put(ctx.nomeVariavel.getText(),variaveis.size());
		
		return aux + System.lineSeparator() +"istore "+ requireVariableIndex(ctx.nomeVariavel);
	}
	
	@Override
	public String visitFunccall(FunccallContext ctx) {
		return "invokestatic "+programName+"/"+ ctx.nomeFuncao.getText()+"()I";
	}
	
	@Override
	public String visitFunctionDefinition(FunctionDefinitionContext ctx) {
		return ".method public static "+ctx.nomeFuncao.getText()+"()I"+System.lineSeparator()+
				"  .limit locals 100"+System.lineSeparator()+
				"  .limit stack 100"+System.lineSeparator()+
				visit(ctx.valorRetorno)+System.lineSeparator()+
				"  ireturn"+System.lineSeparator()+
				".end method";
	}
	
	
	@Override
	public String visitTeste(TesteContext ctx) {
		programName = "HelloWorld";
		String mainCode ="";
		String functionsCode ="";
		for(int i=0; i<ctx.getChildCount();i++){
			ParseTree child = ctx.getChild(i);
			String instructions = visit(child);
			if(child instanceof MainStatementContext){
				mainCode +=instructions+System.lineSeparator();
			}else {
				functionsCode +=instructions+System.lineSeparator();
			}
		}
		return ".class public " + programName + System.lineSeparator() 
				+ ".super java/lang/Object\n"+ System.lineSeparator() 
				+functionsCode + System.lineSeparator()
				+".method public static main([Ljava/lang/String;)V"+System.lineSeparator()
				+ ".limit stack 100" +System.lineSeparator()
				+ ".limit locals 100" + System.lineSeparator()
				+ mainCode + System.lineSeparator() 
				+ "return" + System.lineSeparator() 
				+ ".end method";
	}
	
	
	@Override
	public String visitPrograma(ProgramaContext ctx) {
		programName = ctx.nomePrograma.getText();
		ParseTree start = ctx.ISTART;
		return ".class public " + programName + System.lineSeparator() 
				+ ".super java/lang/Object\n"
				+ System.lineSeparator() +
				visit(start) + System.lineSeparator() 
				+ "return\n" + System.lineSeparator() 
				+ ".end method";
	}
	
	
	@Override
	public String visitStart(StartContext ctx) {
		String mainCode ="";
		String functionsCode ="";
		for(int i=1; i<ctx.getChildCount()-1;i++){
			ParseTree child = ctx.getChild(i);
			String instructions = visit(child);
			if(child instanceof MainStatementContext){
				mainCode +=instructions+System.lineSeparator();
			}else {
				functionsCode +=instructions+System.lineSeparator();
			}
		}
		return functionsCode + System.lineSeparator()
				+".method public static main([Ljava/lang/String;)V\n"
				+ ".limit stack 100\n" 
				+ ".limit locals 100\n" + System.lineSeparator()
				+ mainCode;
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
