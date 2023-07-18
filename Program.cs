using System;

class Program
{
  public static void Main(string[] args)
  {
    int m = 3;
    int n = 4;

    int[,] arr = new int[m, n];

    for (int i = 0; i < m; i++)
      for (int j = 0; j < n; j++)
        arr[i, j] = Math.Ceiling(new Random().NextDouble() * 20);

    int rows = arr.GetUpperBound(0) + 1;
    int cols = arr.Length / rows;

    for (int i = 0; i < rows; i++)
    {
      for (int j = 0; j < cols; j++)
        Console.Write("{0, 7}", arr[i, j]);
      Console.WriteLine();
    }

  }
}