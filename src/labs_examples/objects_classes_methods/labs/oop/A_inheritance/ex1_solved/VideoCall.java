package labs_examples.objects_classes_methods.labs.oop.A_inheritance.ex1_solved;

public class VideoCall extends CommunicationDevice {
    String monitor;

    public VideoCall(){
        super();
        monitor = "";
    }

    public VideoCall(String name, String type, String mnt){
        super(name, type);
        monitor = mnt;

    }

}
