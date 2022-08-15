public class NumberInRev {
    public static void main(String[] args) {
        num(5);
    }
    static void num(int n){
        if (n==0) {
            return; 
        }
        System.out.print(n+" ");
        num(n-1);
    }
}
