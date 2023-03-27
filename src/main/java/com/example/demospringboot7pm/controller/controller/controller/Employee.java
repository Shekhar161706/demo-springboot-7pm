package com.example.demospringboot7pm.controller.controller.controller;

public class Employee {

    String name;
    int employeecode;

    String Department;

    public Employee(String name, int employeecode, String department) {
        this.name = name;
        this.employeecode = employeecode;
        Department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeecode() {
        return employeecode;
    }

    public void setEmployeecode(int employeecode) {
        this.employeecode = employeecode;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }
}
