import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConvertToStreams{

    public static void main(String[] args){
        int[] primitiveArray = {1,2,3,4,5};
        Integer[] wrapperIntArr = {1,2,3,4,5};
        IntStream intstream = Arrays.stream(primitiveArray);
        intstream.forEach(System.out::println);
        Stream<Integer> wrapperStream = Stream.of(wrapperIntArr);
        wrapperStream.forEach(System.out::println);
    }
}