package org.example.homework_2.service;

import org.example.homework_2.dao.EmployeeDao;
import org.example.homework_2.dto.EmployeeDtoRq;
import org.example.homework_2.entity.Employee;
import org.example.homework_2.utils.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private EmployeeMapper employeeMapper;
    private EmployeeDao employeeDao;

    @Autowired
    public EmployeeService(EmployeeMapper employeeMapper, EmployeeDao employeeDao) {
        this.employeeMapper = employeeMapper;
        this.employeeDao = employeeDao;
    }

    public void addEmployeeDtoRq(EmployeeDtoRq employeeDtoRq){
        Employee employee = employeeMapper.convertEmployeeDtoRq(employeeDtoRq);
               employeeDao.addEmployee(employee);
    }

    public void removeEmployee(int id){
        employeeDao.removeEmployee(id);
    }

    public Employee getEmployee(int id){
        return employeeDao.getEmployee(id);
    }

    public void updateEmployeeDtoRq(int id, EmployeeDtoRq employeeDtoRq) {
        Employee employee = employeeMapper.convertEmployeeDtoRq(employeeDtoRq);
        employeeDao.updateEmployee(id, employee);
    }
}
