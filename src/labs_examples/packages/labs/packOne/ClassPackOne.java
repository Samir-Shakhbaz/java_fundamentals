package labs_examples.packages.labs.packOne;

import labs_examples.packages.labs.packTwo.ClassPackTwo;

public class ClassPackOne {

    public static void methodOne (){

    }

    private static String string () {
        return "hello";
    }

  String string = ClassPackTwo.methodTwo();
//    String string2 = ClassPackTwo.goodbye(); CANNOT BE ACCESSED
}
