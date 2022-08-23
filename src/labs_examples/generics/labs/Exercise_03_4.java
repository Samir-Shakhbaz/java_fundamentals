package labs_examples.generics.labs;

import java.util.List;

public class Exercise_03_4 {

    public static void main(String[] args) {

    }

    public static <T extends Comparable> T maximalElement (List<T> list, int from, int to) {
        T max = list.get(from);
        for (int i = from + 1; i < to; i++) {
            T elem1 = list.get(i);
            if (elem1.compareTo(max) > 0) {
                max = elem1;
            }
        }
        return max;
    }

    //ANSWER NUMBER TWO
    public static <T extends Object & Comparable<? super T>> T max(List<? extends T> list, int begin, int end) {

        T maxElem = list.get(begin);

        for (++begin; begin < end; ++begin) {
            if (maxElem.compareTo(list.get(begin)) < 0) maxElem = list.get(begin);
        }
        return maxElem;
    }

}
