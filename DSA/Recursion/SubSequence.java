import java.util.ArrayList;

public class SubSequence {
    public static void main(String[] args) {
        seq("","abc"); 
        System.out.println(seqReturn("", "abc"));
    }
    static void seq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        seq(p+ch, up.substring(1));
        seq(p, up.substring(1));
    }
    static ArrayList<String> seqReturn(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left = seqReturn(p+ch, up.substring(1));
        ArrayList<String> Right = seqReturn(p, up.substring(1));
        left.addAll(Right);
        return left;
    }
}
