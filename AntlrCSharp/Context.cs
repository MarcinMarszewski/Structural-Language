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

        public void AddVariable(string name, VariableType type, object value)
		{
			variables.Add(name, new Variable(type, value));
		}

		//Tutaj logika sprawdzająca i konwertująca typy (float na int itp.)
		//na razie tylko takie same typy przechodzą
		public void UpdateVariable(string name, VariableType type, object value)
		{
			if (variables.ContainsKey(name))
			{
				if (variables[name].type == type)
					variables[name] = new Variable(type,value);
				else
					throw new LanguageError($"Types don't match when assigning to variable: {name}");
			}
			else if(previous != null) {
				previous.UpdateVariable(name, type, value);
			}
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
	}
}
