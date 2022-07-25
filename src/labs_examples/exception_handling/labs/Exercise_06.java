package labs_examples.exception_handling.labs;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        try {
            getInputNumber();
        } catch (InputMismatchException exc) {
            System.out.println("Ladies and Gentlemen, we caught an exception");
        }
    }

    public static void getInputNumber() throws InputMismatchException {
        mistake();

    }

    public static void mistake() throws InputMismatchException {
        System.out.println("Please, input a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

    }

}