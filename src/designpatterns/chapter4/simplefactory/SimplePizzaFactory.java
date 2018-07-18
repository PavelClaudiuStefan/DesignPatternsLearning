package designpatterns.chapter4.simplefactory;

class SimplePizzaFactory {

    Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza =  new CheesePizza();
                break;
            case "pepperoni":
                pizza =  new PepperoniPizza();
                break;
            case "veggie":
                pizza =  new VeggiePizza();
                break;
            default:
                System.out.println("SimplePizzaFactory - ERROR - NO SUCH PIZZA");
                break;
        }
        return pizza;
    }

}
