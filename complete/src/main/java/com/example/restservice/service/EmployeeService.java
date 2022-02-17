package com.example.restservice.service;

import com.example.restservice.model.Address;
import com.example.restservice.model.Employee;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    static List<Employee> employees = new ArrayList<>();

    public List<Employee> getAllEmployee(){
        Employee employee1 = new Employee(1, "Maverick", "Silick", new Address(302, "Hollow", "Montreal", "H89 7JK"));
        Employee employee2 = new Employee(2, "Fabrice", "Dongo", new Address(54, "Rohan", "New Jersey", "H80 7JK"));
        Employee employee3 = new Employee(3, "Julian", "Blank", new Address(567, "Tres", "Vancouver", "J9807JK"));

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        return employees;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }
}
