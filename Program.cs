using System;

class Program
{
  public static void Main(string[] args)
  {
    int[,] arr = {
      {1, 4, 7, 2},
      {5, 9, 2, 3},
      {8, 4, 2, 4}
    };

    printArray(arr);

    int row = arr.GetUpperBound(0) + 1;
    int cal = arr.Length / row;

    for (int i = 0; i < row; i++)
      for (int j = 0; j < cal; j++)
        for (int x = 0; x < cal; x++)
          for (int y = x; y < cal; y++)
            if (arr[i, x] < arr[i, y])
            {
              arr[i, y] ^= arr[i, x];
              arr[i, x] ^= arr[i, y];
              arr[i, y] ^= arr[i, x];
            }
            
    printArray(arr);
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

