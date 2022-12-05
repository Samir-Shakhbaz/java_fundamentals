package labs_examples.lambdas.labs.lambdaHW.Exercise1;

public class Anonymous_01_04 {

    public static void main(String[] args) {

        Exercise_01_3 obj4 = new Exercise_01_3(){
            @Override
            public int anotherAbstract(int a) {
                return a * 444;
            }

    };   int b = obj4.anotherAbstract(5);
        System.out.println(b);


    }


}
