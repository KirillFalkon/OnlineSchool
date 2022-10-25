package com.education.services;

import com.education.courses.Student;

public class StudentService {

    public Student createStudent(String firstName, String secondName, int ID){
        return new Student(firstName,secondName,ID);
    }
}
