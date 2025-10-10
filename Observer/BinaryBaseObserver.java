import java.util.ArrayList;
import java.util.List;

class BinaryBaseObserver implements NumericBaseObserver {
    private List<String> events;

    public BinaryBaseObserver() {
        this.events = new ArrayList<>();
    }

    @Override
    public void updateState(int state) {
        String binaryString = Integer.toBinaryString(state);
        events.add(binaryString);
    }

    public List<String> getEvents() {
        return events;
    }

}