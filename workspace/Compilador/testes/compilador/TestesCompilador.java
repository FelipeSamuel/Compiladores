package compilador;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

import jasmin.ClassFile;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import compilador.exceptions.UndeclaredVariableException;

public class TestesCompilador {

	private Path tempDir;

	@BeforeMethod
	public void createTempDir() throws IOException {
		tempDir = Files.createTempDirectory("CompilerTest");
	}

	@AfterMethod
	public void deleteTempDir() {
		deleteRecursive(tempDir.toFile());
	}

	private void deleteRecursive(File file) {
		if (file.isDirectory()) {
			for (File child : file.listFiles()) {
				deleteRecursive(child);
			}
		}
		if (!file.delete()) {
			throw new Error("Nao foi possivel deletar o arquivo<" + file + ">");
		}
	}

	@Test(dataProvider = "provide_code_expectedText")
	public void runningCode_outputsExpectedText(String code, String expectedText)
			throws Exception {
		// execution
		String actualOutput = compileAndRun(code);

		// evaluation
		Assert.assertEquals(actualOutput, expectedText);
	}

	@Test(expectedExceptions = UndeclaredVariableException.class,
			expectedExceptionsMessageRegExp ="1:8 undeclared variable <x>")
	public void compilingCode_throwsUndeclaredVariableException_ifReadingUndifinedVariable() throws Exception {
		// execution
		compileAndRun("println(x);");
		
		//evaluation performed by expected exception
		

	}
	
	@Test(expectedExceptions = UndeclaredVariableException.class,
			expectedExceptionsMessageRegExp ="1:0 undeclared variable <x>")
	public void compilingCode_throwsUndeclaredVariableException_ifWritingUndifinedVariable() throws Exception {
		// execution
		compileAndRun("x = 5;");
		
		//evaluation performed by expected exception
		

	}

	@DataProvider
	public Object[][] provide_code_expectedText() {
		return new Object[][] {
				{ "println(1+2);", "3" + System.lineSeparator() },
				{
						"println(1+2+42); println(2*4+3);",
						"45" + System.lineSeparator() + "11"
								+ System.lineSeparator() },
				{ "println(3-2);", "1" + System.lineSeparator() },
				{ "println(4*2);", "8" + System.lineSeparator() },
				{ "println(4/2);", "2" + System.lineSeparator() },
				{ "println(7/2);", "3" + System.lineSeparator() },
				{ "println(8-2+5);", "11" + System.lineSeparator() },
				{ "println(8/2*4);", "16" + System.lineSeparator() },
				{ "println(2+3*3);", "11" + System.lineSeparator() },
				{ "println(9-2*3);", "3" + System.lineSeparator() },

				{ "int foo; foo = 42; println(foo); ",
						"42" + System.lineSeparator() },
				{ "int foo; foo = 42; println(foo+2); ",
						"44" + System.lineSeparator() },
				{ "int a; int b; a = 2; b = 5; println(a+b); ",
						"7" + System.lineSeparator() },

		};
	}

	private String compileAndRun(String code) throws Exception {
		code = Main.compile(new ANTLRInputStream(code));
		ClassFile classFile = new ClassFile();
		classFile.readJasmin(new StringReader(code), "", false);
		Path outputPath = tempDir.resolve(classFile.getClassName() + ".class");
		try (OutputStream output = Files.newOutputStream(outputPath)) {
			classFile.write(output);
		}
		return runJavaClass(tempDir, classFile.getClassName());
	}

	private String runJavaClass(Path dir, String className) throws Exception {
		Process process = Runtime.getRuntime().exec(
				new String[] { "java", "-cp", dir.toString(), className });
		try (InputStream in = process.getInputStream()) {
			return new Scanner(in).useDelimiter("\\A").next();
		}
	}
}