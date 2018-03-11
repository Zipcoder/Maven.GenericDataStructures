package Pair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * In here you must make firstLast, which will return a pair of the first element in the array list and the last
 * element in the arraylist.
 * You must also make a min method that returns the smallest item in the array list
 * A max method that returns the largest item in the arraylist
 * And a minmax method that returns a pair containing the largest and smallest items from the array list
 */
public class Arrays {
    public static <E extends Comparable> Pair<E> firstLast(ArrayList<E> a) {
        return new Pair<E>(a.get(0), a.get(a.size() -1));
    }

    public static <E extends Comparable<? super E>> E min(ArrayList<? extends E> inputArr) {
        Collections.sort(inputArr);
        return inputArr.get(0);
    }

    public static <E extends Comparable <? super E>> E max(ArrayList<? extends E> inputArr) {
        Collections.sort(inputArr);
        Collections.reverse(inputArr);
        return inputArr.get(0);
    }

    public static <E extends  Comparable<? super E>> Pair<E> minMax(ArrayList<? extends E> input) {
        E min = Arrays.min(input);
        E max = Arrays.max(input);
        return new Pair<E>(min, max);
    }
}

