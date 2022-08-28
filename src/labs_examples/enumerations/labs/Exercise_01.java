package labs_examples.enumerations.labs;

import labs_examples.objects_classes_methods.labs.oop.BlackJackHW.Card;

/**
 * Enumerations Exercise 1:
 *
 *      1) Create an enumeration. Use a controller class to demonstrate the use of the enum from a seperate class.
 *      2) Create a parameterized enumeration that passes one or more values to it's constructor. Demonstrate the use
 *      of this enum from a seperate class.
 */

public class Exercise_01 {
    Card card;

    public Exercise_01(Card card){
        this.card = card;

    }

    public static void main(String[] args) {
        EnumCard c = EnumCard.DIAMONDS;
        System.out.println(c);

    }

}

