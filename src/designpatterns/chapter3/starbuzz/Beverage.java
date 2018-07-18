package designpatterns.chapter3.starbuzz;

public abstract class Beverage {

    private String description = "Unknown Beverage";

    String getDescription() {
        return description;
    }

    void setDescription(String description) {
        this.description = description;
    }

    public abstract double cost();
}
