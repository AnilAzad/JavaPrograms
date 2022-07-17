import java.util.Scanner;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("enter the size of array");
            int n = sc.nextInt();
            int[] a = new int[n];
            System.out.println("enter the elements of array");
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            System.out.println(Arrays.toString(a));
            sc.close();
    }

}