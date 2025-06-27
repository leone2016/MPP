package lesson4.lecture;

import java.util.List;

public class Company {

    private List<Department> departments;

    public Company(List<Department> departments) {
        this.departments = departments;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartment(Department departments) {
        this.departments.add(departments) ;
    }

/*    public  double computeSalary(List<Employee> employee) {
        double salary = 0;
        for (Employee emp : employee) {
            salary += emp.getSalary();
        }
    }*/

    public static void main(String[] args) {

    }
}
