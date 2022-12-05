package labs_examples.lambdas.labs.lambdaHW;

import java.util.function.Function;

public class ConstructorReference {

    public static void main(String[] args) {

        Function <String, Class_F> f1 = Class_F::new;

        System.out.println(f1.apply("Moon").getName());

    }

}
