package lesson10.InClassExercise.function_interface.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Bob", 60000));
        employees.add(new Employee("Charlie", 70000));
        employees.add(new Employee("Alice", 50000));


//        Collections.sort(employees, new EmployeeNameComparator());
//
//        System.out.println(employees.toString());
//
//        employees.sort(
//                new EmployeeSalaryComparator()//here the object behaves as a function
//        );
//        System.out.println(employees.toString());

//        EmployeeInfo employeeInfo = new EmployeeInfo(EmployeeInfo.SortMethod.BYNAME);
//        employeeInfo.sort(employees);
//        System.out.println("Sorted by name: " + employees);
//
//        employeeInfo = new EmployeeInfo(EmployeeInfo.SortMethod.BYSALARY);
//        employeeInfo.sort(employees);
//        System.out.println("Sorted by salary: " + employees);
//
//        employees.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
//
//        System.out.println("Sorted by name using lambda: " + employees);

        Employee bob = new Employee("Bob", 60000);
        Function<Employee, String> getName1 = (e) -> e.getName();
        Function<Employee, String> getName2 = Employee::getName;

        System.out.println(getName1.apply(bob));

        BiConsumer<Employee, String> setName= (e, name) -> e.setName(name);
        BiConsumer<Employee, String> setName2= Employee::setName;
        setName.accept(bob, "LEO");
        System.out.println(bob);
        setName.accept(bob, "CARL");
        System.out.println(bob);


        // Lambda
        BiFunction<String, String, Integer> compare1 = (s1, s2) -> s1.compareTo(s2);
        // Method reference
        BiFunction<String, String, Integer> compare2 = String::compareTo;

        System.out.println("Using compare1: " + compare1.apply("apple", "banana"));
        System.out.println("Using compare2: " + compare2.apply("apple","banana"));


        // Lambda
        BiFunction<Integer, Integer, Double> mathPow1 = (a, b) -> Math.pow(a,b);
        // Method reference
        BiFunction<Integer, Integer, Double> mathPow2 = Math::pow;

        System.out.println("Using mathPow1: " + mathPow1.apply(2, 3));
        System.out.println("Using mathPow2: " + mathPow2.apply(2, 3));

    }
}
