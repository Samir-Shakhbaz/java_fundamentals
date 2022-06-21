package labs_examples.objects_classes_methods.labs.objects.Airplanee;

public class FlightNumber {

    private int number;
    private char index;
    private boolean onTime;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public char getIndex() {
        return index;
    }

    public void setIndex(char index) {
        this.index = index;
    }

    public boolean isOnTime() {
        return onTime;
    }

    public void setOnTime(boolean onTime) {
        this.onTime = onTime;
    }

    @Override
    public String toString() {
        return "FlightNumber{" +
                "number=" + number +
                ", index=" + index +
                ", onTime=" + onTime +
                '}';
    }

    public FlightNumber(int number, char index, boolean onTime) {
        this.number = number;
        this.index = index;
        this.onTime = onTime;



    }
}
