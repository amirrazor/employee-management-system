package com.example.employeemanagement.mapper;

import com.example.employeemanagement.dto.EmployeeDTO;
import com.example.employeemanagement.entity.Employee;

public class EmployeeMapper {
    public static EmployeeDTO toDTO(Employee employee) {
        return new EmployeeDTO(employee.getId(), employee.getName(), employee.getEmail(), employee.getPosition(), employee.getSalary(), employee.getPassword(), employee.getUsername(), employee.getRole());
    }

    public static Employee toEntity(EmployeeDTO employeeDTO) {
        return new Employee(null, employeeDTO.getName(), employeeDTO.getEmail(), employeeDTO.getPosition(), employeeDTO.getSalary(), employeeDTO.getPassword(), employeeDTO.getUsername(), employeeDTO.getRole());
    }
}
