using System;

class Program
{
  public static void Main(String[] args)
  {
    string line = Console.ReadLine();
    string[] strSplit = line.Split(' ');

    int a = Convert.ToInt32(strSplit[0]);
    int b = Convert.ToInt32(strSplit[1]);

    int max = a < b ? b : a;
    int min = a > b ? b : a;

    Console.WriteLine($"min = {min}, max = {max}");
  }
}