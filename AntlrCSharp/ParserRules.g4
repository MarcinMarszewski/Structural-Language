grammar ParserRules;

import LexerRules;



expression : ternary;

ternary : binary (QUESTIONMARK expression COLON expression)?;

binary : primary ( binaryOp binary)?;

primary : value;

value:  number | true | false;

binaryOp: PLUS | MINUS | AND | ANDAND | CARROT | EQUALEQUAL | EXCLAMATIONEQUAL | GREATER | GREATEREQUAL | LESS | LESSEQUAL | OR | OROR | PERCENT | RSLASH | SHIFTLEFT | SHIFTRIGHT | STAR ;

number: NUMBER;
true: TRUE;
false: FALSE;