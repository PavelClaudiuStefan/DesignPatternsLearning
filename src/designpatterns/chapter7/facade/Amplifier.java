package designpatterns.chapter7.facade;

public class Amplifier {

    Tuner tuner;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;

    public void on() {
        System.out.println("Amplifier - on");
    }

    public void off() {
        System.out.println("Amplifier - off");
    }

    public void setSurroundSound() {
        System.out.println("Amplifier - surround sound");
    }

    public void setVolume(int volume) {
        System.out.println("Amplifier - volume: " + volume);
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }

    public void setDvdPlayer(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
    }

    public void setCdPlayer(CdPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
    }
}
