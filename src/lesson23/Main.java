package lesson23;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//Написать пару примеров Stream API:
//1 Для терминальных операций используя библиотеку Collectors(joining, groupingBy, partitioningBy... )
//2 Для промежуточных операций используем(takeWhile, dropWhile, peek... )

public class Main {
    public static void main(String[] args) {
        List<String> items = List.of("grapefruit","apple", "banana","pear", "apricot", "cherry", "strawberry","watermelon");
        //-----counting----------
        long count = items.stream()
                .collect(Collectors.counting());
        System.out.println("Count: " + count);
        // -------------Joining-----------
        String join = items.stream().collect(Collectors.joining("-"));
        System.out.println(join);
        //-----------------partition----------
        Map<Boolean, List<String>> partitioned = items.stream()
                .collect(Collectors.partitioningBy(s -> s.length() > 6));
        System.out.println("Partitioned: " + partitioned);
        // -----------Grouping By------------
        Map<Character, List<String>> grouped = items.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));
        System.out.println("Grouped: " + grouped);

        // -------------------dropWhile()---------------
        List<String> list1 = items.stream()
                .dropWhile(s -> s.length() >4)
                .toList();
        System.out.println("After dropWhile: " + list1);

        // -------------------takeWhile()----------------
        List<String> list2 = items.stream()
                .takeWhile(s -> s.length() >4)
                .toList();
        System.out.println("After takeWhile: " + list2);
//-------------peek()-----------------
        List<String> stream3 = items.stream()
                .filter(s-> s.compareTo("apple") > 0)
                .peek(e->System.out.println("Before uppercase: "+e))
                .map(String::toUpperCase)
                .peek(System.out::println)
                .toList();
        System.out.println("After upperCase= "+stream3);
    }
}

