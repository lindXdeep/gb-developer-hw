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
  int m = Convert.ToInt32(input[0]);:
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
