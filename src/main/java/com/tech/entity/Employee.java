package com.tech.entity;

import com.tech.dto.EmployeeDTO;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tbl_employee")
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    public EmployeeDTO toDTO() {
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setId(getId());
        employeeDTO.setName(getName());
        return employeeDTO;
    }
}
