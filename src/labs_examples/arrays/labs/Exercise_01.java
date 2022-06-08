package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // prompt user
        // assign input to variable as int
        System.out.println("Enter a number form 1 to 10: ");
        int number = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        int [] calc = {number, number2, number3, 54, 67, 22, 25, 98, 03, 77};
            int sum = 0;
            int average = 0;
            for(int i = 0; i < calc.length; i++) {
                sum += calc[i];
            }
            average = sum / 10;
        System.out.println("sum equals: " + sum);
        System.out.println("average equals: " + average);



    }

}