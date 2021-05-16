package ac.za.cput.students;

/*
 * Name :Lilitha Moni
 * Student Number: 219068429
 * File name : testSet.java
 */

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import java.util.*;

public class testSet {
    //an empty array
    Set<String> studentSet = new HashSet<String>(3);

    @Test
    void testAdd() {

        //adding elements in an array
        studentSet.add("Application development");
        studentSet.add("MultiMedia");
        studentSet.add("Communication networks");

        System.out.println("All the available courses in the array: " + studentSet);
        assertEquals(3, studentSet.size());
    }

    @Test
    void testRemove() {
        //adding elements in an array
        studentSet.add("Application development");
        studentSet.add("MultiMedia");
        studentSet.add("Communication networks");

        //element removed from the array
        studentSet.remove("MultiMedia");
        System.out.println("MultiMedia is removed from the array: " + studentSet);
        assertEquals(2,studentSet.size() );
    }

    @Test
    void testFind() {
        //adding elements in an array
        studentSet.add("Application development");
        studentSet.add("MultiMedia");
        studentSet.add("Communication networks");

        //element to find in the array
        studentSet.contains("Communication networks");
        System.out.println("Communication networks is found in the array: " + studentSet);
        assertEquals(3,studentSet.size() );
    }

}
