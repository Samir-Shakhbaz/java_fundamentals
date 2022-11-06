package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Exercise_5_tester {

    public static void main(String[] args)
    {
        Parent c = new Child();
    }
}

class Parent
{
    public Parent()
    {
        System.err.println("Parent called");
    }
}

class Child extends Parent
{
    public Child()
    {
        System.err.println("Child called");
    }

}
