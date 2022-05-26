package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"

        int valueStr1 = str.length();
                System.out.println("The value of valueStr1 is " + str.length());

        String str2 = "hello";
        // please initialize a boolean variable and test whether str is equal to str2
        boolean equalStr = str.equalsIgnoreCase(str2);
                System.out.println("Does str equal str2? " + equalStr);

        // please concatenate str & str2 and set the result to a new String variable below
        String strNew = str + str2;
                System.out.println("The value of srtNew is " + str + " " + str2);

        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc
                System.out.println("Replace 'e' with 'a': " + str.replace('e', 'a'));


                        }


}