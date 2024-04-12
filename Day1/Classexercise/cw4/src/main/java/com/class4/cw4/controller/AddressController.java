package com.class4.cw4.controller;

import org.springframework.web.bind.annotation.RestController;

import com.class4.cw4.model.Address;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class AddressController 
{
    @GetMapping("/address")
    public Object gObject()
    {
        Address ad=new Address();
        ad.setDoorNo(123);
        ad.setSt("Main St");
        return ad;
    }
}
