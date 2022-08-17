import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the " + n + " elements to be Sorted : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        selection(arr, arr.length, 0, 0);
        System.out.println("Sorted Array is : " + Arrays.toString(arr));
        s.close();
    }

    static void selection(int[] arr, int r, int c, int max) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[max]) {
                selection(arr, r, c + 1, c);
            } else {
                selection(arr, r, c + 1, max);
            }
        } else {
            // Swap
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = temp;
            selection(arr, r - 1, 0, 0);
        }
    }
}
