package labs_examples.generics.labs;

import java.sql.SQLOutput;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */

class MyGenerics <T, V> {

    private T obj1;

    V obj2;

    public MyGenerics(T obj1, V obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public T getObj1() {
        return obj1;
    }

    public void setObj1(T obj1) {
        this.obj1 = obj1;
    }

    public V getObj2() {
        return obj2;
    }

    public void setObj2(V obj2) {
        this.obj2 = obj2;
    }
}

public class Exercise_01 {

    public static void main(String[] args) {

        MyGenerics <String, Double> myGenerics = new MyGenerics<String, Double>("Generics", 123.45);

        System.out.println(myGenerics.getObj1());
        System.out.println(myGenerics.getObj2());
        System.out.println(myGenerics.getObj1().getClass().getName());
        System.out.println(myGenerics.obj2.getClass().getName());

        MyGenerics<Integer, Character> myGenerics1 = new MyGenerics<>(767, 'B');
        System.out.println(myGenerics1.getObj1());

        MyGenerics<Long, Float> myGenerics2 = new MyGenerics<>(29347024l, 456.3543254f);
        System.out.println("The exercise is about " + myGenerics.getObj1() + " and how you can manipulate data with it. Here's Obj2 form Generics1 |" + myGenerics1.getObj2() + "| and these are Obj1 and Obj2 from myGenerics2 " + myGenerics2.getObj1() + ", " + myGenerics2.obj2 );



    }

}