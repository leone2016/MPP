import model.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class LibraryCompanion {
    // This class is a placeholder for the library companion.
    // It can be used to provide utility methods or shared resources
    // for the library, such as configuration settings, common data structures,
    // or helper functions that can be used across different parts of the library.

    // Currently, it does not contain any methods or properties.

    public static Function<List<Employee>, List<Employee>> fuction = employees -> employees.stream()
            .sorted(
                    ProcessEmployees::compare // the same =  Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary)
            ).toList();

}
