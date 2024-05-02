package com.example.MyFirstSpringProject.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path ="/api")
public class HelloController {

    //localhost:8080/api/hello
	//Get  		: Veri görüntülemek istediğimiz zaman kullanılıyor.
	//Post 		: Veri kaydetmek istediğimiz zaman kullanıyoruz.
	//PUT  		: Veri güncellemek için kullanıyoruz
	//PATCH 	: Verinin bir bölümünü güncellemek istediğimiz zaman kullanıyoruz(örn parola güncellemek)
	//Delete 	: Veri silmek istediğimiz zaman kullanıyoruz. 

    @GetMapping(path = "/hello")
    public String sayHello(){
        return "Hello World";
    }

    @PostMapping(path = "/save")
    public String save(){
        return "Data Saved!";
    }

    @DeleteMapping(path = "/delete")
    public String delete(){
        return "Data deleted";
    }

}