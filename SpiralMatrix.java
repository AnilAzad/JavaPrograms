import java.util.Scanner;

class spiralMatrix {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the size of array");
            int m = sc.nextInt();
            int n = sc.nextInt();
            int[][] a = new int[m][n];
            System.out.println("Enter the Elements of An Array");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("Spiral order of matrix");
            int rs = 0;
            int re = m - 1;
            int cs = 0;
            int ce = n - 1;
            while (rs <= re && cs <= ce) {
                for (int i = cs; i <= ce; i++) {
                    System.out.print(a[rs][i] + " ");
                }
                rs++;
                for (int j = rs; j <= re; j++) {
                    System.out.print(a[j][ce] + " ");
                }
                ce--;
                for (int i = ce; i >= cs; i--) {
                    System.out.print(a[re][i] + " ");
                }
                re--;
                for (int j = re; j >= rs; j--) {
                    System.out.print(a[j][cs] + " ");
                }
                cs++;
                System.out.print("");
            }
        }
        
    }
}
