import java.util.List;
import java.util.ArrayList;

public class SortList {
    public static List<Integer> sort(List<Integer> list) {
        if (list == null) {
            return null;
        }
        List<Integer> newList = new ArrayList<>(list);
        newList.sort(Integer::compareTo);
        return newList;
    }

    public static List<Integer> sortReverse(List<Integer> list) {
        if (list == null) {
            return null;
        }
        List<Integer> newList = new ArrayList<>(list);
        newList.sort((a, b) -> b.compareTo(a));
        return newList;
    }
}