import com.education.SupportService;
import com.education.courses.Teacher;
import com.education.reposetories.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//    AdditionalMaterialsRepository additionalMaterialsRepository = new AdditionalMaterialsRepository();
//    CourseRepository courseRepository = new CourseRepository();
//    HomeworkRepsitory homeworkRepsitory = new HomeworkRepsitory();
//    LectureRepository lectureRepository = new LectureRepository();
//    StudentRepository studentRepository = new StudentRepository();
        TeacherRepository teacherRepository = new TeacherRepository();
        teacherRepository.addTeacher(new Teacher("Name1", "secondName1", 1));
        teacherRepository.addTeacher(new Teacher("Name2", "secondName2", 2));
        teacherRepository.addTeacher(new Teacher("Name3", "secondName3", 2));
        teacherRepository.addTeacher(new Teacher("Name4", "secondName4", 2));
        teacherRepository.addTeacher(new Teacher("Name5", "secondName5", 2));
        teacherRepository.addTeacher(new Teacher("Name6", "secondName6", 2));
        teacherRepository.addTeacher(new Teacher("Name7", "secondName7", 2));
        teacherRepository.addTeacher(new Teacher("Name8", "secondName8", 2));
        teacherRepository.addTeacher(new Teacher("Name9", "secondName9", 2));
        teacherRepository.addTeacher(new Teacher("Name10", "secondName10", 2));
        teacherRepository.addTeacher(new Teacher("Name11", "secondName11", 2));
        teacherRepository.addTeacher(new Teacher("Name12", "secondName12", 2));
        System.out.println(Arrays.toString(teacherRepository.getTeachersArray()));
    }
}

