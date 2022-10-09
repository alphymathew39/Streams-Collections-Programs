import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveAllEmptyStrings {
    public static void main(String[] args) {
        List<String> stringList= Arrays.asList("","aa","bb","cc","cc");
        Set<String> result = stringList.stream().filter(x -> !x.isEmpty()).collect(Collectors.toSet());
        System.out.println(result);
}}
