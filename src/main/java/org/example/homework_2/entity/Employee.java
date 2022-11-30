package org.example.homework_2.entity;

import lombok.Data;
import lombok.NonNull;

import java.math.BigDecimal;

@Data
public class Employee {

    @NonNull
    private String name;
    @NonNull
    private Integer age;
    @NonNull
    private BigDecimal salary;

}
