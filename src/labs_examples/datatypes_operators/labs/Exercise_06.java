package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here

        float r = 3.14f;
        float h = 5f;
        double result = 2 * 3.1416 * 3.14 * 3.14 + 2 * 3.1416 * 3.14 * 5;
        System.out.println("Surface area of a cylinder is " + result);


    }
}