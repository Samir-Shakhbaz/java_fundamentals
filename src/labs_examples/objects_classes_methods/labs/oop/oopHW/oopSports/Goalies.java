package labs_examples.objects_classes_methods.labs.oop.oopHW.oopSports;

public class Goalies extends Players {

    int goalsAllowed;
    double rating;



    //    public Goalies(String teamName, String homeTown, int place2022) {
//        super(teamName, homeTown, place2022);
//    }
    public Goalies(String gameName, String season, int budget, String teamName, String homeTown, int place2022, String namePlayer, double height, int weight, int goalsAllowed, double rating) {
        super(gameName, season, budget, teamName, homeTown, place2022, namePlayer, height, weight);

    }

    public int getGoalsAllowed() {
        return goalsAllowed;
    }

    public void setGoalsAllowed(int goalsAllowed) {
        this.goalsAllowed = goalsAllowed;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public void timePlayed(){
        System.out.println("But goalies spend all the time on ice");
    }

}


