package io.bryantcason;

import java.util.Arrays;

/**
 * Created by bryantcason on 5/25/16.
 */
public class MyArrayList<T> {

    private Object[] theArray;
    private int counter = 0;

    public MyArrayList(){
        theArray = new Object[]{};
    }

    public MyArrayList(int theArraySize){
        theArray = new Object[theArraySize];
    }

    public boolean add(T element){
        Object[] newArray;
        if(theArray.length == 0){
            newArray = new Object[1];
            newArray[0] = element;
        }else{
            newArray = new Object[theArray.length+1];
            for(int i = 0; i < theArray.length; i++){
                newArray[i] = theArray[i];
            }
            newArray[newArray.length - 1] = element;
        }
        theArray = newArray;
        return true;
    }

    public void add(int index, T element){

    }

    public T get(int index) throws IndexOutOfBoundsException{
        return (T) theArray[index];
    }

    public T set(int index, T element){
        theArray[index] = element;
        return element;
    }

    public void remove(int index) {

    }

    public void clear(){

    }

    public boolean isEmpty(){
        for(int i = 0; i < theArray.length; i++) {
            if (theArray.length == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean contains(){
        return false;
    }
}
