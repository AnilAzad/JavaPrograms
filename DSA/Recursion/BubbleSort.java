import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n=s.nextInt();
        int[] arr= new int[n];
        System.out.print("Enter the "+n+" elements to be Sorted : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        bubble(arr, arr.length-1, 0);
        System.out.println("Sorted Array is : "+Arrays.toString(arr));
        s.close();
    }
    static void bubble(int[] arr, int r, int c){
        if (r==0) {
            return;
        }
        if (c<r) {
            if (arr[c]>arr[c+1]) {
                // Swap
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            bubble(arr, r, c+1);
        }else{
        bubble(arr, r-1, 0);
        }
    }
}
