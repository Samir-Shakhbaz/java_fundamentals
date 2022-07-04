package labs_examples.fundamentals.labs.fundamentalsHW;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_hw_repeat {
    public static void main(String[] args) {

        /**
         * Arrays calculator
         *
         *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
         *      calculate the sum of all of the numbers in the array as well as the average.
         *
         *      Print the results to the console.
         *
         */

        int[] fromUserS = {23, 4343, 54, 33, 67, 75, 86, 95, 3332, 12};
        int sum = 0;
        for(int i = 0; i < fromUserS.length; i++){
            sum = sum + fromUserS[i];
           }
        System.out.println(Arrays.toString(fromUserS));
        System.out.println(sum);

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Please, type a number: ");
        int fromUser1 = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Please, type a number: ");
        int fromUser2 = scanner1.nextInt();
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Please, type a number: ");
        int fromUser3 = scanner1.nextInt();
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Please, type a number: ");
        int fromUser4 = scanner1.nextInt();
        Scanner scanner5 = new Scanner(System.in);
        System.out.println("Please, type a number: ");
        int fromUser5 = scanner1.nextInt();
        Scanner scanner6 = new Scanner(System.in);
        System.out.println("Please, type a number: ");
        int fromUser6 = scanner1.nextInt();
        Scanner scanner7 = new Scanner(System.in);
        System.out.println("Please, type a number: ");
        int fromUser7 = scanner1.nextInt();
        Scanner scanner8 = new Scanner(System.in);
        System.out.println("Please, type a number: ");
        int fromUser8 = scanner1.nextInt();
        Scanner scanner9 = new Scanner(System.in);
        System.out.println("Please, type a number: ");
        int fromUser9 = scanner1.nextInt();
        Scanner scanner10 = new Scanner(System.in);
        System.out.println("Please, type a number: ");
        int fromUser10 = scanner1.nextInt();


            }

    }

