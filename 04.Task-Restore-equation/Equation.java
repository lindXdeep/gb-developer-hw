import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Equation
 */
public class Equation {

  public static String getSolution(String str) {

    String equation = readString(str);

    System.out.println("Given the equation: " + equation);

    String[] s = setZero(equation.split("[+=]"));

    int a = Integer.parseInt(s[0]);
    int b = Integer.parseInt(s[1]);
    int e = Integer.parseInt(s[2]);

    boolean swap = false;
    if (s[0].length() == 2 && s[1].length() == 2) {

      if (s[0].startsWith("0") && s[1].startsWith("0")) {

        a += 10;

        do {
          if (Integer.toString(e - a).endsWith(Integer.toString(b)))
            break;
        } while ((a += 10) <= e);

      } else {

        if (a < 9) {
          int t = a;
          a = b;
          b = t;
          swap = true;
        }

        do {
          if (Integer.toString(e - a).endsWith(Integer.toString(b)))
            break;
        } while (a++ <= a + 9);
      }
    } else if (s[0].length() == 1 || s[1].length() == 1) {

      if (s[1].length() == 2) {
        int t = a;
        a = b;
        b = t;
        swap = true;
      } else if (s[0].length() == 1 && s[1].length() == 1) {
        if (a == 0)
          a = e - b;
        else
          b = e - a;
      }

      if (s[0].endsWith("0")) {
        do {
          int w = e - a;
          if (w < 9 & w + a == e)
            break;
        } while (a++ < a + 9);
      } else {
        do {
          int w = e - a;
          if (w < 9 & w + a == e)
            break;
        } while ((a += 10) < e);
      }
    }

    return result(a, b, e, swap);
  }

  public static String result(int a, int b, int e, boolean swap) {

    int q = swap ? e - a : a;
    int w = swap ? a : e - a;

    return String.format("Result: %d + %d = %d", q, w, e);
  }

  public static String readString(String str) {

    File file = new File(str);

    try (BufferedReader br = new BufferedReader(new FileReader(file))) {

      str = br.readLine();

    } catch (IOException e) {
      e.printStackTrace();
    }
    return str;
  }

  public static String[] setZero(String[] s) {

    ArrayList<String> res = new ArrayList<>();
    for (String i : s)
      res.add(i.replace("?", "0").trim());

    return res.toArray(new String[res.size()]);
  }