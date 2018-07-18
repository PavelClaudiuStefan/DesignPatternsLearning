package designpatterns.chapter4.factory1;

import designpatterns.chapter4.factory1.pizza.Pizza;

public abstract class PizzaStore {

    Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(String type);

}
