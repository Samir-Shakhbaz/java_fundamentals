package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Exercise_4_tester {

    public static void main(String[] args)
    {
        Parent4 c = new Child4();
        c.doSomething();
    }
}

class Parent4
{
    public void doSomething()
    {
        System.err.println("Parent called");
    }
}

class Child4 extends Parent4
{
    public void doSomething()
    {
        System.err.println("Child called");
    }
    }

