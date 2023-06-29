using System;

public class Program
{
  public static void Main(string[] args)
  {
    int n = Convert.ToInt32(Console.ReadLine());

    int[] arr = new int[Convert.ToString(n).Length];

    int i = 0;
    while (n > 0)
    {
      arr[i++] = n % 10;
      n /= 10;
    }

    int b = 0;
    int e = arr.Length - 1;
    while (b != e)
    {
      if (arr[b++] != arr[e--])
      {
        Console.WriteLine("нет");
        return;
      }
    }

    Console.WriteLine("да");
  }
}