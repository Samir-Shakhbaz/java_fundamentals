package labs_examples.lambdas.labs.lambdaHW;

public class LambdaDemo {

    public static void main(String[] args) {

//        Class_D.myNewMethod("");

        Class_D obj = Class_D_minor::referenceMethod;
        obj.greet();
    }

}
