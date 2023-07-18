using System;

class Program
{
  public static void Main(string[] args)
  {
    int[,] arr = {
      {1, 4, 7, 2},
      {5, 9, 2, 3},
      {8, 4, 2, 4},
      {5, 2, 6, 7}
    };

    printArray(arr);

    int row = arr.GetUpperBound(0) + 1;
    int cal = arr.Length / row;

    int[] counts = new int[row];

    for (int i = 0; i < row; i++)
      for (int j = 0; j < cal; j++)
        counts[i] += arr[i, j];

    int min = int.MaxValue;
    int idx = 0;
    for (int i = 0; i < counts.Length; i++)
    {
      if (counts[i] < min)
      {
        min = counts[i];
        idx = i;
      }
    }

    Console.WriteLine(idx);
  }

  public static void printArray(int[,] arr)
  {
    Console.WriteLine();
    int row = arr.GetUpperBound(0) + 1;
    int cal = arr.Length / row;

    for (int i = 0; i < row; i++)
    {
      for (int j = 0; j < cal; j++)
        Console.Write($"{arr[i, j]} ");
      Console.WriteLine();
    }
  }
}