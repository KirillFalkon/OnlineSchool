package com.education.services;

import com.education.courses.Teacher;

public class TeacherService {

    public static int countTeacher = 0;

    public void someTeacher(String firstName, String secondName, int ID){
        Teacher teacher = new Teacher(firstName,secondName,ID);
        countTeacher++;
    }
}
