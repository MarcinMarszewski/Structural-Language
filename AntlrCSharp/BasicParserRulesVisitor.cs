using Antlr4.Runtime.Misc;
using static ParserRulesParser;

public class BasicParserRulesVisitor : ParserRulesBaseVisitor<object> 
{
    public List<DefinitionNode> definitions = new List<DefinitionNode>();

    public override object VisitProgram([NotNull] ProgramContext context)
    {
        Console.WriteLine(context.ChildCount);
        foreach (var definition in context.definition())
        {
            definitions.Add(new DefinitionNode { content = definition.GetText() });
        }
        return base.VisitProgram(context);
    }

    public List<string> types = new List<string>();
    public override object VisitFunction(FunctionContext context)
    {

        foreach (var type in context.TYPE())
        {
            types.Add(type.GetText());
        }
        return base.VisitFunction(context);
    }

    public override object VisitDefinition([NotNull] DefinitionContext context)
    {
        var a = context.GetType();

        return base.VisitDefinition(context);
    }

    public override object VisitBinary([NotNull] BinaryContext context)
    {
        var a = context.GetText();
        return base.VisitBinary(context);
    }
}