using System.Text;
using Antlr4.Runtime;
using AntlrCSharp;

while (true)
try
{
	string input = "";
	StringBuilder text = new StringBuilder();
	Console.WriteLine("Input the program:");

	while((input = Console.ReadLine()) != "u4")
	{
		text.AppendLine(input);
	}

	AntlrInputStream antlrInputStream = new AntlrInputStream(text.ToString());

	ParserRulesLexer lexer = new ParserRulesLexer( antlrInputStream );
	CommonTokenStream commonTokenStream = new CommonTokenStream( lexer );

	ParserRulesParser parser = new ParserRulesParser( commonTokenStream );
	ParserRulesParser.ProgramContext programContext = parser.program();


	BasicParserRulesVisitor visitor = new BasicParserRulesVisitor();
	BasicParserRulesVisitor.ClearFunctions();
	visitor.Visit(programContext);
}
catch (Exception ex)
{
	Console.WriteLine (ex.Message);
}