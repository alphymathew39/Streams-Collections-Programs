import java.util.Arrays;
import java.util.List;

public class StringLengthMoreThan3 {
    public static void main(String[] args) {
        List<String> StringList = Arrays.asList("aaaa", "kk", "jjjj");
        Long counts = StringList.stream().filter(i -> i.length()>3).count();
        System.out.println(counts);
    }
}
