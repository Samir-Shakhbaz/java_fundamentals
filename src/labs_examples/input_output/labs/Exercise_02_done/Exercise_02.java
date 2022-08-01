package labs_examples.input_output.labs.Exercise_02_done;

import java.io.*;

/**
 * Input/Output Exercise 2: File encryptionpackage labs_examples.input_output.labs;
 *
 * import
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      Then, ead back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */

public class Exercise_02{
    public static void main(String[] args) {

        BufferedReader inputStream = null;
        PrintWriter outputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("C:/Users/John/Documents/CodingNomads/java_fundamentals/src/labs_examples/input_output/files/char_data.txt"));
            outputStream = new PrintWriter(new FileWriter("C:/Users/John/Documents/CodingNomads/java_fundamentals/src/labs_examples/input_output/files/char_data.copy_ex2.txt"));
            String x;

            while ((x = inputStream.readLine()) != null) {
                if(x.equals("a"))
                    x = "-";
                if(x.equals("e"))
                    x = "~";
                outputStream.write(x);
                outputStream.println(x);
                System.out.println(x); }

        } catch (IOException exc) {
            System.out.println("An error occured: " + exc.getMessage());

        } finally {

            try {
                inputStream.close();
            } catch (IOException | NullPointerException exc) {
                exc.printStackTrace();
            }
             try{
                 outputStream.close();
             }
             catch (NullPointerException exc) {
                exc.printStackTrace();
            }
        }
    }
}
