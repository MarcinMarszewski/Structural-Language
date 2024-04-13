using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AntlrCSharp
{
    internal class LanguageError : Exception
    {
        public LanguageError(string? message) : base(message)
        {
        }
    }
}
