using System.Text;
using Antlr4.Runtime;

while (true)
try
{
    string input = "";
    StringBuilder text = new StringBuilder();
    Console.WriteLine("Input the program:");

    while((input = Console.ReadLine()) != "u0004")
    {
        text.AppendLine(input);
    }

    AntlrInputStream antlrInputStream = new AntlrInputStream(text.ToString());

    ParserRulesLexer lexer = new ParserRulesLexer( antlrInputStream );
    CommonTokenStream commonTokenStream = new CommonTokenStream( lexer );
    ParserRulesParser parser = new ParserRulesParser( commonTokenStream );

    ParserRulesParser.ExpressionContext programContext = parser.expression();
    BasicParserRulesVisitor visitor = new BasicParserRulesVisitor();
    visitor.Visit(programContext);
}
catch (Exception ex)
{
    Console.WriteLine (ex.Message);
}