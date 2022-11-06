package labs_examples.objects_classes_methods.labs.methods.hwMethods;

import java.util.Scanner;

public class MethodTraining_Ex_5_Prime {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int a = 0;
        int b = 1;
        int num = number.nextInt();
        while (b <= num) {

                if ((num % b) == 0)
                    a = a + 1;
                    b++;
            }
            if (a == 2)
                System.out.println(num + " is a prime number");
            else
                System.out.println(num + " is not a prime number");



    }
}