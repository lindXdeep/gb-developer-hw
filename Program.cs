using System;

class Program
{
  public static void Main(String[] args)
  {
    string line = Console.ReadLine();
    string[] strSplit = line.Split(' ');

    int max = Convert.ToInt32(strSplit[0]);

    int i = strSplit.Length - 1;
    while (i > 0)
    {
      int x = Convert.ToInt32(strSplit[i--]);
      max = max < x ? x : max;
    }

    Console.WriteLine($"max = {max}");
  }
}