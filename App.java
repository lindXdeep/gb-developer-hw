import java.util.Objects;

/**
 * App
 */
public class App {

  public static void main(String[] args) {

    short age = 10;
    int salary = 123456;

    System.out.println(age); // 10
    System.out.println(salary); // 123456

    float e = 2.7f;
    // double pi = 3.1415;

    System.out.println(e); // 2.7
    // System.out.println(pi); // 3.1415

    char ch = '1';
    System.out.println(Character.isDigit(ch)); // true

    ch = 'a';
    System.out.println(Character.isDigit(ch)); // false

    boolean flag1 = 123 <= 234;
    System.out.println(flag1); // true

    boolean flag2 = 123 >= 234 || flag1;
    System.out.println(flag2); // true

    boolean flag3 = flag1 ^ flag2;
    System.out.println(flag3); // false

    // Неявная типизация

    String msg = "Hello world";
    System.out.println(msg); // Hello world"

    var a = 123;
    System.out.println(a); // 123

    // var d = 123.456;
    // System.out.println(d); // 123.456

    // System.out.println(((Object) a).getClass().getSimpleName()); // Integer
    // System.out.println(((Object) d).getClass().getSimpleName()); // Double

    // d = 1022;
    // System.out.println(d); // 1022.0

    // d = "mistake";
    // error: incompatible types:
    // String cannot be converted to double

    // Классы-обертки

    System.out.println(Integer.MAX_VALUE); // 2147483647
    System.out.println(Integer.MIN_VALUE); // -2147483648

    // Массивы

    // Одномерные
    int[] arr = new int[10];
    System.out.println(arr.length); // 10

    arr = new int[] { 1, 2, 3, 4, 5 };
    System.out.println(arr.length); // 5

    // Многомерные
    int[] arr2[] = new int[3][5];

    for (int[] line : arr2) {
      for (int item : line) {
        System.out.printf("%d ", item);
      }
      System.out.println();
    }

    // Нерегулярные (Массив массивов)
    int[][] arr3 = new int[3][5];

    for (int i = 0; i < arr3.length; i++) {
      for (int j = 0; j < arr3[i].length; j++) {
        System.out.printf("%d ", arr3[i][j]);
      }
      System.out.println();
    }

    // Преобразования

    int i = 123;
    double d = i;

    System.out.println(i);// 123
    System.out.println(d);// 123.0

    d = 3.1415;
    i = (int) d;

    System.out.println(d); // 3.1415
    System.out.println(i); // 3

    d = 3.9415;
    i = (int) d;

    System.out.println(d); // 3.9415
    System.out.println(i); // 3

    byte b = Byte.parseByte("123");
    System.out.println(b); // 123

    // b = Byte.parseByte("1234");
    // System.out.println(b); // NumberFormatException: Value out of range

    // int[] a1 = new int[10];
    // double[] d1 = a1; // ИЗУЧАЕМ ковариантность и контравариантность

    // Виды спецификаторов

    float pi = 3.1415f;

    System.out.printf("%f\n", pi); // 2,141500
    System.out.printf("%.2f\n", pi); // 3,14
    System.out.printf("%.3f\n", pi); // 3,141
    System.out.printf("%e\n", pi); // 3,141500e+00
    System.out.printf("%.2e\n", pi); // 3,14e+00
    System.out.printf("%.3e\n", pi); // 3,141e+00

  }
}
