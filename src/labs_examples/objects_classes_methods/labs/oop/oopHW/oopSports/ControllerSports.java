package labs_examples.objects_classes_methods.labs.oop.oopHW.oopSports;

public class ControllerSports {

    public static void main(String[] args) {
        Ex_1_Sports sports = new Ex_1_Sports("sport", "time of the year", 1000);
        Nhl nhl = new Nhl("Hockey", "winter", 1000, "Penguins","Pittsburgh", 10);

        sports.promoSports();
        nhl.promoSports();

        Players player = new Players("Hockey", "winter", 1000, "Penguins","Pittsburgh", 10, "Lemieux",6.02, 200);
        Players goalie = new Goalies("Hockey", "winter", 1000, "Penguins","Pittsburgh", 10, "Lemieux",6.02, 200, 15, 0.945);

        player.timePlayed();
        goalie.timePlayed();

        ForwardsDefense forward = new ForwardsDefense("Hockey", "winter", 1000, "Penguins","Pittsburgh", 10, "Lemieux",6.02, 200, 15, 23, 25, 33);
        forward.timePlayed();


    }

}
