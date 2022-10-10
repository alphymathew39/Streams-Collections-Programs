import java.util.Arrays;
import java.util.List;

public class StremsStartWithA {
    public static void main(String[] args) {
        List<String> StringList = Arrays.asList("aaaa", "kk", "jjjj");
        Long count = StringList.stream().filter(x -> x.startsWith("a")).count();
        System.out.println(count);
    }
}
