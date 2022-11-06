package labs_examples.objects_classes_methods.labs.oop.A_inheritance.ex1_solved;

public class CommunicationDevice {
    String name;
    String type;

    public void buyPhone(){
        System.out.println("You bought a communication device");
    }

    public CommunicationDevice(){
        name = "";
        type = "";
    }
    public CommunicationDevice(String name, String type){
        this.name = name;
        this.type = type;
    }

}
