package labs_examples.multi_threading.labs.Ex_04;

import static java.lang.Thread.currentThread;

public class MyThreadSync implements Runnable{

        @Override
        public synchronized void run() {
            int counter = 0;
            for (int i = 0; i <= 10; i++) {
                counter++;
                System.out.println(currentThread().getName() + " multithreading is easy" + " - " + i + " - " + counter);
            }
        }
    }
