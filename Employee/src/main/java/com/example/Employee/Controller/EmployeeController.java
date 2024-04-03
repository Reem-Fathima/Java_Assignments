package com.example.Employee.Controller;

import com.example.Employee.Model.Employee;
import com.example.Employee.Repository.EmployeeRepository;
import com.example.Employee.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// EmployeeController.java
@RestController
@RequestMapping("/employees")
public class EmployeeController {


    @Autowired
    public EmployeeService employeeService;

    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        Employee savedEmployee = employeeService.addEmployee(employee);
        return ResponseEntity.ok(savedEmployee);}
    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, @RequestBody Employee employeeDetails) {
       Employee updatedEmployee=employeeService.updateEmployee(id,employeeDetails);
       return ResponseEntity.ok(updatedEmployee);

    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable Long id){
        employeeService.deleteEmployee(id);
     return ResponseEntity.ok().body(id);
    }
    @GetMapping("/view")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        List<Employee> employees = employeeService.getAllEmployees();
        return ResponseEntity.ok(employees);
    }



}
