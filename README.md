# C# - Урок 4. Функции.

## Задача 25: Напишите цикл, который принимает на вход два числа (A и B) и возводит число A в натуральную степень B.
```
3, 5 -> 243 (3⁵)
2, 4 -> 16
```

### Решение:

```c#
  string[] input = Console.ReadLine().Split(" ");

  int a = int.Parse(input[0]);
  int b = int.Parse(input[1]);

  int n = 1;
  while (b-- > 0)
    n *= a;

  Console.WriteLine($"{n}");
```