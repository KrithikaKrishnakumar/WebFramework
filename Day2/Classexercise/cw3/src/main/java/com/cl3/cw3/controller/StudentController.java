package com.cl3.cw3.controller;


import org.springframework.web.bind.annotation.RestController;

import com.cl3.cw3.model.Student;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class StudentController 
{
   
  
    public Student student;
    public StudentController(Student student)
    {
        this.student=student;
    }
    @GetMapping("student")
    public Object getMethodName() {
        student.setId(1L);
        student.setName("John");
        student.setDesc("This is a student description");
        return student;
    }
    

}
