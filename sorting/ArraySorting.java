public class ArraySorting {

// Bucket sort
// Bubble sort
// Insertion sort
// Selection sort
// Heapsort
// Mergesort

// quicksort

  public static int[] bubbleSort(int[] arr) {
    int len = arr.length;
    boolean swapped = false;
    
    do {
      swapped = false;
      for (int i = 1; i < len; i++) {
        if (arr[i-1] > arr[i]) {
          swap(arr, i-1, i);
          swapped = true;
        }
      }
    } while (swapped == true);
    
    return arr;
  }

  public static int[] bucketSort(int[] arr, int n) {
    int[] buckets = new int[n];

    for (int i = 0; i < arr.length; i++) {

    }

    return buckets; //FIXME
  }
  
  public static int[] swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    return arr;
  }

  public static void main(String[] args) {
    //TODO use args to use diff sorts
    int[] arr = {1, 23, 9, 19, 30, 24, 15};
    printArray(arr);
    printArray(bubbleSort(arr));
  }
  
  private static void printArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + ", ");
    }
    System.out.println();
  }
}
