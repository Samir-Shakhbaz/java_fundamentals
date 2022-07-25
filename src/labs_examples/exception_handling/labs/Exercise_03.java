package labs_examples.exception_handling.labs;

import java.util.Arrays;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */

public class Exercise_03 {
    public static void main(String[] args) {

        int[] myArray = {7, 6, 4, 2};

        try {
            System.out.println(myArray[6]);
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("Your index is out of range");
        } finally {
            System.out.println("Proceed anyway " + Arrays.toString(myArray));
        }
    }
}


