import java.util.Scanner;

public class CountZeros {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = s.nextInt();
        System.out.println("CountZeros : " + count(n));
        s.close();
    }

    static int count(int n) {
        return helper(n, 0);
    }

    private static int helper(int n, int c) {
        if (n == 0) {
            return c;
        }           
        int rem = n % 10;
        if (rem == 1) {
            return helper(n / 10, c + 1);
        }
        return helper(n / 10, c);
    }
}