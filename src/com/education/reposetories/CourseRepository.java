package com.education.reposetories;

import com.education.courses.Course;

public class CourseRepository extends UniversityRepository{
    private int CAPACITY = 10;
    private Course[] coursesArray = new Course[CAPACITY];

    public void addCourses(Course course) {
        for (int i = 0; i < coursesArray.length; i++) {
            if (coursesArray[i] == null) {
                coursesArray[i] = course;
                break;
            }
            if (coursesArray[coursesArray.length - 1] != null) {
                magnifArray();
            }
        }
    }

    private void magnifArray() {
        int tmpCapacity = CAPACITY;
        CAPACITY = (CAPACITY * 3) / 2 + 1;
        Course[] tmpArrayCourses = new Course[CAPACITY];
        System.arraycopy(coursesArray, 0, tmpArrayCourses, 0, tmpCapacity);
        coursesArray = tmpArrayCourses;
    }

    public Course[] getCoursesArray() {
        return coursesArray;
    }
}
