import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;

public class KeepTheChange {
    public static List<Integer> computeChange(int amount, Set<Integer> coins) {
        List<Integer> coinList = new ArrayList<>(coins);
        Collections.sort(coinList, Collections.reverseOrder());
        List<Integer> result = new ArrayList<>();
        for (int coin : coinList) {
            while (amount >= coin) {
                amount -= coin;
                result.add(coin);
            }
        }
        if (amount != 0) {
            return Collections.emptyList();
        }
        return result;
    }
}