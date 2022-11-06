package labs_examples.objects_classes_methods.labs.oop.A_inheritance.ex1_solved;

public class Phone extends CommunicationDevice {

    boolean mobility;

    public Phone() {
        super();
        mobility = false;
    }
        public Phone (String name, String type, boolean mb){
        super (name, type);
        mobility = mb;
    }

    @Override
    public void buyPhone(){
        System.out.println("It's a phone!");
    }
}
