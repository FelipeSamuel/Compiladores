package compilador;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import compiladorAntLr.GramaticaLexer;
import compiladorAntLr.GramaticaParser;


public class Main {

	public static void main(String... args) throws Exception {
		ANTLRInputStream input = new ANTLRFileStream("teste.demo");
		System.out.println(compile(input));
	}

	public static String compile(ANTLRInputStream input) {
		GramaticaLexer lexer = new GramaticaLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		GramaticaParser parser = new GramaticaParser(tokens);

		ParseTree tree = parser.prog();
		return createJasminFile(new MyVisitor().visit(tree));
	}

	private static String createJasminFile(String instructions) {
		return instructions;
	}
}
