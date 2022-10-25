import com.education.courses.*;
import com.education.services.LectureService;

public class Main {

    public static void main(String[] args) {
        LectureService lectureService = new LectureService();
        Lecture lecture1 = lectureService.createLecture("1", new Homework("1", 1), new AdditionalMaterials("1", 1), 1);
        Lecture lecture2 = lectureService.createLecture("1", new Homework("1", 1), new AdditionalMaterials("1", 1), 1);
        Lecture lecture3 = lectureService.createLecture("1", new Homework("1", 1), new AdditionalMaterials("1", 1), 1);
        Lecture lecture4 = lectureService.createLecture("1", new Homework("1", 1), new AdditionalMaterials("1", 1), 1);
        Lecture lecture5 = lectureService.createLecture("1", new Homework("1", 1), new AdditionalMaterials("1", 1), 1);
        Lecture lecture6 = lectureService.createLecture("1", new Homework("1", 1), new AdditionalMaterials("1", 1), 1);

        System.out.println(Lecture.counter);

    EnglishCourse englishCourse = new EnglishCourse();
    lecture1.courseID = englishCourse.ID;
    lecture2.courseID = englishCourse.ID;
    lecture3.courseID = englishCourse.ID;
    lecture4.courseID = englishCourse.ID;
    lecture5.courseID = englishCourse.ID;
    lecture6.courseID = englishCourse.ID;
        System.out.println(lecture6.courseID);

    }
}
