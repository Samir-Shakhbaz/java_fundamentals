package labs_examples.objects_classes_methods.labs.oop.A_inheritance.ex1_solved;

public class Cell extends Phone{

    String wireless;

    public Cell(){
        super();
        wireless = "";
    }

    public Cell(String name, String type, boolean mb, String wr){
        super(name, type, mb);
        wireless = wr;
    }

    @Override
    public void buyPhone(){
        System.out.println("This is a state-of-the-art cell phone");
    }

}
