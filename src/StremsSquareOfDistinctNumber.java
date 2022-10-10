import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StremsSquareOfDistinctNumber {
    public static void main(String[] args) {
        List<Integer> IntegerList = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 2, 3);
        List<Integer> result = IntegerList.stream().map(x -> x * x).distinct().collect(Collectors.toList());
        System.out.println(result);
    }
}

