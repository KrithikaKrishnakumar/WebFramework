package com.class5.cw5.contoller;

import org.springframework.web.bind.annotation.RestController;

import com.class5.cw5.model.Student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class StudentController 
{
    @GetMapping("/student")
    public List<Student> getStudents ()
    {
        List<Student>students=new ArrayList<>();
        Student ob=new Student();
        ob.setStudentName("John");
        ob.setMessage("Welcome,John!");
        students.add(ob);
        return students;
    }
    
    
    
}
