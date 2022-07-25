package labs_examples.exception_handling.labs;

import java.util.Random;
import java.util.Scanner;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */

public class Exercise_01 {

        public static void main(String[] args) {
                try {
                        gimmeNumber();
                } catch (OutOfBoundsException e) {
                        System.out.println("The number is out of bounds. Try a different number. If the problem persists, please, contact your System Administrator");
                }
        }



                public static void gimmeNumber() throws OutOfBoundsException {
                        System.out.println("Please input number from 1 to 10: ");
                        Scanner scanner = new Scanner(System.in);
                        int inputNumber = scanner.nextInt();


                        if(inputNumber < 1 || inputNumber>10){
                                throw new OutOfBoundsException();


                        } System.out.println("Your number is: " + inputNumber);
                }


        }

