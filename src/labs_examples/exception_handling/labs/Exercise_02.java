package labs_examples.exception_handling.labs;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */


public class Exercise_02 {

    public static void main(String[] args) {
        int a;
        int b;
        int c;


       try { Scanner scanner_a = new Scanner(System.in);
        System.out.println("Enter number between -30 and 5");
        a = scanner_a.nextInt();
        System.out.println("Enter number between -30 and 5");
        Scanner scanner_b = new Scanner(System.in);
        b = scanner_b.nextInt();
        c = a/b;
        System.out.println(c);}
       catch (ArithmeticException exc_1){
           System.out.println("Division by 'zero' is not recommended by Mathematical Association of America");}
       catch (InputMismatchException exc_2){
           System.out.println("Please, insert a number between -30 and 5");
       }
        System.out.println("The rest looks fine");

    }

}