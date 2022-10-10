import java.util.ArrayList;
import java.util.Arrays;

public class CollectionArrayToArrayList1 {
    public static void main(String[] args) {
        String[] cities = {"mumbai","delhi"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(cities));
        arrayList.add("chenni");
        for (String newArraylist:arrayList){
            System.out.println(newArraylist);
        }
    }
}
