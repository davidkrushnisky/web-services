package com.example.restservice.api;

import com.example.restservice.model.Address;
import com.example.restservice.model.Employee;
import com.example.restservice.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    EmployeeService employeeService = new EmployeeService();

    //GET
    @GetMapping("/employee")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("/employee/{fName}")
    public Employee getEmployeeByfName(@PathVariable int fName){
        return employeeService.getEmployeeById(fName);
    }

    //POST
    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
        return employee;
    }

    //Update
    @PutMapping("/employee/{id}")
    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employee){
        employeeService.updateEmployee(id, employee);
        return employee;
    }

    @DeleteMapping("/employee/{id}")
    public void deleteEmployee(@PathVariable int id){
        employeeService.deleteEmployee(id);
    }
}
