import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

class BubbleSort {
  private static File log;
  private static FileWriter fileWriter;

  public static void sort(int[] mas) {

    String name = "log.txt";
    File file = new File(name);

    if (!file.exists()) {
      try {
        file.createNewFile();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    Date d = new Date();
    String f = "%1$tF %1$tR";

    try (FileWriter fw = new FileWriter(file)) {

      for (int i = 0; i < mas.length; i++) {
        for (int j = 0; j < mas.length - 1; j++) {

          if (mas[j + 1] < mas[j]) {
            int t = mas[j + 1];
            mas[j + 1] = mas[j];
            mas[j] = t;
          }
        }

        String date = String.format(f, d.getTime());
        String fwr = String.format("%s %s%n", date, Arrays.toString(mas));
        fw.append(fwr);
      }

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
  public static void main(String[] args) {
    int[] arr = {};

    if (args.length == 0) {
      // При отправке кода на Выполнение, вы можете варьировать эти параметры
      arr = new int[] { 9, 4, 8, 3, 1 };
    } else {
      arr = Arrays.stream(args[0].split(", "))
          .mapToInt(Integer::parseInt)
          .toArray();
    }

    BubbleSort ans = new BubbleSort();
    ans.sort(arr);

    try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
      String line;
      while ((line = br.readLine()) != null) {
        System.out.println(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}