package labs_examples.objects_classes_methods.labs.objects.Airplanee;

public class DemoAirplane {
    public static void main(String[] args) {

        Plane plane = new Plane("Boeing", 737, "white");
        MyEngine myEngine = new MyEngine("Turbojet", 30843, 5);
        VentSystem ventSystem = new VentSystem("Tornado", 'B', 3000);
        NumberOfSeats numberOfSeats = new NumberOfSeats(300, 50, 250);
        FlightNumber flightNumber = new FlightNumber(123, 'D', true);
        Airplane myAirplane = new Airplane(plane, myEngine, ventSystem, numberOfSeats, flightNumber);

        System.out.println("My project has a " + myAirplane.getPlane().getName() + "-" + myAirplane.getPlane().getModel() + " plane with a seating capacity of " + myAirplane.getNumberOfSeats().getTotalNumSeats() + " passengers");

    }
}
