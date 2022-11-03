package com.education.services;

import com.education.courses.Course;
import com.education.courses.Lecture;
import com.education.courses.Student;
import com.education.courses.Teacher;

public class CourseService {

    public Course createCourse(String Coursename, Teacher teacher, Student student, Lecture lecture, int ID){
        return new Course(Coursename, teacher, student, lecture, ID);
}
}
