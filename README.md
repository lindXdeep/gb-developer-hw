# C# - Урок 3. Базовые алгоритмы. Продолжение

## Задача 19: Напишите программу, которая принимает на вход пятизначное число и проверяет, является ли оно палиндромом.

```
14212 -> нет
12821 -> да
23432 -> да
```

### Решение 1: Без массива

```c#
    int n = Convert.ToInt32(Console.ReadLine());

    int t = n;
    int p = 0;
    while (n > 0)
    {
      int x = n % 10;

      n /= 10;

      p = p * 10 + x;
    }

    Console.WriteLine(t == p ? "да" : "нет");
```

### Решение 2: С массивом

```c#
  public static void Main(string[] args)
  {
    int n = Convert.ToInt32(Console.ReadLine());

    int[] arr = new int[Convert.ToString(n).Length];

    int i = 0;
    while (n > 0)
    {
      arr[i++] = n % 10;
      n /= 10;
    }

    int b = 0;
    int e = arr.Length - 1;
    while (b != e)
    {
      if (arr[b++] != arr[e--])
      {
        Console.WriteLine("нет");
        return;
      }
    }

    Console.WriteLine("да");
  }
```