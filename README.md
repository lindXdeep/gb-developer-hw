# C# - Знакомство с языками программирования

## Задача 2: Напишите программу, которая на вход принимает 2 числа и выдаёт, какое число большее, а какое меньшее.

```
a = 5; b = 7 -> max = 7
a = 2 b = 10 -> max = 10
a = -9 b = -3 -> max = -3
```

### Решение:

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

```
commit 997cf6d1da9e66e5c186114fe0421b61c331b953
```

## Задача 4: Напишите программу, которая принимает на вход три числа и выдаёт максимальное из этих чисел.

```
2, 3, 7 -> 7
44 5 78 -> 78
22 3 9 -> 22
```
### Решение:

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

```
commit ac9a6558d9410476421dfbf7d3bd8f8eed1c94be
```