package labs_examples.fundamentals.labs.fundamentalsHW;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FundamentalsHW_1 {

    public static void main(String[] args) {

        /**
         * Conditions and Loops Exercise 11: Nested for loop
         *
         *      Use a nested for loop to generate a multiplication table for numbers 1-10.
         *      The output should look something like this: (you don't need to worry about perfect alignment)
         *
         *      Hint: use "System.out.print()" rather than "System.out.println()" to print multiple numbers to the same line.
         *
         *      1 |2 |3 |4 |5 |6 |7 |8 |9 |10 |
         *      2 |4 |6 |8 |10|12|14|16|18|20 |
         *      3 |6 |9 |12|15|18|21|24|27|30 |
         *      4 |8 |12|16|20|24|28|32|36|40 |
         *      5 |10|15|20|25|30|35|40|45|50 |
         *      6 |12|18|24|30|36|42|48|54|60 |
         *      7 |14|21|28|35|42|49|56|63|70 |
         *      8 |16|24|32|40|48|56|64|72|80 |
         *      9 |18|27|36|45|54|63|72|81|90 |
         *      10|20|30|40|50|60|70|80|90|100|
         *
         */

        for(int t = 1; t <=10; t++){
            for(int p = 1; p <=10; p++){

                System.out.print(t * p + "|");

            } System.out.println();

        }

        /**
         * Conditions and Loops Exercise 10: continue
         *
         *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
         *
         */

        int l = 10;
        do {l--;
            if(l == 6) {
                continue;
            }
            System.out.print(l + "|");
        }
        while (l > 0);



        /**
         * Conditions and Loops Exercise 9: break
         *
         *      Demonstrate the use of the "break" statement to exit a loop.
         *
         */

        int cat = 100;
        do {cat--;
            if(cat == 66) {
                break;
            }
            System.out.print(cat + "|");
        }
        while (cat > 0);




        /**
         * Conditions and Loops Exercise 8: do-while loop
         *
         *      Use a "do-while" loop print out every third number counting backwards from 1000 to 1.
         *
         */

        int dog = 1003;
        do {dog -= 3;
            System.out.print(dog + "|");
        }
        while (dog > 0);



            // * Conditions and Loops Exercise 7: First vowel
// *
// *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
// *      Once you find the vowel, print out the word and the first vowel.
// *
// *      Hints:
// *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
// *          - you'll likely want to use a String that contains all the vowels:
// *              - ie: String vowels = "aeiou";
// *
//
//        Scanner scanner12 = new Scanner(System.in);
//        System.out.println("Please, give me you word: ");
//        String word = scanner12.next("");
//
//        int ww = 0;
////        int count = 0;
//        while(ww < word.length()){
//            ww++;
////            char vowel = word.charAt(ww);
//            if(word.charAt(ww) == "a"|| word.charAt(ww) = 'o');
//
//
//            System.out.println();
//
//
//        }


//        Use a "while" loop find the sum of numbers to from 1-100. Print the sum to the console
            int ia = 0;
            int wSum = 0;
            while (ia < 100) {
                ia++;
                wSum = wSum + ia;

                System.out.println(ia);
            }
            System.out.println(wSum);


            // * Conditions and Loops Exercise 5: Calculator
// *
// *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
// *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
// *      Print the results to the console.
// *
// *      For example, if a user enters 1 and 100, the output should be:
// *
// *      The sum is: 5050
// *      The average is: 50.5

            Scanner scanner4 = new Scanner(System.in);
            System.out.println("Please, insert a number between 1 and a 100: ");
            int lower = scanner4.nextInt();
            Scanner scanner5 = new Scanner(System.in);
            System.out.println("Please, insert a number larger than the first one");
            int upper = scanner5.nextInt();

            for (int i = lower; i <= upper; i++) {

                System.out.println(i);
            }
            double sum = (upper + lower) * (upper - lower) / 2;
            System.out.println("------------------------------");
            System.out.println(sum);
            System.out.println("*********************************");
            double o = upper - lower;
            double average = sum / o;
            System.out.println("-------------------------------");
            System.out.println(average);


            //        Using a "for-loop", print out all even numbers from 1-100.

            for (int i = 1; i <= 100; i++) {
                if (i % 2 != 0) continue;
                System.out.println(i);

            }


            Scanner scanner = new Scanner(System.in);
            System.out.println("Please, insert a number between 1 and 7: ");

            int number = scanner.nextInt();

            if (number == 1) {
                System.out.println("It's Monday");
            } else if (number == 2) {
                System.out.println("It's Tuesday");
            } else if (number == 3) {
                System.out.println("It's Wednesday");
            } else if (number == 4) {
                System.out.println("It's Thursday");
            } else if (number == 5) {
                System.out.println("It's Friday");
            } else if (number == 6) {
                System.out.println("It's Saturday");
            } else if (number == 7) {
                System.out.println("It's Sunday");
            }


// * Conditions and Loops Exercise 1: Even or Odd
//                *
// *      Write a program that gets a number between 1 and 1,000,000
//                *      from the user and determines whether it is odd
// *      or even using an if statement. Print the result.
//                *
// *      NOTE: We will be using the Scanner class to collect user input. This is demonstrated below.

            Scanner oddNot = new Scanner(System.in);
            System.out.println("Please, insert a number between 1 and 100: ");

            int xe = oddNot.nextInt();

            if (xe % 2 == 0) {
                System.out.println("Your number is 'even'.");
            } else {
                System.out.println("Your number is 'odd'.");
            }

            int xx = 1;
            while (xx < 11) {
                System.out.println("x is : " + xx);
                xx++;
            }


            System.out.print("Hello, World!" + "\n" + "Check out my new program!");

            byte a = 3;
            char b = 'a';
            int c = 333;
            double d = 345.4;
            float e = 2354.324f;
            boolean f = true;
            long g = 2344345l;
            short h = 7000;

            System.out.println();
            System.out.print("byte a is: " + a + "\n" + "char b is: " + b + "\n" + "int c is: " + c);

            int x = 32;
            double z = 23.23;
            float j = 3242342.24242f;
            char k = 'd';

            System.out.println();
            System.out.print(x + "\n" + z + "\n" + j + "\n" + k);


            int t = 10;
            double tt = t;
            System.out.println();
            System.out.println(tt);

            double ff = 10.5;
            int fff = (int) ff;
            System.out.println();
            System.out.println(fff);





            /*      Write the necessary code to display, declare and print each of Java's primitive data types.
             *      Please declare a single variable of each type, give it an appropriate value, then print that variable.
             */


            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Please, choose a number between 1 and 12: ");
            int month = scanner1.nextInt();
            switch (month) {
                case 1:
                    System.out.println("January");
                    break;

                case 2:
                    System.out.println("February");
                    break;

                case 3:
                    System.out.println("March");
                    break;
            }


        }

    }











