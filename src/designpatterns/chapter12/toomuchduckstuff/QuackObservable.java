package designpatterns.chapter12.toomuchduckstuff;

public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
