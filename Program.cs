using System;

class Program
{
  public static void Main(string[] args)
  {
    Random r = new Random();

    int M = 2, N = 2, K = 2;

    int[,,] arr = new int[M, N, K];

    for (int i = 0; i < M; i++)
    {
      for (int j = 0; j < N; j++)
      {
        for (int l = 0; l < K; l++)
        {
          arr[i, j, l] = r.Next(10, 99);
          Console.Write($"{arr[i, j, l]}({i},{j},{l}) ");
        }
        Console.WriteLine();
      }
    }
  }
}