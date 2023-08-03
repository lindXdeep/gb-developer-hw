using System;

delegate string[] Operation(string[] lines);
class Program
{
  public static void Main(string[] args)
  {
    string[][] lines = {
      new String[] { "Hello", "2", "world", ":-)"},
      new string[] { "1234", "1567", "-2", "computer science" },
      new string[] { "Russia", ":Denmark", "Kazan" }
    };

    TestGetLines(lines, GetLines);
  }

  public static void TestGetLines(string[][] strings, Operation op)
  {
    string[] s = op(strings[0]);

    Console.WriteLine("Testing: " + s[0]);
  }

  public static string[] GetLines(string[] lines)
  {
    return lines;
  }
}

