package com.education.courses;

public class Lecture {
    private String lectureOne;
    private Homework homework;
    private AdditionalMaterials additionalMaterials;
    private int ID;

    public static int counter = 0;
    public int courseID;

    public Lecture(String lectureOne, Homework homework, AdditionalMaterials additionalMaterials, int ID) {
        this.lectureOne = lectureOne;
        this.homework = homework;
        this.additionalMaterials = additionalMaterials;
        this.ID = ++counter;
    }

    public Lecture() {
        this.ID = ++counter;
    }

}

