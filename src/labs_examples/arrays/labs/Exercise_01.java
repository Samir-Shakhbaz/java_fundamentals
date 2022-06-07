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
        int [] calc = {10, 23, 44, 54, 67, 22, 25, 98, 03, 77};
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