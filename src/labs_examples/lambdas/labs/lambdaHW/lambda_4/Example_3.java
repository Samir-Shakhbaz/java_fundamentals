package labs_examples.lambdas.labs.lambdaHW.lambda_4;


import java.util.Arrays;

public class Example_3 {

    public static void main(String[] args) {

    int sum = Arrays.stream(new int[]{3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39})
        .map(x -> x/3)
            .sum();
        System.out.println(sum);



    }

}
