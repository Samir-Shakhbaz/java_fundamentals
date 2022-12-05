package labs_examples.lambdas.labs.lambdaHW.Exercise1;

import org.w3c.dom.ls.LSOutput;

public class DoubleToIntMain {

    public static void main(String[] args) {
        DoubleToIntFunction obj7 = (double x) -> (int) (x+1);
        int y = obj7.doubleToInt(999);
        System.out.println(y);
    }

}
