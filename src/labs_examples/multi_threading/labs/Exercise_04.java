package labs_examples.multi_threading.labs;

import labs_examples.multi_threading.labs.Ex_01.MyThreadRunnable;

import static java.lang.Thread.currentThread;

/**
 * Multithreading Exercise 4:
 *
 *      Demonstrate the use of a synchronized block and a synchronized method - ensure that the synchronization is
 *      working as expected
 */

public class Exercise_04 {
    public static void main(String[] args) {

        Thread thread = new Thread(new MySynchRunnable());
        thread.start();
        Thread thread1 = new Thread(new MySynchRunnable());
        thread1.start();
        Thread thread2 = new Thread(new MySynchRunnable());
        thread2.start();



        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class MySynchRunnable implements Runnable {

    @Override
    synchronized public void run() {
        int counter = 0;
        for (int i = 0; i <= 10; i++) {
            try {
                counter++;
                System.out.println(currentThread().getName() + " multithreading is easy" + " - " + i + " - " + counter);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
