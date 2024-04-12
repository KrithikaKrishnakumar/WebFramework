package com.class3.cw3.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ColorController 
{
    @GetMapping("/favouriteColor")
    public String getMethodName(@RequestParam String param) {
        return "My favourite color is "+param+" !";
    }
    
}
