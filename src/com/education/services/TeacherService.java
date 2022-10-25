package com.education.services;

import com.education.courses.Teacher;

public class TeacherService {

    public Teacher createTeacher(String firstName, String secondName, int ID){
        return new Teacher(firstName,secondName,ID);
    }
}
