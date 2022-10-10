import java.util.ArrayList;

public class CollectionArrayToArrayListManually {
    public static void main(String[] args) {
        String[] cities = {"mumbai", "delhi"};
        ArrayList<String> arrayList = new ArrayList<>(10);
        for (int i=0;i< cities.length;i++){
            arrayList.add(cities[i]);
        }
        for (String s : arrayList){
            System.out.println(s);
        }
    }
}