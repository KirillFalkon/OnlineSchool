package com.education.courses;

public class Homework extends University {
    private String homework;
    private int ID;

    public static int counter = 0;


    public Homework(String homework, int ID) {
        this.ID = ++counter;
        this.homework = homework;
    }
}
