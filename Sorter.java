import java.util.Arrays;

public class Sorter{
    public static void main(String[] args) {
        int[] array = {8,6,2,7,5,1,7,9};
        System.out.println("Original array: "+Arrays.toString(array));
        System.out.println("Insertion sorted array: "+ Arrays.toString(sort(array)));
        System.out.println("Selection sorted array: "+ Arrays.toString(sort2(array)));

    }

    public static int[] insertionSort(int arr[]){
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
  
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
    
    public static int[] selectionSort(int[] arr){
        int n = arr.length;
  
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }
  
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static int[] sort(int[] arr){
        return insertionSort(arr);
    }

    public static int[] sort2(int[] arr){
        return selectionSort(arr);
    }
    
}