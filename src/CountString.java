import java.util.Arrays;
import java.util.List;

public class CountString {
    public static void main(String[] args) {
        List<String> stringList= Arrays.asList("","aa","bb","cc");
        long counts = stringList.stream().count();
        System.out.println("The count is:"+counts);


    }
}
