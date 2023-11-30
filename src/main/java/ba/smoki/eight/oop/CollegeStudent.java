package ba.smoki.eight.oop;

import ba.smoki.eight.oop.inheritance.Student;

public class CollegeStudent extends Student {
    private String collegeName;

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
}
