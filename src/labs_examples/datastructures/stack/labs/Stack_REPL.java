package labs_examples.datastructures.stack.labs;




        // push several elements onto the Stack

        // print the first element in the Stack

        // pop the first element off the Stack

        // print the first element in the Stack again

        // demonstrate at least 3 other Stack method

import java.util.Stack;


public class Stack_REPL {

    public static void main(String[] args) {

        Stack<String> myStack = new Stack();

        myStack.push("table");
        myStack.push("chair");
        myStack.push("shelves");
        myStack.push("carpet");
        myStack.push("window");
        myStack.push("curtains");

        System.out.println(myStack.peek());

        myStack.pop();

        System.out.println(myStack.peek());

        System.out.println(myStack.size());

        System.out.println(myStack.search("shelves"));

        System.out.println(myStack.indexOf("carpet"));






    }

}
