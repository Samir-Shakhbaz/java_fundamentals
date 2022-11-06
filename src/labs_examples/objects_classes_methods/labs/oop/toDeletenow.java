package labs_examples.objects_classes_methods.labs.oop;

public class toDeletenow {



        public static void main(String[] args)
        {
            Parent c = new Child();

          //1
            System.out.println(TttooDeeleete.helloName(" Bob"));

            //2
            TttooDeeleete obj = new TttooDeeleete();
            System.out.println(obj.makeAbba("c","d"));

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