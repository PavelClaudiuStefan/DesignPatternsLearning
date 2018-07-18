package designpatterns.chapter2;

public interface Subject {

    void addObserver(Observer o);
    void removeObserver(Observer o);
    void setChanged();
    void notifyObservers();
    void notifyObservers(Object arg);

}
