package designpatterns.chapter7.adapter;

public class DuckTestDrive {

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();

        WildTurkey wildTurkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("The turkey says...");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("\nThe duck says...");
        testDuck(mallardDuck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

}
