package com.education.services;

import com.education.courses.*;

public class LectureService {



    public Lecture createLecture(String lectureOne, Homework someHomework, AdditionalMaterials additionalMaterials, int ID) {
        return new Lecture(lectureOne, someHomework, additionalMaterials, ID);

    }
}
