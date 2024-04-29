package com.example.cw1.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.cw1.model.Person;
import com.example.cw1.service.PersonService;
import com.fasterxml.jackson.databind.ObjectMapper;



@RestController
public class PersonController 
{
    public static final Logger logger=LoggerFactory.getLogger(PersonController.class);
    public static final Logger logg=LoggerFactory.getLogger("myfilelog");
    @Autowired
    private PersonService personService;
    
      @PostMapping("/persons")
    public ResponseEntity<Object> postMethodPerson(@RequestBody Person person) 
    {
        try 
        {
            Person save = personService.savePerson(person);
            ObjectMapper p = new ObjectMapper();
            String h = p.writeValueAsString(save);
            logg.info("POST Request recieved for /persons wiht data:   "+h);
            return ResponseEntity.status(HttpStatus.CREATED).body(save);
        } catch (Exception e) 
        {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error occurred: " + e.getMessage());
        }
    }

     @GetMapping("/persons")
    public ResponseEntity<Object> getMethodEmployee() {
        try {
            List<Person> p = personService.getAllPerson();
            if (p.isEmpty()) {
                logg.debug("GET request recieved for /persons");
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No employees found.");
            } else {
                logg.debug("GET request recieved for /persons");
                return ResponseEntity.status(HttpStatus.OK).body(p);
            }
        } 
        catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error occurred: " + e.getMessage());
        }
    }
}
