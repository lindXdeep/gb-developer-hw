using System;

class Program
{
  public static void Main(string[] args)
  {
    int[,] A = {
      {2,4},
      {3,2}
    };

    int[,] B = {
      {3,4,5},
      {3,3,2}
    };

    printArray(A);
    printArray(B);


    int rowA = A.GetUpperBound(0) + 1;
    int colA = A.Length / rowA;

    int rowB = B.GetUpperBound(0) + 1;
    int colB = B.Length / rowB;

    int[,] C = new int[rowB, colB];

    if (colA == rowB)
    {

      for (int i = 0; i < rowA; i++)
      {
        for (int j = 0; j < colA; j++)
        {
          Console.Write($"{A[i, j]}");
        }
      }


      Console.WriteLine();

      for (int i = 0; i < rowB; i++)
      {
        for (int j = 0; j < colB; j++)
        {
          Console.Write($"{B[i, j]}");
        }
      }


    }
    else
    {
      Console.WriteLine($"Такую матрицу перемножать нельзя");
    }






    printArray(C);

  }

  private static void printArray(int[,] arr)
  {
    Console.WriteLine();

    int row = arr.GetUpperBound(0) + 1;
    int col = arr.Length / row;

    for (int i = 0; i < row; i++)
    {
      for (int j = 0; j < col; j++)
        Console.Write($"{arr[i, j]} ");
      Console.WriteLine();
    }
  }
}