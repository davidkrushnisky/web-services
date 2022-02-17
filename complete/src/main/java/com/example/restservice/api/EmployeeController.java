package com.example.restservice.api;

import com.example.restservice.model.Address;
import com.example.restservice.model.Employee;
import com.example.restservice.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    //GET
    @GetMapping("/employee")
    public List<Employee> getAllEmployee(){
        EmployeeService service = new EmployeeService();
        return service.getAllEmployee();
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        EmployeeService service = new EmployeeService();
        List<Employee> employees = service.getAllEmployee();
        //return employees.stream().filter(employee -> employee.getId() == id).findFirst().get();
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                return emp;
            }
        }
        return null;
    }

    //POST
    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee employee) {
        EmployeeService service = new EmployeeService();
        service.addEmployee(employee);
        return employee;
    }
}
