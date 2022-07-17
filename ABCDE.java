public class ABCDE {
    public static void main(String[] args) {
        int n=5;
        System.out.println("The Pattern as follows : ");
        for (int i = 1; i <=n; i++) {   
            for (int j = 1; j <=n; j++) {
                System.out.print((char)('A'+(i-1))+" "); 
            }
            System.out.println();
        }
    }
}
