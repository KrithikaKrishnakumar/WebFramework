package com.cy2.chal_yourself_2.controller;

import org.springframework.web.bind.annotation.RestController;

import com.cy2.chal_yourself_2.model.Collge;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class CollegeController
{
    @GetMapping("/college")
    public List<Collge> getMethodName() 
    {
        List<Collge>l=new ArrayList<>();
        Collge c1=new Collge();
        c1.setCname("Sri Krishna College of Engineering and TEchnology");
        c1.setDept("CSE");
        c1.setSec(2);
        l.add(c1);
        Collge c2=new Collge();
        c2.setCname("Kumaraguru");
        c2.setDept("Mechanical");
        c2.setSec(1);
        l.add(c2);
        return l;

    }
    
}
