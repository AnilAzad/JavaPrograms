import java.util.Scanner;

public class PrimeNum {
    static void primeNumber(int n){
        int i, m=0, temp=0;
        m=n/2;
       if (n==0||n==1) {
           System.out.println(n+" is not a prime number");
       } else{
           for (i = 2; i <= m; i++) {
               if (n%i==0) {
                   System.out.println(n+" is not a prime number");
                   temp=1;
                   break;
               }
           }
       }
       if(temp==0){
           System.out.println(n+" is prime number");
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number for checking the prime or not");
            int a=sc.nextInt();
            primeNumber(a);
            sc.close();
    }
}
