package labs_examples.objects_classes_methods.labs.oop.A_inheritance.ex1_solved;

public class LandLine extends Phone{

    String cable;

    public LandLine(){
        super ();
        cable = "";
    }

    public LandLine(String name, String type, boolean mb, String cb){
        super (name, type, mb);
        this.cable = cb;

    }

}
