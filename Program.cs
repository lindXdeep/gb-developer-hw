using System;

class Program
{
  public static void Main(string[] args)
  {
    int[] arr = GetRandom(100, 999, 10);

    int count = 0;
    for (int i = 0; i < arr.Length; i++)
    {
      Console.Write($"{arr[i]}, ");
      if (arr[i] % 2 == 0)
        count++;
    }
    Console.WriteLine($" -> {count}");
  }

  public static int[] GetRandom(int min, int max, int size)
  {
    int[] arr = new int[size];

    for (int i = 0; i < size; i++)
      arr[i] = new Random().Next(min, max);

    return arr;
  }
}