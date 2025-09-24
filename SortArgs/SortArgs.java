import java.util.Arrays;

public class SortArgs {
    public static void sort(String[] args) {
        if (args == null || args.length == 0) {
            return;
        }
        Arrays.sort(args);
        String res = String.join(" ", args);
        System.out.println(res + "\n");
    }
}