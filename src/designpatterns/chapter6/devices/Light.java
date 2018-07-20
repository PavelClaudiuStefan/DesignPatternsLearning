package designpatterns.chapter6.devices;

public class Light {

    private String location;
    private boolean isOn;

    public Light(String location) {
        this.location = location;
        isOn = false;
    }

    public void on() {
        isOn = true;
        System.out.println(location + ": Light - on");
    }

    public void off() {
        isOn = false;
        System.out.println(location + ": Light - off");
    }

}
