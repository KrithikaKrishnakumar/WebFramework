package com.class2.cw2;

import org.springframework.stereotype.Service;

@Service
public class ApiService 
{
    public ApiClass getName(String n)
    {
        return new ApiClass(n);
    }
}
