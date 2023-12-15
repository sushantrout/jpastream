package com.tech.controller;

import com.tech.dto.EmployeeDTO;
import com.tech.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/employee")
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping(value = "start-with/{prefix}")
    public List<EmployeeDTO> getEmployeeByStartsWithName(@PathVariable String prefix) {
        return employeeService.getEmployeeByStartsWithName(prefix);
    }
}
