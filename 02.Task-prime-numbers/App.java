/**
 * App
 */
public class App {

  public static void main(String[] args) {

    int n = 1000;
    for (int i = 2; i <= n; i++) {

      int p = 1;
      for (int j = 2; j <= Math.pow(i, 0.5); j++) {
        if (i % j == 0) {
          p = 0;
          break;
        }
      }
      if (p == 1) {
        System.out.print(i + " ");
      }
    }
  }
}