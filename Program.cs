using System;

class Program
{
  public static void Main(string[] args)
  {
    int N = Convert.ToInt32(Console.ReadLine());

    NaturalNums(N);
  }

  public static int NaturalNums(int n)
  {
    Console.Write($"{n} ");

    if (n == 1)
      return 1;

    return NaturalNums(n - 1);
  }
}