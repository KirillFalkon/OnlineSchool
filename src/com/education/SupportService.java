package com.education;

import com.education.courses.Course;
import com.education.courses.Lecture;

import java.util.Scanner;


public class SupportService {

    boolean programWork = true;

    public void realisation(){
        while(programWork) {
        startProgramm();
        if (Lecture.counter == 8) {
            System.out.println("Well done!Exit the program.");
            break;
        }
    }

}
        public void startProgramm(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select your category : " + "1.Course " + "2.Teacher " +
                "3.Student " + "4.Lecture");

        int category = scanner.nextInt();
        switch (category) {
            case 1:
                System.out.println("You choose category Course.Course has teacher,student and lecture.");
                System.out.println("Enter teacher name = ");
                String teacherName = scanner.next();
                System.out.println("Enter student name = ");
                String studentName = scanner.next();
                System.out.println("Enter lecture name = ");
                String lectureName = scanner.next();
                Course course1 = new Course(teacherName, studentName, lectureName);
                System.out.println(course1);
                break;
            case 2:
                System.out.println("You choose category Teacher");
                break;
            case 3:
                System.out.println("You choose category Student");
                break;
            case 4:
                System.out.println("You choose category Lecture");
                System.out.println("Enter name of lecture = ");
                String lectureName1 = scanner.next();
                System.out.println("Enter ID = ");
                int ID1 = scanner.nextInt();
                Lecture lecture1 = new Lecture(lectureName1,ID1);
                System.out.println(lecture1);
                System.out.println("Do you want to 1.exit the program or 2.to create new lecture?");
                int question = scanner.nextInt();
                switch (question) {
                    case 1:
                        programWork = false;
                        System.out.println("Exit the program");
                        return;
                    case 2:
                        System.out.println("Enter name of another lecture = ");
                        String lectureName2 = scanner.next();
                        System.out.println("Enter ID = ");
                        int ID2 = scanner.nextInt();
                        Lecture lecture2 = new Lecture(lectureName2,ID2);
                        System.out.println(lecture2);
                        System.out.println("You already create " + Lecture.counter + " lectures.");
                        return;
                    default:
                        System.out.println("Error");
                        return;
                }
            default:
                System.out.println("Error");
        }
    }
}