package designpatterns.chapter7.facade;

public class DvdPlayer {

    public void on() {
        System.out.println("DvdPlayer - on");
    }

    public void off() {
        System.out.println("DvdPlayer - off");
    }

    public void play(String movie) {
        System.out.println("DvdPlayer - play: " + movie);
    }

    public void stop() {
        System.out.println("DvdPlayer - stop");
    }

    public void eject() {
        System.out.println("DvdPlayer - eject");
    }


}
