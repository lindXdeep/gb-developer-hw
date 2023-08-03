# C# - [Урок 8. Двумерные массивы. Продолжение](../README.md)

## Задача 54: Задайте двумерный массив. Напишите программу, которая упорядочит по убыванию элементы каждой строки двумерного массива.

Например, задан массив:

```
1 4 7 2
5 9 2 3
8 4 2 4
```

В итоге получается вот такой массив:

```
7 4 2 1
9 5 3 2
8 4 4 2
```

### Решение:

```c#
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
```

## Задача 56: Задайте прямоугольный двумерный массив. Напишите программу, которая будет находить строку с наименьшей суммой элементов.

Например, задан массив:

```
1 4 7 2
5 9 2 3
8 4 2 4
5 2 6 7
```

Программа считает сумму элементов в каждой строке и выдаёт номер строки с наименьшей суммой элементов: 1 строка

```c#
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
```

## Задача 58: Задайте две матрицы. Напишите программу, которая будет находить произведение двух матриц.

Например, даны 2 матрицы:

```
2 4 | 3 4
3 2 | 3 3
```

Результирующая матрица будет:

```
18 20
15 18
```

### Решнеие:

```c#
using System;

class Program
{
  public static void Main(string[] args)
  {
    int[,] A = {
      {1,2},
      {3,4}
    };

    int[,] B = {
      {5,6,7},
      {8,9,10}
    };

    int rowA = A.GetUpperBound(0) + 1;
    int colA = A.Length / rowA;

    int rowB = B.GetUpperBound(0) + 1;
    int colB = B.Length / rowB;

    int[,] C = new int[rowB, colB];

    if (colA == rowB)
    {
      for (int i = 0; i < rowB; i++)
        for (int l = 0; l < colA; l++)
          for (int j = 0; j < colB; j++)
            C[l, j] += A[l, i] * B[i, j];
    }
    else
    {
      Console.WriteLine($"Такую матрицу перемножать нельзя");
    }

    printArray(A);
    printArray(B);
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
```

## Задача 60. ...Сформируйте трёхмерный массив из неповторяющихся двузначных чисел. Напишите программу, которая будет построчно выводить массив, добавляя индексы каждого элемента.

Массив размером 2 x 2 x 2

```
66(0,0,0) 25(0,1,0)
34(1,0,0) 41(1,1,0)
27(0,0,1) 90(0,1,1)
26(1,0,1) 55(1,1,1)
```
### Решнеие:

```c#
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
```

## Задача 62. Напишите программу, которая заполнит спирально массив 4 на 4.

Например, на выходе получается вот такой массив:

```
01 02 03 04
12 13 14 05
11 16 15 06
10 09 08 07
```

### Решнеие:

```c#
  int M = 5, N = 10;
  int[,] arr = new int[M, N];

  int i = 0;
  int j = -1;

  int row = 0;
  int col = 1; // начинаем движение в право

  int t = 1;
  while (t <= M * N)
  {
    if (
          (i + row >= 0 & i + row < M) &&
          (j + col >= 0 & j + col < N) &&
          arr[i + row, j + col] == 0
        )
    {
      i += row;
      j += col;
      arr[i, j] = t++;
    }
    else if (col == 1)
    {
      row = 1;
      col = 0;Задача 
    }
    else if (row == 1)
    {
      col = -1;
      row = 0;
    }
    else if (col == -1)
    {
      col = 0;
      row = -1;
    }
    else if (row == -1)
    {
      row = 0;
      col = 1;
    }
  }

  for (i = 0; i < M; i++)
  {
    for (j = 0; j < N; j++)
      Console.Write("{0,4}", arr[i, j]);
    Console.WriteLine();
  }
```

output:

```
  1   2   3   4   5   6   7   8   9  10
  26  27  28  29  30  31  32  33  34  11
  25  44  45  46  47  48  49  50  35  12
  24  43  42  41  40  39  38  37  36  13
  23  22  21  20  19  18  17  16  15  14
```