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
public class Employee {

    private int id;
    private String firstName, lastName, Email, contactNum;
    private boolean status;

    public Employee() {
    }

    public Employee(int id, String firstName, String lastName, String Email, String contactNum, boolean status) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.Email = Email;
        this.contactNum = contactNum;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", Email=" + Email + ", contactNum=" + contactNum + ", status=" + status + "\r\n";
    }

    public String toCSV() {
        return id + "," + firstName + "," + lastName + "," + Email + "," + contactNum + "," + status + '}';
    }

}
