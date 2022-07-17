import java.util.Arrays;

public class SwapArrayValue {
    public static void main(String[] args) {
        int arr[]={21, 4, 6, 64 ,32};
        swap(arr, 0, 4);
        System.out.println("Swap Array Elements : "+Arrays.toString(arr));
    }
    
    static void swap(int[] arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
