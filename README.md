# C# - Урок 8. Двумерные массивы. Продолжение
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