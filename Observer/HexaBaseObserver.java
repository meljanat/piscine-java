import java.util.ArrayList;
import java.util.List;

class HexaBaseObserver implements NumericBaseObserver {
    private List<String> events;

    public HexaBaseObserver() {
        this.events = new ArrayList<>();
    }

    @Override
    public void updateState(int state) {
        String hexaString = Integer.toHexString(state);
        events.add(hexaString);
    }

    @Override
    public List<String> getEvents() {
        return events;
    }

}