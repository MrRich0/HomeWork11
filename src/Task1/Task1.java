package Task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task1 {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Artem", "Oliver", "Charley", "Oscar", "Thomas");
        System.out.println(checkOddName(names));

    }

    public static String checkOddName(List<String> name) {
        return IntStream.range(0,name.size())
                .filter(i -> i % 2 == 1)
                .mapToObj(i -> i + "." + name.get(i))
                .collect(Collectors.joining(", "));
    }
}
