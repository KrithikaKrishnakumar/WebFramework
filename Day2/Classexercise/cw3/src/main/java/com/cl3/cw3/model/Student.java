package com.cl3.cw3.model;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Component
public class Student 
{
    
    private long id;
    private String name;
    @JsonIgnore
    private String desc;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) 
    {
        this.desc = desc;
    }
    
}
    
