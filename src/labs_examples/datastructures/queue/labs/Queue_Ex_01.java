package labs_examples.datastructures.queue.labs;

import java.util.PriorityQueue;

public class Queue_Ex_01 {

    public static void main(String[] args) {

        PriorityQueue <Integer> myPriorityQueue = new PriorityQueue<>();

        myPriorityQueue.add(7);
        myPriorityQueue.add(3);
        myPriorityQueue.add(17);
        myPriorityQueue.add(23);
        myPriorityQueue.add(8);
        myPriorityQueue.add(3);
        myPriorityQueue.add(71);
        myPriorityQueue.add(34);

        System.out.println(myPriorityQueue);

        System.out.println(myPriorityQueue.peek());

        System.out.println(myPriorityQueue.contains(23));

        Integer ee = myPriorityQueue.remove();
        System.out.println(ee);
        System.out.println(myPriorityQueue);

        System.out.println(myPriorityQueue.element());

        myPriorityQueue.clear();
        System.out.println(myPriorityQueue);


    }

}
