package io.bryantcason;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayListSpec {

    MyArrayList<Object> myArrayList;

    @Before
    public void initialize(){

        myArrayList = new MyArrayList<>();
    }

    @Test
    public void addTest(){
        myArrayList.add("Cat");
        myArrayList.add("Dog");
        myArrayList.add("Lizard");
        Object expected = "Lizard";
        Object actual = myArrayList.get(2);
        assertEquals("Should add number to the end of the array", expected, actual);
    }

    @Test
    public void overloadingAddTest(){
        myArrayList.add(1, "Cat");
        myArrayList.add(0, "Lizard");
        Object expected = "Cat";
        Object actual = myArrayList.get(1);
        assertEquals("Should move cat to index 1", expected, actual);
    }

    @Test
    public void removeTest(){
        myArrayList.add("Cat");
        myArrayList.add("Dog");
        myArrayList.remove(1);
        assertNull(myArrayList.get(1));
    }

    @Test
    public void setTest(){
        myArrayList.add("Cat");
        myArrayList.add("Dog");
        myArrayList.set(1, "Lion");
        Object expected = "Lion";
        Object actual = myArrayList.get(1);
        assertEquals("Should replace Dog with Lion", expected, actual);
    }

    @Test
    public void clearTest(){
        myArrayList.add("Cat");
        myArrayList.add("Dog");
        myArrayList.clear();
        assertNull(myArrayList);
    }

    @Test
    public void isEmptyTest(){
        myArrayList.add("Cat");
        myArrayList.add("Dog");
        myArrayList.add("Lion");
        myArrayList.remove(2);
        myArrayList.remove(1);
        myArrayList.remove(0);
        Object expected = true;
        Object actual = myArrayList.isEmpty();
        assertEquals("ArrayList should be empty", expected, actual);
    }
}
