package labs_examples.input_output.labs.Exercise_02_done;

import java.io.FileReader;

public class Exercise_02_a {
    public static void main(String[] args) {

        String filePath = "C:/Users/John/Documents/CodingNomads/java_fundamentals/src/labs_examples/input_output/files/char_data.txt";
        try {

            charByChar(filePath);
        }
        catch (Exception exc) {
            System.out.println("An Exception happened");
        }
        }


    public static void charByChar (String filePath) throws Exception{



        FileReader fileReader = new FileReader(filePath);

        int i;

            while ((i = fileReader.read()) != -1)
        System.out.print((char)i);
       }



    }

