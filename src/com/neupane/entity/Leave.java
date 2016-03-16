/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neupane.entity;

/**
 *
 * @author parlad
 */
public class Leave {

    private Employee employee;
    private String leaveDate;
    private String leaveType;

    public Leave() {
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(String leaveDate) {
        this.leaveDate = leaveDate;
    }

    public String getLeaveType() {
        return leaveType;
    }

    public void setLeaveType(String leaveType) {
        this.leaveType = leaveType;
    }

    @Override
    public String toString() {
        return "Leaves{" + "employee=" + employee + ", leaveDate=" + leaveDate + ", leaveType=" + leaveType + '}';
    }

    public String toCSV() {
        return employee.getId() + ", " + leaveDate + ", " + leaveType + "\r\n";
    }

}
