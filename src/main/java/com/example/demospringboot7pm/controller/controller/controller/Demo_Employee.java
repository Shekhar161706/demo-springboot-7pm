package com.example.demospringboot7pm.controller.controller.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class Demo_Employee {
@RequestMapping("/employee")
    public void createmployee(){

        ArrayList< Employee> list=new ArrayList<>();

        Employee employee1=new Employee("Shekhar",145983,"Operation");
        Employee employee2=new Employee("Karan",145904,"Sales");

        list.add(employee1);
        list.add(employee2);

        for (Employee var : list){
            System.out.println("Student name :  " +var.getName() + " : Employee code : " +var.getEmployeecode() + " : Depatrment : " +var.getDepartment());
        }

    }

    public static void main(String[] args) {
        Demo_Employee obj=new Demo_Employee();

        obj.createmployee();
    }
}