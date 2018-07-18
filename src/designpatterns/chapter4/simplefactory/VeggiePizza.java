package designpatterns.chapter4.simplefactory;

public class VeggiePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Veggie pizza : Prepare");
    }

    @Override
    public void bake() {
        System.out.println("Veggie pizza : Bake");
    }

    @Override
    public void cut() {
        System.out.println("Veggie pizza : Cut");
    }

    @Override
    public void box() {
        System.out.println("Veggie pizza : Box");
    }
}
