using System;

class Program
{
  public static void Main(string[] args)
  {
    string[] input = Console.ReadLine().Split(" ");
    int M = Convert.ToInt32(input[0]);
    int N = Convert.ToInt32(input[1]);

    int a = Ackermann(M, N);
    Console.WriteLine(a);
  }

  public static int Ackermann(int m, int n)
  {
    if (m == 0)
      return Ackermann(m, n + 1);
    else if (m > 0 & n == 0)
      return Ackermann(m - 1, 1);
    else if (m > 0 & n > 0)
      return Ackermann(m - 1, Ackermann(m, n - 1));
    
    return 0;
  }
}

