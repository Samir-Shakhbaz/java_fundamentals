package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */

public class Exercise_02 {

    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        myThread.start();

        MyThread myThread1 = new MyThread();
        myThread1.start();

        MyThread myThread2 = new MyThread();
        myThread2.start();

        System.out.println("The threads are closed");

    }
}
        class MyThread extends Thread {
    public void run(){
        for (int i = 0; i <=10; i++){
            System.out.println(currentThread().getName() + " multithreading is easy" + " - " + i);

        }
    }
}

