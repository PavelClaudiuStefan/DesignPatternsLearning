package designpatterns.chapter11;

import designpatterns.chapter10.GumballMachine;

public class Test {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(10, "Bucharest");
        GumballMonitor gumballMonitor = new GumballMonitor(gumballMachine);

        gumballMonitor.report();
    }

}
