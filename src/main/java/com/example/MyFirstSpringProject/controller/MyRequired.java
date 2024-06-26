package com.example.MyFirstSpringProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class MyRequired {

    @GetMapping({"/message1","/message1/{message}"})
    public String getMyMessageWithVariable(@PathVariable(name = "message",required = false) String message){
        return "Your Message is : " + message; 
    }

    @GetMapping("/message2")
    public String getMyMessageWithParam(@RequestParam(name = "message",required = false,defaultValue = "My Default Message") String message){
        return "Your Message is : " + message;
    }

}