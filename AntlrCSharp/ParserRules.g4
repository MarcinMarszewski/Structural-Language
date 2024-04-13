grammar ParserRules;

import LexerRules;

//topmost list of rules, subject to change
program: statement+;

statement: expressionStatement | variableDeclaration;

variableDeclaration: type IDENTIFIER (EQUAL expression)? SEMICOLON ;
//identifier currently can be type, but isnt used yet
type: (IDENTIFIER | INT | FLOAT) (LSQUAREBRACKET RSQUAREBRACKET)* ;

expressionStatement: expression SEMICOLON;


expression : ternary;

ternary : binary (QUESTIONMARK expression COLON expression)?;
//need to adjust for order of operations
binary : primary ( binaryOp binary)?;

primary : value | unary | grouping | variableAccess | variableAssignment;

variableAssignment: IDENTIFIER EQUAL expression;

variableAccess : IDENTIFIER;

grouping : LROUNDBRACKET expression RROUNDBRACKET;

value:  number | true | false;

unary: (MINUS | EXCLAMATION) primary;

binaryOp: PLUS | MINUS | AND | ANDAND | CARROT | EQUALEQUAL | EXCLAMATIONEQUAL | GREATER | GREATEREQUAL | LESS | LESSEQUAL | OR | OROR | PERCENT | RSLASH | SHIFTLEFT | SHIFTRIGHT | STAR ;

number: NUMBER;
true: TRUE;
false: FALSE;