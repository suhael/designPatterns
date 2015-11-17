package observer;

/**
 * Created by sakhtar on 19/03/14.
 */
public interface Subject {

    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
    public String getAction();
}
