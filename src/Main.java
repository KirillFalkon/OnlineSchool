import com.education.courses.AdditionalMaterials;
import com.education.courses.Homework;
import com.education.services.LectureService;

public class Main {

    public static void main(String[] args) {

        LectureService lectureService = new LectureService();
        lectureService.createLecture("1", new Homework("1", 1), new AdditionalMaterials("1", 1), 1);
        lectureService.createLecture("1", new Homework("1", 1), new AdditionalMaterials("1", 1), 1);
        lectureService.createLecture("1", new Homework("1", 1), new AdditionalMaterials("1", 1), 1);

        LectureService lectureService1 = new LectureService();
        lectureService1.createLecture("1", new Homework("1", 1), new AdditionalMaterials("1", 1), 1);

        System.out.println(lectureService.countLecture);
    }
}