using System;

class Program
{
  public static void Main(string[] args)
  {
    string[] input = Console.ReadLine().Split(" ");
    int M = Convert.ToInt32(input[0]);
    int N = Convert.ToInt32(input[1]);

    int s = NaturalSum(0, M, N);
    Console.WriteLine(s);
  }

  public static int NaturalSum(int sum, int m, int n)
  {
    if (n < m)
      return sum;

    return NaturalSum(sum + n, m, n - 1);
  }
}