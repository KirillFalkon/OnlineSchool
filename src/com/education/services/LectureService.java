package com.education.services;

import com.education.courses.*;

public class LectureService {



    public Lecture createLecture(String lectureName, Homework someHomework, AdditionalMaterials additionalMaterials, int ID) {
        return new Lecture(lectureName, someHomework, additionalMaterials, ID);

    }
}
