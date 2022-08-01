package labs_examples.multi_threading.labs;

import static java.lang.Thread.currentThread;

public class MyThreadRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(currentThread().getName() + " multithreading is easy" + " - " + i);
        }
    }
}
