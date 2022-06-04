package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {
    public static void main(String[] args){
        int [] myArray = new int [100];

                for (int i = 99; i < myArray.length; i -= 2){
                    System.out.println(myArray[i]+i);
                }
        }

    }

