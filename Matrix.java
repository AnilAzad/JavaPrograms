import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m,i, j;
        System.out.println("Enter thr size of array");
        m = s.nextInt();
        // n = s.nextInt();
        int[][] a = new int[m][m];
        int[][] b = new int[m][m];
        System.out.println("Enter the elements of array 1");
        for (i = 0; i < m; i++) {
            for (j = 0; j < m; j++) {
                a[i][j] = s.nextInt();
            }
        }
        System.out.println("Elements of array 1" + "\n");
        for (i = 0; i < m; i++) {
            for (j = 0; j < m; j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.print("\n");
        }
        System.out.println("Enter the elements of array 2");
        for (i = 0; i < m; i++) {
            for (j = 0; j < m; j++) {
                b[i][j] = s.nextInt();
            }
        }
        System.out.print("Elements of array 2" + "\n");
        for (i = 0; i < m; i++) {
            for (j = 0; j < m; j++){
                System.out.print(b[i][j]+"\t");
            }
            System.out.print("\n");
        }    
    }
}
