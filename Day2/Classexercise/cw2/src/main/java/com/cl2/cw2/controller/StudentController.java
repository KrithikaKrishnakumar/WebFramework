package com.cl2.cw2.controller;

import org.springframework.web.bind.annotation.RestController;

import com.cl2.cw2.model.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;




@RestController
public class StudentController 
{
    @Autowired
    public Student student;
    @GetMapping("/student")
    public String getStudent() {
        student.setName("Krithika");
        student.setAge(20);
        return "Student Name: " + student.getName() + ", Age: " + student.getAge();
    }
    @GetMapping("/stud")
    public Object getStud() {
        student.setName("Krithika");
        student.setAge(20);
        //return "Student Name: " + student.getName() + ", Age: " + student.getAge();
        return student;
    }
    
        
    }
    
