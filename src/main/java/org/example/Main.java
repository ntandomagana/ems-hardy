package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        // Add an employee
        manager.AddEmployee();

        // View all employees
        manager.ViewAllEmployees();

        manager.DeleteEmployee(001);

        // View all employees again
        System.out.println("After deletion:");
        manager.ViewAllEmployees();



    }
}