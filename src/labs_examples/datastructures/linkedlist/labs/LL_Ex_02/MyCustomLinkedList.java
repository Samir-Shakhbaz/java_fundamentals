package labs_examples.datastructures.linkedlist.labs.LL_Ex_02;

public class MyCustomLinkedList<T> {

    private Node head;

    MyCustomLinkedList(T... data){

        if (data.length < 1) {
            head = null;

        } else {
            for (int i = 0; i < data.length; i++ ){
                add(data[i]);
            }

        }

    }

    private void add(T data) {

        

    }

}
