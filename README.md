# Урок 2. Почему вы не можете не использовать API

## Задача 1: Сформируйте SQL-запрос

Дана строка sql-запроса:

```
select * from students where "
```

Сформируйте часть `WHERE` этого запроса, используя `StringBuilder`. Пример данных для фильтрации приведены ниже в виде json-строки. Если значение `null`, то параметр не должен попадать в запрос.

Пример:

```
{
	"name": "Ivanov", 
	"country": "Russia", 
	"city": "Moscow", 
	"age": "null"
}
```

Напишите свой код в методе `answer` класса `Answer`. Метод `answer` принимает на вход два параметра:

- `String QUERY` - начало SQL-запроса
- `String PARAMS` - JSON с параметрами

### Решение

```java
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
```

## Задача 2: Сортировка пузырьком с логированием

Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

Напишите свой код в методе sort класса BubbleSort. Метод sort принимает на вход один параметр:

int[] arr - числовой массив

После каждой итерации, ваш код должен делать запись в лог-файл 'log.txt' в формате год-месяц-день час:минуты {массив на данной итерации}.

Пример

```
arr = new int[]{9, 4, 8, 3, 1};
sort(arr)

// При чтении лог-файла получим:
2023-05-19 07:53 [4, 8, 3, 1, 9]
2023-05-19 07:53 [4, 3, 1, 8, 9]
2023-05-19 07:53 [3, 1, 4, 8, 9]
2023-05-19 07:53 [1, 3, 4, 8, 9]
2023-05-19 07:53 [1, 3, 4, 8, 9]

```

### Решение

```java
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
```
## Задача 3: Распарсить JSON

Внутри класса Answer напишите метод answer, который распарсит json и, используя StringBuilder, создаст строки вида:

```
Студент [фамилия] получил [оценка] по предмету [предмет].
```

На вход метода answer подаются аргументы:

- `String JSON`
- `String ELEMENT1`
- `String ELEMENT2`
- `String ELEMENT3`
- 
Пример:

```
JSON = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
    "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
    "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
ELEMENT1 = "Студент ";
ELEMENT2 = " получил ";
ELEMENT3 = " по предмету ";

// Студент Иванов получил 5 по предмету Математика
// Студент Петрова получил 4 по предмету Информатика
// Студент Краснов получил 5 по предмету Физика

```

### Решение

```java
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
```

## Задача 4: Калькулятор с логированием

Возьмите код от калькулятора с прошлого урока.

К этому калькулятору нужно добавить логирование.

Логи запишите в файл log.txtв формате:

```
"гггг-мм-дд чч:мм User entered the first operand = {первое число}"
"гггг-мм-дд чч:мм User entered the operation = {оператор}"
"гггг-мм-дд чч:мм User entered the second operand = {второе число}"
"гггг-мм-дд чч:мм Result is {результат}"
```

### Решение

```java
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

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
  // . . .
}
```