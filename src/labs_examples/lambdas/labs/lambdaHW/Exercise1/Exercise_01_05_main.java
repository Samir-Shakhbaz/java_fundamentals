package labs_examples.lambdas.labs.lambdaHW.Exercise1;

public class Exercise_01_05_main {

    public static void main(String[] args) {

        Exercise_01_05 obj5 = (double a, double b) -> a * b;
        double c = obj5.twoParams(33.0, 3.0);
        System.out.println(c);

        Exercise_01_05 obj6 = new Exercise_01_05() {
            @Override
            public double twoParams(double a, double b) {
                return a/b;
            }
        }; double d = obj6.twoParams(999, 111);
        System.out.println(d);



    }

}
