package designpatterns.chapter3.starbuzz;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        setDescription("Dark Roast Coffee");
    }

    @Override
    public double cost() {
        return .99;
    }

}
