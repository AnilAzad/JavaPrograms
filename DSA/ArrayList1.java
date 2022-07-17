import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {
    public static void main(String arg[]) {
        // Syntax
        ArrayList<Integer> list=new ArrayList<>(10);
        //  list.add(67);
        //  list.add(654);
        //  list.add(672);
        //  list.add(672);

        //  list.remove(0);
         
        // System.out.println(list);
        //  input
        Scanner s=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(s.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i)+" ");//pass index here, syntax will not work here
        }
        System.out.println();
        System.out.println(list);
        s.close();
    }
}