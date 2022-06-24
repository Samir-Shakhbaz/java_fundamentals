package labs_examples.objects_classes_methods.labs.oop.oopHW.oopSports;

public class Ex_1_Sports {
    protected String gameName;
    protected String season;
    protected int budget;

    public Ex_1_Sports(String gameName, String season, int budget) {
        this.gameName = gameName;
        this.season = season;
        this.budget = budget;

    }


    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Ex_1_Sports{" +
                "gameName='" + gameName + '\'' +
                ", season='" + season + '\'' +
                ", budget=" + budget +
                '}';
    }
}
