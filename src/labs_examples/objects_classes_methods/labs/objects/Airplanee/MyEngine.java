package labs_examples.objects_classes_methods.labs.objects.Airplanee;

public class MyEngine {

    private String name;
    private int power;
    private int year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", year=" + year +
                '}';
    }

    public MyEngine(String name, int power, int year) {
        this.name = name;
        this.power = power;
        this.year = year;



    }

}
