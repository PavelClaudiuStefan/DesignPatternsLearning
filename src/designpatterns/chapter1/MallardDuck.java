package designpatterns.chapter1;

public class MallardDuck extends Duck {

    MallardDuck() {
        setQuackBehavior(new Quack());
        setFlyBehavior(new FlyWithWings());
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
