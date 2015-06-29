package compilador;

import compiladorAntLr.GramaticaBaseVisitor;
import compiladorAntLr.GramaticaParser.DivisaoContext;
import compiladorAntLr.GramaticaParser.MaisContext;
import compiladorAntLr.GramaticaParser.MenosContext;
import compiladorAntLr.GramaticaParser.ModuloContext;
import compiladorAntLr.GramaticaParser.MultiplicacaoContext;
import compiladorAntLr.GramaticaParser.NumeroInteiroContext;
import compiladorAntLr.GramaticaParser.NumeroRealContext;
import compiladorAntLr.GramaticaParser.PrintlnContext;

public class MyVisitor extends GramaticaBaseVisitor<String> {

	@Override
	public String visitPrintln(PrintlnContext ctx) {
		return "getstatic java/lang/System/out Ljava/io/PrintStream;\n"
				+ visit(ctx.argumento) + "\n"
				+ "invokevirtual java/io/PrintStream/println(I)V\n";
	}
	
	@Override
	public String visitMais(MaisContext ctx) {
		return visitChildren(ctx) + "\n" + 
				"ldc " + ctx.dir.getText() + "\n" +
				"iadd";
	}
	
	@Override
	public String visitMenos(MenosContext ctx) {
		return visitChildren(ctx) + "\n" + 
				"ldc " + ctx.dir.getText() + "\n" +
				"isub";
	}
	
	@Override
	public String visitModulo(ModuloContext ctx) {
		return visitChildren(ctx) + "\n" + 
				"ldc " + ctx.dir.getText() + "\n" +
				"irem";
	}
	
	@Override
	public String visitMultiplicacao(MultiplicacaoContext ctx) {
		return visitChildren(ctx) + "\n" + 
				"ldc " + ctx.dir.getText() + "\n" +
				"imul";
	}
	
	@Override
	public String visitDivisao(DivisaoContext ctx) {
		return visitChildren(ctx) + "\n" + 
				"ldc " + ctx.dir.getText() + "\n" +
				"idiv";
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
