package labs_examples.objects_classes_methods.labs.methods.hwmethods;

//Create a new class called MethodTraining.java and in this class please do the following:

public class MethodTraining_Ex1_2_overloading_and_byValue {


    //1) Demonstrate method overloading in this class

    public static void main(String[] args) {


        float a = 36.11f;
        float b = 11.1f;
        int sum = ((int) (a / b));
        divide(a, b);

        System.out.println(sum);
        byValue(a, b);
    }

    //    1) Demonstrate method overloading in this class

    public static int divide(int a, int b) {
        return a / b;


    }

    public static int divide(int a, int b, int c) {
        return a / b / c;

    }

    public static double divide(double a, double b) {
        return ((int) (a / b));
    }

    public static float divide(float a, float b) {
        return ((int) a / b);

    }

//            2) Demonstrate the difference between "pass by value" and "pass by reference"


    public static void byValue(float a, float b) { //CAN IT BE INT HERE?
        a = a + 2;
        b = b + 4;
        System.out.println(a);
        System.out.println(b);
    }
}