package labs_examples.input_output.labs.Exercise_03_done;

import java.io.*;

/**
 * Input/Output Exercise 3: variety
 *
 *    1) Demonstrate the usage of at least two additional Byte Streams
 *    2) Demonstrate the usage of at least two additional Character Streams
 *    3) Demonstrate using a buffer on one of the Byte Streams and one of the Character Streams
 *    4) Demonstrate the use of the DataInputStream and DataOutputStream
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {


        String string = "ObjectOutputStream";


        try {
            FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/John/Documents/CodingNomads/java_fundamentals/src/labs_examples/input_output/files/object.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(string);

            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:/Users/John/Documents/CodingNomads/java_fundamentals/src/labs_examples/input_output/files/object.txt"));

            System.out.println((String) objectInputStream.readObject());
            System.out.println();

            fileOutputStream.close();
            objectOutputStream.close();
            objectInputStream.close();

        } catch (IOException exc) {
            System.out.println("Exception caught");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
