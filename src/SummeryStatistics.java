import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class SummeryStatistics {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3,4,5,6,7,8);
        IntSummaryStatistics result = values.stream().mapToInt((x)-> x).summaryStatistics();
        System.out.println(result);
    }
}
