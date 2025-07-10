package PracticeExam.model;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PersonRepository {

    public static List<Person> personList(){
        Person p1 = new Person("Jhon", 165, 2000, "Male", 2, List.of("Cricket", "Swimming", "Reading", "Traveling", "Cooking"));
        Person p2 = new Person("Alice", 170, 1995, "Female", 1, List.of("Painting", "Yoga", "Hiking"));
        Person p3 = new Person("Bob", 182, 1988, "Male", 3, List.of("Coding", "Gaming", "Music"));
        Person p4 = new Person("Charlie", 158, 2003, "Male", 0, List.of("Drawing", "Writing", "Photography"));
        Person p5 = new Person("Diana", 162, 1990, "Female", 4, List.of("Gardening", "Baking", "Knitting"));
        Person p6 = new Person("Eve", 175, 2001, "Female", 1, List.of("Dancing", "Singing", "Acting"));
        Person p7 = new Person("Frank", 180, 1975, "Male", 2, List.of("Fishing", "Camping", "Woodworking"));
        Person p8 = new Person("Grace", 160, 2005, "Female", 3, List.of("Volleyball", "Basketball", "Running"));
            return Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8);
        }


    public static Person getPerson(){
        return personList().get(new Random().nextInt(8));
    }

}
