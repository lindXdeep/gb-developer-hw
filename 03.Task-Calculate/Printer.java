import java.util.Scanner;

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
    // Введите свое решение ниже

    Operation o = op == '+' ? Operation.SUM:
                  op == '-' ? Operation.SUBTRACT:
                  op == '*' ? Operation.MULTIPLY:
                              Operation.DIVIDE;
                              
    return o.action(a, b);
  }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
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

    Calculator calculator = new Calculator();
    int result = calculator.calculate(op, a, b);
    System.out.println(result);
  }
}