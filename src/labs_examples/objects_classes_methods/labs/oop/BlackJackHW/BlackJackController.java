package labs_examples.objects_classes_methods.labs.oop.BlackJackHW;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class BlackJackController {
    public static void main(String[] args) {

        System.out.println("Hi! Would you like to play BlackJack? If 'yes', please, press 'Y', if 'no', please, press 'N'.");

        BlackJackController myOpening = new BlackJackController();
        myOpening.opening();

        System.out.println("\nMy name is Javva the Hutt. What's your name?");

        BlackJackController whatName = new BlackJackController();
        whatName.name();


        Deck myDeal = new Deck();
        Player myPlayer = new Player();
        Player computerAI = new Player();
        myDeal.dealCard(myPlayer);
        myDeal.dealCard(computerAI);
        myDeal.dealCard(myPlayer);
        myDeal.dealCard(computerAI);

        System.out.println("You have: " + myPlayer.getHand().handScore());


        do {
            System.out.println("Would you like another card?");
            //PLAYER HIT

            Scanner scanner = new Scanner(System.in);
            String anotherCard = scanner.next();
            if (anotherCard.equalsIgnoreCase("y")) {
                System.out.println("Yes");
                myDeal.dealCard(myPlayer);
                System.out.println("You have: " + myPlayer.getHand().handScore());
            } else if (anotherCard.equalsIgnoreCase("n")) {
                System.out.println("You stay");
                break;
            }
        } while (myPlayer.getHand().handScore() <= 20);
        System.out.println("You have: " + myPlayer.getHand().handScore());



        if (myPlayer.getHand().handScore() > 21) {
            System.out.println("Sorry, you busted! Game is over");
        }
        if (myPlayer.getHand().handScore() == 21) {
            System.out.println("Congratulations! You've got BlackJack!");
        }



        System.out.println("Computer's score is: " + computerAI.getHand().handScore());


        while (computerAI.getHand().handScore() <= 16) {
            System.out.println("Computer takes another card");
            myDeal.dealCard(computerAI);
            System.out.println(computerAI.getHand().handScore());
        }

        if (computerAI.getHand().handScore() >= 17 && computerAI.getHand().handScore() <= 20) {
            System.out.println("I stay: " + computerAI.getHand().handScore());
        }
        if (computerAI.getHand().handScore() == 21) {
            System.out.println("Looks like I've got BlackJack! You lose! I'm invincible!");
        }
        if (computerAI.getHand().handScore() > 21) {
                System.out.println("It looks like you win, Computer busted!");
            }
        }



    public int opening() {
        Scanner scanner = new Scanner(System.in);
        String letsPlay = scanner.next();

        if(letsPlay.equalsIgnoreCase("y")){
            System.out.println("Great choice, stranger, let's play! Has anybody ever told you that the House never wins?");
            } else {
            System.out.println("Sorry, to see you go. Watch out for that door on your way out!");
        }
        return 0;
    }
    public void name(){
        Scanner scanner = new Scanner(System.in);
        String aName = scanner.nextLine();
        Player player = new Player();
        System.out.println("\nNice to meet you, " + aName + ", let's talk business: how much are you willing to bet?");
        System.out.println("GETTING BETS IS STILL WORK IN PROGRESS");
        System.out.println("Right now you still have $" + player.getPotValue() + ".");
    }

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

//    public void offerNewGame(){
//        System.out.println("Would you like to play another game?");
//        gameCounter();
//        deck.playNewGame();
//
//    }

}

// Ryan Note: this formatting needs to be fixed. This class should also contain the main() method that
// starts the game/application.

// Ryan Note: I would recommend building and testing the game piece by piece, step by step. At the moment,
// I don't see a main() method anywhere, or any testing that you're doing of basic functionality as you progress.
// For instance, in the main() method, you could be creating players, creating hands, dealing cards, checking scores,
// etc as you progress. At the moment, it appears as though you're trying to code the entire thing without testing
// it along the way. But I may be missing something, or just not seeing the main() method or the primary game loop.
