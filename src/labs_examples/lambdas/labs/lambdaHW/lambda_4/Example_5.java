package labs_examples.lambdas.labs.lambdaHW.lambda_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example_5 {
    public static void main(String[] args) {

        Integer [] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Stream<Integer> stream = Arrays.stream(nums);
        int sum = stream
                .filter(x -> x <= 3)
                .reduce(0, (Integer a, Integer b) -> a + b);
        System.out.println(sum);

    }
}
