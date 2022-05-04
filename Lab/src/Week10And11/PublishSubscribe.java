package Week10And11;

import java.util.Observable;
import java.util.Observer;

class ObservableValue extends Observable {
    public ObservableValue(PublishSubscribe publishSubscribe) {
        this.addObserver(new Observer1());
        this.addObserver(new Observer2());
        setChanged();
        notifyObservers(publishSubscribe);
    }
}

class Observer1 implements Observer {
    public void update(Observable obs, Object arg) {
        PublishSubscribe ref3 = (PublishSubscribe) arg;
        System.out.println("notified in Observer1: " + ref3.getValue());
    }
}

class Observer2 implements Observer {
    public void update(Observable obs, Object arg) {
        PublishSubscribe ref3 = (PublishSubscribe) arg;
        System.out.println("notified in Observer2: " + ref3.getValue());
    }
}

public class PublishSubscribe {
    String msg;

    public PublishSubscribe(String msg) {
        this.msg = msg;
        ObservableValue ref2 = new ObservableValue(this);
    }

    public String getValue() {
        return msg;
    }

    public static void main(String[] args) {
        PublishSubscribe refA = new PublishSubscribe("Notify Observers");
        PublishSubscribe refB = new PublishSubscribe("Notified Observers");
    }
}