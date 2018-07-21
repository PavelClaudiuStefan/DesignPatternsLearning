package designpatterns.chapter8;

public abstract class CaffeineBeverage {

    public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments())
            addCondiments();
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    protected abstract void brew();

    private void pourInCup() {
        System.out.println("Pouring in cup");
    }

    protected abstract void addCondiments();

    // Hook
    boolean customerWantsCondiments() {
        return true;
    }

}
