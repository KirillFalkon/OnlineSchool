package com.education.reposetories;

import com.education.courses.Homework;

public class HomeworkRepsitory extends UniversityRepository {

    private int CAPACITY = 10;
    private Homework[] homeworksArray = new Homework[CAPACITY];

    public void addHomework(Homework homework) {
        for (int i = 0; i < homeworksArray.length; i++) {
            if (homeworksArray[i] == null) {
                homeworksArray[i] = homework;
                break;
            }
            if (homeworksArray[homeworksArray.length - 1] != null) {
                magnifArray();
            }
        }
    }

    private void magnifArray() {
        int tmpCapacity = CAPACITY;
        CAPACITY = (CAPACITY * 3) / 2 + 1;
        Homework[] tmpArrayHomeworks = new Homework[CAPACITY];
        System.arraycopy(homeworksArray, 0, tmpArrayHomeworks, 0, tmpCapacity);
        homeworksArray = tmpArrayHomeworks;
    }

    public Homework[] getHomeworksArray() {
        return homeworksArray;
    }
}
