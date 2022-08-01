package labs_examples.input_output.labs.Exercise_03_done;

import java.io.*;

public class Exercise_03_BufferedBStream {

    public static void main(String[] args) {

       BufferedInputStream inputStream = null;
       BufferedOutputStream outPutStream = null;

        try {
            inputStream = new BufferedInputStream(new FileInputStream("C:/Users/John/Documents/CodingNomads/java_fundamentals/src/labs_examples/input_output/labs/Exercise_04_candidates/candidates.csv"));
            outPutStream = new BufferedOutputStream(new FileOutputStream("C:/Users/John/Documents/CodingNomads/java_fundamentals/src/labs_examples/input_output/files/candidates2.csv"));
            byte [] buffer = new byte [3];
            int i;
            while ((i = inputStream.read(buffer)) != -1) {
                outPutStream.write(i);
                System.out.print(new String(buffer, 0, i));
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
