package com.education.courses;

public class Course {
    String name = "English";

    private Teacher teacher;

    private Student student;

    private Lecture lecture;

    public int ID;

    public static int counter = 0;
    private String teacherName;
    private String studentName;
    private String lectureName;

    public Course(String teacherName, String studentName, String lectureName) {
        this.teacherName = teacherName;
        this.studentName = studentName;
        this.lectureName = lectureName;
    }
        @Override
        public String toString() {
            return "Course{" +
                    "teacherName='" + teacherName + '\'' +
                    ", studentName='" + studentName + '\'' +
                    ", lectureName='" + lectureName + '\'' +
                    '}';
        }
    public Course(String name, Teacher teacher, Student student, Lecture lecture, int ID) {
        this.name = name;
        this.teacher = teacher;
        this.student = student;
        this.lecture = lecture;
        this.ID = ++counter;

    }
    public Course() {
        this.ID = ++counter;


    }
}
