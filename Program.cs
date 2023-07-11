using System;

class Program
{
  public static void Main(string[] args)
  {
    double[] arr = GetRandom(5);

    double max = arr[0];
    double min = arr[1];
    for (int i = 0; i < arr.Length; i++)
    {
      Console.Write($"{arr[i]}, ");

      if (arr[i] < min)
        min = arr[i];
      else if (arr[i] > max)
        max = arr[i];
    }

    double res = max - min;

    Console.WriteLine(" -> {0:0.00}", res);
  }

  public static double[] GetRandom(int size)
  {
    double[] arr = new double[size];

    for (int i = 0; i < size; i++)
      arr[i] = Math.Round(new Random().NextDouble() * 20, 2);

    return arr;
  }
}