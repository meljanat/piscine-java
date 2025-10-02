import java.util.List;

public class SortList {

    public static List<Integer> sort(List<Integer> list) {
        list.sort(Integer::compareTo);
        return list;
    }

    public static List<Integer> sortReverse(List<Integer> list) {
        list.sort((a, b) -> b.compareTo(a));
        return list;
    }
}