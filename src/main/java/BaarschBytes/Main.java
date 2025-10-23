package BaarschBytes;

import BaarschBytes.Mongo.MongoInitializer;
import BaarschBytes.data.Course;
import BaarschBytes.data.NonCoursePrerequisite;
import BaarschBytes.GUI.CourseFrame;
import org.bson.Document;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //JSONReader reader = new JSONReader();
       // reader.readFile("course_list.json");

        CSVReader courseReader = new CSVReader();


        MongoInitializer mongoInit = new MongoInitializer();
        mongoInit.initializeDB();

        Course course = new Course();
        course.setNumber("1111");
        course.setProgram("CSCI");
        course.setName("Test CS Course");
        course.setDescription("This is just a test.");
        course.setCatalogYear(2025);
        NonCoursePrerequisite ncp = NonCoursePrerequisite.junior;
        course.setPrerequisites(List.of(ncp));


        //mongoInit.insertOneCourse(course);

        List<Course> courses = courseReader.readFile("CSCICourses2.txt");
        mongoInit.insertDefaultCourses(courses);

        CourseFrame frame = new CourseFrame(courses);
        frame.display();

    }
}