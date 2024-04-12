package com.day1.cw1.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class OneController 
{
    @GetMapping("/welcome")
    public String getMethodName() 
    {
        return "Welcome to SpringBoot!";
    }
    
}
