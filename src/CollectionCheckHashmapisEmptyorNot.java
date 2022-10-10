import java.util.HashMap;

public class CollectionCheckHashmapisEmptyorNot {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap =new HashMap<>();
        hashMap.put(1,"aa");
        hashMap.put(2,"bb");
        System.out.println("Checking Is HashMap empty?: "+hashMap.isEmpty());
    }
}
