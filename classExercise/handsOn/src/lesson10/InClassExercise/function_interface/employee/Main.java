package lesson10.InClassExercise.function_interface.employee;

import java.util.ArrayList;
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

        employees.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));

        System.out.println("Sorted by name using lambda: " + employees);
    }
}
