import java.util.Scanner;
import java.util.stream.IntStream;

public class StreamsOddorEven {
    public static void main(String[] args) {
        oddNumberWithinRange(10, 25);
        evenNumberWithinRange(10, 25);
    }
    public static  void oddNumberWithinRange(int start, int end){
        System.out.println("the odd numbers is:");
        IntStream.range(start,end +1).filter(i -> i% 2 !=0).forEach(System.out::println);
    }
    public  static void evenNumberWithinRange(int start, int end){
        System.out.println("even numbers are");
        System.out.println(" 1st way");
        IntStream.range(start,end +1).filter(i -> i% 2 ==0).forEach(System.out::println);
    }
}
