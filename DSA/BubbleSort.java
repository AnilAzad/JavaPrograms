import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = s.nextInt();
        int[] a = new int[n];
        System.out.print("Enter the " + n + "th Elements of Array : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        s.close();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(a));
    }
}
