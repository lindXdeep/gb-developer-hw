# C# - Урок 6. Одномерные массивы. Продолжение

## Задача 41: Пользователь вводит с клавиатуры M чисел. Посчитайте, сколько чисел больше 0 ввёл пользователь.

```
0, 7, 8, -2, -2 -> 2
1, -7, 567, 89, 223-> 3
```

### Решение:

```c#
  string[] input = Console.ReadLine().Split(' ');

  int count = 0;
  for (int i = 0; i < input.Length; i++)
    if (int.Parse(input[i]) > 0)
      count++;

  System.Console.WriteLine(count);
```

## Задача 43: Напишите программу, которая найдёт точку пересечения двух прямых, заданных уравнениями y = k1 * x + b1, y = k2 * x + b2; значения b1, k1, b2 и k2 задаются пользователем.

b1 = 2, k1 = 5, b2 = 4, k2 = 9 -> (-0,5; -0,5)

### Решение:

```c#
  string[] input = Console.ReadLine().Split(' ');

  double b1 = Convert.ToInt32(input[0]);
  double k1 = Convert.ToInt32(input[1]);
  double b2 = Convert.ToInt32(input[2]);
  double k2 = Convert.ToInt32(input[3]);

  double x = (b2 - b1) / (k1 - k2);
  double y = k1 * x + b1;

  Console.WriteLine($"{x}, {y}");
```
