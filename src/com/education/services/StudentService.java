package com.education.services;

import com.education.courses.Student;

public class StudentService {

    public static int countStudent = 0;

    public void someStudent(String firstName, String secondName, int ID){
        Student student = new Student(firstName,secondName,ID);
        countStudent++;
    }
}
