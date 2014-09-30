import java.util.Scanner;

public class ArraySorting {

// Bucket sort
// Selection sort
// Heapsort
// Mergesort

// quicksort

  /**
   * Bubble Sort
   * Time complexity: Best case = O(n). Average case = O(n^2). Worst case = O(n^2).
   * Space complexity: O(1).
   */
  public static int[] bubbleSort(int[] arr) {
    int len = arr.length;
    boolean swapped = false;

    do {
      swapped = false;
      for (int i = 1; i < len; i++) {
        System.out.println(arrayToString(arr, " ", i));
        if (arr[i-1] > arr[i]) {
          swap(arr, i-1, i);
          swapped = true;
        }
      }
      len--;
    } while (swapped == true);

    return arr;
  }

  public static int[] bucketSort(int[] arr, int n) {
    int[] buckets = new int[n];

    for (int i = 0; i < arr.length; i++) {

    }

    return buckets; //FIXME
  }

  /**
   * Insertion Sort
   * Time complexity: Best case = O(n). Average case = O(n^2). Worst case = O(n^2).
   * Space complexity: O(1).
   */
  private static int[] insertionSort(int[] arr) {
    int sorted = 1;
    while (sorted < arr.length) {
      for (int i = sorted; i > 0; i--) {
        System.out.println(arrayToString(arr, " ", i));
        if (arr[i] < arr[i-1]) {
          swap(arr, i, i-1);
        } else {
          break;
        }
      }
      sorted++;
    }
    return arr;
  }

  public static void main(String[] args) {
    int[] arr = { 10, 1, 23, 9, 19, 30, 24, -15 };
    System.out.println("Original array: " + arrayToString(arr));
    //TODO: User input for array?

    System.out.println("Please select a sort algorithm:");
    System.out.println(" 1. Bubble Sort");
    System.out.println(" 2. Insertion Sort");
    System.out.print(">>> ");

    Scanner reader = new Scanner(System.in);
    int x = reader.nextInt();
    reader.close();

    switch (x) {
      case 1:
        System.out.println("Performing bubble sort...");
        System.out.println("Sorted array: " + arrayToString(bubbleSort(arr)));
        break;
      case 2:
        System.out.println("Performing insertion sort...");
        System.out.println("Sorted array: " + arrayToString(insertionSort(arr)));
        break;
      default:
        System.out.println("Error. Invalid selection.");
    }
  }

  private static String arrayToString(int[] arr) {
    return arrayToString(arr, " ", -1);
  }

  private static String arrayToString(int[] arr, String delimiter, int highlightIndex) {
    String ret = "";
    for (int i = 0; i < arr.length; i++) {
      ret += (i == highlightIndex) ? ("[" + arr[i] + "]" + delimiter) : (arr[i] + delimiter);
    }
    return ret;
  }

  private static int[] swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    return arr;
  }
}
