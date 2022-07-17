import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={21, 4, 6, 64 ,32};
        reverse(arr);
        System.out.println("Reversed Array is : "+Arrays.toString(arr));
    }
    static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<end) {
            swap(arr, start, end);
            start++;
            end--;
        }

    }
    static void swap(int[] arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
