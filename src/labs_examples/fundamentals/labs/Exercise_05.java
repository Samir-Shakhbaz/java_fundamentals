package labs_examples.fundamentals.labs;

/**
 * Fundamentals Exercise 4: My Second Program
 *
 *      Write the necessary code to display, declare and print each of Java's primitive data types.
 *      Please declare a single variable of each type, give it an appropriate value, then print that variable.
 *
 */

public class Exercise_04 {

	public static void main(String[] args) {

		int i = 1;
		System.out.println("int i is: " + i);


		// write your code below

		byte b = 127;
		char c = 'A';
		long l = 87600000000000l;
		short s = 32000;
		boolean boo = true;
		float f = 42348734407.1234567f;
		double d = 83472294374029374012741047.12345678901234;

		System.out.println("byte b is: " + b);
		System.out.println("char c is: " + c);
		System.out.println("long l is: " + l);
		System.out.println("short s is: " + s);
		System.out.println("boolean boo is: " + boo);
		System.out.println("float f is: " + f);
		System.out.println("double d is: " + d);
	}

}