/**
 * App
 */
public class App {

  public static void main(String[] args) {

    String file = "input.txt";

    Equation eq = new Equation();
    String result = eq.getSolution(file);
    System.out.println(result);
  }
}