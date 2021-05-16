package az.ac.cput.students;

/*
 * Name :Lilitha Moni
 * Student Number: 219068429
 * File name : list.java
 */

public class list {

    private String studentSurname;

    public list() {
        this.studentSurname = "Moni";
    }

    public list(String sName) {
        this.studentSurname = sName;

    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentSurname(String sName) {
        this.studentSurname = sName;
    }


    @Override
    public String toString() {
        return "Student Details {" + "Surnames :" + studentSurname;
    }

}
