public class ProductOfTwoNumber {
    public static void main(String[] args) {
        System.out.println(product(5, 10));
    }
    static int product(int x, int y){
        if (y>x) {
            return product(y, x);
        } 
        else if(x>0&& y>0){
            return x+product(x, y-1);
        }
        else{
            return 0;
        }
    }
}
