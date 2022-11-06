package labs_examples.objects_classes_methods.labs.oop.oopHW;

import labs_examples.objects_classes_methods.labs.oop.BlackJackHW.Deck;
import labs_examples.objects_classes_methods.labs.oop.BlackJackHW.Player;

import java.util.Scanner;

public class UsefulMethods {

    public void opening() {
        Scanner scanner = new Scanner(System.in);
        String letsPlay = scanner.next();

    }

}


/*TRIED TO AVOID NULL EXCEPTION THAT I'M GETTING BY INITIALIZING THE ARRAY*/
//        ArrayList<Integer> usedCards = new ArrayList<>();
//        usedCards.add(null);

    /*SAME WITH HAND ARRAY - NULL EXCEPTION*/
//    ArrayList<Hand> hand = new ArrayList<>();
//            hand.add(null);

//        for (int x = 0; x <= usedCards.size(); x++) {
//                if (usedCards.contains(cardIndex)) {
//                dealCard();
//                } else {
//                Player player = new Player();
//                player.getHand().add(cardDrawn);
//                System.out.println(player.getHand());


////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
//public void dealCard() {
//    /*GETTING A RANDOM CARD*/
//    populateDeck();
//
//    Random rand = new Random(); //instance of random class
//    int cardIndex = rand.nextInt(cards.length);
//    Card cardDrawn = cards[cardIndex];
//    name.getHand().add(cardDrawn);
//    for (int i = 0; i <= cards.length; i++) {
//        if (i == cardIndex) {
//            System.out.println("");
//            System.out.println("\nThis is a random index: " + "--- " + cardIndex + " ---");
//        }
//    }
//    System.out.println("\nAnd this is the card: " + "--- " + cardDrawn + " ---");
//
//    ArrayList<Card> cards = new ArrayList<>();
//    cards.add(cardDrawn);
//    System.out.println("\nWas the card added to the hand: " + "--- " + cards.contains(cardDrawn) + " ---");
//
//    ArrayList<Integer> usedCards = new ArrayList<>();
//    usedCards.add(null);
//    System.out.println("\nHas the card drawn been used in this round? " + "--- " + usedCards.contains(cardIndex) + " ---");
//    System.out.println("\nMaking sure that the cardIndex is the same as random card drawn: " + "--- " + cardIndex + " ---");
//
//    if (usedCards.contains(cardIndex)) {
//        dealCard();
//    } else {
//        usedCards.add(cardIndex);
//        System.out.println("\nWas the card added to the usedCards deck? " + "--- " + usedCards.contains(cardIndex) + " ---");
//
//    }
//

//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
//
//        System.out.println(" O  O ");
//        System.out.println("   L");
//        System.out.println(" -----");
//
//        System.out.println("  ||||");
//        System.out.println("<   o  |");
//        System.out.println("   ----");
//        System.out.println("  |   |");
//        System.out.println("  |   |");
//        System.out.println(" ``` ```");
//        System.out.println("РОБОТ-ИНДЕЙКА");
//
//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

//package labs_examples.objects_classes_methods.labs.oop.BlackJackHW;
//
//        import java.sql.SQLOutput;
//        import java.util.Random;
//        import java.util.Scanner;
//
//public class BlackJackController {
//    public static void main(String[] args) {
//
////        System.out.println("Hi! Would you like to play BlackJack? If 'yes', please, press 'Y', if 'no', please, press 'N'.");
////
////        BlackJackController myOpening = new BlackJackController();
////        myOpening.opening();
////
////        System.out.println("\nMy name is Javva the Hutt. What's your name?");
////
////        BlackJackController whatName = new BlackJackController();
////        whatName.name();
////
//
//
//
////        Deck myDeck = new Deck();
////                myDeck.populateDeck();
////
////        Player myPlayer = new Player();
////
//        Deck myDeal = new Deck();
//        Player myPlayer = new Player();
//        Player computerAI = new Player();
//        myDeal.dealCard(myPlayer);
//        myDeal.dealCard(computerAI);
//        myDeal.dealCard(myPlayer);
//        myDeal.dealCard(computerAI);
//
//        //PLAYER HIT
//        System.out.println("Would you like another card?");
//        Scanner scanner = new Scanner(System.in);
//        String anotherCard = scanner.next();
//        if(anotherCard.equalsIgnoreCase("y")) {
//            System.out.println("Yes");
//            myDeal.dealCard(myPlayer);
//        }else if (anotherCard.equalsIgnoreCase("n")){
//            System.out.println("No");
//            System.out.println(myPlayer.getHand().getCards());
//        }
//
//        //COMPUTER HIT
//        System.out.println("Would you like another card?");
//        Player player = new Player();
//        player.ComputerAI();
//
//    }
//
////        Card testCard = new Card('♠', 10);
////        System.out.println(testCard);
////        Deck myDeck = new Deck();
////        Player player = new Player();
////                myDeck.dealCard(player);
//
//}
//    public void opening() {
//        Scanner scanner = new Scanner(System.in);
//        String letsPlay = scanner.next();
//
//        if(letsPlay.equalsIgnoreCase("y")){
//            System.out.println("Great choice, stranger, let's play! Has anybody ever told you that the House never wins?");
//        } else {
//            System.out.println("Sorry, to see you go. Watch out of for that door on your way out!");
//        }
//    }
//    public void name(){
//        Scanner scanner = new Scanner(System.in);
//        String aName = scanner.nextLine();
//        Player player = new Player();
//        System.out.println("\nAh, what a pretty name! Nice to meet you, " + aName + ", let's talk business: how much are you willing to bet?");
//        System.out.println("Right now you still have $" + player.getPotValue() + ".");
//    }
//
//}
//public class Deck {
//
//    Card[] cards = new Card[52];
//    ArrayList<Integer> usedCards;
//    char[] suit = {'♠', '♦', '♥', '♣'};
//    int[] cardValue = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
//
//    public void populateDeck() {
//
//        int counter = 0; //counter of an array [52]; i and a - 4 and 1
//
//        for (int i = 0; i < suit.length; i++) {
//
//            for (int a = 0; a < cardValue.length; a++) {
//                char theSuit = suit[i];
//                int theCardValue = cardValue[a];
//                cards[counter] = new Card(theSuit, theCardValue);
//                counter++;
//
//            }
//        }
//    }
//
//    public void dealCard(Player player) {
//
//        populateDeck();
//
//        Random rand = new Random();
//        int cardIndex = rand.nextInt(cards.length);
//        Card cardDrawn = cards[cardIndex];
//        player.getHand().getCards().add(cardDrawn);
//        for (int i = 0; i <= cards.length; i++) {
//            if (i == cardIndex) {
////                System.out.println("");
////                System.out.println(cardIndex);
////                System.out.println("Player's hand is: " + player.getHand());
//            }
//        }
////        System.out.println(cardDrawn);
//
//        ArrayList<Card> cards = new ArrayList<>();
//        cards.add(cardDrawn);
////        System.out.println(cards.contains(cardDrawn));
//
//        ArrayList<Integer> usedCards = new ArrayList<>();
//        usedCards.add(null);
////        System.out.println(usedCards.contains(cardIndex));
////        System.out.println(cardIndex);
//
//        if (usedCards.contains(cardIndex)) {
//            dealCard(new Player());
//        } else {
//            usedCards.add(cardIndex);
////            System.out.println(usedCards.contains(cardIndex));
//
//        }
//
//
//
//    }
//
//    private boolean ifCardUsed(int value) {
//        if(usedCards.contains(value)){
//            return true;
//        } else {
//            return false;
//        }
//    }
//    public Deck() {
//    }
//
//    public Deck(Card[] cards, ArrayList<Integer> usedCards) {
//        this.cards = cards;
//        this.usedCards = usedCards;
//    }
//
//    public Card[] getCards() {
//        return cards;
//    }
//
//    public void setCards(Card[] cards) {
//        this.cards = cards;
//    }
//
//    public ArrayList<Integer> getUsedCards() {
//        return usedCards;
//    }
//
//    public void setUsedCards(ArrayList<Integer> usedCards) {
//        this.usedCards = usedCards;
//    }
//
//
//    @Override
//    public String toString() {
//        return "Deck{" +
//                "cards=" + Arrays.toString(cards) +
//                ", usedCards=" + usedCards +
//                ", suit=" + Arrays.toString(suit) +
//                ", cardValue=" + Arrays.toString(cardValue) +
//                '}';
//    }
//
//
//
//}
/*TRIED TO CREATE A METHOD (RYAN DOES THAT A LOT IN HIS VIDEO TUTORIAL) BUT IT DOESN'T SEE cardDelt (it's in red);
    private void rmCardFromDeck() {
        List<Card> newCards = Arrays.asList(cards);
        newCards.remove(cardDealt);

    }

    private void dealAgain(Player player) {
        Random rand = new Random(cards.length); //instance of random class
        int cardDealt = rand.nextInt();
    }*/

//        System.out.println(cards[index]);
//        int card = cards( (rand.nextInt(cards.length)))

//        int upperbound = cards.length;
//
//        int int_random = rand.nextInt(upperbound);
//        int_random += 1;
//        System.out.println(cards[int_random].suit);
//
//          Card[] playerCard = new Card[];
//     player.getHand().add(cardDealt);

//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

//    public void experimentalCrap(){
//        Player player = new Player();
//        Player computerAI = new Player();
//        if(player.getHand().handScore() > computerAI.getHand().handScore()){
//            player.potValue = player.potValue + player.bet;
//        }else if (player.getHand().handScore() < computerAI.getHand().handScore()){
//            player.potValue = player.potValue - player.bet;
//        }
//    }
//
//
//            System.out.println("You have: " + player.getHand().handScore());

//                    Hand hand = new Hand();
//                    hand.experimentalCrap();
//                    System.out.println("your pot value is: " + player.getPotValue());
//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
//BLACKJACK CHECK CODE
//package labs_examples.objects_classes_methods.labs.oop.BlackJackHW;
//
//        import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
//        import org.w3c.dom.ls.LSOutput;
//
//        import java.sql.SQLOutput;
//        import java.util.Random;
//        import java.util.Scanner;
//
//public class BlackJackController {
//
//    public static void main(String[] args) {
//
//        Deck deck = new Deck();
//        Player player = new Player();
//        Player computerAI = new Player();
//
//        boolean continuePlaying = true;
//
//        System.out.println("Hi! Would you like to play BlackJack? If 'yes', please, press 'Y', if 'no', please, press 'N'.");
//
//        labs_examples.objects_classes_methods.labs.oop.BlackJackHW.BlackJackController welcomeNewPlayer = new labs_examples.objects_classes_methods.labs.oop.BlackJackHW.BlackJackController();
//        welcomeNewPlayer.opening();
//
//        System.out.println("\nWhat's your name?");
//
//        labs_examples.objects_classes_methods.labs.oop.BlackJackHW.BlackJackController controller = new labs_examples.objects_classes_methods.labs.oop.BlackJackHW.BlackJackController();
////        String name = controller.getPlayerName();
//        player.setName(controller.getPlayerName());
//        while(continuePlaying) {
//
//
//
//            System.out.println("Right now you still have $" + player.getPotValue() + ".");
//
//            player.placeBet();

//            deck.usedCards.clear();
//            player.hand.cards.clear();
//            computerAI.hand.cards.clear();
//
//            deck.dealCard(player);
//            deck.dealCard(computerAI);
//            deck.dealCard(player);
//            deck.dealCard(computerAI);
//
//            boolean x = checkForBlackJack(player, computerAI);
//            if(x = true){
//                System.out.println("You have: " + player.getHand().handScore());
//                determineWinner(player, computerAI);
//                System.out.println("Would you like to play again?");
//                Scanner scanner = new Scanner(System.in);
//                String letsPlay = scanner.next();
//                if(letsPlay.equalsIgnoreCase("y")){
//                    continuePlaying = true;
//                } else {
//                    continuePlaying = false;
//                }
//            } else {
//
//                System.out.println("Your hand is: ");
//                player.getHand().print();
//                System.out.println("\nYour score is: " + player.getHand().handScore());
//
//
//                player.dealAdditionalCards(deck, true);
//            checkForBlackJack(player, computerAI);
//                computerAI.dealAdditionalCards(deck, false);
//
//
//                System.out.println("You have: " + player.getHand().handScore());
//                determineWinner(player, computerAI);
//                System.out.println("Would you like to play again?");
//                Scanner scanner = new Scanner(System.in);
//                String letsPlay = scanner.next();
//                if (letsPlay.equalsIgnoreCase("y")) {
//                    continuePlaying = true;
//                } else {
//                    continuePlaying = false;
//                }
//            }
//        }
////        System.out.println("Good bye!");continuePlaying
//    }
//
//    private static boolean checkForBlackJack(Player player, Player computerAI) {
//        return determineWinner(player, computerAI);
//
//    }
//
//
//    private static boolean determineWinner(Player player, Player computerAI) {
//        boolean humanWin = false;
//
//        if (player.getHand().handScore() > 21) {
//            System.out.println("Sorry, you busted! Game is over");
//        } else if (player.getHand().handScore() == 21) {
//            System.out.println("Congratulations! You've got BlackJack!");
//            System.out.println("Computer's score is: " + computerAI.getHand().handScore());
//            humanWin = true;
//        } else if (player.getHand().handScore() == computerAI.getHand().handScore()) {
//            System.out.println("We are tied. YOu lose ");
//        } else  if (computerAI.getHand().handScore() > 21) {
//            System.out.println("It looks like you win, Computer busted!");
//            humanWin = true;
//        } else if (computerAI.getHand().handScore() > player.getHand().handScore()){
//            System.out.println("YOu LOse!");
//        } else {
//            System.out.println( " you win");
//            humanWin  = true;
//        }
//        player.adjustPot(humanWin);
//        return humanWin;
//    }
//
//
//    public int opening() {
//        Scanner scanner = new Scanner(System.in);
//        String letsPlay = scanner.next();
//
//        if(letsPlay.equalsIgnoreCase("y")){
//            System.out.println("Great choice, stranger, let's play! Has anybody ever told you that the House never wins?");
//        } else {
//            System.out.println("Sorry, to see you go. Watch out for that door on your way out!");
//        }
//        return 0;
//    }
//    public String getPlayerName(){
//        Scanner scanner = new Scanner(System.in);
//        String aName = scanner.nextLine();
//        Player player = new Player();
//        System.out.println("\nNice to meet you, " + aName + ".");
//        return aName;
//
//
//    }


//
//        public void gameCounter(){
//            int numberOfGames;
//            Scanner gameCount = new Scanner(System.in);
//            String letsCount = gameCount.next();
//            if(letsCount.equalsIgnoreCase("y")){
//                numberOfGames += 1;
//                Deck deck = new Deck();
//                deck.dealCard(new Player());
//        }
//
//
//
//    public void keepScore(Player player, Player computerAI) {
//
//    }
//
//
//}
//\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
//LATEST WORKING CODE

//package labs_examples.objects_classes_methods.labs.oop.BlackJackHW;
//
//        import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
//        import org.w3c.dom.ls.LSOutput;
//
//        import java.sql.SQLOutput;
//        import java.util.Random;
//        import java.util.Scanner;
//
//public class BlackJackController {
//    public static void main(String[] args) {
//
//        Deck deck = new Deck();
//        Player player = new Player();
//        Player computerAI = new Player();
//
//        boolean continuePlaying = true;
//
//        System.out.println("Hi! Would you like to play BlackJack? If 'yes', please, press 'Y', if 'no', please, press 'N'.");
//
//        labs_examples.objects_classes_methods.labs.oop.BlackJackHW.BlackJackController welcomeNewPlayer = new labs_examples.objects_classes_methods.labs.oop.BlackJackHW.BlackJackController();
//        welcomeNewPlayer.opening();
//
//        System.out.println("\nWhat's your name?");
//
//        labs_examples.objects_classes_methods.labs.oop.BlackJackHW.BlackJackController controller = new labs_examples.objects_classes_methods.labs.oop.BlackJackHW.BlackJackController();
////      String name = controller.getPlayerName();
//        player.setName(controller.getPlayerName());
//        while(continuePlaying) {
//
//
//            System.out.println("Right now you still have $" + player.getPotValue() + ".");
//
//            player.placeBet();
//
//            deck.usedCards.clear();
//            player.hand.cards.clear();
//            computerAI.hand.cards.clear();
//
//            deck.dealCard(player);
//            deck.dealCard(computerAI);
//            deck.dealCard(player);
//            deck.dealCard(computerAI);
//
////            checkForBlackJack(player, computerAI);
//
//            System.out.println("Your hand is: ");
//            player.getHand().print();
//            System.out.println("\nYour score is: " + player.getHand().handScore());
//
//
//            player.dealAdditionalCards(deck, true);
////            checkForBlackJack(player, computerAI);
//            computerAI.dealAdditionalCards(deck, false);
//
//
//            System.out.println("You have: " + player.getHand().handScore());
//            determineWinner(player, computerAI);
//            System.out.println("Would you like to play again?");
//            Scanner scanner = new Scanner(System.in);
//            String letsPlay = scanner.next();
//            if(letsPlay.equalsIgnoreCase("y")){
//                continuePlaying = true;
//            } else {
//                continuePlaying = false;
//            }
//        }
////        System.out.println("Good bye!");continuePlaying
//    }
//
////    private static void checkForBlackJack(Player player, Player computerAI) {
////        if(player.getHand().handScore() == 21){
////            determineWinner(player, computerAI);
////
////        }
////    }
//
//    private static void determineWinner(Player player, Player computerAI) {
//        boolean humanWin = false;
//
//        if (player.getHand().handScore() > 21) {
//            System.out.println("Sorry, you busted! Game is over");
//        } else if (player.getHand().handScore() == 21) {
//            System.out.println("Congratulations! You've got BlackJack!");
//            System.out.println("Computer's score is: " + computerAI.getHand().handScore());
//            humanWin = true;
//        } else if (player.getHand().handScore() == computerAI.getHand().handScore()) {
//            System.out.println("We are tied. YOu lose ");
//        } else  if (computerAI.getHand().handScore() > 21) {
//            System.out.println("It looks like you win, Computer busted!");
//            humanWin = true;
//        } else if (computerAI.getHand().handScore() > player.getHand().handScore()){
//            System.out.println("YOu LOse!");
//        } else {
//            System.out.println( " you win");
//            humanWin  = true;
//        }
//        player.adjustPot(humanWin);
//
//    }
//
//
//    public int opening() {
//        Scanner scanner = new Scanner(System.in);
//        String letsPlay = scanner.next();
//
//        if(letsPlay.equalsIgnoreCase("y")){
//            System.out.println("Great choice, stranger, let's play! Has anybody ever told you that the House never wins?");
//        } else {
//            System.out.println("Sorry, to see you go. Watch out for that door on your way out!");
//        }
//        return 0;
//    }
//    public String getPlayerName(){
//        Scanner scanner = new Scanner(System.in);
//        String aName = scanner.nextLine();
//        Player player = new Player();
//        System.out.println("\nNice to meet you, " + aName + ".");
//        return aName;
//
//
//    }
//
//
////
////        public void gameCounter(){
////            int numberOfGames;
////            Scanner gameCount = new Scanner(System.in);
////            String letsCount = gameCount.next();
////            if(letsCount.equalsIgnoreCase("y")){
////                numberOfGames += 1;
////                Deck deck = new Deck();
////                deck.dealCard(new Player());
////        }
//
//
//
//    public void keepScore(Player player, Player computerAI) {
//
//    }
//
//
//}
