public class NumInMatrixForm {
    public static void main(String[] args) {
        int n=5;
        int num=1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
