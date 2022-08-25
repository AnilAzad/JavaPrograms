public class LengthOfString {
    public static void main(String[] args) {
        System.out.println("Lenght of String : "+stringLenght("anil"));
    }
    static int stringLenght(String str){
        if (str.equals(""))
            return 0;
        else
            return stringLenght(str.substring(1)) + 1;
    }
}
