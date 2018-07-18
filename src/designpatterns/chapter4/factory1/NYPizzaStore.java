package designpatterns.chapter4.factory1;

import designpatterns.chapter4.factory1.ingredients.NYPizzaIngredientFactory;
import designpatterns.chapter4.factory1.ingredients.PizzaIngredientFactory;
import designpatterns.chapter4.factory1.pizza.*;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (type.equals("cheese")) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");

        } else if (type.equals("veggies")) {

            pizza = new VeggiesPizza(ingredientFactory);
            pizza.setName("New York Style Veggies Pizza");

        } else if (type.equals("clam")) {

            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");

        } else if (type.equals("pepperoni")) {

            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
        return pizza;
    }
}
