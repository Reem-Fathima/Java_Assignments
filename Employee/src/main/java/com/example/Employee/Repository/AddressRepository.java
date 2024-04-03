package com.example.Employee.Repository;

import com.example.Employee.Model.Address;
import com.example.Employee.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// EmployeeRepository.java
@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
    // Additional methods if needed
}

