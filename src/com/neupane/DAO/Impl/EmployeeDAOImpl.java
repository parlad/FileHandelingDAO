/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neupane.DAO.Impl;

import com.neupane.DAO.EmployeeDAO;
import com.neupane.entity.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author parlad
 */
public class EmployeeDAOImpl implements EmployeeDAO {

    private List<Employee> employeeList;

    public EmployeeDAOImpl() {
        employeeList = new ArrayList<>();
    }

    public EmployeeDAOImpl(List<Employee> employeeList) {
        employeeList = new ArrayList<>();
    }

    @Override
    public void insert(Employee e) {
        employeeList.add(e);
    }

    @Override
    public List<Employee> getAll() {
        return employeeList;
    }

    @Override
    public Employee getById(int id) {
        for (Employee e : employeeList) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }
}
