using System;

public class Program
{
  public static void Main(string[] args)
  {
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
  }
}