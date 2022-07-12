package labs_examples.objects_classes_methods.labs.oop.BlackJackHW;

public class Card {

    char suit;
    int cardValue;

    public Card() {

    }

    public int getScoreValue(){
        if (cardValue == 1) {
            return 1;
        } else if (cardValue == 11) {
            return 10;
        } else if (cardValue == 12) {
            return 10;
        } else if (cardValue == 13) {
            return 10;
        } else {
            return cardValue;
        }
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", cardValue=" + cardValue +
                '}';
    }



    public Card(char suit, int cardValue) {
        this.suit = suit;
        this.cardValue = cardValue;
    }

    public char getSuit() {
        return suit;
    }

    public void setSuit(char suit) {
        this.suit = suit;
    }

    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }
}
