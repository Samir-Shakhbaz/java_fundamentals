package labs_examples.multi_threading.labs.Ex_01;

/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {

        MyThreadRunnable myThreadRunnable = new MyThreadRunnable();
        myThreadRunnable.thread.setName("d");
//        Thread thread = new Thread(new MyThreadRunnable());
//        Thread thread1 = new Thread(new MyThreadRunnable());
//        Thread thread2 = new Thread(new MyThreadRunnable());
//        thread.start();
//        thread1.start();
//        thread2.start();

        try {
            myThreadRunnable.thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        try {
//            myThreadRunnable1.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            thread2.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
    }
}

