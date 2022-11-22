package com.education.courses;

public class Teacher extends University {
    private String firstName;
    private String secondName;
    private int ID;

    public static int counter = 0;

    public Teacher(String firstName, String secondName, int ID) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.ID = ID;

    }

    @Override
    public String toString() {
        return "Teacher{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", ID=" + ID +
                '}';
    }
}
