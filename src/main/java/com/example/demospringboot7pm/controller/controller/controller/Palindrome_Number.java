package com.example.demospringboot7pm.controller.controller.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Palindrome_Number {
    public static void main(String[] args) {

        int number=1221, reversenumber=0, reminder;
        int orignalnumber=number;

        while (number!=0){
            reminder=number%10;
            reversenumber=reversenumber*10+reminder;
            number/=10;
        }
        if (orignalnumber==reversenumber){
            System.out.println(orignalnumber+ "yes");
        }
        else {
            System.out.println(orignalnumber+ "no");
        }
    }}
