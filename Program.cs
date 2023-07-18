using System;

class Program
{
  public static void Main(string[] args)
  {
    int m = 2;
    int n = 3;

    int[,] arr = new int[m, n];

    for (int i = 0; i < m; i++)
      for (int j = 0; j < n; j++)
        arr[i, j] = (int)(new Random().NextDouble() * 20);

    int rows = arr.GetUpperBound(0) + 1;
    int cols = arr.Length / rows;

    for (int i = 0; i < rows; i++)
    {
      for (int j = 0; j < cols; j++)
        Console.Write("{0, 5}", arr[i, j]);
      Console.WriteLine();
    }

    double[] count_cols = new double[rows + 1];

    for (int j = 0; j < cols; j++)
    {
      double sum = 0;
      for (int i = 0; i < rows; i++)
        sum += arr[i, j];
      count_cols[j] = sum / rows;
    }

    Console.WriteLine();
    foreach (var s in count_cols)
      Console.Write("{0, 5} ", s);
    Console.WriteLine();
  }
}