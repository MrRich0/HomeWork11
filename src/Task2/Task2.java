package Task2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Artem", "Oliver", "Charley", "Oscar", "Thomas");
        System.out.println(getUppercaseSortedDescending(names));
    }


    public static List<String> getUppercaseSortedDescending(List<String> names){
       return names.stream()
               .map(name -> name.toUpperCase())
               .sorted((o1,o2) -> o2.compareTo(o1))
               .collect(Collectors.toList());
    }
}
