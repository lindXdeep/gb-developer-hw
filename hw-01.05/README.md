# C# - Урок 5. Функции и одномерные массивы

## Задача 34: Задайте массив заполненный случайными положительными трёхзначными числами. Напишите программу, которая покажет количество чётных чисел в массиве.

```
[345, 897, 568, 234] -> 2
```

### Решение

```c#
  public static void Main(string[] args)
  {
    int[] arr = GetRandom(100, 999, 10);

    int count = 0;
    for (int i = 0; i < arr.Length; i++)
    {
      Console.Write($"{arr[i]}, ");
      if (arr[i] % 2 == 0)
        count++;
    }
    Console.WriteLine($" -> {count}");
  }

  public static int[] GetRandom(int min, int max, int size)
  {
    int[] arr = new int[size];

    for (int i = 0; i < size; i++)
      arr[i] = new Random().Next(min, max);

    return arr;
  }
```

## Задача 36: Задайте одномерный массив, заполненный случайными числами. Найдите сумму элементов, стоящих на нечётных позициях.

```
[3, 7, 23, 12] -> 19
[-4, -6, 89, 6] -> 0
```

### Решение:

```c#
  int sum = 0;
  for (int i = 0; i < arr.Length; i++)
  {
    Console.Write($"{arr[i]}, ");
    if (i % 2 != 0)
      sum += arr[i];
  }
  Console.WriteLine($" -> {sum}");
```

## Задача 38: Задайте массив вещественных чисел. Найдите разницу между максимальным и минимальным элементов массива.

```
[3.22, 4.2, 1.15, 77.15, 65.2] => 77.15 - 1.15 = 76
```

### Решение:

```c#
  public static void Main(string[] args)
  {
    double[] arr = GetRandom(5);

    double max = arr[0];
    double min = arr[1];
    for (int i = 0; i < arr.Length; i++)
    {
      Console.Write($"{arr[i]}, ");

      if (arr[i] < min)
        min = arr[i];
      else if (arr[i] > max)
        max = arr[i];
    }

    double res = max - min;

    Console.WriteLine(" -> {0:0.00}", res);
  }

  public static double[] GetRandom(int size)
  {
    double[] arr = new double[size];

    for (int i = 0; i < size; i++)
      arr[i] = Math.Round(new Random().NextDouble() * 20, 2);

    return arr;
  }
```