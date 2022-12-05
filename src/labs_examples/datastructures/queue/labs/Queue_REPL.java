package labs_examples.datastructures.queue.labs;

import java.util.PriorityQueue;

// add several elements to the myQueue

// print out every element in this myQueue

// why did they print out in the order they did

// pop the first element off the myQueue

// print out every element again

// demonstrate several other PriorityQueue methods

public class Queue_REPL {

    public static void main(String[] args) {
        PriorityQueue<String> myQueue = new PriorityQueue();

        myQueue.add("super");
        myQueue.add("acceptable");
        myQueue.add("superb");
        myQueue.add("brilliant");
        myQueue.add("average");
        myQueue.add("bad");
        myQueue.add("normal");
        myQueue.add("terrific");

        System.out.println(myQueue);

        myQueue.remove();
        System.out.println(myQueue);

        for(String string : myQueue){
            System.out.println(string);

            myQueue.clear();
            System.out.println(myQueue);
        }

    }

}
