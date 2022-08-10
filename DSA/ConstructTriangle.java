import java.util.Arrays;
import java.util.Scanner;

public class ConstructTriangle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n=s.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=s.nextInt();
        }
        conTriangle(a);
        s.close();
    }

    private static void conTriangle(int[] a) {
        if (a.length<1) {
            return;
        }
        int[] b=new int[a.length-1];
        for (int i = 0; i < a.length-1; i++) {
            int x=a[i]+a[i+1];
            b[i]=x;
        }
        conTriangle(b);
        System.out.println(Arrays.toString(a));
    }
}
