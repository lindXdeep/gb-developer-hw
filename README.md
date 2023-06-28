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
```

```c#
class Program
{
  public static void Main(String[] args)
  {
    int n = Convert.ToInt32(Console.ReadLine());

    Console.WriteLine(n % 2 == 0 ? "да" : "нет");
  }
}
```

## Задача 8: Напишите программу, которая на вход принимает число (N), а на выходе показывает все чётные числа от 1 до N.
```
5 -> 2, 4
8 -> 2, 4, 6, 8
```
### Решение:

```
commit 11689286ca23a7fa73137bba36578db89fb9e229 
```

```c#
class Program
{
  public static void Main(String[] args)
  {
    int n = Convert.ToInt32(Console.ReadLine());

    int i = 0;
    while ((i += 2) < n)
    {
      Console.Write($"{i}, ");
    }
  }
}
```
