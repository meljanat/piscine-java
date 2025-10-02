import java.util.List;
import java.util.ArrayList;

public class SortList {
    public static List<Integer> sort(List<Integer> list) {
        List<Integer> newList = new ArrayList<>(list);
        if (newList == null || newList.isEmpty()) {
            return newList;
        }
        newList.sort(Integer::compareTo);
        return newList;
    }

    public static List<Integer> sortReverse(List<Integer> list) {
        List<Integer> newList = new ArrayList<>(list);
        if (newList == null || newList.isEmpty()) {
            return newList;
        }
        newList.sort((a, b) -> b.compareTo(a));
        return newList;
    }
}