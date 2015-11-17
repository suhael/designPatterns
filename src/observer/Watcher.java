package observer;

/**
 * Created by sakhtar on 19/03/14.
 */
public class Watcher implements Observer {
    @Override
    public void update(Subject subject) {
        System.out.println("im watching you... you are " + subject.getAction());
    }
}
