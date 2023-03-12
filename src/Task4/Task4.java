package Task4;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4 {
    public static void main(String[] args) {
        MyRandom random = new MyRandom(25214903917L,11L, (long) Math.pow(2,48));
        Stream<Long> integerStream = Stream.iterate(1L,(seed) ->random.nextLong(seed));
        integerStream.limit(10)
                .peek(System.out::println)
                .collect(Collectors.toList());

    }
}
