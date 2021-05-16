package ac.za.cput.students;

/*
 * Name :Lilitha Moni
 * Student Number: 219068429
 * File name : testList.java
 */

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;
import java.util.*;


public class testList {

        //an empty array
        List<String> surname = new LinkedList<String>();

        @Test
        void testAdd() {

            //elements in the array
            surname.add("Moni");
            surname.add("Mzuzwane");
            surname.add("Ngcombo");

            //ouput of the array
            System.out.println("All student surnames available in the array: " + surname);
            assertEquals(3, surname.size());
        }

        @Test
        void testRemove() {

            //elements in the array
            surname.add("Moni");
            surname.add("Mzuzwane");
            surname.add("Ngcombo");

            //element removed from the array
            surname.remove("Mzuzwane");
            System.out.println("Student surname Mzuzwane was removed from the array: " + surname);
            assertEquals(2,surname.size() );
        }

        @Test
        void testFind() {
            //elements in the array
            surname.add("Moni");
            surname.add("Mzuzwane");
            surname.add("Ngcombo");

            //element to find the array
            surname.get(0);
            System.out.println("Student Surname Moni is found on the array: " + surname);
            assertEquals(3,surname.size() );
        }

}
