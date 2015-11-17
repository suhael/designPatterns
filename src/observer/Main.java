package observer;

/**
 * Created by sakhtar on 19/03/14.
 */
public class Main {
    public static void main(String[] args) {
        Actor jolie = new Actor();

        jolie.setAction("getting ready");
        Watcher a = new Watcher();

        jolie.registerObserver(a);
        jolie.setAction("taking a walk");
        jolie.notifyObservers();
    }
}
