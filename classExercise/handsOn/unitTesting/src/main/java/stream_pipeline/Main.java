package stream_pipeline;

import model.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Eve");
//        names.stream()
//                .map((name) -> name.toUpperCase())
//                .forEach(System.out::println);

        List<Employee> employees = List.of(
                new Employee( "John", 50000),
                new Employee( "Jane", 60000),
                new Employee( "Jack", 55000),
                new Employee( "Jill", 70000),
                new Employee( "Joe", 65000),
                new Employee( "Laura", 55000)
        );

        List<Employee> employeeSorted = employees.stream()
                .sorted(
                        Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary)
                ).toList();
    }
}
