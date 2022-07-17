import java.util.Scanner;

public class ThreeNumAvg {
    static double avg(int a,int b,int c){
        double d=(double)(a+b+c)/3;
        return d;
    }
    public static void main(String[] args) {
        try (Scanner ob = new Scanner(System.in)) {
            System.out.println("Enter three number");
            int x=ob.nextInt();
            int y=ob.nextInt();
            int z=ob.nextInt();
            double r=avg(x, y, z);
            System.out.println("Avg of three Number is : "+r);
        }
    }
}
