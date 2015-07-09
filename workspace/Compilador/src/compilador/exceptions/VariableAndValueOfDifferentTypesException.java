package compilador.exceptions;

import org.antlr.v4.runtime.Token;

import compiladorAntLr.GramaticaParser.TypeContext;

public class VariableAndValueOfDifferentTypesException extends CompileException{
	
	private String varName;
	private String variableType;
	private String valueType;
	
	public VariableAndValueOfDifferentTypesException(Token variableNameToken, TypeContext tipo, String valueType){
		super(variableNameToken);
		this.varName = variableNameToken.getText();
		this.variableType = tipo.getText();
		this.valueType = valueType;
	}
	
	@Override
	public String getMessage() {
		return line + ":" + column + " variable expected type is <" + variableType+ "> and actual type is <"+valueType+">";
	}

}
