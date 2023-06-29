using System;

class Program
{
  public static void Main(String[] args)
  {
    int n = Convert.ToInt32(Console.ReadLine());

<<<<<<< HEAD
    int i = 0;
    while ((i += 2) < n)
    {
      Console.Write($"{i}, ");
    }
=======
    Console.WriteLine(n > 5 & n < 8 ? "да" : "нет");
>>>>>>> origin_old/hw-01.02
  }
}