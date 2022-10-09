import java.util.ArrayList;

public class CollectionCheckValueExistInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // add elements to ArrayList object
        list.add(3);
        list.add(17);
        list.add(6);
        list.add(9);
        list.add(7);
        // check if ArrayList contains element
        if (list.contains(7)) {
            System.out.println("7 was found in the list");
        } else {
            System.out.println("7 was not found in the list");
        }
    }
}
