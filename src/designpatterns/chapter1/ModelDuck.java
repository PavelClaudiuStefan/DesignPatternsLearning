package designpatterns.chapter1;

public class ModelDuck extends Duck{

    ModelDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
