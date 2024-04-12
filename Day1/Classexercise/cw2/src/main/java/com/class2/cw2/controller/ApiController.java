package com.class2.cw2.controller;

import org.springframework.web.bind.annotation.RestController;

// import com.class2.cw2.ApiClass;
import com.class2.cw2.ApiService;

import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ApiController 
{
    public ApiService apiService;
    public ApiController(ApiService apiService)
    {
        this.apiService=apiService;
    }
    @GetMapping("/studentName")
    public String getMethodName(@RequestParam String param) {
        return "Welcome "+param+" !";
    }
    
    // @GetMapping("/studentName/{top}/details")
    // public ApiClass getMethodName(@PathVariable("top") String sname, @RequestParam("id") int id, 
    //  @RequestParam("lname") String name) 
    // {
    //     return apiService.getName(sname);
    // }

    
}
