Console.Write("Enter name: ");
string username = Console.ReadLine();

if (username.ToLower() == "bob") 
{
  Console.WriteLine("Hello, Bob!!!");
}
else
{
  Console.Write("Hi, ");
  Console.WriteLine(username);
}

