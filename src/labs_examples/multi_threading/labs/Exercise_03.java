package labs_examples.multi_threading.labs;

import labs_examples.multi_threading.labs.Ex_01.MyThreadRunnable;

/**
 * Multithreading Exercise 3:
 *
 *      In one of the previous exercises, demonstrate changing the priority of a thread
 */


public class Exercise_03 {

    public static void main(String[] args) {

        Thread thread = new Thread(new MyThreadRunnable());
        thread.setPriority(Thread.MAX_PRIORITY);
        Thread thread1 = new Thread(new MyThreadRunnable());
        thread1.setPriority(5);
        Thread thread2 = new Thread(new MyThreadRunnable());
        thread2.setPriority(Thread.MIN_PRIORITY);
        thread.start();
        thread1.start();
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