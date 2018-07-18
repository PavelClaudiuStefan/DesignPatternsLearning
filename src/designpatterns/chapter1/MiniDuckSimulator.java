package designpatterns.chapter1;

/*
 *      <<Composition over inheritance>> is the principle that classes should achieve polymorphic behavior and code reuse
 * by their composition (by containing instances of other classes that implement the desired functionality)
 * rather than inheritance from a base or parent class
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {

        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        System.out.println();

        Duck model = new ModelDuck();
        model.display();
        model.performQuack();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }

}
