package labs_examples.input_output.labs.Exercise_03_done;

import java.io.*;

public class Exercise_03_DataIOStream {

    public static void main(String[] args) {

        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream("C:/Users/John/Documents/CodingNomads/java_fundamentals/src/labs_examples/input_output/labs/Exercise_04_candidates/candidates.csv");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        DataInputStream dataInputStream = new DataInputStream(inputStream);

        try {
            int i = inputStream.available();
            byte [] array = new byte [i];
            dataInputStream.read(array);

            for (byte myByte : array) {
                char x = (char) myByte;
                System.out.print(x);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
