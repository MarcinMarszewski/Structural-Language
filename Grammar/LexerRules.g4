lexer grammar LexerRules;


MINUS : '-';
PLUS : '+';
STAR : '*';
RSLASH : '/';
EXCLAMATION : '!';
AND : '&';
OR : '|';
CARROT : '^';
SHIFTLEFT : '<<';
SHIFTRIGHT : '>>';
ANDAND : '&&';
OROR : '||';
EQUALEQUAL : '==';
EXCLAMATIONEQUAL : '!=';
LESSEQUAL : '<=';
GREATEREQUAL : '>=';
LESS : '<';
GREATER : '>';
INT : 'int';
FLOAT : 'float';
SHORT : 'short';
CHAR : 'char';
LONG : 'long';
DECIMAL : 'decimal';


UNARYOP : MINUS | EXCLAMATION;
BINARYMATH : MINUS | PLUS | STAR | RSLASH; 
BINARYBITWISE : AND | OR |CARROT | SHIFTRIGHT | SHIFTLEFT;
BINARYLOGIC : ANDAND  | OROR | EQUALEQUAL | EXCLAMATIONEQUAL | LESSEQUAL | GREATEREQUAL | LESS | GREATER;
TYPE : INT | FLOAT | SHORT | CHAR | LONG | DECIMAL | IDENTIFIER;
TRUE: 'true';
FALSE: 'false';

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

DIGIT : '0'..'9';
NUMBER : DIGIT+ ('.' DIGIT+)?;

ALPHA : 'a'..'z' | 'A'..'Z' | '_';
IDENTIFIER : ALPHA (DIGIT | ALPHA)*;

WS : [ \t\r\n]+ -> skip;