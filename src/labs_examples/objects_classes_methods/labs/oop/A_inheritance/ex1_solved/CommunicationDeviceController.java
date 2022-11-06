package labs_examples.objects_classes_methods.labs.oop.A_inheritance.ex1_solved;

public class CommunicationDeviceController {
    public static void main(String[] args) {

        CommunicationDevice communicationDevice = new CommunicationDevice();
        communicationDevice.buyPhone();

        Phone phone = new Phone();
        phone.buyPhone();

        Cell cell = new Cell();
        cell.buyPhone();
    }
}
