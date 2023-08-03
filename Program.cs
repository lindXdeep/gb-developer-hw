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
    int size = strings.Length;

    for (int i = 0; i < size; i++)
    {
      Console.Write("[ ");
      for (int j = 0; j < strings[i].Length; j++)
      {
        Console.Write($"\"{strings[i][j]}\"");
        Console.Write(j != strings[i].Length - 1 ? ", " : " ]");
      }

      string s = string.Join("\", \"", op(strings[i]));
      Console.Write(s.Length != 0 ? $" => [ \"{s}\" ] \n" : " => [] \n");
    }
  }

  public static string[] GetLines(string[] lines)
  {
    int j = 0;
    string[] tmp = new string[lines.Length];

    for (int i = 0; i < lines.Length; i++)
      if (lines[i].Length <= 3)
        tmp[j++] = lines[i];

    lines = new string[j];
    for (int i = 0; i < j; i++)
      lines[i] = tmp[i];

    return lines;
  }
}

