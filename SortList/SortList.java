import java.util.List;

public class SortList {
    public static List<Integer> sort(List<Integer> list) {
        List<Integer> newList = List.copyOf(list);
        newList.sort(Integer::compareTo);
        return newList;
    }

    public static List<Integer> sortReverse(List<Integer> list) {
        List<Integer> newList = List.copyOf(list);
        newList.sort((a, b) -> b.compareTo(a));
        return newList;
    }
}