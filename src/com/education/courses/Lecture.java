package com.education.courses;

public class Lecture {
    private String lectureName;
    private Homework homework;
    private AdditionalMaterials additionalMaterials;
    private int ID;

    public static int counter = 0;
    public int courseID;

    public Lecture(String lectureName, Homework homework, AdditionalMaterials additionalMaterials, int ID) {
        this.lectureName = lectureName;
        this.homework = homework;
        this.additionalMaterials = additionalMaterials;
        this.ID = ++counter;
    }

    public Lecture() {
        this.ID = ++counter;
    }

    public Lecture(String lectureName, int courseID) {
        this.lectureName = lectureName;
        this.courseID = ++counter;
    }

    @Override
    public String toString() {
        return "Lecture{" +
                "lectureName='" + lectureName + '\'' +
                ", courseID=" + courseID +
                '}';
    }
}

