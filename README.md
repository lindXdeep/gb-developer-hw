<<<<<<< HEAD
# C# - Урок 1. Знакомство с языками программирования

## Задача 2: Напишите программу, которая на вход принимает 2 числа и выдаёт, какое число большее, а какое меньшее.

```
a = 5; b = 7 -> max = 7
a = 2 b = 10 -> max = 10
a = -9 b = -3 -> max = -3
```

### Решение:

```
commit 997cf6d1da9e66e5c186114fe0421b61c331b953
```

```c#
class Program
{
  public static void Main(String[] args)
  {
    string line = Console.ReadLine();
    string[] strSplit = line.Split(' ');

    int a = Convert.ToInt32(strSplit[0]);
    int b = Convert.ToInt32(strSplit[1]);

    int max = a < b ? b : a;
    int min = a > b ? b : a;

    Console.WriteLine($"min = {min}, max = {max}");
  }
}
```

## Задача 4: Напишите программу, которая принимает на вход три числа и выдаёт максимальное из этих чисел.

```
2, 3, 7 -> 7
44 5 78 -> 78
22 3 9 -> 22
```
### Решение:

```
commit ac9a6558d9410476421dfbf7d3bd8f8eed1c94be
```

```c#
class Program
{
  public static void Main(String[] args)
  {
    string line = Console.ReadLine();
    string[] strSplit = line.Split(' ');

    int max = Convert.ToInt32(strSplit[0]);

    int i = strSplit.Length - 1;
    while (i > 0)
    {
      int x = Convert.ToInt32(strSplit[i--]);
      max = max < x ? x : max;
    }

    Console.WriteLine($"max = {max}");
  }
}
```

## Задача 6: Напишите программу, которая на вход принимает число и выдаёт, является ли число чётным (делится ли оно на два без остатка).

```
4 -> да
-3 -> нет
7 -> нет
```

### Решение:

```
commit f71799e1883317b5a40389f8c7651938e6bc1253
=======
# C# - Урок 2. Базовые алгоритмы

## Задача 10: Напишите программу, которая принимает на вход трёхзначное число и на выходе показывает вторую цифру этого числа.
```
456 -> 5
782 -> 8
918 -> 1
```
### Решение

```
commit 514d922675d38944381ddab6faa1748a9f723096
>>>>>>> origin_old/hw-01.02
```

```c#
class Program
{
  public static void Main(String[] args)
  {
    int n = Convert.ToInt32(Console.ReadLine());

<<<<<<< HEAD
    Console.WriteLine(n % 2 == 0 ? "да" : "нет");
=======
    Console.WriteLine(n / 10 % 10);
>>>>>>> origin_old/hw-01.02
  }
}
```

<<<<<<< HEAD
## Задача 8: Напишите программу, которая на вход принимает число (N), а на выходе показывает все чётные числа от 1 до N.
```
5 -> 2, 4
8 -> 2, 4, 6, 8
```
### Решение:

```
commit 11689286ca23a7fa73137bba36578db89fb9e229 
=======
## Задача 13: Напишите программу, которая выводит третью цифру заданного числа или сообщает, что третьей цифры нет.
```
645 -> 5
78 -> третьей цифры нет
32679 -> 6
```

### Решение

```
commit 37abb6c6680bfa989edf56c62563ecc6fff27b03
>>>>>>> origin_old/hw-01.02
```

```c#
class Program
{
  public static void Main(String[] args)
  {
    int n = Convert.ToInt32(Console.ReadLine());

<<<<<<< HEAD
    int i = 0;
    while ((i += 2) < n)
    {
      Console.Write($"{i}, ");
    }
  }
}
```
=======
    while ((n /= 10) > 999) ;

    Console.WriteLine(n / 100 > 0 ? n % 10 : "третьей цифры нет");
  }
}
```

## Задача 15: Напишите программу, которая принимает на вход цифру, обозначающую день недели, и проверяет, является ли этот день выходным.
```
6 -> да
7 -> да
1 -> нет
```

```
commit 01c404ddab0a8c5dd8d0991583ba90429f28bd5b 
```
### Решение

```c#
class Program
{
  public static void Main(String[] args)
  {
    int n = Convert.ToInt32(Console.ReadLine());

    Console.WriteLine(n > 5 & n < 8 ? "да" : "нет");
  }
}
```
>>>>>>> origin_old/hw-01.02
