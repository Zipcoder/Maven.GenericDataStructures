package Pair;

import static javafx.scene.input.KeyCode.T;

/**
 * You need to store two values of type `E`, set them in a constructor, and have the following methods,
 * getFirst
 * getSecond
 * min -> returns the minimum of the pair
 * max -> returns the maximum of the pair
 */
public class Pair<E extends Comparable<E>> {
    private E first;
    private E second;
    public Pair(E first,E second){
        this.first = first;
        this.second = second;
    }

    public E getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }
    public  E min(){

        int result = getFirst().compareTo(getSecond());
        if(result>0)
            return getSecond();
        else
            return getFirst();
    }
    public E max(){
        int result = getFirst().compareTo(getSecond());
        if(result<0)
            return getSecond();
        else
            return getFirst();
    }
}
