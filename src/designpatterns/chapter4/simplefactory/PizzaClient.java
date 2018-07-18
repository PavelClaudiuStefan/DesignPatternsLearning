package designpatterns.chapter4.simplefactory;

public class PizzaClient {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
        Pizza pizza = pizzaStore.orderPizza("cheese");
        pizza.eat();

        pizza = pizzaStore.orderPizza("pepperoni");
        pizza.eat();
    }

}
