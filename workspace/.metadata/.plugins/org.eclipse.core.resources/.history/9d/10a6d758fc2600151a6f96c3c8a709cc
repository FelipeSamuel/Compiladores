grammar Gramatica;

prog	: testeFuncao+   #teste
		| programaRes=PROGRAM nomePrograma=ID ISTART=start #programa;

start	: OPEN_KEY /*functionDefinition* main**/ testeFuncao+ CLOSE_KEY;


testeFuncao: functionDefinition    #ProgPartFunctionDefinition
			| testes    #MainStatement;
			
testes : (println SEMICOLON)| methodAtribs /*(intDeclaracao SEMICOLON) | (intAtribuicao SEMICOLON) | (intDeclAtri SEMICOLON)*/;

println	: 'println(' argumento=expression ')';
 
//def		: CONST var EQUALS term SEMICOLON ;


intDeclaracao : INT_TYPE nomeVariavel=ID #intDecl;
intAtribuicao: nomeVariavel=ID opIgual=EQUALS expr=term #intAtrib;
intDeclAtri: INT_TYPE nomeVariavel=ID opIgual = EQUALS expr=term  #intDecAtr;

methodAtribs: variavelDeclaracao SEMICOLON
		| variavelAtribuicaoDeclaracao SEMICOLON
		| variavelAtribuicao SEMICOLON ;

variavelDeclaracao: tipo=type nomeVariavel=ID #varDeclaracao ;
 
variavelAtribuicaoDeclaracao: tipo=type nomeVariavel=ID opIgual=EQUALS expr=term #varDeclAtrib ;

variavelAtribuicao: nomeVariavel=ID opIgual=EQUALS expr=expression #varAtribuicao;


 
type	: CHAR_TYPE #charType
		| INT_TYPE  #intType
		| REAL_TYPE #realType
		| STRING_TYPE #stringType
		| BOOL_TYPE	#boolType;

//values	: term COMMA values ;
		
//number	: /*(MATH_PLUS_OP | MATH_LESS_OP)?*/ (NUM | REAL) ;

main	: MAIN OPEN_KEY comm CLOSE_KEY ;

functionDefinition: tipo=type nomeFuncReservado=FUNCTION_W nomeFuncao=ID OPEN_PARENT /*parametros=params*/     //SEM PARAMETRO
						CLOSE_PARENT OPEN_KEY comandos=comm valorRetorno=retorno CLOSE_KEY #funcaoComRetorno
					|tipo = VOID_TYPE nomeFuncReservado=FUNCTION_W nomeFuncao=ID OPEN_PARENT /*parametros=params*/     //SEM PARAMETRO
						CLOSE_PARENT OPEN_KEY comandos=comm CLOSE_KEY  #funcaoSemRetorno ;

params	: varDec+=variavelDeclaracao (COMMA varDec+=variavelDeclaracao)* | ;
//		| assign (COMMA assign)* ;

		
comm	: commands*;

retorno : RETURN  valorRetorno=expression SEMICOLON;

commands: while_stat
		| methodAtribs
//		| assign SEMICOLON
		| if_stat
		| for_stat
		| funccall SEMICOLON;
		
while_stat: WHILE_W OPEN_PARENT expression CLOSE_PARENT OPEN_KEY comm CLOSE_KEY ;

//assign	: (var | ID) (EQUALS term)? ;

if_stat	: IF_W OPEN_PARENT expression CLOSE_PARENT OPEN_KEY comm CLOSE_KEY (ELSE_W OPEN_KEY comm CLOSE_KEY)? ;

for_stat: FOR_W OPEN_PARENT INT_TYPE variavelAtribuicao SEMICOLON expression SEMICOLON variavelAtribuicao CLOSE_PARENT OPEN_KEY comm CLOSE_KEY ;

funccall: nomeFuncao=ID OPEN_PARENT /*args=args_func*/ CLOSE_PARENT ;

args_func	: exp+=expression ( COMMA exp+=expression)* | ;

expression	: term #opMatematica
			| esq=term operacao=BOOL_SMALLER_OP dir=term #menor
			| esq=term operacao=BOOL_BIGGER_OP dir=term #maior
			| esq=term operacao=BOOL_SMALLER_EQUALS_OP dir=term #menorIgual	
			| esq=term operacao=BOOL_BIGGER_EQUALS_OP dir=term #maiorIgual
			| esq=term operacao=BOOL_EQUALS_OP dir=term #igual
			| esq=term operacao=BOOL_DIFFERENT_OP dir=term #diferente;
			
			
term	: esq=term operacao=MATH_DIV_OP dir=term #divisao
		| esq=term operacao=MATH_MULT_OP dir=term #multiplicacao
		| esq=term operacao=MATH_MOD_OP dir=term #modulo
		| esq=term operacao=MATH_LESS_OP dir=term #menos
		| esq=term operacao=MATH_PLUS_OP dir=term #mais
		| value #valor;
		
value	: //STRING_ID #string
//		| CHAR_ID #char
		numero=NUM #numeroInteiro
		| numero=REAL #numeroReal
		| nomeVariavel=ID #variavel
//		| BOOL_ID #booleano;
		| funccall #funcCallExpression;
			

//palavras reservadas
PROGRAM		: 'program' ;
FUNCTION_W	: 'function' ;
WHILE_W		: 'while' ;
IF_W		: 'if' ;
ELSE_W		: 'else' ;
FOR_W		: 'for' ;
RETURN      : 'return';



//numeros e ids
//CONST		: 'const' ;
MAIN		: 'main' ;
CHAR_TYPE	: 'char' ;
INT_TYPE	: 'int' ;
REAL_TYPE	: 'real' ;
STRING_TYPE	: 'string' ;
BOOL_TYPE	: 'bool' ; 
VOID_TYPE   : 'void';


STRING_ID	: DOUBLE_Q_MARK (LETTER)* DOUBLE_Q_MARK ;
CHAR_ID		: SIMPLE_Q_MARK (LETTER)? SIMPLE_Q_MARK ;
ID			: '_'? (LETTER)+ ;
LETTER		: [a-zA-Z] ([a-zA-Z] | NUM)* ;
NUM			: [0-9]+ ;
REAL		: NUM DOT NUM ;
BOOL_ID		: ('true' | 'false') ;

 
//controle
SEMICOLON		: ';' ;
OPEN_KEY		: '{' ;
CLOSE_KEY		: '}' ;
OPEN_PARENT		: '(' ;
CLOSE_PARENT	: ')' ;
OPEN_BRACKET	: '[' ;
CLOSE_BRACKET	: ']';
COMMA			: ',' ;
DOT				: '.' ;
SIMPLE_Q_MARK	: '\'';
DOUBLE_Q_MARK	: '"';


//operadores
MATH_PLUS_OP			: '+' ;
EQUALS					: '=' ;
MATH_LESS_OP			: '-' ;
MATH_DIV_OP				: '/' ;
MATH_MULT_OP			: '*' ;
MATH_MOD_OP				: '%' ;
BOOL_SMALLER_OP			: '<' ;
BOOL_BIGGER_OP			: '>' ;
BOOL_BIGGER_EQUALS_OP	: '>=' ;
BOOL_SMALLER_EQUALS_OP	: '<=' ;
BOOL_EQUALS_OP			: '==' ;
BOOL_DIFFERENT_OP		: '!=' ;
BOOL_CALC_DIFF_OP		: '!' ;
BOOL_CALC_OR_OP			: '|' ;
BOOL_CALC_AND_OP		: '&' ;


SINGLELINE_COMMENT	: '//' ~('\r' | '\n')* -> skip;
WHITE_SPACE			: [ \t\r\n]+ -> skip ;
 
