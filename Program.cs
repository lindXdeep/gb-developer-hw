using System;

class Program
{
  public static void Main(String[] args)
  {
    int n = Convert.ToInt32(Console.ReadLine());

    while ((n /= 10) > 999) ;

    Console.WriteLine(n / 100 > 0 ? n % 10 : "третьей цифры нет");
  }
}