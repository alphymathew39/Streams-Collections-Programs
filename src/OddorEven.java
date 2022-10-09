import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class OddorEven {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,2,2,3,4,5,6,7,8,9,9,9);
        Set<Integer> odd = numbers.stream().filter(n -> n % 2 !=0).collect(Collectors.toSet());
        System.out.println("Odd numbers are:"+odd);
        Set<Integer> even = numbers.stream().filter(n -> n % 2 ==0).collect(Collectors.toSet());
        System.out.println("Even numbers are:"+even);

    }
}
