import java.util.Arrays;

/**
 * App
 */
public class App {

  public static void main(String[] args) {
    
    int arr[][] = new int[3][5];


    for (int[] elem : arr) {
      for (int e : elem) {
        System.out.printf("%d", e);
      }
      System.out.println();
    }



  }
}