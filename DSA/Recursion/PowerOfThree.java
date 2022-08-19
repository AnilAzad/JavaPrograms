public class PowerOfThree {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(16));
    }
    static boolean isPowerOfThree(int n){
        return n>0 &&(n==1 || (n%3==0&& isPowerOfThree(n/3)));
    }
}
