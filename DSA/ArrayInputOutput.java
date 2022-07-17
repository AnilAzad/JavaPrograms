import java.util.Arrays;
import java.util.Scanner;

public class ArrayInputOutput {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] a = new int[3];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println("using for loop");
            for (int i = 0; i < a.length; i++) {

                System.out.print(a[i] + " ");
            }
            System.out.println();
            System.out.println("using Foreach loop");
            for (int num : a) {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.println("using ArraysMethod");
            System.out.println(Arrays.toString(a));
        }
    }
}
