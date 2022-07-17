import java.util.Scanner;

public class SumOfNegativeSubArrays {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        sc.close();
        int negativeSubArray=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int sum=0;
                for (int k = i; k <= j; k++) {
                    sum=sum+arr[k];
                }
                if (sum<0) {
                    negativeSubArray++;
                }
            }
        }
        System.out.println(negativeSubArray);
        
    }
}
     
