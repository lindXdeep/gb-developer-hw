# Java

## Задача 1: Сортировка слиянием

Внутри класса `MergeSort` напишите метод `mergeSort`, который принимает массив целых чисел `a` и реализует алгоритм сортировки слиянием. Метод должен возвращать отсортированный массив.

**Пример**

```
a = {5, 1, 6, 2, 3, 4} -> [1, 2, 3, 4, 5, 6]
```

### Решение:

```java
import java.util.Arrays;

class MergeSort {
  public static int[] mergeSort(int[] a) {

    int left = 0;
    int right = a.length - 1;

    return sort(a, left, right);
  }

  private static int[] sort(int[] a, int left, int right) {

    if (left < right) {

      int split = (left + right) / 2;

      sort(a, left, split);
      sort(a, split + 1, right);
      merge(a, left, split, right);
    }

    return a;
  }

  private static void merge(int[] a, int left, int split, int right) {

    int[] buffer = new int[left + right + 1];

    int l = left;
    int r = split + 1;

    int i = 0;
    while (l <= split && r <= right)
      buffer[i++] = (a[l] < a[r]) ? a[l++] : a[r++];

    while (l <= split)
      buffer[i++] = a[l++];

    while (r <= right)
      buffer[i++] = a[r++];

    for (i = 0; i < right - left + 1; i++)
      a[left + i] = buffer[i];
  }
}
```

## Задача 2: Удаление четных элементов

Напишите функцию `removeEvenNumbers`, которая принимала бы произвольный список целых чисел, удаляла бы из него четные числа и выводила список без четных чисел.

Напишите свой код в методе `removeEvenNumbers` класса Answer. Метод `removeEvenNumbers` принимает на вход один параметр:

Integer[] arr - список целых чисел

**Пример**

```java
arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
removeEvenNumbers(arr);

// [1, 3, 5, 7, 9]

arr = new Integer[]{2, 4, 6, 8};
removeEvenNumbers(arr);

// []
```

### Решение:

```java
    ArrayList<Integer> list = new ArrayList<>();

    list = Arrays
        .stream(arr)
        .mapToInt(Integer::intValue)
        .filter((n) -> n % 2 != 0)
        .boxed()
        .collect(Collectors.toCollection(ArrayList::new));

    System.out.println(list);
```

## Задача 3: Анализатор списка

Напишите функцию `analyzeNumbers`, которая принимает на вход целочисленный список `arr` и:

- Сортирует его по возрастанию и выводит на экран
- Находит минимальное значение в списке и выводит на экран - `Minimum is {число}`
- Находит максимальное значение в списке и выводит на экран - `Maximum is {число}`
- Находит среднее арифметическое значений списка и выводит на экран - `Average is =  {число}`

Напишите свой код в методе `analyzeNumbers` класса Answer. Метод `analyzeNumbers` принимает на вход один параметр:

Integer[] arr - список целых чисел

**Пример**

```java
arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
analyzeNumbers(arr)

// [1, 2, 3, 4, 5, 6, 7, 8, 9]
// Minimum is 1
// Maximum is 9
// Average is = 5
```

### Решение:

```java

```

## 