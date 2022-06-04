package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args){

        int [] [] twoIrr = {
                {13, 45, 67},
                {66, 75, 345, 78, 56},
                {33, 43, 65, 76},
                {76, 12}

        };
        for(int i = 0; i < twoIrr.length; i++){
            for(int j = 0; j < twoIrr[i].length; j++) {
                System.out.print(twoIrr[i][j] + " - ");

            }
            System.out.println();
        }

    }

}
