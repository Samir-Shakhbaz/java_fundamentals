package labs_examples.exception_handling.labs;

import java.util.Objects;
import java.util.Scanner;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 *       */

public class Exercise_07 {
    public static void main(String[] args) {

        System.out.println("Please, enter your nickname: ");

        try {
            Exercise_07 banned = new Exercise_07();
            banned.inputWord();
        } catch (ForbiddenWordsException exc) {
            System.out.println("Sorry, you can't use that name");
        }
    }

    private void inputWord() throws ForbiddenWordsException {
        Scanner scanner = new Scanner(System.in);
        String forbiddenWord = scanner.nextLine();

        if (Objects.equals(forbiddenWord, "badWord")) {
            throw new ForbiddenWordsException();
        }
    }

    public class ForbiddenWordsException extends Exception {
        @Override
        public String toString() {
            return "ForbiddenWordsException{ Sorry, you can't use this name}";
        }
    }
}