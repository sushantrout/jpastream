package com.tech.service;

import com.speedment.jpastreamer.application.JPAStreamer;
import com.tech.dto.EmployeeDTO;
import com.tech.entity.Employee;
import com.tech.entity.Employee$;
import com.tech.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class EmployeeService {
    @Autowired
    private JPAStreamer jpaStreamer;
    public List<EmployeeDTO> getEmployeeByStartsWithName(String prefix) {
        List<Employee> employees = jpaStreamer.stream(Employee.class)
                .filter(Employee$.name.startsWithIgnoreCase(prefix))
                .toList();
        return employees.stream().map(t -> t.toDTO()).toList();
    }
}
