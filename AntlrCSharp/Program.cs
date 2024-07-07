using System.Text;
using Antlr4.Runtime;
using AntlrCSharp;

namespace AntlrCSharp
{
	class Program
	{
		static void Main(string[] args)
		    {
                if (args.Length < 1)
                    Console.WriteLine($"Usage: AntlrCSharp <code_file>");
                else
                try
                {
                        string path = Path.GetFullPath(args[0]);
                        string code = File.ReadAllText(path);

                        AntlrInputStream antlrInputStream = new AntlrInputStream(code);

                        ParserRulesLexer lexer = new ParserRulesLexer(antlrInputStream);
                        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);

                        ParserRulesParser parser = new ParserRulesParser(commonTokenStream);
                        ParserRulesParser.ProgramContext programContext = parser.program();


                        BasicParserRulesVisitor visitor = new BasicParserRulesVisitor();
                        BasicParserRulesVisitor.ClearFunctions();
                        visitor.Visit(programContext);
                }
                catch (Exception ex)
                {
                    Console.WriteLine(ex.Message);
                }
        }
	} 
}
