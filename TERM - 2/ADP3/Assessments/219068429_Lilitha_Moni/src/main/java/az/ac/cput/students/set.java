package az.ac.cput.students;

/*
 * Name :Lilitha Moni
 * Student Number: 219068429
 * File name : set.java
 */

public class set {

    private String course;

    public set() {
        this.course = "ICT in Application Developments";
    }

    public set(String course) {
        this.course = course;

    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }


    @Override
    public String toString() {
        return "Student Details {" + "Course enrolled for :" + course;
    }
}
