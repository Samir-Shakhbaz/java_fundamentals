package labs_examples.objects_classes_methods.labs.oop.BlackJackHW;

import java.util.Scanner;

public class Player {


    String name;
    Hand hand = new Hand();



    int potValue = 1000; //(the


    // Ryan Note: formatting is wonky
    public boolean computerAI() {

            hand.handScore();
         if (hand.handScore() <= 16) {
           return true;
         } else {
           return false;
        }
    }


    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hand=" + hand +
                ", potValue=" + potValue +
                '}';
    }

    public Player(String name, Hand hand, int potValue) {
        this.name = name;
        this.hand = hand;
        this.potValue = potValue;

    }

    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public int getPotValue() {
        return potValue;
    }

    public void setPotValue(int potValue) {
        this.potValue = potValue;
    }


}







