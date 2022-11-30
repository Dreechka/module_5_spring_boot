package org.example.homework_2.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class EmployeeDtoRq {
    private String name;
    private int age;
    private BigDecimal salary;
}
