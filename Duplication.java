import java.util.*;

public class Duplication {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the "+n+ " elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=s.nextInt();
        }
        System.out.println(duplication(arr));
        s.close();
    }
    static boolean duplication(int[] arr){
        HashSet<Integer> set=new HashSet<>();
        for(int i : arr)
            if(!set.add(i))
                return true;
        return false;
    }
}
