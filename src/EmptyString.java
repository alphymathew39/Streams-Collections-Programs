import java.util.Arrays;
import java.util.List;

public class EmptyString {
    public static void main(String[] args) {
        List<String> StringList= Arrays.asList("","aa","bb","cc","");
        Long counts = StringList.stream().filter(i -> i.isEmpty()).count();
        System.out.println(counts);
    }
}
