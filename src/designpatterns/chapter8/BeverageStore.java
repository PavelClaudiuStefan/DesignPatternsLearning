package designpatterns.chapter8;

public class BeverageStore {

    public static void main(String[] args) {
        System.out.println("--- Tea for Claudiu ---");
        Tea claudiuTea = new Tea();
        claudiuTea.prepareRecipe();

        System.out.println("\n--- Coffee for Valeria ---");
        CoffeeWithHook valeriaCoffee = new CoffeeWithHook();
        valeriaCoffee.prepareRecipe();
    }

}
