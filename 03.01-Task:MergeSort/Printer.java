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

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
  public static void main(String[] args) {
    int[] a;

    if (args.length == 0) {
      // При отправке кода на Выполнение, вы можете варьировать эти параметры
      a = new int[] { 5, 1, 6, 2, 3, 4 };
    } else {
      a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
    }

    MergeSort answer = new MergeSort();
    String itresume_res = Arrays.toString(answer.mergeSort(a));
    System.out.println(itresume_res);
  }
}