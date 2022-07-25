package labs_examples.exception_handling.labs;

import java.util.Arrays;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */
public class Exercise_04 {
    public static void main(String[] args) {
        int[] anotherArray = {4, 12, 43, 55};
        try {
            System.out.println(anotherArray[4]);
            try {
                System.out.println(anotherArray[4]);
                try {
                    System.out.println(anotherArray[4]);
                } catch (ArrayStoreException exc_c) {
                    System.out.println("This is ArrayStoreException");
                }
            } catch (ArrayIndexOutOfBoundsException exc_b) {
                System.out.println("This is ArrayIndexOutOfBoundsException");
            }
        } catch (Exception exc_a) {
            System.out.println("This is Exception");
        }
        System.out.println("And it will still print");
    }
}
