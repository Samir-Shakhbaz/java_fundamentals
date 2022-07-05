package labs_examples.static_nonstatic.staticHW;

public class StaticClassB {

        public static void staticB(){
            System.out.println("To be or not to be");

            StaticClassB obj5 = new StaticClassB();
            obj5.anotherB();
            obj5.justBecause();}



        public void nonStaticB(){
            System.out.println("Non-static test");

//            StaticClassA obj3 = new StaticClassA();
//            obj3.nonStaticA();

    }

        public int multiply(int a, int b){
            return a * b;

        }

        protected void justBecause(){

            System.out.println("This is a protected method from class B");
        }

        private void anotherB(){
            justBecause();
            System.out.println("This is a private method from class B");
        }

}
