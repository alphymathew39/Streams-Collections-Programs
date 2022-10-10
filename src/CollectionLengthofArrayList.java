import java.util.ArrayList;

public class CollectionLengthofArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println("Size before removing: "+arrayList.size());
        arrayList.remove(1);
        System.out.println("size after removing: "+arrayList.size());
        for (Integer i : arrayList){
            System.out.println(i);
        }
    }
}
