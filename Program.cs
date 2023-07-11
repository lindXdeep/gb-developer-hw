using System;

class Program
{
  public static void Main(string[] args)
  {
    int[] arr = GetRandom(0, 100, 5);

    int sum = 0;
    for (int i = 0; i < arr.Length; i++)
    {
      Console.Write($"{arr[i]}, ");
      if (i % 2 != 0)
        sum += arr[i];
    }
    Console.WriteLine($" -> {sum}");
  }

  public static int[] GetRandom(int min, int max, int size)
  {
    int[] arr = new int[size];

    for (int i = 0; i < size; i++)
      arr[i] = new Random().Next(min, max);

    return arr;
  }
}