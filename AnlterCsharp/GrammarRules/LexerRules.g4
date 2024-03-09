lexer grammar LexerRules;

DIGIT : '0'..'9';
NUMBER : DIGIT+;
DECIMAL : NUMBER '.' NUMBER;

ALPHA : 'a'..'z' | 'A'..'Z' | '_';
IDENTIFIER : ALPHA (NUMBER | ALPHA)*;


UNARYOP : '-' | '!';
BINARYMATH : '-' | '+' | '*' | '/'; 
BINARYBITWISE : '&' | '|' | '^' | '>>' | '<<';
BINARYLOGIC : '&&'  | '||' | '==' | '!=' | '<=' | '>=';
TYPE : 'int' | 'float' | 'short' | 'char' | 'long' | 'decimal' | IDENTIFIER;
BOOLVAL : 'true' | 'false';

FOR : 'for';
LCURLYBRACKET : '{';
RCURLYBRACKET : '}';
LSQUAREBRACKET : '[';
RSQUAREBRACKET : ']';
SEMICOLON : ';';
ENUM : 'enum';
STRUCT : 'struct';
EQUAL : '=';
COMMA : ',';
DOT : '.';
LPARENTHESIS : '(';
RPARENTHESIS : ')';
WHILE : 'while';
DO : 'do';
SWITCH : 'switch';
DEFAULT : 'default';
CASE : 'case';
CONTINUE : 'continue';
BREAK : 'break';
COLON : ':';
QUESTIONMARK : '?';
RETURN : 'return';



WS : [ \t\r\n]+ -> skip;