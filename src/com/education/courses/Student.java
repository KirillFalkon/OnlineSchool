package com.education.courses;

public class Student {
    private String firstName;
    private String secondName;
    private int ID;

    public static int counter = 0;

    public Student(String firstName, String secondName, int ID) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.ID = ++counter;
    }
}
