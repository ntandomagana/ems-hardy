package org.example;

public class EmployeeDetails {
    private String name;
    private int employeeNumber;
    private String position;
    private String department;
    private double salary;

    public EmployeeDetails(String name, int employeeNumber, String position, String department, double salary){
        this.name = name;
        this.employeeNumber = employeeNumber;
        this.position = position;
        this.department = department;
        this.salary = salary;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return "EmployeeDetails{" +
                "name='" + name + '\'' +
                ", employeeNumber=" + employeeNumber +
                ", position='" + position + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

}
