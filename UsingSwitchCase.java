import java.util.Scanner;

public class UsingSwitchCase {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a for Area of circle");
            System.out.println("Enter b for Area of rectangle");
            System.out.println("Enter c for Perimeter of rectangle");
            System.out.println("Enter d for Area of Square");
            char f = sc.next().charAt(0);

            switch (f) {
                case 'a':
                    float p = (float) 3.14;
                    System.out.println("Enter the radius of Circle");
                    float r = sc.nextFloat();
                    Float area = p * r * r;
                    System.out.println("Area of Circle is -> " + area);
                    break;
                case 'b':
                    System.out.println("Enter the l and b of ractangle");
                    int l = sc.nextInt();
                    int b = sc.nextInt();
                    int a = l * b;
                    System.out.println("Area of Rectangle is -> " + a);
                    break;
                case 'c':
                    System.out.println("Enter the l and b of ractangle");
                    int length = sc.nextInt();
                    int width = sc.nextInt();
                    int perimeter = length * width;
                    System.out.println("perimeter of Rectangle is -> " + perimeter);
                    break;
                case 'd':
                    System.out.println("Enter the side of Square");
                    int s = sc.nextInt();
                    System.out.println("Area of Square is -> " + s * s);
                    break;
                default:
                    System.out.println("please enter correct choice");

            }
        }

    }
}
