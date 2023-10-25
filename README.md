# Java: Урок 1. Знакомство с Java


* [Java: Урок 1. Знакомство с Java](#java-урок-1-знакомство-с-java)
* [Типы данных](#типы-данных)
   * [char](#char)
   * [boolean](#boolean)
   * [String](#string)
* [Неявная типизация](#неявная-типизация)
* [Классы-обертки](#классы-обертки)
* [Операции Java](#операции-java)
* [Массивы](#массивы)
   * [Одномерные](#одномерные)
   * [Многомерные](#многомерные)
   * [Нерегулярные (Массив массивов)](#нерегулярные-массив-массивов)
* [Преобразования](#преобразования)
* [Получение данных из терминала](#получение-данных-из-терминала)
   * [Строки](#строки)
   * [Некоторые примитивы](#некоторые-примитивы)
   * [Проверка на соответствие получаемого типа](#проверка-на-соответствие-получаемого-типа)
* [Форматированный вывод](#форматированный-вывод)
   * [Виды спецификаторов](#виды-спецификаторов)
* [Область видимости переменных](#область-видимости-переменных)
* [Функции и методы](#функции-и-методы)
* [Управляющие конструкции](#управляющие-конструкции)
   * [Условный оператор](#условный-оператор)
   * [Тернарный оператор](#тернарный-оператор)
   * [Оператор выбора](#оператор-выбора)
* [Циклы](#циклы)
   * [Цикл while](#цикл-while)
   * [Цикл do while](#цикл-do-while)
   * [Оператор цикла for](#оператор-цикла-for)
   * [Вложенные циклы](#вложенные-циклы)
   * [for-each](#for-each)
* [Работа с файлами](#работа-с-файлами)
   * [Создание и запись\ дозапись](#создание-и-запись-дозапись)
   * [Чтение, Вариант посимвольно](#чтение-вариант-посимвольно)
   * [Вариант построчно](#вариант-построчно)

# Типы данных

## `short`, `int`

```java
  short age = 10;
  int salary = 123456;

  System.out.println(age);    // 10
  System.out.println(salary); // 123456
```

## `float`, `double`

```java
  float e = 2.7f;
  double pi = 3.1415;

  System.out.println(e); // 2.7
  System.out.println(pi); // 3.1415
```

## `char`

```java
  char ch = '1';
  System.out.println(Character.isDigit(ch)); // true

  ch = 'a';
  System.out.println(Character.isDigit(ch)); // false
```

## `boolean`

```java
  boolean flag1 = 123 <= 234;
  System.out.println(flag1); // true

  boolean flag2 = 123 >= 234 || flag1;
  System.out.println(flag2); // true

  boolean flag3 = flag1 ^ flag2;
  System.out.println(flag3); // false
```

## `String`

```java
  String msg = "Hello world";
  System.out.println(msg); // Hello world"
```

# Неявная типизация

```java
  var a = 123;
  System.out.println(a); // 123

  var d = 123.456;
  System.out.println(d); // 123.456

  System.out.println(((Object) a).getClass().getSimpleName()); // Integer
  System.out.println(((Object) d).getClass().getSimpleName()); // Double

  d = 1022;
  System.out.println(d); // 1022.0

  // d = "mistake";
  // error: incompatible types:
  // String cannot be converted to double
```

# Классы-обертки

```java
  System.out.println(Integer.MAX_VALUE); // 2147483647
  System.out.println(Integer.MIN_VALUE); // -2147483648
```

# Операции Java

- Присваивание: `=`
- Арифметические: `*`,` /`, `+`, `-`, `%`, `++`, `--`
- Операции сравнения: `<`, `>`, `==`, `!=`, `>=`, `<=`
- Логические операции: `||`, `&&`, `^`, `!`
- Побитовые операции `<<`, `>>`, `&`, `|`, `^`

# Массивы

## Одномерные

```java
  int[] arr = new int[10];
  System.out.println(arr.length); // 10

  arr = new int[] { 1, 2, 3, 4, 5 };
  System.out.println(arr.length); // 5
```

## Многомерные

```java
  int[] arr2[] = new int[3][5];

  for (int[] line : arr2) {
    for (int item : line) {
      System.out.printf("%d ", item);
    }
    System.out.println();
  }
```

## Нерегулярные (Массив массивов)

```java
  int[][] arr3 = new int[3][5];

  for (int i = 0; i < arr3.length; i++) {
    for (int j = 0; j < arr3[i].length; j++) {
      System.out.printf("%d ", arr3[i][j]);
    }
    System.out.println();
  }
```

# Преобразования

```java
  int i = 123;
  double d = i;

  System.out.println(i);// 123
  System.out.println(d);// 123.0

  d = 3.1415;
  i = (int) d;

  System.out.println(d); // 3.1415
  System.out.println(i); // 3

  d = 3.9415;
  i = (int) d;

  System.out.println(d); // 3.9415
  System.out.println(i); // 3

  byte b = Byte.parseByte("123");
  System.out.println(b); // 123
```

error: NumberFormatException: Value out of range:

```java
  b = Byte.parseByte("1234");
  System.out.println(b); // NumberFormatException: Value out of range
```

error: incompatible types: `int[]` cannot be converted to `double[]`

```java
  int[] a1 = new int[10];
  double[] d1 = a1; // ИЗУЧАЕМ ковариантность и контравариантность
```

# Получение данных из терминала

## Строки

```java
Scanner iScanner = new Scanner(System.in);

System.out.printf("name: ");
String name = iScanner.nextLine();

System.out.printf("Привет, %s!", name);
iScanner.close();
```

## Некоторые примитивы

```java
Scanner iScanner = new Scanner(System.in);

System.out.printf("int a: ");
int x = iScanner.nextInt();

System.out.printf("double a: ");
double y = iScanner.nextDouble();

System.out.printf("%d + %f = %f", x, y, x + y);

iScanner.close();
```

## Проверка на соответствие получаемого типа

```java
Scanner iScanner = new Scanner(System.in);

System.out.printf("int a: ");
boolean flag = iScanner.hasNextInt();

System.out.println(flag);

int i = iScanner.nextInt();
System.out.println(i);

iScanner.close();
```

# Форматированный вывод

```java
int a = 1, b = 2;
int c = a + b;

String res = a + " + " + b + " = " + c;

System.out.println(res);
```

```java
int a = 1, b = 2;
int c = a + b;

String res = String.format("%d + %d = %d \n", a, b, c);
System.out.println(res);

System.out.printf("%d + %d = %d \n", a, b, c);
```

## Виды спецификаторов

- `%d`: целочисленных значений
- `%x`: для вывода шестнадцатеричных чисел
- `%f`: для вывода чисел с плавающей точкой
- `%e`: для вывода чисел в экспоненциальной форме, например, `3.1415e+01`
- `%c`: для вывода одиночного символа
- `%s`: для вывода строковых значений

```java
  float pi = 3.1415f;

  System.out.printf("%f\n", pi);   // 2,141500
  System.out.printf("%.2f\n", pi); // 3,14
  System.out.printf("%.3f\n", pi); // 3,141
  System.out.printf("%e\n", pi);   // 3,141500e+00
  System.out.printf("%.2e\n", pi); // 3,14e+00
  System.out.printf("%.3e\n", pi); // 3,141e+00
```

# Область видимости переменных

```java
public class Program {
  public static void main(String[] args) {
    
    {
      int i = 123;
      System.out.println(i);
    }

    System.out.println(i); // error: cannot find symbol
  }
}
```

# Функции и методы

```java
static void sayHi() {
  System.out.println("hi!");
}
static int sum(int a, int b) {
  return a+b;
}
static double factor(int n) {
  if(n==1)return 1;
  return n * factor(n-1);
}
public static void main(String[] args) {
  sayHi(); // hi!
  System.out.println(sum(1, 3)); // 4
  System.out.println(factor(5)); // 120.0
}
```

# Управляющие конструкции

## Условный оператор

```java
int a = 1;
int b = 2;
int c;

if (a > b) {
  c = a;
} else {
  c = b;
}

System.out.println(c);
```

```java
int a = 1;
int b = 2;
int c = 0;

if (a > b) c = a;
if (b > a) c = b;

System.out.println(c);
```

## Тернарный оператор

```java
int a = 1;
int b = 2;
int min = a < b ? a : b;

System.out.println(min);
```

## Оператор выбора

```java
int mounth = value;
String text = "";

switch (mounth) {
  case 1:
    text = "Autumn";
    break;
    ...
      default:
    text = "mistake";
    break;
}

System.out.println(text);

iScanner.close();
```

# Циклы

## Цикл while

```java
int value = 321;
int count = 0;

while (value != 0) {
  value /= 10;
  count++;
}

System.out.println(count);
```

## Цикл do while

```java
int value = 321;
int count = 0;

do {
  value /= 10;
  count++;
} while (value != 0);

System.out.println(count);
```

## `continue`, `break`

Операторы для управления циклами — continue и break.
Выполнение следующей итерации цикла — continue.
Прерывание текущей итерации цикла — break.
* ближайшего к оператору

## Оператор цикла `for`

```java
int s = 0;

for (int i = 1; i <= 10; i++) {
  s += i;
}

System.out.println(s);
```

## Вложенные циклы

```java
for (int i = 0; i < 5; i++) {
  for (int j = 0; j < 5; j++) {
    System.out.print("* ");
  }
  System.out.println();
}

// * * * * *
// * * * * *
// * * * * *
// * * * * *
// * * * * *
```

## for-each

```java
int arr[] = new int[10];

for (int item : arr) {
  System.out.printf("%d ", item);
}

System.out.println();
```

# Работа с файлами

## Создание и запись\ дозапись

```java
try (FileWriter fw = new FileWriter("file.txt", false)) {
  
  fw.write("line 1");
  fw.append('\n');
  fw.append('2');
  fw.append('\n');
  fw.write("line 3");
  fw.flush();
  
} catch (IOException ex) {
  System.out.println(ex.getMessage());
}
```

## Чтение, Вариант посимвольно

```java
FileReader fr = new FileReader("file.txt");
int c;
while ((c = fr.read()) != -1) {
  char ch = (char) c;
  if (ch == '\n') {
    System.out.print(ch);
  } else {
    System.out.print(ch);
  }
}
```

## Вариант построчно

```java
BufferedReader br = new BufferedReader(new FileReader("file.txt"));

String str;

while ((str = br.readLine()) != null) {
  System.out.printf("== %s ==\n", str);
}

br.close();
```

