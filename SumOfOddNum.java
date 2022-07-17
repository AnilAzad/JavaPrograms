import java.util.Scanner;

public class SumOfOddNum {
    static void oddNum(int n){
        int odd=0;
        for (int i = 1; i <=n; i++) {
            if (i%2!=0) {
                odd = odd+i;
            }
        }
        System.out.println("Sum of odd Number :"+odd);
    }
    public static void main(String[] args) {
        try (Scanner ob = new Scanner(System.in)) {
            System.out.println("Enter the number");
            int x=ob.nextInt();
            SumOfOddNum.oddNum(x);
        }
    }
}
