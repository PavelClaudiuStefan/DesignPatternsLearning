package designpatterns.chapter5;

public class Singleton {

    private volatile static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {     // "double-checked locking"
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }

    // Other methods

}
