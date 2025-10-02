import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollect {
    public static Map<Character, List<String>> mapByFirstLetter(Stream<String> s) {
        Map<Character, List<String>> result = new HashMap<>();
        for (String str : (Iterable<String>) s::iterator) {
            char firstChar = Character.toUpperCase(str.charAt(0));
            result.putIfAbsent(firstChar, new ArrayList<>());
            result.get(firstChar).add(str);
        }
        return result;
    }

    public static Map<Integer, Optional<Integer>> getMaxByModulo4(Stream<Integer> s) {
        return s.collect(Collectors.groupingBy(
                n -> n % 4,
                Collectors.maxBy(Comparator.naturalOrder())));
    }

    public static String orderAndConcatWithSharp(Stream<String> s) {
        return s.sorted()
                .collect(Collectors.joining(" # ", "{", "}"));
    }
}