package labs_examples.lambdas.labs.lambdaHW.lambda_4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Example_6 {
    public static void main(String[] args) throws IOException {

        String bandsFile = "C:/Users/John/Documents/CodingNomads/java_fundamentals/src/labs_examples/input_output/files/char_data_copy.txt";
        Stream<String> bands = Files.lines(Paths.get(bandsFile));

        bands
                .forEach(System.out::println);

    }
}
