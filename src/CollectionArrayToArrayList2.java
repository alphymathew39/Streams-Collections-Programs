import java.util.ArrayList;
import java.util.Collections;

public class CollectionArrayToArrayList2 {
    public static void main(String[] args) {
        String[] cities= {"mumbai","delhi"};
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList,cities);
        arrayList.add("chenni");
        for (String s :arrayList){
            System.out.println(s);
        }
    }
}
