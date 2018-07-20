package designpatterns.chapter6.devices;

public class GarageDoor {

    private String location;
    private boolean isUp;

    public GarageDoor(String location) {
        this.location = location;
        isUp = false;
    }

    public void up() {
        isUp = true;
        System.out.println(location + ": Garage Door - up");
    }

    public void down() {
        isUp = false;
        System.out.println(location + ": Garage Door - down");
    }
}
