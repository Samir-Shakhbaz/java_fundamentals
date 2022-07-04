package labs_examples.objects_classes_methods.labs.oop.oopHW.oopSports;

public class Players extends Nhl {

    String namePlayer;
    double height;
    int weight;




    public Players(String gameName, String season, int budget, String teamName, String homeTown, int place2022, String namePlayer, double height, int weight) {
        super(gameName, season, budget, teamName, homeTown, place2022);
        this.namePlayer = namePlayer;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return namePlayer;
    }

    public void setName(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Players{" +
                "name='" + namePlayer + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public void timePlayed(){

        System.out.println("Players spend a lot of time on ice");

    }


}
