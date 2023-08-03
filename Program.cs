using System;

class Program
{
  public static void Main(String[] args)
  {
    int n = Convert.ToInt32(Console.ReadLine());

    Console.WriteLine(n > 5 & n < 8 ? "да" : "нет");
  }
}