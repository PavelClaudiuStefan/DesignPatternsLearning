package designpatterns.chapter4.simplefactory;

public interface Pizza {

    void prepare();
    void bake();
    void cut();
    void box();
    default void eat(){
        System.out.println("Pizza is good for you!\n");
    }

}
