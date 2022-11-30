package org.example.homework_2.dao;

import org.example.homework_2.entity.Employee;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class EmployeeDao {
    private int id;
    private Map<Integer, Employee> staff = new HashMap<>();

    public void addEmployee(Employee employee) {
        staff.put(id, employee);
        id++;
    }

    public Employee getEmployee(int id) {
        return staff.get(id);
    }

    public void removeEmployee(int id) {
        if (staff.containsKey(id)) {
            staff.remove(id);
        }
    }

    public void updateEmployee(int id, Employee employee) {
        staff.put(id, employee);
    }
}
