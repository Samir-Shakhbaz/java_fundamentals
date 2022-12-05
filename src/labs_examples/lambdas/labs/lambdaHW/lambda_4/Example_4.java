package labs_examples.lambdas.labs.lambdaHW.lambda_4;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Example_4 {

    public static void main(String[] args) {
        IntStream.range(1, 20)
                .filter(x -> x > 10)
                .average()
                .ifPresent(System.out::println);



    }

}
