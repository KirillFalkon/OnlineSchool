package com.education.services;

import com.education.courses.EnglishCourse;
import com.education.courses.Lecture;
import com.education.courses.Student;
import com.education.courses.Teacher;

public class EnglishCourseService {

    public static int countCourse = 0;

    public void createCourse(String EnglishCoursename, Teacher teacher, Student student, Lecture lecture, int ID){

    EnglishCourse course = new EnglishCourse(EnglishCoursename, teacher, student, lecture, ID);
    countCourse++;
}
}
