import java.util.Scanner;

public class SwapArray {
    public static void main(String[] args) {
        try (Scanner x = new Scanner(System.in)) {
            System.out.println("Enter the size of Array");
            int n = x.nextInt();
            int[] arr1 = new int[n];
            int[] arr2 = new int[n];
            System.out.println("Enter the Elements of Array 1");
            for (int i = 0; i < n; i++) {
                arr1[i] = x.nextInt();
            }
            System.out.println("Enter the Elements of Array 2");
            for (int i = 0; i < n; i++) {
                arr2[i] = x.nextInt();
            }
            for (int i = 0; i < n; i++) {
                int k = arr1[i];
                arr1[i] = arr2[i];
                arr2[i] = k;
            }
            System.out.print("After swap Array 1 is ::");
            for (int i = 0; i < arr1.length; i++) {
                System.out.print(arr1[i]+"\t");
            }
            System.out.println("\n");
            System.out.print("After swap Array 2 is ::");
            for (int i = 0; i < arr2.length; i++) {
                System.out.print(arr2[i]+"\t");
            }
            System.out.println("\n");
        }
        
    }

}
