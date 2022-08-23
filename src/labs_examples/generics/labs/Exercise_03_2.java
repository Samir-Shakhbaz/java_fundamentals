package labs_examples.generics.labs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Exercise_03_2 {

    public static void main(String[] args) {
       List<String> t = new ArrayList<>();
       t.add("hello");
       t.add("pop");
       t.add("mom");
       t.add("madam");
       t.add("mister");
       int size = t.size();
        System.out.println(size);

        String[] x = t.toArray(new String[0]);
        System.out.println(x);
        System.out.println(Arrays.toString(x));
        checkPalindrome("dad");
    }

    public static <T> int countElemetns(Collection<T> t) {

        int count = 0;
        for (T i : t)
            ++count;
        return count;
    }

    public static boolean checkPalindrome(final String word) {

        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                System.out.println("false");
                return false;
            }
        }
        System.out.println("true");
        return true;
    }
}


