package labs_examples.lambdas.labs.lambdaHW.Exercise1;

public class Exercise_01_01_main {

    //2) lambda

        public static void main(String[] args) {

            Exercise_01 obj1 = () -> {
                System.out.println("Hello");
            };
            obj1.abstractMethod();

            //anonymous inner class
            Exercise_01 obj = new Exercise_01() {
                @Override
                public void abstractMethod() {
                    System.out.println("Hello from inner class");
                }
            }; obj.abstractMethod();
        }

    }

