package designpatterns.chapter4.simplefactory;

public class PepperoniPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Pepperoni pizza : Prepare");
    }

    @Override
    public void bake() {
        System.out.println("Pepperoni pizza : Bake");
    }

    @Override
    public void cut() {
        System.out.println("Pepperoni pizza : Cut");
    }

    @Override
    public void box() {
        System.out.println("Pepperoni pizza : Box");
    }
}
