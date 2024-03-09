grammar ParserRules;

import LexerRules;

program : (definition )* ;

definition : structDefinition | enumerableDefinition | variableDeclaration | function | arrayDeclaration ;
structDefinition : STRUCT IDENTIFIER  LCURLYBRACKET  (TYPE ( LSQUAREBRACKET RSQUAREBRACKET)? IDENTIFIER  SEMICOLON )+ RCURLYBRACKET;
enumerableDefinition : ENUM IDENTIFIER  LCURLYBRACKET  IDENTIFIER  (EQUAL  NUMBER)?  (COMMA  IDENTIFIER  (EQUAL  NUMBER )? )*  COMMA?  RCURLYBRACKET;
function : TYPE IDENTIFIER  LPARENTHESIS  (TYPE IDENTIFIER  (COMMA  TYPE IDENTIFIER  )*)?  RPARENTHESIS  LCURLYBRACKET  (statement )* RCURLYBRACKET;
variableDeclaration : TYPE (IDENTIFIER | assignment)  (COMMA  (IDENTIFIER | assignment)  )*  SEMICOLON;
arrayDeclaration : TYPE  LSQUAREBRACKET  RSQUAREBRACKET (IDENTIFIER | arrayAssignment)  (COMMA  (IDENTIFIER | arrayAssignment) )*  SEMICOLON;
arrayAssignment : IDENTIFIER  EQUAL  TYPE  LSQUAREBRACKET  expression  RSQUAREBRACKET;


statement : switchStatement | variableDeclaration | arrayDeclaration | expressionStatement | whileStatement | block | forStatement | doWhileStatement | returnStatement | breakStatement | continueStatement;

block : LCURLYBRACKET  (statement )* RCURLYBRACKET;
expressionStatement : expression  SEMICOLON;
whileStatement : WHILE  LPARENTHESIS  expression RPARENTHESIS  statement;
forStatement : FOR  LPARENTHESIS  (variableDeclaration | SEMICOLON)  expression?  SEMICOLON  expression?  RPARENTHESIS  statement;
doWhileStatement : DO  statement  WHILE  LPARENTHESIS  expression  RPARENTHESIS SEMICOLON ;
switchStatement : SWITCH  LPARENTHESIS  expression  RPARENTHESIS  LCURLYBRACKET  case  ((case | statement)  )*  (DEFAULT  COLON  (statement  )*)?  RCURLYBRACKET;
case : CASE expression  COLON;
returnStatement : RETURN expression  SEMICOLON;
breakStatement : BREAK  SEMICOLON;
continueStatement : CONTINUE  SEMICOLON;

expression : ternary;

ternary : binary (QUESTIONMARK expression COLON expression)?;

binary : primary ( (BINARYMATH | BINARYBITWISE | BINARYLOGIC) primary)?;

primary : IDENTIFIER | NUMBER | DECIMAL | call | grouping | unary | assignment | arrayAccess | fieldAccess | typeCast | BOOLVAL | arrayAssignment;

unary : UNARYOP expression;
grouping : LPARENTHESIS  expression  RPARENTHESIS;

arrayAccess : IDENTIFIER  LSQUAREBRACKET  expression  RSQUAREBRACKET;
call : IDENTIFIER LPARENTHESIS (expression  (COMMA  expression )* )? RPARENTHESIS;
typeCast : LPARENTHESIS  TYPE  RPARENTHESIS  expression;
assignment : IDENTIFIER  (BINARYMATH | BINARYBITWISE)? EQUAL expression;
fieldAccess : IDENTIFIER DOT IDENTIFIER;


