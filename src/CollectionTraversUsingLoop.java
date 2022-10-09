import java.util.ArrayList;

public class CollectionTraversUsingLoop {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        // add elements to ArrayList object
        num.add(3);
        num.add(17);
        num.add(6);
        num.add(9);
        num.add(7);
        System.out.println("Using Advanced For Loop");
        // printing ArrayList
        for (Integer no:num){
            System.out.println(no);

        }
}}
