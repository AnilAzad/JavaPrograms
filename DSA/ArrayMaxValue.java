import java.util.Arrays;
import java.util.Scanner;

public class ArrayMaxValue {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println("Elements of Array is : "+Arrays.toString(arr));
        System.out.println("The maximum Value of Array is : "+max(arr));
        System.out.println("The minimum Value of Array is : "+min(arr));
        in.close();
    }
    static int max(int[] arr) {
        int maxVal=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>maxVal) {
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
    static int min(int[] arr) {
        int minVal=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<minVal) {
                minVal=arr[i];
            }
        }
        return minVal;
    }
}
