import java.util.ArrayList;
import java.util.List;

class DecimalBaseObserver implements NumericBaseObserver {
    private List<String> events;

    public DecimalBaseObserver() {
        this.events = new ArrayList<>();
    }

    @Override
    public void updateState(int state) {
        String decimalString = Integer.toString(state);
        events.add(decimalString);
    }

    public List<String> getEvents() {
        return events;
    }

}