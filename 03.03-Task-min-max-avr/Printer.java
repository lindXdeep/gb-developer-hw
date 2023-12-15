import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Answer {
  public static void analyzeNumbers(Integer[] arr) {
    // Введите свое решение ниже
    List<Integer> list = Arrays.asList(arr);

    Collections.sort(list);

    int min = list.get(0);
    int max = list.get(list.size() - 1);
    double avr = 0;

    for (Integer a : list)
      avr += a.intValue();

    avr = avr / list.size();

    System.out.println(list);
    System.out.printf("Minimum is %d%n", min);
    System.out.printf("Maximum is %d%n", max);
    System.out.println("Average is = " + avr);
  }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
  public static void main(String[] args) {
    Integer[] arr = {};

    if (args.length == 0) {
      // При отправке кода на Выполнение, вы можете варьировать эти параметры
      arr = new Integer[] { -2, -1, 0, 1, 2, 3, 4, 5 };
    } else {
      arr = Arrays.stream(args[0].split(", "))
          .map(Integer::parseInt)
          .toArray(Integer[]::new);
    }

    Answer ans = new Answer();
    ans.analyzeNumbers(arr);
  }
}