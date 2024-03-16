using System.Text;
using Antlr4.Runtime;

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

    ParserRulesParser.ProgramContext programContext = parser.program();
    BasicParserRulesVisitor visitor = new BasicParserRulesVisitor();
    visitor.Visit(programContext);

    foreach(var x in visitor.definitions)
    {
        Console.WriteLine(x.content);
    }

    foreach(var y in visitor.types) 
    { 
        Console.WriteLine(y);
    }
}
catch (Exception ex)
{
    Console.WriteLine (ex);
}