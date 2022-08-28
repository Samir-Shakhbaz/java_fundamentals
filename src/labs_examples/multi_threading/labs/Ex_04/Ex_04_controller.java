package labs_examples.multi_threading.labs.Ex_04;

import labs_examples.multi_threading.labs.Ex_01.MyThreadRunnable;

public class Ex_04_controller {
    public static void main(String[] args) {

        Thread thread = new Thread(new MyThreadSync());
        Thread thread1 = new Thread(new MyThreadSync());
        Thread thread2 = new Thread(new MyThreadSync());

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

