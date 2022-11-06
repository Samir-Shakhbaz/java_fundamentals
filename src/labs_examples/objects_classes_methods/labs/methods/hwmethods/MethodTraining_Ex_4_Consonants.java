package labs_examples.objects_classes_methods.labs.methods.hwMethods;

public class MethodTraining_Ex_4_Consonants {
    public static void main(String[] args) {



    int count = 0;

    String cons = "To be or not to be that is the question...";

     for(int i = 0; i < cons.length(); i++) {
            char ch = cons.charAt(i);
            if(cons.charAt(i) == 'a' || cons.charAt(i) == 'e' || cons.charAt(i) == 'i' || cons.charAt(i) == 'o' || cons.charAt(i) == 'u') {
            count++;
        }
      else if(cons.charAt(i) >= 'a' && cons.charAt(i)<='z') {
                System.out.print(' ');
            } else if(ch != ' '){
                count++;
            }
    }
        System.out.println("Number of consonants in 'To be or not to be...' is: " + count);
}
}

