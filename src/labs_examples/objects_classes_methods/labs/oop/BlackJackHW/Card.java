package labs_examples.objects_classes_methods.labs.oop.BlackJackHW;

public class Card {

    char suit;
    int cardValue;

    public Card() {
    }

    public String customToString(){
        String value = String.valueOf(cardValue);
        return suit + value + suit;
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

    public String print() {
        String faceValue;
        if (cardValue == 1) {
            faceValue = "ACE";
        } else if (cardValue == 11) {
            faceValue = "JACK";
        } else if (cardValue == 12) {
            faceValue = "QUEEN";
        } else if (cardValue == 13) {
            faceValue = "KING";
        } else {
            faceValue = String.valueOf(cardValue);
        }
        return faceValue + suit;
    }
}
