package labs_examples.static_nonstatic.staticHW;

public class StaticClassA {
    public static void main(String[] args) {

//        StaticClassB obj3 = new StaticClassB();
//        obj3.anotherB(); ***********CANNOT CALL PRIVATE METHOD FROM A DIFFERENT CALSS*************
        //*****

        StaticClassB myMethodB = new StaticClassB();
        myMethodB.justBecause();

        StaticClassB obj = new StaticClassB();
        int x = obj.multiply(13, 15);

        System.out.println(x);

        StaticClassA obj2 = new StaticClassA();
        obj2.nonStaticA();

    }

        public static void staticA () {
            System.out.println("that is the question");

            StaticClassB obj = new StaticClassB();
            obj.nonStaticB();


            staticAb();

        }


        public void nonStaticA () {
            System.out.println("We have nothing to fear");

            StaticClassB obj = new StaticClassB();
            obj.nonStaticB();

        }

        public static void staticAb () {
            System.out.println("static to static in the same class should be easy");

        }


    }

