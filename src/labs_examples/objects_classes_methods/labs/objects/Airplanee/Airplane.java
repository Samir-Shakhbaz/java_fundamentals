package labs_examples.objects_classes_methods.labs.objects.Airplanee;

public class Airplane {

        double fuelCapacity;
        double currentFuelLevel;

        Plane plane;
        MyEngine myEngine;
        VentSystem vent;
        NumberOfSeats numberOfSeats;
        FlightNumber flightNumber;

        public Plane getPlane() {
                return plane;
        }

        public void setPlane(Plane plane) {
                this.plane = plane;
        }

        public MyEngine getMyEngine() {
                return myEngine;
        }

        public void setMyEngine(MyEngine myEngine) {
                this.myEngine = myEngine;
        }

        public VentSystem getVent() {
                return vent;
        }

        public void setVent(VentSystem vent) {
                this.vent = vent;
        }

        public NumberOfSeats getNumberOfSeats() {
                return numberOfSeats;
        }

        public void setNumberOfSeats(NumberOfSeats numberOfSeats) {
                this.numberOfSeats = numberOfSeats;
        }

        public FlightNumber getFlightNumber() {
                return flightNumber;
        }

        public void setFlightNumber(FlightNumber flightNumber) {
                this.flightNumber = flightNumber;
        }

        @Override
        public String toString() {
                return "Airplane{" +
                        "plane=" + plane +
                        ", myEngine=" + myEngine +
                        ", vent=" + vent +
                        ", numberOfSeats=" + numberOfSeats +
                        ", flightNumber=" + flightNumber +
                        '}';
        }

        public Airplane(Plane plane, MyEngine myEngine, VentSystem vent, NumberOfSeats numberOfSeats, FlightNumber flightNumber) {
                this.plane = plane;
                this.myEngine = myEngine;
                this.vent = vent;
                this.numberOfSeats = numberOfSeats;
                this.flightNumber = flightNumber;



        }
}


