package ac.za.cput.students;

/*
 * Name :Lilitha Moni
 * Student Number: 219068429
 * File name : testCollection.java
 */

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import java.util.*;

public class testCollection {
    // empty array list
    Collection<String> arrlist = new ArrayList<String>(5);


    @Test
    void testAdd() {

        // add method
        arrlist.add("Zizipho");
        arrlist.add("Amahle");
        arrlist.add("Buhle");

        // print elememts in array
        for (String studentNames : arrlist) {
            System.out.println("All available student names in the array " + studentNames);
        }
        assertEquals(3,arrlist.size());
    }

    @Test
    void testRemove() {

        //elememts in an array
        arrlist.add("Zizipho");
        arrlist.add("Amahle");
        arrlist.add("Buhle");


        // remove elements from array
        arrlist.remove("Amahle");

        // printing the new list
        for (String removeName : arrlist){
            System.out.println("Student name Amahle was removed from the array: " + removeName);
        }
        assertEquals(2, arrlist.size());
    }

    @Test
    void testFind() {

        //elememts in an array
        arrlist.add("Zizipho");
        arrlist.add("Amahle");
        arrlist.add("Buhle");
        arrlist.add("Lilitha");


        //find elements from list
        arrlist.contains("Lilitha");

        //print the new list
        for (String foundName : arrlist){
            System.out.println("Student name Lilitha is available on the array : " + foundName);
        }
        assertEquals(4, arrlist.size());
    }
}





