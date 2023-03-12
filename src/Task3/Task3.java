package Task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("7, 2, 0", "4, 5");
        System.out.println(sortedNumbers(input));
    }
    public static String sortedNumbers(List<String> numbers){
        return numbers.stream()
                .flatMap(number -> Stream.of(number.split(", ")))
                .sorted()
                .collect(Collectors.joining(", "));
    }
}
