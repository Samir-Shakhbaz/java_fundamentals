package labs_examples.lambdas.labs.lambdaHW.lambda_4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

import static java.lang.Integer.sum;

 /*8) Demonstrate how to Stream the stream_text_lab.csv file in this package. Split the lines into String arrays,
                then print out the sum of all elements at index 2.*/

public class Example_8 {

    public static void main(String[] args) throws IOException {

        String dataFile = "C:/Users/John/Documents/CodingNomads/java_fundamentals/src/labs_examples/lambdas/labs/stream_text_lab.csv";

        Stream<String> stream3 = Files.lines(Paths.get(dataFile));

//        int i = 0;
//       int sum = stream3
//                .map(x -> x.split(","));
//                .forEach(x -> x[2]);

        stream3.close();

    }

}
