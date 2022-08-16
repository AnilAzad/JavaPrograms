import java.util.ArrayList;

public class FindAllIndex {
    public static void main(String[] args)  {
        int[] arr={1,2,3,5,5,7,8};
        ArrayList<Integer> ans =findAllindex(arr, 8, 0, new ArrayList<Integer>());
        System.out.println(ans);
    }
    static ArrayList<Integer> findAllindex(int[] arr, int t, int index, ArrayList<Integer> list){
        if (index==arr.length) {
            return list;
        }
        if (arr[index]==t) {
            list.add(index);
        }
        return findAllindex(arr, t, index+1, list);
    }
}