# C# - [Урок 3. Базовые алгоритмы. Продолжение](../README.md)


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
```

## Задача 21: Напишите программу, которая принимает на вход координаты двух точек и находит расстояние между ними в 3D пространстве.

```
A (3,6,8); B (2,1,-7), -> 15.84
A (7,-5, 0); B (1,-1,9) -> 11.53
```

### Решение:

Расстояние между двумя точками, если даны координаты точек находится по формуле:

$$
\large |\overrightarrow {AB}| =|AB| = \sqrt{(x_B - x_A)^2+(y_B - y_A)^2 +(z_B - z_A)^2};
$$

```c#
  string[] input = Console.ReadLine().Split(' ');
  
  int x1 = Convert.ToInt32(input[0]);
  int y1 = Convert.ToInt32(input[1]);
  int z1 = Convert.ToInt32(input[2]);

  int x2 = Convert.ToInt32(input[3]);
  int y2 = Convert.ToInt32(input[4]);
  int z2 = Convert.ToInt32(input[5]);

  double result = Math.Sqrt(Math.Pow(x1 - x2, 2) + Math.Pow(y1 - y2, 2) + Math.Pow(z1 - z2, 2));

  Console.WriteLine(Math.Round(result, 2));
```

### Задача 23: Напишите программу, которая принимает на вход число (N) и выдаёт таблицу кубов чисел от 1 до N.
```
3 -> 1, 8, 27
5 -> 1, 8, 27, 64, 125
```

### Решение:

```c#
  int n = Convert.ToInt32(Console.ReadLine());

  int i = 1;
  while (i <= n)
    Console.Write("{0} ", Math.Pow(i++, 3));
```