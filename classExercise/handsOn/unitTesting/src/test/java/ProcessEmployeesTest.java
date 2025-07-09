import model.Employee;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProcessEmployeesTest {

    @Test
    void given_TwoEmployees_when_Compare_then_return_neg_zero_positive() {
        Employee emp1 = new Employee("Alice", 50000);
        Employee emp2 = new Employee("Bob", 60000);

        int result = ProcessEmployees.compare(emp1, emp2);

        assertTrue(result < 0, "Expected Alice to come before Bob");
    }

    @Test
    void givenEmployees_when_compare_then_return_sorted_employees() {
        Employee emp1 = new Employee("Alice", 50000);
        Employee emp2 = new Employee("Bob", 60000);
        Employee emp3 = new Employee("Charlie", 55000);

        List<Employee> employees = List.of(emp2,emp3,emp1);
        List<Employee> employeesAssert = List.of(emp1,emp2, emp3);
        List<Employee> sortedEmployees = LibraryCompanion.fuction.apply(employees);

        assertEquals(employeesAssert, sortedEmployees, "Employees should be sorted by name and then by salary");
    }

}