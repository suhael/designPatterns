package observer;

import java.util.ArrayList;

/**
 * Created by sakhtar on 19/03/14.
 */
public class Actor implements Subject {

    private ArrayList<Observer> observers = new ArrayList<Observer>();


    private String action;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(this);
        }
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
