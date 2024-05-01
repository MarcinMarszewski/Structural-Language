lexer grammar LexerRules;

FOR: 'for';
WHILE: 'while';
IF: 'if';
ELSE: 'else';

BREAK: 'break';
CONTINUE: 'continue';

INT: 'int';
FLOAT: 'float';

TRUE: 'true';
FALSE: 'false';

LROUNDBRACKET: '(';
RROUNDBRACKET: ')';
LSQUAREBRACKET: '[';
RSQUAREBRACKET: ']';
LCURLYBRACKET: '{';
RCURLYBRACKET: '}';

QUESTIONMARK: '?';
COLON: ':';
EXCLAMATION : '!';
SEMICOLON: ';';

PLUS: '+';
MINUS: '-';
RSLASH: '/';
STAR: '*';

AND : '&';
OR : '|';
CARROT : '^';
PERCENT : '%';

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

EQUAL : '=';

NUMBER : DIGIT+ ('.' DIGIT+)?;
fragment DIGIT : '0'..'9';


IDENTIFIER : ALPHA (DIGIT | ALPHA)*;
fragment ALPHA : 'a'..'z' | 'A'..'Z' | '_';


WS : [ \t\r\n]+ -> skip;