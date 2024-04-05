using System;
using System.Collections.Generic;
using System.Linq;
using System.Linq.Expressions;
using System.Text;
using System.Threading.Tasks;

namespace AntlrCSharp
{
    class AST
    {

        class Program_
        {
            List<Definition_> definitions;
        }

        //might reduce to one abstract class for visitor

        abstract class Definition_
        {

        }

        abstract class Statement_
        {

        }

        abstract class Expression_
        {

        }


        //definitions
        class Struct_
        {
            Identifier_ identifier;
            List<VariableDeclaration_> variables;
        }

        class Enumerable_
        {
            Identifier_ identifier;
            List<VariableDeclaration_> enumValues;
        }

        class Function_
        {
            Identifier_ identifier;
            List<Statement_> body;

            List<VariableDeclaration_> parameters;
        }

        //statements

        class VariableDeclaration_
        {
            Type_ type;
            Identifier_ identifier;
            Expression_ value;
        }

        class VariableAssignment_
        {
            Identifier_ identifier;
            Expression value;
        }

        class Block_
        {
            List<Statement_> body;
        }

        class ExpressionStatement_
        {
            Expression_ expression;
        }

        class While_
        {
            Expression_ condition;
            Statement_ body;
        }

        class For_
        {
            VariableDeclaration_ variableDeclaration;
            Expression_ condition;
            Expression_ doAtEnd;
            Statement_ body;
        }

        class DoWhile_
        {
            Expression_ condition;
            Statement_ body;
        }

        class If_
        {
            Expression_ condition;
            Statement_ then;
            Statement_ otherwise;
        }
        
        class Switch_
        {
            Expression_ pattern;
            List<Statement_> body;
        }

        class Case_
        {
            Expression_ match;
        }

        class Return_
        {
            Expression_ returnValue;
        }

        class Default_
        {

        }

        class Break_
        {

        }

        class Continue_
        {

        }



        class Ternary_
        {
            Expression_ condition;
            Expression_ then;
            Expression_ otherwise;
        }

        class Binary_
        {
            Expression_ value1;
            Expression_ value2;
            Operator_ op;
        }

        class Unary_
        {
            Expression_ value;
            Operator_ op;
        }

        class Grouping_
        {
            Expression value;
        }

        class ArrayAccess_
        {
            Identifier_ identifier;
            Expression_ index;
        }

        class Call_
        {
            Identifier_ identifier;
            List<Expression_> arguments;
        }   

        class FieldAccess_
        {
            Identifier_ structure;
            Identifier_ field;
        }


        class Identifier_
        {

        }

        class Type_
        {

        }

        class Operator_
        {

        }

    }
}
