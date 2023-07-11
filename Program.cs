using System;

class Program
{
  public static void Main(string[] args)
  {
    string[] input = Console.ReadLine().Split(' ');

    double b1 = Convert.ToInt32(input[0]);
    double k1 = Convert.ToInt32(input[1]);
    double b2 = Convert.ToInt32(input[2]);
    double k2 = Convert.ToInt32(input[3]);

    double x = (b2 - b1) / (k1 - k2);
    double y = k1 * x + b1;

    Console.WriteLine($"{x}, {y}");
  }
}