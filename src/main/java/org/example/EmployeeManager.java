package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeManager implements Employee {

    //use List to store multiple employee records
    private List<EmployeeDetails> employees = new ArrayList<>();


@Override
    public void ViewAllEmployees(){
//this shows all the employees
        for (EmployeeDetails employee: employees) {
            System.out.println(employee);
        }


    }

    @Override

    public void AddEmployee(){
        EmployeeDetails emp1 = new EmployeeDetails("Maboku Seimela", 001, "Junior Backend Developer", "Department of Collections", 12220.0d);

        EmployeeDetails emp2 = new EmployeeDetails("Judas Mohlala", 002, "Junior Fullstack Developer", "Department of Collections", 15500.0d);
        EmployeeDetails emp3 = new EmployeeDetails("Khetha", 003, "Junior Fullstack Developer", "Department of Collections", 15500.0d);



        employees.add(emp1);
        employees.add(emp2);



    }

    @Override
    public void EditEmployee() {

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


}
