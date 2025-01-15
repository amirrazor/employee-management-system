package com.example.employeemanagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String position;

    private double salary;

    @Column(nullable = false, unique = true)
    private String username; // New field for login

    @Column(nullable = false)
    private String password; // Hashed password

    @Column(nullable = false)
    private String role; // e.g., ROLE_ADMIN, ROLE_MANAGER, ROLE_EMPLOYEE
}
