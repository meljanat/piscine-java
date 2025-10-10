import java.util.List;
import java.util.ArrayList;

class ValuePublisher {
    private List<NumericBaseObserver> observers;

    public ValuePublisher() {
        this.observers = new ArrayList<>();
    }

    public void updateState(int value) {
        for (NumericBaseObserver observer : observers) {
            observer.updateState(value);
        }
    }

    public void subscribe(NumericBaseObserver observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    public void unsubscribe(NumericBaseObserver observer) {
        observers.remove(observer);
    }

}