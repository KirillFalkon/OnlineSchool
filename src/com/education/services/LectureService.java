package com.education.services;

import com.education.courses.AdditionalMaterials;
import com.education.courses.Lecture;
import com.education.courses.Homework;

public class LectureService {

    public static int countLecture = 0;

    public void createLecture(String lectureOne, Homework someHomework, AdditionalMaterials additionalMaterials, int ID){
        Lecture lecture = new Lecture(lectureOne,someHomework,additionalMaterials,ID);

        countLecture++;
        }
}