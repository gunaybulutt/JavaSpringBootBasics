package com.example.MyFirstSpringProject.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import com.model.User;

@RestController
@RequestMapping("/api")
public class MyRequestBody {
    

    @PostMapping("/users")
    public User saveUser(@RequestBody User user){
        System.out.println("User Saved");
        user.setPassword("");
        return user;
    }

    @PostMapping("/all-users")
    public List<User> saveUAllser(@RequestBody List<User> users){
        System.out.println("All Users Saved");
        users.forEach(user -> user.setPassword(""));
        return users;
    }

}