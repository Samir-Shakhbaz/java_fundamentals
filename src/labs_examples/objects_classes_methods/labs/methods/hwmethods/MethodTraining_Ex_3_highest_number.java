package labs_examples.objects_classes_methods.labs.methods.hwmethods;

public class MethodTraining_Ex_3_highest_number {
    public static void main(String[] args) {

        int [] max = {56, 67, 78, 2};

        int highestNum = 0;

        for(int i = 0; i < max.length - 1; i++){

            if (max [i] < max [i + 1]){
                highestNum = max[i +1];
                System.out.println("The max i " + max [i]);
                System.out.println("The max i + 1: " + max[i +1]);
               }

        }
        System.out.println("Highest number is: " + highestNum);


    }

}
