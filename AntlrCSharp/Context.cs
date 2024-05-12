using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AntlrCSharp
{
	public enum VariableType
	{
		INT,
		FLOAT,
		CONTAINER,
		EVENT,
		NULL,
		CONTINUE_HNDL,
		BREAK_HNDL,
		RETURN_HNDL,
	}

	public class Variable
	{
		public VariableType type;
		public object value;

        public Variable(VariableType type, object value)
        {
            this.type = type;
            this.value = value;
        }

        public Type VariableTypeToCSharpType(VariableType t)
		{
			switch (t)
			{
				case VariableType.INT:
					return typeof(int);
				case VariableType.FLOAT: 
					return typeof(float);
                case VariableType.NULL:
					return null;
                case VariableType.CONTAINER:
				case VariableType.EVENT:
					
				default:
					throw new LanguageError($"Cannot convert Variable Type: {t}");

			}
		}

        public VariableType CSharpTypeToVariableType(Type t)
        {
			if(t == typeof(float)) return VariableType.FLOAT;
            if (t == typeof(int)) return VariableType.INT;

			return VariableType.NULL;
        }
    }

	//TODO: error handling
	internal class VariableEnvironment
	{
		private Dictionary<string,Variable> variables = new Dictionary<string, Variable>();
		public VariableEnvironment? previous { get; private set; }

        public VariableEnvironment(VariableEnvironment previous)
        {
            this.previous = previous;
        }

        public VariableEnvironment()
        {
			previous = null;
        }

        public void AddVariable(string name, Variable var)
		{
			variables.Add(name, var);
		}

        public void UpdateVariable(string name, Variable var)
		{
			if (variables.ContainsKey(name)){
					variables[name] = ConvertType(var, variables[name].type);
			}
			else if(previous != null) {
				previous.UpdateVariable(name, var);
			}
			throw new LanguageError($"Cannot assign to not existant variable {name}.");
		}

		public Variable GetVariable(string name)
		{
			if (variables.ContainsKey(name)) 
				return variables[name];
			else if(previous is not null)
				return previous.GetVariable(name);
			throw new LanguageError($"No variable named {name} in context.");
		}

		public VariableType GetType(string name)
		{
            if (variables.ContainsKey(name))
                return variables[name].type;
			else if(previous!= null) 
				return previous.GetType(name);
            throw new LanguageError($"No variable named {name} in context.");
        }



		public static Variable ConvertType(Variable value, VariableType convertTo)
		{
			if(value.type == convertTo) return value;
			if(value.type == VariableType.INT && convertTo == VariableType.FLOAT)
			{
				value.value = Convert.ToSingle(value.value);
				return value;
			}
            throw new LanguageError($"Type {value.type} cannot be converted to {convertTo}.");
        }
	}
}
