lexer grammar LexerRules;

TRUE: 'true';
FALSE: 'false';

QUESTIONMARK: '?';
COLON: ':';
EXCLAMATION : '!';

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

NUMBER : DIGIT+ ('.' DIGIT+)?;
fragment DIGIT : '0'..'9';


IDENTIFIER : ALPHA (DIGIT | ALPHA)*;
fragment ALPHA : 'a'..'z' | 'A'..'Z' | '_';


WS : [ \t\r\n]+ -> skip;