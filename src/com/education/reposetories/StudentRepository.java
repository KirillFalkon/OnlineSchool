package com.education.reposetories;

import com.education.courses.Student;

public class StudentRepository extends UniversityRepository{

    private int CAPACITY = 10;
    private Student[] studentsArray = new Student[CAPACITY];

    public void addStudent(Student student) {
        for (int i = 0; i < studentsArray.length; i++) {
            if (studentsArray[i] == null) {
                studentsArray[i] = student;
                break;
            }
            if (studentsArray[studentsArray.length - 1] != null) {
                magnifArray();
            }
        }
    }

    private void magnifArray() {
        int tmpCapacity = CAPACITY;
        CAPACITY = (CAPACITY * 3) / 2 + 1;
        Student[] tmpArrayStudents = new Student[CAPACITY];
        System.arraycopy(studentsArray, 0, tmpArrayStudents, 0, tmpCapacity);
        studentsArray = tmpArrayStudents;
    }

    public Student[] getStudentsArray() {
        return studentsArray;
    }
}
