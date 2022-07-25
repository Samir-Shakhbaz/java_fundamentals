package labs_examples.objects_classes_methods.labs.oop.BlackJackHW;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class BlackJackController {
    public static void main(String[] args) {

        Deck deck = new Deck();
        Player player = new Player();
        Player computerAI = new Player();

        boolean continuePlaying = true;

        System.out.println("Hi! Would you like to play BlackJack? If 'yes', please, press 'Y', if 'no', please, press 'N'.");

        BlackJackController welcomeNewPlayer = new BlackJackController();
        welcomeNewPlayer.opening();

        System.out.println("\nWhat's your name?");

        BlackJackController controller = new BlackJackController();
        String name = controller.getPlayerName();
        player.setName(name);

        while(continuePlaying) {
            deck.countGames();

            player.placeBet();

            deck.usedCards.clear();
            player.hand.cards.clear();
            computerAI.hand.cards.clear();

            deck.dealCard(player);
            deck.dealCard(computerAI);
            deck.dealCard(player);
            deck.dealCard(computerAI);

            System.out.println("Your hand is: ");
            player.getHand().print();
            System.out.println("\nYour score is: " + player.getHand().handScore());

            player.dealAdditionalCards(deck, true);
            computerAI.dealAdditionalCards(deck, false);

            System.out.println("You have: " + player.getHand().handScore());
            player.countWins(player, computerAI, deck);
            System.out.println("Would you like to play again?");
            Scanner scanner = new Scanner(System.in);
            String letsPlay = scanner.next();
            if(letsPlay.equalsIgnoreCase("y")){
                continuePlaying = true;
            } else {
                continuePlaying = false;
            }
        }
    }

    public static boolean determineWinner(Player player, Player computerAI) {
        boolean humanWin = false;

        if (player.getHand().handScore() > 21) {
            System.out.println("Sorry, you busted! Game over");
        } else if (player.getHand().handScore() == 21) {
            System.out.println("Congratulations! You've got BlackJack!");
            System.out.println("Computer's score is: " + computerAI.getHand().handScore());
            humanWin = true;
        } else if (player.getHand().handScore() == computerAI.getHand().handScore()) {
            System.out.println("We are tied. You lose ");
        } else  if (computerAI.getHand().handScore() > 21) {
            System.out.println("It looks like you win, Computer busted!");
            humanWin = true;
        } else if (computerAI.getHand().handScore() > player.getHand().handScore()){
            System.out.println("You lose!");
        } else {
            System.out.println( "You win!");
            humanWin  = true;
        }
        player.adjustPot(humanWin);
        return humanWin;
    }

    public int opening() {
        Scanner scanner = new Scanner(System.in);
        String letsPlay = scanner.next();

        if (letsPlay.equalsIgnoreCase("y")) {
            System.out.println("Great choice, stranger, let's play! Has anybody ever told you that the House never wins?");
        } else {
            System.out.println("Sorry, to see you go. Watch out for that door on your way out!");
        }
        return 0;
    }

    public String getPlayerName() {
        Scanner scanner = new Scanner(System.in);
        String aName = scanner.nextLine();
        Player player = new Player();
        System.out.println("\nNice to meet you, " + aName + ".");
        return aName;

    }
}
