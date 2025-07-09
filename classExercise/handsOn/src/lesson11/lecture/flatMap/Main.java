package lesson11.lecture.flatMap;

import lesson11.lecture.flatMap.model.Course;
import lesson11.lecture.flatMap.model.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("101", "Leo");
        s1.addCourse( "CS401", "MPP");
        s1.addCourse( "CS402", "JAVA");

        Student s2 = new Student("102", "Jack");
        s1.addCourse( "CS401", "MPP");
        s1.addCourse( "CS402", "JAVA");

        Student s3 = new Student("103", "Leo");
        s1.addCourse( "CS401", "MPP");
        s1.addCourse( "CS402", "JAVA");


        List<Student> students = Arrays.asList(s1, s2, s3);
        Stream<List<Course>> stream = students
                .stream()
                .map( student ->  student.getCourses());

        Stream<Course> stream2 = students
                .stream()
                .flatMap( student ->  student.getCourses().stream());

        System.out.println("List of courses: "+ stream.count());
    }
}
