using System;

public class Program
{
  public static void Main(string[] args)
  {
    int n = Convert.ToInt32(Console.ReadLine());

    int i = 1;
    while (i <= n)
      Console.Write("{0} ", Math.Pow(i++, 3));
  }
}