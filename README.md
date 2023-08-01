# C# - Урок 9. Рекурсия

## Задача 64: Задайте значение N. Напишите программу, которая выведет все натуральные числа в промежутке от N до 1. Выполнить с помощью рекурсии.

```
N = 5 -> "5, 4, 3, 2, 1"
N = 8 -> "8, 7, 6, 5, 4, 3, 2, 1"
```

## Решение:

```c#
using System;

class Program
{
  public static void Main(string[] args)
  {
    int N = Convert.ToInt32(Console.ReadLine());

    NaturalNums(N);
  }

  public static int NaturalNums(int n)
  {
    Console.Write($"{n} ");

    if (n == 1)
      return 1;

    return NaturalNums(n - 1);
  }
}
```
