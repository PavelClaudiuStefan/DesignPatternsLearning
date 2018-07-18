package designpatterns.chapter4.factory1.pizza;

import designpatterns.chapter4.factory1.ingredients.PizzaIngredientFactory;

public class VeggiesPizza extends Pizza {

    private PizzaIngredientFactory ingredientFactory;

    public VeggiesPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + getName());
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
    }
}
