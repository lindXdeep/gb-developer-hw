import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Calculator {

  public enum Operation {
    SUM {
      public int action(int a, int b) {
        return a + b;
      }
    },
    SUBTRACT {
      public int action(int a, int b) {
        return a - b;
      }
    },
    MULTIPLY {
      public int action(int a, int b) {
        return a * b;
      }
    },
    DIVIDE {
      public int action(int a, int b) {
        return a / b;
      }
    };

    public abstract int action(int a, int b);
  }

  public int calculate(char op, int a, int b) {

    String name = "log.txt";
    File file = new File(name);

    if (!file.exists()) {
      try {
        file.createNewFile();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    Operation o = op == '+' ? Operation.SUM
        : op == '-' ? Operation.SUBTRACT : op == '*' ? Operation.MULTIPLY : Operation.DIVIDE;

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    LocalDateTime ldt = LocalDateTime.now();

    try (FileWriter fw = new FileWriter(file)) {

      String time = ldt.format(dtf);
      String fwr = String.format("%s User entered the first operand = %s%n", time, a);
      fw.append(fwr);

      fwr = String.format("%s User entered the operation = %s%n", time, op);
      fw.append(fwr);

      fwr = String.format("%s User entered the second operand = %s%n", time, b);
      fw.append(fwr);

      fwr = String.format("%s Result is %s%n", time, o.action(a, b));
      fw.append(fwr);

    } catch (IOException e) {
      e.printStackTrace();
    }

    return o.action(a, b);
  }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {

  private static final String LOG_FILE_PATH = "log.txt";

  public static void main(String[] args) {
    int a = 0;
    char op = ' ';
    int b = 0;

    if (args.length == 0) {
      // При отправке кода на Выполнение, вы можете варьировать эти параметры
      a = 3;
      op = '+';
      b = 7;
    } else {
      a = Integer.parseInt(args[0]);
      op = args[1].charAt(0);
      b = Integer.parseInt(args[2]);
    }

    clearLogFile();
    Calculator calculator = new Calculator();
    int result = calculator.calculate(op, a, b);
    System.out.println(result);

    try (BufferedReader br = new BufferedReader(new FileReader(LOG_FILE_PATH))) {
      String line;
      while ((line = br.readLine()) != null) {
        System.out.println(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static void clearLogFile() {
    File logFile = new File(LOG_FILE_PATH);
    if (logFile.exists()) {
      try {
        FileWriter fileWriter = new FileWriter(logFile, false);
        fileWriter.write("");
        fileWriter.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}