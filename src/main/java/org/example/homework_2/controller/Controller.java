package org.example.homework_2.controller;

import lombok.RequiredArgsConstructor;
import org.example.homework_2.dto.EmployeeDtoRq;
import org.example.homework_2.entity.Employee;
import org.example.homework_2.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class Controller {
    @Autowired
    private EmployeeService employeeService;


    @PostMapping(path = "/add_employee")
    public void createEmployee(@RequestBody EmployeeDtoRq employeeDtoRq) {
        employeeService.addEmployeeDtoRq(employeeDtoRq);
    }

    @GetMapping(path = "/get_employee/{id}")
    public Employee getEmployee(@PathVariable int id) {
        return employeeService.getEmployee(id);
    }

    @DeleteMapping(path = "/delete_employee/{id}")
    public void deleteEmployee(@PathVariable int id) {
        employeeService.removeEmployee(id);
    }

    @PatchMapping(path = "/update_employee/{id}")
    public void updateEmployee(@PathVariable int id, @RequestBody EmployeeDtoRq employeeDtoRq) {
        employeeService.updateEmployeeDtoRq(id, employeeDtoRq);
    }

}
