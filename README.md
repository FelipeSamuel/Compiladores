# Compilador SL++

Compilador para a linguagem SL++ o qual gera código em JAVA, desenvolvido utilizando o framework ANTLR.
Desenvolvido para a disciplina INE5426-06208 (20152) - Construção de Compiladores - UFSC.


## Especificação BNF da Liguagem.

prog ::= "program" word "{" start "}"
start ::= def* function* main
def ::= "const" var "=" value ";" | "const" var "[" "]" "=" array ";"
var ::= type id
id ::= "_"? [a-z] ([a-z] | [A-Z])*
array ::= "array””<" type ">””{" values "}"
type ::= "char" | "int" | "real" | "string" | "bool"
values ::= values "," values | id ("["num"]")? | value
value ::= "'" letter "'" | '"' word '"' | ("+" | "-" | ) (num | real) | calc | bool
calc ::= (calc | value) math_op (calc | value)
math_op ::= "/" | "*" | "+" | "-" | "%"
exp ::= (value | id) (bool_op) (value | id) | id
bool_op ::= ">" | "<" | ">=" | "<=" | "==" | "!="
bool_calc ::= exp bool_calc_op exp | "!" exp
bool_calc_op ::=  "|" | "&"
bool ::= "true" | "false"
letter ::= "ascii"
word ::= "ascii"*
real ::= num "." num
num ::= [0-9]+
function ::= "function" id "("params")" "{"comm*"}"
params ::= (var ("," var)* ("," assign)*)? | (assign ("," assign)*)?
main ::= comm*
comm ::= while | assign | if | for | func_call
while ::= "while" "(" exp ")" "{" comm* "}"
assign ::= var ("=" value)? ";" 
if ::= "if" "(" exp ")" "{" main "}" ( "else" "{" comm* "}" | "els" if )?
for ::= "for" "(" assign ";" exp ";" (calc|bool_calc) ")" "{" comm* "}"
func_call ::= id "(" ( (value|id) ("," (value | id))*)? ")" ";"


## Programa Exemplo

program example {

const string c = "String";
	const int a = 0;
	const int b = 5;

function equals(int x, int y) {
    		if(x == y) {
        			return = true;
    		} else {
        			return = false;
    		}
 	 }

	function getSomething() {
    		string d = "Helloworld";
		return d;
	}

	function doNothing() {
    		for(int i; i<times; i = i+1) {
        			//do nothing
 		}
	}

	main {
    		int d = a;
    		bool value;
    		value = equals(a, d);
    		if(value) {
   	 		value = equals(d, b);
        			while(value) {
 	       			d = d+1;
  	      			value = equals(d, b);
				doNothing();
        			}
    		}
	}
}

## Desenvolvido por:
Guilherme Trilha Daniel
Pedro Henrique Lenzi Soares
Vinicius Andreoli Petrolini

