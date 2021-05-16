package az.ac.cput.students;

/*
 * Name :Lilitha Moni
 * Student Number: 219068429
 * File name : collection.java
 */

public class collection {

    private String studentName;

    public collection() {
        this.studentName = "Lilitha";
    }

    public collection(String name) {
        this.studentName = name;

    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String name) {
        this.studentName = name;
    }


    @Override
    public String toString() {
        return "Student Details {" + "Names :" + studentName;
    }

}
