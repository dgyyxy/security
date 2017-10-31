package com.gary.security.web.controller;

import com.gary.security.web.dto.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gary on 2017/10/31.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public List<User> query(){
        List<User> users = new ArrayList<>();
        users.add(new User());
        users.add(new User());
        users.add(new User());
        return users;
    }
}
