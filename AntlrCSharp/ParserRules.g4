grammar ParserRules;

import LexerRules;

//topmost list of rules, subject to change
program: statement+;

statement: expressionStatement | variableDeclaration | blockStatement | whileStatement | forStatement | breakStatement | continueStatement | ifStatement;
 
breakStatement: BREAK SEMICOLON;
continueStatement: CONTINUE SEMICOLON;

ifStatement: IF grouping blockStatement (ELSE blockStatement)?;

variableDeclaration: variableDeclarationExpression SEMICOLON;
variableDeclarationExpression: type IDENTIFIER (EQUAL expression)?;

type: (INT | FLOAT) (LSQUAREBRACKET RSQUAREBRACKET)* ;

expressionStatement: expression SEMICOLON;

blockStatement: LCURLYBRACKET (statement)* RCURLYBRACKET;

whileStatement: WHILE grouping blockStatement;

forStatement : FOR LROUNDBRACKET variableDeclarationExpression SEMICOLON expression SEMICOLON expression RROUNDBRACKET blockStatement;


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