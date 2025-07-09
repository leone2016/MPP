import model.Employee;

import java.util.Comparator;
import java.util.function.Function;

public class ProcessEmployees {
    // Function or Comparator which is better to retorn a list of employees sorted by name and salary

    /**
     *  List<Employee> employeeSorted = employees.stream()
     *                 .sorted(
     *                         Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary)// Comparator, this is the ANSWER
     *                 ).toList();
     */
    static Comparator<Employee> employeeNameComparator = Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary);

    public static int compare(Employee emp1, Employee emp2) {
        return employeeNameComparator.compare(emp1, emp2);
    }
}
