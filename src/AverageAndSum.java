import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageAndSum{
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3);

        double average = values.stream().mapToInt((x) ->x).average().getAsDouble();
        OptionalDouble result = values.stream().mapToInt((x) ->x).average();

        OptionalDouble sum = OptionalDouble.of(values.stream().mapToInt((x) ->x).sum());
        double sum1 = values.stream().mapToInt((x) ->x).sum();

        System.out.println(average);
        System.out.println(result);
        System.out.println(sum);
        System.out.println(sum1);
    }
}
