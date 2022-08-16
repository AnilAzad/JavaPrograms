import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n=s.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i)+" ");
        }
        s.close();
    }
    static int fib(int n){
        //base case
        if (n<=1) {
            return n;
        }
        // recusive call
        return fib(n-1)+fib(n-2);
    }
}
