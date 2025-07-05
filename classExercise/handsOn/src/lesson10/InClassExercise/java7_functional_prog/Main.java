package lesson10.InClassExercise.java7_functional_prog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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

        EmployeeInfo employeeInfo = new EmployeeInfo(EmployeeInfo.SortMethod.BYNAME);
        employeeInfo.sort(employees);
        System.out.println("Sorted by name: " + employees);

        employeeInfo = new EmployeeInfo(EmployeeInfo.SortMethod.BYSALARY);
        employeeInfo.sort(employees);
        System.out.println("Sorted by salary: " + employees);
    }
}
