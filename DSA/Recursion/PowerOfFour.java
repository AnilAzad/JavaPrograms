public class PowerOfFour {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(64));
    }
    static boolean isPowerOfFour(int n){
        return n>0&&(n==1 || (n%4==0 && isPowerOfFour(n/4)));
    }
}
