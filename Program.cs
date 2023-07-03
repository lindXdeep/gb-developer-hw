using System;

class Program
{
  public static void Main(string[] args)
  {
    int n = Convert.ToInt32(Console.ReadLine());

    int sum = 0;

    for (; n > 0; n /= 10)
      sum += n % 10;

    Console.WriteLine($"{sum}");
  }
}