import java.util.HashMap;

public class CollectionInitializeHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<Integer, String>(7);
        hashMap.put(1, "Laptop");
        hashMap.put(2, "LCD");
        hashMap.put(3, "LED");
        hashMap.put(4, "Desktop");
        hashMap.put(5, "Laptop");
        hashMap.put(6, "Notebook");
        hashMap.put(7, "Mobile");
        System.out.println(hashMap+" ");

    }
}
