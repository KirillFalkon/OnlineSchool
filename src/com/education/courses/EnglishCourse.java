package com.education.courses;

public class EnglishCourse {
    private String EnglishCoursename;
    private Teacher teacher;
    private Student student;
    private Lecture lecture;
    private int ID;

    public EnglishCourse(String EnglishCoursename, Teacher teacher, Student student, Lecture lecture,int ID) {
        this.EnglishCoursename = EnglishCoursename;
        this.teacher = teacher;
        this.student = student;
        this.lecture = lecture;
        this.ID = ID;
    }
}
