package com.cl1.cw1.controller;

import org.springframework.web.bind.annotation.RestController;

import com.cl1.cw1.config.AppConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class ApiContoller 
{
    @Autowired
    public AppConfig appConfig;
    @GetMapping("/ns")
    public String getDetails()
    {
        return "App-Name: "+appConfig.getAppName() +", Version: "+appConfig.getAppVersion();
    }
}

