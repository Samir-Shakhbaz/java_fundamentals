package labs_examples.exception_handling.labs;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

class Example {

    public static void main(String[] args) {
        System.out.println("Type a number: ");
        try {
            mistake();
        } catch (InputMismatchException exc) {
            System.out.println("We caught an InputMismatchException");
        }
        System.out.println("\nNo exception can stop this program!");
    }

    public static void mistake() throws InputMismatchException {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

    }
}