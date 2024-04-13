using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AntlrCSharp
{
	internal struct Variable 
	{
		public Type type;
		public object value;
	}
	//TODO: error handling
	internal class VariableEnvironment
	{
		private Dictionary<string,Variable> variables = new Dictionary<string, Variable>();
		private VariableEnvironment previous;

		public void AddVariable(string name, Type type, object value)
		{
			variables.Add(name, new Variable() { type = type, value = value});
		}

		//Tutaj logika sprawdzająca i konwertująca typy (float na int itp.)
		//na razie tylko takie same typy przechodzą
		public void UpdateVariable(string name, Type type, object value)
		{
			if (variables.ContainsKey(name))
			{
				if (variables[name].type == type)
					variables[name] = new Variable() { type = type, value = value };
				else
					throw new LanguageError($"Types don't match when assigning to variable: {name}");
			}
			else if(previous != null) {
				previous.UpdateVariable(name, type, value);
			}
		}

		public object GetVariable(string name)
		{
			if (variables.ContainsKey(name)) 
				return variables[name].value;
			throw new LanguageError($"No variable named {name} in context.");
		}

		public Type GetType(string name)
		{
            if (variables.ContainsKey(name))
                return variables[name].type;
            throw new LanguageError($"No variable named {name} in context.");
        }
	}
}
