package com.example.cw1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cw1.model.Person;
import com.example.cw1.repository.PersonRepository;

@Service
public class PersonService 
{
    @Autowired
    private PersonRepository personRepository;

    public Person savePerson(Person person)
    {
        return personRepository.save(person);
    }

    public List<Person> getAllPerson()
    {
        return personRepository.findAll();
    }
}
