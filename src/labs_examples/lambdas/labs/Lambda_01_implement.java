package labs_examples.lambdas.labs;

import labs_examples.lambdas.labs.lambdaHW.Lamda_01;

public class Lambda_01_implement {
    public static void main(String[] args) {


        Lamda_01 obj = () -> System.out.println("rrr");
        obj.nothing();

        obj2.nothing();
    }

    static Lamda_01 obj2 = new Lamda_01() {
        @Override
        public void nothing() {

            System.out.println("anonymous"); ///// WHY DIDN'T PRINT THIS ORIGINALLY

        }
    };

}