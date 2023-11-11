## задание 1: N-ое треугольное число

Вычислить n-ое треугольного число(сумма чисел от 1 до n).

Внутри класса Answer напишите метод countNTriangle, который принимает число n и возвращает его n-ое треугольное число.

Пример

```
n = 4 -> 10

n = 5 -> 15
```

### Решение:

```java
class Answer {
  public int countNTriangle(int n) {
    // Введите свое решение ниже
    return (int) (((double) 1 / 2) * n * (n + 1));
  }
}
```

## задача 2: Вывести простые числа

Напишите функцию printPrimeNums, которая выведет на экран все простые числа в промежутке от 1 до 1000, каждое на новой строке.

Напишите свой код в методе printPrimeNums класса Answer.

Пример

```
2
3
5
7
11
...
```

### Решение:

```java
  int n = 1000;
  for (int i = 2; i <= n; i++) {

    int p = 1;
    for (int j = 2; j <= Math.pow(i, 0.5); j++) {
      if (i % j == 0) {
        p = 0;
        break;
      }
    }
    if (p == 1) {
      System.out.print(i + " ");
    }
  }
```

## Задание 3: Калькулятор

Напишите класс `Calculator`, который будет выполнять математические операции (+, -, *, /) над двумя числами и возвращать результат. В классе должен быть метод calculate, который принимает оператор и значения аргументов и возвращает результат вычислений.

При неверно переданном операторе, программа должна вывести сообщение об ошибке "Некорректный оператор: 'оператор'".

Аргументы, передаваемые в метод/функцию:

Решение:

```java

```



## Задача 4: Восстановите выражение

В файле задано уравнение вида q + w = e (q, w, e >= 0). Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.

Восстановите выражение до верного равенства.

Предложите хотя бы одно решение или сообщите, что его нет.

Напишите класс `Equation`, содержащий метод `getSolution`, который будет считывать уравнение из файла и восстановит его до верного равенства.

Выведите сначала строку формата "Given the equation: {выражение из файла}".

А затем верните строку формата "Result: {цельное выражение}".

Если выражение не имеет решений - верните строку "No solution".

```java
Given the equation: ? + 4 = 9
Result: 5 + 4 = 9
```



```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

class Equation {
    public static String getSolution(String str) {
      // Введите свое решение ниже
       
    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{ 
    public static void main(String[] args) { 
      String file = "";
      
      if (args.length == 0) {
        file = "input.txt";
      }
      else{
        file = args[0];
      }     
      
      Equation eq = new Equation();
      String result = eq.getSolution(file);      
      System.out.println(result);
    }
}
```

### Решние:

```java
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

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
```
