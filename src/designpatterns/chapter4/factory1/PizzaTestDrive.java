package designpatterns.chapter4.factory1;

import designpatterns.chapter4.factory1.pizza.Pizza;

/**
 * NYPizzaStore & ChicagoPizzaStore - Factory Method
 * PizzaIngredientFactory - Abstract Factory
 */
public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("pepperoni");
        System.out.println("***Claudiu ordered a:");
        System.out.println("   " + pizza + "\n");

        pizza = chicagoStore.orderPizza("veggies");
        System.out.println("***Valeria ordered a:");
        System.out.println("   " + pizza + "\n");
    }

}
