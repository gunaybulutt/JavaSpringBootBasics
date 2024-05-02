package com.example.MyFirstSpringProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class MyRequestParam {


    @GetMapping("/paramMessage")
    public String getMyMessage(@RequestParam String message){
        return "cikti : " + message;
    }
    
}
