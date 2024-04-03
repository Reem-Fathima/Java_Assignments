package com.example.Employee.Service;

import com.example.Employee.Exception.ResourceNotFoundException;
import com.example.Employee.Model.Employee;
import com.example.Employee.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    public Employee addEmployee(Employee employee){
        return employeeRepository.save(employee);

    }
    public  Employee updateEmployee(Long id,Employee employeeDetails){
        Employee employee=employeeRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee Not found"+id));
        employee.setName(employeeDetails.getName());
        employee.setDepartment(employeeDetails.getDepartment());
        employee.setSalary(employeeDetails.getSalary());
        return employeeRepository.save(employee);
    }
    public void deleteEmployee(Long id){
        Employee employee=employeeRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Employee Not Found"));
        employeeRepository.delete(employee);

    }
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll(Sort.by("name"));
    }
}
