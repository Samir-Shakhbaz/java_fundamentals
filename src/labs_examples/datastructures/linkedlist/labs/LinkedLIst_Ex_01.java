package labs_examples.datastructures.linkedlist.labs;


// *      LinkedLists - Exercise_01
//         *
//         *      Demonstrate your mastery of Java's built-in LinkedList class by demonstrating the following:
//         *
//         *      1) create a LinkedList (from Java's libraries)
//         *      2) add()
//         *      3) addAll()
//         *      4) addFirst()
//         *      5) addLast()
//         *      6) getFirst()
//         *      7) getLast()
//         *      8) get()
//         *      9) set()
//         *      10) push()
//         *      11) pop()
//         *      12) remove()
//         *      13) contains()
//         *      14) listIterator()
//         *      15) clear()
//         */


import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class LinkedLIst_Ex_01 {

    public static void main(String[] args) {

        LinkedList<Double> myList = new LinkedList();

        myList.add(66.43);
        myList.add(98.321);
        myList.add(9.32);
        myList.add(12.43);
        myList.add(35.321);
        myList.add(67.32);
        myList.add(16.43);
        myList.add(78.321);
        myList.add(53.32);

        System.out.println(myList);

        Collection<Double> myCollection = new ArrayList<Double>();

        myCollection.add(55.55);
        myCollection.add(11.22);
        myCollection.add(33.33);
        myCollection.add(77.36);

        myList.addAll(myCollection);

        System.out.println(myList);

        myList.addFirst(11.1111);
        myList.addLast(99.9999);

        System.out.println(myList);

        System.out.println(myList.getFirst());

        System.out.println(myList.getLast());

        System.out.println(myList.get(0));


        myList.set(0, 22.2222);


        System.out.println(myList);


        myList.push(78.11);
        System.out.println(myList);

        myList.pop();
        System.out.println(myList);

        myList.remove(3);
        System.out.println(myList);

        System.out.println(myList.contains(33.33));

        ListIterator myLyst_iter = myList.listIterator(3);

        while(myLyst_iter.hasNext()) {
            System.out.print(myLyst_iter.next() + " , ");}

        myList.clear();
        System.out.println(myList);

        }

    }

