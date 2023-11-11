## Задача 1: Восстановите выражение

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

