public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }
    static boolean isPowerOfTwo(int n){
        return (((n&n-1)==0)&&(n>0));
    }
}
