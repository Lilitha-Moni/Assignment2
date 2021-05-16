package az.ac.cput.students;

/*
 * Name :Lilitha Moni
 * Student Number: 219068429
 * File name : map.java
 */

public class map {

    private int age;

    public map() {
        this.age = 20;
    }

    public map(int age) {
        this.age = age;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Student Details {" + "Ages:" + age;
    }

}
