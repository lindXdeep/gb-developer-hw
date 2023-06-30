using System;

public class Program
{
  public static void Main(string[] args)
  {
    string[] input = Console.ReadLine().Split(' ');
    
    int x1 = Convert.ToInt32(input[0]);
    int y1 = Convert.ToInt32(input[1]);
    int z1 = Convert.ToInt32(input[2]);

    int x2 = Convert.ToInt32(input[3]);
    int y2 = Convert.ToInt32(input[4]);
    int z2 = Convert.ToInt32(input[5]);

    double result = Math.Sqrt(Math.Pow(x1 - x2, 2) + Math.Pow(y1 - y2, 2) + Math.Pow(z1 - z2, 2));

    Console.WriteLine(Math.Round(result, 2));
  }
}