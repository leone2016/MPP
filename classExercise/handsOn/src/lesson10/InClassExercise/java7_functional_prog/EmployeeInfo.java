package lesson10.InClassExercise.java7_functional_prog;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeInfo {
    static enum SortMethod {
        BYNAME, BYSALARY,
    }

    private SortMethod sortMethod;

    public EmployeeInfo(SortMethod sortMethod) {
        this.sortMethod = sortMethod;
    }

    public void sort(List<Employee> employees) {
//        switch (sortMethod) {
//            case BYNAME:
//                employees.sort(new Comparator<Employee>() {
//                    @Override
//                    public int compare(Employee o1, Employee o2) {
//                        return o1.getName().compareTo(o2.getName());
//                    }
//                });
////                Collections.sort(employees, new EmployeeNameComparator());
//                break;
//            case BYSALARY:
//                employees.sort(new EmployeeSalaryComparator());
////                Collections.sort(employees, new EmployeeSalaryComparator());
//                break;
//            default:
//                throw new IllegalArgumentException("Unknown sort method: " + sortMethod);
//        }

        //use one comparator to do the same thing
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (sortMethod == SortMethod.BYNAME) {
                    return o1.getName().compareTo(o2.getName());
                } else if (sortMethod == SortMethod.BYSALARY) {
                    return Double.compare(o2.getSalary(), o1.getSalary());
                } else {
                    throw new IllegalArgumentException("Unknown sort method: " + sortMethod);
                }
            }
        });



    }
}
