package designpatterns.chapter4.simplefactory;

public class CheesePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Cheese pizza : Prepare");
    }

    @Override
    public void bake() {
        System.out.println("Cheese pizza : Bake");
    }

    @Override
    public void cut() {
        System.out.println("Cheese pizza : Cut");
    }

    @Override
    public void box() {
        System.out.println("Cheese pizza : Box");
    }
}
