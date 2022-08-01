package labs_examples.input_output.labs.Exercise_03_done;

import java.io.*;

public class Exercise_03_BufferedCStream {

    public static void main(String[] args) {

        BufferedReader inputStream = null;
         BufferedWriter outPutStream = null;

        try {
            inputStream = new BufferedReader(new FileReader("C:/Users/John/Documents/CodingNomads/java_fundamentals/src/labs_examples/input_output/labs/Exercise_04_candidates/candidates.csv"));
            outPutStream = new BufferedWriter(new FileWriter("C:/Users/John/Documents/CodingNomads/java_fundamentals/src/labs_examples/input_output/files/candidates2.csv"));
            String i;
            while ((i = inputStream.readLine()) != null){
                outPutStream.write(i);
                System.out.println(i);
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
