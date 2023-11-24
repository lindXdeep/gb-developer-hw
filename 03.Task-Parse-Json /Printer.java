class Answer {
  public static void answer(String JSON, String ELEMENT1, String ELEMENT2, String ELEMENT3) {
    // Напишите свое решение ниже

    StringBuilder sb = new StringBuilder();

    int l = JSON.indexOf("[") + 1;
    int r = JSON.indexOf("]") + 1;
    JSON = JSON.substring(l, r);

    for (int b = 0, e = 0; b != -1; b = JSON.indexOf("{", e)) {
      e = JSON.indexOf("}", b);
      sb.append(JSON.substring(b + 2, e - 1) + "\n");
    }

    String rep = sb
        .toString()
        .replaceAll("\":\"", "")
        .replaceAll("\",\"", "")
        .replaceAll("фамилия", ELEMENT1)
        .replaceAll("оценка", ELEMENT2)
        .replaceAll("предмет", ELEMENT3);

    System.out.println(rep);
  }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
  public static void main(String[] args) {
    String JSON = "";
    String ELEMENT1 = "";
    String ELEMENT2 = "";
    String ELEMENT3 = "";

    if (args.length == 0) {
      // При отправке кода на Выполнение, вы можете варьировать эти параметры
      JSON = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
          "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
          "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
      ELEMENT1 = "Студент ";
      ELEMENT2 = " получил ";
      ELEMENT3 = " по предмету ";
    } else {
      JSON = args[0];
      ELEMENT1 = args[1];
      ELEMENT2 = args[2];
      ELEMENT3 = args[3];
    }

    Answer ans = new Answer();
    ans.answer(JSON, ELEMENT1, ELEMENT2, ELEMENT3);
  }
}