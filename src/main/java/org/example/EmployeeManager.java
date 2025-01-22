package org.example;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class EmployeeManager implements Employee {

    //use List to store multiple employee records
    private List<EmployeeDetails> employees = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);


    @Override
    public void ViewAllEmployees(){
//this shows all the employees
        for (EmployeeDetails employee: employees) {
            System.out.println(employee);
        }

    }

    @Override
    public void AddEmployee(){
        EmployeeDetails emp1 = new EmployeeDetails(1,"Maboku Seimela", 001, "Junior Backend Developer", "Department of Collections", 12220.0d);
        EmployeeDetails emp2 = new EmployeeDetails(2,"Judas Mohlala", 002, "Junior Fullstack Developer", "Department of Collections", 15500.0d);
        EmployeeDetails emp3 = new EmployeeDetails(3,"Khetha", 003, "Junior Fullstack Developer", "Department of Collections", 15500.0d);


        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

    }

    @Override
    public void EditEmployee() {
    System.out.println("Enter an employee ID to edit: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        EmployeeDetails employee = findEmployeeById(id);
        if (employee == null) {
            System.out.println("Employee not found!");
            return;
        }

        System.out.println("Current Details: " + employee);

        System.out.print("Enter new name (leave blank to keep current): ");
        String name = scanner.nextLine();
        if (!name.isEmpty()) {
            employee.setName(name);
        }

        System.out.println("Enter new department (leave blank to keep current): ");
        String department = scanner.nextLine();
        if (!department.isEmpty()) {
            employee.setDepartment(department);
        }


        System.out.print("Enter new salary (enter 0 to keep current): ");
        double salary = scanner.nextDouble();
        if (salary != 0) {
            employee.setSalary(salary);
        }

        System.out.println("Employee details updated: " + employee);

    }
    //this identifies the user to delete using their employeenumber
    @Override
    public void DeleteEmployee(int employeeNumber){
        Iterator<EmployeeDetails> iterator = employees.iterator();

        boolean employeeFound = false;
        while (iterator.hasNext()){
            EmployeeDetails employee = iterator.next();
            if (employee.getEmployeeNumber() == employeeNumber){
                iterator.remove();

                employeeFound = true;
                System.out.println("Employee with employeeNumber " + employeeNumber + " has been deleted.");
                break;
            }
        }

        if (!employeeFound) {
            System.out.println("Employee with employeeNumber " + employeeNumber + " not found.");
        }
    }

    private EmployeeDetails findEmployeeById(int id) {
        for (EmployeeDetails employee : employees) {
            if (employee.getEmployeeId() == id) {
                return employee;
            }
        }
        return null;
    }


}
