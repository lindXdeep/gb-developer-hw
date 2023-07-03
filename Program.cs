using System;

class Program
{
  public static void Main(string[] args)
  {
    int[] array = new int[] { 1, 2, 5, 7, 19, 6, 1, 33 };

    foreach (var item in array)
      Console.Write($"{item} ");
  }
}