package labs_examples.generics.labs;

import java.util.Collection;

/**
 * Generics Exercise 3:
 *
 *      1) Write a generic method that accepts two generic arguments. This generic method should only accept
 *      arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
 *      numbers were passed in regardless of their type.
 *
 *      2) Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes

 *      3) Write a generic method to exchange the positions of two different elements in an array.
 *
 *      4) Write a generic method to find the largest element within the range (begin, end) of a list.
 *
 */


public class Exercise_03_1 {

    public static void main(String[] args) {
        double a = sumDouble(345.56, 2);
        System.out.println(a);


    }

    public static <T extends Number, V extends Number> double sumDouble(T a, V b){
        return a.doubleValue() + b.doubleValue();
    }



}