package labs_examples.datastructures.queue.labs;

import java.util.PriorityQueue;

public class MyQueue {

    public static void main(String[] args) {

    PriorityQueue<String> myQueue = new PriorityQueue<>();

        myQueue.add("five");
        myQueue.add("blue");
        myQueue.add("book");
        myQueue.add("chess");
        myQueue.add("fun");
        myQueue.add("not funny");


        System.out.println(myQueue);

        System.out.println(myQueue.peek());

        System.out.println(myQueue.contains("chess"));

        String dd = myQueue.remove();

        System.out.println(myQueue);

        System.out.println(myQueue.element());

        myQueue.clear();

        System.out.println(myQueue);


}

}


