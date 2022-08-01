package labs_examples.input_output.labs;

import java.io.*;


/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

class Example {
    public static void main(String[] args) {

        FileInputStream inputStream = null;
        BufferedInputStream bufferedInputStream = null;
        FileOutputStream outputStream = null;
        BufferedOutputStream bufferedOutputStream = null;

        String fileReadPath = "C:/Users/John/Documents/CodingNomads/java_fundamentals/src/labs_examples/input_output/files/char_data.txt";
        String fileWritePath = "C:/Users/John/Documents/CodingNomads/java_fundamentals/src/labs_examples/input_output/files/char_data_myCopy_23.txt";
        try {
            inputStream = new FileInputStream(fileReadPath);
            bufferedInputStream = new BufferedInputStream(inputStream);
            outputStream = new FileOutputStream(fileWritePath);
            bufferedOutputStream = new BufferedOutputStream(outputStream);

            byte [] buffer = new byte[5];
            int bytesRead;
            while((bytesRead = bufferedInputStream.read(buffer)) != -1) {
                  bufferedOutputStream.write(bytesRead);
                  System.out.println(new String(buffer, 0, bytesRead));
              }
        } catch (IOException | NullPointerException exc) {
            exc.printStackTrace();
        }
            finally {
                try {
                inputStream.close();
                bufferedInputStream.close();
                bufferedOutputStream.close();
                outputStream.close();

            }    catch (IOException | NullPointerException exc) {
                 exc.printStackTrace();
            }
        }
    }
}

