package labs_examples.input_output.labs.Exercise_03_done;

import java.io.*;

public class Exercise_03_CharacterStream {

    public static void main(String[] args) {
        FileReader inputStream = null;
        FileWriter outPutStream = null;

        try {
            inputStream = new FileReader("C:/Users/John/Documents/CodingNomads/java_fundamentals/src/labs_examples/input_output/labs/Exercise_04_candidates/candidates.csv");
            outPutStream = new FileWriter("C:/Users/John/Documents/CodingNomads/java_fundamentals/src/labs_examples/input_output/files/candidates2.csv");
            int i;
            while ((i = inputStream.read()) != -1 ){
                outPutStream.write(i);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } if (outPutStream != null) {
                try {
                    outPutStream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
