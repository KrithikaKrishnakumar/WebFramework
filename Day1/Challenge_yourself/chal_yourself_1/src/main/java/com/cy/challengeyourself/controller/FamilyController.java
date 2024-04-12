package com.cy.challengeyourself.controller;

import org.springframework.web.bind.annotation.RestController;

import com.cy.challengeyourself.model.Family;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class FamilyController 
{
    @GetMapping("/family")
    public List<Family> getMethodName() 
    {
        List<Family>l=new ArrayList<>();
        Family family1=new Family();
        family1.setName("John");
        family1.setAge(47);
        family1.setRelation("Father");
        l.add(family1);
        Family family2=new Family();
        family2.setName("Emma");
        family2.setAge(47);
        family2.setRelation("Mother");
        l.add(family2);
        Family family3=new Family();
        family3.setName("Ginnie");
        family3.setAge(22);
        family3.setRelation("Daughter");
        l.add(family3);
        return l;
    }
    
}
