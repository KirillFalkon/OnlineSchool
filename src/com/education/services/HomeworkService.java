package com.education.services;

import com.education.courses.Homework;

public class HomeworkService {

    public static int countCourse = 0;

    public void someHomework(String homework, int ID){

        Homework homework1 = new Homework(homework,ID);
    }
}
