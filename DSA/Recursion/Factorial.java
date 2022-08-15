import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enten the Number : ");
        int n=s.nextInt();
        System.out.println("Factorial of "+n+" is "+fact(n));
        s.close();
    }
    public static int fact(int n){
        if (n<=1) {
            return 1;
        }
        return n*fact(n-1);
    }
}