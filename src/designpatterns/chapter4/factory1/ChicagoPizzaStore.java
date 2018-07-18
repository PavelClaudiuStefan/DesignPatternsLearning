package designpatterns.chapter4.factory1;

import designpatterns.chapter4.factory1.ingredients.ChicagoPizzaIngredientFactory;
import designpatterns.chapter4.factory1.ingredients.PizzaIngredientFactory;
import designpatterns.chapter4.factory1.pizza.*;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if (type.equals("cheese")) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");

        } else if (type.equals("veggies")) {

            pizza = new VeggiesPizza(ingredientFactory);
            pizza.setName("Chicago Style Veggies Pizza");

        } else if (type.equals("clam")) {

            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");

        } else if (type.equals("pepperoni")) {

            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        }
        return pizza;
    }
}
