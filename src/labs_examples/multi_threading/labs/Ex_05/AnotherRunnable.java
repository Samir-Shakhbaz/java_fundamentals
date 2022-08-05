package labs_examples.multi_threading.labs.Ex_05;

public class AnotherRunnable implements Runnable {

    @Override
   public void run(){
        int count = 0;
        for (int i = 0; i <= 10; i++){

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i + " - I will not code in Python");
            count++;

        } System.out.println("COUNT IS: " + count);

    }
}
