package labs_examples.objects_classes_methods.labs.oop.gamecounter;

import java.util.Scanner;

public class GameCounter {
    public static void main(String[] args) {


        int numberOfGames = 0;
        Scanner gameCount = new Scanner(System.in);
        String letsCount = gameCount.next();
        if (letsCount.equalsIgnoreCase("y")) {
            numberOfGames += 1;

            System.out.println("Number of games = " + numberOfGames);

        }
    }
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
//private static void countGamesPlayed(){
//    int numberOfGames = 0;
//    Scanner gameCount = new Scanner(System.in);
//    String letsCount = gameCount.next();
//    if (letsCount.equalsIgnoreCase("y")) {
//        numberOfGames += 1;
//
//        System.out.println("Number of games = " + numberOfGames);
//    }
//}
