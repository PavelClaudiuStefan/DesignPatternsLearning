package designpatterns.chapter2;

import java.util.ArrayList;

public class Observable implements Subject {

    private ArrayList<Observer> observers;
    private boolean changed;

    public Observable() {
        observers = new ArrayList<>();
        changed = false;
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void setChanged() {
        changed = true;
    }

    @Override
    public void notifyObservers() {
        notifyObservers(null);
    }

    @Override
    public void notifyObservers(Object arg) {
        if (changed) {
            for (Observer o : observers) {
                o.update(this, arg);
            }
        }
        changed = false;
    }
}
