package designpatterns.chapter3.starbuzz;

public class Decaf extends Beverage {

    public Decaf() {
        setDescription("Decaf Coffee");
    }

    @Override
    public double cost() {
        return 1.05;
    }

}
