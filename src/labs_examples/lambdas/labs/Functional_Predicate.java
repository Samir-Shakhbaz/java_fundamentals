package labs_examples.lambdas.labs;

import java.util.function.*;

public class Functional_Predicate {

    public static void main(String[] args) {

        myPredicate();
        myFunction();
        myBiFunction();
        mySupplier();
        myUnaryOperator();

    }

    public static void myPredicate() {
        Predicate<String> string = s -> (s.length() < 4);

        System.out.println(string.test("hello again"));
    }

    public static void myFunction() {
        Function<Double, Double> num5 = (x) -> x * 5;
        System.out.println(num5.apply(17.3));
    }

    public static void myBiFunction(){
        BiFunction<Double, Long, String> funDL = (x, b) -> String.valueOf(x * b);
        System.out.println("This should return a String " + funDL.apply(23.34, 45873573057L));
    }

    public static void mySupplier(){

        Supplier<String> winner = () -> "Joe Biden";
        System.out.println("And the winner is " + winner.get());

    }

    public static void myUnaryOperator(){

        UnaryOperator<Double> uno = y -> y / 3;
        System.out.println("UnaryOperator result is " + uno.apply(15.47));

    }

}
