package com.education.reposetories;

import com.education.courses.Teacher;
public class TeacherRepository extends UniversityRepository {
    private int CAPACITY = 10;
    private Teacher[] teachersArray = new Teacher[CAPACITY];

    public void addTeacher(Teacher teacher) {
        for (int i = 0; i < teachersArray.length; i++) {
            if (teachersArray[i] == null) {
                teachersArray[i] = teacher;
                break;
            }
            if (teachersArray[teachersArray.length - 1] != null) {
                magnifArray();
            }
        }
    }
    private void magnifArray() {
        int tmpCapacity = CAPACITY;
        CAPACITY = (CAPACITY * 3) / 2 + 1;
        Teacher[] tmpArrayTeacher = new Teacher[CAPACITY];
        System.arraycopy(teachersArray, 0, tmpArrayTeacher, 0, tmpCapacity);
        teachersArray = tmpArrayTeacher;
    }
    public Teacher[] getTeachersArray() {
        return teachersArray;
    }
}
