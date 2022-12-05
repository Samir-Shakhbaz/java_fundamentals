package labs_examples.lambdas.labs.lambdaHW.lambda_4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Example_7 {
    public static void main(String[] args) throws IOException {

        String dataFile = "C:/Users/John/Documents/CodingNomads/java_fundamentals/src/labs_examples/lambdas/labs/stream_text_lab.csv";

        Stream<String> stream2 = Files.lines(Paths.get(dataFile));

        stream2
                .map(x -> x.split(","))
                        .forEach(x -> System.out.print(x[1]));

                        stream2.close();


    }
}
