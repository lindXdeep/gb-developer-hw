using System;

class Program
{
  public static void Main(String[] args)
  {
    int n = Convert.ToInt32(Console.ReadLine());

    int i = 0;
    while ((i += 2) < n)
    {
      Console.Write($"{i}, ");
    }
  }
}