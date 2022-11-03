import com.education.courses.*;
import com.education.services.LectureService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Course course = new Course();
        LectureService lectureService = new LectureService();
//        Lecture lecture1 = lectureService.createLecture("1", new Homework("1", 1), new AdditionalMaterials("1", 1), 1);
//        Lecture lecture2 = lectureService.createLecture("1", new Homework("1", 1), new AdditionalMaterials("1", 1), 1);
//        Lecture lecture3 = lectureService.createLecture("1", new Homework("1", 1), new AdditionalMaterials("1", 1), 1);
//        Lecture lecture4 = lectureService.createLecture("1", new Homework("1", 1), new AdditionalMaterials("1", 1), 1);
//        Lecture lecture5 = lectureService.createLecture("1", new Homework("1", 1), new AdditionalMaterials("1", 1), 1);
//        Lecture lecture6 = lectureService.createLecture("1", new Homework("1", 1), new AdditionalMaterials("1", 1), 1);

//        System.out.println(Lecture.counter);

//        lecture1.courseID = course.ID;
//        lecture2.courseID = course.ID;
//        lecture3.courseID = course.ID;
//        lecture4.courseID = course.ID;
//        lecture5.courseID = course.ID;
//        lecture6.courseID = course.ID;
//        System.out.println(lecture6.courseID);

        {
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
                    Lecture lecture1 = new Lecture(lectureName1, 1);
                    System.out.println(lecture1);
                    System.out.println("Do you want to 1.exit program or 2.to create new lecture?");
                    int question = scanner.nextInt();
                    switch (question) {
                        case 1:
                            System.out.println("Exit the program");
                            return;
                        case 2:
                            System.out.println("Enter name of another lecture = ");
                            String lectureName2 = scanner.next();
                            Lecture lecture2 = new Lecture(lectureName2, 1);
                            System.out.println(lecture2);
                            System.out.println("Total number of lectures - " + Lecture.counter);
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
}
