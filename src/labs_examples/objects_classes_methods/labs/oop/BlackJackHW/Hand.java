package labs_examples.objects_classes_methods.labs.oop.BlackJackHW;

import java.util.ArrayList;

public class Hand {


    ArrayList<Card> cards = new ArrayList<>();
    int handValue;


    public int handScore() {
        int currentScore = 0;
        for (Card c : cards) {
            currentScore += c.getScoreValue();
//            System.out.println("This is current score: " + currentScore);
        }
        return currentScore;
    }

    // Ryan Note: formatting in this method is funky
    public boolean bustedCheck() {

        if (handScore() > 21)
            {return true;
        }else
            {return false;
        }
    }



    public Hand() {
    }

    public Hand(int handValue) {
        this.cards = cards;
        this.handValue = handValue;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    // Ryan Note: do you need this method?
    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }


    @Override
    public String toString() {
        return "Hand{" +
                "cards=" + cards +
                ", handValue=" + handValue +
                '}';
    }

    // Ryan Note: do you need this method?
    public int getHandValue() {

        return handValue;
    }

    // Ryan Note: do you need this method?
    public void setHandValue(int handValue) {
        this.handValue = handValue;
    }

    // Ryan Note: you do not need this method. The Arraylist class has the add() method you want to use already
    public void add(Card cardDealt) {
            return;
    }
}
