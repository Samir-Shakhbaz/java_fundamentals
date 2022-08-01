package labs_examples.input_output.labs.Exercise_03_done;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class Exercise_03_SequenceStream {

    public static void main(String[] args) throws Exception{

        FileInputStream fileInputStream_1 = new FileInputStream("C:/Users/John/Documents/CodingNomads/java_fundamentals/src/labs_examples/input_output/labs/Exercise_04_candidates/candidates.csv");
        FileInputStream fileInputStream_2 = new FileInputStream("C:/Users/John/Documents/CodingNomads/java_fundamentals/src/labs_examples/input_output/files/char_data.txt");
        SequenceInputStream sequenceInputStream = new SequenceInputStream(fileInputStream_1, fileInputStream_2);
        int i;
        while((i = sequenceInputStream.read())!=-1){
            System.out.print((char)i);
        }
        sequenceInputStream.close();
        fileInputStream_1.close();
        fileInputStream_2.close();
    }
}

