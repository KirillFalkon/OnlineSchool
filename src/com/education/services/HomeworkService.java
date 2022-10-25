package com.education.services;

import com.education.courses.Homework;

public class HomeworkService {

    public Homework createHomework(String homework, int ID){

        return new Homework(homework,ID);
    }
}
