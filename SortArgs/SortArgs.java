import java.util.Arrays;

public class SortArgs {
    public static void sort(String[] args) {
        if (args == null) {
            return;
        }
        Arrays.sort(args);
        String res = String.join(" ", args);
        System.out.println(res);
    }
}