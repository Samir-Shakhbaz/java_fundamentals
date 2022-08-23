package labs_examples.generics.labs;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 *      Numbers in the ArrayList. Demonstrate how to call this method from the main() method.
 */
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

class Demo {

    public static <T extends Number> double getSum (ArrayList<T> arrayList) {
        double sum = 0.0;
        for (int i = 0; i < arrayList.size(); i++) {
            sum += arrayList.get(i).doubleValue();
        }
        return sum;}


    public static void main(String[] args) {
        ArrayList<Double> myArrayList = new ArrayList<>();
        myArrayList.add(34.43);
        myArrayList.add(4.75);
        System.out.println(getSum(myArrayList));

        ArrayList<Integer> myArrayList1 = new ArrayList<>();
        myArrayList1.add(34);
        myArrayList1.add(4);
        System.out.println(getSum(myArrayList1));
    }
}







