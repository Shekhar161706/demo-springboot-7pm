package com.example.demospringboot7pm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class CalculatorApp {

    @RequestMapping("/add")
    public int add() {
        int a = 3;
        int b = 4;
        int sum = a + b;
        return sum;
    }
    @RequestMapping("/sub")
    public  int subtract(){
            int c = 5;
            int d = 4;
            int sub = c - d;
            return sub;
        }
        @RequestMapping("/multi")
    public  int multiply() {
            int a = 4;
            int b = 4;
            int multi = a * b;
            return multi;
        }
        @RequestMapping("/devide")
    public  double devide() {
            int a = 12;
            int b = 5;
            double div = a / b;
            return div;
    }

}