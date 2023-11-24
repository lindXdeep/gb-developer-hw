
class Answer {
  public static StringBuilder answer(String QUERY, String PARAMS) {
    // Напишите свое решение ниже

    StringBuilder sb = new StringBuilder();

    int f = PARAMS.indexOf("{") + 1;
    int e = PARAMS.lastIndexOf("}");

    PARAMS = PARAMS.substring(f, e);

    for (int i = 0, j = 0; i < e; i = j + 1) {

      j = PARAMS.indexOf(",", i);

      if (j == -1)
        j = e - 1;

      String s = PARAMS.substring(i, j).trim();

      s = s.replace("\":\"", "=\'")
          .substring(1, s.length() - 2)
          .concat("\'");

      if (!s.contains("null")) {
        sb.append(s);
        sb.append(" and ");
      }
    }

    sb
        .insert(0, QUERY)
        .setLength(sb.length() - 5);

    return sb;
  }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
  public static void main(String[] args) {
    String QUERY = "";
    String PARAMS = "";

    if (args.length == 0) {
      // При отправке кода на Выполнение, вы можете варьировать эти параметры
      QUERY = "select * from students where ";
      PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
    } else {
      QUERY = args[0];
      PARAMS = args[1];
    }

    Answer ans = new Answer();
    System.out.println(ans.answer(QUERY, PARAMS));
  }
}