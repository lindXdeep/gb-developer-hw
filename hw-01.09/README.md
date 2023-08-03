# C# - [Урок 9. Рекурсия](../README.md)


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

## Задача 66: Задайте значения M и N. Напишите программу, которая найдёт сумму натуральных элементов в промежутке от M до N.

```
M = 1; N = 15 -> 120
M = 4; N = 8. -> 30
```

## Решение:

```c#
using System;

class Program
{
  public static void Main(string[] args)
  {
    string[] input = Console.ReadLine().Split(" ");
    int M = Convert.ToInt32(input[0]);
    int N = Convert.ToInt32(input[1]);

    int s = NaturalSum(0, M, N);
    Console.WriteLine(s);
  }

  public static int NaturalSum(int sum, int m, int n)
  {
    if (n < m)
      return sum;

    return NaturalSum(sum + n, m, n - 1);
  }
}
```

## Задача 68: Напишите программу вычисления функции Аккермана с помощью рекурсии. Даны два неотрицательных числа m и n.

```
m = 2, n = 3 -> A(m,n) = 9
m = 3, n = 2 -> A(m,n) = 29
```

## Решение:

Функция Аккермана определяется рекурсивно для неотрицательных целых чисел m и n следующим образом:

$$
A(m, n) = \begin{cases}
  n + 1, \qquad\qquad\qquad\qquad m = 0;\\
  A(m - 1,  1), \qquad\qquad\quad~ m > 0, n = 0;\\
  A(m - 1, A(m, n - 1)), ~~ m > 0, n > 0.
\end{cases}
$$

Справа в формуле указаны условия при которых выполняются расчёты.

```c#
using System;

class Program
{
  public static void Main(string[] args)
  {
    string[] input = Console.ReadLine().Split(" ");
    int M = Convert.ToInt32(input[0]);
    int N = Convert.ToInt32(input[1]);

    int a = Ackermann(M, N);
    Console.WriteLine(a);
  }

  public static int Ackermann(int m, int n)
  {
    if (m == 0)
      return n + 1;
    else if (m > 0 & n == 0)
      return Ackermann(m - 1, 1);
    else if (m > 0 & n > 0)
      return Ackermann(m - 1, Ackermann(m, n - 1));

    return Ackermann(m, n);
  }
}
```