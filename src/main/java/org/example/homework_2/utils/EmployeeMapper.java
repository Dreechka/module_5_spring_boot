package org.example.homework_2.utils;

import org.example.homework_2.dto.EmployeeDtoRq;
import org.example.homework_2.entity.Employee;
import org.springframework.stereotype.Component;


@Component
public class EmployeeMapper {

    public Employee convertEmployeeDtoRq(EmployeeDtoRq employeeDtoRq) {
        return new Employee(employeeDtoRq.getName(), employeeDtoRq.getAge(), employeeDtoRq.getSalary());
    }
}
