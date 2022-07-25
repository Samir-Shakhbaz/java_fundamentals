package labs_examples.packages.labs.package_new2;

import labs_examples.packages.labs.new_package1.New_Class_1;

import java.lang.reflect.Array;

public class New_Class_2 {
    public static void main(String[] args) {
        protectedMethod();

//        New_Class_1.gillette();

    }

    private static int method(){
        int [] array = {23, 232, 34};
        return 0;
    }

    protected static void protectedMethod(){
        int x;
        int z;


        for(x = 0; x < 10; x++){
            for(z = 0; z < 5; z++){
                System.out.print(z);}
        System.out.println(x);
        }


    }
}

