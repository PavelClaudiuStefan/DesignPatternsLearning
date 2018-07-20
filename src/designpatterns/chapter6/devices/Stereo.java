package designpatterns.chapter6.devices;

public class Stereo {

    private String location;
    private boolean isOn;
    private int volume;

    public Stereo(String location) {
        this.location = location;
        volume = 0;
    }

    public void on() {
        isOn = true;
        System.out.println(location + ": Stereo - On");
    }

    public void off() {
        isOn = true;
        System.out.println(location + ": Stereo - off");
    }

    public void setCD() {
        if (isOn)
            System.out.println(location + ": Stereo - Set CD");
    }

    public void setVolume(int volume) {
        if (isOn) {
            this.volume = volume;
            System.out.println(location + ": Stereo - volume: " + volume);
        }
    }

    public void volumeUp() {
        if (isOn) {
            volume++;
            System.out.println(location + ": Stereo - volume: " + volume);
        }
    }

    public void volumeDown() {
        if (isOn && volume > 0) {
            volume--;
            System.out.println(location + ": Stereo - volume: " + volume);
        }
    }

}
