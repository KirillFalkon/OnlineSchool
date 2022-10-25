package com.education.courses;

public class EnglishCourse {
    private String EnglishCoursename;
    private Teacher teacher;
    private Student student;
    private Lecture lecture;

    public int ID;
    public static int counter = 0;

    public EnglishCourse(String EnglishCoursename, Teacher teacher, Student student, Lecture lecture, int ID) {
        this.EnglishCoursename = EnglishCoursename;
        this.teacher = teacher;
        this.student = student;
        this.lecture = lecture;
        this.ID = ++counter;

    }

    public EnglishCourse() {
        this.ID = ++counter;
    }
}
