package com.education.reposetories;

import com.education.courses.Homework;
import com.education.courses.Lecture;

public class LectureRepository extends UniversityRepository{
    private int CAPACITY = 10;
    private Lecture[] lecturesArray = new Lecture[CAPACITY];

    public void addLecture(Lecture lecture) {
        for (int i = 0; i < lecturesArray.length; i++) {
            if (lecturesArray[i] == null) {
                lecturesArray[i] = lecture;
                break;
            }
            if (lecturesArray[lecturesArray.length - 1] != null) {
                magnifArray();
            }
        }
    }

    private void magnifArray() {
        int tmpCapacity = CAPACITY;
        CAPACITY = (CAPACITY * 3) / 2 + 1;
        Lecture[] tmpArrayLectures = new Lecture[CAPACITY];
        System.arraycopy(lecturesArray, 0, tmpArrayLectures, 0, tmpCapacity);
        lecturesArray = tmpArrayLectures;
    }

    public Lecture[] getLecturesArray() {
        return lecturesArray;
    }
}
