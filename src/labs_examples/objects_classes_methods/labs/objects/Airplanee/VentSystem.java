package labs_examples.objects_classes_methods.labs.objects.Airplanee;

public class VentSystem {

    private String name;
    private char series;
    private double power;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSeries() {
        return series;
    }

    public void setSeries(char series) {
        this.series = series;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "VentSystem{" +
                "name='" + name + '\'' +
                ", series=" + series +
                ", power=" + power +
                '}';
    }

    public VentSystem(String name, char series, double power) {
        this.name = name;
        this.series = series;
        this.power = power;



    }
}
