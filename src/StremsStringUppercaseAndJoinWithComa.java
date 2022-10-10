import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StremsStringUppercaseAndJoinWithComa {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.","Canada");
        String result = stringList.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(","));
        System.out.println(result);
    }
}
