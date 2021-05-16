package ac.za.cput.students;
/*
 * Name :Lilitha Moni
 * Student Number: 219068429
 * File name : testMap.java
 */

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import java.util.*;

public class testMap {

        //an empty array
        Map<Integer,String> age = new HashMap<Integer,String>();

        @Test
        void testAdd() {

            //adding elements in an array
            age.put(1254, "21");
            age.put(1487,"20");
            age.put(1265, "21");

            System.out.println("All available student age in the array: " + age.values());
            assertEquals(3, age.size());
        }

        @Test
        void testRemove() {
            //adding elements in an array
            age.put(1254, "21");
            age.put(1487,"20");
            age.put(1265, "21");

            //element removed from the array
            age.remove(1265);
            System.out.println("A second 21 years student age was removed from the array" + age.values());
            assertEquals(2,age.size() );
        }

        @Test
        void testFind() {
            //adding elements in an array
            age.put(1254, "21");
            age.put(1487,"20");
            age.put(1265, "21");

            //element to find in the array
            age.get("20");
            System.out.println("Student age 20 is found in the array: " + age.values());
            assertEquals(3,age.size() );
        }

    }


