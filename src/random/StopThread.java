package random;

import java.util.concurrent.TimeUnit;

public class StopThread {

    private static boolean stopRequested;

    // The thread stops only if the stopRequested is a volatile field or the getter & setter are synchronized
    //private static volatile boolean stopReqested;

    private static synchronized void requestStop() {
        stopRequested = true;
    }

    private static synchronized boolean stopRequested() {
        return stopRequested;
    }

    public static void main(String[] args) throws InterruptedException{

        Thread backgroundThread = new Thread(() -> {
            int i = 0;
            long startTime = System.nanoTime();
            while (!stopRequested())
                i++;
            long elapsedTime = System.nanoTime() - startTime;
            System.out.println(i + " - " + elapsedTime / 1000000000.0);
        });

        backgroundThread.start();

        TimeUnit.SECONDS.sleep(1);
        requestStop();
    }

}
