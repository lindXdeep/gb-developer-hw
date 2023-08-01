# C# - Знакомство с языками программирования

## Задача 47. Задайте двумерный массив размером m×n, заполненный случайными вещественными числами.
```
m = 3, n = 4.

0,5 7 -2 -0,2
1 -3,3 8 -9,9
8 7,8 -7,1 9
```

### Решение:

```c#
  string[] input = Console.ReadLine().Split(' ');
  int m = Convert.ToInt32(input[0]);
  int n = Convert.ToInt32(input[1]);

  double[,] arr = new double[m, n];

  for (int i = 0; i < m; i++)
    for (int j = 0; j < n; j++)
      arr[i, j] = Math.Round(new Random().NextDouble() * 20, 2);

  int rows = arr.GetUpperBound(0) + 1;
  int cols = arr.Length / rows;

  for (int i = 0; i < rows; i++)
  {
    for (int j = 0; j < cols; j++)
      Console.Write("{0, 7}", arr[i, j]);
    Console.WriteLine();
  }
```

## Задача 50. Напишите программу, которая на вход принимает позиции элемента в двумерном массиве, и возвращает значение этого элемента или же указание, что такого элемента нет.

Например, задан массив:
```
1 4 7 2
5 9 2 3
8 4 2 4
17 -> такого числа в массиве нет
```

### Решение

```c#

  // . . . 

  string[] coord = Console.ReadLine().Split(' ');
  int x = Convert.ToInt32(coord[0]);
  int y = Convert.ToInt32(coord[1]);

  Console.WriteLine(x > n || y > m ? "такого числа в массиве нет" : $"{arr[x, y]}");
```

## Задача 52. Задайте двумерный массив из целых чисел. Найдите среднее арифметическое элементов в каждом столбце.

Например, задан массив:

```
1 4 7 2
5 9 2 3
8 4 2 4
```

Среднее арифметическое каждого столбца: 4,6; 5,6; 3,6; 3.

## Решение

```c#

// .  .  .

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
```