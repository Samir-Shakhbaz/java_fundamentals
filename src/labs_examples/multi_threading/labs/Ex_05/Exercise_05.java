package labs_examples.multi_threading.labs.Ex_05;

/**
 * Multithreading Exercise 5:
 *
 *      Demonstrate the use of a wait() and notify()
 */

public class Exercise_05 {

    public static void main(String[] args) throws InterruptedException {

    Thread anotherThread = new Thread(new AnotherRunnable());
    anotherThread.start();
    anotherThread.wait();

    Thread anotherThread1 = new Thread(new AnotherRunnable());
    anotherThread1.start();
    anotherThread1.notify();


    }

}
