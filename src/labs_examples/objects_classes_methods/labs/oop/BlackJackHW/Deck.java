package labs_examples.objects_classes_methods.labs.oop.BlackJackHW;

import java.util.*;

public class Deck {

    Card[] cards = new Card[52];
    ArrayList<Integer> usedCards;
    char[] suit = {'♠', '♦', '♥', '♣'};
    int[] cardValue = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

    public void populateDeck() {

        int counter = 0;

        for (int i = 0; i < suit.length; i++) {

            for (int a = 0; a < cardValue.length; a++) {
                char theSuit = suit[i];
                int theCardValue = cardValue[a];
                cards[counter] = new Card(theSuit, theCardValue);
                counter++;

            }
        }
    }

    public void dealCard(Player player) {

        populateDeck();

        Random rand = new Random();
        int cardIndex = rand.nextInt(cards.length);
        Card cardDrawn = cards[cardIndex];
        player.getHand().getCards().add(cardDrawn);
        for (int i = 0; i <= cards.length; i++) {
            if (i == cardIndex) {

            }
        }


        ArrayList<Card> cards = new ArrayList<>();
        cards.add(cardDrawn);


        ArrayList<Integer> usedCards = new ArrayList<>();
        usedCards.add(null);


        if (usedCards.contains(cardIndex)) {
            dealCard(new Player());
        } else {
            usedCards.add(cardIndex);


        }

    }

//    public void playNewGame(Player player, Player computerAI){
//        usedCards.clear();
//        player.getHand().getCards().clear();
//        computerAI.getHand().getCards().clear();
//        dealCard();
//    }

    private boolean ifCardUsed(int value) {
        if(usedCards.contains(value)){
            return true;
        } else {
            return false;
        }
    }
    public Deck() {
    }

    public Deck(Card[] cards, ArrayList<Integer> usedCards) {
        this.cards = cards;
        this.usedCards = usedCards;
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    public ArrayList<Integer> getUsedCards() {
        return usedCards;
    }

    public void setUsedCards(ArrayList<Integer> usedCards) {
        this.usedCards = usedCards;
    }


    @Override
    public String toString() {
        return "Deck{" +
                "cards=" + Arrays.toString(cards) +
                ", usedCards=" + usedCards +
                ", suit=" + Arrays.toString(suit) +
                ", cardValue=" + Arrays.toString(cardValue) +
                '}';
    }
}







