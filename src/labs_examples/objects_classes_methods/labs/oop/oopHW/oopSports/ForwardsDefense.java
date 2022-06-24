package labs_examples.objects_classes_methods.labs.oop.oopHW.oopSports;

public class ForwardsDefense extends Players {
    int goalsScored;
    int assists;
    double timeOnIce;
    double penaltyTime;

    public int getGoalsScored() {
        return goalsScored;
    }

    public ForwardsDefense(String gameName, String season, int budget, String teamName, String homeTown, int place2022, String namePlayer, double height, int weight) {
        super(namePlayer, height, weight);
        this.goalsScored = goalsScored;
        this.assists = assists;
        this.timeOnIce = timeOnIce;
        this.penaltyTime = penaltyTime;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public double getTimeOnIce() {
        return timeOnIce;
    }

    public void setTimeOnIce(double timeOnIce) {
        this.timeOnIce = timeOnIce;
    }

    public double getPenaltyTime() {
        return penaltyTime;
    }

    public void setPenaltyTime(double penaltyTime) {
        this.penaltyTime = penaltyTime;
    }

    }
