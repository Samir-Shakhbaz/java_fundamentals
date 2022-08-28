package labs_examples.enumerations.labs;

public class Exercise_01_main {
    public static void main(String[] args) {

        for (EnumParam.EnumCard_2 c : EnumParam.EnumCard_2.values()){
            System.out.println("It is: " + c);
            if (c.getIndex() == 0 || c.getIndex() == 1 ) {
                System.out.println("RED");
            } else {
                System.out.println("BLACK");
            }


        }


    }
}
