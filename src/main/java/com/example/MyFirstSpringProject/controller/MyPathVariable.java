package com.example.MyFirstSpringProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class MyPathVariable {

    String message;
    
    //yazılan url sonundaki kısmı message değişkenine atar
    //@GetMapping(path = "/message/{message}") ---> böyle yazarsak direk meesage yi anlar
    @GetMapping(path = "/message/{m}")
    public  String getMyMessage(@PathVariable("m") String message){
        return "Your messsage is : " + message;
    }

}
