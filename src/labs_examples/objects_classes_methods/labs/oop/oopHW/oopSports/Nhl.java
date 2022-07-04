package labs_examples.objects_classes_methods.labs.oop.oopHW.oopSports;

public class Nhl extends Ex_1_Sports {

    String teamName;
    String homeTown;
    int place2022;

    public Nhl(String gameName, String season, int budget, String teamName, String homeTown, int place2022) {
        super(gameName, season, budget);
        this.teamName = teamName;
        this.homeTown = homeTown;
        this.place2022 = place2022;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public int getPlace2022() {
        return place2022;
    }

    public void setPlace2022(int place2022) {
        this.place2022 = place2022;
    }

    @Override
    public void promoSports() {
        System.out.println("We promote hockey");

    }

}


