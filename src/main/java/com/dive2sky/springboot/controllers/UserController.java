package com.dive2sky.springboot.controllers;

import com.dive2sky.springboot.models.User;
import com.dive2sky.springboot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("{userId}")
    public User getUser(@PathVariable Long userId) {
        User user = userRepository.findOne(userId);
        return user;
    }

}
