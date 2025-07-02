package service;

import model.Employee;

import java.util.List;

public interface EmployeeService {
    void saveEmployee(Employee employee);//
    List<Employee> findAll();
}
