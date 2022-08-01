package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
//        MyThread myThread = new MyThread();
//        myThread.start();
//
//        MyThread myThread1 = new MyThread();
//        myThread1.start();
//
//        MyThread myThread2 = new MyThread();
//        myThread2.start();
//
//        System.out.println("The threads are closed");

        Thread thread = new Thread(new MyThreadRunnable());
        Thread thread1 = new Thread(new MyThreadRunnable());
        Thread thread2 = new Thread(new MyThreadRunnable());
        thread.start();
        thread1.start();
        thread2.start();

        }
}
