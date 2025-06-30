package lesson05.lecture.factory;

public class Employee {
    private String employeeId;
    private String name;
    private String email;
    private String phoneNumber;
    private String message;

    public Employee(String employeeId, String name, String email) {
        this.employeeId = employeeId;
        this.name = name;
        this.email = email;
    }

  /*  public Employee(String employeeId, String phoneNumber, String email) {
        this.employeeId = employeeId;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }*/

    public static Employee createEmployeeForEmail(String employeeId, String name, String email) {
        return new Employee(employeeId, name, email);
    }

    public static Employee createEmployeeForPhone(String employeeId, String phoneNumber, String email) {
        Employee employee = new Employee(employeeId, "", email);
        employee.phoneNumber = phoneNumber;
        return employee;
    }
}
