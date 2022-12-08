package labs_examples.datastructures.stack.labs;

import java.util.Stack;

public class Stack_Ex_01 {

    public static void main(String[] args) {

        Stack<String> stackAgain = new Stack<>();

        stackAgain.push("Hello!");
        stackAgain.push("How are you?");
        stackAgain.push("Nice to meet you!");
        stackAgain.push("Don't mention it!");
        stackAgain.push("How do you do?");
        stackAgain.push("The pleasure is all mine!");
        System.out.println(stackAgain);

        stackAgain.pop();
        System.out.println("One: " + stackAgain);

        String x = stackAgain.pop();
        System.out.println("Two : " + x);

        System.out.println("Three " + stackAgain.size());

        System.out.println("Four : " + stackAgain.lastElement());

        System.out.println("Five: " + stackAgain.isEmpty());





    }

}
