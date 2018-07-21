package designpatterns.chapter7.adapter;

public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack!");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }

    @Override
    public String toString() {
        return "MallardDuck";
    }
}
