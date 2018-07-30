package designpatterns.chapter12.mvc;

public interface HeartModelInterface {
    int getHeartRate();
    void registerObserver(BeatObserver observer);
    void removeObserver(BeatObserver observer);
    void registerObserver(BPMObserver observer);
    void removeObserver(BPMObserver observer);
}
