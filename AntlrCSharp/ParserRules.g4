grammar ParserRules;

import LexerRules;

//topmost list of rules, subject to change
program: function+;

function: type IDENTIFIER LROUNDBRACKET (parameter (COMMA parameter)* )? RROUNDBRACKET    LCURLYBRACKET statement* RCURLYBRACKET;
parameter: type IDENTIFIER;

statement: expressionStatement | variableDeclaration | blockStatement | whileStatement | forStatement | breakStatement | continueStatement | returnStatement | ifStatement;
 
returnStatement: RETURN expression? SEMICOLON;
breakStatement: BREAK SEMICOLON;
continueStatement: CONTINUE SEMICOLON;

ifStatement: IF grouping blockStatement (ELSE blockStatement)?;

variableDeclaration: variableDeclarationExpression SEMICOLON;   ////TODO: can be removed
variableDeclarationExpression: type IDENTIFIER (EQUAL expression)?;

type: (INT | FLOAT)  (LSQUAREBRACKET RSQUAREBRACKET)?  ;

expressionStatement: expression SEMICOLON;

blockStatement: LCURLYBRACKET (statement)* RCURLYBRACKET;

whileStatement: WHILE grouping blockStatement;

forStatement : FOR LROUNDBRACKET variableDeclarationExpression SEMICOLON expression SEMICOLON expression RROUNDBRACKET blockStatement;///TODO: make for expressions optional


expression : ternary; ///TODO: can be removed

ternary : binaryLogic (QUESTIONMARK expression COLON expression)?;

binaryLogic :binaryCompare (binaryLogicOp binaryLogic)?;
binaryCompare: binaryBitwise (binaryCompareOp binaryCompare)?;
binaryBitwise:binaryAdditive (binaryBitwiseOp binaryBitwise)?;
binaryAdditive: binaryMultiplicative (binaryAdditiveOp binaryAdditive)?;
binaryMultiplicative: primary (binaryMultiplicativeOp binaryMultiplicative)?;


primary : createArray | value | unary | grouping | variableAccess | variableAssignment | call | arrayAssignment  | arrayAccess ;

createArray: (INT | FLOAT) LSQUAREBRACKET expression RSQUAREBRACKET ;

//tu powinien być expression zamiast identifier zeby potem robic func()[0]
arrayAssignment: (variableAccess | call | grouping) LSQUAREBRACKET expression RSQUAREBRACKET EQUAL expression ;
//tutaj teeeeez x.x
arrayAccess: (variableAccess | call | grouping) LSQUAREBRACKET expression RSQUAREBRACKET ; 

call: IDENTIFIER LROUNDBRACKET (expression (COMMA expression)* )? RROUNDBRACKET;

variableAssignment: IDENTIFIER EQUAL expression;

variableAccess : IDENTIFIER;

grouping : LROUNDBRACKET expression RROUNDBRACKET;

value:  number | true | false;

unary: (MINUS | EXCLAMATION) primary;

binaryLogicOp: ANDAND | OROR;
binaryCompareOp: EQUALEQUAL | EXCLAMATIONEQUAL | GREATER | GREATEREQUAL | LESS | LESSEQUAL;
binaryBitwiseOp: AND | CARROT | OR| SHIFTLEFT | SHIFTRIGHT;
binaryMultiplicativeOp: PERCENT| RSLASH | STAR ;
binaryAdditiveOp: PLUS | MINUS;

number: NUMBER;
true: TRUE;
false: FALSE;