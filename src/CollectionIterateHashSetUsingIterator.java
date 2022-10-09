import java.util.HashSet;
import java.util.Iterator;

public class CollectionIterateHashSetUsingIterator {
    public static void main(String[] args) {
        HashSet<String> hashset = new HashSet<String>();
        // Add elements to HashSet
        hashset.add("Pear");
        hashset.add("Apple");
        hashset.add("Orange");
        hashset.add("Papaya");
        hashset.add("Banana");

        Iterator<String> it = hashset.iterator();
        System.out.println("hashset contains");
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }}

