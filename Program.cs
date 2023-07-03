using System;

class Program
{
  public static void Main(string[] args)
  {
    string[] input = Console.ReadLine().Split(" ");

    int a = int.Parse(input[0]);
    int b = int.Parse(input[1]);

    int n = 1;
    while (b-- > 0)
      n *= a;

    Console.WriteLine($"{n}");
  }
}