package org.example;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager implements Employee {
    private List<EmployeeDetails> employees = new ArrayList<>();



    public void ViewAllEmployees(){

        for (EmployeeDetails employee: employees) {
            System.out.println(employee);
        }


    }

    public void AddEmployee(){
        EmployeeDetails emp1 = new EmployeeDetails("Maboku Seimela", 001, "Junior Backend Developer", "Department of Collections", 12220.0d);

        EmployeeDetails emp2 = new EmployeeDetails("Judas Mohlala", 002, "Junior Fullstack Developer", "Department of Collections", 15500.0d);


        employees.add(emp1);
        employees.add(emp2);



    }
    public void EditEmployee() {

    }
    public void DeleteEmployee(){}


}
