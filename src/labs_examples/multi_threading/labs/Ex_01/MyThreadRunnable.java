package labs_examples.multi_threading.labs.Ex_01;

import static java.lang.Thread.currentThread;

public class MyThreadRunnable implements Runnable {
    Thread thread = new Thread();

    public MyThreadRunnable() {

        thread.start();

    }

    @Override
    public void run() {
        int counter = 0;
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            counter++;
            System.out.println(currentThread().getName() + " multithreading is easy" + " - " + i + " - " + counter);
        }
    }

}
