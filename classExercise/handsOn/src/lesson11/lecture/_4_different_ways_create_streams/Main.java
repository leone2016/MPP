package lesson11.lecture._4_different_ways_create_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //if a list is given = create a stream from it
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Stream<Integer> stream = numbers.stream();

        //If an array of integer
        Integer[] integer1 = {1,2,3,4,5,6,7,8,9};
        Stream<Integer> integerStream = Stream.of(integer1);

        //Stream of Employee objects
        Employee [] employeesArray = {
                new Employee("Alice", 50000),
                new Employee("Bob", 60000),
                new Employee("Charlie", 70000)
        };
        Stream<Employee> employeeStream = Stream.of(employeesArray);

        //Stream int is not allowd but int[] is allowed
        Stream<int[]> streamInt = Stream.of(new int[]{1,2,3});

        //IntStream and DoubleStream are special streams for primitive types, such as int and double

        int[] ints = {1,2,3,4,5,6,7,8,9};
        IntStream intStream = Arrays.stream(ints);
        IntStream intStream1 = IntStream.of(ints);
        DoubleStream streamDouble = DoubleStream.of(new double[]{1,2,3});


    }
}

class Employee{
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}