package com.education.courses;

public class Teacher {
    private String firstName;
    private String secondName;
    private int ID;

    public static int counter = 0;

    public Teacher(String firstName, String secondName, int ID) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.ID = ++counter;

    }
}
