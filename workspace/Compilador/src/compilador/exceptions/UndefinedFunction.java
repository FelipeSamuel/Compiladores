package compilador.exceptions;

import org.antlr.v4.runtime.Token;

public class UndefinedFunction extends CompileException{

	String funcName;
	public UndefinedFunction(Token varNameToken) {
		super(varNameToken);
		funcName = varNameToken.getText();
	}
	
	@Override
	public String getMessage() {
		return line + ":" + column + " undefined function <" + funcName + ">";
	}

}