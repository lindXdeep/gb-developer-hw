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

## Задача 13: Напишите программу, которая выводит третью цифру заданного числа или сообщает, что третьей цифры нет.
```
645 -> 5
78 -> третьей цифры нет
32679 -> 6
```

### Решение

```
commit 37abb6c6680bfa989edf56c62563ecc6fff27b03
```

```c#
class Program
{
  public static void Main(String[] args)
  {
    int n = Convert.ToInt32(Console.ReadLine());

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
