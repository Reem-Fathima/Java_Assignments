package com.example.Employee.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Address")
public class Address {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long addressId;

        @ManyToOne
        @JoinColumn(name = "employeeId")
        private Employee employeeModel;

        private String address;




}
