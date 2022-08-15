import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=s.nextInt();
        System.out.println("Number is Palindrome : "+isPalindrome(n));
        s.close();
    }
    static int rev(int n){
        int digit=(int)(Math.log10(n))+1;
        return helper(n,digit);
    }
    private static int helper(int n, int digit) {
        if (n%10==n) {
            return n;
        }
        int rem=n%10;
        return rem*(int)(Math.pow(10, digit-1))+helper(n/10, digit-1);
    }
    static boolean isPalindrome(int n){
        return (n==rev(n));
    }
}
