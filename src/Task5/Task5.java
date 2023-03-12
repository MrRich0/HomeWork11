package Task5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task5 {
    public static void main(String[] args) {
        Stream<Integer> first = Stream.of(1,2,3,4,5);
        Stream<Integer> second = Stream.of(11,22,33,44,55,66,77);
        zip(first,second)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        Iterator<T> itFirst = first.iterator();
        Iterator<T> itSecond = second.iterator();
        List<T> result = new ArrayList<>();

        while (itFirst.hasNext() && itSecond.hasNext()){
            result.add(itFirst.next());
            result.add(itSecond.next());
        }
        return result.stream();
    }
}
