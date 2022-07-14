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

        // Ryan Note: do you want to populated the deck every time you deal a card?
        // I think you only need to populate the deck once per game.

        populateDeck();

        Random rand = new Random();
        int cardIndex = rand.nextInt(cards.length);
        // Ryan Note: are you checking to see if this cardIndex has already been used?
        Card cardDrawn = cards[cardIndex];
        // Ryan Note: here you're adding a card to the players hand that may have already been used
        player.getHand().getCards().add(cardDrawn);

        // Ryan Note: not sure what's going on here with the for loop
        for (int i = 0; i <= cards.length; i++) {
            if (i == cardIndex) {

            }
        }

        // Ryan Note: do you need to create a new cards ArrayList here?
        ArrayList<Card> cards = new ArrayList<>();
        // Ryan Note: you already added the card to the players hand above on line 40
        // not sure what the following line is about
        cards.add(cardDrawn);

        // Ryan Note: do you want to create a fresh ArrayList of usedCards each time a card is dealt?
        // Seems to me this should be an instance variable that does not get overwritten every time
        // a card is drawn
        ArrayList<Integer> usedCards = new ArrayList<>();
        // Ryan Note: not sure what the line below is about
        usedCards.add(null);

        // Ryan Note: you have the right idea here, but it's too late, you've already added the card to the
        // players hand above. I would also not recommend using recursion here. Instead, up above when you're
        // finding random numbers to deal a card, check if that number is in the usedCards list, if it is, find
        // a new random number, check if that new number is in the usedCards list again, if it is, find a new
        // random number and so on - until you find a random number that is NOT in the usedCards list. Then, and
        // only then, put the card at that index in the player's hand.
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

    // Ryan Note: This is a nice method but you're not using it
    private boolean ifCardUsed(int value) {
        if(usedCards.contains(value)){
            return true;
        } else {
            return false;
        }
    }
    public Deck() {
    }

    // Ryan Note: I don't think you actually want to use this constructor as you do not have the cards array
    // available and populated when creating a deck.
    public Deck(Card[] cards, ArrayList<Integer> usedCards) {
        this.cards = cards;
        this.usedCards = usedCards;
    }

    // Ryan Note: do you need this method?
    public Card[] getCards() {
        return cards;
    }

    // Ryan Note: do you need this method?
    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    // Ryan Note: do you need this method?
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







