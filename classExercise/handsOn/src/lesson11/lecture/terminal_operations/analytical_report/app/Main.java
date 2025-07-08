package lesson11.lecture.terminal_operations.analytical_report.app;


import lesson11.lecture.terminal_operations.analytical_report.model.Employee;

import java.util.List;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1, 120000),
                new Employee(2, 110000),
                new Employee(3, 200000),
                new Employee(4, 80000),
                new Employee(5, 760000),
                new Employee(6, 135000)
        );

        System.out.println(
                employees.stream()
                        .map(employee -> employee.getSalary())
                        .collect(Collectors.summarizingDouble(new ToDoubleFunction<Double>() {
                            @Override
                            public double applyAsDouble(Double value) {
                                return value;
                            }
                        }))
        );

        System.out.println(
                employees.stream()
                        .map(e -> e.getSalary())
                        .collect(Collectors.summarizingDouble(Double::doubleValue))
        );
        System.out.println("---------------------------------");
        System.out.println(
                DoubleStream.of(1,2,3,4,5,6)
                        .summaryStatistics()
        );
        System.out.println("---------------------------------");
        System.out.println(
                employees.stream()
                        .map(e -> e.getSalary())
                        .mapToDouble(Double::doubleValue)
                        .summaryStatistics()
        );

        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);


        //list of names
        //report: find smallest name bases on number of letters / char
        // find largest name based on number of letters / char
        // find average (based on number of letter / char)
        // find the number of names

    }
}
