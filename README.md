# C# - Знакомство с языками программирования

## Задача 10: Напишите программу, которая принимает на вход трёхзначное число и на выходе показывает вторую цифру этого числа.
```
456 -> 5
782 -> 8
918 -> 1
```
### Решение

```
commit 514d922675d38944381ddab6faa1748a9f723096
```

```c#
class Program
{
  public static void Main(String[] args)
  {
    int n = Convert.ToInt32(Console.ReadLine());

    Console.WriteLine(n / 10 % 10);
  }
}
```