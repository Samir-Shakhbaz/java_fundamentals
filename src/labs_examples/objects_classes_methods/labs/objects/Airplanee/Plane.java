package labs_examples.objects_classes_methods.labs.objects.Airplanee;

public class Plane {

    private String name;
    private int model;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = Integer.parseInt(model);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public Plane(String name, int model, String color) {
        this.name = name;
        this.model = Integer.parseInt(String.valueOf(model));
        this.color = color;




    }
}
