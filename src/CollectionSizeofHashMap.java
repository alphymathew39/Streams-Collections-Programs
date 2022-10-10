import java.util.HashMap;

public class CollectionSizeofHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap =new HashMap<>();
        hashMap.put(1,"aa");
        hashMap.put(2,"bb");
        System.out.println("Elements are; "+ hashMap);
        System.out.println("Size is: "+ hashMap.size());

        HashMap<Integer,String> hashMap1 = new HashMap<>();
        hashMap1.put(3,"a");
        hashMap1.put(4,"b");
        System.out.println("Elements are; "+ hashMap1);
        System.out.println("Size is: "+ hashMap1.size());

        hashMap1.putAll(hashMap);
        System.out.println("after combining"+ hashMap1);
        System.out.println("Size is: "+ hashMap1.size());




    }
}
