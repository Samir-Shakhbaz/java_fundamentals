package labs_examples.objects_classes_methods.labs.objects.Airplanee;

public class NumberOfSeats {

    private int totalNumSeats;
    private int fistClass;
    private int economy;

    public int getTotalNumSeats() {
        return totalNumSeats;
    }

    public void setTotalNumSeats(int totalNumSeats) {
        this.totalNumSeats = totalNumSeats;
    }

    public int getFistClass() {
        return fistClass;
    }

    public void setFistClass(int fistClass) {
        this.fistClass = fistClass;
    }

    public int getEconomy() {
        return economy;
    }

    public void setEconomy(int economy) {
        this.economy = economy;
    }

    @Override
    public String toString() {
        return "NumberOfSeats{" +
                "totalNumSeats=" + totalNumSeats +
                ", fistClass=" + fistClass +
                ", economy=" + economy +
                '}';
    }

    public NumberOfSeats(int totalNumSeats, int fistClass, int economy) {
        this.totalNumSeats = totalNumSeats;
        this.fistClass = fistClass;
        this.economy = economy;



    }


}
