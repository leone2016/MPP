package lesson11.lecture._6_optional_examples.sort_functional_programming;


import lesson11.lecture._6_optional_examples.sort_functional_programming.model.Student;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student( "John", 15, 3.5),
                new Student( "Alice", 17, 3.8),
                new Student( "Bob", 16, 3.2),
                new Student( "Diana", 15, 3.9),
                new Student( "Charlie", 18, 3.1)
        );

        // when we sort List.of is not possible because it is immutable, the code below will throw an exception
//        Collections.sort(students, (x, y)-> {
//            if (x.getAge() != y.getAge()) {
//                return Integer.compare(x.getAge(), y.getAge());
//            } else {
//                return Double.compare(y.getGpa(), x.getGpa());
//            }
//        });
        students.stream()
                .sorted(
                        Comparator.comparing(Student::getName)
                                  .thenComparing(Student::getAge, Comparator.reverseOrder())
                )
                .forEach(System.out::println);

    }
}
